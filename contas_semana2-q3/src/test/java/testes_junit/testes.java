package testes_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import criar_contas.Cliente;
import criar_contas.Conta;

public class testes {

	@Test
	public void testandoGets() {
		
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
		
		//assertEquals("zeh", contaTeste.getCliente());
		//TO DO: MELHORAR O METODO getCliente() - está retornando o local, em tese tá certo
		
		assertEquals(0,0, contaTeste.getSaldo()); //passou
		
		assertEquals("9090-80", contaTeste.getAgencia()); //passou
		
		assertEquals(10, contaTeste.getNumero()); //passou
		
		assertEquals(1000,00, contaTeste.getLimite()); //passou
		
		contaTeste.depositarValor(1000);
		
		assertEquals(1000,00, contaTeste.getSaldo()); //passou
		
		contaTeste.sacarValor(500);
		
		assertEquals(500,00, contaTeste.getSaldo()); //passou
		
		//contaTeste.calcularRendimento(); -- retorna 50
		
		assertEquals(50,00, contaTeste.getRendimento()); //´passou
		
		
		assertEquals(zeh, contaTeste.getCliente()); //passou
		

		
	}

}
