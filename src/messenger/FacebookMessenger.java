package messenger;

public class FacebookMessenger extends Messenger {
	@Override
	public void enviarMensagem() {
		// método protected
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger.");
		salvarHistoricoMensagem();
	}
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem no Facebook Messenger.");
	}
	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem do Facebook Messenger na nuvem.");
		
	}
}
