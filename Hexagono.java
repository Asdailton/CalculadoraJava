package Calculadora;

public class Hexagono {
    double lado;
    Hexagono(double lado){
        this.lado = lado;
    }
    double areaHexagono(){
        double area = (6*this.lado) * Math.sqrt(3/4);
        return area;
    }

    double perimetroHexagono(){
        return this.lado * 6;
    }
    String retornarValor(int num){
        if (num % 2 == 0){
            return String.format("O lado é %.2f \n e a área é %.2f e \n o perímetro é %.2f",this.lado, this.areaHexagono(), this.perimetroHexagono()).toUpperCase();
        }
        else{
            return String.format("O lado é %.2f \n e a área é %.2f e \n o perímetro é %.2f",this.lado, this.areaHexagono(), this.perimetroHexagono()).toLowerCase();
        }
    }
}
