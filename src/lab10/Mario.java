package lab10;

import estados.MarioPequeno;
import inteface.MarioAcoes;

public class Mario {
	
	private MarioAcoes modo;
	
	public Mario() {
		modo = new MarioPequeno();	
	}
	
	public void catarCogumelo() {
		modo = modo.catarCogumelo();
	}
	
	public void catarFlor() {
		modo = modo.catarFlor();
	}
	
	public void levarDano() {
		modo = modo.levarDano();
	}	
}
