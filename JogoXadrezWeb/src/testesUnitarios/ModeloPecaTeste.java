/* Classe de teste ModeloPecaTeste
 * Respons�vel pelos testes unitarios da classe abstrata Peca 
 */
package testesUnitarios;

import java.awt.Point;
import java.util.ArrayList;

import model.PecaRainha;
import model.PecaRei;
import org.junit.Assert;
import org.junit.Test;

public class ModeloPecaTeste
{
	/* Metodo de teste de movimento da peca Rei */
	@Test
	public void testeMovimentoRei() throws Exception
	{
		int posicaoInicalColuna = 0;								//Posicao inicial da coluna
		posicaoInicalColuna = MovimentosPecas.COLUNA;
		int posicaoInicialLinha = 0;								//Posicao inicial da linha
		posicaoInicialLinha = MovimentosPecas.LINHA;
		Point posicaoPecaRei = null;								//Declara posicao da peca rei
		
		posicaoPecaRei =  new Point(posicaoInicalColuna, posicaoInicialLinha);
		
		PecaRei pecaReiTestada = null;								//Declara peca rei;
		
		pecaReiTestada = new PecaRei(posicaoPecaRei, "");
		
		ArrayList<Point> listaPontosMovimentos = null;				//Lista que ir� armazena os pontos de movimento do rei
		
		listaPontosMovimentos = pecaReiTestada.pontosPossivelMover();
		
		assertMoves(MovimentosPecas.movimentosRei(), listaPontosMovimentos);
	}
	
	/* Teste de movimento da peca Rainha */
	@Test
	public void testeMovimentosRainha() throws Exception
	{
		int posicaoInicalColuna = 0;								//Posicao inicial da coluna
		posicaoInicalColuna = MovimentosPecas.COLUNA;
		int posicaoInicialLinha = 0;								//Posicao inicial da linha
		posicaoInicialLinha = MovimentosPecas.LINHA;
		
		Point posicaoPecaRainha = null;								//Posicao da peca rainha
		posicaoPecaRainha = new Point(posicaoInicalColuna, posicaoInicialLinha);
		
		PecaRainha pecaRainhaTestada= null;							//Declara pe�a rainha a ser testada
		pecaRainhaTestada = new PecaRainha(posicaoPecaRainha, "");
		
		ArrayList<Point> listaPontosMovimentos = null;				//Lista que ir� armazena os pontos de movimento da rainha
		listaPontosMovimentos = pecaRainhaTestada.pontosPossivelMover();
		
		assertMoves(MovimentosPecas.movimentosRainha(), listaPontosMovimentos);
		
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
