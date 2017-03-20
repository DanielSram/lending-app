package org.dan.model.loan;

import java.util.Date;

public class LoanPostponementForm {

    private Date date;

    private Long loanID;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getLoanID() {
        return loanID;
    }

    public void setLoanID(Long loanID) {
        this.loanID = loanID;
    }
}
