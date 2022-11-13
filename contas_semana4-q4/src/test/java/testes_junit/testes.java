package testes_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import criar_contas.Cliente;
import criar_contas.Conta;

public class testes {

	@Test
	public void testandoContaSemTitular() {
			
			/* para criar a conta sem um titular, é preciso usar um construtor vazio
			como esse construtor já está feito na classe Conta, podemos seguir*/
			
			Conta conta1 = new Conta();
			
			conta1.setAgencia("8080-50");
			conta1.setNumero(15);
			conta1.setLimite(4000);
			
			/* podemos ver acima que a conta1 foi criada sem ter dado um nome para um titular
			vamos testar seus atributos para ver se está correto*/
			
			assertEquals("8080-50", conta1.getAgencia());
			
			assertEquals(15, conta1.getNumero());
			
			assertEquals(4000,00, conta1.getLimite());
			
			/* todos os testes passaram
			 vamos agora testar o nome, é esperado que de NULL*/

			assertEquals(null, conta1.getCliente());
			
			/* o teste do nome/titular/cliente também passou
			 * conclui-se que o contrutor vazio pode ser usado para situações onde
			 * não queremos usar algum atributo (propositalmente ou opcinalmente)*/
		}

		
	}
