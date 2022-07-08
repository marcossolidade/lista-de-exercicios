import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        Double libra = 454.0;
        Double kg = 1000.0;
        Double kgR;
        Double lbR;
        Integer gramas;

        System.out.println("Digite a quantidade de Gramas: ");
        gramas = input.nextInt();
        kgR = gramas / kg;
        lbR = gramas / libra;

        System.out.println("O valor de gramas em libras é de: " + lbR);
        System.out.println("O valor de gramas em quilos é de: " + kgR);
        

}
}