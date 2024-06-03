package list.PesquisaList;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalosAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalosAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalosAnos.add(l);
                }
            }
        }
        return livrosPorIntervalosAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for(Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("Livro 1", "Loan", 2000);
        catalagoLivros.adicionarLivro("Livro 1", "Loan", 20020);
        catalagoLivros.adicionarLivro("Livro 2", "lucas", 2013);
        catalagoLivros.adicionarLivro("Livro 3", "marcelo", 2016);
        catalagoLivros.adicionarLivro("Livro 4", "jao", 1996);
        catalagoLivros.adicionarLivro("Livro 5", "benedito", 2024);

        System.out.println(catalagoLivros.pesquisaPorAutor("Loan"));
        System.out.println(catalagoLivros.pesquisarPorIntervalosAnos(1996, 2013));
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 5"));
    }
}
