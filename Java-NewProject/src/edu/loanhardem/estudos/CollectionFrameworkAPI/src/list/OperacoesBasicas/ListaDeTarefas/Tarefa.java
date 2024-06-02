package list.OperacoesBasicas.ListaDeTarefas;

public class Tarefa {
    @SuppressWarnings("unused")
    private String descricao;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + "]";
    }

    
    
}
