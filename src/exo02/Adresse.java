package exo02;

import java.io.Serializable;

public class Adresse implements Serializable {
    private String nomRue;
    private int numero;
    private String ville;

    // Constructor
    public Adresse(String nomRue, String ville, int numero) {
        this.nomRue = nomRue;
        this.numero = numero;
        this.ville = ville;
    }
    //getters and setters
    public String getNomRue() {
        return nomRue;
    }
    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    //toString
  @Override
public String toString() {
    return  "nomRue='" + nomRue + "'," + "numero=" + numero + "," + "ville='" + ville + "'" ;
}
}
