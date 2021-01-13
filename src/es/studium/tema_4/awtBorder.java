package es.studium.tema_4;

import java.awt.*;
// Declaración de la clase AwtBorder que hereda de la Clase Frame
public class awtBorder extends Frame
{
private static final long serialVersionUID = 1L;
Button btnBotonN = new Button("Norte");
Button btnBotonS = new Button("Sur");
Button btnBotonE = new Button("Este");
 Button btnBotonO = new Button("Oeste");
 Button btnBotonC = new Button("Centro");
// Constructor de la clase con el mismo nombre que ella
public awtBorder()
{
// Establecer la distribución del Frame
 setLayout (new BorderLayout());
// Establecer el título de la aplicación
setTitle ("BorderLayout");
// Añadir los botones antes creados en posición indicada
add( "North", btnBotonN);
add( "South", btnBotonS);
add( "East", btnBotonE);
add( "West", btnBotonO);
add( "Center", btnBotonC);
// Establecer el tamaño del Frame
setSize(200,200);
// Centra la ventana en la pantalla
setLocationRelativeTo(null);
// Mostrar el Frame en pantalla
setVisible(true);
 }
// Fin del Constructor
public static void main(String[] args)
{
new awtBorder();
}
}