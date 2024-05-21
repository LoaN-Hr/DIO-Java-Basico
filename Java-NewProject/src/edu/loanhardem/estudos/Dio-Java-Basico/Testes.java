import java.util.Random;

public class Testes {
    public static void main(String[] args) {
        //int numero = 3 + 1 - 7 * 8 ;

        //System.out.println(numero);

        //System.out.println(numero = numero * numero);

        //System.out.println(++numero / numero - 50);

        int a, b;

        a = 10;
        b = 10;

        String resultado;

        if (a==b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }

        //String resultado = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado);


        String nomeUm ="loan";
        String nomeDois =  new String("loan");

        System.out.println(nomeUm == nomeDois);

        int aleatorio = new Random().nextInt(3000);

        System.out.println(aleatorio);

        Exemplo exemplo = new Exemplo();
        System.out.println(exemplo.nome);
    }
}
