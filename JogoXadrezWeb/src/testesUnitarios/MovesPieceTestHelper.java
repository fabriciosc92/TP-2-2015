/* MovesPieceTestHelper class 
 * It contains what is expected when using the methods of model class Piece
 */
package testesUnitarios;

import java.awt.Point;
import java.util.ArrayList;

import model.PawnPiece;


public class MovesPieceTestHelper {
	static final int COLUMN = 4;				//Constant for initial position
	static final int ROW = 4;					//Constant for initial position
	
    static ArrayList<Point> getPointsMoveKing()
	{
		int positionColumn = 0; 												//Starting column where is the piece on the board
		positionColumn =  COLUMN;
		int positionRow = 0;											//Starting line where is the piece on the board
		positionRow = ROW;
		ArrayList<Point> listPointsMoveKing = null; 						//List to possible moves ofthe king
		listPointsMoveKing = new ArrayList<Point>();

		listPointsMoveKing.add(new Point(positionColumn + 1, positionRow + 1));
		listPointsMoveKing.add(new Point(positionColumn + 0, positionRow + 1));
		listPointsMoveKing.add(new Point(positionColumn - 1, positionRow + 1));
		listPointsMoveKing.add(new Point(positionColumn - 1, positionRow + 0));
		listPointsMoveKing.add(new Point(positionColumn - 1, positionRow - 1));
		listPointsMoveKing.add(new Point(positionColumn + 0, positionRow - 1));
		listPointsMoveKing.add(new Point(positionColumn + 1, positionRow - 1));
		listPointsMoveKing.add(new Point(positionColumn + 1, positionRow + 0));
        return listPointsMoveKing;
	}
	static ArrayList<Point> getPointsMoveQueen(){
		
		int positionColumn = 0;					//Initial position of column
		positionColumn = COLUMN;
		int positionRow = 0;					//Initial position of line
		positionRow = ROW;
		ArrayList<Point> listPointsMoveQueen = null;				//List to possible moves of the queen 
		listPointsMoveQueen = new ArrayList<Point>();

		listPointsMoveQueen.add(new Point(positionColumn - 4, positionRow));
		listPointsMoveQueen.add(new Point(positionColumn - 3, positionRow));
		listPointsMoveQueen.add(new Point(positionColumn - 2, positionRow));
		listPointsMoveQueen.add(new Point(positionColumn - 1, positionRow));
		listPointsMoveQueen.add(new Point(positionColumn + 1, positionRow));
		listPointsMoveQueen.add(new Point(positionColumn + 2, positionRow));
		listPointsMoveQueen.add(new Point(positionColumn + 3, positionRow));
		listPointsMoveQueen.add(new Point(positionColumn, positionRow - 4));
		listPointsMoveQueen.add(new Point(positionColumn, positionRow - 3));
		listPointsMoveQueen.add(new Point(positionColumn, positionRow - 2));
		listPointsMoveQueen.add(new Point(positionColumn, positionRow - 1));
		listPointsMoveQueen.add(new Point(positionColumn, positionRow + 1));
		listPointsMoveQueen.add(new Point(positionColumn, positionRow + 2));
		listPointsMoveQueen.add(new Point(positionColumn, positionRow + 3));
		listPointsMoveQueen.add(new Point(positionColumn - 1, positionRow + 1));
		listPointsMoveQueen.add(new Point(positionColumn - 2, positionRow + 2));
		listPointsMoveQueen.add(new Point(positionColumn - 3, positionRow + 3));
		listPointsMoveQueen.add(new Point(positionColumn - 1, positionRow - 1));
		listPointsMoveQueen.add(new Point(positionColumn - 2, positionRow - 2));
		listPointsMoveQueen.add(new Point(positionColumn - 3, positionRow - 3));
		listPointsMoveQueen.add(new Point(positionColumn - 4, positionRow - 4));
		listPointsMoveQueen.add(new Point(positionColumn + 1, positionRow + 1));
		listPointsMoveQueen.add(new Point(positionColumn + 2, positionRow + 2));
		listPointsMoveQueen.add(new Point(positionColumn + 3, positionRow + 3));
		listPointsMoveQueen.add(new Point(positionColumn + 1, positionRow - 1));
		listPointsMoveQueen.add(new Point(positionColumn + 2, positionRow - 2));
		listPointsMoveQueen.add(new Point(positionColumn + 3, positionRow - 3));
		
		return listPointsMoveQueen;
		
	}
	/* Moves of tower */
	public static ArrayList<Point> getPointsMoveTower() {
		int positionColumn = 0;										//Initial position of column
		positionColumn = COLUMN;
		int positionRow = 0;										//Initial position of line
		positionRow = ROW;
		
		ArrayList<Point> listPointsMoveTower = null;							//List to possible moves of the tower
		listPointsMoveTower = new ArrayList<Point>();

		listPointsMoveTower.add(new Point(positionColumn - 4, positionRow));
		listPointsMoveTower.add(new Point(positionColumn - 3, positionRow));
		listPointsMoveTower.add(new Point(positionColumn - 2, positionRow));
		listPointsMoveTower.add(new Point(positionColumn - 1, positionRow));
		listPointsMoveTower.add(new Point(positionColumn + 1, positionRow));
		listPointsMoveTower.add(new Point(positionColumn + 2, positionRow));
		listPointsMoveTower.add(new Point(positionColumn + 3, positionRow));
		listPointsMoveTower.add(new Point(positionColumn, positionRow - 4));
		listPointsMoveTower.add(new Point(positionColumn, positionRow - 3));
		listPointsMoveTower.add(new Point(positionColumn, positionRow - 2));
		listPointsMoveTower.add(new Point(positionColumn, positionRow - 1));
		listPointsMoveTower.add(new Point(positionColumn, positionRow + 1));
		listPointsMoveTower.add(new Point(positionColumn, positionRow + 2));
		listPointsMoveTower.add(new Point(positionColumn, positionRow + 3));

		return listPointsMoveTower;
	}
	/* Moves of bishop */
	public static ArrayList<Point> getPointsMoveBishop() {
		int positionColumn = 0;										//Initial position of column
		positionColumn = COLUMN;
		int positionRow = 0;										//Initial position of line
		positionRow = ROW;

		ArrayList<Point> listPointsMoveBishop = null;							//List to possible moves of the bishop
		listPointsMoveBishop = new ArrayList<Point>();
		
		listPointsMoveBishop.add(new Point(positionColumn - 1, positionRow + 1));
		listPointsMoveBishop.add(new Point(positionColumn - 2, positionRow + 2));
		listPointsMoveBishop.add(new Point(positionColumn - 3, positionRow + 3));
		listPointsMoveBishop.add(new Point(positionColumn - 1, positionRow - 1));
		listPointsMoveBishop.add(new Point(positionColumn - 2, positionRow - 2));
		listPointsMoveBishop.add(new Point(positionColumn - 3, positionRow - 3));
		listPointsMoveBishop.add(new Point(positionColumn - 4, positionRow - 4));
		listPointsMoveBishop.add(new Point(positionColumn + 1, positionRow + 1));
		listPointsMoveBishop.add(new Point(positionColumn + 2, positionRow + 2));
		listPointsMoveBishop.add(new Point(positionColumn + 3, positionRow + 3));
		listPointsMoveBishop.add(new Point(positionColumn + 1, positionRow - 1));
		listPointsMoveBishop.add(new Point(positionColumn + 2, positionRow - 2));
		listPointsMoveBishop.add(new Point(positionColumn + 3, positionRow - 3));

		return listPointsMoveBishop;
	}
	/* Moviments of Knight */
	public static ArrayList<Point> getPointsMoveKnight() 
	{
		int positionColumn = 0;										//Initial position of column
		positionColumn = COLUMN;
		int positionRow = 0;										//Initial position of row
		positionRow = ROW;
		
		ArrayList<Point> listPointsMoveHorse = null;				//list for possible points of movement
		listPointsMoveHorse = new ArrayList<Point>();

		listPointsMoveHorse.add(new Point(positionColumn - 1, positionRow + 2));
		listPointsMoveHorse.add(new Point(positionColumn + 1, positionRow + 2));
		listPointsMoveHorse.add(new Point(positionColumn + 1, positionRow - 2));
		listPointsMoveHorse.add(new Point(positionColumn - 1, positionRow - 2));
		listPointsMoveHorse.add(new Point(positionColumn - 2, positionRow + 1));
		listPointsMoveHorse.add(new Point(positionColumn - 2, positionRow - 1));
		listPointsMoveHorse.add(new Point(positionColumn + 2, positionRow + 1));
		listPointsMoveHorse.add(new Point(positionColumn + 2, positionRow - 1));

		return listPointsMoveHorse;
	}
	
	public static ArrayList<Point> getPointsMovePawn(int team)
	{
		int positionColumn = 0;										//Initial position of column
		positionColumn = COLUMN;
		int positionRow = 0;										//Initial position of row
		positionRow = ROW;
		
		ArrayList<Point> listPointsMovePawn = null;			//list for possible points of movement
		listPointsMovePawn = new ArrayList<Point>();
		if(team == 1)
		{
			listPointsMovePawn.add(new Point(positionColumn, positionRow+1));
		}
		else
		{
			listPointsMovePawn.add(new Point(positionColumn, positionRow-1));		
		}
		return listPointsMovePawn;
	}
	/* Moviments of Pawn */
	public static ArrayList<Point> getPointsFirstMovePawn(int team)
	{
		int positionColumn = 0;										//Initial position of column
		positionColumn = COLUMN;
		int positionRow = 0;										//Initial position of row
		positionRow = ROW;
		
		ArrayList<Point> listPointsFirstMovePawn = null;			//list for possible points of movement
		listPointsFirstMovePawn = getPointsMovePawn(team);
		if(team == 1)
		{
			listPointsFirstMovePawn.add(new Point(positionColumn, positionRow+2));
		}
		else
		{
			listPointsFirstMovePawn.add(new Point(positionColumn, positionRow-2));		
		}
		
		
		
		return listPointsFirstMovePawn;
	}
}
