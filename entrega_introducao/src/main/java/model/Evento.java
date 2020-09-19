package model;
public class Evento{
	
	public int id;
	public String nome;
	public String dataInicial;
	public String dataFinal;
	
	public Evento() {
    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}
	
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String DataFinal) {
		this.dataFinal = DataFinal;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}


