/**
 * Descripci—n: Clase definitoria de cada una de las ventanas internas del programa
 *   
 * Implementado:
 * 
 * Por implementar:  - Definir atributos y manipuladores (v0)
 *                   - Definir funciones (v0):
 *                         - Inicializar (v0)
 *                         - Constructores (v0)
 */

package interfazGrafica;

import herramientas.Histograma;
import herramientas.Internas;
import herramientas.Internas.Rectangulo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controladores.EventosVentInterna;

@SuppressWarnings("serial")
public class VentanaInterna extends JInternalFrame{
	//______________________________________
    // Atributos constantes predeterminados:
	static final int POS_X = 0;
	static final int POS_Y = 0;
	static final int ANCHO_VENT = 200;
	static final int ALTO_VENT = 300;
	static final String TITULO = "Imagen";
	//---------------
	
    //_______________
	// Constructores:
	//      - Constructor que abre un filechooser al no pasarle una imagen a cargar.
	public VentanaInterna (ZonaTrabajo laZona) {
		super (TITULO , true, true, true, true);
		String elTitulo = cargarImagenArchivo();
		
		setEsOriginal_(true);
		inicializar (POS_X, POS_Y, elTitulo, laZona);
		
		
	}
	public VentanaInterna (int posX, int posY, BufferedImage imagen, ZonaTrabajo laZona) {
		super (TITULO , true, true, true, true);
		String elTitulo = "Copia Imagen";
		
		setImagenOriginal_(imagen);
		setEsOriginal_(false);
		inicializar (posX, posY, elTitulo, laZona);
		
		
	}
	//------------------ 
	
	//__________________
	// MŽtodos pœblicos:
	public void cambiarOrgEscG () {
	  if (isMostrarEscGrises_()) {
	    setMostrarEscGrises_(false);
	  } else {
		setMostrarEscGrises_(true);  
	  }
	  getZonaPintado_().repaint ();
	}
	public BufferedImage imagenActiva () {
		return isMostrarEscGrises_()? getImagenEscGrises_() : getImagenOriginal_();
	}
	public int posVecVentanas () {
		return getLaRefZonaTrabajo_().getVecVentanas_().indexOf(this);
	}
	//______________________
	// Manejadores pœblicos:
    public boolean isEsOriginal_() {
      return esOriginal_;
	}
    public void setEsOriginal_(boolean esOriginal_) {
      this.esOriginal_ = esOriginal_;
	}
	public boolean isMostrarEscGrises_() {
		return mostrarEscGrises_;
	}
	public void setMostrarEscGrises_(boolean mostrarEscGrises_) {
		this.mostrarEscGrises_ = mostrarEscGrises_;
	}
	public JPanel getZonaPintado_() {
		return zonaPintado_;
	}
	public void setZonaPintado_(JPanel zonaPintado_) {
		this.zonaPintado_ = zonaPintado_;
	}
	public BufferedImage getImagenOriginal_() {
		return imagenOriginal_;
	}
	public void setImagenOriginal_(BufferedImage imagen_) {
		this.imagenOriginal_ = imagen_;
	}
	public BufferedImage getImagenEscGrises_() {
		return imagenEscGrises_;
	}
	public void setImagenEscGrises_(BufferedImage imagenEscGrises_) {
		this.imagenEscGrises_ = imagenEscGrises_;
	}
	public ZonaTrabajo getLaRefZonaTrabajo_() {
		return laRefZonaTrabajo_;
	}
	public void setLaRefZonaTrabajo_(ZonaTrabajo laRefZonaTrabajo_) {
		this.laRefZonaTrabajo_ = laRefZonaTrabajo_;
	}
	public EventosVentInterna getLosEventos_() {
		return losEventos_;
	}
	public void setLosEventos_(EventosVentInterna losEventos_) {
		this.losEventos_ = losEventos_;
	}
	public JScrollPane getElPanelScroll_() {
		return elPanelScroll_;
	}
	public void setElPanelScroll_(JScrollPane elPanelScroll_) {
		this.elPanelScroll_ = elPanelScroll_;
	}
	public Histograma getElHistograma_() {
		return elHistograma_;
	}
	public void setElHistograma_(Histograma elHistograma_) {
		this.elHistograma_ = elHistograma_;
	}
	public Rectangulo getElRectResalte_() {
		return elRectResalte_;
	}
	public void setElRectResalte_(Rectangulo elRectResalte_) {
		this.elRectResalte_ = elRectResalte_;
	}
	//--------------------
	
	//____________________
	// Atributos privados.
	private boolean esOriginal_;
	private boolean mostrarEscGrises_;

	private BufferedImage imagenOriginal_ = null;
	private BufferedImage imagenEscGrises_ = null;
	
	
	private JPanel zonaPintado_ = null;
	private JScrollPane elPanelScroll_ = null;
	
	private EventosVentInterna losEventos_;
	
	private ZonaTrabajo laRefZonaTrabajo_;
	
	private Histograma elHistograma_;
	
	private Rectangulo elRectResalte_;
	
	private Internas funcInt_;
    //-------------------

	//___________________
	// MŽtodos privados:
	private void inicializar (int posX, int posY, String titulo, ZonaTrabajo laZona) {
		if (titulo != null) {
		   funcInt_ = new Internas();
			
		   setLayout(null);
		   setDefaultCloseOperation (JInternalFrame.DISPOSE_ON_CLOSE);
		   setTitle(titulo);
		   setLocation(posX, posY);
		   setLaRefZonaTrabajo_(laZona);
		   setElHistograma_(new Histograma ());
		   setMostrarEscGrises_(true);
		   if (isEsOriginal_()) {
		     setImagenEscGrises_(pasarAGrises());
		   } else {
			 setImagenEscGrises_(getImagenOriginal_()); 
		   }
		   getElHistograma_().calcularHistograma(getImagenEscGrises_());
		   setElRectResalte_(funcInt_.new Rectangulo());
		   
		   
		   setLosEventos_(new EventosVentInterna(this));
		   inicializarZonPint ();
		   setSize(getImagenEscGrises_().getWidth() + 50
					, getImagenEscGrises_().getHeight() + 70);
		   getZonaPintado_().setBounds(0, 0
					                    , getImagenEscGrises_().getWidth()
					                    , getImagenEscGrises_().getHeight());
		   
		   
		   addInternalFrameListener(getLosEventos_().getAccIntFrame_());
		   addComponentListener(getLosEventos_().getAccComponente_());
		   
	       
	       getZonaPintado_().setAutoscrolls(true);
	       getZonaPintado_().setPreferredSize(new Dimension(getImagenOriginal_().getWidth(null)
                                                            , getImagenOriginal_().getHeight(null)));
	       
	       setElPanelScroll_(new JScrollPane(getZonaPintado_()));
	       getElPanelScroll_().setBackground(Color.gray);
	       getElPanelScroll_().setBounds(10, 10, getWidth() - 45 , getHeight() - 65);
	       getElPanelScroll_().setPreferredSize(new Dimension(getWidth(), getHeight()));
	          
	       add(getElPanelScroll_());
		
		   setVisible(true);
		}
	}

	private void inicializarZonPint () {
		setZonaPintado_(new JPanel () {
			public void paintComponent (Graphics g) {
			   Image imagenTmp = imagenActiva();
			   Color colorTmp = g.getColor();
			   
			   if (imagenTmp != null){
				   g.drawImage(imagenTmp, 0, 0, imagenTmp.getWidth(null), 
					           imagenTmp.getHeight(null), null);
			   }
			   
			   if (getElRectResalte_().esValido()) {
				  g.setColor(Color.red);
			      g.drawRect(getElRectResalte_().getLaPosInicioX_()
			    		    , getElRectResalte_().getLaPosInicioY_() 
			    		    , getElRectResalte_().getLaPosFinX_() - getElRectResalte_().getLaPosInicioX_()
			    		    , getElRectResalte_().getLaPosFinY_() - getElRectResalte_().getLaPosInicioY_());
			      g.setColor(colorTmp);
			   }
			}
		});
		
		getZonaPintado_().addMouseListener(getLosEventos_().getAccRaton_());
	    getZonaPintado_().addMouseMotionListener(getLosEventos_().getAccMovRaton_());
	}
	
	private String cargarImagenArchivo () {
		File archivo = null;
		JFileChooser seleccionar = new JFileChooser();
		
		seleccionar.setFileSelectionMode (0);
		
		int s = seleccionar.showOpenDialog (getZonaPintado_());
		if (s == JFileChooser.APPROVE_OPTION) {
			archivo = seleccionar.getSelectedFile();
			System.out.println(archivo.getPath());
			try {
				setImagenOriginal_ (ImageIO.read(archivo));
				setImagenEscGrises_(pasarAGrises());
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		return ((archivo != null) ? archivo.getPath() : null);
	}
	private BufferedImage pasarAGrises () {
	   BufferedImage resultado = new BufferedImage(getImagenOriginal_().getWidth()
			                                       , getImagenOriginal_().getHeight()
			                                       , getImagenOriginal_().getType());
	   int ancho = resultado.getWidth();
	   int alto = resultado.getHeight();
	   int rojo;
	   int verde;
	   int azul;
	   int colorFinal;
	   Color elColor;
	   
	   for (int i = 0; i < ancho; i++) {
		   for (int j = 0; j < alto; j++) {
			   elColor = new Color(getImagenOriginal_().getRGB(i, j));
			   rojo = elColor.getRed() ;
			   verde = elColor.getGreen() ;
			   azul = elColor.getBlue() ;
			   colorFinal = (int) Math.round((rojo * 0.299 + verde * 0.587 + azul * 0.114));
			   elColor = new Color(colorFinal, colorFinal, colorFinal);
			   resultado.setRGB(i, j, elColor.getRGB());
		   }
	   }
	   return resultado;
	}
	//-------------------
}
