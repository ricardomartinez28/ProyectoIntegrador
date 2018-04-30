import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CrearAreas extends JFrame{
	private JLabel lblCrearArea;
	private JTextField txtNomArea;
	private JTextField txtDescripcion;
	private JButton btnValidar;
	public CrearAreas() {
		
		super("Crear áreas");
		inicializar();
		
	}
	
	public void inicializar() {
		
		getContentPane().setBackground(new Color(240, 255, 240));
		getContentPane().setLayout(null);
		
		lblCrearArea = new JLabel("Crear área");
		lblCrearArea.setForeground(new Color(51, 51, 51));
		lblCrearArea.setFont(new Font("Baskerville", Font.PLAIN, 22));
		lblCrearArea.setBounds(0, 18, 444, 16);
		getContentPane().add(lblCrearArea);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(18, 62, 61, 16);
		getContentPane().add(lblNombre);
		
		txtNomArea = new JTextField();
		txtNomArea.setText("Nombre del área");
		txtNomArea.setBounds(91, 57, 130, 26);
		getContentPane().add(txtNomArea);
		txtNomArea.setColumns(10);
		
		JLabel lblDescripcin = new JLabel("Descripción:");
		lblDescripcin.setBounds(18, 102, 79, 16);
		getContentPane().add(lblDescripcin);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setText("Breve Descripción");
		txtDescripcion.setBounds(101, 97, 212, 103);
		getContentPane().add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		btnValidar = new JButton("Validar");
		btnValidar.setBounds(196, 212, 117, 29);
		getContentPane().add(btnValidar);
	}
	
	public void hacerVisible() {
		
		setVisible(true);
	}
}
