package Facade;

class Combo {
	
	private String Lanche;
	private String Batata;
	private String Bebida;
	private double Preco;
	
	public void setLanche(String Lanche) {
		this.Lanche = Lanche;
	}
	public void setBatata(String Batata) {
		this.Batata = Batata;
	}
	public void setBebida(String Bebida) {
		this.Bebida = Bebida;
	}
	public void setPreco(double Preco) {
		this.Preco = Preco;
	}
	public String getLanche() {
		return Lanche;
	}
	public String getBatata() {
		return Batata;
	}
	public String getBebida() {
		return Bebida;
	}
	public double getPreco() {
		return Preco;
	}
}