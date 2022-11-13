package criar_contas;

public class Conta {
	
	private Cliente cliente;
	private int numero;
	private String agencia;
	private double saldo;
	private double limite;
	private Data dataDeAbertura;

	//CONSTRUTOR SEM PARAMETROS PARA QUE NÃO SEJA EXIGIDO O TITULAR DA CONTA (OPCIONAL)
	public Conta() {}
	
	public Conta(String agencia, int numero, Cliente cliente, int limite) {
		
		this.setAgencia(agencia);
		this.numero = numero;
		this.setCliente(cliente);
		this.saldo = 0;
		this.limite = limite;
		
	}
	
	public boolean sacarValor(double valor){
	if(valor > saldo) {
		System.out.println("Saque nao realizado. Saldo insuficiente!\n");
		return false;
	} else if (valor < 0){
		System.out.println("Saque nao realizado. Digite um valor positivo!\n");
		return false;
	} else {
		this.saldo -= valor;
		System.out.println("\nSaque realizado. Saldo atual: R$" + saldo +"\n");
		return true;	
		}
	}

	public boolean depositarValor(double valor) {
	if(valor < 0) {
		System.out.println("Deposito nao realizado. Digite um valor postivo.\n");
		return false;
	}else {
		this.saldo += valor;
		System.out.println("\nDeposito realizado. Saldo atual: R$" + saldo + "\n" );
		return true;
		}
	}

	public void transferir(double valor, Conta contaDestino) {
		boolean conseguiuSacar = this.sacarValor(valor);
		if (conseguiuSacar) {
			boolean conseguiuDepositar = contaDestino.depositarValor(valor);
			if (!conseguiuDepositar) {
				this.saldo += valor;
			}
		}
	}
	
	public void calcularRendimento(){
	if(this.saldo == 0 && this.saldo < 0) {
		System.out.println("Nao eh possivel realizar o calculo de rendimento com o seguinte valor: R$" + saldo);
	} else {
		System.out.println("Rendimento mensal: R$" + String.format("%.2f", this.saldo * 0.1));
		}
	}

	public double getRendimento() {
		return this.saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getLimite() {
		return this.limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
	public void recuperaDadosParaImpressao() {
		System.out.println("Nome do titular: " + this.cliente);
		System.out.println("Numero da conta: " + this.numero);
		System.out.println("Agencia da conta: " + this.agencia);
		System.out.println("Saldo da conta: " + this.saldo);
		System.out.println("Data de abertura da conta: " + this.dataDeAbertura.formataData());
	}

	
}
