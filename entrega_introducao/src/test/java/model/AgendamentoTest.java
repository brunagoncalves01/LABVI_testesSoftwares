package model;

import model.Agenda;
import model.Evento;
import model.Agendamento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AgendamentoTest{
	
	Evento evento = new Evento();

	@Test
	public void agendarTest() {
		
		Agendamento agendamento = new Agenda();
        
        evento.setId(01);
        evento.setNome("Bruna");
        evento.setDataInicial("09/19/2020 01:00");
        evento.setDataFinal("09/19/2020 01:00");
        
        assertNotNull(agendamento.agendar(evento));
        
	}
	
	@Test
	public void retornaTempoParaEventoTest() {
		
		 evento.setId(02);
	     evento.setNome("Bruna");
	     evento.setDataInicial("09/18/2020 01:00");
	     evento.setDataFinal("09/19/2020 01:00");
		
		Agendamento agendamento = new Agenda();
		agendamento.agendar(evento);
		int id = 02;
		//String nome = "Bruna";
		//String resultado = agendamento.retornaTempoParaEvento(nome);
		String resultado = agendamento.retornaTempoParaEvento(id);
		assertEquals("2 24 1440", resultado);
		//assertEquals("1 24 1440", resultado);
	}
		

}
