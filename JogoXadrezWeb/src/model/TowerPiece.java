/* Classe PecaTorre
 * Representa a peça torre do jogo de Xadrez
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
	/* Construtor com parâmetros */
	public TowerPiece(Point positionPiece, String imagePathPiece)
	{
		super(positionPiece, imagePathPiece, NAMETOWER);
	}
	
	/* Sobrescrita do método abstrato */
	@Override
	public ArrayList<Point> pointMovesPiece() 
	{
		ArrayList<Point> listPointMoveTower = null;				//Lista de pontos de possiveis movimentos
		listPointMoveTower = super.plusMovementsPointPiece();
		
//verificar se nao esta vazia a lista 
		
		
		return listPointMoveTower;
	}

}
