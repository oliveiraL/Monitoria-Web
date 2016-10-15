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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pergunta")
public class Pergunta {

	/**
	 * Atributo identificador da classe Pergunta
	 */
	@Id
	@Column(name="id_pergunta", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Atributo que guarda o titulo da pergunta
	 */
	@Column
	private String titulo;
	
	/**
	 * Atributo que guarda a descricao da pergunta
	 */
	@Column
	private String descricao;
	
	/**
	 * Lista que guarda as imagens de uma pergunta
	 */
	@ManyToMany
    @JoinTable(name="pergunta_arquivo", joinColumns={@JoinColumn(name="pergunta_id")}, 
    inverseJoinColumns={@JoinColumn(name="arquivo_id")})
	private List<Arquivo> fotos;
	
	/**
	 * Atributo que guarda o status da pergunta
	 */
	@OneToOne
	@JoinColumn(name="statusPergunta_id")
	private StatusPergunta statusPergunta;
	
	/**
	 * Atributo que guarda a disciplina da pergunta
	 */
	@ManyToOne
	@JoinColumn(name="disciplina_id")
	private Disciplina disciplina;
	
	public Pergunta(){
		
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
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the statusPergunta
	 */
	public StatusPergunta getStatusPergunta() {
		return statusPergunta;
	}

	/**
	 * @param statusPergunta the statusPergunta to set
	 */
	public void setStatusPergunta(StatusPergunta statusPergunta) {
		this.statusPergunta = statusPergunta;
	}

	/**
	 * @return the disciplina
	 */
	public Disciplina getDisciplina() {
		return disciplina;
	}

	/**
	 * @param disciplina the disciplina to set
	 */
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	/**
	 * @return the fotos
	 */
	public List<Arquivo> getFotos() {
		return fotos;
	}

	/**
	 * @param fotos the fotos to set
	 */
	public void setFotos(List<Arquivo> fotos) {
		this.fotos = fotos;
	}
	
}
