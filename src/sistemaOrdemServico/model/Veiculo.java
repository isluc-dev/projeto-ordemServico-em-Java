 package sistemaOrdemServico.model;

import java.util.Objects;

public  class Veiculo {
	
	private long id;
	private String topo;
	private String descricao;
	private String maraca;
	private  int ano;
	private String cor;
	
	public Veiculo() {
		// TODO Auto-generated constructor stub
	}

	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTopo() {
		return topo;
	}

	public void setTopo(String topo) {
		this.topo = topo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMaraca() {
		return maraca;
	}

	public void setMaraca(String maraca) {
		this.maraca = maraca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}


	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", topo=" + topo + ", descricao=" + descricao + ", maraca=" + maraca + ", ano="
				+ ano + ", cor=" + cor + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return id == other.id;
	}

	
	
	

}
