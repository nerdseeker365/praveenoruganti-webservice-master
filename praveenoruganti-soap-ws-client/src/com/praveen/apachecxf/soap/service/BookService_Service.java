package com.praveen.apachecxf.soap.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2019-10-20T03:18:58.103+05:30
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "BookService", 
                  wsdlLocation = "file:/D:/Praveen/workspaces/webserviceworkspace/praveenoruganti-webservice-master/praveenoruganti-apachecxf-jaxws-top-down-master/src/main/resources/com/praveen/apachecxf/soap/service/BookService.wsdl",
                  targetNamespace = "http://service.soap.apachecxf.praveen.com/") 
public class BookService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.soap.apachecxf.praveen.com/", "BookService");
    public final static QName BookServiceImplPort = new QName("http://service.soap.apachecxf.praveen.com/", "BookServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/Praveen/workspaces/webserviceworkspace/praveenoruganti-webservice-master/praveenoruganti-apachecxf-jaxws-top-down-master/src/main/resources/com/praveen/apachecxf/soap/service/BookService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BookService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/Praveen/workspaces/webserviceworkspace/praveenoruganti-webservice-master/praveenoruganti-apachecxf-jaxws-top-down-master/src/main/resources/com/praveen/apachecxf/soap/service/BookService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BookService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BookService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BookService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BookService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BookService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookServiceImplPort")
    public BookService getBookServiceImplPort() {
        return super.getPort(BookServiceImplPort, BookService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookServiceImplPort")
    public BookService getBookServiceImplPort(WebServiceFeature... features) {
        return super.getPort(BookServiceImplPort, BookService.class, features);
    }

}
