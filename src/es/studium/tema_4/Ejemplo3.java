package es.studium.tema_4;

import java.awt.Frame;
public class Ejemplo3 extends Frame 
{

	private static final long serialVersionUID = 1L;
	public Ejemplo3(int x, int y) 
	{
		setTitle("Login");
		setBounds(x, y, 200, 200);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		int i,x,y;
		x = 100;
		y = 100;
		for (i=0;i<50;i++) 
		{
			new Ejemplo3(x,y);
			x=x+10;
			y=y+10;
		}
	}
}
