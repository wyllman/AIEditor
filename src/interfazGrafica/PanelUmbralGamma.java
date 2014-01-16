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
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;

import javax.swing.JButton;
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
public class PanelUmbralGamma extends JDialog {
  //______________________________________
  // Atributos constantes predeterminados:
  final static int ANCHO_BORD = 5;
  //-FIN---------------	

  //_______________
  // Constructores:
  public PanelUmbralGamma (VentanaInterna laVentana) {
    setLaVentanaAct_(laVentana);
    inicializar();
  }
  //-FIN------------------
	    
  //__________________
  // MŽtodos pœblicos:

  //-FIN------------------
		
  //______________________
  // Manejadores pœblicos:
  public BufferedImage getLaImagenResultado_() {
    return laImagenResultado_;
  }
  public void setLaImagenResultado_(BufferedImage laImagenResultado_) {
    this.laImagenResultado_ = laImagenResultado_;
  }
  public PanelGraf256 getElPanelHistograma_() {
    return elPanelHistograma_;
  }
  public void setElPanelHistograma_(PanelGraf256 elPanelHistograma_) {
    this.elPanelHistograma_ = elPanelHistograma_;
  }
  public JPanel getElPanelImagenPrevia_() {
    return elPanelImagenPrevia_;
  }
  public void setElPanelImagenPrevia_(JPanel elPanelImagenPrevia_) {
    this.elPanelImagenPrevia_ = elPanelImagenPrevia_;
  }
  public int getElValorUmbral_() {
    return elValorUmbral_;
  }
  public void setElValorUmbral_(int elValorUmbral_) {
    this.elValorUmbral_ = elValorUmbral_;
  }
  public JRadioButton getElBotonUmbral_() {
    return elBotonUmbral_;
  }
  public void setElBotonUmbral_(JRadioButton elBotonUmbral_) {
    this.elBotonUmbral_ = elBotonUmbral_;
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
  public JLabel getElLabelValorUmbral_() {
    return elLabelValorUmbral_;
  }
  public void setElLabelValorUmbral_(JLabel elLabelValorUmbral_) {
    this.elLabelValorUmbral_ = elLabelValorUmbral_;
  }
  public double getElValorGamma_() {
    return elValorGamma_;
  }
  public void setElValorGamma_(double elValorGamma_) {
    this.elValorGamma_ = elValorGamma_;
  }
  public JRadioButton getElBotonGamma_() {
    return elBotonGamma_;
  }
  public void setElBotonGamma_(JRadioButton elBotonGamma_) {
    this.elBotonGamma_ = elBotonGamma_;
  }
  public JLabel getElLabelGamma_() {
    return elLabelGamma_;
  }
  public void setElLabelGamma_(JLabel elLabelGamma_) {
    this.elLabelGamma_ = elLabelGamma_;
  }
  public JSlider getElSliderGamma_() {
    return elSliderGamma_;
  }
  public void setElSliderGamma_(JSlider elSliderGamma_) {
    this.elSliderGamma_ = elSliderGamma_;
  }
  public JLabel getElLabelValorGamma_() {
    return elLabelValorGamma_;
  }
  public void setElLabelValorGamma_(JLabel elLabelValorGamma_) {
    this.elLabelValorGamma_ = elLabelValorGamma_;
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
  public TransfPunto getLasHerramientasT_() {
    return lasHerramientasT_;
  }
  public void setLasHerramientasT_(TransfPunto lasHerramientasT_) {
    this.lasHerramientasT_ = lasHerramientasT_;
  }
  public double getLaEscala_() {
    return laEscala_;
  }
  public void setLaEscala_(double laEscala_) {
    this.laEscala_ = laEscala_;
  }
  public VentanaInterna getLaVentanaAct_() {
    return laVentanaAct_;
  }
  public void setLaVentanaAct_(VentanaInterna laVentanaAct_) {
    this.laVentanaAct_ = laVentanaAct_;
  }
  public Histograma getElhistogramaAux_() {
	return elhistogramaAux_;
  }
  public void setElhistogramaAux_(Histograma elhistogramaAux_) {
	this.elhistogramaAux_ = elhistogramaAux_;
  }
  //-FIN--------------------
		
  //____________________
  // Atributos privados:
  private Histograma elhistogramaAux_;
  private BufferedImage laImagenResultado_;
  
  private PanelGraf256 elPanelHistograma_;
  private JPanel elPanelImagenPrevia_;
  
  private JRadioButton elBotonUmbral_;
  private int elValorUmbral_;
  private JLabel elLabelUmbral_;
  private JSlider elSliderUmbral_;
  private JLabel elLabelValorUmbral_;
  
  private JRadioButton elBotonGamma_;
  private double elValorGamma_;
  private JLabel elLabelGamma_;
  private JSlider elSliderGamma_;
  private JLabel elLabelValorGamma_;
  
  private JButton elBotAceptar_;
  private JButton elBotCancelar_;
  
  private TransfPunto lasHerramientasT_;
  private double laEscala_;
  private VentanaInterna laVentanaAct_;
  //-FIN------------------

  //__________________
  // MŽtodos privados:
  private void inicializar () {
    setLayout(null);
    setLasHerramientasT_(new TransfPunto());
    setTitle("Panel cambio Umbral/Correccion Gamma");
    
    setLaImagenResultado_(getLaVentanaAct_().imagenActiva());
    setElhistogramaAux_(new Histograma());
    getElhistogramaAux_().calcularHistograma(getLaImagenResultado_());
    
    setElPanelHistograma_(new PanelGraf256(getElhistogramaAux_().getElHistograma_()));
    getElPanelHistograma_().setLocation(ANCHO_BORD, ANCHO_BORD);
    getElPanelHistograma_().setBorder(new LineBorder(Color.black));
    
    
    setElPanelImagenPrevia_(new JPanel() {
        public void paintComponent (Graphics g) {
          Image imagenTmp = getLaImagenResultado_();
          g.setColor(getLaVentanaAct_().getLaRefZonaTrabajo_().getBackground());
          g.fillRect(0, 0, this.getWidth(), this.getHeight());
          if (imagenTmp != null){
		    g.drawImage(imagenTmp, 0, 0,(int) Math.round(imagenTmp.getWidth(null) * getLaEscala_()), 
		    		                    (int) Math.round(imagenTmp.getHeight(null) * getLaEscala_()), null);
		  }
        }
      });
      getElPanelImagenPrevia_().setLocation(2 * ANCHO_BORD + getElPanelHistograma_().getWidth(), ANCHO_BORD);
      getElPanelImagenPrevia_().setSize(getElPanelHistograma_().getWidth()
    		                        , getElPanelHistograma_().getWidth());
      getElPanelImagenPrevia_().setBorder(new LineBorder(Color.red));
      getElPanelImagenPrevia_().setBackground(Color.darkGray);
      
      setElBotonUmbral_(new JRadioButton("Umbral"));
      getElBotonUmbral_().setLocation(ANCHO_BORD, 2 * ANCHO_BORD + getElPanelHistograma_().getHeight());
      getElBotonUmbral_().setSize(70, 50);
      getElBotonUmbral_().setBorder(new LineBorder(Color.black));
      getElBotonUmbral_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  if (getElBotonUmbral_().isSelected()) {
		    getElBotonGamma_().setSelected(false); 
			getElSliderUmbral_().setEnabled(true);
		    setLaImagenResultado_(getLasHerramientasT_()
		             .calcularBinUmbral(getLaVentanaAct_()
		            		           .imagenActiva(), getElValorUmbral_()));
		    getElhistogramaAux_().calcularHistograma(getLaImagenResultado_());
            getElPanelImagenPrevia_().repaint();
            getElPanelHistograma_().cargarDatos(getElhistogramaAux_().getElHistograma_());
		  } else {
			getElSliderUmbral_().setEnabled(false);
			setLaImagenResultado_(getLaVentanaAct_().imagenActiva());
			setElhistogramaAux_(getLaVentanaAct_().getElHistograma_());
			getElPanelImagenPrevia_().repaint();
			getElPanelHistograma_().cargarDatos(getElhistogramaAux_().getElHistograma_());
		  }
		}
	  });
      
      
      setElSliderUmbral_(new JSlider(JSlider.HORIZONTAL, 0, 255, 127));
      getElSliderUmbral_().setLocation(getElBotonUmbral_().getX() + getElBotonUmbral_().getWidth() + 1
    		                          , getElBotonUmbral_().getY());
      getElSliderUmbral_().setSize(224, 50);
      getElSliderUmbral_().setMajorTickSpacing(125);
      getElSliderUmbral_().setMinorTickSpacing(Math.round(125 / 5));
      getElSliderUmbral_().setPaintTicks(true);
      getElSliderUmbral_().setPaintLabels(true);
      getElSliderUmbral_().setBorder(new LineBorder(Color.black));
      setElValorUmbral_(getElSliderUmbral_().getValue());
      getElSliderUmbral_().addChangeListener(new ChangeListener() {
		@Override
		public void stateChanged(ChangeEvent arg0) {
		  setElValorUmbral_(getElSliderUmbral_().getValue());
		  getElLabelValorUmbral_().setText(" U: " + getElSliderUmbral_().getValue());
		  
		  setLaImagenResultado_(getLasHerramientasT_()
		             .calcularBinUmbral(getLaVentanaAct_()
		            		           .imagenActiva(), getElValorUmbral_()));
		  getElhistogramaAux_().calcularHistograma(getLaImagenResultado_());
          getElPanelImagenPrevia_().repaint();
          getElPanelHistograma_().cargarDatos(getElhistogramaAux_().getElHistograma_());
		}
	  });
      getElSliderUmbral_().setEnabled(false);
      
      setElLabelValorUmbral_(new JLabel(" U: " + getElValorUmbral_()));
      getElLabelValorUmbral_().setLocation(getElSliderUmbral_().getX() + getElSliderUmbral_().getWidth() + 1
    		                         , getElSliderUmbral_().getY());
      getElLabelValorUmbral_().setSize(60, 50);
      getElLabelValorUmbral_().setBorder(new LineBorder(Color.black));
      
      
      
      
      
      
      setElBotonGamma_(new JRadioButton("Gamma"));
      getElBotonGamma_().setLocation(ANCHO_BORD, 3 * ANCHO_BORD + getElPanelHistograma_().getHeight()
    		                                                    + getElBotonUmbral_().getHeight());
      getElBotonGamma_().setSize(70, 50);
      getElBotonGamma_().setBorder(new LineBorder(Color.black));
      getElBotonGamma_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  if (getElBotonGamma_().isSelected()) {
		    getElBotonUmbral_().setSelected(false); 
			getElSliderGamma_().setEnabled(true);
		    setLaImagenResultado_(getLasHerramientasT_()
		             .calcularTransfGama(getLaVentanaAct_()
		            		             .imagenActiva(), getElValorGamma_()));
		    getElhistogramaAux_().calcularHistograma(getLaImagenResultado_());
            getElPanelImagenPrevia_().repaint();
            getElPanelHistograma_().cargarDatos(getElhistogramaAux_().getElHistograma_());
		  } else {
			getElSliderGamma_().setEnabled(false);
			setLaImagenResultado_(getLaVentanaAct_().imagenActiva());
			setElhistogramaAux_(getLaVentanaAct_().getElHistograma_());
			getElPanelImagenPrevia_().repaint();
			getElPanelHistograma_().cargarDatos(getElhistogramaAux_().getElHistograma_());
		  }
		}
	  });
      
      setElSliderGamma_(new JSlider(JSlider.HORIZONTAL, 0, 500, 127));
      getElSliderGamma_().setLocation(getElBotonGamma_().getX() + getElBotonGamma_().getWidth() + 1
    		                          , getElBotonGamma_().getY());
      getElSliderGamma_().setSize(224, 50);
      getElSliderGamma_().setMajorTickSpacing(250);
      getElSliderGamma_().setMinorTickSpacing(Math.round(250 / 5));
      getElSliderGamma_().setPaintTicks(true);
      getElSliderGamma_().setPaintLabels(true);
      getElSliderGamma_().setBorder(new LineBorder(Color.black));
      setElValorGamma_(getElSliderGamma_().getValue() / 100.0);
      getElSliderGamma_().addChangeListener(new ChangeListener() {
  		@Override
  		public void stateChanged(ChangeEvent arg0) {
  		  setElValorGamma_(getElSliderGamma_().getValue() / 100.0);
  		  getElLabelValorGamma_().setText(" G: " + getElSliderGamma_().getValue() / 100.0);
  		  
  		  setLaImagenResultado_(getLasHerramientasT_()
	             .calcularTransfGama(getLaVentanaAct_()
	            		             .imagenActiva(), getElValorGamma_()));
  		  getElhistogramaAux_().calcularHistograma(getLaImagenResultado_());
          getElPanelImagenPrevia_().repaint();
          getElPanelHistograma_().cargarDatos(getElhistogramaAux_().getElHistograma_());
  		}
  	  });
      
      getElSliderGamma_().setEnabled(false);
      
      setElLabelValorGamma_(new JLabel(" G: " + getElValorGamma_()));
      getElLabelValorGamma_().setLocation(getElSliderGamma_().getX() + getElSliderGamma_().getWidth() + 1
    		                         , getElSliderGamma_().getY());
      getElLabelValorGamma_().setSize(60, 50);
      getElLabelValorGamma_().setBorder(new LineBorder(Color.black));
      
      setElBotAceptar_(new JButton("Aceptar"));
      getElBotAceptar_().setLocation(2 * ANCHO_BORD + getElPanelHistograma_().getWidth() + 200
    		                        , 2 * ANCHO_BORD + getElPanelImagenPrevia_().getHeight());
      getElBotAceptar_().setSize(75, 50);
      getElBotAceptar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  getLaVentanaAct_().getLaRefZonaTrabajo_().nuevaVentanaInterna(10, 10, getLaImagenResultado_());
		  try {
			getLaVentanaAct_().getLaRefZonaTrabajo_().getVecVentanas_().lastElement().setSelected(true);
		  } catch (PropertyVetoException e) {
			e.printStackTrace();
		  }
		  dispose ();
	    }
	  });
      
      setElBotCancelar_(new JButton("Cancelar"));
      getElBotCancelar_().setLocation(getElBotAceptar_().getX() + getElBotAceptar_().getWidth() + ANCHO_BORD
    		                         , getElBotAceptar_().getY());
      getElBotCancelar_().setSize(75, 50);
      getElBotCancelar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  dispose();
		}
	  });
      
      add(getElPanelHistograma_());
      add(getElPanelImagenPrevia_());
      add(getElBotonUmbral_());
      add(getElSliderUmbral_());
      add(getElLabelValorUmbral_());
      add(getElBotonGamma_());
      add(getElSliderGamma_());
      add(getElLabelValorGamma_());
      add(getElBotAceptar_());
      add(getElBotCancelar_());
      
      calcularEscala ();
      
      setSize(3 * ANCHO_BORD + 2 * getElPanelHistograma_().getWidth()
      		, (5 * ANCHO_BORD) + getElPanelImagenPrevia_().getHeight() + (2 * 30));
      setVisible(true);
      setResizable(false); 
  }
  
  private void calcularEscala () {
	  double escala = 1;
	  int ancho = getLaImagenResultado_().getWidth();
      int alto = getLaImagenResultado_().getHeight();
      if ((ancho >= alto) && (ancho > getElPanelImagenPrevia_().getWidth())) {
        escala = getElPanelImagenPrevia_().getWidth() / (1.0 * ancho);
      } else if (alto > getElPanelImagenPrevia_().getHeight()){
    	escala = getElPanelImagenPrevia_().getHeight() / (1.0 * alto);
      }
      setLaEscala_(escala);
  }
  //-FIN-------------------------
}
