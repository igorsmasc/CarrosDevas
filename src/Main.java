import calculadora.Calculadora;

import java.util.Scanner;

public class Main {

    /**
     *
     * Criar um carro com os atributos:
     *  - cor
     *  - marca
     *  - modelo
     *  - ligado
     *  - velocidadeAtual
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Ligar/Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual
     *
     * Regras:
     * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
     * - Só podemos realizar as ações com o carro ligado
     * - A velocidade máxima do nosso carro é de 100km/h
     * - Não existe velocidade negativa
     * - Acelerar + 10km/h (Aumenta 10)
     * - Frear - 10km/h (Diminui 10)
     *
     */

    // TODO: Implementar regras
    // - A velocidade máxima do nosso carro é de 100km/h
    // - Não existe velocidade negativa

    public static void main(String[] args) {
        // métodos static não precisam da instanciacao de um objeto e podem ser utilizados diretamente nas classes
        Calculadora.somar(1, 2);


        Scanner entrada = new Scanner(System.in);

        // new - criamos um objeto
//        Carro carroIgor = new Carro();

        Carro carroDevas = new Carro("Azul", "Ferrari", "296 GTB");
        System.out.println(carroDevas.getCor());
        carroDevas.setCor("Preto");
        System.out.println(carroDevas.getCor());

        String a = carroDevas.getCor();

        int escolha;

        while(carroDevas.isLigado()) { // Enquanto meu carro estiver ligado ->
            mostrarMenu();
            escolha = entrada.nextInt(); // Entrada do usuario

            if(escolha == 1) {
                // carroDevas.velocidade = 100;
                carroDevas.acelerar(10);
            } else if(escolha == 2) {
                carroDevas.frear();
            } else if(escolha == 3) {
                carroDevas.mostrarEstadoAtual();
            } else if(escolha == 0) {
                // TODO: Implementar metodo desligar
                System.out.println("Voce desligou o carro!");
                // carroDevas.ligado = false;
                carroDevas.desligar();
            } else {
                System.out.println("Escolha invalida, tente novamente");
            }
        }

        entrada.close();
    }

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Acelerar");
        System.out.println("2 - Frear");
        System.out.println("3 - Estado atual");
        System.out.println("0 - Desligar");
        System.out.printf("Operacao: ");
        System.out.println();
    }


}
