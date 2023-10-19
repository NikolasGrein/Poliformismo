package InterfaceComputador;

public class Principal {
	
	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		Home home = new Home();
		
		gamer.ligar();
		gamer.reiniciar();
		gamer.desligar();
		gamer.carregarSistema();
		
		home.ligar();
		home.reiniciar();
		home.desligar();
		home.carregarSistema();
	}

}