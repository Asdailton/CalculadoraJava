package Calculadora;

public class Paralelepipedo {
    double largura;
    double comprimento;
    double altura;
    Paralelepipedo(double largura, double comprimento, double altura){
        this.largura = largura;
        this.comprimento = comprimento;
        this.altura = altura;
    }

    double volumeParalelepipedo(){
        return this.comprimento * this.altura * this.largura;
    }

    double areaSuperificalParalelepipedo(){
        double superificial = 2*((this.comprimento *this.altura) + (this.altura * this.largura) + (this.comprimento * this.largura ));
        return superificial;
    }

    String retornarValor(int num){
        if (num % 2 == 0){
            return String.format("O largura é %.2f, \n o comprimento é %.2f, \n a altura é %.2f, \n a área superificial é %.2f e o volume é %.2f ",this.largura, this.comprimento, this.altura, this.areaSuperificalParalelepipedo(), this.volumeParalelepipedo()).toUpperCase();
        }
        else{
            return String.format("O largura é %.2f,\n  o comprimento é %.2f,\n  a altura é %.2f, \n a área superificial é %.2f e o volume é %.2f ",this.largura, this.comprimento, this.altura, this.areaSuperificalParalelepipedo(), this.volumeParalelepipedo()).toLowerCase();
        }
    }
}
