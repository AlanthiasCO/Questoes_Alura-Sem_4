package criar_contas;

public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	
	
	public Cliente() {}
	
	public Cliente(String nome, String cpf, String email) {
		
	}

	public void getCpf() {
		System.out.println("CPF do cliente: " + this.cpf);	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


 	public void setNome(String nome) {
		this.nome = nome;
	}
 	
	public String getNome() {
		return nome;
	}

	public void getEmail() {
		System.out.println("Email do cliente: " + this.email);
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
