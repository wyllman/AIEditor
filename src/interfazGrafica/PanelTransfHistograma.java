/**
 * 
 */
package interfazGrafica;

import herramientas.Histograma;
import herramientas.TransfPunto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

/**
 * @author tenerent
 *
 */
@SuppressWarnings("serial")
public class PanelTransfHistograma extends JDialog{
  //______________________________________
  // Atributos constantes predeterminados:
  final static int ANCHO_BORDES = 5;
  final static int ANCHO_PAN_P = 100;
  final static int ANCHO_PAN_G = 400;
  //-FIN---------------	

  //_______________
  // Constructores:
  public PanelTransfHistograma (VentanaInterna laVentana) {
    setLaVentanaActual_(laVentana);
    inicializar();
  }
  //-FIN------------------
	    
  //__________________
  // MŽtodos pœblicos:

  //-FIN------------------
		
  //______________________
  // Manejadores pœblicos:
  public BufferedImage getLaImagenOriginal_() {
    return laImagenOriginal_;
  }
  public void setLaImagenOriginal_(BufferedImage laImagenOriginal_) {
    this.laImagenOriginal_ = laImagenOriginal_;
  }
  public BufferedImage getLaImagenSec_() {
    return laImagenSec_;
  }
  public void setLaImagenSec_(BufferedImage laImagenSec_) {
    this.laImagenSec_ = laImagenSec_;
  }
  public BufferedImage getLaImagenResultado_() {
    return laImagenResultado_;
  }
  public void setLaImagenResultado_(BufferedImage laImagenResultado_) {
    this.laImagenResultado_ = laImagenResultado_;
  }
  public Histograma getElHistogramaOriginal_() {
    return elHistogramaOriginal_;
  }
  public void setElHistogramaOriginal_(Histograma elHistogramaOriginal_) {
    this.elHistogramaOriginal_ = elHistogramaOriginal_;
  }
  public Histograma getElHistogramaSec_() {
    return elHistogramaSec_;
  }
  public void setElHistogramaSec_(Histograma elHistogramaSec_) {
    this.elHistogramaSec_ = elHistogramaSec_;
  }
  public PanelGraf256 getElPanelHistograma_() {
    return elPanelHistograma_;
  }
  public void setElPanelHistograma_(PanelGraf256 elPanelHistograma_) {
    this.elPanelHistograma_ = elPanelHistograma_;
  }
  public JPanel getElPanelImagenOriginal_() {
    return elPanelImagenOriginal_;
  }
  public void setElPanelImagenOriginal_(JPanel elPanelImagenOriginal_) {
    this.elPanelImagenOriginal_ = elPanelImagenOriginal_;
  }
  public JPanel getElPanelImagenSec_() {
    return elPanelImagenSec_;
  }
  public void setElPanelImagenSec_(JPanel elPanelImagenSec_) {
    this.elPanelImagenSec_ = elPanelImagenSec_;
  }
  public JPanel getElPanelResultado_() {
    return elPanelResultado_;
  }
  public void setElPanelResultado_(JPanel elPanelResultado_) {
    this.elPanelResultado_ = elPanelResultado_;
  }
  public JRadioButton getElBotonIOriginal_() {
    return elBotonIOriginal_;
  }
  public void setElBotonIOriginal_(JRadioButton elBotonIOriginal_) {
    this.elBotonIOriginal_ = elBotonIOriginal_;
  }
  public JRadioButton getElBotonISec_() {
    return elBotonISec_;
  }
  public void setElBotonISec_(JRadioButton elBotonISec_) {
    this.elBotonISec_ = elBotonISec_;
  }
  public JButton getElBotAceptar_() {
    return elBotAceptar_;
  }
  public void setElBotAceptar_(JButton elBotAceptar_) {
    this.elBotAceptar_ = elBotAceptar_;
  }
  public JButton getElBotCancelar_() {
    return elBotCancelar_;
  }
  public void setElBotCancelar_(JButton elBotCancelar_) {
    this.elBotCancelar_ = elBotCancelar_;
  }
  public VentanaInterna getLaVentanaActual_() {
	return laVentanaActual_;
  }
  public void setLaVentanaActual_(VentanaInterna laVentanaActual_) {
    this.laVentanaActual_ = laVentanaActual_;
  }
  public Vector<VentanaInterna> getElVecVentanas_() {
    return elVecVentanas_;
  }
  public void setElVecVentanas_(Vector<VentanaInterna> elVecVentanas_) {
    this.elVecVentanas_ = elVecVentanas_;
  }
  public TransfPunto getLasHerramientasT_() {
    return lasHerramientasT_;
  }
  public void setLasHerramientasT_(TransfPunto lasHerramientasT_) {
    this.lasHerramientasT_ = lasHerramientasT_;
  }
  public double getLaEscala01_() {
    return laEscala01_;
  }
  public void setLaEscala01_(double laEscala01_) {
    this.laEscala01_ = laEscala01_;
  }
  public double getLaEscala02_() {
    return laEscala02_;
  }
  public void setLaEscala02_(double laEscala02_) {
    this.laEscala02_ = laEscala02_;
  }
  public double getLaEscala03_() {
    return laEscala03_;
  }
  public void setLaEscala03_(double laEscala03_) {
    this.laEscala03_ = laEscala03_;
  }
  public int getElIndiceImgSec_() {
	return elIndiceImgSec_;
  }
  public void setElIndiceImgSec_(int elIndiceImgSec_) {
	this.elIndiceImgSec_ = elIndiceImgSec_;
  }
  public JRadioButton getElBotonIRes_() {
	return elBotonIRes_;
  }
  public void setElBotonIRes_(JRadioButton elBotonIRes_) {
    this.elBotonIRes_ = elBotonIRes_;
  }
  //-FIN--------------------
		
  //____________________
  // Atributos privados:
  private BufferedImage laImagenOriginal_;
  private BufferedImage laImagenSec_;
  private BufferedImage laImagenResultado_;
  
  private Histograma elHistogramaOriginal_;
  private Histograma elHistogramaSec_;
  
  private PanelGraf256 elPanelHistograma_;
  private JPanel elPanelImagenOriginal_;
  private JPanel elPanelImagenSec_;
  private JPanel elPanelResultado_;
  
  private JRadioButton elBotonIOriginal_;
  private JRadioButton elBotonISec_;
  private JRadioButton elBotonIRes_;
  
  private JButton elBotAceptar_;
  private JButton elBotCancelar_;
  
  private VentanaInterna laVentanaActual_;
  private Vector<VentanaInterna> elVecVentanas_;
  private TransfPunto lasHerramientasT_;
  private double laEscala01_;
  private double laEscala02_;
  private double laEscala03_;
  private int elIndiceImgSec_;
  //-FIN------------------


  //__________________
  // MŽtodos privados:
  private void inicializar () {
	setLayout(null);
	
	setLasHerramientasT_(new TransfPunto());
    setElVecVentanas_(getLaVentanaActual_().getLaRefZonaTrabajo_().getVecVentanas_());
    setLaImagenOriginal_(getLaVentanaActual_().imagenActiva());
    setLaImagenSec_(getElVecVentanas_().get(0).imagenActiva());
    setElIndiceImgSec_(0);
    
    
    setElHistogramaOriginal_(new Histograma());
    getElHistogramaOriginal_().calcularHistograma(getLaImagenOriginal_());
    setElHistogramaSec_(new Histograma());
    getElHistogramaSec_().calcularHistograma(getElVecVentanas_().get(0).imagenActiva());
    
    setLaImagenResultado_(getLasHerramientasT_().calcularTransfHistog(getLaVentanaActual_(), getElHistogramaSec_()));
    
    setElPanelHistograma_(new PanelGraf256(getLaVentanaActual_().getElHistograma_().calcularHistogramaAcm()));
    getElPanelHistograma_().setLocation(ANCHO_BORDES, ANCHO_BORDES);
    getElPanelHistograma_().setBorder(new LineBorder(Color.black));
    
    setElPanelImagenOriginal_(new JPanel() {
    	public void paintComponent (Graphics g) {
            Image imagenTmp = getLaImagenOriginal_();
            
            g.setColor(getLaVentanaActual_().getLaRefZonaTrabajo_().getBackground());
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            if (imagenTmp != null){
              g.drawImage(imagenTmp, 0, 0,(int) Math.round(imagenTmp.getWidth(null) * getLaEscala01_())
            		     , (int) Math.round(imagenTmp.getHeight(null) * getLaEscala01_()), null);    
            }
          }
    	
    });
    getElPanelImagenOriginal_().setLocation(2 * ANCHO_BORDES 
    		                                 + getElPanelHistograma_().getWidth()
    		                               , ANCHO_BORDES);
    getElPanelImagenOriginal_().setSize(ANCHO_PAN_P, ANCHO_PAN_P);
    getElPanelImagenOriginal_().setBorder(new LineBorder(Color.black));
 
    
    setElPanelImagenSec_(new JPanel() {
    	public void paintComponent (Graphics g) {
            Image imagenTmp = getLaImagenSec_();
            
            g.setColor(getLaVentanaActual_().getLaRefZonaTrabajo_().getBackground());
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            if (imagenTmp != null){
              g.drawImage(imagenTmp, 0, 0,(int) Math.round(imagenTmp.getWidth(null) * getLaEscala02_())
            		     , (int) Math.round(imagenTmp.getHeight(null) * getLaEscala02_()), null);    
            }
          }
    });
    getElPanelImagenSec_().setLocation(getElPanelImagenOriginal_().getX()
    		                          , 2 * ANCHO_BORDES + getElPanelImagenOriginal_().getHeight());
    getElPanelImagenSec_().setSize(ANCHO_PAN_P, ANCHO_PAN_P);
    getElPanelImagenSec_().setBorder(new LineBorder(Color.black));
    getElPanelImagenSec_().addMouseListener(new MouseListener() {
		@Override
		public void mouseReleased(MouseEvent arg0) {}
		@Override
		public void mousePressed(MouseEvent arg0) {}
		@Override
		public void mouseExited(MouseEvent arg0) {}
		@Override
		public void mouseEntered(MouseEvent arg0) {}
		@Override
		public void mouseClicked(MouseEvent arg0) {
		  siguienteVentana();
		  setLaImagenResultado_(getLasHerramientasT_().calcularTransfHistog(getLaVentanaActual_(), getElHistogramaSec_()));
		  getElPanelResultado_().repaint();
		  if (getElBotonISec_().isSelected()) {
		    getElPanelHistograma_().cargarDatos(getElHistogramaSec_().calcularHistogramaAcm());
		    getElPanelHistograma_().repaint();
		  } else if (getElBotonIRes_().isSelected()) {
			getElHistogramaOriginal_().calcularHistograma(getLaImagenResultado_());
			getElPanelHistograma_().cargarDatos(getElHistogramaOriginal_().calcularHistogramaAcm());
			getElPanelHistograma_().repaint();
		  }
		}
	});
    
    setElPanelResultado_(new JPanel() {
    	public void paintComponent (Graphics g) {
            Image imagenTmp = getLaImagenResultado_();
            
            g.setColor(getLaVentanaActual_().getLaRefZonaTrabajo_().getBackground());
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            if (imagenTmp != null){
              g.drawImage(imagenTmp, 0, 0,(int) Math.round(imagenTmp.getWidth(null) * getLaEscala03_())
            		     , (int) Math.round(imagenTmp.getHeight(null) * getLaEscala03_()), null);    
            }
          }
    });
    getElPanelResultado_().setLocation(getElPanelImagenOriginal_().getX() 
    		                             + getElPanelImagenOriginal_().getWidth()
    		                             + ANCHO_BORDES
    		                          , ANCHO_BORDES);
    getElPanelResultado_().setSize(ANCHO_PAN_G, ANCHO_PAN_G);
    getElPanelResultado_().setBorder(new LineBorder(Color.black));
   
    
    setElBotonIOriginal_(new JRadioButton(" Histograma Imagen Origen"));
    getElBotonIOriginal_().setLocation(ANCHO_BORDES, 2 * ANCHO_BORDES + getElPanelHistograma_().getHeight());
    getElBotonIOriginal_().setSize(getElPanelHistograma_().getWidth(), 35);
    getElBotonIOriginal_().setSelected(true);
    getElBotonIOriginal_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  if (getElBotonIOriginal_().isSelected()) {
		    getElBotonIRes_().setSelected(false);
			getElBotonISec_().setSelected(false);
			getElHistogramaOriginal_().calcularHistograma(getLaImagenOriginal_());
			getElPanelHistograma_().cargarDatos(getElHistogramaOriginal_().calcularHistogramaAcm());
			getElPanelHistograma_().repaint();
		  } else {
		    getElBotonIOriginal_().setSelected(true);
		  }
		}
	});
    
    setElBotonISec_(new JRadioButton(" Histograma Imagen Secundaria"));
    getElBotonISec_().setLocation(ANCHO_BORDES, getElBotonIOriginal_().getY() + getElBotonIOriginal_().getHeight());
    getElBotonISec_().setSize(getElBotonIOriginal_().getWidth(), getElBotonIOriginal_().getHeight());
    getElBotonISec_().setSelected(false);
    getElBotonISec_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  if (getElBotonISec_().isSelected()) {
		    getElBotonIRes_().setSelected(false);
			getElBotonIOriginal_().setSelected(false);
			getElPanelHistograma_().cargarDatos(getElHistogramaSec_().calcularHistogramaAcm());
			getElPanelHistograma_().repaint();
		  } else {
			getElBotonISec_().setSelected(true);
		  }
		}
	});
    
    
    setElBotonIRes_(new JRadioButton(" Histograma Imagen Resultado"));
    getElBotonIRes_().setLocation(ANCHO_BORDES, getElBotonISec_().getY() + getElBotonISec_().getHeight());
    getElBotonIRes_().setSize(getElBotonISec_().getWidth(), getElBotonISec_().getHeight());
    getElBotonIRes_().setSelected(false);
    getElBotonIRes_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  if (getElBotonIRes_().isSelected()) {
		    getElBotonIOriginal_().setSelected(false);
			getElBotonISec_().setSelected(false);
			getElHistogramaOriginal_().calcularHistograma(getLaImagenResultado_());
			getElPanelHistograma_().cargarDatos(getElHistogramaOriginal_().calcularHistogramaAcm());
			getElPanelHistograma_().repaint();
		  } else {
			getElBotonIRes_().setSelected(true);
		  }
		}
	});
    
    setElBotAceptar_(new JButton("Aceptar"));
    getElBotAceptar_().setLocation(getElPanelResultado_().getX() + 200
    		                      , 2 * ANCHO_BORDES + getElPanelResultado_().getHeight());
    getElBotAceptar_().setSize(100, 30);
    getElBotAceptar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  getLaVentanaActual_().getLaRefZonaTrabajo_().nuevaVentanaInterna(10, 10, getLaImagenResultado_());
		  try {
			getLaVentanaActual_().getLaRefZonaTrabajo_().getVecVentanas_().lastElement().setSelected(true);
		  } catch (PropertyVetoException e) {
			e.printStackTrace();
		  }
		  dispose ();
	    }
	  });
    
    
    
    setElBotCancelar_(new JButton("Cancelar"));
    getElBotCancelar_().setLocation(getElBotAceptar_().getX() + getElBotAceptar_().getWidth()
    		                       , getElBotAceptar_().getY());
    getElBotCancelar_().setSize(getElBotAceptar_().getWidth(), getElBotAceptar_().getHeight());
    getElBotCancelar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  dispose();
		}
	  });
    
    add(getElPanelHistograma_());
    add(getElPanelImagenOriginal_());
    add(getElPanelImagenSec_());
    add(getElPanelResultado_());
    add(getElBotonIOriginal_());
    add(getElBotonISec_());
    add(getElBotonIRes_());
    add(getElBotAceptar_());
    add(getElBotCancelar_());
    
    calcularEscala01();
    calcularEscala02();
    calcularEscala03();
    
    setSize(4 * ANCHO_BORDES + getElPanelHistograma_().getWidth() 
    		                 + ANCHO_PAN_P
    		                 + ANCHO_PAN_G
    	    , 2 * ANCHO_BORDES + ANCHO_PAN_G + 55);
    setVisible(true);
    setResizable(false);
  }
  private void calcularEscala01 () {
	    int ancho;
		int alto;
		double escala;
		    
		if (getLaImagenOriginal_() != null) {
		  ancho = getLaImagenOriginal_().getWidth();
		  alto = getLaImagenOriginal_().getHeight();
		  if ((ancho >= alto)) {
		    escala = getElPanelImagenOriginal_().getWidth() / (1.0 * ancho);
		  } else {
		    escala = getElPanelImagenOriginal_().getHeight() / (1.0 * alto);
		  }
		  setLaEscala01_(escala);
	    }
   }
  
   private void calcularEscala02 () {
			int ancho;
		    int alto;
		    double escala;
		    
		    if (getLaImagenSec_() != null) {
		      ancho = getLaImagenSec_().getWidth();
			  alto = getLaImagenSec_().getHeight();
		      if ((ancho >= alto)) {
		        escala = getElPanelImagenSec_().getWidth() / (1.0 * ancho);
		      } else {
		  	    escala = getElPanelImagenSec_().getHeight() / (1.0 * alto);
		      }
		      setLaEscala02_(escala);
		    }
	  }
	  
	  private void calcularEscala03 () {
	    int ancho;
		int alto;
		double escala;
		    
		if (getLaImagenResultado_() != null) {
		  ancho = getLaImagenResultado_().getWidth();
		  alto = getLaImagenResultado_().getHeight();
		  if ((ancho >= alto)) {
		    escala = getElPanelResultado_().getWidth() / (1.0 * ancho);
		  } else {
		  	escala = getElPanelResultado_().getHeight() / (1.0 * alto);
		  }
		  setLaEscala03_(escala);
		}
	  }
 
	  private void siguienteVentana () {
			int indiceAct;
			int indiceFinal = -1;
			
			indiceAct = getElIndiceImgSec_();
			
		    if (indiceAct >= 0 
		       && indiceAct < getElVecVentanas_().size()) {
		      
		      if (indiceAct == getElVecVentanas_().size() - 1) {
		    	indiceFinal = 0;  
		      } else {
		    	indiceFinal = indiceAct + 1;
		      }
		      if (indiceFinal > -1) {
		    	  setLaImagenSec_(getElVecVentanas_().get(indiceFinal).imagenActiva());
		    	  getElHistogramaSec_().calcularHistograma(getLaImagenSec_());
		          calcularEscala02();
		          getElPanelImagenSec_().repaint();
		          setElIndiceImgSec_(indiceFinal);
		      }
		      
		    }
		  }
  //-FIN-------------------------
}
