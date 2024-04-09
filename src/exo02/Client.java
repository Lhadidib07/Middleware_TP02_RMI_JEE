package exo02;

import exo02.Carnet.Carnet;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            Carnet carnet = (Carnet) Naming.lookup("rmi://localhost:1099/carnet");
            Carnet carnet01 = (Carnet) Naming.lookup("rmi://localhost:1099/carnet01");

            carnet.enregistrer("toto", new Adresse("rue de la paix", "Paris", 70 ) );
            carnet.enregistrer("tata", new Adresse("rue du ramadan", "Marseille", 13000));
            System.out.println(" lister carnet "+carnet.lister() );

            System.out.println("a la recherche de toto : "+carnet.chercher("toto") );

            carnet.effacer("toto");
            System.out.println(" lister carnet apres supression de Titi :"+carnet.lister() );

            carnet01.enregistrer("Titi", new Adresse("rue de la joie", "Lyon", 120));
            System.out.println("le carnet 01 : "+carnet01.lister());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}