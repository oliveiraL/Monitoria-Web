package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dominio.Entity;

@Stateless
public class DAO <T>{
	@PersistenceContext
	private EntityManager em;
	
	private Class<T> genericType;
	/**
	 * Metodo para persistir o objeto em banco
	 * @param obj
	 */
	public void salvar(T obj){
		em.persist(obj);
	}
	
	public void atualizar(T obj) {
		em.merge(obj);
	}
	
	public void remover(T obj) {
		em.remove(obj);
	}
	
	public Query getQuey(String hql){
		return  em.createQuery(hql);
	}
	@SuppressWarnings("unchecked")
	public List<T> list() {
		String qs = "select * from "+genericType.getName();
		Query q = getQuey(qs);
		return (List<T>) q.getResultList();
	}
	
	public T findById(Entity obj) {
		return (T) em.find(genericType, obj.getId());
	}
	
}
