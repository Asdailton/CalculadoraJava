package Calculadora;

public class Quadrado {
    double lado;

    Quadrado(double lado){
        this.lado = lado;
    }

    double areaQuadrado(){
        return this.lado * this.lado;
    }

    double perimetroQuadrado(){
        return (this.lado * 4);
    }

    String retornarValor(int num){
        if (num % 2 == 0){
            return String.format("O lado é %.2f \n e a área é %.2f \n e o perímetro é %.2f",this.lado, this.areaQuadrado(), this.perimetroQuadrado()).toUpperCase();
        }
        else{
            return String.format("O lado é %.2f e \n a área é %.2f \n e o perímetro é %.2f",this.lado, this.areaQuadrado(), this.perimetroQuadrado()).toLowerCase();
        }
    }
}
