public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 8;

        /*Condicional simples
        if (nota >= 7)
        System.out.println("aprovado"); */
        
        /*Condicional composta 
        if (nota >= 7)
        System.out.println("aprovado");

        else
        System.out.println("reprovado"); */


        //Condicional encadeada
        if (nota >= 7)
        System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7) // Sempre deve retornar TRUE ou FALSE
        System.out.println("Recuperação");

        else
        System.out.println("Reprovado");

        //Condicional ternária
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
