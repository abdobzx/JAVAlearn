package net.abderrahman;

import com.sun.source.doctree.SystemPropertyTree;

public class Voiture {

    private String marque ;
    private Double prix;

    public Voiture (){
        this.marque="";
        this.prix=0.0;

    }
    public String getMarque () {
        return marque;
    }
    public Double getPrix () {
        return prix;
    }
    public void setMarque (String marque) {
        this.marque=marque;

    }
    public void setPrix (Double prix) {
        this.prix=prix;
    }
    public void afficher () {
        System.out.println("marque :"+marque);
        System.out.println("prix :"+prix);

    }
}