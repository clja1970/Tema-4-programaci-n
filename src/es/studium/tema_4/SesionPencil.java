package es.studium.tema_4;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Button;
import java.awt.FlowLayout;
import java.util.Scanner;

public class SesionPencil extends Frame implements ActionListener, WindowListener
{
	
	private static final long serialVersionUID = 1L;
	
	Label usuario = new Label("Usuario");
	Label contra = new Label ("Contraseña");
	Button aceptar = new Button("Aceptar");
	Button cancelar = new Button("Cancelar");
	TextField nombre = new TextField(20);
	TextField contras = new TextField(20);
	
	Frame ventana= new Frame("");
	public SesionPencil()
	{
		Scanner teclado = new Scanner (System.in);
		int i,j;
		do {
		System.out.println("Pon la ventana donde quieras de ancho entre(100-900)");
		i=teclado.nextInt();
		System.out.println("Pon la ventana donde quieras de alto (100-700)");
		j=teclado.nextInt();
		}while (i<100 ||i>900 || j<100 || j>700);
		teclado.close();
		ventana.setLayout(new FlowLayout());
		ventana.setTitle("Sesión");
		ventana.setBounds(i, j, 300, 150);
		ventana.add(usuario);
		ventana.add(nombre);
		ventana.add(contra);
		ventana.add(contras);
		ventana.add(aceptar);
		ventana.add(cancelar);
		cancelar.addActionListener(this);
		ventana.addWindowListener(this);
		ventana.setResizable(true);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new SesionPencil();
	}
	public void actionPerformed1(ActionEvent eventoGenerado)
    {
            
            if(eventoGenerado.getSource().equals(cancelar))
            {
                    System.out.println("Hasta luego Lucas...");
                    System.exit(0);
            }
    }
	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0);
		}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

}
