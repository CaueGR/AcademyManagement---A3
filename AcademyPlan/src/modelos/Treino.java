package modelos;

import java.util.ArrayList;

public class Treino {
	private ArrayList<Exercicio> listaExercicio = new ArrayList<>();
	private ArrayList<String> listaExCompleto = new ArrayList<>();

	public Treino() {
		
	}

	public ArrayList<String> getListaExCompleto() {
		return listaExCompleto;
	}

	public ArrayList<Exercicio> getListaExercicio() {
		return listaExercicio;
	}

	public void setListaExercicio(ArrayList<Exercicio> listaExercicio) {
		this.listaExercicio = listaExercicio;
	}

	public void adicionarExercicio(Exercicio exercicio) {
		this.listaExercicio.add(exercicio);
		System.out.println("Exercício adicionado com sucesso: " + exercicio);
	}

	public void adicionarExercicioCompleto(String completo) {
		this.listaExCompleto.add(completo);
		System.out.println("Exercício adicionado com sucesso!");
	}

	public void listarExercicio() {
		if (this.listaExercicio.isEmpty() && this.listaExCompleto.isEmpty()) {
			System.out.println("Nenhum exercício no treino.");
		} else if (!listaExercicio.isEmpty()) {
			System.out.println("Lista de exercícios do treino:");
			for (Exercicio ex : listaExercicio) {
				System.out.println(" - " + ex);
			}
		} else {
			System.out.println("Lista de exercício completa: ");
			for (String ex : listaExCompleto) {
				System.out.println(" - " + ex);
			}
		}
	}
}
