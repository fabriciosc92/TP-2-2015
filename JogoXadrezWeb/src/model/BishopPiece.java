/* BishopPiece 
 * It is the bishop in chess
 */
package model;

import java.awt.Point;
import java.util.ArrayList;

public class BishopPiece extends Piece 
{
	/* Default construct */
	protected BishopPiece() 
	{
		super();
	}
	/* Construct with parameter */
	public BishopPiece(Point positionPiece, String imagePathPiece)
	{
		super(positionPiece, imagePathPiece, NAMEBISHOP);
	}
	/* Overwrite the method of abstract class */
	@Override
	public ArrayList<Point> pointMovesPiece() 
	{
		ArrayList<Point> listPointMoveBishop = null;			//List of points of possible movements
		listPointMoveBishop = super.crossMovementsPointPiece();
		
//Check if the list is not returned empty		
				
		return listPointMoveBishop;
	}

}
