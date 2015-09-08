/* Classe de teste ModeloPecaTeste
 * Respons�vel pelos testes unitarios da classe abstrata Peca 
 */
package testesUnitarios;

import java.awt.Point;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import model.BishopPiece;
import model.KnightPiece;
import model.KingPiece;
import model.PawnPiece;
import model.QueenPiece;
import model.TowerPiece;

public class MovePiecesTest
{
	/* Metodo de teste de movimento da peca Rei */
	@Test
	public void moveKingTest() throws Exception,Throwable
	{
		
		Point positionPieceaKing = null;								//Declara posicao da peca rei
		
		positionPieceaKing =  createPositionInitial();
		
		KingPiece kingPieceTest = null;								//Declara peca rei;
		
		kingPieceTest = new KingPiece(positionPieceaKing, "");
		
		ArrayList<Point> listPointMoves = null;				//Lista que ir� armazena os pontos de movimento do rei
		
		listPointMoves = kingPieceTest.pointMovesPiece();
		
		kingPieceTest.finalize();
		
		assertMoves(MovesPieceTestHelper.getPointsMoveKing(), listPointMoves);
		
	}
	
	/* Teste de movimento da peca Rainha */
	@Test
	public void moveQueenTest() throws Exception,Throwable
	{
		Point positionPieceQueen = null;								//Posicao da peca rainha
		positionPieceQueen = createPositionInitial();
		
		QueenPiece queenPieceTest= null;							//Declara pe�a rainha a ser testada
		queenPieceTest = new QueenPiece(positionPieceQueen, "");
		
		ArrayList<Point> listPointMoves = null;				//Lista que ir� armazena os pontos de movimento da rainha
		listPointMoves = queenPieceTest.pointMovesPiece();
		
		queenPieceTest.finalize();
		
		assertMoves(MovesPieceTestHelper.getPointsMoveQueen(), listPointMoves);
		
	}
	
	/* Testa movimentos da torre */
	@Test
	public void moveTowerTest() throws Exception, Throwable
	{
		Point positionPieceTower = null;								//Posicao da peca torre
		positionPieceTower = createPositionInitial();
		
		TowerPiece towerPieceTest= null;							//Declara pe�a torre a ser testada
		towerPieceTest = new TowerPiece(positionPieceTower, "");
		
		ArrayList<Point> listPointMoves = null;				//Lista que ir� armazena os pontos de movimento da rainha
		listPointMoves = towerPieceTest.pointMovesPiece();
		
		towerPieceTest.finalize();
		
		assertMoves(MovesPieceTestHelper.getPointsMoveTower(), listPointMoves);
	}
	
	
	/* Testa movimentos bispo */
	@Test
	public void moveBishopTest() throws Exception, Throwable
	{
		Point positionPieceBishop = null;								//Posicao da peca bispo
		positionPieceBishop = createPositionInitial();
		
		BishopPiece bishopPieceTest= null;							//Declara pe�a bispo a ser testada
		bishopPieceTest = new BishopPiece(positionPieceBishop, "");
		
		ArrayList<Point> listPointMoves = null;				//Lista que ir� armazena os pontos de movimento da rainha
		listPointMoves = bishopPieceTest.pointMovesPiece();
		
		bishopPieceTest.finalize();
		
		assertMoves(MovesPieceTestHelper.getPointsMoveBishop(), listPointMoves);
	}
	
	/* Test moves of horse */
	@Test
	public void moveKnightTest() throws Exception, Throwable
	{
		Point positionPieceKnight = null;							//Position of horse piece
		positionPieceKnight = createPositionInitial();
		
		KnightPiece horsePieceTest = null;							//A instance of horse to test
		horsePieceTest = new KnightPiece(positionPieceKnight, "");
		
		ArrayList<Point> listPointMoves = null;						//List to store the points of movements from the horse
		listPointMoves = horsePieceTest.pointMovesPiece();
		
		horsePieceTest.finalize();
		
		assertMoves(MovesPieceTestHelper.getPointsMoveKnight(), listPointMoves);
	}
	
	/* Test moves of pawn */
	@Test
	public void movePawnTestTeamOne() throws Exception,Throwable
	{
		Point positionPiecePawn = null;										//Position of pawn piece
		positionPiecePawn = createPositionInitial();
		
		PawnPiece pawnPieceTestTeamOne = null;								//A instance of pawn team 1 to test
		pawnPieceTestTeamOne = new PawnPiece(positionPiecePawn, "",1);
		
		ArrayList<Point> listPointMovesTeamOne = null;						//List to store the points of movements from the pawn
		listPointMovesTeamOne = pawnPieceTestTeamOne.pointMovesPiece();
		
		assertMoves(MovesPieceTestHelper.getPointsFirstMovePawn(1), listPointMovesTeamOne);
		
		pawnPieceTestTeamOne.makeFirstMove();
		
		listPointMovesTeamOne = pawnPieceTestTeamOne.pointMovesPiece();
		
		pawnPieceTestTeamOne.finalize();
		
		assertMoves(MovesPieceTestHelper.getPointsMovePawn(1), listPointMovesTeamOne);
	}
	
	/* Test moves of pawn */
	@Test
	public void movePawnTestTeamTwo() throws Exception, Throwable
	{
		Point positionPiecePawn = null;										//Position of pawn piece
		positionPiecePawn = createPositionInitial();
		
		PawnPiece pawnPieceTestTeamTwo = null;								//A instance of pawn team 2 to test
		pawnPieceTestTeamTwo = new PawnPiece(positionPiecePawn, "",2);
		
		ArrayList<Point> listPointMovesTeamTwo = null;						//List to store the points of movements from the pawn
		listPointMovesTeamTwo = pawnPieceTestTeamTwo.pointMovesPiece();
		
		assertMoves(MovesPieceTestHelper.getPointsFirstMovePawn(2), listPointMovesTeamTwo);
		
		pawnPieceTestTeamTwo.makeFirstMove();
		
		pawnPieceTestTeamTwo.finalize();
		
		listPointMovesTeamTwo = pawnPieceTestTeamTwo.pointMovesPiece();
		assertMoves(MovesPieceTestHelper.getPointsMovePawn(2), listPointMovesTeamTwo);
	}
	
	/* AssertMoves verifica se os movimentos gerados estao de acordo com os movimentos esperados que a pe�a possa realizar */
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
			{//Compara se os elementos da lista MovesTestHelper estão na lista gerada por você
				Assert.assertTrue(false);//se não tiver Teste deu errado
				throw new Exception();//encerra função
			}
		}
		Assert.assertTrue(true);//Se a função não foi encerrada Teste Deu certo!
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
