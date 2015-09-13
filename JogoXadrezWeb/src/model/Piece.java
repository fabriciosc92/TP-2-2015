/** Abstract class Piece
 * 	Model as the basis for the other pieces
 */

package model;

import java.awt.Point;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public abstract class Piece 
{
	protected static final String NAMEDEFAULT = "PECA";		//Constant for default name
	protected static final String NAMEPAWN = "PEAO";		//Constant for pawn name
	protected static final String NAMEKING = "REI";			//Constant for king name
	protected static final String NAMEQUEEN = "RAINHA";		//Constant for queen name
	protected static final String NAMETOWER = "TORRE";		//Constant for tower name
	protected static final String NAMEBISHOP = "BISPO";		//Constant for bishop name
	protected static final String NAMEKNIGHT = "CAVALO";	//Constant for knight name
	
	
	private Point positionPiece = null;			//Store the position of piece 
	private String imagePiecePath = null;		//contain the path of piece image
	private String namePiece = null;			//Receive name of piece
	private String teamPiece = null;			//Receive team of piece
	

	/* Method default constructor that initializes attributes */
	protected Piece()
	{
		setPositionPiece(new Point(-1,-1)); 
		setImagePathPiece("");
		setNamePiece(NAMEDEFAULT);
	}
	
	/* Constructor with parameters of the basic attributes of the class */
	protected Piece(Point positionPiece, String imagePathPiece, String namePiece)
	{
		this();
		setPositionPiece(positionPiece);
		setImagePathPiece(imagePathPiece);
		setNamePiece(namePiece);
	}
	
	/* The following are the attributes of the accessor methods */
	/* Returns the team piece */
	private String getTeamPiece()
	{
		return teamPiece;
	}
	/* Inserts a new team to piece */
	private void setTeamPiece(String timePiece)
	{
		this.teamPiece = timePiece;
	}
	/* Returns Point to position the piece */
	protected Point getPositionPiece() 
	{
		return positionPiece;
	}
	/* Inserts a new Point to the piece position */
	protected void setPositionPiece(Point positionPiece) 
	{
		this.positionPiece = positionPiece;
	}
	/* Returns column where the piece is */
	protected int getPositionPieceColumn(){
		return positionPiece.x;
	}
	/* Returns line where the piece is */
	protected int getPositionPieceRow(){
		return positionPiece.y;
	}
	/* Returns the path where the piece is */
	public String getImagePathPiece() 
	{
		return imagePiecePath;
	}
	/* Inserts a new path to the piece image */
	protected void setImagePathPiece(String imagePathPiece) 
	{
		this.imagePiecePath = imagePathPiece;
	}
	/* Returns String of piece name */
	protected String getNamePiece() 
	{
		return namePiece;
	}
	/* Inserts a new piece name */
	protected void setNamePiece(String namePiece) 
	{
		this.namePiece = namePiece;
	}
	
	/* Method finalize of piece */
	@Override
	public void finalize() throws Throwable
	{
		this.imagePiecePath = null;
		this.namePiece = null;
		this.positionPiece = null;
		this.teamPiece = null;
	}
	
	/* Abstract method to moving piece */
	public abstract ArrayList<Point> pointMovesPiece();
	
	/* Method to add points on the possible movements list */
	protected void addPointList(int column,int row,	
			ArrayList<Point> listPointMovesPiece)
	{
		//Check if list == null or colunm/line <0 || coluna/linha >7
		if(!isOwnPosition(column, row) && row >=0 && row < 8 && column < 8 && column >=0)
		{
			Point possiblePoint = null;						//Point to add in list
			possiblePoint = new Point(column, row);
			listPointMovesPiece.add(possiblePoint);
		}
	}
	
	/* Checks that the row and column passed by parameter are the same as the piece position */
	protected boolean isOwnPosition(int column, int row) 
	{
		return column == this.getPositionPieceColumn() &&
			row == this.getPositionPieceRow();
	}
	
	/* Create the movements in cross (x)*/
	protected ArrayList<Point> crossMovementsPointPiece()
	{
		int indexRow = 0;								//Row used to loop in the primary diagonal
		int indexColumn = 0;								//Column used to loop in the secondary diagonal
		
		ArrayList<Point> listPointSecondaryDiagonal = null;		//List to points of secondary diagonal
		listPointSecondaryDiagonal = new ArrayList<Point>();
		/* Secondary diagonal (i+j == N) in a  square matrix NxN */
		for(indexRow = -7, indexColumn = 7;
			(indexRow <= 7 && indexColumn >= -7);
			indexRow++, indexColumn--)
		{
			this.addPointList(this.getPositionPieceColumn()+indexColumn, 
					this.getPositionPieceRow()+indexRow, listPointSecondaryDiagonal);
		}		
		ArrayList<Point> listPointCrossMove = null;				//List to join list of primary and secundary diagonals
		listPointCrossMove = new ArrayList<Point>();
//Check move
		listPointCrossMove.addAll(listPointSecondaryDiagonal);
		listPointSecondaryDiagonal.clear();
		
		ArrayList<Point> listPointPrimaryDiagonal = null;		//List to points of primary diagonal
		listPointPrimaryDiagonal = new ArrayList<Point>();
		/* Primary diagonal (i == j) in a  square matrix */
		for(int diagonalPricipal = -4; diagonalPricipal <= 4; diagonalPricipal++)
		{
			this.addPointList(this.getPositionPieceColumn()+diagonalPricipal, 
					this.getPositionPieceRow()+diagonalPricipal, listPointPrimaryDiagonal);
		}
//Check move	
		listPointCrossMove.addAll(listPointPrimaryDiagonal);
		listPointPrimaryDiagonal.clear();
		return listPointCrossMove;	
	}
	
	/* Create movements in plus (+) */
	protected ArrayList<Point> plusMovementsPointPiece()
	{
		ArrayList<Point> listPointRow = null;					//List to line points
		listPointRow = new ArrayList<Point>();
		/* Movements online - */
		for(int indexPosition = 0; indexPosition < 8; indexPosition++)
		{
			this.addPointList(this.getPositionPieceColumn(), indexPosition,
					listPointRow);
		}
//Check move
		ArrayList<Point> listPointPlusMove = null;					//List to points of plus move 
		listPointPlusMove = new ArrayList<Point>();		
		listPointPlusMove.addAll(listPointRow);			//Call the method to add move in row
		listPointRow.clear();
		
		ArrayList<Point> listPointColumn = null;					//List to column points
		listPointColumn = new ArrayList<Point>();
		/* Movements in column | */
		for(int indexPosition = 0; indexPosition < 8; indexPosition++)
		{
			this.addPointList(indexPosition, this.getPositionPieceRow(),
					listPointColumn);
		}
		
		listPointPlusMove.addAll(listPointColumn);		//Call the method to add move in column
		listPointColumn.clear();
		return listPointPlusMove;
	}
}
