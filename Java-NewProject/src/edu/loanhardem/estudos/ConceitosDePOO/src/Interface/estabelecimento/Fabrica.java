package Interface.estabelecimento;

import Interface.equipamentos.impressora.Impressora;
import Interface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultifuncional();

        impressora.imprimir();
    }
}
