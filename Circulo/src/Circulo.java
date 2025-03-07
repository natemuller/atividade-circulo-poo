public class Circulo {

    double eixoX;
    double eixoY;
    double raio;
    double area;
    double comprimentoCircunferencia;

    public Circulo(double eixoX, double eixoY, double raio, double area, double comprimentoCircunferencia) {

        if (eixoX < 0 || eixoY < 0 || raio < 0) 
            System.out.println("Valores negativos sao invalidos.");

        this.eixoX = eixoX;
        this.eixoY = eixoY;
        this.raio = raio;
        this.area = area;
        this.comprimentoCircunferencia = comprimentoCircunferencia;
    }

    public double getEixoX() {
        return eixoX;
    }

    public double getEixoY() {
        return eixoY;
    }

    public double getRaio() {
        return raio;
    }

    public double getArea() {
        return area;
    }

    public double getComprimentoCircunferencia() {
        return comprimentoCircunferencia;
    }

    public void setEixoX(double novoEixoX) {
        this.eixoX = novoEixoX;
    }

    public void setEixoY(double novoEixoY) {
        this.eixoY = novoEixoY;
    }

    public void setRaio (double novoRaio) {
        this.raio = novoRaio;
        this.area = Math.PI * Math.pow(raio, 2);
        this.comprimentoCircunferencia = 2 * Math.PI * raio;
    }

}
