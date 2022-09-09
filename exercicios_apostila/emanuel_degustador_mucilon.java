import java.util.Scanner;
import javax.swing.*;
public class  teste_idade {

    public static void main (String[] args){
        Integer idade;
        Scanner scan = new Scanner(System.in);


                System.out.printf("Digite a idade: ");
                idade = scan.nextInt();
                        if((idade >=0) && (idade<2)){
                String bb = "Bebê";
                JOptionPane.showMessageDialog( null, bb);
            }

            if((idade >=3) && (idade<11)){
                String crianca  = "Criança";
                JOptionPane.showMessageDialog( null, crianca);
            }

            if((idade >=12) && (idade<19)){
                String adolescente  = "Adolescente";
                JOptionPane.showMessageDialog( null, adolescente);
            }

            if((idade >=20) && (idade<30)){
                String jovem  = "Jovem";
                JOptionPane.showMessageDialog( null, jovem);
            }

            if((idade >=31) && (idade<60)){
                String adulto  = "Adulto";
                JOptionPane.showMessageDialog( null, adulto);
            }

            if((idade >=61) && (idade<100)){
                String idoso  = "Idoso";
                JOptionPane.showMessageDialog( null, idoso);
            }
            
        }
}
