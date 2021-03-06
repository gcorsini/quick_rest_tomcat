package hello_world_soap12_http;

import javax.annotation.Generated;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.3.2-SNAPSHOT-ba95fa0178063986f7ae2579fda808f1dd7c740e
 * 2019-03-20T09:43:03.722+01:00
 * Generated source version: 3.3.2-SNAPSHOT
 *
 */
@WebServiceClient(name = "SOAPService",
                  wsdlLocation = "file:wsdl_first_soap12/src/main/resources/wsdl/hello_world_soap12.wsdl",
                  targetNamespace = "http://apache.org/hello_world_soap12_http")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-03-20T09:43:03.722+01:00", comments = "Apache CXF 3.3.2-SNAPSHOT-ba95fa0178063986f7ae2579fda808f1dd7c740e")
public class SOAPService extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-03-20T09:43:03.722+01:00")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-03-20T09:43:03.722+01:00")
    public final static QName SERVICE = new QName("http://apache.org/hello_world_soap12_http", "SOAPService");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-03-20T09:43:03.722+01:00")
    public final static QName SoapPort = new QName("http://apache.org/hello_world_soap12_http", "SoapPort");
    static {
        URL url = null;
        try {
            url = new URL("file:./wsdl_first_soap12/src/main/resources/wsdl/hello_world_soap12.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SOAPService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:./wsdl_first_soap12/src/main/resources/wsdl/hello_world_soap12.wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-03-20T09:43:03.722+01:00")
    public SOAPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-03-20T09:43:03.722+01:00")
    public SOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-03-20T09:43:03.722+01:00")
    public SOAPService() {
        super(WSDL_LOCATION, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-03-20T09:43:03.722+01:00")
    public SOAPService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-03-20T09:43:03.722+01:00")
    public SOAPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-03-20T09:43:03.722+01:00")
    public SOAPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Greeter
     */
    @WebEndpoint(name = "SoapPort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-03-20T09:43:03.722+01:00")
    public Greeter getSoapPort() {
        return super.getPort(SoapPort, Greeter.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Greeter
     */
    @WebEndpoint(name = "SoapPort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-03-20T09:43:03.722+01:00")
    public Greeter getSoapPort(WebServiceFeature... features) {
        return super.getPort(SoapPort, Greeter.class, features);
    }

}
