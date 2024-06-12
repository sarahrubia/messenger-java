package computador;

import java.util.Scanner;

import messenger.FacebookMessenger;
import messenger.MSNMessenger;
import messenger.Messenger;
import messenger.TelegramMessenger;

public class Computador {
	public static void main(String[] args) {
		
		Messenger appMensagem = null;
		
		System.out.println("Selecione um dos serviços para enviar a mensagem: \n 1. MSN, \n 2. Facebook, \n 3. Telegram.");
		Scanner scanner = new Scanner(System.in);
		int appEscolhido= scanner.nextInt(); 
		
		switch (appEscolhido) {
		case 1: {
			appMensagem = new MSNMessenger();
			break;
		} case 2: {
			appMensagem = new FacebookMessenger();
			break;
		} case 3: {
			appMensagem = new TelegramMessenger();
			break;
		}
		default:
			System.out.println("Opção inválida, digite um número de 1 a 3 para selecionar o serviço de mensagem.");;
		};
			
		appMensagem.enviarMensagem();
		appMensagem.receberMensagem();
		
		scanner.close();
	}
}
