/* QueenPiece class
 * Represents the queen of chess 
 */
package model;

import java.awt.Point;
import java.util.ArrayList;

public class QueenPiece extends Piece {

	
	
	/* Default Constructor */
	protected QueenPiece()
	{
		super();
	}
	
	/* Constructor with params */
	public QueenPiece(Point positionPiece, String imagePathPiece)
	{
		super(positionPiece,imagePathPiece,NAMEQUEEN);
	}
	
	
	
	@Override
	public ArrayList<Point> pointMovesPiece() 
	{
		/* Move on line and column for Queen */		
		ArrayList<Point> listPlusMoveQueen = null;				//List to moves plus (+) queen
		listPlusMoveQueen = super.plusMovementsPointPiece();
		
		ArrayList<Point> listPointMoveQueen = null;				//Points of queen move
		listPointMoveQueen = new ArrayList<Point>();
//Check if listPlusMoveQueen isn't empty!
		listPointMoveQueen.addAll(listPlusMoveQueen);

		ArrayList<Point> listCrossMoveQueen = null;				//List to moves in cross (x) queen		
		listCrossMoveQueen = super.crossMovementsPointPiece();
//Check if listCrossMo... isn't empty!
		
		listPointMoveQueen.addAll(listCrossMoveQueen);
		return listPointMoveQueen;
	}
	
}
