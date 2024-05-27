package Abstração;
/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		System.out.println("Messenger");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();

		System.out.println("---------------------------------------");

		System.out.println("FacebookMessenger");
		Facebook fcb = new Facebook();
		fcb.enviarMensagem();
		fcb.receberMensagem();

		System.out.println("---------------------------------------");
		
		System.out.println("Telegram");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}
