/* Classe PecaBispo 
 * Representa o bispo no jogo de xadrez
 */
package model;

import java.awt.Point;
import java.util.ArrayList;

public class PecaBispo extends Peca 
{
	/* Construtor padrao */
	public PecaBispo() 
	{
		super();
	}
	/* Construtor com parâmetros */
	public PecaBispo(Point posicaoPeca, String caminhoImagemPeca)
	{
		super(posicaoPeca, caminhoImagemPeca, NOMEBISPO);
	}
	/* Sobrescrita do metodo da classe abstrata */
	@Override
	public ArrayList<Point> pontosPossivelMover() 
	{
		ArrayList<Point> listaPontosMovimento = null;			//Lista de pontos de possiveis movimentos
		listaPontosMovimento = new ArrayList<Point>();
		
		int linhaDiagonalSecundaria = 0;						//Linha usada no laço de repetição para diagonal segundaria
		int colunaDiagonalSecundaria = 0;						//Coluna usada no laço de repetição para diagonal segundaria
				
		
		for(linhaDiagonalSecundaria = -7, colunaDiagonalSecundaria = 7;
			(linhaDiagonalSecundaria <= 7 && colunaDiagonalSecundaria >= -7);
			linhaDiagonalSecundaria++, colunaDiagonalSecundaria--)
		{
			super.adicionaPontoLista(super.getPosicaoPecaColuna() + colunaDiagonalSecundaria,
									super.getPosicaoPecaLinha() + linhaDiagonalSecundaria, listaPontosMovimento);
		}
		
		
		for(int diagonalPricipal = -7; diagonalPricipal <= 7; diagonalPricipal++)
		{
			super.adicionaPontoLista(getPosicaoPecaColuna()+diagonalPricipal, 
									getPosicaoPecaLinha()+diagonalPricipal, listaPontosMovimento);
		}
		
		return listaPontosMovimento;
	}

}
