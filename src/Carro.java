// Domain
// Toda classe no java herda da clase Object
public class Carro {
    // Atributos
    private String cor;
    private String marca;
    private String modelo;
    private Boolean ligado;
    private Integer velocidade;
    private Integer numSerie;

    // construtor - sempre que precisamos criar um objeto vamos utilizar um construtor
    public Carro() {
    }

    public Carro(String cor, String marca, String modelo) {
        validaMarca(marca);
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = true;
        this.velocidade = 0;
    }

    public void setMarca(String marca) {
        validaMarca(marca);
        this.marca = marca;
    }

    private void validaMarca(String marca) {
    }

    // Acoes
    public void acelerar(int velocidade) {
        if(velocidade < 1) {
            System.out.println("Velocidade invalida");
        } else {
            this.velocidade += velocidade;
            System.out.println("Voce accelerator e a velocidade atual é: " + this.velocidade);
        }
    }

    public void frear() {
        this.velocidade -= 10;
        System.out.println("Voce freou e a velocidade atual é: " + this.velocidade);
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void mostrarEstadoAtual() {
        System.out.println("O estado atual do carro é:");
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade atual: " + this.velocidade);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public Integer getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
}
