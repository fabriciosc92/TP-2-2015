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
		listPointMoveBishop = super.crossMovementsPointPiece();
		
//Verificar se a lista nao retornou vazia		
				
		return listPointMoveBishop;
	}

}
