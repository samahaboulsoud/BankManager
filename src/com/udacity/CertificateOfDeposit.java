package com.udacity;

import java.util.Date;

public class CertificateOfDeposit extends BankAccount {
    Date expiry = new Date();

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }
}
