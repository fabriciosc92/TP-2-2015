/* Classe PecaBispo 
 * Representa o bispo no jogo de xadrez
 */
package model;

import java.awt.Point;
import java.util.ArrayList;

public class BishopPiece extends Piece 
{
	/* Construtor padrao */
	protected BishopPiece() 
	{
		super();
	}
	/* Construtor com parâmetros */
	public BishopPiece(Point positionPiece, String imagePathPiece)
	{
		super(positionPiece, imagePathPiece, NAMEBISHOP);
	}
	/* Sobrescrita do metodo da classe abstrata */
	@Override
	public ArrayList<Point> pointMovesPiece() 
	{
		ArrayList<Point> listPointMoveBishop = null;			//Lista de pontos de possiveis movimentos
		listPointMoveBishop = new ArrayList<Point>();
		
		int primaryDiagonal = 0;						//Linha usada no laço de repetição para diagonal segundaria
		int secondaryDiagonal = 0;						//Coluna usada no laço de repetição para diagonal segundaria
				
		
		for(primaryDiagonal = -7, secondaryDiagonal = 7;
			(primaryDiagonal <= 7 && secondaryDiagonal >= -7);
			primaryDiagonal++, secondaryDiagonal--)
		{
			super.addPointList(super.getPositionPieceColumn() + secondaryDiagonal,
									super.getPositionPieceRow() + primaryDiagonal, listPointMoveBishop);
		}		
		
		for(int diagonalPricipal = -7; diagonalPricipal <= 7; diagonalPricipal++)
		{
			super.addPointList(super.getPositionPieceColumn()+diagonalPricipal, 
					super.getPositionPieceColumn()+diagonalPricipal, listPointMoveBishop);
		}		
		return listPointMoveBishop;
	}

}
