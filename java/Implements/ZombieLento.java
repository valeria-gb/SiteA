package java.Implements;

import java.Interfaces.Zombie;

public class ZombieLento implements Zombie{
	
	private int vida=100;
	private static final int dano = 30;
	private static final int costo = 20;
	private static final int vel = 1;
	
	public ZombieLento(int vi){
		vida = vi;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int e) {
		vida = e;
	}

	public int getCosto() {
		return costo;
	}

	public int getDano() {
		return dano;
	}

	public int getVel() {
		return vel;
	}

	public void reciveDano(int d) {
		vida -= d;
	}
	
	public String toString(){
		return "ZR";
	}
}