/* Classe de teste ModeloPecaTeste
 * Responsável pelos testes unitarios da classe abstrata Peca 
 */
package testesUnitarios;

import java.awt.Point;
import java.util.ArrayList;

import model.BishopPiece;
import model.QueenPiece;
import model.KingPiece;
import model.TowerPiece;

import org.junit.Assert;
import org.junit.Test;

public class MovePiecesTest
{
	/* Metodo de teste de movimento da peca Rei */
	@Test
	public void moveKingTest() throws Exception
	{
		
		Point positionPieceaKing = null;								//Declara posicao da peca rei
		
		positionPieceaKing =  createPositionInitial();
		
		KingPiece kingPieceTest = null;								//Declara peca rei;
		
		kingPieceTest = new KingPiece(positionPieceaKing, "");
		
		ArrayList<Point> listPointMoves = null;				//Lista que irá armazena os pontos de movimento do rei
		
		listPointMoves = kingPieceTest.pointMovesPiece();
		
		assertMoves(MovesPieceTestHelper.getPointsMoveKing(), listPointMoves);
	}
	
	/* Teste de movimento da peca Rainha */
	@Test
	public void moveQueenTest() throws Exception
	{
		Point positionPieceQueen = null;								//Posicao da peca rainha
		positionPieceQueen = createPositionInitial();
		
		QueenPiece queenPieceTest= null;							//Declara peça rainha a ser testada
		queenPieceTest = new QueenPiece(positionPieceQueen, "");
		
		ArrayList<Point> listPointMoves = null;				//Lista que irá armazena os pontos de movimento da rainha
		listPointMoves = queenPieceTest.pointMovesPiece();
		
		assertMoves(MovesPieceTestHelper.getPointsMoveQueen(), listPointMoves);
		
	}
	
	/* Testa movimentos da torre */
	@Test
	public void moveTowerTest() throws Exception
	{
		Point positionPieceTower = null;								//Posicao da peca torre
		positionPieceTower = createPositionInitial();
		
		TowerPiece towerPieceTest= null;							//Declara peça torre a ser testada
		towerPieceTest = new TowerPiece(positionPieceTower, "");
		
		ArrayList<Point> listPointMoves = null;				//Lista que irá armazena os pontos de movimento da rainha
		listPointMoves = towerPieceTest.pointMovesPiece();
		
		assertMoves(MovesPieceTestHelper.getPointsMoveTower(), listPointMoves);
	}
	
	/* Testa movimentos bispo */
	@Test
	public void moveBishopTest() throws Exception
	{
		Point positionPieceBishop = null;								//Posicao da peca bispo
		positionPieceBishop = createPositionInitial();
		
		BishopPiece bishopPieceTest= null;							//Declara peça bispo a ser testada
		bishopPieceTest = new BishopPiece(positionPieceBishop, "");
		
		ArrayList<Point> listPointMoves = null;				//Lista que irá armazena os pontos de movimento da rainha
		listPointMoves = bishopPieceTest.pointMovesPiece();
		
		assertMoves(MovesPieceTestHelper.getPointsMoveBishop(), listPointMoves);
	}
	/* AssertMoves verifica se os movimentos gerados estao de acordo com os movimentos esperados que a peça possa realizar */
	private void assertMoves(ArrayList<Point> listPointsExpected, 
							ArrayList<Point> listPointsPiece) throws Exception 
	{		
		if ( listPointsExpected.size() != listPointsPiece.size() )
		{//Compara o tamanho das duas listas
			Assert.assertTrue(false);
			throw new Exception();
		}

		for (Point pointMoveExpected : listPointsExpected)
		{//Percorre a lista elemento por elemento
			if (!listPointsPiece.contains(pointMoveExpected)) 
			{//Compara se os elementos da lista MovesTestHelper estÃ£o na lista gerada por vocÃª
				Assert.assertTrue(false);//se nÃ£o tiver Teste deu errado
				throw new Exception();//encerra funÃ§Ã£o
			}
		}
		Assert.assertTrue(true);//Se a funÃ§Ã£o nÃ£o foi encerrada Teste Deu certo!
	}
	
	private Point createPositionInitial(){
		int positionInitialColumn = 0;								//Posicao inicial da coluna
		positionInitialColumn = MovesPieceTestHelper.COLUMN;
		int positionInitialRow = 0;								//Posicao inicial da linha
		positionInitialRow = MovesPieceTestHelper.ROW;
		Point initialPosition = null;								//Ponto da posicao inicial
		initialPosition= new Point(positionInitialColumn,positionInitialRow);
		return initialPosition;		
	}
	
}
