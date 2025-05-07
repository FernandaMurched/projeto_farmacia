package farmacia.controller;

import java.util.ArrayList;

import farmacia.model.Produto;
import farmacia.repository.farmaciarepository;

public class farmaciacontroller implements farmaciarepository {

	private ArrayList<Produto> produtosCadastrados = new ArrayList<Produto>();
	int id = 0;
	
	@Override
	public void criarProduto(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodosProdutos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultarProdutoPorId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarProduto(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deletarProduto(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
