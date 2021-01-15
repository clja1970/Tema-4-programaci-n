package es.studium.tema_4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.TextField;
public class Distribucion extends Frame
{
private static final long serialVersionUID = 1L;
public Distribucion()
{
setTitle("Ejemplo GridBagLayout");
setLayout (new GridBagLayout());
// A�adir componentes
TextArea txtArea = new TextArea("Area texto");
GridBagConstraints constraints = new GridBagConstraints();
// El �rea de texto empieza en la columna cero
constraints.gridx = 0;
// El �rea de texto empieza en la fila cero
constraints.gridy = 0;
// El �rea de texto ocupa dos columnas
constraints.gridwidth = 2;
// El �rea de texto ocupa 2 filas
constraints.gridheight = 2;
 add (txtArea, constraints);

 Button btnBoton1 = new Button ("Boton 1");
 constraints.gridx = 2;
 constraints.gridy = 0;
 constraints.gridwidth = 1;
 constraints.gridheight = 1;
add (btnBoton1, constraints);
 Button btnBoton2 = new Button ("Boton 2");
 constraints.gridx = 2;
 constraints.gridy = 1;
 constraints.gridwidth = 1;
 constraints.gridheight = 1;
add (btnBoton2, constraints);
 Button btnBoton3 = new Button ("Boton 3");
 constraints.gridx = 0;
 constraints.gridy = 2;
 constraints.gridwidth = 1;
 constraints.gridheight = 1;
 add (btnBoton3, constraints);
 Button btnBoton4 = new Button ("Boton 4");
 constraints.gridx = 2;
 constraints.gridy = 2;
 constraints.gridwidth = 1;
 constraints.gridheight = 1;
 add (btnBoton4, constraints);
 TextField txtCampo = new TextField ("Campo texto");
 constraints.gridx = 1;
 constraints.gridy = 2;
 constraints.gridwidth = 1;
 constraints.gridheight = 1;
 add (txtCampo, constraints);
setLocationRelativeTo(null);
setSize(550,250);
setVisible(true);
}
public static void main(String[] args)
{
new Distribucion();
}
}
