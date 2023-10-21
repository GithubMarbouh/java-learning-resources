package org.example.td_2;

import java.util.ArrayList;

public class Etablissement {
    private String name;
    private String address;
    private String phone;
    private ArrayList listfiliere = new ArrayList<>();
    public Etablissement(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Etablissement{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    public void addFiliere(filiere filiere) {
        listfiliere.add(filiere);

    }
}

