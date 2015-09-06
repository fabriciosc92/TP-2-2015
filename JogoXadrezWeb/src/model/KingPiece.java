/* Classe PecaRei
 * Representa a peça Rei do jogo de xadrez 
 */

package model;

import java.awt.Point;
import java.util.ArrayList;

public class KingPiece extends Piece 
{
	/* Metodo construtor padrao */
	protected KingPiece()
	{
		super();
	}
	/* Construtor com parametros */
	public KingPiece(Point positionPiece, String imagemPathPiece)
	{
		super(positionPiece, imagemPathPiece, NAMEKING);
	}
	
	/* Sobrescrita do metodo de movimentacao da classe peca */
	@Override
	public ArrayList<Point> pointMovesPiece() {
		ArrayList<Point> listPointMovesKing = null; 				//Lista que armazenara os pontos para os quais a peca possa ser movida
		listPointMovesKing = new ArrayList<Point>();
		/* adiciona todos os pontos mesmo */
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
