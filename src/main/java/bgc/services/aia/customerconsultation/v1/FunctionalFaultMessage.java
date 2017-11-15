
package bgc.services.aia.customerconsultation.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-11-14T16:26:17.693+01:00
 * Generated source version: 3.1.8
 */

@WebFault(name = "FunctionalError", targetNamespace = "urn:v1.functionalerror.vss.objects.bgc")
public class FunctionalFaultMessage extends Exception {

    public bgc.objects.vss.functionalerror.v1.FunctionalErrorType functionalError;

    public FunctionalFaultMessage() {
        super();
    }

    public FunctionalFaultMessage(String message) {
        super(message);
    }

    public FunctionalFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public FunctionalFaultMessage(String message, bgc.objects.vss.functionalerror.v1.FunctionalErrorType functionalError) {
        super(message);
        this.functionalError = functionalError;
    }

    public FunctionalFaultMessage(String message, bgc.objects.vss.functionalerror.v1.FunctionalErrorType functionalError, Throwable cause) {
        super(message, cause);
        this.functionalError = functionalError;
    }

    public bgc.objects.vss.functionalerror.v1.FunctionalErrorType getFaultInfo() {
        return this.functionalError;
    }
}
