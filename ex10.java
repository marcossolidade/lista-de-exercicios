import java.util.Scanner;
import javax.swing.*;
public class ex10 {
    public static void main (String[] args){
        float peso;
        float altura;
        float imc;
        Scanner scan = new Scanner(System.in);


                System.out.printf("Digite seu peso: ");
                peso = scan.nextFloat();
                System.out.printf("Digite seu altura: ");
                altura = scan.nextFloat();
                imc= peso/(altura*altura);
                if(imc <18.5);
                JOptionPane.showMessageDialog( null, "Seu IMC é de:"+imc+"Peso abaixo do normal ");
                if((imc >=18.5)&&(imc<=24.4 ));
                JOptionPane.showMessageDialog( null, "Seu IMC é de:"+imc+"e sua situação é peso ideal ");
                if((imc >=24.5)&&(imc<=29.9 ));
                JOptionPane.showMessageDialog( null, "Seu IMC é de:"+imc+"e sua situação é pré obesidade ");
                if((imc >=30)&&(imc<=34.9 ));
                JOptionPane.showMessageDialog( null, "Seu IMC é de:"+imc+"e sua situação é obesidade classe I ");
                if((imc >=35)&&(imc<=39.9 ));
                JOptionPane.showMessageDialog( null, "Seu IMC é de:"+imc+"e sua situação é obesidade severa ");
                if(imc >39.9);
                JOptionPane.showMessageDialog( null, "Seu IMC é de:"+imc+"e sua situação é peso ideal ");

    }
}


