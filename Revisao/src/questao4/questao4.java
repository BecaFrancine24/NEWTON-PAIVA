package questao4;
import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
	 	   System.out.println("Mostre o Lado A");
	       Scanner ladoA = new Scanner(System.in);
	       
	       System.out.println("lado B");
	       Scanner ladoB = new Scanner(System.in);

	       double valor1 = ladoA.nextFloat();
	       double valor2 = ladoB.nextFloat();
	       
	       double area =  (valor1 * valor2) / 2;

	       System.out.println("O valor da area é " + area);
	}

}
