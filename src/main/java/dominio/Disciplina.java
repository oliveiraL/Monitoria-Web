package dominio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="disciplina")
public class Disciplina {
	
	/**
	 * Atributo identificador da classe Disciplina
	 */
	@Id
	@Column(name="id_disciplina", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Atributo que guarda o codigo da disciplina
	 */
	@Column
	private String codigo;
	
	/**
	 * Atributo que guarda o nome da disciplina
	 */
	@Column
	private String nome;
	
	/**
	 * Atributo que guarda o curso da disciplina
	 */
	@Column
	private String curso;
	
	/**
	 * Atibuto que guarda a lista de perguntas da disciplina
	 */
	@OneToMany(mappedBy="disciplina")
	private List<Pergunta> perguntas;

	public Disciplina(){
		
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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
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
