import java.util.Scanner;

 class ex1{
    public static void main(String[] args){
        double comprimento, altura, largura, volume, ptermo,tempambiente, tempdesejada, qf;

        Scanner num5= new Scanner(System.in);

        System.out.println("Digite o comprimento do aquário em centímetros");
        comprimento = num5.nextDouble();
        

        System.out.println("Digite a altura do aquário em centímetros");
        altura = num5.nextDouble();
        

        System.out.println("Digite a largura do aquário em centímetros");
        largura = num5.nextDouble();

        volume= (comprimento * altura * largura) / 1000;
        System.out.println("O volume do aquário em litros é " +volume );

        System.out.println("\nDigite a temperatura ambiente");
        tempambiente = num5.nextDouble();

        System.out.println("Digite a temperatura desejada");
        tempdesejada = num5.nextDouble();
        num5.close();
        

        ptermo = volume * 0.05 * (tempdesejada-tempambiente);
        System.out.println("\nA potência do termoestato será de " +ptermo);

        qf = volume * 3;
        System.out.println("\nA quantidade de litros filtrados por hora deve ser " +qf);
        
    }
}