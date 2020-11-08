package estados;

import inteface.MarioAcoes;

public class MarioFogo implements MarioAcoes {

	@Override
	public MarioAcoes catarCogumelo() {
		System.out.println("Mario Ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioAcoes catarFlor() {
		System.out.println("Mario Ganhou 1000 pontos");
		return this;
	}


	@Override
	public MarioAcoes levarDano() {
		System.out.println("Mario Ficou Grande");
		return new MarioGrande();
	}
	
}
