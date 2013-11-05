/**
 * Descripci—n: Clase definitoria de la ventana principal del programa y contenedora de los
 *   principales m—dulos o clases necesarios. Se encarga de mostrar la ventana del 
 *   programa y coordinar los contenedores y los eventos generados en Žl mismo.
 *   
 * Implementado:     - Definir atributos y manipuladores (v0.010)
 *                   - Definir funciones (v0.010):
 *                         - Inicializar (v0.010)
 *                         - Constructores (v0.010)
 * 
 * Por implementar:  - Integrar ZonaTrabajo (v0.001)
 *                   
 */
package interfazGrafica;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame {
	//_____________________________________
	// Atributos constantes predeterminados
	static final int ANCHO_VENT = 800;
	static final int ALTO_VENT = 600;
	static final String TITULO = "Editor de Im‡genes";
	static final int POS_X = 20;
	static final int POS_Y = 50;
	static final int ANCHO_BORDES = 10;
	//---------------------------
	
	//___________________________
	// Constructores
	public VentanaPrincipal () {
		super (TITULO);
		inicializar (ANCHO_VENT, ALTO_VENT);
	}
	public VentanaPrincipal (final int ancho, final int alto) {
		super (TITULO);
		inicializar (ancho, alto);
	}
	public VentanaPrincipal (final int ancho, final int alto, final String titulo) {
		super (titulo);
		inicializar (ancho, alto);
	}
	//---------------------------
    
    //___________________________
	// MŽtodos pœblicos
	public static void main(String[] args) {
		new VentanaPrincipal ();
	}
	public void resetearInfo () {
		getLaBarraInfo_().getPosXRaton_().setText("--");
		getLaBarraInfo_().getPosYRaton_().setText("--");
		getLaBarraInfo_().getColRGB_().setText(" RGB: --, --, --");
		//System.out.println("reseteando la barra de informacion");
	}
	public void establecerInfo(int posX, int posY, int rojo, int verde, int azul) {
		getLaBarraInfo_().getPosXRaton_().setText(" X: " + posX);
		getLaBarraInfo_().getPosYRaton_().setText(" Y: " + posY);
		getLaBarraInfo_().getColRGB_().setText(" RGB: " + rojo + ", " + verde + ", " + azul);
	}
	//----------------------
	
	//______________________
	// Manejadores pœblicos
	public BarraMenu getElMenu_() {
		return elMenu_;
	}
	public void setElMenu_(BarraMenu elMenu_) {
		this.elMenu_ = elMenu_;
	}
    public ZonaTrabajo getLaZonaTrab_() {
		return laZonaTrab_;
	}
	public void setLaZonaTrab_(ZonaTrabajo laZonaTrab_) {
		this.laZonaTrab_ = laZonaTrab_;
	}
	public BarraInformacionGrafica getLaBarraInfo_() {
		return laBarraInfo_;
	}
	public void setLaBarraInfo_(BarraInformacionGrafica laBarraInfo_) {
		this.laBarraInfo_ = laBarraInfo_;
	}
	//--------------------
	
	//____________________
	// Atributos privados.
	private BarraMenu elMenu_;
	private ZonaTrabajo laZonaTrab_;
	private BarraInformacionGrafica laBarraInfo_;
	
	//-------------------
	
	//___________________
	// MŽtodos privados:
	private void inicializar (final int ancho, final int alto) {
    	setLayout(null);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setSize(ancho, alto + 50);
		setLocation(POS_X, POS_Y);
		//setResizable(false);
		setElMenu_(new BarraMenu (this));
		add(getElMenu_());
		
		setLaZonaTrab_(new ZonaTrabajo(ANCHO_BORDES, 
				       getElMenu_().getY() + getElMenu_().getHeight() + ANCHO_BORDES, 
				       getWidth() - (2 * ANCHO_BORDES), 
				       getHeight() - getElMenu_().getHeight() - (4 * ANCHO_BORDES) - 25));
		getLaZonaTrab_().setLaVenTmp_(this);
		add(getLaZonaTrab_());
		setLaBarraInfo_(new BarraInformacionGrafica());
		getLaBarraInfo_().setSize(ancho, 28);
		getLaBarraInfo_().setLocation(0, alto);
		//getLaBarraInfo_().setBackground(Color.RED);
		
		add(getLaBarraInfo_());
		addComponentListener(new ComponentListener() {
			@Override
			public void componentShown(ComponentEvent e) {  }
			@Override
			public void componentResized(ComponentEvent e) {
				int ancho = getWidth();
				int alto = getHeight();
				if (ancho < 400)
			       ancho = 400;
				if (alto < 400)
				   alto = 400;
				setSize(ancho, alto);
				
				getElMenu_().setSize(ancho, 30);
				getLaZonaTrab_().setSize(ancho - (2 * ANCHO_BORDES), alto - 30 - 50 - 20);
				getLaBarraInfo_().setSize(ancho, 28);
				getLaBarraInfo_().setLocation(0, alto - 50);
			}
			@Override
			public void componentMoved(ComponentEvent e) {  }
			@Override
			public void componentHidden(ComponentEvent e) {  }
		});
		
		//setSize(ancho, alto + 50);
		setVisible (true);
    }
	//--------------------
	
}
