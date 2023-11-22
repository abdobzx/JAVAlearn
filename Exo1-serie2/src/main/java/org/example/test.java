package org.example;

public class test {
    public static void main(String[] args) {
        Ville lyon = new Ville("Lyon", 1500000);
        Ville bobigny = new Ville("Bobigny");
        Ville paris = new Capitale("Paris", "France", 10000000);
        Capitale ouagadougou = new Capitale("Ouagadougou", "Burkina-Faso");

        System.out.println(lyon.presenteToi());
        System.out.println(bobigny.presenteToi());
        System.out.println(paris.presenteToi());
        System.out.println(ouagadougou.presenteToi());
    }
}