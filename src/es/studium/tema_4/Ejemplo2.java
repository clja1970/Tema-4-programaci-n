package es.studium.tema_4;

import java.awt.Frame;
public class Ejemplo2 extends Frame 
{
	
	private static final long serialVersionUID = 1L;
	public Ejemplo2() 
	{
		setTitle("Login");
		setBounds(100, 100, 400, 400);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ejemplo2();
	}
}

