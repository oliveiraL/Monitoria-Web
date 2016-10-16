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
 * Classe dominio Monitor
 * @author Fernanda Chacon
 *
 */

@Entity
@Table(name="monitor")
public class Monitor {
	
	/**
	 * Atributo identificador da classe Monitor
	 */
	@Id
	@Column(name="id_monitor", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Atributo que guarda a matricula do Monitor
	 */
	@Column
	private String matricula;
	
	/**
	 * Atributo que guarda o curso do Monitor
	 */
	@Column
	private String curso;
	
	/**
	 * Atributo que guarda a Pessoa do Monitor
	 */
	@OneToOne
	@JoinColumn(name="pessoa_id")
	private Pessoa pessoa;
	
	/**
	 * Atributo que guarda a Usuario do Monitor
	 */
	@OneToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	
	/**
	 * Lista que guarda as disciplinas que � Monitor
	 */
	@ManyToMany
    @JoinTable(name="monitor_disciplina", joinColumns={@JoinColumn(name="monitor_id")}, 
    inverseJoinColumns={@JoinColumn(name="disciplina_id")})
    private List<Disciplina> disciplinasMonitor;
	
	public Monitor(){
		
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

	public List<Disciplina> getDisciplinasMonitor() {
		return disciplinasMonitor;
	}

	public void setDisciplinasMonitor(List<Disciplina> disciplinasMonitor) {
		this.disciplinasMonitor = disciplinasMonitor;
	}


}
