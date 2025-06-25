package entities;

import java.time.LocalDate;

import modelos.PlanoAcademia;
import modelos.PlanoAlimentar;
import modelos.Treino;

public class Aluno extends Pessoa {

    private PlanoAcademia planoAcademia;
    private PlanoAlimentar planoAlimentar;
    private Treino treino = new Treino();
   

    public Aluno(String name, LocalDate dataNascimento, long telefone, long cpf, Integer cep) {
    	 super(name, dataNascimento, telefone, cpf, cep);
    }

    public Aluno(String name, LocalDate dataNascimento, long telefone, long cpf, Integer cep,
            PlanoAcademia planoAcademia, PlanoAlimentar planoAlimentar, Treino treino) {
        super(name, dataNascimento, telefone, cpf, cep);
        this.planoAcademia = planoAcademia;
        this.planoAlimentar = planoAlimentar;
        this.treino = treino;
    }

    public void exibeMenu() {
    	System.out.println("\n================= MENU PRINCIPAL =================");
    	System.out.println("|                                                |");
    	System.out.println("|  1 - 📅 Agendar consulta com treinador         |");
    	System.out.println("|  2 - 🏋️ Agendar treino                         |");
    	System.out.println("|  3 - 📋 Visualizar plano de treino             |");
    	System.out.println("|  4 - 💳 Verificar Planos da Academia           |");
    	System.out.println("|  5 - 👤 Acessar dados pessoais                 |");
    	System.out.println("|  6 - 🥗 Visualizar plano alimentar             |");
    	System.out.println("|  7 - ❌ Sair                                   |");
    	System.out.println("|________________________________________________|");
    	System.out.print("Escolha uma opção: ");
    }

   

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
    
    public void planoTreino() {
    	if(treino.getListaExercicio().isEmpty() && treino.getListaExCompleto().isEmpty()) {
    		System.out.println("Você ainda não possui treino!");
    		System.out.println("Deseja um treino completo? (s/n)");
    		
    	}else {
    		treino.listarExercicio();
    	}
    }
    public void treinoCompleto() {
    	String completo = """
    	🏋️ Seu treino completo fica da seguinte maneira:
    	--------------------------------------------------
    	1️⃣  3 x Voador                    | Repetições: 15"
    	2️⃣  4 x Supino                    | Repetições: 12"
    	3️⃣  3 x Remada                    | Repetições: 15"
    	4️⃣  4 x Puxada Fechada Supinada   | Repetições: 12"
    	5️⃣  4 x Desenvolvimento           | Repetições: 15"
    	6️⃣  4 x Encolhimento              | Repetições: 12"
    	7️⃣  3 x LegPress                  | Repetições: 15"
    	8️⃣  4 x Agachamento Hack          | Repetições: 12"
    	9️⃣  4 x Rosca Direta Barra        | Repetições: 15"
    	🔟  4 x Abdominal                 | Repetições: 30"
    	--------------------------------------------------
    	""";
    	System.out.println(completo);
    			
    	treino.adicionarExercicioCompleto(completo);
    	
    }




    @Override
    public String toString() {
        return "Aluno: " + name + " | " + calcularIdade() + " anos | Celular: " +  telefone + " | CEP: " + cep;
               
    }
    
    

    

}