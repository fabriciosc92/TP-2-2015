/* Classe ModeloPecaTestePadrao 
 * Contera o que é esperado ao utilizar os metodos da classe modelo Peca 
 */
package testesUnitarios;

import java.awt.Point;
import java.util.ArrayList;


public class MovimentosPecas {
	static final int COLUNA = 4;				//constante para posicao inicial
	static final int LINHA = 4;					//constante para posicao inicial
	
	static ArrayList<Point> movimentosRei()
	{
		int posicaoColuna = 0; 												//Coluna inicial onde estará a peça no tabuleiro
		posicaoColuna =  COLUNA;
		int posicaoLinha = 0;											//Linha inicial onde estará a peça no tabuleiro
		posicaoLinha = LINHA;
		ArrayList<Point> pontosMovimentoRei = null; 						//Lista para pontos de movimentos do rei
		pontosMovimentoRei = new ArrayList<Point>();

		pontosMovimentoRei.add(new Point(posicaoColuna + 1, posicaoLinha + 1));
		pontosMovimentoRei.add(new Point(posicaoColuna + 0, posicaoLinha + 1));
		pontosMovimentoRei.add(new Point(posicaoColuna - 1, posicaoLinha + 1));
		pontosMovimentoRei.add(new Point(posicaoColuna - 1, posicaoLinha + 0));
		pontosMovimentoRei.add(new Point(posicaoColuna - 1, posicaoLinha - 1));
		pontosMovimentoRei.add(new Point(posicaoColuna + 0, posicaoLinha - 1));
		pontosMovimentoRei.add(new Point(posicaoColuna + 1, posicaoLinha - 1));
		pontosMovimentoRei.add(new Point(posicaoColuna + 1, posicaoLinha + 0));
		return pontosMovimentoRei;
	}
	static ArrayList<Point> movimentosRainha(){
		
		int posicaoColuna = 0;					//Coluna inicial onde estará a peça no tabuleiro
		posicaoColuna = COLUNA;
		int posicaoLinha = 0;					//Linha inicial onde estará a peça no tabuleiro
		posicaoLinha = LINHA;
		ArrayList<Point> pontosDosMovimentosRainha = null;				//Lista que irá armazenar pontos que a rainha pode mover
		pontosDosMovimentosRainha = new ArrayList<Point>();

		pontosDosMovimentosRainha.add(new Point(posicaoColuna - 4, posicaoLinha));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna - 3, posicaoLinha));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna - 2, posicaoLinha));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna - 1, posicaoLinha));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna + 1, posicaoLinha));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna + 2, posicaoLinha));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna + 3, posicaoLinha));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna, posicaoLinha - 4));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna, posicaoLinha - 3));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna, posicaoLinha - 2));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna, posicaoLinha - 1));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna, posicaoLinha + 1));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna, posicaoLinha + 2));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna, posicaoLinha + 3));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna - 1, posicaoLinha + 1));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna - 2, posicaoLinha + 2));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna - 3, posicaoLinha + 3));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna - 1, posicaoLinha - 1));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna - 2, posicaoLinha - 2));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna - 3, posicaoLinha - 3));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna - 4, posicaoLinha - 4));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna + 1, posicaoLinha + 1));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna + 2, posicaoLinha + 2));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna + 3, posicaoLinha + 3));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna + 1, posicaoLinha - 1));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna + 2, posicaoLinha - 2));
		pontosDosMovimentosRainha.add(new Point(posicaoColuna + 3, posicaoLinha - 3));
		
		return pontosDosMovimentosRainha;
		
	}
	/* Movimentos da torre */
	public static ArrayList<Point> movimentosTorre() {
		int posicaoColuna = 0;										//Posição inicial da coluna
		posicaoColuna = COLUNA;
		int posicaoLinha = 0;										//Posição inicial da linha
		posicaoLinha = LINHA;
		
		ArrayList<Point> pontosMovimentosTorre = null;							//Lista para possíveis pontos
		pontosMovimentosTorre = new ArrayList<Point>();

		pontosMovimentosTorre.add(new Point(posicaoColuna - 4, posicaoLinha));
		pontosMovimentosTorre.add(new Point(posicaoColuna - 3, posicaoLinha));
		pontosMovimentosTorre.add(new Point(posicaoColuna - 2, posicaoLinha));
		pontosMovimentosTorre.add(new Point(posicaoColuna - 1, posicaoLinha));
		pontosMovimentosTorre.add(new Point(posicaoColuna + 1, posicaoLinha));
		pontosMovimentosTorre.add(new Point(posicaoColuna + 2, posicaoLinha));
		pontosMovimentosTorre.add(new Point(posicaoColuna + 3, posicaoLinha));
		pontosMovimentosTorre.add(new Point(posicaoColuna, posicaoLinha - 4));
		pontosMovimentosTorre.add(new Point(posicaoColuna, posicaoLinha - 3));
		pontosMovimentosTorre.add(new Point(posicaoColuna, posicaoLinha - 2));
		pontosMovimentosTorre.add(new Point(posicaoColuna, posicaoLinha - 1));
		pontosMovimentosTorre.add(new Point(posicaoColuna, posicaoLinha + 1));
		pontosMovimentosTorre.add(new Point(posicaoColuna, posicaoLinha + 2));
		pontosMovimentosTorre.add(new Point(posicaoColuna, posicaoLinha + 3));

		return pontosMovimentosTorre;
	}

}
