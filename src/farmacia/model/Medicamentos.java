package farmacia.model;

// Classe Medicamentos herda da classe Produto, a SuperClasse //
public class Medicamentos extends Produto {

	// Atributo exclusivo da classe Medicamento //
	private String generico;

	// Construtor que inicializa todos os atributos, inclusive os herdados //
	public Medicamentos(int id, String nome, int tipo, float preco, String generico) {
		
		// Chama o construtor da SuperClasse Produto //
		super(id, nome, tipo, preco);
		this.generico = generico;
	}

	// Méotodo Get e Set do atributo exclusivo (genérico) //
	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
	}

	// Sobreescreve o método visualizar para adicionar dados de genérico //
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Genérico: " + this.generico);
	}
}
