package Calculadora;

public class Cone {
    double raio;
    double altura;

    Cone( double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }
    double volumeCone(){
        double volume = 1/3 * Math.PI * Math.pow(this.raio, 2) * this.altura;
        return volume;
    }
    double areaSuperficialCone(){
        double  raiz_quadrada = Math.pow(this.altura,2) + Math.pow(this.raio, 2);
        double  superficial = Math.PI * this.raio * Math.sqrt(raiz_quadrada);
        return superficial;
    }
    String retornarValor(int num){
        if (num % 2 == 0){
            return String.format("O raio é %.2f,\n a altura é %.2f, \n a área superifical é %.2f e \n o volume é %.2f",this.raio, this.altura, this.areaSuperficialCone(), this.volumeCone()).toUpperCase();
        }
        else{
            return String.format("O raio é %.2f,\n a altura é %.2f,\n a área superifical é %.2f e \n o volume é %.2f",this.raio, this.altura, this.areaSuperficialCone(), this.volumeCone()).toLowerCase();
        }}
}
