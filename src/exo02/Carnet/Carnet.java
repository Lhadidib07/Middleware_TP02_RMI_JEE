package exo02.Carnet;

import exo02.Adresse;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;

public interface Carnet extends Remote {
    void enregistrer(String nom, Adresse adresse) throws RemoteException;

    void effacer(String nom) throws RemoteException;

    Adresse chercher(String nom) throws RemoteException;

    HashMap<String, Adresse> lister() throws RemoteException;

}
