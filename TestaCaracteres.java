
public class TestaCaracteres {
	
	public static void main(String[]args) {
		char letra = 'a';//aspas simples ao usar char, char apenas um caractere
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		/*
		 * valor = valor + 1; erro pois um int não cabe dentro de um char
		System.out.println(valor);
		*/
		
		valor = (char)(valor + 1);
		System.out.println(valor);		
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
		
		String parcela1 = "10";
		String parcela2 = "20";

		System.out.println(parcela1 + parcela2);
		
	}

}
