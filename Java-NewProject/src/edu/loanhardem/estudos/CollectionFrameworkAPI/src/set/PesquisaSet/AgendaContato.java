package set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNomes = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)) {
                contatosPorNomes.add(c);
            }
        }
        return contatosPorNomes;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoParaAtualizar = null;
        for(Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoParaAtualizar = c;
                break;
            }
        }
        return contatoParaAtualizar;
    }
    
    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("loan", 996145479);
        agendaContato.adicionarContato("loan2", 996145479);
        agendaContato.adicionarContato("loan3", 996145479);
        agendaContato.adicionarContato("loan4", 996145479);

        agendaContato.exibirContato();

        System.out.println(agendaContato.pesquisarPorNome("loan2"));

        System.out.println(agendaContato.atualizarNumeroContato("loan2", 111111111)); 

        agendaContato.exibirContato();
    }

}
