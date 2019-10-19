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
 * 2019-10-20T02:45:57.052+05:30
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "PaymentProcessorImplService", 
                  wsdlLocation = "file:/D:/Praveen/workspaces/webserviceworkspace/praveenoruganti-webservice-master/praveenoruganti-apachecxf-jaxws-top-down-master/src/main/resources/com/praveen/apachecxf/soap/service/paymentProcessor.wsdl",
                  targetNamespace = "http://service.soap.apachecxf.praveen.com/") 
public class PaymentProcessorImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.soap.apachecxf.praveen.com/", "PaymentProcessorImplService");
    public final static QName PaymentProcessorImplPort = new QName("http://service.soap.apachecxf.praveen.com/", "PaymentProcessorImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/Praveen/workspaces/webserviceworkspace/praveenoruganti-webservice-master/praveenoruganti-apachecxf-jaxws-top-down-master/src/main/resources/com/praveen/apachecxf/soap/service/paymentProcessor.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PaymentProcessorImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/Praveen/workspaces/webserviceworkspace/praveenoruganti-webservice-master/praveenoruganti-apachecxf-jaxws-top-down-master/src/main/resources/com/praveen/apachecxf/soap/service/paymentProcessor.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PaymentProcessorImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PaymentProcessorImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PaymentProcessorImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PaymentProcessorImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PaymentProcessorImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PaymentProcessorImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns PaymentProcessor
     */
    @WebEndpoint(name = "PaymentProcessorImplPort")
    public PaymentProcessor getPaymentProcessorImplPort() {
        return super.getPort(PaymentProcessorImplPort, PaymentProcessor.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PaymentProcessor
     */
    @WebEndpoint(name = "PaymentProcessorImplPort")
    public PaymentProcessor getPaymentProcessorImplPort(WebServiceFeature... features) {
        return super.getPort(PaymentProcessorImplPort, PaymentProcessor.class, features);
    }

}