	public class Objeto{

	String cor = "";
	double valor = 0;

	//associacao entre classes Endereco e Objeto, endereco passa a ser mais um atributo de objeto//
	Endereco ender = new Endereco();

	public Endereco getEnder(){
		return ender;
	}
	public void setEnder(Endereco ender){
		this.ender = ender;
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