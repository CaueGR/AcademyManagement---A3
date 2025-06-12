package entities;

public class Treinador {

    private String especializacao;
    private String disponibilidade;
    
    public Treinador(String especializacao, String disponibilidade) {
        this.especializacao = especializacao;
        this.disponibilidade = disponibilidade;
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
    public String toString() {
        return "Treinador [especializacao=" + especializacao + ", disponibilidade=" + disponibilidade + "]";
    }

    

    
    
}
