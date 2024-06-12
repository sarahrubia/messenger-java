package messenger;

public class MSNMessenger extends Messenger {
	@Override
	public void enviarMensagem() {
		// método protected
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN.");
		salvarHistoricoMensagem();
	}
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem no MSN.");
	}
	@Override
	public void salvarHistoricoMensagem() {
			System.out.println("Salvando o histórico da mensagem do MSN na nuvem.");
	}
}
