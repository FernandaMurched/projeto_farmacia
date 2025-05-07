package farmacia.model;

// Classe abstrata que serve como base para Medicamentos e Cosméticos (SuperClasse) //
public abstract class Produto {

	// Atributos comuns a todos os produtos
	private int id;
	private String nome;
	private int tipo; // 1 - Medicamento | 2 - Cosmético
	private float preco;

	// Método Construtor que vai inicializar os atributos //
	public Produto(int id, String nome, int tipo, float preco) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
	}

	// Métodos get e set para acessar e/ou modificar os atributos //
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	// Método para exibir os dados do produto
	public void visualizar() {
		String tipoProduto = (tipo == 1) ? "Medicamento" : "Cosmético";

		System.out.println("\n-------------------------------------");
		System.out.println("ID: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipoProduto);
		System.out.println("Preço: R$ " + preco);
		System.out.println("-------------------------------------");
	}
}
