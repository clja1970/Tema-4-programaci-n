package es.studium.tema_4;

import java.awt.Frame;

public class Ejemplo1 
{

	Frame ventana = new Frame();
	public Ejemplo1()
	{
		ventana.setTitle("Login");
		ventana.setBounds(100, 100, 400, 400);
		ventana.setResizable(false);
		ventana.setVisible(true);
			
	}

	public static void main(String[] args) {
		new Ejemplo1();	}
}
