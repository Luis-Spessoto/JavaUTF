public class TstEntSai{

	public static void main(String arg[]){
		Leitura l = new Leitura();

	soma(Integer.parseInt(l.entDados("InformeY primeiro numero:" )),Integer.parseInt(l.entDados("InformeY segundo numero:" )));
	}

	public static void soma(int a, int b){
		System.out.println("\nSOMA: "+ (a+b));
	}

}