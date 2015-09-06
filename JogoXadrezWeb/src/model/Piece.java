/** Classe Abstrata Peca
 * 	Modelo que servirá de base para as outras peças
 */

package model;

import java.awt.Point;
import java.util.ArrayList;

public abstract class Piece 
{
	protected static final String NAMEDEFAULT = "PECA";		//Constante para nome padrão
	protected static final String NAMEPAWN = "PEAO";		//Constante para nome de peao
	protected static final String NAMEKING = "REI";			//Constante para nome de REI
	protected static final String NAMEQUEEN = "RAINHA";	//Constante para nome de RAINHA
	protected static final String NAMETOWER = "TORRE";		//Constante para nome de TORRE
	protected static final String NAMEBISHOP = "BISPO";		//Constante para nome de BISBO
	protected static final String NAMEHORSE = "CAVALO";	//Constante para nome de CAVALO
	
	
	private Point positionPiece = null;				//Armazenará a posicao da peça 
	private String imagePiecePath = null;		//Conterá o caminho da imagem da peça
	private String namePiece = null;					//Recebera o nome da peca
	
	/* Metodo construtor padrao que inicializa atributos*/
	protected Piece()
	{
		this.positionPiece = new Point(-1,-1);
		this.imagePiecePath = "";
		this.namePiece = NAMEDEFAULT;
	}
	
	/* Construtor com parametros dos atributos basicos da classe */
	protected Piece(Point posicaoPeca, String caminhoImagemPeca, String nomePeca)
	{
		this();
		this.positionPiece = posicaoPeca;
		this.imagePiecePath = caminhoImagemPeca;
		this.namePiece = nomePeca;
	}
	
	/* A seguir serão os métodos acessores dos atributos */
	/* Retorna Point para posicao da peca */
	protected Point getPositionPiece() 
	{
		return positionPiece;
	}
	/* Insere um novo Point na posicao da peca */
	protected void setPositionPiece(Point positionPiece) 
	{
		this.positionPiece = positionPiece;
	}
	/* Retorna coluna onde a peça esta */
	protected int getPositionPieceColumn(){
		return positionPiece.x;
	}
	/* Retorna linha onde a peça esta */
	protected int getPositionPieceRow(){
		return positionPiece.y;
	}
	/* Retorna String para caminho de onde esta imagem da peca*/
	protected String getImagePathPiece() 
	{
		return imagePiecePath;
	}
	/* Insere um novo caminho de imagem da peca*/
	protected void setImagePathPiece(String imagePathPiece) 
	{
		this.imagePiecePath = imagePathPiece;
	}
	/* Retorna String para nome da peca */
	protected String getNamePiece() 
	{
		return namePiece;
	}
	/* Insere um novo nome para peca */
	protected void setNamePiece(String namePiece) 
	{
		this.namePiece = namePiece;
	}
	
	/* Metodo finalizador da peca */
	@Override
	public void finalize() throws Throwable
	{
		this.imagePiecePath = null;
		this.namePiece = null;
		this.positionPiece = null;
	}
	
	/* Metodo abstrato de mover peca */
	public abstract ArrayList<Point> pointMovesPiece();
	/* Metodo para adicionar pontos na lista de possiveis movimentos */
	protected void addPointList(int column,int row,	
			ArrayList<Point> listPointMovesPiece)
	{
		//Verificar se lista == null ou coluna/linha <0 || coluna/linha >7
		if(!isOwnPosition(column, row) && row >=0 && row < 8 && column < 8 && column >=0)
		{
			Point possiblePoint = null;						//Ponto para adicionar na lista
			possiblePoint = new Point(column, row);
			listPointMovesPiece.add(possiblePoint);
		}
	}
	/* Verifica se a linha e coluna passadas por parametro é a mesma que a posição da peça */
	protected boolean isOwnPosition(int column, int row) 
	{
		if( column == this.getPositionPieceColumn() &&
			row == this.getPositionPieceRow() )
		{
			return true;
		}
		return false;
	}
}
