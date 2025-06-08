package modelos;

import java.util.ArrayList;

public class Treino {
private ArrayList<Exercicio> listaExercicio;

public Treino() {
	listaExercicio = new ArrayList<>();
}

public ArrayList<Exercicio> getListaExercicio() {
	return listaExercicio;
}

public void setListaExercicio(ArrayList<Exercicio> listaExercicio) {
	this.listaExercicio = listaExercicio;
}

public void adicionarExercicio(Exercicio exercicio) {
	listaExercicio.add(exercicio);
	System.out.println("Exercício adicionado com sucesso: " + exercicio);
}

public void listarExercicio() {
	 if (listaExercicio.isEmpty()) {
         System.out.println("Nenhum exercício no treino.");
     } else {
         System.out.println("Lista de exercícios do treino:");
         for (Exercicio ex : listaExercicio) {
             System.out.println(" - " + ex);
         }
     }
}


}
