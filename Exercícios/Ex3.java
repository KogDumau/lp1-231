
import java.util.Scanner;

public class Ex3{
    public static void main(String[] args){
        double compra, valorfinal;

        Scanner num3= new Scanner(System.in);

        System.out.println("Digite o valor de sua compra ");
        compra= num3.nextDouble();
        num3.close();

        if (compra>= 0.01 && compra <= 9.99) {
            valorfinal=compra;
            System.out.println("O valor final da compra ficou " +valorfinal);

    }
        if (compra>= 10.00 && compra <= 99.99) {
            valorfinal=compra-(0.05*compra);
            System.out.println("O valor final da compra ficou " +valorfinal);

    }
        if (compra>= 100.00 && compra <= 499.99) {
            valorfinal=compra-(0.10*compra);
            System.out.println("O valor final da compra ficou " +valorfinal);

    }
        if (compra>= 500) {
            valorfinal=compra-(0.15*compra);
            System.out.println("O valor final da compra ficou " +valorfinal);
  
    }
}
}
    
