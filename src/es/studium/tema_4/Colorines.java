package es.studium.tema_4;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Colorines
{
	Frame ventana= new Frame ("Colorines");
	Color[] colores= {Color.red, Color.white, Color.green, Color.yellow, Color.blue, Color.magenta, Color.darkGray, Color.cyan, Color.black};
	
	public Colorines() {
		ventana.setBounds(50, 50, 250, 250);
		ventana.setLayout(new GridLayout(3,3));
	for (int i=0;i<9;i++) {
		Panel p= new Panel();
		p.setBackground(colores [i]);
		ventana.add(p);
	}
		ventana.setResizable(false);
		ventana.setVisible(true);
		
		
	}
		
	public static void main(String[] args)
	{
		new Colorines();

	}

}
