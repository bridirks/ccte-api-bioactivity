package gov.epa.ccte.api.bioactivity.web.rest.error;

import java.util.List;

public class AssaySearchNotFoundException extends RuntimeException{

    List<String> errorMsgs;
    public AssaySearchNotFoundException(List<String> errorMsgs) {
        this.errorMsgs = errorMsgs;
 
    }

    List<String> getErrorMsgs(){
        return errorMsgs;
    }

}
