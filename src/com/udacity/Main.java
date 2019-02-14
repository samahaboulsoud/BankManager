package com.udacity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        CertificateOfDeposit certificateOfDeposit = new CertificateOfDeposit();


        checkingAccount.setAccount("001-sa-475868");
        checkingAccount.setBalance(30047.500);
        checkingAccount.setLimit(8989755);

        savingsAccount.setAccount("4658-de-53637");
        savingsAccount.setBalance(6088.87);
        savingsAccount.setTransfers(87);

        certificateOfDeposit.setAccount("46478-th-4757858");
        certificateOfDeposit.setBalance(883.575);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            certificateOfDeposit.setExpiry(dateFormat.parse("26/04/2020"));
        }catch (ParseException e)
        {
            e.printStackTrace();
        }

        String checkingBankAccount = checkingAccount.getAccount();
        double checkingBankBalance = checkingAccount.getBalance();
        double checkingLimit = checkingAccount.getLimit();

        String savingsBankAccount = savingsAccount.getAccount();
        double savingsBankBalance = savingsAccount.getBalance();
        int savingsTransfers = savingsAccount.getTransfers();

        String certificateBankAccount = certificateOfDeposit.getAccount();
        double certificateBankBalance = certificateOfDeposit.getBalance();
        Date certificateExpiry = certificateOfDeposit.getExpiry();

        System.out.println(checkingBankAccount);
        System.out.println(checkingBankBalance);
        System.out.println(checkingLimit);
        System.out.println("------------------------------");
        System.out.println(savingsBankAccount);
        System.out.println(savingsBankBalance);
        System.out.println(savingsTransfers);
        System.out.println("------------------------------");
        System.out.println(certificateBankAccount);
        System.out.println(certificateBankBalance);
        System.out.println(dateFormat.format(certificateExpiry));
        System.out.println("------------------------------");

    }
}
