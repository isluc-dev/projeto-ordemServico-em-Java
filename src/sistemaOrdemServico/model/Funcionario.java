package sistemaOrdemServico.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Funcionario extends Pessoa {

	private String cargo;
	private String especialidade;
	private String tempoServico;

	public Funcionario() {
		// TODO Auto-generated constructor stub
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

}
