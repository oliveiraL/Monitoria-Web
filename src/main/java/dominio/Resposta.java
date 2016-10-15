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
@Table(name="resposta")
public class Resposta {
	
	/**
	 * Atributo identificador da classe Pergunta
	 */
	@Id
	@Column(name="id_resposta", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Atributo que guarda a descricao da resposta
	 */
	@Column
	private String descricao;
	
	/**
	 * Atributo que guarda a pergunta da resposta
	 */
	@ManyToOne
	@JoinColumn(name="pergunta_id")
	private Pergunta pergunta;
	
	/**
	 * Atributo que guarda a pessoa que respondeu
	 */
	@ManyToOne
	@JoinColumn(name="pessoa_id")
	private Pessoa pessoa;
	
	/**
	 * Atributo que guarda o status da resposta
	 */
	@OneToOne
	@JoinColumn(name="statusResposta_id")
	private StatusResposta statusResposta;
	
	/**
	 * Lista que guarda as imagens de uma resposta
	 */
	@ManyToMany
    @JoinTable(name="resposta_arquivo", joinColumns={@JoinColumn(name="resposta_id")}, 
    inverseJoinColumns={@JoinColumn(name="arquivo_id")})
	private List<Arquivo> fotos;
	
	public Resposta(){
		
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
	 * @return the pergunta
	 */
	public Pergunta getPergunta() {
		return pergunta;
	}

	/**
	 * @param pergunta the pergunta to set
	 */
	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
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
	 * @return the statusResposta
	 */
	public StatusResposta getStatusResposta() {
		return statusResposta;
	}

	/**
	 * @param statusResposta the statusResposta to set
	 */
	public void setStatusResposta(StatusResposta statusResposta) {
		this.statusResposta = statusResposta;
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
