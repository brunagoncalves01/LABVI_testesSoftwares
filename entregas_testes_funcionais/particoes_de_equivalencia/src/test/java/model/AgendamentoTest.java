package model;

import model.Agenda;
import model.Evento;
import model.Agendamento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AgendamentoTest{
	
	Evento evento = new Evento();
	
	//PARTIÇÕES DE EQUIVALÊNCIA PARA A CLASSE AGENDAR
	
	//CTC1: meses < 1; ou dias < 1; ou anos < 1 = INVÁLIDO; 
	//CTC2: meses > 12; ou dias > 31 = INVÁLIDO; 
	//CTC3: meses < 12 e > 1; ou dias < 31  e > 1; ou anos > 1 = VÁLIDO; 
	
	@Test
	public void agendarTestCTC1() {
		
		Agendamento agendamento = new Agenda();
		Evento evento = new Evento();
        
        evento.setId(01);
        evento.setNome("Bruna");
        evento.setMes("00");
        evento.setDia("00");
        evento.setAno("0000");
        evento.setHora("01:00");
        evento.setMesFinal("09");
        evento.setDiaFinal("00");
        evento.setAnoFinal("2020");
        evento.setHoraFinal("01:00");
        
        assertEquals("09", evento.getMes());
        assertEquals("18", evento.getDia());
        assertEquals("2020", evento.getAno());
        assertEquals("00:00", evento.getHora());
        
        assertEquals("09", evento.getMesFinal());
        assertEquals("19", evento.getDiaFinal());
        assertEquals("2020", evento.getAnoFinal());
        assertEquals("01:00", evento.getHoraFinal());
	}
	
	@Test
	public void agendarTestCTC2() {
		
		Agendamento agendamento = new Agenda();
        
        evento.setId(01);
        evento.setNome("Bruna");
        evento.setId(01);
        evento.setNome("Bruna");
        evento.setMes("13");
        evento.setDia("32");
        evento.setAno("2020");
        evento.setHora("00:00");
        evento.setMesFinal("09");
        evento.setDiaFinal("33");
        evento.setAnoFinal("2020");
        evento.setHoraFinal("01:00");
        
        assertEquals("09", evento.getMes());
        assertEquals("18", evento.getDia());
        assertEquals("2020", evento.getAno());
        assertEquals("00:00", evento.getHora());
        
        assertEquals("09", evento.getMesFinal());
        assertEquals("19", evento.getDiaFinal());
        assertEquals("2020", evento.getAnoFinal());
        assertEquals("01:00", evento.getHoraFinal());
        
        assertNotNull(agendamento.agendar(evento));
        
	}
	
	@Test
	public void agendarTestCTC3() {
		
		Agendamento agendamento = new Agenda();
        
        evento.setId(01);
        evento.setNome("Bruna");
        evento.setId(01);
        evento.setNome("Bruna");
        evento.setMes("09");
        evento.setDia("18");
        evento.setAno("2020");
        evento.setHora("00:00");
        evento.setMesFinal("09");
        evento.setDiaFinal("19");
        evento.setAnoFinal("2020");
        evento.setHoraFinal("01:00");
        
        assertEquals("09", evento.getMes());
        assertEquals("18", evento.getDia());
        assertEquals("2020", evento.getAno());
        assertEquals("00:00", evento.getHora());
        
        assertEquals("09", evento.getMesFinal());
        assertEquals("19", evento.getDiaFinal());
        assertEquals("2020", evento.getAnoFinal());
        assertEquals("01:00", evento.getHoraFinal());
        
        assertNotNull(agendamento.agendar(evento));
        
	}
	
	//PARTIÇÕES DE EQUIVALÊNCIA PARA A CLASSE QUE RETORNA TEMPO PARA O EVENTO
	
		//CTC1: dias < 1 = INVÁLIDO; 
		//CTC2: dias > 1 = VÁLIDO; 
	
	@Test
	public void retornaTempoParaEventoTestCTC1() {
		
		Agendamento agendamento = new Agenda();
		agendamento.agendar(evento);
		String nome = "Bruna";
		String resultado = agendamento.retornaTempoParaEvento(nome);
		assertEquals("0 24 1440", resultado);
	}
	
	@Test
	public void retornaTempoParaEventoTestCTC2() {
		
		Agendamento agendamento = new Agenda();
		agendamento.agendar(evento);
		int id = 01;
		String nome = "Bruna";
		String resultado = agendamento.retornaTempoParaEvento(nome);
		assertEquals("1 24 1440", resultado);
	}

}
