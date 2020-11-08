package estados;

import inteface.MarioAcoes;

public class MarioGrande implements MarioAcoes {

	@Override
	public MarioAcoes catarCogumelo() {
		System.out.println("Mario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioAcoes catarFlor() {
		System.out.println("Mario com Fogo");
		return new MarioFogo();
	}

	@Override
	public MarioAcoes levarDano() {
		System.out.println("Mario Fivou Pequeno");
		return new MarioPequeno();
	}

}
