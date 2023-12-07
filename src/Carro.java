// Domain
public class Carro {
    // Atributos
    String cor;
    String marca;
    String modelo;
    boolean ligado;
    int velocidade;

    // Acoes
    public void acelerar(int velocidade) {
        this.velocidade += velocidade;
        System.out.println("Voce accelerator e a velocidade atual é: " + this.velocidade);
    }

    public void frear() {
        this.velocidade -= 10;
        System.out.println("Voce freou e a velocidade atual é: " + this.velocidade);
    }

    public void mostrarEstadoAtual() {
        System.out.println("O estado atual do carro é:");
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade atual: " + this.velocidade);
    }
}
