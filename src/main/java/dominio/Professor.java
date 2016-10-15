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
 * Classe dominio Professor
 * @author Fernanda Chacon
 *
 */

@Entity
@Table(name="professor")
public class Professor {
	
	/**
	 * Atributo identificador da classe Professor
	 */
	@Id
	@Column(name="id_monitor", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	

	/**
	 * Atributo que guarda a Pessoa do Professor
	 */
	@OneToOne
	@JoinColumn(name="pessoa_id")
	private Pessoa pessoa;
	
	/**
	 * Atributo que guarda a Usuario do Professor
	 */
	@OneToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	
	/**
	 * Lista que guarda as disciplinas que o Professor leciona
	 */
	@ManyToMany
    @JoinTable(name="professor_disciplina", joinColumns={@JoinColumn(name="professor_id")}, 
    inverseJoinColumns={@JoinColumn(name="disciplina_id")})
    private List<Disciplina> disciplinasProfessor;
	
	
	public Professor(){
		
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
	 * @return the pessoa
	 */
	public Pessoa getPessoa() {
		return pessoa;
	}

	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the disciplinas
	 */
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	/**
	 * @param disciplinas the disciplinas to set
	 */
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
}
