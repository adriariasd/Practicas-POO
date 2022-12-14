package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.*;
public class Zombie extends Personaje implements Muerto{
    boolean ataque;
    public Zombie(String nombre, int vida, boolean ataque){
        super(nombre, vida);
        this.ataque=ataque;
    }
    public Zombie(String nombre, boolean ataque){
        this(nombre, 3, ataque);
    }
    public Zombie(String nombre){
        this(nombre, 3, false);
    }
    public void decVida(){
		if (ataque==false) {
            decVida(vida-3);
        } else {
            setVida(vida-2);
        }
	}
	public void decVida(int dec){
		if (ataque==false) {
            setVida(vida-(dec*3));
        } else {
            setVida(vida-(dec*2));
        }
	}
    public void addVida(){
		if (ataque==false) {
        } else {
            setVida(vida+3);
        }
	}
	public void addVida(int add){
		if (ataque==false) {
        } else {
            setVida(vida+(add*3));
        }
	}
    public String toString(){
        return super.toString()+" "+ataque;
    }
    public boolean getAtaque(){
        return ataque;
    }
    public void comer(){
        System.out.println("Come cerebros");
    }
}
