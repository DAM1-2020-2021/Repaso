package org.iesfm.repaso.bank;

import java.util.Objects;

public class Account {
    private String iban;
    private int clientId;
    private double balance;

    public Account(String iban, int clientId, double balance) {
        this.iban = iban;
        this.clientId = clientId;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return getClientId() == account.getClientId() && Double.compare(account.getBalance(), getBalance()) == 0 && Objects.equals(getIban(), account.getIban());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIban(), getClientId(), getBalance());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("iban='").append(iban).append('\'');
        sb.append(", clientId=").append(clientId);
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
}
