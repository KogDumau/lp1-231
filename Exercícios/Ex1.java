
import java.util.Scanner;

 class Ex1 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Digite um número inteiro qualquer");
        int x = num.nextInt ();
        num.close();
        System.out.println("O número digitado é " + x);
        System.out.println("O antecessor desse número é " +( x-1 ));
        System.out.println("O sucessor desse número é " +( x+1 ));
    }
}