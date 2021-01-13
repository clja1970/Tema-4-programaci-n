package es.studium.tema_4;

import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EjemploCanvas implements WindowListener, KeyListener
{
        Frame ventana = new Frame("Canvas");
        Canvas lienzo = new Canvas();
        
        public EjemploCanvas()
        {
                ventana.setSize(250,100);
                ventana.setLayout(new FlowLayout());
                ventana.add(lienzo);
                lienzo.requestFocus();
                ventana.addKeyListener(this);
                ventana.setResizable(false);
                ventana.setLocationRelativeTo(null);
                ventana.addWindowListener(this);
                ventana.setVisible(true);
        }
        
        public static void main(String[] args)
        {
                new EjemploCanvas();
        }
        @Override
        public void windowClosing(WindowEvent arg0)
        {
                System.out.println("Saliendo...");
                System.exit(0);
        }
        @Override
        public void windowActivated(WindowEvent arg0){}
        @Override
        public void windowClosed(WindowEvent arg0){}
        @Override
        public void windowDeactivated(WindowEvent arg0){}
        @Override
        public void windowDeiconified(WindowEvent e){}
        @Override
        public void windowIconified(WindowEvent e){}
        @Override
        public void windowOpened(WindowEvent e){}

        @Override
        public void keyPressed(KeyEvent pulsacion)
        {
                System.out.println("Pulsaste un tecla con código..."+pulsacion.getKeyCode());
        }

        @Override
        public void keyReleased(KeyEvent arg0)
        {
        	System.out.println("Soltaaste un tecla...");
                
        }

        @Override
        public void keyTyped(KeyEvent arg0)
        {
        	System.out.println("Pulsaste un tecla ... 2");
                
        }
}


