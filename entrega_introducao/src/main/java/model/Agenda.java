package model;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;

public class Agenda implements Agendamento{
	
	ArrayList<Evento> eventos  = new ArrayList<Evento>();
	Scanner sc = new Scanner(System.in);
	
	public Evento agendar(Evento e) {
		
		Evento evento = new Evento();
		evento = e;
		evento.setId(01);
        evento.setNome("teste");
        evento.setDataInicial("09/18/2020 01:00");
        evento.setDataFinal("09/19/2020 01:00");
        eventos.add(evento);
        return evento;
        
	}
	
	public String retornaTempoParaEvento(int i) {
		
		int id = i;
		i = 01;
		//String nome = n;
		//nome = "teste";
		String resultado = " ";
		
		for (Evento evento : eventos) {
			if (evento.getId() == 01) {
				
				String dataInicial = evento.getDataInicial();
		    	String dataFinal = evento.getDataFinal();
		    	
		    	SimpleDateFormat format = new SimpleDateFormat ("MM/dd/yyyy HH:mm");
		    	
		    	Date date1 = null;
		    	Date date2 = null;
		    	
		    	try {
		    		date1 = format.parse(dataInicial);
		    		date2 = format.parse(dataFinal);
		    		
		    		DateTime dt1 = new DateTime(date1);
		    		DateTime dt2 = new DateTime(date2);
		    		
		    		System.out.print(Days.daysBetween(dt1, dt2).getDays() + " days, ");
		    		System.out.print(Hours.hoursBetween(dt1, dt2).getHours() + " hours, ");
		    		System.out.print(Minutes.minutesBetween(dt1, dt2).getMinutes() + " minutes");
		    		resultado = "" + Days.daysBetween(dt1, dt2).getDays() + " " + Hours.hoursBetween(dt1, dt2).getHours() + " " + Minutes.minutesBetween(dt1, dt2).getMinutes();
		    	
		    	} catch (Exception e){
		    		e.printStackTrace();
		    	}
			}
		}
		return resultado;
	}
}