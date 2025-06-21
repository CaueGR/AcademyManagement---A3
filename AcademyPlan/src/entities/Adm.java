package entities;

import java.time.LocalDate;

import Interfaces.GerenciamentoPlano;

public class Adm extends Pessoa implements GerenciamentoPlano{

    private Integer numeroAcesso;
    private String senhaAdm;

    

    

    public Adm(String name, LocalDate dataNascimento, Long telefone, Long cpf, Integer cep, Integer numeroAcesso,
            String senhaAdm) {
        super(name, dataNascimento, telefone, cpf, cep);
        this.numeroAcesso = numeroAcesso;
        this.senhaAdm = senhaAdm;
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