package exercicios_apostila;

    import java.util.Scanner;
    public class atvd2 {
    public static void main(String[]args){
    
        System.out.printf("Digite a altura: ");
        Scanner h = new Scanner(System.in);
        float altura = h.nextFloat();
        System.out.println("     ");
    
        System.out.printf("Digite o valor de menor base: ");
        Scanner b = new Scanner(System.in);
        float basemenor = b.nextFloat();
        System.out.println("     ");
    
        System.out.printf("Digite o valor de maior: ");
        Scanner B = new Scanner(System.in);
        float basemaior = B.nextFloat();
        System.out.println("     ");
        float area = altura*(basemenor + basemaior)/2; 
    
        System.out.println("A área total é: " + area);
        System.out.println("O valor arredondado é: " +Math.round(area));
        b.close();
        B.close();
        h.close();
} 
}

