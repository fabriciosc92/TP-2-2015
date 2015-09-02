/* Classe de teste ModeloPecaTeste
 * Respons�vel pelos testes unitarios da classe abstrata Peca 
 */
package testesUnitarios;

import java.awt.Point;
import java.util.ArrayList;
import model.PecaRei;
import org.junit.Assert;
import org.junit.Test;

public class ModeloPecaTeste
{
	/* Metodo de teste de movimento da peca Rei */
	@Test
	public void testeMovimentoRei() throws Exception
	{
		int posicaoX = MovimentosPecas.COLUNA;			//Posicao inicial da cordenada x
		int posicaoY = MovimentosPecas.LINHA;			//Posicao inicial da cordenada y
		Point posicaoPecaRei = null;					//Declara posicao da peca rei
		
		posicaoPecaRei =  new Point(posicaoX, posicaoY);
		
		PecaRei pecaReiTestada = null;					//Declara peca rei;
		
		pecaReiTestada = new PecaRei(posicaoPecaRei, "");
		
		ArrayList<Point> listaPontosMovimentos = null;	//Lista que ir� armazena os pontos de movimento do rei
		
		listaPontosMovimentos = pecaReiTestada.possivelMoverPosicoes();
		
		assertMoves(MovimentosPecas.movimentosRei(), listaPontosMovimentos);
	}
	
	/* AssertMoves verifica se os movimentos gerados estao de acordo com os movimentos esperados que a pe�a possa realizar */
	private void assertMoves(ArrayList<Point> movimentosEsperados, 
							ArrayList<Point> movimentosRealizados) throws Exception 
	{		
		if ( movimentosEsperados.size() != movimentosRealizados.size() )
		{//Compara o tamanho das duas listas
			Assert.assertTrue(false);
			throw new Exception();
		}

		for (Point pontoMovimentoEsperado : movimentosEsperados)
		{//Percorre a lista elemento por elemento
			if (!movimentosRealizados.contains(pontoMovimentoEsperado)) 
			{//Compara se os elementos da lista MovesTestHelper estão na lista gerada por você
				Assert.assertTrue(false);//se não tiver Teste deu errado
				throw new Exception();//encerra função
			}
		}
		Assert.assertTrue(true);//Se a função não foi encerrada Teste Deu certo!
	}
	
}
