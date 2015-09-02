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
		int posicaoX = COLUNA;											//Cordenada X do tabuleiro
		int posicaoY = LINHA;											//Cordenada Y do tabuleiro
		ArrayList<Point> pontosPossiveisMovimentoRei = null; 			//Lista para pontos de movimentos do rei
		pontosPossiveisMovimentoRei = new ArrayList<Point>();

		pontosPossiveisMovimentoRei.add(new Point(posicaoX + 1, posicaoY + 1));
		pontosPossiveisMovimentoRei.add(new Point(posicaoX + 0, posicaoY + 1));
		pontosPossiveisMovimentoRei.add(new Point(posicaoX - 1, posicaoY + 1));
		pontosPossiveisMovimentoRei.add(new Point(posicaoX - 1, posicaoY + 0));
		pontosPossiveisMovimentoRei.add(new Point(posicaoX - 1, posicaoY - 1));
		pontosPossiveisMovimentoRei.add(new Point(posicaoX + 0, posicaoY - 1));
		pontosPossiveisMovimentoRei.add(new Point(posicaoX + 1, posicaoY - 1));
		pontosPossiveisMovimentoRei.add(new Point(posicaoX + 1, posicaoY + 0));
		return pontosPossiveisMovimentoRei;
	}
	

}
