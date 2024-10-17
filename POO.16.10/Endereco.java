public class Endereco{

	String rua = "";
	int num = 0;

	//associao entre classes Endereco e Regiao
	Regiao reg = new Regiao();

	public Regiao getReg(){
		return reg;
	}
	public void setReg(Regiao reg){
		this.reg = reg;
	}



	public String getRua(){
		return rua;
	}	
	public int getNum(){
		return num;
	}	
	public void setRua(String rua){
		this.rua = rua;
	}	
	public void setNum(int num){
		this.num = num;
	}	
		
}
