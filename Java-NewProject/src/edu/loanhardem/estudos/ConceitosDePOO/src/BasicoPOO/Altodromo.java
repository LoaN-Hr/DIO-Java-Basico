package BasicoPOO;

public class Altodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.ligarCarro();
        jeep.setChassi("123456");

        Moto z400 = new Moto();

        z400.ligarMoto();
        z400.setChassi("654321");
    }
}
