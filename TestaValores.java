
public class TestaValores {
	
	public static void main(String[] args) {		
		int primeiro = 5;
        int segundo = 7;
        System.out.println(segundo);
        
        int primeiro1 = 5;
        int segundo1 = 7;
        segundo1 = primeiro1;
        System.out.println(segundo1);
        
        int primeiro2 = 5;
        int segundo2 = 7;
        segundo2 = primeiro2;
        primeiro2 = 10;

        // quanto vale o segundo2? ----> 5, pois ele salvou o valor de 5 em segundo2 antes do valor 10 ser atribuido

        System.out.println(segundo2);
		
	}

}
