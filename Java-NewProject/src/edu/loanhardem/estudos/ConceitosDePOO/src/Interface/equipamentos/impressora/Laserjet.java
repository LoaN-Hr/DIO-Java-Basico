package Interface.equipamentos.impressora;

public class Laserjet implements Impressora {
    public void imprimir() {
        System.out.println("IMPRIMINDO LASERJET");
    }

    @Override
    public void teste() {
        System.out.println("EU SOU UMA IMPRESSORA LASERJET");
    }
}
