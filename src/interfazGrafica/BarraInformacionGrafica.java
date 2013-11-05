/**
 * Descripci—n: Clase definitoria de la barra de informaci—n  para el pixel sobre el 
 *              que se encuentra el rat—n.
 *   
 * Implementado:
 * 
 * Por implementar:  
 *                   
 */
package interfazGrafica;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;


@SuppressWarnings("serial")
public class BarraInformacionGrafica extends JPanel {
	//______________________________________
    // Atributos constantes predeterminados:

	//---------------	
	
    //_______________
	// Constructores:
    public BarraInformacionGrafica () {
    	inicializar ();
    }
	//------------------
	    
	//__________________
	// MŽtodos pœblicos:
		
		
	//______________________
	// Manejadores pœblicos:
    public JTextArea getPosXRaton_() {
    	return posXRaton_;
    }
    public void setPosXRaton_(JTextArea posXRaton_) {
    	this.posXRaton_ = posXRaton_;
    }
    public JTextArea getPosYRaton_() {
    	return posYRaton_;
    }
    public void setPosYRaton_(JTextArea posYRaton_) {
    	this.posYRaton_ = posYRaton_;
    }
	public JTextArea getColRGB_() {
		return colRGB_;
	}
	public void setColRGB_(JTextArea colRGB_) {
		this.colRGB_ = colRGB_;
	}
	//--------------------

	
	//____________________
	// Atributos privados:
	private JTextArea posXRaton_;
	private JTextArea posYRaton_;
	private JTextArea colRGB_;
    //------------------
    
    
	//__________________
	// MŽtodos privados:
   private void inicializar () {
	  setLayout(null);
      setBorder(new LineBorder(Color.GRAY, 1));
	  setPosXRaton_(new JTextArea(" X: 0"));
	  getPosXRaton_().setBorder(new LineBorder(Color.GRAY, 1));
	  getPosXRaton_().setBounds(4, 4, 100, 20);
	  getPosXRaton_().setEditable(false);
	  add(getPosXRaton_());
	  
	  setPosYRaton_(new JTextArea(" Y: 0"));
	  getPosYRaton_().setBorder(new LineBorder(Color.GRAY, 1));
	  getPosYRaton_().setBounds(108, 4, 100, 20);
	  getPosYRaton_().setEditable(false);
	  add(getPosYRaton_());
	  
	  setColRGB_(new JTextArea(" RGB: 255, 255, 255"));
	  getColRGB_().setBorder(new LineBorder(Color.GRAY, 1));
	  getColRGB_().setBounds(212, 4, 150, 20);
	  getColRGB_().setEditable(false);
	  add(getColRGB_());
   }
	//------------------



}
