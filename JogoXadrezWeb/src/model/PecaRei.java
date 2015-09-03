/* Classe PecaRei
 * Representa a pe�a Rei do jogo de xadrez 
 */
package model;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class PecaRei extends Peca 
{
	/* Metodo construtor padrao */
	public PecaRei()
	{
		super();
	}
	/* Construtor com parametros */
	public PecaRei(Point posicaoPeca, String caminhoImagemPeca)
	{
		super(posicaoPeca, caminhoImagemPeca, NOMEREI);
	}
	
	/* Sobrescrita do metodo de movimentacao da classe peca */
	@Override
	public ArrayList<Point> pontosPossivelMover() {
		ArrayList<Point> listaPontosMovimento = null; 				//Lista que armazenara os pontos para os quais a peca possa ser movida
		listaPontosMovimento = new ArrayList<Point>();
		/* adiciona todos os pontos mesmo */
		for(int coluna=-1; coluna<=1; coluna++)
		{
			for(int linha = -1; linha<=1; linha++)
			{
				super.adicionaPontoLista(getPosicaoPeca().x+coluna,
						getPosicaoPeca().y+linha, listaPontosMovimento);

			}
		}
		return listaPontosMovimento;		
	}
}
