import java.util.Scanner;

public class Ex2{
    public static void main(String[] args){
    double x, y, z, media;

    Scanner num2= new Scanner(System.in);

    System.out.println("Digite o primeiro número ");
    x= num2.nextDouble();
    

    System.out.println("Digite o segundo número ");
    y= num2.nextDouble();
    

    System.out.println("Digite o terceiro número");
    z= num2.nextDouble();
    num2.close();

    media= (x+y+z)/3;
    System.out.println("A média aritmética é " +media);
}
}