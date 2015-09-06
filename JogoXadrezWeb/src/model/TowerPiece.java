/* Classe PecaTorre
 * Representa a pe�a torre do jogo de Xadrez
 */
package model;

import java.awt.Point;
import java.util.ArrayList;

public class TowerPiece extends Piece {

	/* Construtor Padrao */
	protected TowerPiece() 
	{
		super();
	}
	/* Construtor com par�metros */
	public TowerPiece(Point positionPiece, String imagePathPiece)
	{
		super(positionPiece, imagePathPiece, NAMETOWER);
	}
	
	/* Sobrescrita do m�todo abstrato */
	@Override
	public ArrayList<Point> pointMovesPiece() 
	{
		ArrayList<Point> listPointMoveTower = null;				//Lista de pontos de possiveis movimentos
		listPointMoveTower = new ArrayList<Point>();
		
		for(int indexPosition = 0; indexPosition < 8; indexPosition++)
		{
			super.addPointList(super.getPositionPieceColumn(), indexPosition,
					listPointMoveTower);
			super.addPointList(indexPosition, super.getPositionPieceRow(),
					listPointMoveTower);
		}
		return listPointMoveTower;
	}

}
