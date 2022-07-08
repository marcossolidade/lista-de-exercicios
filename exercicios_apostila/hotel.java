import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
    Scanner  input = new Scanner(System.in);
    double resul,phora,hora;

    phora = 10.25;
    System.out.println("Digite as horas trabalhadas: ");
    hora = input.nextDouble();
    resul = hora * phora;
    System.out.println("Seu Salário de acordo com as horas :R$"+resul);
    
    
    }
}