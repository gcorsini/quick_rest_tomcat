package org.jfclere.JaxRSExample;


import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.util.descriptor.web.ApplicationParameter;
import org.apache.catalina.Context;
import org.apache.catalina.Wrapper;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext; 

import org.apache.cxf.transport.servlet.CXFServlet;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class HelloJaxRs
{
    public static void main( String[] args ) throws Exception
    {
        Tomcat tomcat = new Tomcat();
        tomcat.getHost().setAppBase(".");
        Context context = tomcat.addContext( "/", "" );

        context.addApplicationListener(ContextLoaderListener.class.getName());
        ApplicationParameter applicationParameter = new ApplicationParameter();
        applicationParameter.setName( "contextConfigLocation" );
        applicationParameter.setValue( "classpath:beans.xml" );
        context.addApplicationParameter(applicationParameter);

        ApplicationParameter applicationParamete2 = new ApplicationParameter();
        applicationParamete2.setName( "contextClass" );
        applicationParamete2.setValue( AnnotationConfigWebApplicationContext.class.getName());
        context.addApplicationParameter(applicationParamete2);

        Wrapper servlet = context.createWrapper();
        servlet.setName( "CXFServlet" );
        servlet.setServletClass(org.apache.cxf.transport.servlet.CXFServlet.class.getName());
        servlet.setLoadOnStartup( 1 );
        context.addChild( servlet );
        context.addServletMapping( "/*", "CXFServlet" );

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream in = classLoader.getResourceAsStream("beans.xml");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder out = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            out.append(line);
        }
        System.out.println(out.toString());   //Prints the string content read from input stream
        reader.close();

        tomcat.start();
        tomcat.getServer().await();
    }
}
