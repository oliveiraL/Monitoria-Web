package dominio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Classe de dominio Aluno
 * 
 * @author Fernanda Chacon
 *
 */

@Entity
@Table(name="aluno")
public class Aluno {
	
	/**
	 * Atributo identificador da classe Aluno 
	 */
	@Id
	@Column(name="id_aluno", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Atributo que guarda a matricula do Aluno
	 */
	
	@Column
	private String matricula;
	
	/**
	 * Atributo que guarda o curso do Aluno
	 */
	@Column
	private String curso;
	
	
	/**
	 * Atributo que guarda a Pessoa do Aluno
	 */
	@OneToOne
	@JoinColumn(name="pessoa_id")
	private Pessoa pessoa;
	
	/**
	 * Atributo que guarda a Usuario do aluno
	 */
	@OneToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario;

	/**
	 * Construtor padr�o da classe
	 */
	public Aluno(){
		
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	

}
