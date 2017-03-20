package org.dan.controller;

import org.dan.model.loan.LoanApplicationForm;
import org.dan.model.loan.LoanApplicationResult;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = LoanController.BASE_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class LoanController {

    public static final String BASE_URL = "loan";

    @RequestMapping(value = "/apply", method = RequestMethod.POST)
    public LoanApplicationResult applyForLoan(@RequestBody final LoanApplicationForm loanApplicationForm) {
        System.out.println("Received loan application.");
        System.out.println(loanApplicationForm.toString());
        return new LoanApplicationResult();
    }

}
