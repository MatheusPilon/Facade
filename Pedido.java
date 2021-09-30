package Facade;

public class Pedido {
	public static void main(String [] args) {
		ComboFacade facade = new ComboFacade();
		facade.escolhe(1);
		facade.escolhe(3);
		facade.escolhe(2);
	}

}