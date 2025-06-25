package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Adm;
import entities.Aluno;
import entities.Treinador;
import modelos.Exercicio;
import modelos.PlanoAcademia;
import modelos.PlanoAlimentar;
import modelos.Refeicao;
import modelos.Treino;
import verificacao.Login;
import verificacao.Registro;

public class Program {

	public static void main(String[] args) {

		// INICIALIZAÇÃO DE OBJETOS
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Registro registro = new Registro();
		registro.notNull();
		Login login = new Login(registro);
		Treino treino = new Treino();
		PlanoAlimentar planoAlimentar = new PlanoAlimentar();
		PlanoAcademia planoAcad = new PlanoAcademia();
		Aluno aluno = null;
		String email = null;
		final int SAIR = 7;

		linha();
		System.out.println("            BEM-VINDO AO SISTEMA            ");
		linha();

		System.out.print("Você é aluno? (s/n): ");
		char entidade = sc.next().toLowerCase().charAt(0);
		sc.nextLine();

		if (entidade == 'n') {
			System.out.print("Treinador/Adm? (T/A): ");
			char tra = sc.next().toLowerCase().charAt(0);
			sc.nextLine();

			// TREINADOR
			if (tra == 't') {
				Treinador treinador = new Treinador();
				linha();
				System.out.println(" Realize seu login ");

				System.out.print("Email: ");
				String emailTreinador = sc.nextLine();

				System.out.print("Senha: ");
				String senhaTreinador = sc.nextLine();

				int opcaoTreinador = 0;
				while (opcaoTreinador != SAIR) {
					treinador.exibeMenu();
					opcaoTreinador = sc.nextInt();
					sc.nextLine();

					switch (opcaoTreinador) {
					case 1 -> { // Adicionar exercício
						linha();
						System.out.print("Quantos exercícios deseja adicionar? ");
						int qtd = sc.nextInt();
						sc.nextLine();
						for (int i = 0; i < qtd; i++) {
							System.out.print("Nome do exercício: ");
							String nome = sc.nextLine();
							System.out.print("Grupo muscular: ");
							String grupo = sc.nextLine();
							System.out.print("Séries: ");
							int series = sc.nextInt();
							sc.nextLine();
							System.out.print("Repetições: ");
							int reps = sc.nextInt();
							sc.nextLine();
							treino.adicionarExercicio(new Exercicio(nome, grupo, reps, series));
						}
						System.out.println("✅ Treino adicionado com sucesso!");
					}
					case 2 -> { // Adicionar refeição
						linha();
						System.out.print("Quantas refeições deseja adicionar? ");
						int qtd = sc.nextInt();
						sc.nextLine();
						for (int i = 0; i < qtd; i++) {
							System.out.print("Nome da refeição: ");
							String nome = sc.nextLine();
							System.out.print("Descrição: ");
							String descricao = sc.nextLine();
							System.out.print("Calorias: ");
							double calorias = sc.nextDouble();
							sc.nextLine();
							System.out.print("Horário: ");
							String horario = sc.nextLine();
							planoAlimentar.adicionarRefeicao(new Refeicao(nome, descricao, calorias, horario));
						}
						System.out.println("✅ Plano alimentar adicionado com sucesso!");
					}
					case 3 -> treino.listarExercicio();
					case 4 -> planoAlimentar.listarRefeicao();
					case 5 -> {
						treino.listarExercicio();
						System.out.print("Número do exercício para remover: ");
						treino.removerExercicio(sc.nextInt());
						sc.nextLine();
					}
					case 6 -> {
						planoAlimentar.listarRefeicao();
						System.out.print("Número da refeição para remover: ");
						planoAlimentar.removerRefeicao(sc.nextInt());
						sc.nextLine();
					}
					case 7 -> System.out.println("Obrigado, volte sempre!");
					default -> System.out.println("Opção inválida.");
					}
				}
			}
			// ADM
			else if (tra == 'a') {
				Adm adm1 = new Adm("Admin", 2131, "@1234");
				linha();
				System.out.println("Digite seu número de acesso: ");
				int numeroAcesso = sc.nextInt();
				sc.nextLine();

				System.out.println("Digite sua senha de acesso: ");
				String senhaAdm = sc.nextLine();

				System.out.println("Digite seu nome: ");
				String nomeAdm = sc.nextLine();
				sc.nextLine();
				linha();
				while (adm1.getNumeroAcesso() != numeroAcesso) {
					System.out.println("Numero de acesso incorreto");
					System.out.println("Digite seu número de acesso: ");
					numeroAcesso = sc.nextInt();
					adm1.setNumeroAcesso(numeroAcesso);
					sc.nextLine();
				}

				String dataStringe = "25/12/2004";

				DateTimeFormatter formatoe = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate dataNascimentoe = LocalDate.parse(dataStringe, formatoe);

				aluno = new Aluno("Caue", dataNascimentoe, 984185065, 473756501, 91180090);

				dataStringe = "15/11/2005";

				dataNascimentoe = LocalDate.parse(dataStringe, formatoe);

				Aluno aluno2 = new Aluno("Kaua", dataNascimentoe, 984759023, 212433222, 91030080);
				registro.adicionarAlunoLista(aluno);
				registro.adicionarAlunoLista(aluno2);

				adm1.exibeMenu();
				int opcaoAdm = sc.nextInt();

				if (opcaoAdm == 1) {
					linha();
					System.out.println("= CADASTRO DE NOVO USUÁRIO =");
					linha();
					sc.nextLine();
					System.out.print("Nome: ");
					String nomeTreinador = sc.nextLine();

					System.out.print("Data de nascimento (dd/MM/yyyy): ");
					String dataString = sc.nextLine();

					System.out.print("Telefone: ");
					Long telefone = sc.nextLong();
					sc.nextLine();

					System.out.print("CPF: ");
					Long cpf = sc.nextLong();
					sc.nextLine();

					System.out.print("CEP: ");
					Integer cep = sc.nextInt();
					sc.nextLine();

					System.out.print("especializacao: ");
					String especializacao = sc.nextLine();

					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate dataNascimento = LocalDate.parse(dataString, formato);

					Treinador treind = new Treinador(nomeTreinador, dataNascimento, telefone, cpf, cep, especializacao,
							especializacao);

					linha();
					System.out.println("= CRIAÇÃO DE CONTA =");
					linha();
					System.out.print("Email: ");
					email = sc.next();
					sc.nextLine();
					System.out.print("Senha: ");
					String senha = sc.next();
					System.out.print("Confirme a senha: ");
					String confirmaSenha = sc.next();
					linha();
					registro.cadastrarTreinador(email, senha);
					registro.confirmarSenha(confirmaSenha, senha);
				}

				else if (opcaoAdm == 2) {
					registro.vizualizarListaAlunos();
				} else if (opcaoAdm == 3) {

					PlanoAcademia basico = new PlanoAcademia("Básico", 100.00,
							"✅ O plano Básico é ideal para quem quer dar o pontapé inicial sem pesar o bolso!");

					PlanoAcademia prime = new PlanoAcademia("Prime", 120.00,
							"🔥 Essa opção é para quem não tem medo de desafios!");

					PlanoAcademia vip = new PlanoAcademia("Vip", 140.00,
							"🏆 O nível máximo que você pode alcançar, para quem sabe onde quer chegar!");
					linha();
					System.out.println(basico);
					System.out.println("----------------------------------");
					System.out.println(prime);
					System.out.println("----------------------------------");
					System.out.println(vip);
					linha();
					System.out.println("""
							\n📋 Escolha qual plano deseja alterar valor:
							-------------------------------
							1️ - Básico
							2️ - Prime
							3️ - Vip
							-------------------------------
							""");
					int editplanos = sc.nextInt();

					switch (editplanos) {
					case 1:
						System.out.println("Para qual valor? ");
						basico.setPrice(sc.nextDouble());
						System.out.println("Valor Atualizado! ");
						System.out.println(basico);
						break;
					case 2:
						System.out.println("Para qual valor? ");
						prime.setPrice(sc.nextDouble());
						System.out.println("Valor Atualizado! ");
						System.out.println(prime);
						break;
					case 3:
						System.out.println("Para qual valor? ");
						vip.setPrice(sc.nextDouble());
						System.out.println("Valor Atualizado! ");
						System.out.println(vip);
						break;

					default:
						System.out.println("Insira um numero valido! ");
					}

				} else if (opcaoAdm == 4) {
					System.out.println("Até mais! ");
				}
			}

		}

		// Aluno
		else if (entidade == 's') {
			System.out.print("Você já possui cadastro? (s/n): ");
			char possuiCadastro = sc.next().toLowerCase().charAt(0);
			sc.nextLine();

			if (possuiCadastro == 's') {
				linha();
			} else {
				linha();
				System.out.println("= CADASTRO DE NOVO USUÁRIO =");
				linha();

				System.out.print("Nome: ");
				String nome = sc.nextLine();

				System.out.print("Data de nascimento (dd/MM/yyyy): ");
				String dataString = sc.nextLine();

				System.out.print("Telefone: ");
				Long telefone = sc.nextLong();
				sc.nextLine();

				System.out.print("CPF: ");
				Long cpf = sc.nextLong();
				sc.nextLine();

				System.out.print("CEP: ");
				Integer cep = sc.nextInt();
				sc.nextLine();

				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate dataNascimento = LocalDate.parse(dataString, formato);

				aluno = new Aluno(nome, dataNascimento, telefone, cpf, cep);

				linha();
				System.out.println("= CRIAÇÃO DE CONTA =");
				linha();

				System.out.print("Email: ");
				email = sc.next();
				sc.nextLine();

				System.out.print("Senha: ");
				String senha = sc.next();

				System.out.print("Confirme a senha: ");
				String confirmaSenha = sc.next();
				sc.nextLine();

				linha();
				System.out.println("= PLANO ACADEMIA =");

				boolean confirmado = false;
				while (!confirmado) {
					System.out.println("""
							\n📋 Escolha seu plano de academia:
							-------------------------------
							1️ - Básico
							2️ - Prime
							3️ - Vip
							-------------------------------
							""");

					int opcao = sc.nextInt();
					sc.nextLine();

					PlanoAcademia planoEscolhido = null;
					switch (opcao) {
					case 1 -> planoEscolhido = new PlanoAcademia("Básico", 100.00,
							"✅ O plano Básico é ideal para quem quer dar o pontapé inicial sem pesar o bolso!");
					case 2 -> planoEscolhido = new PlanoAcademia("Prime", 120.00,
							"🔥 Essa opção é para quem não tem medo de desafios!");
					case 3 -> planoEscolhido = new PlanoAcademia("Vip", 140.00,
							"🏆 O nível máximo que você pode alcançar, para quem sabe onde quer chegar!");
					default -> {
						System.out.println("❌ Opção inválida. Tente novamente.");
						continue;
					}
					}

					mostrarPlano(planoEscolhido);
					System.out.println("\nDeseja confirmar este plano?\n1️⃣ - Confirmar\n2️⃣ - Voltar");
					int confirmar = sc.nextInt();
					sc.nextLine();

					if (confirmar == 1) {
						aluno.setPlanoAcademia(planoEscolhido);
						System.out.println("✅ Plano confirmado com sucesso!");
						confirmado = true;
					}
				}

				registro.cadastrarUsuario(email, senha, aluno);
				registro.confirmarSenha(confirmaSenha, senha);
				login.autenticar(aluno);
			}

			// Menu do aluno
			int escolha = 0;
			while (escolha != 7) {
				aluno.exibeMenu();
				escolha = sc.nextInt();
				sc.nextLine();

				switch (escolha) {
				case 1 -> {
					linha();
					System.out.println("🗓️  AGENDAMENTO DE CONSULTA COM TREINADOR");
					linha();

					System.out.print("Informe a data desejada (dd/MM/yyyy): ");
					String dataConsultaTreinador = sc.nextLine();

					DateTimeFormatter formatoConsultaTreinador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate consultaTreinador = LocalDate.parse(dataConsultaTreinador, formatoConsultaTreinador);

					System.out.print("Informe o horário desejado (ex: 14:30): ");
					String horarioConsulta = sc.nextLine();

					linha();
					System.out.printf("✅ Consulta agendada para %s às %s.\n", consultaTreinador, horarioConsulta);
					linha();
				}
				case 2 -> {
					linha();
					System.out.println("🏋️  AGENDAMENTO DE TREINO");
					linha();

					System.out.print("Informe a data desejada (dd/MM/yyyy): ");
					String dataTreino = sc.nextLine();

					DateTimeFormatter formatoAgendamentoTreino = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate dataAgendamentoTreino = LocalDate.parse(dataTreino, formatoAgendamentoTreino);

					System.out.print("Informe o horário desejado (ex: 15:00): ");
					String horarioTreino = sc.nextLine();

					linha();
					System.out.printf("✅ Treino agendado para %s às %s.\n",
							dataAgendamentoTreino.format(formatoAgendamentoTreino), horarioTreino);
					linha();
				}
				case 3 -> {
					aluno.planoTreino();
					char yORn = sc.next().toLowerCase().charAt(0);
					sc.nextLine();
					if (yORn == 's') {
						aluno.treinoCompleto();
					}
				}
				case 4 -> System.out.println(aluno.getPlanoAcademia());

				case 5 -> {
					System.out.println("===== DADOS PESSOAIS =====");
					System.out.println("Nome: " + aluno.getName());
					System.out.println("CEP: " + aluno.getCep());
					System.out.println("Email: " + registro.getEmails());
					System.out.println("Senha: " + registro.getSenhas());
					System.out.println("CPF: " + aluno.getCpf());
					System.out.println("Telefone: " + aluno.getTelefone());
					System.out.println("Data de Nascimento: " + aluno.getDataNascimento());

					System.out.println("\nDeseja alterar alguma informação?");
					System.out.println(
							"Atenção: Para alterar os outros dados, entre em contato com a sua unidade de cadastro.");
					System.out.println("1 - Alterar Email");
					System.out.println("2 - Alterar Senha");
					System.out.println("3 - Sair");
					System.out.print("Digite a opção desejada: ");

					int opcaoDadosPessoais = sc.nextInt();
					sc.nextLine();

					switch (opcaoDadosPessoais) {
					case 1 -> {
						System.out.print("Digite o novo email: ");
						String novoEmail = sc.nextLine();
						registro.alterarEmail(email, novoEmail);
						System.out.println("Email atualizado com sucesso!");
					}
					case 2 -> {
						System.out.print("Digite a nova senha: ");
						String novaSenha = sc.nextLine();
						registro.alterarSenha(email, novaSenha);
						System.out.println("Senha atualizada com sucesso!");
					}
					case 3 -> System.out.println("Retornando ao menu...");
					default -> System.out.println("Opção inválida. Retornando ao menu...");
					}
				}
				case 6 -> planoAlimentar.listarRefeicao();

				case 7 -> {
					linha();
					System.out.println(" =-= Obrigado volte sempre! =-= ");
					linha();
				}
				default -> System.out.println("Digite uma opção válida");
				}
			}
		}

		sc.close();
	}

	public static void linha() {
		System.out.println("==================================================");
	}

	public static void mostrarPlano(PlanoAcademia plano) {
		System.out.println("\n📦 Plano Selecionado:");
		System.out.println("-----------------------------------");
		System.out.println(plano);
		System.out.println("-----------------------------------");
	}
}