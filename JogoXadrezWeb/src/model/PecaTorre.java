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
	public PecaTorre(Point posicaoPeca, String caminhoImagemPeca, String nomePeca)
	{
		super(posicaoPeca, caminhoImagemPeca, NOMETORRE);
	}
	
	/* Sobrescrita do m�todo abstrato */
	@Override
	public ArrayList<Point> pontosPossivelMover() 
	{
		
		return null;
	}

}
