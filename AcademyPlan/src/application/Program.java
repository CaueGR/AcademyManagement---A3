package application;

import java.util.Locale;
import java.util.Scanner;

import modelos.Exercicio;
import modelos.Treino;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			
		/* System.out.print("Nome: ");
         String nome = sc.nextLine();

         System.out.print("Data de nascimento (dd/MM/yyyy): ");
         String dataTexto = sc.nextLine();

         System.out.println("Telefone: ");
         Integer telefone = sc.nextInt();
         
         System.out.println("cpf: ");
         Integer cpf = sc.nextInt();
         System.out.println("cep");
         Integer cep = sc.nextInt();
         
         // Conversão da String para LocalDate
         DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         LocalDate dataNascimento = LocalDate.parse(dataTexto, formato);
         
         Pessoa p = new Pessoa(nome, dataNascimento, telefone, cpf, cep);
         
         System.out.println(p.getTelefone());
         p.setTelefone(8888);
         System.out.println(p.getTelefone());
         System.out.println(p.getDataNascimento());
         System.out.println(p.calcularIdade());         
         System.out.println(p.getTelefone());
         */
		
         // INFORMAÇÕES DO USUÁRIO (CLASSE PESSOA)

		System.out.println("nome: ");
		String nome = sc.nextLine();
		System.out.println("Grupo Muscular: ");
		String gM = sc.nextLine();
		System.out.println("Repetições: ");
		Integer r = sc.nextInt();
		System.out.println("Series: ");
		Integer s = sc.nextInt();
		Treino t = new Treino();
		Exercicio e = new Exercicio(nome, gM, r, s);


        System.out.println("Digite a opção desejada:\n1- Opção1");
		
		t.adicionarExercicio(e);
		
		t.listarExercicio();
		sc.close();

	}

}
