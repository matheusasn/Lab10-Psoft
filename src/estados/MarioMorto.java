package estados;

import inteface.MarioAcoes;

public class MarioMorto implements MarioAcoes {

	@Override
	public MarioAcoes catarCogumelo() {
		return null;
	}

	@Override
	public MarioAcoes catarFlor() {
		return null;
	}

	@Override
	public MarioAcoes levarDano() {
		return null;
	}

}
