package farmacia.controller;

import java.util.ArrayList;
import java.util.Scanner;

import farmacia.model.Produto;
import farmacia.repository.farmaciarepository;

public class farmaciacontroller implements farmaciarepository {

	private ArrayList<Produto> produtosCadastrados = new ArrayList<Produto>();
	int id = 0;
	Scanner leia = new Scanner(System.in);

	// Cadastramento de produtos //
	@Override
	public void criarProduto(Produto produto) {
		produtosCadastrados.add(produto);
		System.out.println("\nO produto " + produto.getNome() + " foi cadastrado com sucesso!");
	}

	// Lista os produtos //
	@Override
	public void listarTodosProdutos() {
		if (produtosCadastrados.isEmpty()) {
			System.out.println("\nNão há nenhum produto cadastrado na lista.");
		} else {
			System.out.println("\nLista de produtos cadastrados:");
			for (var produto : produtosCadastrados) {
				produto.visualizar();
			}
		}
	}

	// Consulta os produtos //
	@Override
	public void consultarProdutoPorId(int id) {
		var produto = buscarNaCollection(id);

		if (produto != null) {
			System.out.println("\nProduto encontrado:");
			produto.visualizar();
		} else {
			System.out.println("\nNenhum produto encontrado com o ID " + id + ".");
		}
	}

	// Atualiza os produtos //
	@Override
	public void atualizarProduto(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getId());

		if (buscaProduto != null) {
			produtosCadastrados.set(produtosCadastrados.indexOf(buscaProduto), produto);
			System.out.println("\nProduto ID " + produto.getId() + " atualizado com sucesso!");
		} else {
			System.out.println("\nProduto não encontrado para atualização.");
		}
	}

	// Remove os produtos
	@Override
	public boolean deletarProduto(int id) {
	    var produto = buscarNaCollection(id);

	    if (produto != null) {
	        produtosCadastrados.remove(produto);
	        System.out.println("Produto excluído com sucesso.");
	        return true;
	    } else {
	        System.out.println("\nProduto não encontrado.");
	        return false;
	    }
	}
	
	// Gera o próximo ID 
	public int gerarNumero() {
		return ++id;
	}

	// Busca um produto na lista por ID
	public Produto buscarNaCollection(int id) {
		for (var produto : produtosCadastrados) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
}