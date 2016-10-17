package service;

import java.util.List;

import javax.inject.Inject;

import dao.DAO;
import dominio.Entity;

/**
 * 
 * @author luciosoares
 *	Classe generica para regras de negocios
 * @param <T>
 */
public class Service <T> {
	@Inject private DAO<T> dao;
	
	public void salvar(T obj){
		dao.salvar(obj);
	}
	
	public void atualizar(T obj) {
		dao.atualizar(obj);
	}
	
	public void remover(T obj) {
		dao.remover(obj);
	}
	
	public List<T> list() {
		return dao.list();
	}
	
	public T findById(Entity obj) {
		return dao.findById(obj);
	}
}
