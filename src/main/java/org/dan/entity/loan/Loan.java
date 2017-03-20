package org.dan.entity.loan;

public class Loan extends GenericLoan {

    private boolean isActive;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
