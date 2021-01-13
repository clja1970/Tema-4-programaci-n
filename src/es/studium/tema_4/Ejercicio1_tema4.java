package es.studium.tema_4;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;



public class Ejercicio1_tema4
{
	
	Frame ventana = new Frame("");
	Label lblCelsius = new Label("Celcius");
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txtCelsius = new TextField(20);
	TextField txtFahrenheit = new TextField(20);
	Button btnC_F = new Button ("Celsius a Fahrenheit");
	Button btnF_F = new Button ("Fahrenheit a Celsius");
	
	
	//Construcutor
	
	public Ejercicio1_tema4()
	{

		ventana.setTitle("Conversión de temperaturas");
		//Añadir componentes
		ventana.setLayout(new GridLayout(3,2));
		ventana.add(lblCelsius);
		ventana.add(txtCelsius);
		ventana.add(lblFahrenheit);
		ventana.add(txtFahrenheit);
		ventana.add(btnC_F);
		ventana.add(btnF_F);
		ventana.setSize(650, 150);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio1_tema4();
		// Crear objeto de la clase
	}

}
