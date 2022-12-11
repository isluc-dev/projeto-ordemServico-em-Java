package sistemaOrdemServico.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente  extends Pessoa{
	
	private long id;
	private String telefone;
	private String endereco;
	private String apelido;
	
	List<Servico> servicos = new ArrayList<Servico>();
	
	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", telefone=" + telefone + ", endereco=" + endereco + ", apelido=" + apelido + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(apelido, endereco, id, telefone);
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
		Cliente other = (Cliente) obj;
		return Objects.equals(apelido, other.apelido) && Objects.equals(endereco, other.endereco) && id == other.id
				&& Objects.equals(telefone, other.telefone);
	}
	
	public double getSomaServico() {
		double somaServ = 0.0;
		for (Servico servico : servicos) {
			
			somaServ += servico.getPrecoServico();
		}
		return somaServ + servicos.size();
	}
	
	public String getStatusPagamento() {
		double pagamentos = this.getSomaServico();
		 if(pagamentos == 1) {
			 return FormaPgamento.DINHEIRO;
		 }else if(pagamentos == 2) {
			 return FormaPgamento.DEBITO;
			 
		 }
		return apelido;
	}
	
	
	
	

}
