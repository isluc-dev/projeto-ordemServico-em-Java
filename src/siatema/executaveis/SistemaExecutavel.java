package siatema.executaveis;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import sistemaOrdemServico.model.Cliente;
import sistemaOrdemServico.model.Funcionario;
import sistemaOrdemServico.model.Servico;

public class SistemaExecutavel {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("login");
		String senha = JOptionPane.showInputDialog("senha");

		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("123")) {

			int atender = JOptionPane.showConfirmDialog(null, "Atendimento ao Cliente !");
			if (atender == 0) {
				int continuaAtendendo = 0;

				while (continuaAtendendo == 0) {
					for (int qnt = 1; qnt < 2; qnt++) {
						List<Funcionario> funcionarios = new ArrayList<Funcionario>();

						String nomeFuncionario = JOptionPane.showInputDialog("Nome do Funcionario" + qnt);
						String cargo = JOptionPane.showInputDialog("Cargo");

						Funcionario funcionario = new Funcionario();
						funcionario.setNome(nomeFuncionario);
						funcionario.setCargo(cargo);
						funcionarios.add(funcionario);

						for (int num = 1; num < 2; num++) {
							int escolha = JOptionPane.showConfirmDialog(null, "Deseja começa o atendimento ?");
							List<Cliente> clientes = new ArrayList<Cliente>();

							String nome = JOptionPane.showInputDialog("Nome do Cliente");
							

							Cliente cliente = new Cliente();
							cliente.setNome(nome);
							clientes.add(cliente);

							if (escolha == 0) {

								int continuaraAtendendo = 0;

								while (continuaraAtendendo == 0) {
									Servico servico = new Servico();
									String idServico = JOptionPane.showInputDialog("id do serviço");
									String horarioEntrada = JOptionPane
											.showInputDialog("horario de entraga do veiculo");
									String descricaoServico = JOptionPane.showInputDialog("serviço");
									String preco = JOptionPane.showInputDialog(" preço do serviço");
									servico.setId(Long.valueOf(idServico));
									servico.setHorarioEntrada(horarioEntrada);
									servico.setPrecoServico(Double.valueOf(preco));
									servico.setDescricaoServiço(descricaoServico);

									continuaraAtendendo = JOptionPane.showConfirmDialog(null, "  outro serviço ?");
									System.out.println("nome do funcionario :" + funcionario.getNome());
									System.out.println("cargo : " + funcionario.getCargo());
									System.out.println("nome do Cliente :" + cliente.getNome());
									System.out.println("id  do atendimento:" + servico.getId());
									System.out.println(" serviço :" + servico.getDescricaoServiço());
									System.out.println("horario da entrada : " + servico.getHorarioEntrada());
									System.out.println(" valor do serviço : " + servico.getPrecoServico());

									

								}

							}

						}

					}
					continuaAtendendo = JOptionPane.showConfirmDialog(null, "deseja finalizar ?");
					break;

				}

			}

		} else {
			JOptionPane.showMessageDialog(null, "acesso Negado");
		}
	}

}
