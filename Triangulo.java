package Calculadora;

public class Triangulo {
    double lado;

    Triangulo(double lado) {
        this.lado = lado;
    }

    double areaTriangulo() {
        double area = this.lado * Math.sqrt(3 / 4);
        return area;
    }

    double perimetroTriangulo() {
        return this.lado * 3;
    }

    String retornarValor(int num) {
        if (num % 2 == 0) {
            return String.format("Os lados são %.2f, a área é %.2f e o perímetro é %.2f", this.lado, this.areaTriangulo(), this.perimetroTriangulo()).toUpperCase();
        }
       else{
           return String.format("Os lados são %.2f, a área é %.2f e o perímetro é %.2f",this.lado, this.areaTriangulo(), this.perimetroTriangulo()).toLowerCase();
        }
}}
