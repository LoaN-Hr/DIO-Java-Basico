package Interface.equipamentos.Copiadora;

public class Xerox implements Copiadora {
    public void copiar() {
        System.out.println("COPIANDO");
    }

    @Override
    public void teste() {
        System.out.println("EU SOU UMA COPIADORA");
    }
}
