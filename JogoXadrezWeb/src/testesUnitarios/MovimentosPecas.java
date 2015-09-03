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
		int posicaoInicialColuna =0; 												//Coluna inicial onde estará a peça no tabuleiro
		posicaoInicialColuna =  COLUNA;
		int posicaoInicialLinha = 0;											//Linha inicial onde estará a peça no tabuleiro
		posicaoInicialLinha = LINHA;
		ArrayList<Point> pontosPossiveisMovimentoRei = null; 						//Lista para pontos de movimentos do rei
		pontosPossiveisMovimentoRei = new ArrayList<Point>();

		pontosPossiveisMovimentoRei.add(new Point(posicaoInicialColuna + 1, posicaoInicialLinha + 1));
		pontosPossiveisMovimentoRei.add(new Point(posicaoInicialColuna + 0, posicaoInicialLinha + 1));
		pontosPossiveisMovimentoRei.add(new Point(posicaoInicialColuna - 1, posicaoInicialLinha + 1));
		pontosPossiveisMovimentoRei.add(new Point(posicaoInicialColuna - 1, posicaoInicialLinha + 0));
		pontosPossiveisMovimentoRei.add(new Point(posicaoInicialColuna - 1, posicaoInicialLinha - 1));
		pontosPossiveisMovimentoRei.add(new Point(posicaoInicialColuna + 0, posicaoInicialLinha - 1));
		pontosPossiveisMovimentoRei.add(new Point(posicaoInicialColuna + 1, posicaoInicialLinha - 1));
		pontosPossiveisMovimentoRei.add(new Point(posicaoInicialColuna + 1, posicaoInicialLinha + 0));
		return pontosPossiveisMovimentoRei;
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
	

}
