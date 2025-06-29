package modelos;

import java.time.LocalDate;

import Interfaces.Agendavel;
import entities.Treinador;
import entities.Aluno;

public class Agendamento implements Agendavel {

    private Aluno aluno;
    private Treinador treinador;
    private LocalDate data;
    private String hora;

    
    public Agendamento(Aluno aluno, Treinador treinador, LocalDate data, String hora) {
    	this.aluno = aluno;
        this.treinador = treinador;
        this.data = data;
        this.hora = hora;
    }

    

    @Override
    public void agendar() {
        System.out.println("Agendamento criado para " + aluno.getName() + 
                           " com o treinador " + treinador.getName() + 
                           " no dia " + data + " às " + hora + " no local " + ".");
    }

    @Override
    public void cancelarAgendamento() {
        System.out.println("Agendamento cancelado para " + aluno.getName() + ".");
    }


    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }


    @Override
    public String toString() {
        return "Agendamento [treinador=" + treinador + ", data=" + data + ", hora=" + hora + "]";
    }
    

    


}
