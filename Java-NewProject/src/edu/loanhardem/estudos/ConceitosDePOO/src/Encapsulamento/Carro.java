package Encapsulamento;

public class Carro {
    public void ligarCarro(){
        confereCambio();
        confereCombustivel();

        System.out.println("CARRO LIGADO");
    }

    private void confereCambio(){
        System.out.println("Conferindo o cambio em D ou primeira marcha");
    }

    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }
}
