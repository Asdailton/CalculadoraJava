package Calculadora;

public class Circulo {
    double raio;

    Circulo(double raio){
        this.raio = raio;
    }
    double areaCirculo(){
        double area = Math.PI * this.raio * this.raio;
        return area;
    }

    double perimetroCriculo(){
        double perimetro = 2 * Math.PI * this.raio;
        return perimetro;
    }
    String retornarValor(int num){
        if (num % 2 == 0){
            return String.format("O raio é %.2f, \n a área é %.2f e \n o perimetro é %.2f ",this.raio, this.areaCirculo(), this.perimetroCriculo()).toUpperCase();
        }
        else{
            return String.format("O raio é %.2f, \n a área é %.2f e \n o perimetro é %.2f ",this.raio, this.areaCirculo(), this.perimetroCriculo()).toLowerCase();
        }
    }

}
