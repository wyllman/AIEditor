/**
 * Descripci—n: Clase definitoria de la zona de la ventana principal donde se van a alojar y 
 *    manipular las ventanas internas de im‡genes.
 *   
 * Implementado:
 * 
 * Por implementar:  - Definir atributos y manipuladores (v0)
 *                   - Definir funciones (v0):
 *                         - Inicializar (v0)
 *                         - Constructores (v0)
 *                         - nuevaVentanaInterna (v0)
 */

package interfazGrafica;

import java.awt.image.BufferedImage;
import java.util.Vector;

import javax.swing.JDesktopPane;
import javax.swing.border.EtchedBorder;

@SuppressWarnings("serial")
public class ZonaTrabajo extends JDesktopPane {
	//______________________________________
    // Atributos constantes predeterminados:
	static final int POS_X = 10;
	static final int POS_Y = 10;
	static final int ANCHO_VENT = 200;
	static final int ALTO_VENT = 200;
	//---------------
	
    //_______________
	// Constructores:
	public ZonaTrabajo () {
		inicializar (POS_X, POS_Y, ANCHO_VENT, ALTO_VENT);
	}
	public ZonaTrabajo (int ancho, int alto) {
		inicializar (POS_X, POS_Y, ancho, alto);
	}
	public ZonaTrabajo (int posX, int posY, int ancho, int alto) {
		inicializar (posX, posY, ancho, alto);
	}
	//------------------
	    
	//__________________
	// MŽtodos pœblicos:
    public boolean nuevaVentanaInterna () {
    	boolean resultado = false;
    	getVecVentanas_().add (new VentanaInterna(this));
    	if (getVecVentanas_().lastElement().getImagenOriginal_() != null ) {
    	   add (getVecVentanas_().lastElement());
    	   resultado = true;
    	} else {
    		getVecVentanas_().remove(getVecVentanas_().lastElement());
    	}
    	return resultado;
    }
    public void nuevaVentanaInterna (int posX, int posY, BufferedImage imagen) {
    	getVecVentanas_().add (new VentanaInterna(posX, posY, imagen, this));
    	add (getVecVentanas_().lastElement());
    }
	//----------------------
    
	//______________________
	// Manejadores pœblicos:
	public Vector<VentanaInterna> getVecVentanas_() {
		return vecVentanas_;
	}
	public void setVecVentanas_(Vector<VentanaInterna> vecVentanas_) {
		this.vecVentanas_ = vecVentanas_;
	}
	public VentanaInterna getLaVentanaIntActual_() {
		return laVentanaIntActual_;
	}
	public void setLaVentanaIntActual_(VentanaInterna laVentanaIntActual_) {
		if (laVentanaIntActual_ != null) {
		   setLaVentanaIntAnterior_(getLaVentanaIntActual_());
		   //System.out.println("cambiando a:" + laVentanaIntActual_.getTitle());
		} 
		this.laVentanaIntActual_ = laVentanaIntActual_;
	}
	public VentanaInterna getLaVentanaIntAnterior_() {
		return laVentanaIntAnterior_;
	}
	public void setLaVentanaIntAnterior_(VentanaInterna laVentanaIntAnterior_) {
		this.laVentanaIntAnterior_ = laVentanaIntAnterior_;
	}
	public VentanaPrincipal getLaVenTmp_() {
		return laVenTmp_;
	}
	public void setLaVenTmp_(VentanaPrincipal laVenTmp_) {
		this.laVenTmp_ = laVenTmp_;
	}
	//--------------------
	
	//____________________
	// Atributos privados.
    private Vector<VentanaInterna> vecVentanas_;
    private VentanaInterna laVentanaIntActual_ = null;
    private VentanaInterna laVentanaIntAnterior_ = null;
    
    private VentanaPrincipal laVenTmp_;
    //-------------------
    
    
    
	//___________________
	// MŽtodos privados:
	private void inicializar (int posX, int posY, int ancho, int alto) {
		setVecVentanas_(new Vector<VentanaInterna> ());
		setBounds(posX, posY, ancho, alto);
		setBorder(new EtchedBorder());
	}
	//-------------------
}
