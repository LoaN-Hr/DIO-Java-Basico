import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual valor deseja sacar?");
        double valorSolicitado = scanner.nextDouble();
 
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Operação realizada com sucesso!!!");
            System.out.println("Seu saldo atual é de: R$" + saldo);
            System.out.println("Obrigado por utilizar nosso serviços, deixe uma nota de avaliação:");
            int avaliacao = scanner.nextInt();
            System.out.println("Nota de avaliação: " + avaliacao);
        }else{
            System.out.println("Saldo insuficiente --- Por favor, realize um depósito");
        }
        
        
        scanner.close(); 
    }
}