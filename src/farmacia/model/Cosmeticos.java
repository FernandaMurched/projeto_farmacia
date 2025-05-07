package farmacia.model;

//Classe Cosmetico herda da classe Produto, a SuperClasse //
public class Cosmeticos extends Produto {
	
	// Atributo exclusivo da classe Cosmeticos //
	private String fragrancia;
	
	// Construtor que inicializa todos os atributos, inclusive os herdados //
	public Cosmeticos(int id, String nome, int tipo, float preco, String fragrancia) {
		// Chama o construtor da SuperClasse Produto
		super(id, nome, tipo, preco);
		this.setFragrancia(fragrancia);
	}

	// Méotodo Get e Set do atributo exclusivo (genérico) //
	public String getFragrancia() {
		return fragrancia;
	}

	public void setFragrancia(String fragrancia) {
		this.fragrancia = fragrancia;
	}
	
	// Sobreescreve o método visualizar para visualizar a fragrancia //
	@Override
	public void visualizar() {
		super.visualizar(); // chamar o método da superclasse produto
		System.out.println("Fragrância: " + this.fragrancia);
	}

	
}
