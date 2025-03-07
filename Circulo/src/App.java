import java.util.Scanner;

public class App {

    public static void exibeDadosCirculo(Circulo circulo) {
        System.out.println("Raio: " + circulo.getRaio());
        System.out.printf("Ponto Central: (%.2f, %.2f)\n", circulo.getEixoX(), circulo.getEixoY());
        System.out.println("Area: " + circulo.getArea());
        System.out.println("Comprimento Circunferencia: " + circulo.getComprimentoCircunferencia());
    }
    
    public static void alteraDadosCirculo(Circulo circulo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("De o Raio: ");
        circulo.setRaio(scanner.nextDouble());
        System.out.println("De o Eixo X: ");
        circulo.setEixoX(scanner.nextDouble());
        System.out.println("De o Eixo Y: ");
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