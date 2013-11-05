/**
 * Descripci—n: Clase definitoria de la subventana "Ayuda" del programa.
 *   
 * Implementado:     - Implementar campo de texto y su contenido (v0.010)
 *                   - Implementar bot—n "cerrar" (v0.010)
 * 
 * Por implementar:  - Implementar el atributo "archivoTexto_" y usarlo en el campo de 
 *                     texto (v0)
 *                   
 */

package interfazGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class VentanaAyuda extends JDialog {
	//______________________________________
    // Atributos constantes predeterminados:
	
	static final int POS_X = 100;
	static final int POS_Y = 100;
	static final int ANCHO_VENT = 400;
	static final int ALTO_VENT = 200;
	static final String TITULO = "Ayuda al usuario.";
	static final String TEXTO = " + Este programa ha sido realizado para el visionado y  \n"
			                  + "      la edici—n de im‡genes.\n"
			                  + " \n"
			                  + " \n"
			                  + " \n";
		
    //_______________
	// Constructores:
	
	public VentanaAyuda () {
		inicializar (POS_X, POS_Y, ANCHO_VENT, ALTO_VENT, TITULO, TEXTO);
	}
	public VentanaAyuda (String titulo, String texto) {
		inicializar (POS_X, POS_Y, ANCHO_VENT, ALTO_VENT, titulo, texto);
	}
	public VentanaAyuda (int ancho, int alto) {
		inicializar (POS_X, POS_Y, ancho, alto, TITULO, TEXTO);
	}
	public VentanaAyuda (int ancho, int alto, String titulo, String texto) {
		inicializar (POS_X, POS_Y, ancho, alto, titulo, texto);
	}
	public VentanaAyuda (int posX, int posY, int ancho, int alto, String titulo, String texto) {
		inicializar (posX, posY, ancho, alto, titulo, texto);
	}
	
	    
	//__________________
	// MŽtodos pœblicos:
    public void actualizarTexto () {
    	getElCampoTexto_().setText(getElTexto_());
    }
		
	//______________________
	// Manejadores pœblicos:
	
	public JTextArea getElCampoTexto_() {
		return elCampoTexto_;
	}
	public void setElCampoTexto_(JTextArea elCampoTexto_) {
		this.elCampoTexto_ = elCampoTexto_;
	}
    public JButton getBotonCerrar_() {
		return botonCerrar_;
	}
	public void setBotonCerrar_(JButton botonCerrar_) {
		this.botonCerrar_ = botonCerrar_;
	}
	public String getElTexto_() {
		return elTexto_;
	}
	public void setElTexto_(String elTexto_) {
		this.elTexto_ = elTexto_;
	}
	
	//____________________
	// Atributos privados.
	
    JTextArea elCampoTexto_;
    JButton botonCerrar_;
	String elTexto_;
    
    

	//___________________
	// MŽtodos privados:
	private void inicializar (int posX, int posY, int ancho, int alto, String titulo, String texto) {
		setLayout(null);
		setTitle (titulo);
		setBounds (posX, posY, ancho, alto);
		setResizable(false);
		
		setElTexto_ (texto);
		setElCampoTexto_(new JTextArea(getElTexto_()));
		getElCampoTexto_().setEditable(false);
		getElCampoTexto_().setAutoscrolls(true);
		getElCampoTexto_().setBounds(10, 10, getWidth() - 20, getHeight() - 60);
		add(getElCampoTexto_());
		
		setBotonCerrar_(new JButton("Cerrar."));
		getBotonCerrar_().setBounds((getWidth() / 2 ) - 50, getHeight() - 50, 100, 30);
		getBotonCerrar_().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Cerrar venatana de ayuda.");
			    dispose();
			}
		});
		add(getBotonCerrar_());
		
		setVisible(true);
	}
	
}
