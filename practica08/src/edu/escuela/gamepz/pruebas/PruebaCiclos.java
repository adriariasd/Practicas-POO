package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.*;
public class PruebaCiclos {
    public static void main(String[] args) {
        Personaje per01 = new Personaje("Diego");
	    Personaje per02 = new Personaje("Almendra");
	    Personaje per03 = new Personaje("Bianca");
	    Personaje per04 = new Personaje("Jordan");
        int n=0;
        int m=0;
        while (n>=m){
            n=(int)(Math.random()*100);
            m=(int)(Math.random()*100);
        }
        System.out.println("n = "+n);
        System.out.println("m = "+m);

        outfor:
        for (int i=n;i<m;i++) {
            int vid = (int)(Math.random()*250);
            if (per01.setVida(vid)) {
                System.out.println(per01.getDetalle()+"se modifico la edad");
            }else{
                System.out.println(per01.getDetalle()+"sin modificacion en edad a "+vid);
            }

            vid = (int)(Math.random()*250);
            if (per02.setVida(vid)) {
                System.out.println(per02.getDetalle()+"se modifico la edad");
            }else{
                System.out.println(per02.getDetalle()+"sin modificacion en edad a "+vid);
            }

            vid = (int)(Math.random()*250);
            if (per03.setVida(vid)) {
                System.out.println(per03.getDetalle()+"se modifico la edad");
            }else{
                System.out.println(per03.getDetalle()+"sin modificacion en edad a "+vid);
            }

            do {
                vid = (int)(Math.random()*200);
                System.out.println(vid);
                if(vid>150){
                    System.out.println("***El numero generado es mayor a 150***");
                    System.out.println("-----------");
                    continue outfor;
                }
           } while (!per04.setVida(vid));

            System.out.println(per04.getDetalle());
            System.out.println("-----------");
        }
    }
}