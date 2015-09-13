/* Class KnightPiece
 * Represents the knight of chess
 */


package model;

import java.awt.Point;
import java.util.ArrayList;

public class KnightPiece extends Piece {
	/* Default Constructor */
	protected KnightPiece() 
	{
		super();
	}
	/* Constructor with params */
	public KnightPiece(Point positionPiece, String imagePathPiece)
	{
		super(positionPiece,imagePathPiece,NAMEKNIGHT);
	}
	/* Method to check the moves of knight */
	@Override
	public ArrayList<Point> pointMovesPiece() 
	{
		ArrayList<Point> listPointMovesKnight = null;					//List for the possible points
		listPointMovesKnight = new ArrayList<Point>();
		super.addPointList(super.getPositionPieceColumn()+1,
				super.getPositionPieceRow()+2, listPointMovesKnight);
		super.addPointList(super.getPositionPieceColumn()+1,
				super.getPositionPieceRow()-2, listPointMovesKnight);
		
		super.addPointList(super.getPositionPieceColumn()-1,
				super.getPositionPieceRow()+2, listPointMovesKnight);
		super.addPointList(super.getPositionPieceColumn()-1,
				super.getPositionPieceRow()-2, listPointMovesKnight);
		
		super.addPointList(super.getPositionPieceColumn()+2,
				super.getPositionPieceRow()+1, listPointMovesKnight);
		super.addPointList(super.getPositionPieceColumn()+2,
				super.getPositionPieceRow()-1, listPointMovesKnight);
		
		super.addPointList(super.getPositionPieceColumn()-2,
				super.getPositionPieceRow()+1, listPointMovesKnight);
		super.addPointList(super.getPositionPieceColumn()-2,
				super.getPositionPieceRow()-1, listPointMovesKnight);
		
		return listPointMovesKnight;
	}

}
