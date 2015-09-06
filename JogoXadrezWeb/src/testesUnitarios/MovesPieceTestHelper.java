/* Classe ModeloPecaTestePadrao 
 * Contera o que é esperado ao utilizar os metodos da classe modelo Peca 
 */
package testesUnitarios;

import java.awt.Point;
import java.util.ArrayList;

import model.PawnPiece;


public class MovesPieceTestHelper {
	static final int COLUMN = 4;				//constante para posicao inicial
	static final int ROW = 4;					//constante para posicao inicial
	
    static ArrayList<Point> getPointsMoveKing()
	{
		int positionColumn = 0; 												//Coluna inicial onde estará a peça no tabuleiro
		positionColumn =  COLUMN;
		int positionRow = 0;											//Linha inicial onde estará a peça no tabuleiro
		positionRow = ROW;
		ArrayList<Point> listPointsMoveKing = null; 						//Lista para pontos de movimentos do rei
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
		
		int positionColumn = 0;					//Coluna inicial onde estará a peça no tabuleiro
		positionColumn = COLUMN;
		int positionRow = 0;					//Linha inicial onde estará a peça no tabuleiro
		positionRow = ROW;
		ArrayList<Point> listPointsMoveQueen = null;				//Lista que irá armazenar pontos que a rainha pode mover
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
	/* Movimentos da torre */
	public static ArrayList<Point> getPointsMoveTower() {
		int positionColumn = 0;										//Posição inicial da coluna
		positionColumn = COLUMN;
		int positionRow = 0;										//Posição inicial da linha
		positionRow = ROW;
		
		ArrayList<Point> listPointsMoveTower = null;							//Lista para possíveis pontos
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
	/* Movimentos do bispo */
	public static ArrayList<Point> getPointsMoveBishop() {
		int positionColumn = 0;										//Posição inicial da coluna
		positionColumn = COLUMN;
		int positionRow = 0;										//Posição inicial da linha
		positionRow = ROW;

		ArrayList<Point> listPointsMoveBishop = null;							//Lista para possíveis pontos
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
	/* Moviments of Horse */
	public static ArrayList<Point> getPointsMoveHorse() 
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
	
}
