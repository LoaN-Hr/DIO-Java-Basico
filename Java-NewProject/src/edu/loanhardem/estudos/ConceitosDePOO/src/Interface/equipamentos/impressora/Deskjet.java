package Interface.equipamentos.impressora;

public class Deskjet implements Impressora{
    public void imprimir() {
        System.out.println("IMPRIMINDO DESKJET");
    }

    @Override
    public void teste() {
        System.out.println("EU SOU UMA IMPRESSORA DESKJET");
    }

}
