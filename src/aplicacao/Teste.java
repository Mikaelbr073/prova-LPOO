package aplicacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entidade.Banco;
import entidade.Cliente;
import entidade.Poupanca;
import entidade.Conta;

/**
 * @author Mikael C. Barros
 *
 */
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String opcao = "6";

		List<Conta> bancoDeDados = new ArrayList<>();

		while (!opcao.equals("0")) {

			opcao = JOptionPane.showInputDialog(null,
					"1. Cadastrar Conta ou Poupan�a \n" + "2. Realizar dep�sito \n" + "3. Render Juros \n"
							+ "4. Consultar n�mero e nome da ag�ncia \n" + "5. Alterar o n�mero e nome da ag�ncia \n"
							+ "0. Sair \n",
					"--------------------IFPE Bank--------------------", JOptionPane.DEFAULT_OPTION);

			if (opcao.equals("1")) {

				while (true) {
					String novaConta = JOptionPane.showInputDialog(null,
							"Qual conta voc� quer abrir \n" + "1. Conta \n" + "2. Poupan�a \n" + "3. Sair \n",
							"--------------------IFPE Bank--------------------", JOptionPane.QUESTION_MESSAGE);

					if (novaConta.equals("3")) {
						break;
					}

					if (novaConta.equals("2")) {
						
						Poupanca poupanca = (Poupanca) cadastraConta(2);
						bancoDeDados.add(poupanca);
						break;

					}

					if (novaConta.equals("1")) {
						Conta conta = cadastraConta(1);
						bancoDeDados.add(conta);
						break;
					}

					else {
						JOptionPane.showMessageDialog(null, "Essa op��o n�o existe", "Erro", JOptionPane.ERROR_MESSAGE);
					}

				}
			}

			else if (opcao.equals("2")) {

			}

			else if (opcao.equals("3")) {

			}

			else if (opcao.equals("4")) {

			}

			else if (opcao.equals("5")) {

			}

			else if (opcao.equals("0")) {
				break;
			}

			else {

				JOptionPane.showMessageDialog(null, "Essa op��o n�o existe", "Erro", JOptionPane.ERROR_MESSAGE);

			}
		}
	}

	public static Conta cadastraConta(int opcao) {

		String numero = JOptionPane.showInputDialog(null, "Insira os Dados abaixo \n" + "-->N�mero da Conta",
				"--------------------IFPE Bank--------------------", JOptionPane.DEFAULT_OPTION);

		String nomeAgencia = JOptionPane.showInputDialog(null, "Insira os Dados abaixo \n" + "-->Nome da Ag�ncia \n",
				"--------------------IFPE Bank--------------------", JOptionPane.DEFAULT_OPTION);

		String numeroAgencia = JOptionPane.showInputDialog(null, "Insira os Dados abaixo \n" + "-->N�mero do Banco \n",
				"--------------------IFPE Bank---------------------", JOptionPane.DEFAULT_OPTION);

		Banco banco = new Banco(numeroAgencia, nomeAgencia);

		String nome = JOptionPane.showInputDialog(null, "Insira os Dados abaixo \n" + "-->Digite seu nome \n",
				"--------------------IFPE Bank--------------------", JOptionPane.DEFAULT_OPTION);

		String cpf = JOptionPane.showInputDialog(null, "Insira os Dados abaixo \n" + "-->Digite seu CPF \n",
				"--------------------IFPE Bank--------------------", JOptionPane.DEFAULT_OPTION);

		Cliente cliente = new Cliente(nome, cpf);

		double saldo = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Insira os Dados abaixo \n" + "-->Saldo inicial \n",
						"--------------------IFPE Bank--------------------", JOptionPane.DEFAULT_OPTION));
		if (opcao == 1) {
			Conta conta = new Conta(numeroAgencia, banco, cliente, saldo);

			JOptionPane.showMessageDialog(null, "Sua conta foi aberta com sucesso, espere at� 24 horas para usar",
					"--------------------IFPE Bank---------------------", JOptionPane.INFORMATION_MESSAGE);
			return conta;
		} else if (opcao == 2) {
			Poupanca poupanca = new Poupanca(numeroAgencia, banco, cliente, saldo);
			JOptionPane.showMessageDialog(null, "Sua poupan�a foi aberta com sucesso, espere at� 24 horas para usar",
					"--------------------IFPE Bank---------------------", JOptionPane.INFORMATION_MESSAGE);
			return poupanca;
		}
		return null;
	}
}