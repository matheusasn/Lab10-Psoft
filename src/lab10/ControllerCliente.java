package lab10;

public class ControllerCliente {
	
	public class ClienteController {

		public void main(String[] args) {
			Mario mario = new Mario();
		    try {
		    	 mario.catarCogumelo();
		    	 mario.levarDano();
				 mario.catarFlor();
				 mario.catarFlor();
				 mario.levarDano();
				 mario.levarDano();
				 mario.levarDano();
				 mario.levarDano();
				 mario.levarDano();
		    } catch(Exception e) {
					System.out.println();
					System.out.println("Game Over");
					System.out.println("Sua Pontuação foi - " );
		    }
		}
	}
}
