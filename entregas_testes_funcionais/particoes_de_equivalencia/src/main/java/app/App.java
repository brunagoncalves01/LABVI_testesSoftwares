/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app;
import model.Agenda;
import model.Evento;
import model.Agendamento;

public class App {
    public String getGreeting() {
        return "LAB VI!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        Evento evento = new Evento();
        Agenda agenda = new Agenda();
        String nome = "";
        
        agenda.agendar(evento);
        agenda.retornaTempoParaEvento(nome);
    }
}