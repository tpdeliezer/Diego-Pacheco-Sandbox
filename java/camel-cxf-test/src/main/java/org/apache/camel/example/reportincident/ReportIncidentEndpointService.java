
/*
 * 
 */

package org.apache.camel.example.reportincident;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2
 * Thu Feb 11 18:28:50 BRST 2010
 * Generated source version: 2.2
 * 
 */


@WebServiceClient(name = "ReportIncidentEndpointService", 
                  wsdlLocation = "file:/C:/Users/Diego%20Pacheco/workspace/camel-cxf-test/src/main/resources/wsdl/report_incident.wsdl",
                  targetNamespace = "http://reportincident.example.camel.apache.org") 
public class ReportIncidentEndpointService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://reportincident.example.camel.apache.org", "ReportIncidentEndpointService");
    public final static QName ReportIncidentService = new QName("http://reportincident.example.camel.apache.org", "ReportIncidentService");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Diego%20Pacheco/workspace/camel-cxf-test/src/main/resources/wsdl/report_incident.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/C:/Users/Diego%20Pacheco/workspace/camel-cxf-test/src/main/resources/wsdl/report_incident.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public ReportIncidentEndpointService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ReportIncidentEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReportIncidentEndpointService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns ReportIncidentEndpoint
     */
    @WebEndpoint(name = "ReportIncidentService")
    public ReportIncidentEndpoint getReportIncidentService() {
        return super.getPort(ReportIncidentService, ReportIncidentEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReportIncidentEndpoint
     */
    @WebEndpoint(name = "ReportIncidentService")
    public ReportIncidentEndpoint getReportIncidentService(WebServiceFeature... features) {
        return super.getPort(ReportIncidentService, ReportIncidentEndpoint.class, features);
    }

}
