package es.studium.tema_4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class AwtCheckbox2 extends Frame implements ActionListener, WindowListener
{
private static final long serialVersionUID = 1L;
//En este caso, primero se define un grupo
CheckboxGroup chkgrGrupo = new CheckboxGroup();
// Al crear los checkboxes, se indica la etiqueta, si está o no
// activo y el grupo al que pertenece. En un grupo, solamente
// podrá estar activo un checkbox
Checkbox chkUno = new Checkbox("Opción Uno", false, chkgrGrupo);
Checkbox chkDos = new Checkbox("Opción Dos", false, chkgrGrupo);
Checkbox chkTres = new Checkbox("Opción Tres", false, chkgrGrupo);
public AwtCheckbox2()
{
setLayout(new FlowLayout());
setTitle("Botones de Opción excluyentes");
add(chkUno);
add(chkDos);
add(chkTres);
setLocationRelativeTo(null);
addWindowListener(this);
setSize(100,150);
setVisible(true);
}
public static void main(String[] args)
{
new AwtCheckbox2();
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
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}