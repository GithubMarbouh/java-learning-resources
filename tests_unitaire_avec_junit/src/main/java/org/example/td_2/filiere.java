package org.example.td_2;

import java.util.ArrayList;

public class filiere {
    private  String name;
    private String date_accriditation;
    private ArrayList<Etudiant> listEtudiant = new ArrayList<>();

    public filiere(String name, String date_accriditation) {
        this.name = name;
        this.date_accriditation = date_accriditation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_accriditation() {
        return date_accriditation;
    }

    public void setDate_accriditation(String date_accriditation) {
        this.date_accriditation = date_accriditation;
    }

    @Override
    public String toString() {
        return "filiere{" +
                "name='" + name + '\'' +
                ", date_accriditation='" + date_accriditation + '\'' +
                '}';
    }
    public void addEtudiant(Etudiant etudiant) {
        listEtudiant.add(etudiant);
    }
    public void getListEtudiant( ){
        for(Etudiant etudiant : listEtudiant){
            System.out.println( etudiant.getFirstName()+ "  " + etudiant.getLastName());
        }

    }
}

