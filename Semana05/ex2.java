import java.util.Scanner;


class ex2 {
    public static void main(String[] args){
        double kg, m, imc, pesoideal;

        Scanner num6= new Scanner(System.in);

        System.out.println("\nDigite seu peso em Kg");
        kg = num6.nextDouble();

        System.out.println("Digite sua altura em metros");
        m= num6.nextDouble();
        num6.close();

        imc= kg / (m * m);
        System.out.println("Seu IMC é " +imc);

        System.out.println("De acordo com o gráfico abaixo");

        System.out.println("\n----------------------------------");
        System.out.println(" IMC            Classificação     ");
        System.out.println("----------------------------------");
        System.out.println("< 18,5           Baixo peso       ");
        System.out.println("18,5 a 24,9      Peso normal      ");
        System.out.println("25,0 a 29,9    Excesso de peso    ");
        System.out.println("30,0 a 34,9  Obesidade de Classe 1");
        System.out.println("35,0 a 39,9  Obesidade de Classe 2");
        System.out.println(">= 40,00     Obesidade de Classe 3");
        System.out.println("----------------------------------");
        

        pesoideal= imc-24.9;
        System.out.println("\nPara chegar no peso normal você deve perder em peso " +pesoideal);

    }

}