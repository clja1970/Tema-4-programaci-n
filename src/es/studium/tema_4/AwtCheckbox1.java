package es.studium.tema_4;
import java.awt.*;
public class AwtCheckbox1 extends Frame
{
private static final long serialVersionUID = 1L;
//En este caso, se pueden elegir todas las opciones que queramos
Checkbox chkUno = new Checkbox("Opci�n Uno");
Checkbox chkDos = new Checkbox("Opci�n Dos");
Checkbox chkTres = new Checkbox("Opci�n Tres");
public AwtCheckbox1()
{
setLayout(new FlowLayout());
setTitle("Botones de Opci�n");
add(chkUno);
add(chkDos);
add(chkTres);
setLocationRelativeTo(null);
setSize(100,150);
setVisible(true);
}
public static void main(String[] args)
{
new AwtCheckbox1();
}
}

