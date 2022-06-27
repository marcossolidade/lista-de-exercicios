package exercicios_apostila;
import java.util.Scanner;

public class atvd1 {
public static void main(String[]args){

    System.out.printf("Digite a altura: ");
    Scanner h = new Scanner(System.in);
    int altura = h.nextInt();
    System.out.println("     ");

    System.out.printf("Digite o valor de menor base: ");
    Scanner b = new Scanner(System.in);
    int basemenor = b.nextInt();
    System.out.println("     ");

    System.out.printf("Digite o valor de maior base: ");
    Scanner B = new Scanner(System.in);
    int basemaior = B.nextInt();
    System.out.println("     ");
    float area = altura*(basemenor + basemaior)/2; 

    System.out.println("A área total foi de: " + area);
        b.close();
        B.close();
        h.close();
}
    
}

    
