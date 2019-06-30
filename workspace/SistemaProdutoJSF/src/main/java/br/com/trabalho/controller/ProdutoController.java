package br.com.trabalho.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.trabalho.dao.ProdutoDAO;
import br.com.trabalho.dao.ProdutoDAOImp;
import br.com.trabalho.model.Produto;

@ManagedBean
@SessionScoped
public class ProdutoController {
	private Produto produto;
	
	private DataModel<Produto> listaProduto;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public String prepararAdicionarProduto() {
		produto = new Produto();
		return "gerenciarProduto";
	}
	
	public String editar(Produto produto) {
	   this.produto = produto; 
	   return "alterarProduto"; 
	}
	
	public DataModel<Produto> getListarProduto(){
		List<Produto> lista = new ProdutoDAOImp().list();
		listaProduto= new ListDataModel<Produto>(lista);
		return listaProduto;
	}
	
	public String excluirProduto(Produto produto) {
		ProdutoDAO dao = new ProdutoDAOImp();
		dao.remove(produto);
		return "index";
	}
	
	public String adicionarProduto() {
		ProdutoDAO dao = new ProdutoDAOImp();
		dao.save(produto);
		return "index";
	}
	
	public String alterarProduto() {
		ProdutoDAO dao = new ProdutoDAOImp();
		dao.update(produto);
		return "index";
	}
	
	public String voltar(){
		return "index";
	}
}
