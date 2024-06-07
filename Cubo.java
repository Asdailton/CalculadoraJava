package Calculadora;

public class Cubo {
    double lado;
    Cubo(double lado){
        this.lado = lado;
    }

    double volumeCubo(){
        return Math.pow(this.lado, 3);
    }

    double areaSuperficialCubo(){
        double superfical = Math.pow(this.lado, 2) * 6;
        return superfical;
    }

    String retornarValor(int num){
        if (num % 2 == 0){
            return String.format("Os lados são  %.2f, \n a  área Superficial  é %.2f e \n o volume é %.2f",this.lado,this.areaSuperficialCubo(), this.volumeCubo()).toUpperCase();
        }
        else{
            return String.format("Os lados são  %.2f, \n  a  área Superficial  é %.2f e \n o volume é %.2f",this.lado,this.areaSuperficialCubo(), this.volumeCubo()).toLowerCase();
        }
    }
}
