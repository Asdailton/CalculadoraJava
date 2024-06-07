package Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                System.out.println("\n" +
                        "░█████╗░░█████╗░██╗░░░░░░█████╗░██╗░░░██╗██╗░░░░░░█████╗░██████╗░░█████╗░██████╗░░█████╗░\n" +
                        "██╔══██╗██╔══██╗██║░░░░░██╔══██╗██║░░░██║██║░░░░░██╔══██╗██╔══██╗██╔══██╗██╔══██╗██╔══██╗\n" +
                        "██║░░╚═╝███████║██║░░░░░██║░░╚═╝██║░░░██║██║░░░░░███████║██║░░██║██║░░██║██████╔╝███████║\n" +
                        "██║░░██╗██╔══██║██║░░░░░██║░░██╗██║░░░██║██║░░░░░██╔══██║██║░░██║██║░░██║██╔══██╗██╔══██║\n" +
                        "╚█████╔╝██║░░██║███████╗╚█████╔╝╚██████╔╝███████╗██║░░██║██████╔╝╚█████╔╝██║░░██║██║░░██║\n" +
                        "░╚════╝░╚═╝░░╚═╝╚══════╝░╚════╝░░╚═════╝░╚══════╝╚═╝░░╚═╝╚═════╝░░╚════╝░╚═╝░░╚═╝╚═╝░░╚═╝\n" +
                        "\n" +
                        "░██████╗░███████╗░█████╗░███╗░░░███╗███████╗████████╗██████╗░██╗░█████╗░░█████╗░\n" +
                        "██╔════╝░██╔════╝██╔══██╗████╗░████║██╔════╝╚══██╔══╝██╔══██╗██║██╔══██╗██╔══██╗\n" +
                        "██║░░██╗░█████╗░░██║░░██║██╔████╔██║█████╗░░░░░██║░░░██████╔╝██║██║░░╚═╝███████║\n" +
                        "██║░░╚██╗██╔══╝░░██║░░██║██║╚██╔╝██║██╔══╝░░░░░██║░░░██╔══██╗██║██║░░██╗██╔══██║\n" +
                        "╚██████╔╝███████╗╚█████╔╝██║░╚═╝░██║███████╗░░░██║░░░██║░░██║██║╚█████╔╝██║░░██║\n" +
                        "░╚═════╝░╚══════╝░╚════╝░╚═╝░░░░░╚═╝╚══════╝░░░╚═╝░░░╚═╝░░╚═╝╚═╝░╚════╝░╚═╝░░╚═╝");
                Scanner input = new Scanner(System.in);
                String nomeUsuario;

                System.out.println("Insira o seu nome: ");
                nomeUsuario = input.nextLine();




                while (true){
                    try {
                        System.out.println("=====MENU====");
                        System.out.println("1-QUADRADO \n" +
                                "2-TRIANGULO\n" +
                                "3-RETANGULO\n" +
                                "4-CIRCULO\n" +
                                "5-CUBO\n" +
                                "6-CILINDRO\n" +
                                "7-CONE\n" +
                                "8-PIRAMIDE\n" +
                                "9-HEXAGONO\n" +
                                "10-PARALELEPIPEDO\n" +
                                "11-ESFERA\n" +
                                "12-SAIR");
                        System.out.println("Escolha a sua opção:");
                        int opcao = input.nextInt();
                        switch (opcao) {
                            case 1:
                                System.out.println("\n" +
                                        "\n" +
                                        "░██████╗░██╗░░░██╗░█████╗░██████╗░██████╗░░█████╗░██████╗░░█████╗░\n" +
                                        "██╔═══██╗██║░░░██║██╔══██╗██╔══██╗██╔══██╗██╔══██╗██╔══██╗██╔══██╗\n" +
                                        "██║██╗██║██║░░░██║███████║██║░░██║██████╔╝███████║██║░░██║██║░░██║\n" +
                                        "╚██████╔╝██║░░░██║██╔══██║██║░░██║██╔══██╗██╔══██║██║░░██║██║░░██║\n" +
                                        "░╚═██╔═╝░╚██████╔╝██║░░██║██████╔╝██║░░██║██║░░██║██████╔╝╚█████╔╝\n" +
                                        "░░░╚═╝░░░░╚═════╝░╚═╝░░╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═════╝░░╚════╝░");
                                while(true){
                                    try {

                                        System.out.println(nomeUsuario + " "+"Insira o a lado do quadrado");
                                        double ladoQuadrado = input.nextDouble();
                                        if (ladoQuadrado>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario + " "+"O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        Quadrado quadrado = new Quadrado(ladoQuadrado);
                                        System.out.println(nomeUsuario + " "+ "Agora, insira um número qualquer para exibir o resultado [NÚMEROS PARES/MAIÚSCULO][NÚMEROS ÍMPARES/MINÚSCULOS]");
                                        int numeroExibirQuadrado = input.nextInt();
                                        System.out.println(quadrado.retornarValor(numeroExibirQuadrado));
                                        break;
                                    }catch(InputMismatchException e) {
                                        System.out.println(nomeUsuario + " "+"O que você digitou não está de acordo com o que foi pedido, insira novamente! ");
                                    }input.nextLine();}break;

                            case 2:
                                System.out.println(
                                        "==========TRIANGULO=====");
                                while(true) {
                                    try{

                                        System.out.println(nomeUsuario + " " + "Insira o lado do triângulo:");
                                        double ladoTriangulo = input.nextInt();
                                        Triangulo triangulo = new Triangulo(ladoTriangulo);

                                        System.out.println(nomeUsuario + " "+"Agora, insira um número qualquer para exibir os resultados [NÚMEROS PARES/MAIÚSCULO][NÚMEROS ÍMPARES/MINÚSCULOS]");
                                        int numeroExibirTriangulo = input.nextInt();
                                        System.out.println(triangulo.retornarValor(numeroExibirTriangulo));
                                        break;
                                    }catch(InputMismatchException e){
                                        System.out.println(nomeUsuario + " "+"O que vocÊ digitou não está de acordo com o que foi pedido, tente novamente");
                                    } input.nextLine();
                                }break;
                            case 3:
                                System.out.println("\n" +
                                        "██████╗░███████╗████████╗░█████╗░███╗░░██╗░██████╗░██╗░░░██╗██╗░░░░░░█████╗░\n" +
                                        "██╔══██╗██╔════╝╚══██╔══╝██╔══██╗████╗░██║██╔════╝░██║░░░██║██║░░░░░██╔══██╗\n" +
                                        "██████╔╝█████╗░░░░░██║░░░███████║██╔██╗██║██║░░██╗░██║░░░██║██║░░░░░██║░░██║\n" +
                                        "██╔══██╗██╔══╝░░░░░██║░░░██╔══██║██║╚████║██║░░╚██╗██║░░░██║██║░░░░░██║░░██║\n" +
                                        "██║░░██║███████╗░░░██║░░░██║░░██║██║░╚███║╚██████╔╝╚██████╔╝███████╗╚█████╔╝\n" +
                                        "╚═╝░░╚═╝╚══════╝░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚══╝░╚═════╝░░╚═════╝░╚══════╝░╚════╝░");
                                while(true){
                                    try {
                                        System.out.println(nomeUsuario + " "+"Insira a base deste retângulo: ");
                                        double baseRetangulo = input.nextDouble();
                                        if (baseRetangulo>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario + " "+"O que você digitou precisa ser maior que zero");
                                        }
                                        System.out.println(nomeUsuario + "Insira o lado deste retângulo: ");
                                        double ladoRetangulo = input.nextDouble();
                                        if (ladoRetangulo>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario + " "+ "O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        Retangulo novoRetangulo = new Retangulo(baseRetangulo, ladoRetangulo);
                                        System.out.println(nomeUsuario + " "+ "Agora, insira um número qualquer para exibir os resultados [NÚMEROS PARES/MAIÚSCULO][NÚMEROS ÍMPARES/MINÚSCULOS]: ");
                                        int numeroExibirRetangulo = input.nextInt();
                                        System.out.println(novoRetangulo.retornarValor(numeroExibirRetangulo));
                                        break;
                                    }catch (InputMismatchException e){
                                        System.out.println(nomeUsuario +" "+ "O que você digitou não está de acordo com o que foi pedido, tente novamente");
                                    }input.nextLine();}break;

                            case 4:
                                System.out.println("\n" +
                                        "░█████╗░██╗██████╗░░█████╗░██╗░░░██╗██╗░░░░░░█████╗░\n" +
                                        "██╔══██╗██║██╔══██╗██╔══██╗██║░░░██║██║░░░░░██╔══██╗\n" +
                                        "██║░░╚═╝██║██████╔╝██║░░╚═╝██║░░░██║██║░░░░░██║░░██║\n" +
                                        "██║░░██╗██║██╔══██╗██║░░██╗██║░░░██║██║░░░░░██║░░██║\n" +
                                        "╚█████╔╝██║██║░░██║╚█████╔╝╚██████╔╝███████╗╚█████╔╝\n" +
                                        "░╚════╝░╚═╝╚═╝░░╚═╝░╚════╝░░╚═════╝░╚══════╝░╚════╝░");

                                while(true) {
                                    try {


                                        System.out.println(nomeUsuario +" "+ "Insira o raio deste círculo: ");
                                        double raioCirculo = input.nextDouble();
                                        if (raioCirculo>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario + " "+"O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        Circulo circulo = new Circulo(raioCirculo);
                                        System.out.println(nomeUsuario + " "+"Agora insira um número qualquer para exibir os resultados [NÚMEROS PARES/MAIÚSCULO][NÚMEROS ÍMPARES/MINÚSCULOS]: ");
                                        int numeroExibirCirculo = input.nextInt();
                                        System.out.println(circulo.retornarValor(numeroExibirCirculo));
                                        break;
                                    }catch(InputMismatchException e){
                                        System.out.println(nomeUsuario + " "+"O que você digitou não está de acordo com o que foi pedido, tente novamente");
                                    }input.nextLine();}break;

                            case 5:
                                System.out.println("\n" +
                                        "░█████╗░██╗░░░██╗██████╗░░█████╗░\n" +
                                        "██╔══██╗██║░░░██║██╔══██╗██╔══██╗\n" +
                                        "██║░░╚═╝██║░░░██║██████╦╝██║░░██║\n" +
                                        "██║░░██╗██║░░░██║██╔══██╗██║░░██║\n" +
                                        "╚█████╔╝╚██████╔╝██████╦╝╚█████╔╝\n" +
                                        "░╚════╝░░╚═════╝░╚═════╝░░╚════╝░");
                                while(true){
                                    try {


                                        System.out.println(nomeUsuario +" "+ "Insira o lado deste cubo: ");
                                        double ladoCubo = input.nextDouble();
                                        if (ladoCubo>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario + " "+"O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        Cubo cubo = new Cubo(ladoCubo);
                                        System.out.println(nomeUsuario + " "+ "Agora, insira um número qualquer para exibir os resultados: [NÚMEROS PARES/MAIÚSCULO][NÚMEROS ÍMPARES/MINÚSCULOS] ");
                                        int numeroExibirCubo = input.nextInt();
                                        System.out.println(cubo.retornarValor(numeroExibirCubo));
                                        break;
                                    }catch (InputMismatchException e){
                                        System.out.println(nomeUsuario + " "+"O que você digitou não está de acordo com o que você pediu");

                                    }input.nextLine();}break;

                            case 6:
                                System.out.println("\n" +
                                        "░█████╗░██╗██╗░░░░░██╗███╗░░██╗██████╗░██████╗░░█████╗░\n" +
                                        "██╔══██╗██║██║░░░░░██║████╗░██║██╔══██╗██╔══██╗██╔══██╗\n" +
                                        "██║░░╚═╝██║██║░░░░░██║██╔██╗██║██║░░██║██████╔╝██║░░██║\n" +
                                        "██║░░██╗██║██║░░░░░██║██║╚████║██║░░██║██╔══██╗██║░░██║\n" +
                                        "╚█████╔╝██║███████╗██║██║░╚███║██████╔╝██║░░██║╚█████╔╝\n" +
                                        "░╚════╝░╚═╝╚══════╝╚═╝╚═╝░░╚══╝╚═════╝░╚═╝░░╚═╝░╚════╝░");
                                while(true){
                                    try {


                                        System.out.println(nomeUsuario + " "+"Insira o raio deste cilindro: ");
                                        double raioClindro = input.nextDouble();
                                        if (raioClindro>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario + " "+"O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        System.out.println(nomeUsuario + " "+"Insira a altura deste cilindro: [NÚMEROS PARES/MAIÚSCULO][NÚMEROS ÍMPARES/MINÚSCULOS]");
                                        double alturaClindro = input.nextDouble();
                                        if (alturaClindro>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario + " "+"O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        Cilindro cilindro = new Cilindro(raioClindro, alturaClindro);
                                        System.out.println(nomeUsuario+ " "+"Agora insira o numero para exibir os resultados: ");
                                        int numeroExibirClindro = input.nextInt();
                                        System.out.println(cilindro.retornarValor(numeroExibirClindro));
                                        break;
                                    }catch (InputMismatchException e){
                                        System.out.println(nomeUsuario +" "+ "O que você digitou não está de acordo com o que foi pedido");

                                    }input.nextLine();}break;

                            case 7:
                                System.out.println(
                                        "\n" +
                                                "░█████╗░░█████╗░███╗░░██╗███████╗\n" +
                                                "██╔══██╗██╔══██╗████╗░██║██╔════╝\n" +
                                                "██║░░╚═╝██║░░██║██╔██╗██║█████╗░░\n" +
                                                "██║░░██╗██║░░██║██║╚████║██╔══╝░░\n" +
                                                "╚█████╔╝╚█████╔╝██║░╚███║███████╗\n" +
                                                "░╚════╝░░╚════╝░╚═╝░░╚══╝╚══════╝");
                                while(true){
                                    try {

                                        System.out.println(nomeUsuario + " "+ "Insira o raio deste cone: ");
                                        double raioCone = input.nextDouble();
                                        if (raioCone>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario + " "+ "O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        System.out.println(nomeUsuario + " "+ "Insira a altura deste cone: ");
                                        double alturaCone = input.nextDouble();
                                        if (alturaCone>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario +" "+ "O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        Cone cone = new Cone(raioCone, alturaCone);
                                        System.out.println(nomeUsuario + " "+"Insira um número qualquer para exibir os resultados [NÚMEROS PARES/MAIÚSCULO][NÚMEROS ÍMPARES/MINÚSCULOS]: ");
                                        int numeroExibirCone = input.nextInt();
                                        System.out.println(cone.retornarValor(numeroExibirCone));
                                        break;
                                    }catch (InputMismatchException e){
                                        System.out.println(nomeUsuario + " "+ "O que você digitou não está de acordo com o que foi pedido, tente novamente.");

                                    }input.nextLine();}break;

                            case 8:
                                System.out.println(
                                        "\n" +
                                                "██████╗░██╗██████╗░░█████╗░███╗░░░███╗██╗██████╗░███████╗\n" +
                                                "██╔══██╗██║██╔══██╗██╔══██╗████╗░████║██║██╔══██╗██╔════╝\n" +
                                                "██████╔╝██║██████╔╝███████║██╔████╔██║██║██║░░██║█████╗░░\n" +
                                                "██╔═══╝░██║██╔══██╗██╔══██║██║╚██╔╝██║██║██║░░██║██╔══╝░░\n" +
                                                "██║░░░░░██║██║░░██║██║░░██║██║░╚═╝░██║██║██████╔╝███████╗\n" +
                                                "╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░░░░╚═╝╚═╝╚═════╝░╚══════╝");
                                while (true){
                                    try {

                                        System.out.println(nomeUsuario + " "+ "Insira a aresta base desta pirâmide: ");
                                        double arestaBase = input.nextDouble();
                                        if (arestaBase>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario +" "+ "O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        System.out.println(nomeUsuario + " "+"Insira a apotema desta pirâmide: ");
                                        double apotemaPiramide = input.nextDouble();
                                        if (apotemaPiramide>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario + " "+ "O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        System.out.println(nomeUsuario + " "+"Insira a área da base desta pirâmide: ");
                                        double areaBase = input.nextDouble();
                                        if (areaBase>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario +" "+ "O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        System.out.println(nomeUsuario + " "+ "Insira a altura desta pirâmide: ");
                                        double alturaPiramide = input.nextDouble();
                                        if (alturaPiramide>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario + " "+ "O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        Piramide piramide = new Piramide(arestaBase, apotemaPiramide, areaBase, alturaPiramide);
                                        System.out.println(nomeUsuario +" "+ "Insira um número qualquer para exibir os resultados [NÚMEROS PARES/MAIÚSCULO][NÚMEROS ÍMPARES/MINÚSCULOS]: ");
                                        int numeroExibirPiramide = input.nextInt();
                                        System.out.println(piramide.retornarValor(numeroExibirPiramide));
                                        break;
                                    }catch (InputMismatchException e){
                                        System.out.println(nomeUsuario + " "+"O que você colocou não está de acorodo com o que foi pedido");

                                    }input.nextLine();}break;
                            case 9:
                                System.out.println(
                                        "\n" +
                                                "██╗░░██╗███████╗██╗░░██╗░█████╗░░██████╗░░█████╗░███╗░░██╗░█████╗░\n" +
                                                "██║░░██║██╔════╝╚██╗██╔╝██╔══██╗██╔════╝░██╔══██╗████╗░██║██╔══██╗\n" +
                                                "███████║█████╗░░░╚███╔╝░███████║██║░░██╗░██║░░██║██╔██╗██║██║░░██║\n" +
                                                "██╔══██║██╔══╝░░░██╔██╗░██╔══██║██║░░╚██╗██║░░██║██║╚████║██║░░██║\n" +
                                                "██║░░██║███████╗██╔╝╚██╗██║░░██║╚██████╔╝╚█████╔╝██║░╚███║╚█████╔╝\n" +
                                                "╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝░╚═════╝░░╚════╝░╚═╝░░╚══╝░╚════╝░");
                                while(true){
                                    try {

                                        System.out.println(nomeUsuario  + " "+"Insira o lado deste hexágono: ");
                                        double ladoHexagono = input.nextDouble();
                                        if (ladoHexagono>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario + " "+ "O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        Hexagono hexagono = new Hexagono(ladoHexagono);
                                        System.out.println(nomeUsuario + " "+"Insira um número qualquer para exibir os resultados [NÚMEROS PARES/MAIÚSCULO][NÚMEROS ÍMPARES/MINÚSCULOS]: ");
                                        int numeroExibirHexagono = input.nextInt();
                                        System.out.println(hexagono.retornarValor(numeroExibirHexagono));
                                        break;
                                    }catch (InputMismatchException e){
                                        System.out.println(nomeUsuario + " "+ "O que você colocou não está de acordo com o que foi pedido.");

                                    } input.nextLine();}break;
                            case 10:
                                System.out.println(
                                        "\n" +
                                                "██████╗░░█████╗░██████╗░░█████╗░██╗░░░░░███████╗██╗░░░░░███████╗██████╗░██╗██████╗░███████╗██████╗░░█████╗░\n" +
                                                "██╔══██╗██╔══██╗██╔══██╗██╔══██╗██║░░░░░██╔════╝██║░░░░░██╔════╝██╔══██╗██║██╔══██╗██╔════╝██╔══██╗██╔══██╗\n" +
                                                "██████╔╝███████║██████╔╝███████║██║░░░░░█████╗░░██║░░░░░█████╗░░██████╔╝██║██████╔╝█████╗░░██║░░██║██║░░██║\n" +
                                                "██╔═══╝░██╔══██║██╔══██╗██╔══██║██║░░░░░██╔══╝░░██║░░░░░██╔══╝░░██╔═══╝░██║██╔═══╝░██╔══╝░░██║░░██║██║░░██║\n" +
                                                "██║░░░░░██║░░██║██║░░██║██║░░██║███████╗███████╗███████╗███████╗██║░░░░░██║██║░░░░░███████╗██████╔╝╚█████╔╝\n" +
                                                "╚═╝░░░░░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚══════╝╚══════╝╚══════╝╚══════╝╚═╝░░░░░╚═╝╚═╝░░░░░╚══════╝╚═════╝░░╚════╝░");
                                while(true){
                                    try {

                                        System.out.println(nomeUsuario + " "+ "Insira a largura do paralelepipedo: ");
                                        double larguraPara = input.nextDouble();
                                        if (larguraPara>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario + " "+ "O que você digitou precisa ser maior que zero");
                                            continue;

                                        }
                                        System.out.println(nomeUsuario + " "+"Insira o comprimento do paralelepipedo: ");
                                        double comprimentoPara = input.nextDouble();
                                        if (comprimentoPara>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario +" "+ "O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        System.out.println(nomeUsuario + " "+ "Insira a altura do paralelepipedo: ");
                                        double alturaPara = input.nextDouble();
                                        if (alturaPara>0){
                                            System.out.println("Ok");
                                        }else{
                                            System.out.println(nomeUsuario + " "+"O que você digitou precisa ser maior que zero");
                                            continue;
                                        }
                                        Paralelepipedo paralelepipedo = new Paralelepipedo(larguraPara, comprimentoPara, alturaPara);
                                        System.out.println(nomeUsuario + " "+ "Insira um número para exibir os resultados [NÚMEROS PARES/MAIÚSCULO][NÚMEROS ÍMPARES/MINÚSCULOS]: ");
                                        int numeroExibirPara = input.nextInt();
                                        System.out.println(paralelepipedo.retornarValor(numeroExibirPara));
                                        break;
                                    }catch (InputMismatchException e){
                                        System.out.println(nomeUsuario + "O que você colocu não está de acordo com o que foi pedido");

                                    }input.nextLine();}break;
                            case 11:
                                System.out.println("\n" +
                                        "=\n" +
                                        "███████╗░██████╗███████╗███████╗██████╗░░█████╗░\n" +
                                        "██╔════╝██╔════╝██╔════╝██╔════╝██╔══██╗██╔══██╗\n" +
                                        "█████╗░░╚█████╗░█████╗░░█████╗░░██████╔╝███████║\n" +
                                        "██╔══╝░░░╚═══██╗██╔══╝░░██╔══╝░░██╔══██╗██╔══██║\n" +
                                        "███████╗██████╔╝██║░░░░░███████╗██║░░██║██║░░██║\n" +
                                        "╚══════╝╚═════╝░╚═╝░░░░░╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝");;
                                while(true){
                                    try{

                                        System.out.println("");
                                        System.out.println(nomeUsuario +" "+ "insira o raio da esfera: ");
                                        double raioEsfera = input.nextDouble();
                                        if (raioEsfera>0){
                                            System.out.println("Ok");
                                        }
                                        else{
                                            System.out.println("O número precisa ser maior que zero");
                                            continue;
                                        }
                                        Esfera esfera = new Esfera(raioEsfera);
                                        System.out.println("Insira um número qualquer para a exibição do resultado [NÚMEROS PARES/MAIÚSCULO][NÚMEROS ÍMPARES/MINÚSCULOS]: ");
                                        int numeroExibirEsfera = input.nextInt();
                                        System.out.println(esfera.retornarValor(numeroExibirEsfera));
                                        break;
                                    }catch (InputMismatchException e){
                                        System.out.println("O que você digitou não está de acordo com o que foi pedido");}input.nextLine();
                                }break;
                            case 12:
                                System.out.println("Saindo da calculadora");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("O que você digitou não está na lista de opções");}
                    } catch (InputMismatchException e){
                        System.out.println("O que você digitou não está de acordo com o que foi pedido");

                    }input.nextLine();
                }}}







