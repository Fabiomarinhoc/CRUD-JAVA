package ProjetoAcademia1;

import java.util.ArrayList;
import java.util.Random;

public class Alunos extends Pacotes {

	private static String plano2;

	ArrayList<Alunos> aluno = new ArrayList<>();

	private Integer codigo;
	private String nome;
	private Integer cpf;
	private Integer idade;
	private Float altura;
	private Boolean ativo;

	int value = 100;

	Random gerador = new Random();

	public int length;

	public Alunos(String nome, Integer cpf, Integer idade, Float altura, String plano) {
		super(plano);

		this.codigo = gerador.nextInt(100);
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.plano = plano;

	}

	public Alunos() {
		super(plano2);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodito(Integer codigo) {
		this.codigo = codigo;
	}

	public String nn(String nn) {
		this.setNome(nn);
		return this.getNome();

	}

	@Override
	public String toString() {
		return "Cod " + codigo + ", Nome " + nome + ", CPF " + cpf + ",Idade " + idade + ", Altura "
				+ String.format("%.2f", altura) + ", Plano:" + plano + ", Ativo " + ativo + "";
	}

}
