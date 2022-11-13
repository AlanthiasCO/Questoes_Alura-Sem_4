	package main;

import criar_contas.Cliente;
import criar_contas.Conta;

public class TestaConta {
	public static void main( String[] args ) {
		
		System.out.println("Testando Contas!\nQuestao 2 - Semana 4\n");
		
		
		Cliente zeh = new Cliente();
		zeh.setNome("Jose");
		zeh.setCpf("123.456.789-10");
		zeh.setEmail("birulei@gmail.com");
		zeh.getNome();
		zeh.getCpf();
		zeh.getEmail();
		
		Conta contaTeste = new Conta();
		contaTeste.depositarValor(800);
		contaTeste.setAgencia("0890-00");
		contaTeste.setCliente(zeh);
		contaTeste.getCliente();
		contaTeste.getAgencia();
		contaTeste.getSaldo();
		contaTeste.calcularRendimento();

		
		//RESPOSTA QUESTÃO
		//NÃO É POSSIVEL ACESSAR OS ATRIBUTOS DA CLASSE CONTA DIRETAMENTE 
		//EXEMPLO: 
		// contaTeste.saldo() não será compilado e apontará erro		
		}
}