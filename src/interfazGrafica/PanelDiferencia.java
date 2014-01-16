/**
 * 
 */
package interfazGrafica;

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
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author tenerent
 *
 */
@SuppressWarnings("serial")
public class PanelDiferencia extends JDialog{
  //______________________________________
  // Atributos constantes predeterminados:
  final static int ANCHO_PAN_P = 200;
  final static int ANCHO_PAN_G = 300;
  final static int ANCHO_BORDES = 5;
  //-FIN---------------	

  //_______________
  // Constructores:
  public PanelDiferencia (VentanaInterna laVentA, Vector<VentanaInterna> elVecVentanas) {
	setLaVentAct_(laVentA);
    setElVecVentanas_(elVecVentanas);
    inicializar();
  }
  //-FIN------------------
   
  //__________________
  // MŽtodos pœblicos:

  //-FIN------------------
		
  //______________________
  // Manejadores pœblicos:
  public BufferedImage getLaImagen01_() {
    return laImagen01_;
  }
  public void setLaImagen01_(BufferedImage laImagen01_) {
    this.laImagen01_ = laImagen01_;
  }
  public BufferedImage getLaImagen02_() {
    return laImagen02_;
  }
  public void setLaImagen02_(BufferedImage laImagen02_) {
    this.laImagen02_ = laImagen02_;
  }
  public BufferedImage getLaImagenResult_() {
    return laImagenResult_;
  }
  public void setLaImagenResult_(BufferedImage laImagenResult_) {
    this.laImagenResult_ = laImagenResult_;
  }
  public JPanel getElPanelImg01_() {
    return elPanelImg01_;
  }
  public void setElPanelImg01_(JPanel elPanelImg01_) {
    this.elPanelImg01_ = elPanelImg01_;
  }
  public JPanel getElPanelImg02_() {
    return elPanelImg02_;
  }
  public void setElPanelImg02_(JPanel elPanelImg02_) {
    this.elPanelImg02_ = elPanelImg02_;
  }
  public JPanel getElPanelImgResult_() {
    return elPanelImgResult_;
  }
  public void setElPanelImgResult_(JPanel elPanelImgResult_) {
    this.elPanelImgResult_ = elPanelImgResult_;
  }
  public JComboBox getLaListaVent01_() {
    return laListaVent01_;
  }
  public void setLaListaVent01_(JComboBox laListaVent01_) {
    this.laListaVent01_ = laListaVent01_;
  }
  public JComboBox getLaListaVent02_() {
    return laListaVent02_;
  }
  public void setLaListaVent02_(JComboBox laListaVent02_) {
    this.laListaVent02_ = laListaVent02_;
  }
  public JRadioButton getElBotResultado_() {
    return elBotResultado_;
  }
  public void setElBotResultado_(JRadioButton elBotResultado_) {
    this.elBotResultado_ = elBotResultado_;
  }
  public JRadioButton getElBotMapaCamb_() {
    return elBotMapaCamb_;
  }
  public void setElBotMapaCamb_(JRadioButton elBotMapaCamb_) {
    this.elBotMapaCamb_ = elBotMapaCamb_;
  }
  public JRadioButton getElBotMezcla_() {
    return elBotMezcla_;
  }
  public void setElBotMezcla_(JRadioButton elBotMezcla_) {
    this.elBotMezcla_ = elBotMezcla_;
  }
  public JLabel getElLabelUmbral_() {
    return elLabelUmbral_;
  }
  public void setElLabelUmbral_(JLabel elLabelUmbral_) {
    this.elLabelUmbral_ = elLabelUmbral_;
  }
  public JSlider getElSliderUmbral_() {
    return elSliderUmbral_;
  }
  public void setElSliderUmbral_(JSlider elSliderUmbral_) {
    this.elSliderUmbral_ = elSliderUmbral_;
  }
  public Vector<VentanaInterna> getElVecVentanas_() {
    return elVecVentanas_;
  }
  public void setElVecVentanas_(Vector<VentanaInterna> elVecVentanas_) {
    this.elVecVentanas_ = elVecVentanas_;
  }
  public VentanaInterna getLaVentAct_() {
	return laVentAct_;
  }
  public void setLaVentAct_(VentanaInterna laVentAct_) {
	this.laVentAct_ = laVentAct_;
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
  public int getElIndiceImg02_() {
	return elIndiceImg02_;
  }
  public void setElIndiceImg02_(int elIndiceImg02_) {
	this.elIndiceImg02_ = elIndiceImg02_;
  }
  public BufferedImage getLaImagenMapaCamb_() {
    return laImagenMapaCamb_;
  }
  public void setLaImagenMapaCamb_(BufferedImage laImagenMapaCamb_) {
    this.laImagenMapaCamb_ = laImagenMapaCamb_;
  }
  public double getLaEscala03_() {
	return laEscala03_;
  }
  public void setLaEscala03_(double laEscala03_) {
    this.laEscala03_ = laEscala03_;
  }
  public TransfPunto getLasHerramientas_() {
	return lasHerramientas_;
  }
  public void setLasHerramientas_(TransfPunto lasHerramientas_) {
    this.lasHerramientas_ = lasHerramientas_;
  }
  public int getElUmbral_() {
	return elUmbral_;
  }
  public void setElUmbral_(int elUmbral_) {
	this.elUmbral_ = elUmbral_;
  }
  public boolean isEsPintarResul_() {
	return esPintarResul_;
  }
  public void setEsPintarResul_(boolean esPintarResul_) {
	this.esPintarResul_ = esPintarResul_;
  }
  public JLabel getElValorUmbral_() {
    return elValorUmbral_;
  }
  public void setElValorUmbral_(JLabel elValorUmbral_) {
    this.elValorUmbral_ = elValorUmbral_;
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
  //-FIN--------------------
		
  //____________________
  // Atributos privados:
  private BufferedImage laImagen01_;
  private BufferedImage laImagen02_;
  private BufferedImage laImagenResult_;
  private BufferedImage laImagenMapaCamb_;
  
  private JPanel elPanelImg01_;
  private JPanel elPanelImg02_;
  private JPanel elPanelImgResult_;
  
  private JComboBox laListaVent01_;
  private JComboBox laListaVent02_;
  
  private JRadioButton elBotResultado_;
  private JRadioButton elBotMapaCamb_;
  private JRadioButton elBotMezcla_;
  
  private JLabel elLabelUmbral_;
  private JLabel elValorUmbral_;
  
  
  private JSlider elSliderUmbral_;
  
  private JButton elBotAceptar_;
  private JButton elBotCancelar_;
  
  private Vector<VentanaInterna> elVecVentanas_;
  private VentanaInterna laVentAct_;
  
  private double laEscala01_;
  private double laEscala02_;
  private double laEscala03_;
  private int elIndiceImg02_;
  private boolean esPintarResul_;

  private int elUmbral_;
  private TransfPunto lasHerramientas_;
  //-FIN------------------

  //__________________
  // MŽtodos privados:
  private void inicializar () {
    setLasHerramientas_(new TransfPunto ());
    setLayout(null);
    setTitle("Panel de diferencia de imagenes.");
    
    setLaImagen01_(getLaVentAct_().imagenActiva());
    setLaImagen02_(getLaVentAct_().imagenActiva());
    setElIndiceImg02_(getElVecVentanas_().indexOf(getLaVentAct_()));
    setLaImagenResult_(null);
    setLaImagenMapaCamb_(null);
    setEsPintarResul_(true);
    setElUmbral_(127);
    
    setElPanelImg01_(new JPanel() {
      public void paintComponent (Graphics g) {
        Image imagenTmp = getLaImagen01_();
        g.setColor(getLaVentAct_().getLaRefZonaTrabajo_().getBackground());
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        if (imagenTmp != null){
          g.drawImage(imagenTmp, 0, 0,(int) Math.round(imagenTmp.getWidth(null) * getLaEscala01_()), 
    		    		                    (int) Math.round(imagenTmp.getHeight(null) * getLaEscala01_()), null);    
    	}
      }
    });
    getElPanelImg01_().setLocation(ANCHO_BORDES, ANCHO_BORDES);
    getElPanelImg01_().setSize(ANCHO_PAN_P, ANCHO_PAN_P);
    getElPanelImg01_().setBorder(new LineBorder(Color.black));
    getElPanelImg01_().addMouseListener(new MouseListener() {
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
		  siguienteVentana(true);
		  //setEsPintarResul_(true);
		  
		  getElBotResultado_().setSelected(true);
		  getElBotMapaCamb_().setSelected(false);
		  getElBotMezcla_().setSelected(false);
		  
		  
		  setLaImagenResult_(getLasHerramientas_().calcularDiferencia(getLaImagen01_(), getLaImagen02_()));
		  setLaImagenMapaCamb_(getLasHerramientas_().calcularBinUmbral(getLaImagenResult_(), getElUmbral_()));
		  calcularEscala03();
		  getElPanelImgResult_().repaint();
		}
	});
    
    setElPanelImg02_(new JPanel() {
      public void paintComponent (Graphics g) {
        Image imagenTmp = getLaImagen02_();
        
        g.setColor(getLaVentAct_().getLaRefZonaTrabajo_().getBackground());
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        if (imagenTmp != null){
          g.drawImage(imagenTmp, 0, 0,(int) Math.round(imagenTmp.getWidth(null) * getLaEscala02_())
        		     , (int) Math.round(imagenTmp.getHeight(null) * getLaEscala02_()), null);    
        }
      }
    });
    getElPanelImg02_().setLocation(2 * ANCHO_BORDES + ANCHO_PAN_P, ANCHO_BORDES);
    getElPanelImg02_().setSize(ANCHO_PAN_P, ANCHO_PAN_P);
    getElPanelImg02_().setBorder(new LineBorder(Color.black));
    getElPanelImg02_().addMouseListener(new MouseListener() {
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
		  siguienteVentana(false);
		  //setEsPintarResul_(true);
		  
		  getElBotResultado_().setSelected(true);
		  getElBotMapaCamb_().setSelected(false);
		  getElBotMezcla_().setSelected(false);
		  
		  
		  setLaImagenResult_(getLasHerramientas_().calcularDiferencia(getLaImagen01_(), getLaImagen02_()));
		  setLaImagenMapaCamb_(getLasHerramientas_().calcularBinUmbral(getLaImagenResult_(), getElUmbral_()));
		  calcularEscala03();
		  getElPanelImgResult_().repaint();
		}
	});
    
    setElPanelImgResult_(new JPanel() {
      public void paintComponent (Graphics g) {
        Image imagenTmp = null; 
        
        if (getElBotResultado_().isSelected()) {
          imagenTmp = getLaImagenResult_();
        } else if (getElBotMapaCamb_().isSelected()) {
          imagenTmp = getLaImagenMapaCamb_();
        } else if (getElBotMezcla_().isSelected()){
          imagenTmp = calcularMezcla();
        }
        
        g.setColor(getLaVentAct_().getLaRefZonaTrabajo_().getBackground());
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        if (imagenTmp != null){
          g.drawImage(imagenTmp, 0, 0,(int) Math.round(imagenTmp.getWidth(null) * getLaEscala03_())
          		     , (int) Math.round(imagenTmp.getHeight(null) * getLaEscala03_()), null);    
        } else {
          g.setColor(Color.lightGray);
          g.fillRect(6, 6, this.getWidth() - 12, this.getHeight() - 12);
          g.setColor(Color.red);
          g.drawLine(6, 6, this.getWidth() - 12, this.getHeight() - 12);
          g.drawLine(6, this.getHeight() - 12, this.getWidth() - 12, 6);
          g.setColor(Color.black);
          g.drawRect(3, 3, this.getWidth() - 6, this.getHeight() - 6);
          g.drawRect(5, 5, this.getWidth() - 10, this.getHeight() - 10);
          g.drawRect(19, this.getHeight() / 2 - 12, this.getWidth() - 30, 20);
          g.setColor(Color.blue);
          g.fillRect(19, this.getHeight() / 2 - 12, this.getWidth() - 30, 20);
          g.setColor(Color.white);
          g.drawString("Imagenes Incompatibles para la diferencia.", 20, this.getHeight() / 2 + 3);
          g.setColor(Color.orange);
          g.drawRect(4, 4, this.getWidth() - 8, this.getHeight() - 8);
          
         
        }
      }
    });
    getElPanelImgResult_().setLocation(3 * ANCHO_BORDES + 2 * ANCHO_PAN_P, ANCHO_BORDES);
    getElPanelImgResult_().setSize(ANCHO_PAN_G, ANCHO_PAN_G);
    getElPanelImgResult_().setBorder(new LineBorder(Color.black));
    getElPanelImgResult_().addMouseListener(new MouseListener() {
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
		 
		  //getElPanelImgResult_().repaint();
		}
	});
    
    
    setElBotResultado_(new JRadioButton("Resultado"));
    getElBotResultado_().setLocation(ANCHO_BORDES, 2 * ANCHO_BORDES + ANCHO_PAN_P);
    getElBotResultado_().setSize(ANCHO_PAN_P,  30);
    getElBotResultado_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  if (getElBotResultado_().isSelected()) {
		    getElBotMapaCamb_().setSelected(false);
		    getElBotMezcla_().setSelected(false);
		    getElPanelImgResult_().repaint();
		  }
		}
	});
    
    setElBotMapaCamb_(new JRadioButton("Mapa de cambios."));
    getElBotMapaCamb_().setLocation(ANCHO_BORDES, 2 * ANCHO_BORDES + ANCHO_PAN_P 
    		                                      + getElBotResultado_().getHeight());
    getElBotMapaCamb_().setSize(ANCHO_PAN_P, 30);
    getElBotMapaCamb_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		  if (getElBotMapaCamb_().isSelected()) {
			getElBotResultado_().setSelected(false);
		    getElBotMezcla_().setSelected(false);
		    getElPanelImgResult_().repaint();
		  }
		}
	});
    
    setElBotMezcla_(new JRadioButton("Mezcla"));
    getElBotMezcla_().setLocation(ANCHO_BORDES, 2 * ANCHO_BORDES + ANCHO_PAN_P 
    		                                      + getElBotResultado_().getHeight()
    		                                      + getElBotMapaCamb_().getHeight());
    getElBotMezcla_().setSize(ANCHO_PAN_P, 30);
    getElBotMezcla_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		  if (getElBotMezcla_().isSelected()) {
			getElBotResultado_().setSelected(false);
		    getElBotMapaCamb_().setSelected(false);
		    getElPanelImgResult_().repaint();
		  }
		}
	});
    
    getElBotResultado_().setSelected(true);
    getElBotMezcla_().setSelected(false);
    getElBotMapaCamb_().setSelected(false);
    
    
    setElLabelUmbral_(new JLabel(" Umbral"));
    getElLabelUmbral_().setLocation(ANCHO_BORDES, 2 * ANCHO_BORDES + ANCHO_PAN_P
    		                                                       + 3 * getElBotResultado_().getHeight() + 2);
    getElLabelUmbral_().setSize(60, 40);
    getElLabelUmbral_().setBorder(new LineBorder(Color.black));
    
    
    setElSliderUmbral_(new JSlider(JSlider.HORIZONTAL, 0, 255, 127));
    getElSliderUmbral_().setMajorTickSpacing(125);
    getElSliderUmbral_().setMinorTickSpacing(Math.round(125 / 5));
    getElSliderUmbral_().setPaintTicks(true);
    getElSliderUmbral_().setPaintLabels(true);
    getElSliderUmbral_().setLocation(ANCHO_BORDES + getElLabelUmbral_().getWidth() + 1, getElLabelUmbral_().getY());
    getElSliderUmbral_().setSize(270, 40);
    getElSliderUmbral_().setBorder(new LineBorder(Color.black));
    getElSliderUmbral_().addChangeListener(new ChangeListener() {
		@Override
		public void stateChanged(ChangeEvent arg0) {
		  getElValorUmbral_().setText(" U: " + getElSliderUmbral_().getValue());
		  setElUmbral_(getElSliderUmbral_().getValue());
		  if (getLaImagenResult_() != null) {
		    setLaImagenMapaCamb_(getLasHerramientas_().calcularBinUmbral(getLaImagenResult_(), getElUmbral_()));
		    getElPanelImgResult_().repaint();
		  }
		}
	});
   
    
    setElValorUmbral_(new JLabel(" U: " + getElSliderUmbral_().getValue()));
    getElValorUmbral_().setLocation(getElSliderUmbral_().getX() + getElSliderUmbral_().getWidth() + 1
    		                       , getElSliderUmbral_().getY());
    getElValorUmbral_().setSize(70, 40);
    getElValorUmbral_().setBorder(new LineBorder(Color.black));
    
    setElBotAceptar_(new JButton("Aceptar"));
    getElBotAceptar_().setLocation(getElPanelImgResult_().getX() + 100, 2 * ANCHO_BORDES + ANCHO_PAN_G);
    getElBotAceptar_().setSize(100, 30);
    getElBotAceptar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			BufferedImage imagenTmp = null; 
	        
	        if (getElBotResultado_().isSelected()) {
	          imagenTmp = getLaImagenResult_();
	        } else if (getElBotMapaCamb_().isSelected()) {
	          imagenTmp = getLaImagenMapaCamb_();
	        } else if (getElBotMezcla_().isSelected()){
	          imagenTmp = calcularMezcla();
	        }
			
			
		  if (imagenTmp != null) {
		    getLaVentAct_().getLaRefZonaTrabajo_().nuevaVentanaInterna(10, 10, imagenTmp);
		    try {
			  getLaVentAct_().getLaRefZonaTrabajo_().getVecVentanas_().lastElement().setSelected(true);
		    } catch (PropertyVetoException e) {
			  e.printStackTrace();
		    }
		    dispose ();
	      }
		}
	  });
    
    setElBotCancelar_(new JButton("Cancelar"));
    getElBotCancelar_().setLocation(getElBotAceptar_().getX() + getElBotAceptar_().getWidth() + ANCHO_BORDES
    		                       , 2 * ANCHO_BORDES + ANCHO_PAN_G);
    getElBotCancelar_().setSize(100, 30);
    getElBotCancelar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  dispose ();
		}
	});
    
    
    add(getElPanelImg01_());
    add(getElPanelImg02_());
    add(getElPanelImgResult_());
    add(getElBotResultado_());
    add(getElBotMapaCamb_());
    add(getElBotMezcla_());
    add(getElLabelUmbral_());
    add(getElSliderUmbral_());
    add(getElValorUmbral_());
    add(getElBotAceptar_());
    add(getElBotCancelar_());
    
    calcularEscala01 ();
    calcularEscala02 ();
    calcularEscala03 ();
    
    setLaImagenResult_(getLasHerramientas_().calcularDiferencia(getLaImagen01_(), getLaImagen02_()));
	setLaImagenMapaCamb_(getLasHerramientas_().calcularBinUmbral(getLaImagenResult_(), getElUmbral_()));
    
    setSize(4 * ANCHO_BORDES + 2 * ANCHO_PAN_P + ANCHO_PAN_G
    	   , 2 * ANCHO_BORDES + ANCHO_PAN_G + 60);
    setVisible(true);
    setResizable(false);
  }
  
  private void calcularEscala01 () {
    int ancho;
	int alto;
	double escala;
	    
	if (getLaImagen01_() != null) {
	  ancho = getLaImagen01_().getWidth();
	  alto = getLaImagen01_().getHeight();
	  if ((ancho >= alto)) {
	    escala = getElPanelImg01_().getWidth() / (1.0 * ancho);
	  } else {
	    escala = getElPanelImg01_().getHeight() / (1.0 * alto);
	  }
	  setLaEscala01_(escala);
    }
  }
  
  
  private void calcularEscala02 () {
		int ancho;
	    int alto;
	    double escala;
	    
	    if (getLaImagen02_() != null) {
	      ancho = getLaImagen02_().getWidth();
		  alto = getLaImagen02_().getHeight();
	      if ((ancho >= alto)) {
	        escala = getElPanelImg02_().getWidth() / (1.0 * ancho);
	      } else {
	  	    escala = getElPanelImg02_().getHeight() / (1.0 * alto);
	      }
	      setLaEscala02_(escala);
	    }
  }
  
  private void calcularEscala03 () {
    int ancho;
	int alto;
	double escala;
	    
	if (getLaImagenResult_() != null) {
	  ancho = getLaImagenResult_().getWidth();
	  alto = getLaImagenResult_().getHeight();
	  if ((ancho >= alto)) {
	    escala = getElPanelImgResult_().getWidth() / (1.0 * ancho);
	  } else {
	  	escala = getElPanelImgResult_().getHeight() / (1.0 * alto);
	  }
	  setLaEscala03_(escala);
	}
  }
  
  private void siguienteVentana (boolean primeraI) {
	int indiceAct;
	int indiceFinal = -1;
	
	if (primeraI) {
	  indiceAct = getElVecVentanas_().indexOf(getLaVentAct_());
	} else {
	  indiceAct = getElIndiceImg02_();
	}
	
	
    if (indiceAct >= 0 
       && indiceAct < getElVecVentanas_().size()) {
      
      if (indiceAct == getElVecVentanas_().size() - 1) {
    	indiceFinal = 0;  
      } else {
    	indiceFinal = indiceAct + 1;
      }
      
      if (indiceFinal > -1) {
    	if (primeraI) {
    	  setLaImagen01_(getElVecVentanas_().get(indiceFinal).imagenActiva());
          calcularEscala01();
          getElPanelImg01_().repaint();
          setLaVentAct_(getElVecVentanas_().get(indiceFinal));
    	} else {
          setLaImagen02_(getElVecVentanas_().get(indiceFinal).imagenActiva());
          calcularEscala02();
          getElPanelImg02_().repaint();
          setElIndiceImg02_(indiceFinal);
    	}
      }
      
    }
  }
  
  
  private BufferedImage calcularMezcla () {
    BufferedImage resultado = null;
    int nivelDeGris01;
    int nivelDeGris02;
    Color elColor;
    
    if (getLaImagen01_() != null && getLaImagenMapaCamb_() != null) {
      resultado = new BufferedImage(getLaImagen01_().getWidth(), getLaImagen01_().getHeight()
    		                       , getLaImagen01_().getType());
      for (int i = 0; i < getLaImagen01_().getWidth(); i++) {
        for (int j = 0; j < getLaImagen01_().getHeight(); j++) {
          nivelDeGris01 = (new Color(getLaImagen01_().getRGB(i, j))).getRed();
          nivelDeGris02 = (new Color(getLaImagenMapaCamb_().getRGB(i, j))).getRed();
          if (nivelDeGris02 == 0) {
        	elColor = new Color(nivelDeGris01, nivelDeGris01, nivelDeGris01);
            resultado.setRGB(i, j, elColor.getRGB());  
          } else {
        	elColor = new Color(255, 255, 0);
            resultado.setRGB(i, j, elColor.getRGB()); 
          }
        }
      }
    }
    
    return resultado;
  }
  //-FIN-------------------------
}


