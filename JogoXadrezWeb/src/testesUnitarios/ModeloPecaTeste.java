/* Classe de teste ModeloPecaTeste
 * Responsável pelos testes unitarios da classe abstrata Peca 
 */
package testesUnitarios;

import java.awt.Point;
import java.util.ArrayList;

import model.PecaBispo;
import model.PecaRainha;
import model.PecaRei;
import model.PecaTorre;

import org.junit.Assert;
import org.junit.Test;

public class ModeloPecaTeste
{
	/* Metodo de teste de movimento da peca Rei */
	@Test
	public void testeMovimentoRei() throws Exception
	{
		
		Point posicaoPecaRei = null;								//Declara posicao da peca rei
		
		posicaoPecaRei =  criaPosicaoInicial();
		
		PecaRei pecaReiTestada = null;								//Declara peca rei;
		
		pecaReiTestada = new PecaRei(posicaoPecaRei, "");
		
		ArrayList<Point> listaPontosMovimentos = null;				//Lista que irá armazena os pontos de movimento do rei
		
		listaPontosMovimentos = pecaReiTestada.pontosPossivelMover();
		
		assertMoves(MovimentosPecas.pontosMovimentosRei(), listaPontosMovimentos);
	}
	
	/* Teste de movimento da peca Rainha */
	@Test
	public void testeMovimentosRainha() throws Exception
	{
		Point posicaoPecaRainha = null;								//Posicao da peca rainha
		posicaoPecaRainha = criaPosicaoInicial();
		
		PecaRainha pecaRainhaTestada= null;							//Declara peça rainha a ser testada
		pecaRainhaTestada = new PecaRainha(posicaoPecaRainha, "");
		
		ArrayList<Point> listaPontosMovimentos = null;				//Lista que irá armazena os pontos de movimento da rainha
		listaPontosMovimentos = pecaRainhaTestada.pontosPossivelMover();
		
		assertMoves(MovimentosPecas.pontosMovimentosRainha(), listaPontosMovimentos);
		
	}
	
	/* Testa movimentos da torre */
	@Test
	public void testaMovimentosTorre() throws Exception
	{
		Point posicaoPecaTorre = null;								//Posicao da peca torre
		posicaoPecaTorre = criaPosicaoInicial();
		
		PecaTorre pecaTorreTestada= null;							//Declara peça torre a ser testada
		pecaTorreTestada = new PecaTorre(posicaoPecaTorre, "");
		
		ArrayList<Point> listaPontosMovimentos = null;				//Lista que irá armazena os pontos de movimento da rainha
		listaPontosMovimentos = pecaTorreTestada.pontosPossivelMover();
		
		assertMoves(MovimentosPecas.pontosMovimentosTorre(), listaPontosMovimentos);
	}
	
	/* Testa movimentos bispo */
	@Test
	public void testaMovimentosBispo() throws Exception
	{
		Point posicaoPecaBispo = null;								//Posicao da peca bispo
		posicaoPecaBispo = criaPosicaoInicial();
		
		PecaBispo pecaBispoTestada= null;							//Declara peça bispo a ser testada
		pecaBispoTestada = new PecaBispo(posicaoPecaBispo, "");
		
		ArrayList<Point> listaPontosMovimentos = null;				//Lista que irá armazena os pontos de movimento da rainha
		listaPontosMovimentos = pecaBispoTestada.pontosPossivelMover();
		
		assertMoves(MovimentosPecas.pontosMovimentosBispo(), listaPontosMovimentos);
	}
	/* AssertMoves verifica se os movimentos gerados estao de acordo com os movimentos esperados que a peça possa realizar */
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
			{//Compara se os elementos da lista MovesTestHelper estÃ£o na lista gerada por vocÃª
				Assert.assertTrue(false);//se nÃ£o tiver Teste deu errado
				throw new Exception();//encerra funÃ§Ã£o
			}
		}
		Assert.assertTrue(true);//Se a funÃ§Ã£o nÃ£o foi encerrada Teste Deu certo!
	}
	
	private Point criaPosicaoInicial(){
		int posicaoInicalColuna = 0;								//Posicao inicial da coluna
		posicaoInicalColuna = MovimentosPecas.COLUNA;
		int posicaoInicialLinha = 0;								//Posicao inicial da linha
		posicaoInicialLinha = MovimentosPecas.LINHA;
		Point posicaoInicial = null;								//Ponto da posicao inicial
		posicaoInicial= new Point(posicaoInicalColuna,posicaoInicialLinha);
		return posicaoInicial;		
	}
	
}
