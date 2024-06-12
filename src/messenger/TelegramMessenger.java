package messenger;

public class TelegramMessenger extends Messenger {
	@Override
	public void enviarMensagem() {
		// método protected
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram.");
		salvarHistoricoMensagem();
	}
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem no Telegram.");
	}
	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem do Telegram na nuvem.");
	}
}
