	package main;

import criar_contas.Cliente;
import criar_contas.Conta;

public class TestaConta {
	public static void main( String[] args ) {
		
		System.out.println("Testando Contas!\nQuestao 3 - Semana 4\n");
		
		Cliente zeh = new Cliente();
		zeh.setNome("Jose");
		zeh.setCpf("123.456.789-10");
		zeh.setEmail("birulei@gmail.com");
		zeh.getNome();
		zeh.getCpf();
		zeh.getEmail();
		
		Conta contaTeste = new Conta();
		contaTeste.setCliente(zeh);
		contaTeste.setNumero(10);
		contaTeste.setAgencia("9090-80");
		contaTeste.setLimite(1000);
		
		contaTeste.getCliente();
		contaTeste.getNumero();
		contaTeste.getAgencia();
		contaTeste.getSaldo(); // TEM QUE SER 0 (NULL)

		

		}
}