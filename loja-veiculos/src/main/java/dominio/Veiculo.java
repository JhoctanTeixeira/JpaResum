package dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tab_veiculo")
public class Veiculo {
	
	//@EmbeddedId	
	//private VeiculoId codigo;

	public Veiculo(byte[] foto) {
		super();
		this.foto = foto;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(length = 60, nullable = false)
	private String fabricante;
	
	@Column(length = 60, nullable = false)
	private String modelo;
	
	@Column(name = "ano_fabricacao", nullable = false)
	private Integer anoFabricacao;
	
	@Column(name = "ano_modelo", nullable = false)
	private Integer anoModelo;
	
	@Column(precision = 10, scale = 2, nullable = true)
	private BigDecimal valor;
	
	@Column(name = "tipo_combustivel", nullable = false)
	@Enumerated(EnumType.STRING) // EnumType.ORDINAL (insere n?mero ao inv?s da string)
	private TipoCombustivel tipoCombustivel;
	
	@Temporal(TemporalType.DATE) // Precis?o de data, mas n?o est? funcionando nesta IDE Eclipse
	@Column(name = "data_cadastro", nullable = false)
	private Calendar dataCadastro;
	
	
	@Lob
	private String especificacoes;
	
	@Lob
	private byte[] foto;
	
	
	//@Embedded
	//private Proprietario proprietario;
	
	///*
	// O relacionamento one-to-one aceita refer?ncias nulas, por padr?o. Podemos obrigar a atribui??o de propriet?rio durante a persist?ncia de Veiculo, incluindo o atributo optional com valor false na anota??o @OneToOne.
	//@OneToOne(optional = false)
	//@JoinColumn(name = "cod_proprietario")
	//private Proprietario proprietario;
	//*/
	
	/*
	@ManyToOne
	@JoinColumn(name = "proprietario_codigo")
	private Proprietario proprietario;
	*/

	/*
	As propriedades de uma entidade s?o automaticamente mapeadas se n?o especificarmos nenhuma anota??o.
	Por diversas vezes, podemos precisar criar atributos que n?o representam uma coluna no banco de dados. Nestes casos, devemos anotar com @Transient.
	A propriedade ser? ignorada totalmente pelo mecanismo de persist?ncia.
	*/
	//@Transient
	//private String descricaoCompleta;
	
	public Veiculo() {
	}
	

	public Veiculo(Long codigo, String fabricante, String modelo, Integer anoFabricacao, Integer anoModelo,
			BigDecimal valor, TipoCombustivel tipoCombustivel, Calendar dataCadastro, String especificacoes, byte [] foto) {
		super();
		this.codigo = codigo;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.valor = valor;
		this.tipoCombustivel = tipoCombustivel;
		this.dataCadastro = dataCadastro;
		this.especificacoes = especificacoes;
		this.foto = foto;
	}



	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getEspecificacoes() {
		return especificacoes;
	}

	public void setEspecificacoes(String especificacoes) {
		this.especificacoes = especificacoes;
	}
	
	public byte[] getFoto() {
		return foto;
	}


	public void setFoto(byte[] foto) {
		this.foto = foto;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(foto);
		result = prime * result + Objects.hash(anoFabricacao, anoModelo, codigo, dataCadastro, especificacoes,
				fabricante, modelo, tipoCombustivel, valor);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(anoFabricacao, other.anoFabricacao) && Objects.equals(anoModelo, other.anoModelo)
				&& Objects.equals(codigo, other.codigo) && Objects.equals(dataCadastro, other.dataCadastro)
				&& Objects.equals(especificacoes, other.especificacoes) && Objects.equals(fabricante, other.fabricante)
				&& Arrays.equals(foto, other.foto) && Objects.equals(modelo, other.modelo)
				&& tipoCombustivel == other.tipoCombustivel && Objects.equals(valor, other.valor);
	}







	
	
}
	