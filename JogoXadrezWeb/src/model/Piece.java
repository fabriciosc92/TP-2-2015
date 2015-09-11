/** Classe Abstrata Peca
 * 	Modelo que servir� de base para as outras pe�as
 */

package model;

import java.awt.Point;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public abstract class Piece 
{
	protected static final String NAMEDEFAULT = "PECA";		//Constante para nome padr�o
	protected static final String NAMEPAWN = "PEAO";		//Constante para nome de peao
	protected static final String NAMEKING = "REI";			//Constante para nome de REI
	protected static final String NAMEQUEEN = "RAINHA";	//Constante para nome de RAINHA
	protected static final String NAMETOWER = "TORRE";		//Constante para nome de TORRE
	protected static final String NAMEBISHOP = "BISPO";		//Constante para nome de BISBO
	protected static final String NAMEKNIGHT = "CAVALO";	//Constante para nome de CAVALO
	
	
	private Point positionPiece = null;				//Armazenar� a posicao da pe�a 
	private String imagePiecePath = null;		//Conter� o caminho da imagem da pe�a
	private String namePiece = null;					//Recebera o nome da peca
	private String timePiece = null;
	
	private String getTimePiece()
	{
		return timePiece;
	}

	private void setTimePiece(String timePiece)
	{
		this.timePiece = timePiece;
	}

	/* Metodo construtor padrao que inicializa atributos*/
	protected Piece()
	{
		setPositionPiece(new Point(-1,-1)); 
		setImagePathPiece("");
		setNamePiece(NAMEDEFAULT);
	}
	
	/* Construtor com parametros dos atributos basicos da classe */
	protected Piece(Point positionPiece, String imagePathPiece, String namePiece)
	{
		this();
		setPositionPiece(positionPiece);
		setImagePathPiece(imagePathPiece);
		setNamePiece(namePiece);
	}
	
	/* A seguir ser�o os m�todos acessores dos atributos */
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
	/* Retorna coluna onde a pe�a esta */
	protected int getPositionPieceColumn(){
		return positionPiece.x;
	}
	/* Retorna linha onde a pe�a esta */
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
		this.timePiece = null;
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
	
	/* Verifica se a linha e coluna passadas por parametro � a mesma que a posi��o da pe�a */
	protected boolean isOwnPosition(int column, int row) 
	{
		return column == this.getPositionPieceColumn() &&
			row == this.getPositionPieceRow();
	}
	
	/* Create the movements in cross (x)*/
	protected ArrayList<Point> crossMovementsPointPiece()
	{
		int indexRow = 0;								//row used to loop in the primary diagonal
		int indexColumn = 0;								//column used to loop in the secondary diagonal
		
		ArrayList<Point> listPointSecondaryDiagonal = null;		//list to points of secondary diagonal
		listPointSecondaryDiagonal = new ArrayList<Point>();
		/* Secondary diagonal (i+j == N) in a  square matrix NxN */
		for(indexRow = -7, indexColumn = 7;
			(indexRow <= 7 && indexColumn >= -7);
			indexRow++, indexColumn--)
		{
			this.addPointList(this.getPositionPieceColumn()+indexColumn, 
					this.getPositionPieceRow()+indexRow, listPointSecondaryDiagonal);
		}		
		ArrayList<Point> listPointCrossMove = null;				//list to join list of primary and secundary diagonals
		listPointCrossMove = new ArrayList<Point>();
//Verificar movimentos
		listPointCrossMove.addAll(listPointSecondaryDiagonal);
		listPointSecondaryDiagonal.clear();
		
		ArrayList<Point> listPointPrimaryDiagonal = null;		//list to points of primary diagonal
		listPointPrimaryDiagonal = new ArrayList<Point>();
		/* Primary diagonal (i == j) in a  square matrix */
		for(int diagonalPricipal = -4; diagonalPricipal <= 4; diagonalPricipal++)
		{
			this.addPointList(this.getPositionPieceColumn()+diagonalPricipal, 
					this.getPositionPieceRow()+diagonalPricipal, listPointPrimaryDiagonal);
		}
//Verificar movimentos	
		listPointCrossMove.addAll(listPointPrimaryDiagonal);
		listPointPrimaryDiagonal.clear();
		return listPointCrossMove;	
	}
	
	/* Create movements in plus (+) */
	protected ArrayList<Point> plusMovementsPointPiece()
	{
		ArrayList<Point> listPointRow = null;					//list to line points
		listPointRow = new ArrayList<Point>();
		/* Movements online - */
		for(int indexPosition = 0; indexPosition < 8; indexPosition++)
		{
			this.addPointList(this.getPositionPieceColumn(), indexPosition,
					listPointRow);
		}
//Verificar movimentos
		ArrayList<Point> listPointPlusMove = null;					//list to points of plus move 
		listPointPlusMove = new ArrayList<Point>();
		listPointPlusMove.addAll(listPointRow);
		listPointRow.clear();
		
		ArrayList<Point> listPointColumn = null;					//list to column points
		listPointColumn = new ArrayList<Point>();
		/* Movements in column | */
		for(int indexPosition = 0; indexPosition < 8; indexPosition++)
		{
			this.addPointList(indexPosition, this.getPositionPieceRow(),
					listPointColumn);
		}
		
		listPointPlusMove.addAll(listPointColumn);
		listPointColumn.clear();
		return listPointPlusMove;
	}
}
