package farmacia.model;

public class Produto {
	// Atributos comuns a todos os produtos
	private int id;
	private String nome;
	private int tipo; // 1 - Medicamento | 2 - Cosmético
	private int quantidade;
	private float preco;

	// Método Construtor
	public Produto(int id, String nome, int tipo, int quantidade, float preco) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	// Métodos get e set
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preço: R$ " + preco);
		System.out.println("-------------------------------------");
	}
}
