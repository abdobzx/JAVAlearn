package org.example;

public class Ville {
 private String nom;
 private int nbHab;

 public Ville(String leNom) {
     this.nom = leNom;
     this.nbHab = -1;
 }

 public Ville(String leNom, int leNbHab) {
     this.nom = leNom;
     if (leNbHab < 0) {
         System.out.println("Un nombre d'habitant doit �tre positif.");
         this.nbHab = -1;
     } else {
         this.nbHab = leNbHab;
     }
 }

 public String getNom() {
     return nom;
 }

 public int getNbHab() {
     return nbHab;
 }

 public void setNbHab(int leNbHab) {
     if (leNbHab < 0) {
         System.out.println("Un nombre d'habitant doit �tre positif. La modification n'a pas �t� prise en compte.");
     } else {
         this.nbHab = leNbHab;
     }
 }

 public String presenteToi() {
     String presente = "Ville " + nom + " nombre d'habitants ";
     if (nbHab == -1) {
         presente += "inconnu";
     } else {
         presente += "= " + nbHab;
     }
     return presente;
 }
}



