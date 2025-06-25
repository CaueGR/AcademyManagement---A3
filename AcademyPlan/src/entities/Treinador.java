package entities;

import java.time.LocalDate;

import Interfaces.GerenciamentoPlano;
import modelos.PlanoAcademia;

public class Treinador extends Pessoa implements GerenciamentoPlano {

    private String especializacao;
    private String disponibilidade;


    public Treinador(String name, LocalDate dataNascimento, Long telefone, Long cpf, Integer cep,
            String especializacao, String disponibilidade) {
        super(name, dataNascimento, telefone, cpf, cep);
        this.especializacao = especializacao;
        this.disponibilidade = disponibilidade;
    }

    public void exibeMenu() {
    	System.out.println("\n================= MENU PRINCIPAL =================");
    	System.out.println("|                                                |");
    	System.out.println("|  1 - 📅 Visualizar agenda pessoal              |");
    	System.out.println("|  2 - 🏋️ Visualizar lista de alunos             |");
    	System.out.println("|  3 - 📋 Construir treino                       |");
    	System.out.println("|  4 - 💳 Construir plano alimentar              |");
    	System.out.println("|  5 - ❌ Sair                                   |");
    	System.out.println("|________________________________________________|");
    	System.out.print("Escolha uma opção: ");
    }

    

    public String getEspecializacao() {
        return especializacao;
    }



    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }



    public String getDisponibilidade() {
        return disponibilidade;
    }



    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }



    @Override
    public void criarPlanoAcademia() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void criarPlanoAlimentar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void editarPlanoAcademia() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void editarPlanoAlimentar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void excluirPlanoAcademia() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void excluirPlanoAliementar() {
        // TODO Auto-generated method stub
        
    }

    

    

    
    
}