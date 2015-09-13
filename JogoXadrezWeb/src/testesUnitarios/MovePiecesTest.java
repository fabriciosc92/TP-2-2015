/* Test class MovePiecesTest
 * Responsible for unitary tests of abstract Piece class 
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
	/* Test Method movement of the KingPiece */
	@Test
	public void moveKingTest() throws Exception,Throwable
	{
		
		Point positionPieceaKing = null;								//Declares position of the piece king
		
		positionPieceaKing =  createPositionInitial();
		
		KingPiece kingPieceTest = null;								//Declares piece king;
		
		kingPieceTest = new KingPiece(positionPieceaKing, "");
		
		ArrayList<Point> listPointMoves = null;				//List of points of possible movements
		
		listPointMoves = kingPieceTest.pointMovesPiece();
		
		kingPieceTest.finalize();
		
		assertMoves(MovesPieceTestHelper.getPointsMoveKing(), listPointMoves);
		
	}
	
	/* Test Method movement of the QueenPiece */
	@Test
	public void moveQueenTest() throws Exception,Throwable
	{
		Point positionPieceQueen = null;								//Declares position of the piece queen
		positionPieceQueen = createPositionInitial();
		
		QueenPiece queenPieceTest= null;							//Declares piece queen
		queenPieceTest = new QueenPiece(positionPieceQueen, "");
		
		ArrayList<Point> listPointMoves = null;				//List of points of possible movements
		listPointMoves = queenPieceTest.pointMovesPiece();
		
		queenPieceTest.finalize();
		
		assertMoves(MovesPieceTestHelper.getPointsMoveQueen(), listPointMoves);
		
	}
	
	/* Test Method movement of the TowerPiece */
	@Test
	public void moveTowerTest() throws Exception, Throwable
	{
		Point positionPieceTower = null;								//Declares position of the piece tower
		positionPieceTower = createPositionInitial();
		
		TowerPiece towerPieceTest= null;							//Declares piece tower
		towerPieceTest = new TowerPiece(positionPieceTower, "");
		
		ArrayList<Point> listPointMoves = null;				//List of points of possible movements
		listPointMoves = towerPieceTest.pointMovesPiece();
		
		towerPieceTest.finalize();
		
		assertMoves(MovesPieceTestHelper.getPointsMoveTower(), listPointMoves);
	}
	
	
	/* Test Method movement of the BishopPiece */
	@Test
	public void moveBishopTest() throws Exception, Throwable
	{
		Point positionPieceBishop = null;								//Declares position of the piece bishop
		positionPieceBishop = createPositionInitial();
		
		BishopPiece bishopPieceTest= null;							//Declares piece bishop
		bishopPieceTest = new BishopPiece(positionPieceBishop, "");
		
		ArrayList<Point> listPointMoves = null;				//List of points of possible movements
		listPointMoves = bishopPieceTest.pointMovesPiece();
		
		bishopPieceTest.finalize();
		
		assertMoves(MovesPieceTestHelper.getPointsMoveBishop(), listPointMoves);
	}
	
	/* Test Method movement of the KnightPiece */
	@Test
	public void moveKnightTest() throws Exception, Throwable
	{
		Point positionPieceKnight = null;							//Position of Knight piece
		positionPieceKnight = createPositionInitial();
		
		KnightPiece horsePieceTest = null;							//A instance of Knight to test
		horsePieceTest = new KnightPiece(positionPieceKnight, "");
		
		ArrayList<Point> listPointMoves = null;						//List to store the points of movements from the Knight
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
	
	/* AssertMoves 
checks whether the generated movements are consistent with the expected movements that can perform the piece */
	private void assertMoves(ArrayList<Point> listPointsExpected, 
							ArrayList<Point> listPointsPiece) throws Exception 
	{		
		if ( listPointsExpected.size() != listPointsPiece.size() )
		{//Compare the size of two lists
			Assert.assertTrue(false);
			throw new Exception();
		}

		for (Point pointMoveExpected : listPointsExpected)
		{//Through the list element by element
			if (!listPointsPiece.contains(pointMoveExpected)) 
			{//Compares the elements of MovesTestHelper list are on the list generated by you
				Assert.assertTrue(false);//If none test is wrong
				throw new Exception();//Closed function
			}
		}
		Assert.assertTrue(true);//If the function has not been closed test. It worked!
	}
	
	private Point createPositionInitial(){
		int positionInitialColumn = 0;								//Initial position of the column
		positionInitialColumn = MovesPieceTestHelper.COLUMN;
		int positionInitialRow = 0;								//Initial position of the line
		positionInitialRow = MovesPieceTestHelper.ROW;
		Point initialPosition = null;								//Initial position of the point
		initialPosition= new Point(positionInitialColumn,positionInitialRow);
		return initialPosition;		
	}
	
}
