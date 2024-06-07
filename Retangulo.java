package Calculadora;

public class Retangulo {
    double base;
    double altura;

    Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    double areaRetangulo(){
        return this.base * this.altura;
    }

    double perimetroRetangulo(){
        return 2 * this.base + 2*this.altura;
    }

    String retornarValor(int num){
        if (num % 2 == 0){
            return String.format("A base é %.2f \n, os lados são  %.2f \n,  a  área  é %.2f e o perímetro é %.2f",this.base,this.altura, this.areaRetangulo(), this.perimetroRetangulo()).toUpperCase();
        }
        else{
            return String.format("A base é %.2f, os lados são  %.2f,  a  área  é %.2f e o perímetro é %.2f",this.base,this.altura, this.areaRetangulo(), this.perimetroRetangulo()).toUpperCase();
        }
    }
}
