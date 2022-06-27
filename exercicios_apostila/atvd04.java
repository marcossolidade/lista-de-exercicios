package exercicios_apostila;

public class atvd04{

    public static void main(String[] args) {
       Integer soma=0;
       Long mult=(long) 1;

       for(int i=1;i<30;i++){
           if((i%2)==1){
               soma += i;
           }else{
               mult *= i;
           }
       }
       System.out.print("O valor da soma é de:"+soma+"\n");
       System.out.print("O valor da multiplicação é de: "+mult+"\n");
    }
}

