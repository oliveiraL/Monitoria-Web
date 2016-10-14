package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import service.Service;

@ManagedBean
@SessionScoped
public class MBean <T>{
	private T obj;
	
	private DataModel<T> listagem;
	
	private Service<T> service;
	
	public MBean() {
		// TODO Auto-generated constructor stub
	}
	
	public void salvar(){
		service.salvar(obj);
	}
	
	public void atualizar(T obj) {
		service.atualizar(obj);
	}
	
	public void remover(T obj) {
		service.remover(obj);
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public DataModel<T> getListagem() {
		return listagem = new ListDataModel<>(service.list());
	}

	public void setListagem(DataModel<T> listagem) {
		this.listagem = listagem;
	}
}
