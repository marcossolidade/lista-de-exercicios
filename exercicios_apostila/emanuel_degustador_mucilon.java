import java.util.Scanner;
import javax.swing.*;
public class emanuel_degustador_mucilon {

    public static void main (String[] args){
        Integer idade;
        Scanner scan = new Scanner(System.in);


                System.out.printf("Digite a idade: ");
                idade = scan.nextInt();
                        if((idade >=0) && (idade<2)){
                String bb  = "Que  isso mó bebê";
                JOptionPane.showMessageDialog( null, bb);
            }

            if((idade >=3) && (idade<11)){
                String crianca  = "Criança ainda, padre gosta";
                JOptionPane.showMessageDialog( null, crianca);
            }

            if((idade >=12) && (idade<19)){
                String chato  = "Adolescente, ou seja chato pra porra";
                JOptionPane.showMessageDialog( null, chato);
            }

            if((idade >=20) && (idade<30)){
                String jovem  = "Jovem, tá safe lek";
                JOptionPane.showMessageDialog( null, jovem);
            }

            if((idade >=31) && (idade<60)){
                String pv  = "Adulto, pré velho, piadas ruins";
                JOptionPane.showMessageDialog( null, pv);
            }

            if((idade >=61) && (idade<100)){
                String velho  = "Velho, chachaça e truco";
                JOptionPane.showMessageDialog( null, velho);
            }

            if(idade >101){
                String alex  = "ALEX E WALLBERT, AQUI ANTES DO  UNIVERSO";
                JOptionPane.showMessageDialog( null, alex);
            }
            
        }
}
