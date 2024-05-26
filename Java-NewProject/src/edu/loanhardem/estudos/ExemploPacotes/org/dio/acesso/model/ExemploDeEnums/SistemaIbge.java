package edu.loanhardem.estudos.ExemploPacotes.org.dio.acesso.model.ExemploDeEnums;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
    }
}
