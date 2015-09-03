/* Classe PecaRainha
 * Representa a pe�a Rainha do jogo de xadrez 
 */
package model;

import java.awt.Point;
import java.util.ArrayList;

public class PecaRainha extends Peca {

	
	
	/* M�todo construtor padrao */
	public PecaRainha()
	{
		super();
	}
	
	/* M�todo construtor com atributos */
	public PecaRainha(Point posicaoPeca, String caminhoImagemPeca)
	{
		super(posicaoPeca,caminhoImagemPeca,NOMERAINHA);
	}
	
	
	
	@Override
	public ArrayList<Point> pontosPossivelMover() 
	{
		ArrayList<Point> listaPontosMovimento = null;				//Pontos para os quais a rainha pode mover-se
		listaPontosMovimento = new ArrayList<Point>();
		
		/* Movimentos para a parte inferior do tabuleiro */
		
		for(int linha = 0; linha<8; linha++ )
		{
			for(int coluna = 0; coluna <8; coluna++)
			{
				if(coluna == linha)
				{
					super.adicionaPontoLista(coluna, linha, listaPontosMovimento);
				}
				else if( (coluna + linha) == (this.getPosicaoPeca().getX()
						+ this.getPosicaoPeca().getY()))
				{
					super.adicionaPontoLista(coluna, linha, listaPontosMovimento);
				}
				else if( (coluna == this.getPosicaoPeca().getX()) ||
						linha == this.getPosicaoPeca().getY())
				{
					super.adicionaPontoLista(coluna, linha, listaPontosMovimento);
				}
			}
		}

		return listaPontosMovimento;
	}
	
}
