import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        Scanner num4 = new Scanner(System.in);
        System.out.println("Insira seu número de identificação: ");
        String identificador = num4.nextLine();
        char x = identificador.charAt(2);
        char y = identificador.charAt(3);
        char z = identificador.charAt(4);
        char w = identificador.charAt(5);

        if (identificador.length() == 7 && identificador.startsWith("BR") && identificador.endsWith("X") && Character.isDigit(x) && Character.isDigit(y) && Character.isDigit(z) && Character.isDigit(w)){
            System.out.println("Valor válido");
        } else {
            System.out.println("Valor inválido");
        }
        num4.close();
    }
}