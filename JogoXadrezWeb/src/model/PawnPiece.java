/* Class Pawn
 * Represent the pawn of the chess
 */

package model;

import java.awt.Point;
import java.util.ArrayList;

public class PawnPiece extends Piece 
{
	private Boolean firstMove;						//Atribute to define if the piece was move
	
	//********************************//
	//A excluir este atributo// 
	int team;
	//*********************************//
	
	/* Default constructor */
	protected PawnPiece() 
	{
		super();
		setFirstMove(true);
	}
	
	/* Constructor with parameters */
	public PawnPiece(Point positionPiece, String imagePathPiece,int team)
	{
		super(positionPiece, imagePathPiece, NAMEPAWN);
		setFirstMove(true);
		this.team=team;
	}
	
	/* Accessor to get the attribute */
	private Boolean getFirstMove() 
	{
		return firstMove;
	}
	/* Accessor to set the first movement of pawn */ 
	private void setFirstMove(Boolean firstMove) 
	{
		this.firstMove = firstMove;
	}
	
	/* Change the status of firstMove */
	public void makeFirstMove(){
		setFirstMove(false);
	}

	/* Movements of pawn */
	@Override
	public ArrayList<Point> pointMovesPiece() 
	{
		ArrayList<Point> listPointMovesPawn = null;			//List to the movement of pawn
		listPointMovesPawn = new ArrayList<Point>();
		this.addPointByTeam(super.getPositionPieceColumn(), super.getPositionPieceRow(),
				1, listPointMovesPawn);
		
		if(this.getFirstMove())
		{
			this.addPointByTeam(super.getPositionPieceColumn(), super.getPositionPieceRow(),
					2,listPointMovesPawn);
		}
		else
		{
			/*do nothing*/
		}
		return listPointMovesPawn;
	}
	
	/* Add movement based on the team */
	private void addPointByTeam(int column, int row, int numberSquare,
			ArrayList<Point> listPointMovesPawn)
	{
		if(this.team==1)
		{
			super.addPointList(column, row+numberSquare, listPointMovesPawn);
		}
		else
		{
			super.addPointList(column, row-numberSquare, listPointMovesPawn);
		}
	}

}
