/* TowerPiece class
 * Represents the tower of chess
 */
package model;

import java.awt.Point;
import java.util.ArrayList;

public class TowerPiece extends Piece {

	/* Default Constructor */
	protected TowerPiece() 
	{
		super();
	}
	/* Constructor with params */
	public TowerPiece(Point positionPiece, String imagePathPiece)
	{
		super(positionPiece, imagePathPiece, NAMETOWER);
	}
	
	/* Overwrite the method of abstract class */
	@Override
	public ArrayList<Point> pointMovesPiece() 
	{
		ArrayList<Point> listPointMoveTower = null;				//List for the possible points
		listPointMoveTower = super.plusMovementsPointPiece();
		
//Check that it is not empty the list
		
		
		return listPointMoveTower;
	}

}
