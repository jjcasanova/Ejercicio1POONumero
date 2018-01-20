
public class principal {

	public static void main(String[] args) {
		int minumero=8;
		numero num1=new numero();
		numero num2=new numero(minumero);
		System.out.println("Num1: " + num1.getValor());
		System.out.println("Num2: " + num2.getValor());
		num1.anade(5);
		System.out.println("Ahora num1 vale " +  num1.getValor());
		num2.anade(5);
		System.out.println("Num2 vale " + num2.getValor());
		num1.resta(10);
		num2.resta(10);
		System.out.println("Después de restar 10");
		System.out.println("Num1 vale: " + num1.getValor());
		System.out.println("Num2 vale: " + num2.getValor());
		System.out.println("Función doble");
		System.out.println("Num1 vale: " + num1.getDoble());
		System.out.println("Num2 vale: " + num2.getDoble());
		System.out.println("Función triple");
		System.out.println("Num1 vale: " + num1.getTriple());
		System.out.println("Num2 vale: " + num2.getTriple());
		System.out.println("Función setNumero");
		num1.setNumero(new numero().getValor());
		num2.setNumero(new numero(minumero).getValor());
		System.out.println("Num1 vale: " + num1.getValor());
		System.out.println("Num2 vale: " + num2.getValor());		
	}

}
