# Demo project for CXF tomcat transport showcase

#### In order to show that the tomcat as a transport is working, following tests were taken from cxf implementation: 

- Code based jaxws test
- Code based rest rest test
- WSDL based soap test

### How to:
- update dependencies in pom to the latest snapshot version of cxf transports module
- mvn clean install
- Test that jetty transport works fine: uncomment jetty transport dependency in pom.xml 
and run server/client examples in three modules
- Test that transport transport works fine: uncomment tomcat transport dependency in pom.xml
and run server/client examples in all modules

If tomcat_transport branch hasn't been merged into the main cxf branch, you will have to pull that branch and run:
````
mvn clean install -DskipTests -Dcheckstyle.skip -Dpmd.skip=true
````

## Do not leave both dependencies uncommented
