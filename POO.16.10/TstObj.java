public class TstObj{

	public static void main(String arg[]){

		Objeto caneta = new Objeto();

		caneta.setCor("Azul");
		caneta.setValor(5.99);
		caneta.getEnder().setRua("Das Flores"); //getEnder recupera classe ender e o set define o dado a ser passado dentro do que exite dentro de ender = reflections
		caneta.getEnder().setNum(115);
		caneta.getEnder().getReg().setNomeReg("Centro");	
		caneta.getEnder().getReg().setCodReg(2);		


		System.out.println("\nCor da caneta: "+ caneta.getCor());
		System.out.println("\nValor da caneta: "+ caneta.getValor());


		System.out.println("\nRua para comprar caneta: "+ caneta.getEnder().getRua()); //reflexividade tbm
		System.out.println("\nNumero da rua da caneta: "+ caneta.getEnder().getNum());
	

		System.out.println("\nRegiao do endereco: "+ caneta.getEnder().getReg().getNomeReg());
		System.out.println("\nCodigo da regiao do endereco: "+ caneta.getEnder().getReg().getCodReg());

	}
	

}
