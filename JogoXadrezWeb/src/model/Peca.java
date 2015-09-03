/** Classe Abstrata Peca
 * 	Modelo que servirá de base para as outras peças
 */

package model;

import java.awt.Point;
import java.util.ArrayList;

public abstract class Peca 
{
	protected static final String NOMEPADRAO = "PECA";		//Constante para nome padrão
	protected static final String NOMEPEAO = "PEAO";		//Constante para nome de peao
	protected static final String NOMEREI = "REI";			//Constante para nome de REI
	protected static final String NOMERAINHA = "RAINHA";	//Constante para nome de RAINHA
	protected static final String NOMETORRE = "TORRE";		//Constante para nome de TORRE
	protected static final String NOMEBISPO = "BISPO";		//Constante para nome de BISBO
	protected static final String NOMECAVALO = "CAVALO";	//Constante para nome de CAVALO
	
	
	private Point posicaoPeca = null;				//Armazenará a posicao da peça 
	private String caminhoImagemPeca = null;		//Conterá o caminho da imagem da peça
	private String nomePeca = null;					//Recebera o nome da peca
	
	/* Metodo construtor padrao que inicializa atributos*/
	public Peca()
	{
		this.posicaoPeca = new Point(-1,-1);
		this.caminhoImagemPeca = "";
		this.nomePeca = NOMEPADRAO;
	}
	
	/* Construtor com parametros dos atributos basicos da classe */
	public Peca(Point posicaoPeca, String caminhoImagemPeca, String nomePeca)
	{
		this();
		this.posicaoPeca = posicaoPeca;
		this.caminhoImagemPeca = caminhoImagemPeca;
		this.nomePeca = nomePeca;
	}
	
	/* A seguir serão os métodos acessores dos atributos */
	/* Retorna Point para posicao da peca */
	public Point getPosicaoPeca() 
	{
		return posicaoPeca;
	}
	/* Insere um novo Point na posicao da peca */
	public void setPosicaoPeca(Point posicaoPeca) 
	{
		this.posicaoPeca = posicaoPeca;
	}
	/* Retorna String para caminho de onde esta imagem da peca*/
	public String getCaminhoImagemPeca() 
	{
		return caminhoImagemPeca;
	}
	/* Insere um novo caminho de imagem da peca*/
	public void setCaminhoImagemPeca(String caminhoImagemPeca) 
	{
		this.caminhoImagemPeca = caminhoImagemPeca;
	}
	/* Retorna String para nome da peca */
	public String getNomePeca() 
	{
		return nomePeca;
	}
	/* Insere um novo nome para peca */
	public void setNomePeca(String nomePeca) 
	{
		this.nomePeca = nomePeca;
	}
	
	/* Metodo finalizador da peca */
	@Override
	public void finalize() throws Throwable
	{
		this.caminhoImagemPeca = null;
		this.nomePeca = null;
		this.posicaoPeca = null;
	}
	
	/* Metodo abstrato de mover peca */
	public abstract ArrayList<Point> pontosPossivelMover();
	/* Metodo para adicionar pontos na lista de possiveis movimentos */
	protected void adicionaPontoLista(int coluna,int linha,ArrayList<Point> listaPontosMovimento)
	{
		Point pontoPossivel = null;						//Ponto para adicionar na lista
		pontoPossivel = new Point(coluna, linha);
		listaPontosMovimento.add(pontoPossivel);
	}
	/* Verifica se a linha e coluna passadas por parametro é a mesma que a posição da peça */
	protected boolean propriaPosicao(int coluna, int linha) 
	{
		if( coluna == this.getPosicaoPeca().getX() &&
			linha == this.getPosicaoPeca().getY() )
		{
			return true;
		}
		return false;
	}
}
