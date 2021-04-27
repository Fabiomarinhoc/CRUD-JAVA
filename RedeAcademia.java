package ProjetoAcademia1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entidade.Alunos;

public class RedeAcademia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<Alunos> aluno = new ArrayList<>();
		
		
		Alunos cadastro = new Alunos();
		

		

		int n;
		int somaatv = 0;
		int somainat = 0;
		int totgeral = 0;

		System.out.println("Sistema acadêmia");
		System.out.println("----------------");
		System.out.println("   ----------");
		System.out.println("     ------");
		System.out.println("O que deseja fazer? 1 cadastrar, 2 alterar, 3 excluir, 4 Listar e 0 para sair");
		n = sc.nextInt();

		while (n != 0) {

			if (n == 1) {

				System.out.println("Digite o nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.println("Digite o cpf: ");
				Integer cpf = sc.nextInt();
				System.out.println("Digite a idade: ");
				Integer idade = sc.nextInt();
				System.out.println("Digite sua altura: ");
				Float altura = sc.nextFloat();
				System.out.println("Escolha seu Plano, A OU B?");
				String pl = sc.next();

				cadastro = new Alunos(nome, cpf, idade, altura, pl);

				System.out.println("Aluno ativo? s/n");
				String resp = sc.next();

				if (resp.equals("s")) {

					cadastro.setAtivo(true);
					somaatv = somaatv + 1;

				} else {

					cadastro.setAtivo(false);
					somainat = somainat + 1;

				}

				if (pl.equals("a")) {
					cadastro.setPlano("A");
				} else if (pl.equals("b")) {
					cadastro.setPlano("B");

				} else {
					cadastro.setPlano("invalido");
				}

				aluno.add(cadastro);

				totgeral = totgeral + 1;
				System.out.println("Cadastro concluido com sucesso!");

			} else if (n == 2) {
				System.out.println("Digite um código para alterar ");
				Integer codigo = sc.nextInt();

				Alunos cod = aluno.stream().filter(nome -> nome.getCodigo() == codigo).findFirst().orElse(null);

				if (cod != null) {
					System.out.println("Digite um nome novo: ");
					sc.nextLine();
					String nn = sc.nextLine();

					cadastro.nn(nn);

				} else {
					System.out.println("Número inexistente: ");

				}

			} else if (n == 3) {
				System.out.println("Digite um código para excluir ");
				Integer codigo = sc.nextInt();

				Alunos cod = aluno.stream().filter(nome -> nome.getCodigo() == codigo).findFirst().orElse(null);

				if (cod != null) {

					aluno.remove(cod);
					System.out.println("Excluido com sucesso");

				} else {
					System.out.println("Codigo inválido");

				}

			} else if (n == 4) {

				for (Alunos al : aluno) {

					System.out.println(al);
			

				}
				System.out.println("Número de cadastro ativos: " + somaatv);
				System.out.println("Número de cadastro inativos: " + somainat);
				System.out.println("Total geral: " + totgeral);

			}

			System.out.println("-------------------------------------------------------------------------------");
			System.out.println(" ----------------------------------------------------------------------------");
			System.out.println("  --------------------------------------------------------------------------");
			System.out.println(" O que deseja fazer? 1 cadastrar, 2 alterar, 3 excluir, 4 Listar e 0 para sair ");
			n = sc.nextInt();

		}

		System.out.println("Obrigado por utilizar nossos serviços ");
		sc.close();
	}
}
