package Interface.estabelecimento;

import Interface.equipamentos.Copiadora.Copiadora;
import Interface.equipamentos.Copiadora.Xerox;
import Interface.equipamentos.digitalizadora.Digitalizadora;
import Interface.equipamentos.digitalizadora.Scanner;
import Interface.equipamentos.impressora.Deskjet;
import Interface.equipamentos.impressora.Impressora;
import Interface.equipamentos.impressora.Laserjet;
import Interface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        //Area de Produção

        Copiadora copiadoraXerox = new Xerox();
        
        Impressora impressoraDeskjet = new Deskjet();
        Impressora impressoraLaserjet = new Laserjet();

        Digitalizadora digitalizadoraScanner = new Scanner();

        EquipamentoMultifuncional equipamentoMultifuncional = new EquipamentoMultifuncional();

        //Area de reconhecimento
        copiadoraXerox.teste();
        impressoraDeskjet.teste();
        impressoraLaserjet.teste();
        digitalizadoraScanner.teste();
        equipamentoMultifuncional.teste();

        //Area de teste
        copiadoraXerox.copiar();
        impressoraDeskjet.imprimir();
        impressoraLaserjet.imprimir();
        digitalizadoraScanner.digitalizar();

        equipamentoMultifuncional.copiar();
        equipamentoMultifuncional.digitalizar();
        equipamentoMultifuncional.imprimir();
    }
}
