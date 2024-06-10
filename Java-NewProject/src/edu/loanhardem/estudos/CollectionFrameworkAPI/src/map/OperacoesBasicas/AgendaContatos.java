package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;
    
    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("nome1", 12131415);
        agendaContatos.adicionarContato("nomeUm", 10000000);
        agendaContatos.adicionarContato("nome2", 12131485);
        agendaContatos.adicionarContato("nome3", 12131475);
        agendaContatos.adicionarContato("nome1", 12177775);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("nome3");
        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("nome1"));
    }
}
