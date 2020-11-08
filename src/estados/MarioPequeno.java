package estados;

import inteface.MarioAcoes;

public class MarioPequeno implements MarioAcoes {

	@Override
	public MarioAcoes catarCogumelo() {
		System.out.println("Mario Pegou cogumelo e ficou Grande");
		return new MarioGrande();
	}

	@Override
	public MarioAcoes catarFlor() {
		System.out.println("Mario Ficou grande e possue bola de Fogo");
		return null;
	}

	@Override
	public MarioAcoes levarDano() {
		System.out.println("Game Over - Mario Morreu");
		return new MarioMorto();
	}

}
