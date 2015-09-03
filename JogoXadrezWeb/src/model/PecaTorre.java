/* Classe PecaTorre
 * Representa a pe�a torre do jogo de Xadrez
 */
package model;

import java.awt.Point;
import java.util.ArrayList;

public class PecaTorre extends Peca {

	/* Construtor Padrao */
	public PecaTorre() 
	{
		super();
	}
	/* Construtor com par�metros */
	public PecaTorre(Point posicaoPeca, String caminhoImagemPeca)
	{
		super(posicaoPeca, caminhoImagemPeca, NOMETORRE);
	}
	
	/* Sobrescrita do m�todo abstrato */
	@Override
	public ArrayList<Point> pontosPossivelMover() 
	{
		ArrayList<Point> listaPontosMovimento = null;				//Lista de pontos de possiveis movimentos
		listaPontosMovimento = new ArrayList<Point>();
		
		for(int indicadorPosicao = 0; indicadorPosicao < 8; indicadorPosicao++)
		{
			super.adicionaPontoLista(super.getPosicaoPecaColuna(), indicadorPosicao,
									listaPontosMovimento);
			super.adicionaPontoLista(indicadorPosicao, super.getPosicaoPecaLinha(),
									listaPontosMovimento);
		}
		return listaPontosMovimento;
	}

}
