package Calculadora;

public class Esfera {
    double raio;

    Esfera(double raio){
        this.raio = raio;
    }
    double volumeEsfera(){
        return 4/3 * Math.pow(this.raio, 3);
    }

    double areaSuperficial(){
        return (4*Math.PI) * Math.pow(this.raio, 2);
    }
    String retornarValor(int num){
        if (num % 2 == 0){
            return String.format("O raio é %.2f,\n  o volume da esfera é %.2f \n e a área superficial é %.2f",this.raio, this.volumeEsfera(), this.areaSuperficial()).toUpperCase();
        }
        else{
            return String.format("O raio é %.2f,\n o volume da esfera é %.2f \n e a área superficial é %.2f",this.raio, this.volumeEsfera(), this.areaSuperficial()).toLowerCase();
        }
    }
}
