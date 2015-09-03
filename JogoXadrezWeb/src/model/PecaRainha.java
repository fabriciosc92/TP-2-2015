/* Classe PecaRainha
 * Representa a peça Rainha do jogo de xadrez 
 */
package model;

import java.awt.Point;
import java.util.ArrayList;

public class PecaRainha extends Peca {

	
	
	/* Método construtor padrao */
	public PecaRainha()
	{
		super();
	}
	
	/* Método construtor com atributos */
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
				else if( (coluna + linha) == 
						(super.getPosicaoPecaColuna() + super.getPosicaoPecaLinha()))
				{
					super.adicionaPontoLista(coluna, linha, listaPontosMovimento);
				}
				else if( (coluna == super.getPosicaoPecaColuna()) ||
						linha == super.getPosicaoPecaLinha())
				{
					super.adicionaPontoLista(coluna, linha, listaPontosMovimento);
				}
			}
		}

		return listaPontosMovimento;
	}
	
}
