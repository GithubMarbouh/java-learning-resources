package package_td2;

public class App {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("ahmed","ahmed","233445");
        System.out.println(etudiant.toString());
        Etudiant etudiant1= new Etudiant("ahmed1","ahmed1","2334451");
        System.out.println(etudiant.toString());
        Etudiant etudiant2= new Etudiant("ahmed2","ahmed2","2334452");
        System.out.println(etudiant.toString());
        filiere filiere = new filiere("GI2","2023");
        System.out.println(filiere.toString());
        filiere.addEtudiant(etudiant1);
        filiere.addEtudiant(etudiant);
        Etablissement etablissement = new Etablissement("ensa","Marrakech","2023");
        System.out.println(etablissement.toString());
        etablissement.addFiliere(filiere);
        System.out.println("\n================================");
        System.out.println("les etudiants du Gi2 sont :");
        filiere.getListEtudiant();



    }
}
