public class TstObj{

	public static void main(String arg[]){

		Objeto caneta = new Objeto();
		Objeto giz = new Objeto();

		caneta.setCor("Azul");
		caneta.setValor(5.99);
		caneta.getEnder().setRua("Das Flores"); //getEnder recupera classe ender e o set define o dado a ser passado dentro do que exite dentro de ender = reflections
		caneta.getEnder().setNum(115);

		giz.setCor("Vermelho");
		giz.setValor(3.99);

	
		System.out.println("\nCor da caneta: "+ caneta.getCor());
		System.out.println("\nValor da caneta: "+ caneta.getValor());

		System.out.println("\nCor do giz: "+ giz.getCor());
		System.out.println("\nValor do giz: "+ giz.getValor());


		System.out.println("\nRua da UTF: "+ ender.getEnder().getNum()); //reflexividade tbm
		System.out.println("\nNumero da UTF: "+ ender.getEnder().getNum());


	}
	

}
