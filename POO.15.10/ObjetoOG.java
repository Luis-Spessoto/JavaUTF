public class ObjetoOG{

	String cor = "";
	double valor = 0;
	
	public static void main(String arg[]){

		Objeto caneta = new Objeto();
		Objeto giz = new Objeto();


		caneta.setCor("Azul");
		caneta.setValor(5.99);
		giz.setCor("Vermelho");
		giz.setValor(3.99);

		System.out.println("\nCor da caneta: "+ caneta.getCor());
		System.out.println("\nValor da caneta: "+ caneta.getValor());
		System.out.println("\nCor do giz: "+ giz.getCor());
		System.out.println("\nValor do giz: "+ giz.getValor());
	}

	public double getValor(){
		return valor;
	}	
	public String getCor(){
		return cor;	
	}	
	public void setValor(double valor){
		this.valor = valor;
	}	
	public void setCor(String cor){
		this.cor = cor;
	}	

}