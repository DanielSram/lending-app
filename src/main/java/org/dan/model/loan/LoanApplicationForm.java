package org.dan.model.loan;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Component
public class LoanApplicationForm {

    private Date term;

    private BigDecimal amount;

    private String clientFirstName;

    private String clientLastName;

    private String clientPhone;

    private Date clientBirthDate;

    private String IPAddress;

    @Override
    public String toString() {
        return "LoanApplicationForm{" +
                "term=" + term +
                ", amount=" + amount +
                ", clientFirstName='" + clientFirstName + '\'' +
                ", clientLastName='" + clientLastName + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", clientBirthDate=" + clientBirthDate +
                '}';
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public Date getTerm() {
        return term;
    }

    public void setTerm(Date term) {
        this.term = term;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public Date getClientBirthDate() {
        return clientBirthDate;
    }

    public void setClientBirthDate(Date clientBirthDate) {
        this.clientBirthDate = clientBirthDate;
    }
}
