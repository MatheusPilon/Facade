package Facade;

class ComboFacade {
	private Combo combo;

	public ComboFacade(){
		this.combo = new Combo();
	}
	
	public void escolhe(int a) {
		if (a == 1) {
			combo.setLanche("X-Burguer");
			combo.setBebida("Coca-Cola");
			combo.setBatata("Média");
			combo.setPreco(35.90);
		}	
		
		if (a == 2) {
			combo.setLanche("X-Tudo");
			combo.setBebida("Tubaína");
			combo.setBatata("Grande");
			combo.setPreco(39.90);
		}
		
		if (a == 3) {
			combo.setLanche("X-Frango");
			combo.setBebida("Suco de Laranja");
			combo.setBatata("Pequena");
			combo.setPreco(29.90);
		}
			
		System.out.println("\nLanche: " + combo.getLanche());
		System.out.println("Tamanho da Batata:" + combo.getBatata());
		System.out.println("Bebida: " + combo.getBebida());
		System.out.println("Preço: " + combo.getPreco());
	}
}