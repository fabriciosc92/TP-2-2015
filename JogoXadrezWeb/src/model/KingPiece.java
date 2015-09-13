/* KingPiece class
 *It is the king in chess 
 */

package model;

import java.awt.Point;
import java.util.ArrayList;

public class KingPiece extends Piece 
{
	/* Default construct */
	protected KingPiece()
	{
		super();
	}
	/* Construct with parameter */
	public KingPiece(Point positionPiece, String imagemPathPiece)
	{
		super(positionPiece, imagemPathPiece, NAMEKING);
	}
	
	/* Overwrite the method of abstract class */
	@Override
	public ArrayList<Point> pointMovesPiece() {
		ArrayList<Point> listPointMovesKing = null; 				//List of points of possible movements
		listPointMovesKing = new ArrayList<Point>();
		/* Add all points */
		for(int row=-1; row<=1; row++)
		{
			for(int column = -1; column<=1; column++)
			{
				super.addPointList(super.getPositionPieceColumn()+column,
										super.getPositionPieceRow()+row, listPointMovesKing);

			}
		}
		return listPointMovesKing;		
	}
}
