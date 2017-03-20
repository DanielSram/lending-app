package org.dan.service;

import org.dan.model.loan.LoanApplicationForm;
import org.dan.model.loan.LoanApplicationResult;
import org.dan.model.loan.LoanPostponementForm;

/**
 * Interface for managing Loans.
 */
public interface LoanService {

    /**
     * Checks if loan isn't too risky
     * if not, also creates a Loan
     *
     * @param loanApplicationForm data of new Loan
     * @return LoanApplicationResult containing creation result
     */
    public LoanApplicationResult applyForLoan(LoanApplicationForm loanApplicationForm);

    /**
     * Postpones an existing Loan,
     * throws error if Loan not found
     *
     * @param loanPostponementForm data of Loan postponement
     * @throws RuntimeException if Loan not found
     */
    public void postponeLoan(LoanPostponementForm loanPostponementForm)
            throws RuntimeException;

}
