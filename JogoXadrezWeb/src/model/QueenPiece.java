/* Classe PecaRainha
 * Representa a peça Rainha do jogo de xadrez 
 */
package model;

import java.awt.Point;
import java.util.ArrayList;

public class QueenPiece extends Piece {

	
	
	/* Método construtor padrao */
	protected QueenPiece()
	{
		super();
	}
	
	/* Método construtor com atributos */
	public QueenPiece(Point positionPiece, String imagePathPiece)
	{
		super(positionPiece,imagePathPiece,NAMEQUEEN);
	}
	
	
	
	@Override
	public ArrayList<Point> pointMovesPiece() 
	{
		/* Move online and column for Queen */		
		ArrayList<Point> listPlusMoveQueen = null;				//List to moves plus (+) queen
		listPlusMoveQueen = super.plusMovementsPointPiece();
		
		ArrayList<Point> listPointMoveQueen = null;				//Points of queen move
		listPointMoveQueen = new ArrayList<Point>();
//Verificar se listPlusMoveQueen nao esta vazia!
		listPointMoveQueen.addAll(listPlusMoveQueen);

		ArrayList<Point> listCrossMoveQueen = null;				//List to moves in cross (x) queen		
		listCrossMoveQueen = super.crossMovementsPointPiece();
//Verificar se listCrossMo... nao esta vazia!
		
		listPointMoveQueen.addAll(listCrossMoveQueen);
		return listPointMoveQueen;
	}
	
}
