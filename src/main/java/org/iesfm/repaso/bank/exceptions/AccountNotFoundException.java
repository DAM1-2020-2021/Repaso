package org.iesfm.repaso.bank.exceptions;

public class AccountNotFoundException extends Exception{
    private final String iban;

    public AccountNotFoundException(String iban) {
        this.iban = iban;
    }

    public AccountNotFoundException(String message, String iban) {
        super(message);
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }
}
