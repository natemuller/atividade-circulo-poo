import java.util.Scanner;

public class App {

    public static void exibeDadosCirculo(Circulo circulo) {
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Eixo X: " + circulo.getEixoX());
        System.out.println("Eixo Y: " + circulo.getEixoY());
        System.out.println("Area: " + circulo.getArea());
        System.out.println("Comprimento Circunferencia: " + circulo.getComprimentoCircunferencia());
    }
    
    public static void alteraDadosCirculo(Circulo circulo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Novo Raio: ");
        circulo.setRaio(scanner.nextDouble());
        System.out.println("Novo Eixo X: ");
        circulo.setEixoX(scanner.nextDouble());
        System.out.println("Novo Eixo Y: ");
        circulo.setEixoY(scanner.nextDouble());
        scanner.close();
    }

    public static void main(String[] args) throws Exception {
    
        Circulo circulo = new Circulo (0, 0, 0, 0, 0);

        alteraDadosCirculo(circulo);
        exibeDadosCirculo(circulo);

    }
}