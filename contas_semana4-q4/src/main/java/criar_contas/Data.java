package criar_contas;

public class Data {
	
	public int dia;
	public int mes;
	public int ano;
		
	
	public String formataData() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
	
	public void criaData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}


}
