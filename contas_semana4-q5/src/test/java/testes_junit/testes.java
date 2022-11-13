package testes_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import criar_contas.Cliente;
import criar_contas.Conta;

public class testes {

	@Test
	public void testandoContaSemTitular() {
			
			//criando contas para testes o identificador
			Conta conta1 = new Conta(); //conta 0
			Conta conta2 = new Conta(); //conta 1
			Conta conta3 = new Conta(); //conta 2
			
			assertEquals(0, conta1.getId());
			assertEquals(1, conta2.getId());
			assertEquals(2, conta3.getId());
			
		}

		
	}
