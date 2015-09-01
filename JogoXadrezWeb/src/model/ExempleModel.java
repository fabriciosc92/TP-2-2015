package model;

import java.awt.Point;

public class ExempleModel
{
	private Point pontos;
	
	public ExempleModel(int i, int j)
	{
		pontos = new Point(i,j);
	}
	
	public String toString()
	{
		return pontos.x+","+pontos.y;
	}
}
