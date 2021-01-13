package es.studium.tema_4;
// Este ejemplo solamente sirve para ver c�mo se implementa un Frame
// con este tipo de Distribuci�n. Pero no podremos ver c�mo pasar
// de una panel a otro hasta no ver la Gesti�n de Eventos
// En ese cap�tulo acabaremos este programa
import java.awt.*;
public class AwtCard extends Frame
{
private static final long serialVersionUID = 1L;
// Creamos un par de paneles
Panel pnlCard = new Panel();
Panel pnlAc = new Panel();
// Creamos un Choice o Lista de Selecci�n
Choice choC = new Choice();
// Cadenas constantes (final) que insertaremos en el Choice
final static String strPanelBoton = "Panel con Botones";
final static String strPanelTexto = "Panel con Campo de Texto";
// Creamos otros dos panels que ir�n dentro del Panel card
Panel pnlP1 = new Panel();
Panel pnlP2 = new Panel();
Button btnB1 = new Button("Bot�n 1");
Button btnB2 = new Button("Bot�n 2");
Button btnB3 = new Button("Bot�n 3");
// Creamos un TextField o Campo de Texto de tama�o 20
TextField txtTexto = new TextField( "Texto",20 );
public AwtCard()
{
// Establecer distribuci�n del Frame
setLayout( new BorderLayout() );
// A�adir elementos al Choice
 choC.addItem(strPanelBoton);
 choC.addItem(strPanelTexto);
// A�adir el Choice al panel pnlAc
pnlAc.add(choC);
// A�adir el panel pnlAc al Frame en la parte superior
add( "North", pnlAc );
// Establecer distribuci�n del panel card
pnlCard.setLayout( new CardLayout() );
// A�adir botones al panel pnlP1
 pnlP1.add(btnB1);
 pnlP1.add(btnB2);
 pnlP1.add(btnB3);
 // A�adir TextField al panel pnlP2
pnlP2.add(txtTexto);
 // A�adir los panels pnlP1 y pnlP2 al panel pnlCard
pnlCard.add(strPanelBoton, pnlP1);
pnlCard.add(strPanelTexto, pnlP2);
// A�adir el panel pnlCard al Frame en el centro
 add( "Center", pnlCard);
// Establecer el tama�o del Frame
setSize(200,200);
// Centra la ventana en la pantalla
setLocationRelativeTo(null);
// Mostrar el Frame en pantalla
setVisible(true);
}
// Fin del Constructor
public static void main(String[] args)
{
new AwtCard();
}
// Fin del main
}
//Fin de la clase