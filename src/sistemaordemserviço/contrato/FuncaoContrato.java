package sistemaordemserviço.contrato;

public class FuncaoContrato {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoContrato(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
