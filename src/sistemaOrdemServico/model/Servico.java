package sistemaOrdemServico.model;

import java.util.Objects;

public class Servico {
	
	private double precoServico;
	private String horarioEntrada;
	private long id;
	private String descricaoServiço;
	
	@Override
	public String toString() {
		return "Servico [precoServico=" + precoServico + ", horarioEntrada=" + horarioEntrada + ", id=" + id
				+ ", descricaoServiço=" + descricaoServiço + "]";
	}

	public String getDescricaoServiço() {
		return descricaoServiço;
	}

	public void setDescricaoServiço(String descricaoServiço) {
		this.descricaoServiço = descricaoServiço;
	}

	public double getPrecoServico() {
		return precoServico;
	}

	public void setPrecoServico(double precoServico) {
		this.precoServico = precoServico;
	}

	public Servico() {
		// TODO Auto-generated constructor stub
	}

	public String getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(String horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricaoServiço, horarioEntrada, id, precoServico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servico other = (Servico) obj;
		return Objects.equals(descricaoServiço, other.descricaoServiço)
				&& Objects.equals(horarioEntrada, other.horarioEntrada) && id == other.id
				&& Double.doubleToLongBits(precoServico) == Double.doubleToLongBits(other.precoServico);
	}

	
	
	

}
