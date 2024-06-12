package messenger;

public abstract class Messenger {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	public abstract void salvarHistoricoMensagem();
	
	// somente os filhos (classes específicas, ou que estão no mesmo pacote do messenger) 
	// conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet.");
	}
	
}
