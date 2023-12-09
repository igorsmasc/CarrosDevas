public class MainTestes {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Azul", "Ferrari", "296 GTB");
        Carro carro2 = new Carro("Branco", "VW", "Gol");

        System.out.println(carro1.getNumSerie());
        System.out.println(carro2.getNumSerie());


        // tipos primitivos
        // byte, short, int, long, float, double, boolean, char
        // tipos primitivos NÃO podem ser nulos - null
        // Eles setam dados default

        // Wrapper Classes
        Byte numByte = 1;
        Short numShort = 1;
        Integer numInt = 1;
        Long numLong = 1L;
        Float numFloat = 1f;
        Boolean aBoolean = false;

        // - O valor default é NULL
    }

    public void fazAlgumaCoisa() {
        int a = 1;
    }

}
