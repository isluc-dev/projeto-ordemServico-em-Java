package sistemaOrdemServico.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import sistemaordemserviço.contrato.PermitirAcesso;

public class Funcionario extends Pessoa implements PermitirAcesso {

	private String cargo;
	private String especialidade;
	private String tempoServico;
	private String login;
	private String senha;
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	public Funcionario(String login , String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getTempoServico() {
		return tempoServico;
	}

	public void setTempoServico(String tempoServico) {
		this.tempoServico = tempoServico;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", especialidade=" + especialidade + ", tempoServico=" + tempoServico
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cargo, especialidade, tempoServico);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(cargo, other.cargo) && Objects.equals(especialidade, other.especialidade)
				&& Objects.equals(tempoServico, other.tempoServico);
	}

	public String getTotalClientes() {

		String atendimento = this.getNome();
		if (atendimento == nome) {
			return "Atendido";
		} else {
			return "nao Atendido";
		}
	}

	
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
    
	@Override
	public boolean autenticar() {
		
		return login.contentEquals("admin")&& senha.equalsIgnoreCase("123");
	}
   

}
