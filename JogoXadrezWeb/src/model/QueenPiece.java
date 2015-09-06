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
		ArrayList<Point> listPointMoveQueen = null;				//Pontos para os quais a rainha pode mover-se
		listPointMoveQueen = new ArrayList<Point>();
		
		/* Movimentos para a parte inferior do tabuleiro */
		
		for(int row = 0; row<8; row++ )
		{
			for(int column = 0; column <8; column++)
			{
				if(column == row)
				{
					super.addPointList(column, row, listPointMoveQueen);
				}
				else if( (column + row) == 
						(super.getPositionPieceColumn() + super.getPositionPieceRow()))
				{
					super.addPointList(column, row, listPointMoveQueen);
				}
				else if( (column == super.getPositionPieceColumn()) ||
						row == super.getPositionPieceRow())
				{
					super.addPointList(column, row, listPointMoveQueen);
				}
			}
		}
		return listPointMoveQueen;
	}
	
}
