package org.dan.entity.loan;

import org.dan.entity.Client;

import java.math.BigDecimal;
import java.util.Date;

public abstract class GenericLoan {

    private Long id;

    private Date term;

    private BigDecimal amount;

    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
}
