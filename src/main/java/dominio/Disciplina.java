package dominio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	 * Lista que guarda os alunos da disciplina
	 */
	@ManyToMany(mappedBy="disciplinasAluno")
    private List<Aluno> alunos;
	
	/**
	 * Lista que guarda os monitores da disciplina
	 */
	@ManyToMany(mappedBy="disciplinasMonitor")
    private List<Monitor> monitores;
	
	/**
	 * Lista que guarda os professores da disciplina
	 */
	@ManyToMany(mappedBy="disciplinasProfessor")
    private List<Professor> professores;

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
	 * @return the alunos
	 */
	public List<Aluno> getAlunos() {
		return alunos;
	}

	/**
	 * @param alunos the alunos to set
	 */
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	/**
	 * @return the monitores
	 */
	public List<Monitor> getMonitores() {
		return monitores;
	}

	/**
	 * @param monitores the monitores to set
	 */
	public void setMonitores(List<Monitor> monitores) {
		this.monitores = monitores;
	}

	/**
	 * @return the professores
	 */
	public List<Professor> getProfessores() {
		return professores;
	}

	/**
	 * @param professores the professores to set
	 */
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	
}
