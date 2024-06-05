package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo) {
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if (c.getCodigo() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

        conjuntoConvidado.adicionarConvidado("loan", 2500);
        conjuntoConvidado.adicionarConvidado("loan", 2500);
        conjuntoConvidado.adicionarConvidado("lucas", 2502);
        conjuntoConvidado.adicionarConvidado("marcos", 2503);
        conjuntoConvidado.adicionarConvidado("luiz", 2504);
        conjuntoConvidado.adicionarConvidado("zeca", 2505);

        conjuntoConvidado.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidado.contarConvidado() + " Convidados no seu Set.");

        conjuntoConvidado.removerConvidadoPorCodigoConvite(2503);
        System.out.println("Existem " + conjuntoConvidado.contarConvidado() + " Convidados no seu Set.");


    }
}
