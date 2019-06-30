package br.com.trabalho.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.trabalho.model.Produto;
import br.com.trabalho.util.HibernateUtil;

public class ProdutoDAOImp implements ProdutoDAO {

	@Override
	public void save(Produto produto) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(produto);
		t.commit();
		
	}

	@Override
	public Produto getProduto(Long codigo) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		
		return (Produto) session.load(Produto.class, codigo);//ou criar a query
	}

	@Override
	public void remove(Produto produto) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(produto);
		t.commit();
		
	}

	@Override
	public void update(Produto produto) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(produto);
		t.commit();
		
	}

	@Override
	public List<Produto> list() {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction t = session.beginTransaction();
		List<Produto> lista = session.createQuery("from Produto").list();
		t.commit();
		return lista;
	}

}
