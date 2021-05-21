package org.iesfm.repaso.bank;

import java.util.Objects;

public class Client {
    private int id;
    private String nif;
    private String name;
    private String surname;

    public Client(int id, String nif, String name, String surname) {
        this.id = id;
        this.nif = nif;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return getId() == client.getId() && Objects.equals(getNif(), client.getNif()) && Objects.equals(getName(), client.getName()) && Objects.equals(getSurname(), client.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNif(), getName(), getSurname());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("id=").append(id);
        sb.append(", nif='").append(nif).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
