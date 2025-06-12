package modelos;

import java.util.ArrayList;

public class PlanoAlimentar {
	private ArrayList<Refeicao> listaRefeicao;
	
	public PlanoAlimentar() {
		listaRefeicao = new ArrayList<>();
	}
	
	public void adicionarRefeicao(Refeicao refeicao) {
		listaRefeicao.add(refeicao);
		System.out.println("Refeicao adicionado com sucesso: " + refeicao);
	}

	public void removerRefeicao(Refeicao codigo) {
		listaRefeicao.remove(codigo);
		System.out.println("Refeicao excluida com sucesso: " + codigo);
	}
	public void listarExercicio() {
		 if (listaRefeicao.isEmpty()) {
	         System.out.println("Nenhum exercício no treino.");
	     } else {
	         System.out.println("Lista de exercícios do treino:");
	         for (Refeicao rf : listaRefeicao) {
	             System.out.println(" - " + rf);
	         }
	     }
	}

	
	
}
