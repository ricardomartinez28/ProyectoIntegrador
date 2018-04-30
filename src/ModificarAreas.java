import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ModificarAreas extends JFrame{
	private JComboBox cmbbxArea;
	private JLabel lblSelecArea;
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	private JLabel lblDescripcion;
	public ModificarAreas() {
		
		super("Modificar áreas");
		inicializar();
		
	}
	
	public void inicializar() {
		
		getContentPane().setBackground(new Color(240, 255, 240));
		getContentPane().setLayout(null);
		
		JLabel lblModAreas = new JLabel("Modificar áreas");
		lblModAreas.setFont(new Font("Baskerville", Font.PLAIN, 22));
		lblModAreas.setBounds(6, 6, 444, 27);
		getContentPane().add(lblModAreas);
		
		lblSelecArea = new JLabel("Selecciona el área:");
		lblSelecArea.setBounds(6, 65, 147, 21);
		getContentPane().add(lblSelecArea);
		
		cmbbxArea = new JComboBox();
		cmbbxArea.setBounds(135, 63, 167, 27);
		getContentPane().add(cmbbxArea);
		
		JLabel lblNombre = new JLabel("Nuevo Nombre: ");
		lblNombre.setBounds(6, 120, 102, 27);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(135, 120, 217, 27);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		lblDescripcion = new JLabel("Nueva descripción:");
		lblDescripcion.setBounds(6, 178, 120, 21);
		getContentPane().add(lblDescripcion);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(138, 178, 283, 73);
		getContentPane().add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
	}
	
	public void hacerVisible() {
		
		setVisible(true);
		
	}
	
	
	

}
