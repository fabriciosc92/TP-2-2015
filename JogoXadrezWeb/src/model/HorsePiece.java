/* Class HorsePiece
 * Represents the horse of chess
 */


package model;

import java.awt.Point;
import java.util.ArrayList;

public class HorsePiece extends Piece {
	/* Default Constructor */
	protected HorsePiece() 
	{
		super();
	}
	/* Constructor with params */
	public HorsePiece(Point positionPiece, String imagePathPiece)
	{
		super(positionPiece,imagePathPiece,NAMEHORSE);
	}
	/* Method to check the moves of horse */
	@Override
	public ArrayList<Point> pointMovesPiece() 
	{
		ArrayList<Point> listPointMovesHorse = null;					//List for the possible points
		listPointMovesHorse = new ArrayList<Point>();
		super.addPointList(super.getPositionPieceColumn()+1,
				super.getPositionPieceRow()+2, listPointMovesHorse);
		super.addPointList(super.getPositionPieceColumn()+1,
				super.getPositionPieceRow()-2, listPointMovesHorse);
		
		super.addPointList(super.getPositionPieceColumn()-1,
				super.getPositionPieceRow()+2, listPointMovesHorse);
		super.addPointList(super.getPositionPieceColumn()-1,
				super.getPositionPieceRow()-2, listPointMovesHorse);
		
		super.addPointList(super.getPositionPieceColumn()+2,
				super.getPositionPieceRow()+1, listPointMovesHorse);
		super.addPointList(super.getPositionPieceColumn()+2,
				super.getPositionPieceRow()-1, listPointMovesHorse);
		
		super.addPointList(super.getPositionPieceColumn()-2,
				super.getPositionPieceRow()+1, listPointMovesHorse);
		super.addPointList(super.getPositionPieceColumn()-2,
				super.getPositionPieceRow()-1, listPointMovesHorse);
		
		return listPointMovesHorse;
	}

}
