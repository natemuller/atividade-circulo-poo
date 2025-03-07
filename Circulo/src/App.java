import java.util.Scanner;

public class App {

    public static void exibeDadosCirculo(Circulo circulo) {
        System.out.printf("Raio: %.2fcm\n", circulo.getRaio());
        System.out.printf("Ponto Central: (%.2f, %.2f)\n", circulo.getEixoX(), circulo.getEixoY());
        System.out.printf("Area: %.2fcm²\n", circulo.getArea());
        System.out.printf("Comprimento Circunferencia: %.2fcm\n", circulo.getComprimentoCircunferencia());
    }
    
    public static void alteraDadosCirculo(Circulo circulo) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("De o Raio: \n");
        circulo.setRaio(scanner.nextDouble());
        System.out.printf("De o Eixo X: \n");
        circulo.setEixoX(scanner.nextDouble());
        System.out.printf("De o Eixo Y: \n");
        circulo.setEixoY(scanner.nextDouble());
        scanner.close();
    }

    public static void main(String[] args) throws Exception {
    
        Circulo circulo = new Circulo (0, 0, 0, 0, 0);

        exibeDadosCirculo(circulo);
        System.out.printf("\n");

        alteraDadosCirculo(circulo);
        exibeDadosCirculo(circulo);

    }
}