package Calculadora;

public class Piramide {
    double aresta_base;
    double apotema;

    double area_base;

    double altura;

    Piramide(double aresta_base, double apotema, double area_base, double altura){
        this.aresta_base = aresta_base;
        this.apotema = apotema;
        this.area_base = area_base;
        this.altura = altura;
    }
    double  volumePiramide(){
        return (this.area_base * this.altura)/3;

    }

    double superficialPiramide(){
        double superficial = (2*this.aresta_base * this.altura)/3;
        return superficial;
    }
    String retornarValor(int num){
        if (num % 2 == 0){
            return String.format("A aresta da base é %.2f,\n A apotema é %.2f, \n A área da Base é %.2f, \n A altura é %.2f, a área superficial é %.2f,\n e o volume é %.2f",this.aresta_base, this.apotema, this.area_base, this.altura, this.superficialPiramide(), this.volumePiramide()).toUpperCase();
        }
        else{
            return String.format("A aresta da base é %.2f,\n  A apotema é %.2f,\n A área da Base é %.2f,\n A altura é %.2f, \n a área superficial é %.2f,\n e o volume é 2.%f",this.aresta_base, this.apotema, this.area_base, this.altura, this.superficialPiramide(), this.volumePiramide()).toLowerCase();
        }
    }
}
