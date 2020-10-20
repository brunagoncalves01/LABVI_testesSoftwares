package model;

public interface Agendamento{
	
	public Evento agendar(Evento evento);
	
	public String retornaTempoParaEvento(String nome);
	
}
