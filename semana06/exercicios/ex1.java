package semana06.exercicios;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);

        System.out.println("Digite o comprimento, a altura e a largura do aquário, em cm ");
        double comprimento = x.nextDouble();
        double altura = x.nextDouble();
        double largura = x.nextDouble();

        System.out.println("\nDigite a temperatura desejada da água e a temperatura ambiente ");
        double temperaturaDesejada = x.nextDouble();
        double temperaturaAmbiente = x.nextDouble();

        double volume = calcularVolume(comprimento, altura, largura);

        System.out.printf("\nO volume do aquário é de %.1f L", volume);
        System.out.printf("\nA potência necessária do termostato é de %.1f W", calcularPotencia(volume, temperaturaDesejada, temperaturaAmbiente));
        System.out.printf("\nA quantidade de filtragem deve ser, no mínimo, %.1f L a %.1f L por hora\n", calcularFiltragem(volume) [0], calcularFiltragem(volume) [1]);

        x.close();
    }

    public static double calcularVolume(double comprimento, double altura, double largura) {
        return (comprimento * altura * largura) / 1000;
    }

    public static double calcularPotencia(double volume, double temperaturaDesejada, double temperaturaAmbiente) {
        return volume * 0.05 * Math.abs(temperaturaDesejada - temperaturaAmbiente);
    }

    public static double [] calcularFiltragem(double volume) {
        double [] filtragem = {volume * 2, volume * 3};
        return filtragem;
    }
}