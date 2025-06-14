package entities;

import java.time.LocalDate;

import modelos.PlanoAcademia;
import modelos.PlanoAlimentar;
import modelos.Treino;

public class Aluno extends Pessoa {

    private PlanoAcademia planoAcademia;
    private PlanoAlimentar planoAlimentar;
    private Treino treino;

    public Aluno(String name, LocalDate dataNascimento, Integer telefone, Integer cpf, Integer cep) {
    	 super(name, dataNascimento, telefone, cpf, cep);
    }

    /*public Aluno(String name, LocalDate dataNascimento, Integer telefone, Integer cpf, Integer cep,
            PlanoAcademia planoAcademia, PlanoAlimentar planoAlimentar, Treino treino) {
        super(name, dataNascimento, telefone, cpf, cep);
        this.planoAcademia = planoAcademia;
        this.planoAlimentar = planoAlimentar;
        this.treino = treino;
    }*/


   

    public PlanoAcademia getPlanoAcademia() {
        return planoAcademia;
    }




    public void setPlanoAcademia(PlanoAcademia planoAcademia) {
        this.planoAcademia = planoAcademia;
    }




    public PlanoAlimentar getPlanoAlimentar() {
        return planoAlimentar;
    }




    public void setPlanoAlimentar(PlanoAlimentar planoAlimentar) {
        this.planoAlimentar = planoAlimentar;
    }




    public Treino getTreino() {
        return treino;
    }




    public void setTreino(Treino treino) {
        this.treino = treino;
    }




    @Override
    public String toString() {
        return "Aluno [planoAcademia=" + planoAcademia + ", planoAlimentar=" + planoAlimentar + ", treino=" + treino
                + "]";
    }
    
    

    

}
