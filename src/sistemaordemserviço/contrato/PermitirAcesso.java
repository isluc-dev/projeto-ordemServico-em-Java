package sistemaordemserviço.contrato;

public interface PermitirAcesso {
	
	//primeirra forma de fazer 
		public boolean autenticar();// apenas a declaração do metodo
		
		public boolean autenticar(String login , String senha);


}
