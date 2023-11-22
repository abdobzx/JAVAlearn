package org.example;


public class Capitale extends Ville {
private String pays;

public Capitale(String leNom, String lePays) {
   super(leNom);
   this.pays = lePays;
}

public Capitale(String leNom, String lePays, int leNbHab) {
   super(leNom, leNbHab);
   this.pays = lePays;
}

public String getPays() {
   return pays;
}

public void setPays(String lePays) {
   this.pays = lePays;
}

@Override
public String presenteToi() {
   String villeInfo = super.presenteToi();
   return villeInfo + " Capitale de " + pays;
}
}
