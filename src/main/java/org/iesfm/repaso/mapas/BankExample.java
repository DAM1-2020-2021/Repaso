package org.iesfm.repaso.mapas;

import org.iesfm.repaso.bank.Account;
import org.iesfm.repaso.bank.Client;
import org.iesfm.repaso.bank.exceptions.AccountNotFoundException;
import org.iesfm.repaso.bank.exceptions.ClientNotFoundException;
import org.iesfm.repaso.bank.exceptions.NifNotFoundException;

import java.util.Map;

public class BankExample {
    private Map<String, Account> accounts;

    private Map<Integer, Client> clients;

    public BankExample(Map<String, Account> accounts, Map<Integer, Client> clients) {
        this.accounts = accounts;
        this.clients = clients;
    }

    public double getBalance(String iban) throws AccountNotFoundException {
        if (!accounts.containsKey(iban)) {
            throw new AccountNotFoundException(iban);
        }

        return accounts.get(iban).getBalance();
    }

    public Client getClient(int id) throws ClientNotFoundException {
        if (!clients.containsKey(id)) {
            throw new ClientNotFoundException(id);
        }

        return clients.get(id);
    }

    public boolean hasClient(String nif) {
        boolean found = false;
        for (Client client : clients.values()) {
            if (client.getNif().equals(nif)) {
                found = true;
            }
        }
        return found;
    }

    public Client getClient(String nif) throws NifNotFoundException {
        Client found = null;

        for (Client client : clients.values()) {
            if (client.getNif().equals(nif)) {
                found = client;
            }
        }

        if (found == null) {
            throw new NifNotFoundException();
        }

        return found;
    }

    // Dado un iban, un id de cliente y un balance crea una nueva cuenta en el banco


    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

    public Map<Integer, Client> getClients() {
        return clients;
    }

    public void setClients(Map<Integer, Client> clients) {
        this.clients = clients;
    }
}
