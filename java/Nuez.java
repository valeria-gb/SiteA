package java;

public class Nuez extends Plantas{
	
	private final int dano = 0;
	private final int costo = 15;
	private final int vida = 200;
	
	public int getVida(){
		return vida;
	}
	
	public void setVida(int e){
		vida = e;
	}
	
	public int getCosto(){
		return costo;
	}
	
	public int getDano(){
		return dano;
	}
	
	public void reciveDano(int d){
		vida = vida - d;
	}
}