/* Classe PecaTorre
 * Representa a peça torre do jogo de Xadrez
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
	/* Construtor com parâmetros */
	public PecaTorre(Point posicaoPeca, String caminhoImagemPeca, String nomePeca)
	{
		super(posicaoPeca, caminhoImagemPeca, NOMETORRE);
	}
	
	/* Sobrescrita do método abstrato */
	@Override
	public ArrayList<Point> pontosPossivelMover() 
	{
		
		return null;
	}

}
