package Calculadora;

public class Cilindro {
    double raio;
    double altura;
    Cilindro(double raio, double altura){
        this.raio =raio;
        this.altura = altura;
    }
    double volumeCilindro(){
        return Math.PI * Math.pow(this.raio, 2);
    }

    double areaSuperificialCilindro(){
        double superficial = (2*Math.PI*this.raio*this.altura) + (2*Math.PI * Math.pow(this.raio, 2));
        return superficial;
    }
    String retornarValor(int num){
        if (num % 2 == 0){
            return String.format("O raio é %.2f, a altura é %.2f, \n a área superifical é %.2f e o volume é %.2f \n",this.raio, this.altura, this.areaSuperificialCilindro(), this.volumeCilindro()).toUpperCase();
        }
        else{
            return String.format("O raio é %.2f, a altura é %d, \n a área superifical é %.2f e o volume é %.2f \n",this.raio, this.altura, this.areaSuperificialCilindro(), this.volumeCilindro()).toUpperCase();
        }}
}
