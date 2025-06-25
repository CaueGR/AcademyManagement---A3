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
import verificacao.Login;
import verificacao.Registro;
import modelos.Treino;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		Registro registro = new Registro();
		registro.notNull();
        Treino treino = new Treino();
		Login login = new Login(registro);
		Aluno aluno = null;
        PlanoAlimentar planoAlimentar = new PlanoAlimentar();
		PlanoAcademia planoAcad = new PlanoAcademia();
        int sair = 7;
		String email = null;

		linha();
		System.out.println("            BEM-VINDO AO SISTEMA            ");
		linha();

		System.out.print("Você é aluno? (s/n): ");
		char entidade = sc.next().charAt(0);

		
		if(entidade == 'n') {
            System.out.print("Treinador/Adm?(T/A) "); 
            char trA = sc.next().charAt(0);
            
            if(trA == 't'){
                Treinador treinador = new Treinador(null, null, null, null, null, null, null);
                linha();
                System.out.println(" Realize seu login ");

                System.out.println("Email: ");
                String emailTreinador = sc.nextLine();
                sc.nextLine();

                System.out.println("Senha: ");
                String senhaTreinador = sc.nextLine();
                sc.nextLine();

                linha();
                int opcaoTreinador = 0;
                while(opcaoTreinador != 5){
                    treinador.exibeMenu();
                    opcaoTreinador = sc.nextInt();

                    if(opcaoTreinador == 1){

                        linha();
                        System.out.println("Quantos exercícios serão atribuídos? ");
                        int numeroExercicios = sc.nextInt();
                        sc.nextLine();

                        linha();

                        for(int i = 0; i < numeroExercicios; i++){
                        System.out.println("Digite o nome do exercício: ");
                        String nomeExercicio = sc.nextLine();
                        sc.nextLine();

                        System.out.println("Digite qual o grupo muscular: ");
                        String grupoMuscular = sc.nextLine();
                        sc.nextLine();

                        System.out.println("Digite o número de séries: ");
                        int series = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Digite o número de repetições: ");
                        int repeticoes = sc.nextInt();
                        sc.nextLine();

                        Exercicio exercicio = new Exercicio(nomeExercicio, grupoMuscular, repeticoes, series);
                        treino.adicionarExercicio(exercicio);

                        }
                        System.out.println("✅ Treino adicionado com sucesso!");
                        linha();
                    }
                    else if(opcaoTreinador == 2){
                        linha();
                        System.out.println("Quantas refeições serão atribuídas? ");
                        int numeroRefeições = sc.nextInt();
                        sc.nextLine();
                        linha();

                        for(int i = 0; i < numeroRefeições; i++){
                            System.out.println("Digite a refeição: ");
                            String nomeRefeicao = sc.nextLine();
                            sc.nextLine();

                            System.out.println("Digite a descricao da refeição: ");
                            String descricaoRefeicao = sc.nextLine();
                            sc.nextLine();

                            System.out.println("Digite o número de calorias: ");
                            Double calorias = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("Digite o horário dessa refeição: ");
                            String horarioRefeicao = sc.nextLine();
                            sc.nextLine();

                            Refeicao refeicao = new Refeicao(nomeRefeicao, descricaoRefeicao, calorias, horarioRefeicao);
                            planoAlimentar.adicionarRefeicao(refeicao);
                        }
                        System.out.println("✅ Plano alimentar adicionado com sucesso!");
                        linha();

                    }else if(opcaoTreinador == 3){
                        linha();
                        treino.listarExercicio();
                        linha();
                    }
                    else if(opcaoTreinador == 4){
                        linha();
                        planoAlimentar.listarRefeicao();
                        linha();
                    }
                    else if(opcaoTreinador == 5){
                        linha();
                        treino.listarExercicio();
                        System.out.println("Escolha qual o número do exércicio que deseja remover: ");
                        System.out.println("(Os exercícios estão em ordem crescente de cima para baixo iniciando pelo 0)");
                        int codigo = sc.nextInt();
                        treino.removerExercicio(codigo);
                        linha();
                    }
                    else if(opcaoTreinador == 6){
                        linha();
                        planoAlimentar.listarRefeicao();
                        System.out.println("Escolha qual o número da refeição que deseja remover: ");
                        System.out.println("(As refeições estão em ordem crescente de cima para baixo iniciando pelo 0!)");
                        int codigo = sc.nextInt();
                        planoAlimentar.removerRefeicao(codigo);
                        linha();
                    }
                    else if(opcaoTreinador == 7){
                        System.out.println("Obrigado, volte sempre!");
                        System.exit(0);
                    }else{
                        System.out.println("Opção inválida!");
                    }
            }

            }else if(trA == 'a'){
                
                linha();
                System.out.println("Digite seu número de acesso: ");
                int numeroAcesso = sc.nextInt();
                sc.nextLine();

                System.out.println("Digite sua senha de acesso: ");
                String senhaAdm = sc.nextLine();
                sc.nextLine();

                System.out.println("Digite seu nome: ");
                String nomeAdm = sc.nextLine();
                sc.nextLine();
                linha();

                Adm adm = new Adm(nomeAdm, numeroAcesso, senhaAdm);
                
                adm.exibeMenu();
                int opcaoAdm = sc.nextInt();

                
            }
        }
        

		linha();
		System.out.println("Já possui o cadastro? (S/N)");
		char jaPossuiCadastro = sc.next().charAt(0);

		if (jaPossuiCadastro == 's') {
			linha();
			login.autenticar();
			linha();

		} else if (jaPossuiCadastro == 'n') {
			linha();
			System.out.println("= CADASTRO DE NOVO USUÁRIO =");
			linha();
			sc.nextLine();
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

				if (confirmar == 1) {
					aluno.setPlanoAcademia(planoEscolhido);
					System.out.println("✅ Plano confirmado com sucesso!");
					confirmado = true;
				}
			}

			registro.cadastrarUsuario(email, senha);
			registro.confirmarSenha(confirmaSenha, senha);
			login.autenticar();

		}

		if (entidade == 's') {
            int escolha = 0;
            while(escolha != 7){
			    aluno.exibeMenu();
			    escolha = sc.nextInt();
			    if (escolha == 1) {
				linha();
				System.out.println("🗓️  AGENDAMENTO DE CONSULTA COM TREINADOR");
				linha();

				sc.nextLine();
				System.out.print("Informe a data desejada (dd/MM/yyyy): ");
				String dataConsultaTreinador = sc.nextLine();

				DateTimeFormatter formatoConsultaTreinador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate consultaTreinador = LocalDate.parse(dataConsultaTreinador, formatoConsultaTreinador);

				System.out.print("Informe o horário desejado (ex: 14:30): ");
				String horarioConsulta = sc.nextLine();

				linha();
				System.out.printf("✅ Consulta agendada para %s às %s.\n", consultaTreinador, horarioConsulta);
				linha();

			    } else if (escolha == 2) {

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
			    } else if (escolha == 3) {

                    aluno.planoTreino();
                    char yORn = sc.next().charAt(0);
                    if (yORn == 's') {
                        aluno.treinoCompleto();
                    }
			    } // apagar

			else if (escolha == 4) {
				System.out.println(aluno.getPlanoAcademia());
			}
			else if(escolha == 5) {
				System.out.println("===== DADOS PESSOAIS =====");
				System.out.println("Nome: " + aluno.getName());
				System.out.println("CEP: " + aluno.getCep());
				System.out.println("Email: " + registro.getEmails());
				System.out.println("Senha: " + registro.getSenhas());
				System.out.println("CPF: " + aluno.getCpf());
				System.out.println("Telefone: " + aluno.getTelefone());
				System.out.println("Data de Nascimento: " + aluno.getDataNascimento());

				System.out.println("\nDeseja alterar alguma informação?");
				System.out.println("Atenção: Para alterar os outros dados, entre em contato com a sua unidade de cadastro.");
				System.out.println("1 - Alterar Email");
				System.out.println("2 - Alterar Senha");
				System.out.println("3 - Sair");
				System.out.print("Digite a opção desejada: ");

				int opcaoDadosPessoais = sc.nextInt();
				sc.nextLine(); // Limpar o \n pendente

				switch (opcaoDadosPessoais) {
				    case 1:
				        System.out.print("Digite o novo email: ");
				        String novoEmail = sc.nextLine();
				        registro.alterarEmail(email, novoEmail);
				        System.out.println("Email atualizado com sucesso!");
				        break;

				    case 2:
				        System.out.print("Digite a nova senha: ");
				        String novaSenha = sc.nextLine();
				        registro.alterarSenha(email, novaSenha);
				        System.out.println("Senha atualizada com sucesso!");
				        break;

				    case 3:
				        System.out.println("Retornando ao menu...");
				        break;

				    default:
				        System.out.println("Opção inválida. Retornando ao menu...");
				        break;
				}
			}else if(escolha == 6) {
                 planoAlimentar.listarRefeicao();
            }
            //else if(escolha == 7){ 
                //caso queira voltar para o login
                //}   
            else if(escolha == sair) { 
                linha();
                System.out.println(" =-= Obrigado volte sempre! =-= ");
                linha();
            }
            else if(escolha > sair || escolha < 1) {
                System.out.println("Digite uma opção válida");
            }
		}
    }
         

    }

	public static void linha() {
		System.out.println("==================================================");
	}

	private static void mostrarPlano(PlanoAcademia plano) {
		System.out.println("""
				\n📦 Plano Selecionado:
				-----------------------------------
				""");
		System.out.println(plano);
		System.out.println("-----------------------------------");
	}
}

