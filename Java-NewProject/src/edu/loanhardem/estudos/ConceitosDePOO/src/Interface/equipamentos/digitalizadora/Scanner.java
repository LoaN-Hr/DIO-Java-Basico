package Interface.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora {
    public void digitalizar() {
        System.out.println("DIGITALIZANDO");
    }

    @Override
    public void teste() {
        System.out.println("EU SOU UMA DIGITALIZADORA");
    }
    
}
