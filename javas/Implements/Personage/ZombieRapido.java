package javas.Implements.Personage;

import javas.Interfaces.Personage;
import javas.Interfaces.Zombie;

public class ZombieRapido implements Zombie{
	
	private int vida=60;
	private static final int dano = 30;
	private static final int costo = 100; // ver consigna
	private static final int vel = 2;
	
	public ZombieRapido(){
	}
	
	public ZombieRapido(int vi){
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

	/** 
	 * Representa la accion de cuando el zombie recibe dano de parte de una planta
	 * @pre. true.
	 * @post. Retorna el mismo Personage con menos vida en caso que la vida > 0
	 * luego de descontar el dano, de lo contrario retorna null.
	 * @return Retorna el mismo Personage o null respectivamente.
	 */
	public Personage recibeDano(int d) {
		vida -= d;
		if (vida > 0) {
			return this;
		}
		return null;
	}
	
	public String toString(){
		return "ZR";
	}
	
	public boolean equals(Personage other) {
		if (other instanceof ZombieRapido) {
			return this.getVida() == other.getVida();
		}
		return false;
	}
}