import java.util.Scanner;

import javax.swing.JOptionPane;

public class ex8 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
    double resul,phora,hora;
    String aviso = "Atenção, dirija-se à direção do Hotel!";

    phora = 10.25;
    System.out.println("Digite as horas trabalhadas: ");
    hora = input.nextDouble();
    resul = hora * phora;
    System.out.println("Seu Salário de acordo com as horas :R$"+resul);

    if (resul < 50.00) {

        JOptionPane.showMessageDialog(null,aviso);  }

}

}