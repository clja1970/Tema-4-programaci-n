package es.studium.tema_4;
import java.awt.*;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class AwtCheckbox1 extends Frame implements ActionListener, WindowListener
{
private static final long serialVersionUID = 1L;
//En este caso, se pueden elegir todas las opciones que queramos
Checkbox chkUno = new Checkbox("Opci�n Uno");
Checkbox chkDos = new Checkbox("Opci�n Dos");
Checkbox chkTres = new Checkbox("Opci�n Tres");
Button btncancelar = new Button("Cancelar");
public AwtCheckbox1()
{
setLayout(new FlowLayout());
setTitle("Botones de Opción");
add(chkUno);
add(chkDos);
add(chkTres);
add(btncancelar);
setLocationRelativeTo(null);
btncancelar.addActionListener(this);
addWindowListener(this);
setSize(100,150);
setVisible(true);
}
public static void main(String[] args)
{
new AwtCheckbox1();
}
@Override
public void windowOpened(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosing(WindowEvent e) {
	// TODO Auto-generated method stub
	  System.exit(0);
}
@Override
public void windowClosed(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowIconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeiconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowActivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeactivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent eventoGenerado)
{
        
        if(eventoGenerado.getSource().equals(btncancelar))
        {
                System.out.println("Hasta luego Lucas...");
                System.exit(0);
        }
}
}

