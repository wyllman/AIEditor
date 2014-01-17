package interfazGrafica;

import herramientas.Geometria;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class PanelRotacionEscalado extends JDialog {
  //______________________________________
  // Atributos constantes predeterminados:
  final static int ANCHO_BORD = 5;
	
  //-FIN---------------	

  //_______________
  // Constructores:
  public PanelRotacionEscalado (VentanaInterna laVent) {
	  setLaVentana_(laVent);
	  inicializar();
  }
  //-FIN------------------
   
  //__________________
  // MŽtodos pœblicos:
  //-FIN------------------
  
  //______________________
  // Manejadores pœblicos:
  public JLabel getElLabelInterpolacion_() {
	return elLabelInterpolacion_;
  }
  public void setElLabelInterpolacion_(JLabel elLabelInterpolacion_) {
	this.elLabelInterpolacion_ = elLabelInterpolacion_;
  }
  public JLabel getElLabelOperacion_() {
	return elLabelOperacion_;
  }
  public void setElLabelOperacion_(JLabel elLabelOperacion_) {
	this.elLabelOperacion_ = elLabelOperacion_;
  }
  public JRadioButton getElBotonEscalado_() {
	return escalado_;
  }
  public void setElBotonEscalado_(JRadioButton escalado_) {
	this.escalado_ = escalado_;
  }
  public JRadioButton getElBotonVMC_() {
	return elBotonVMC_;
  }
  public void setElBotonVMC_(JRadioButton vMC_) {
	this.elBotonVMC_ = vMC_;
  }
  public JRadioButton getElBotonBilineal_() {
	return bilineal_;
  }
  public void setElBotonBilineal_(JRadioButton bilineal_) {
	this.bilineal_ = bilineal_;
  }
  public JLabel getElLabelX_() {
	return elLabelX_;
  }
  public void setElLabelX_(JLabel elLabelX_) {
	this.elLabelX_ = elLabelX_;
  }
  public JSlider getElSliderX_() {
	return elSliderX_;
  }
  public void setElSliderX_(JSlider elSliderX_) {
	this.elSliderX_ = elSliderX_;
  }
  public JLabel getElLabelY_() {
	return elLabelY_;
  }
  public void setElLabelY_(JLabel elLabelY_) {
	this.elLabelY_ = elLabelY_;
  }
  public JSlider getElSliderY_() {
	return elSliderY_;
  }
  public void setElSliderY_(JSlider elSliderY_) {
	this.elSliderY_ = elSliderY_;
  }
  public JRadioButton getElBotonRotacion_() {
	return rotacion_;
  }
  public void setElBotonRotacion_(JRadioButton rotacion_) {
	this.rotacion_ = rotacion_;
  }
  public JLabel getElLabelRotacion_() {
	return elLabelRotacion_;
  }
  public void setElLabelRotacion_(JLabel elLabelRotacion_) {
	this.elLabelRotacion_ = elLabelRotacion_;
  }
  public JLabel getElLabel_Grados() {
	return elLabel_Grados;
  }
  public void setElLabel_Grados(JLabel elLabel_Grados) {
	this.elLabel_Grados = elLabel_Grados;
  }
  public JSlider getElSliderGrados_() {
	return elSliderGrados_;
  }
  public void setElSliderGrados_(JSlider elSliderGrados_) {
	this.elSliderGrados_ = elSliderGrados_;
  }
  public JButton getElBotonAceptar_() {
	return aceptar_;
  }
  public void setElBotonAceptar_(JButton aceptar_) {
	this.aceptar_ = aceptar_;
  }
  public JButton getElBotonCancelar_() {
	return cancelar_;
  }
  public void setElBotonCancelar_(JButton cancelar_) {
	this.cancelar_ = cancelar_;
  }
  public BufferedImage getLaImagenResultado_() {
	return laImagenResultado_;
  }
  public void setLaImagenResultado_(BufferedImage laImagenResultado_) {
	this.laImagenResultado_ = laImagenResultado_;
  }
  public JRadioButton getElBotonRotarPintar_() {
	return rotarPintar_;
  }
  public void setElBotonRotarPintar_(JRadioButton rotarPintar_) {
	this.rotarPintar_ = rotarPintar_;
  }
  public VentanaInterna getLaVentana_() {
	return laVentana_;
  }
  public void setLaVentana_(VentanaInterna laVentana_) {
	this.laVentana_ = laVentana_;
  }
  public Geometria getLasHerramientas_() {
	return lasHerramientas_;
  }
  public void setLasHerramientas_(Geometria lasHerramientas_) {
	this.lasHerramientas_ = lasHerramientas_;
  }
  public JTextField getLaInfoSliderX_() {
	return laInfoSliderX_;
  }
  public void setLaInfoSliderX_(JTextField laInfoSliderX_) {
	this.laInfoSliderX_ = laInfoSliderX_;
  }
  public JTextField getLaInfoSliderY_() {
	return laInfoSliderY_;
  }
  public void setLaInfoSliderY_(JTextField laInfoSliderY_) {
	this.laInfoSliderY_ = laInfoSliderY_;
  }
  public JTextField getLaInfoSliderGrados_() {
	return laInfoSliderGrados_;
  }
  public void setLaInfoSliderGrados_(JTextField laInfoSliderGrados_) {
	this.laInfoSliderGrados_ = laInfoSliderGrados_;
  }
  //-FIN-------------------

  //____________________
  // Atributos privados:
  private BufferedImage laImagenResultado_;
  private VentanaInterna laVentana_;
  private Geometria lasHerramientas_;

  private JLabel elLabelInterpolacion_;
  private JRadioButton elBotonVMC_;
  private JRadioButton bilineal_;
  private JRadioButton rotarPintar_;

  private JLabel elLabelOperacion_;
  private JRadioButton escalado_;
  
  private JLabel elLabelX_;
  private JSlider elSliderX_;
  private JTextField laInfoSliderX_;
  
  private JLabel elLabelY_;
  private JSlider elSliderY_;
  private JTextField laInfoSliderY_;

  private JRadioButton rotacion_;
  private JLabel elLabelRotacion_;
  
  private JLabel elLabel_Grados;
  private JSlider elSliderGrados_;
  private JTextField laInfoSliderGrados_;
  
  private JButton aceptar_;
  private JButton cancelar_;
  
  //-FIN------------------

  //__________________
  // MŽtodos privados:
  private void inicializar () {
	setLayout(null);
	setSize(625, 220);
	setLasHerramientas_(new Geometria());
	
	setElLabelInterpolacion_(new JLabel(" Interpolacion: "));
	getElLabelInterpolacion_().setLocation(ANCHO_BORD, ANCHO_BORD);
	getElLabelInterpolacion_().setSize(240, 30);
	getElLabelInterpolacion_().setBorder(new LineBorder(Color.black));
	add(getElLabelInterpolacion_());
	
	setElBotonVMC_(new JRadioButton("VMC"));
	getElBotonVMC_().setLocation(ANCHO_BORD, 2 * ANCHO_BORD + getElLabelInterpolacion_().getHeight());
    getElBotonVMC_().setSize(110, 30);
    getElBotonVMC_().setBorder(new LineBorder(Color.black));
    getElBotonVMC_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  if (getElBotonVMC_().isSelected()) {
		    getElBotonBilineal_().setSelected(false);
		    getLasHerramientas_().setInterpolacionBilinear(false);
		  }
		}
	});
    getElBotonVMC_().setSelected(true);
    getLasHerramientas_().setInterpolacionBilinear(false);
    add(getElBotonVMC_());
    
    setElBotonBilineal_(new JRadioButton("Bilineal"));
    getElBotonBilineal_().setLocation(2 * ANCHO_BORD + getElBotonVMC_().getWidth()
    		                         , 2 * ANCHO_BORD + getElLabelInterpolacion_().getHeight());
    getElBotonBilineal_().setSize(110, 30);
    getElBotonBilineal_().setBorder(new LineBorder(Color.black));
    getElBotonBilineal_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  if (getElBotonBilineal_().isSelected()) {
		    getElBotonVMC_().setSelected(false); 
		    getLasHerramientas_().setInterpolacionBilinear(true);
		  }
		}
	});
    add(getElBotonBilineal_());
    
    setElLabelOperacion_(new JLabel(" Operacion:"));
    getElLabelOperacion_().setLocation(getWidth() / 2, getElLabelInterpolacion_().getY());
    getElLabelOperacion_().setSize(240, 30);
    getElLabelOperacion_().setBorder(new LineBorder(Color.black));
    add(getElLabelOperacion_());
    
    setElBotonEscalado_(new JRadioButton("Escalado"));
    getElBotonEscalado_().setLocation(getWidth() / 2
    		                         , getElLabelOperacion_().getY() + ANCHO_BORD + getElLabelOperacion_().getHeight());
    getElBotonEscalado_().setSize(110, 30);
    getElBotonEscalado_().setBorder(new LineBorder(Color.black));
    getElBotonEscalado_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  if (getElBotonEscalado_().isSelected()) {
		    getElBotonRotacion_().setSelected(false);
		    getElBotonRotarPintar_().setEnabled(false);
		    getElSliderGrados_().setEnabled(false);
			getElSliderX_().setEnabled(true);
			getElSliderY_().setEnabled(true);
		  } else {
			getElBotonEscalado_().setSelected(true);
		  }
		}
	});
    getElBotonEscalado_().setSelected(true);
    add(getElBotonEscalado_());
    
    setElBotonRotacion_(new JRadioButton("Rotacion"));
    getElBotonRotacion_().setLocation(getElBotonEscalado_().getX() + getElBotonEscalado_().getWidth() + ANCHO_BORD
    		                         , getElLabelOperacion_().getY() + ANCHO_BORD + getElLabelOperacion_().getHeight());
    getElBotonRotacion_().setSize(110, 30);
    getElBotonRotacion_().setBorder(new LineBorder(Color.black));
    getElBotonRotacion_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  if (getElBotonRotacion_().isSelected()) {
		    getElBotonEscalado_().setSelected(false);
		    getElBotonRotarPintar_().setEnabled(true);
			getElSliderGrados_().setEnabled(true);
			getElSliderX_().setEnabled(false);
			getElSliderY_().setEnabled(false);
		  } else {
			getElBotonRotacion_().setSelected(true);
		  }
		}
	  });
    add(getElBotonRotacion_());
    
    setElLabelX_(new JLabel(" X: "));
    getElLabelX_().setLocation(ANCHO_BORD, getElBotonEscalado_().getY() + getElBotonEscalado_().getHeight() + ANCHO_BORD);
    getElLabelX_().setSize(30, 50);
    getElLabelX_().setBorder(new LineBorder(Color.black));
    add(getElLabelX_());
    
    setElSliderX_(new JSlider(JSlider.HORIZONTAL, 1, 501, 100));
    getElSliderX_().setLocation(getElLabelX_().getX() + getElLabelX_().getWidth() + 1
               , getElLabelX_().getY());
    getElSliderX_().setSize(224, 50);
    getElSliderX_().setMajorTickSpacing(250);
    getElSliderX_().setMinorTickSpacing(50);
    getElSliderX_().setPaintTicks(true);
    getElSliderX_().setPaintLabels(false);
    getElSliderX_().setBorder(new LineBorder(Color.black));
    getElSliderX_().setEnabled(true);
    getElSliderX_().addChangeListener(new ChangeListener() {
		@Override
		public void stateChanged(ChangeEvent arg0) {
			getLaInfoSliderX_().setText(String.valueOf(getElSliderX_().getValue() / 100.0));
		}
	});
    add(getElSliderX_());
    
    setLaInfoSliderX_(new JTextField());
    getLaInfoSliderX_().setLocation(getElSliderX_().getX() + getElSliderX_().getWidth() + 1
    		                       , getElSliderX_().getY());
    getLaInfoSliderX_().setSize(50, 50);
    getLaInfoSliderX_().setText(String.valueOf(getElSliderX_().getValue() / 100.0));
    getLaInfoSliderX_().setEditable(false);
    add(getLaInfoSliderX_());
    
    
    
    setElLabelY_(new JLabel(" Y: "));
    getElLabelY_().setLocation(ANCHO_BORD, getElLabelX_().getY() + getElLabelX_().getHeight() + ANCHO_BORD);
    getElLabelY_().setSize(30, 50);
    getElLabelY_().setBorder(new LineBorder(Color.black));
    add(getElLabelY_());
    
    setElSliderY_(new JSlider(JSlider.HORIZONTAL, 1, 501, 100));
    getElSliderY_().setLocation(getElLabelY_().getX() + getElLabelY_().getWidth() + 1
  		                          , getElLabelY_().getY());
    getElSliderY_().setSize(224, 50);
    getElSliderY_().setMajorTickSpacing(250);
    getElSliderY_().setMinorTickSpacing(50);
    getElSliderY_().setPaintTicks(true);
    getElSliderY_().setPaintLabels(false);
    getElSliderY_().setBorder(new LineBorder(Color.black));
    getElSliderY_().setEnabled(true);
    getElSliderY_().addChangeListener(new ChangeListener() {
		@Override
		public void stateChanged(ChangeEvent arg0) {
			getLaInfoSliderY_().setText(String.valueOf(getElSliderY_().getValue() / 100.0));
		}
	});
    add(getElSliderY_());
    
    setLaInfoSliderY_(new JTextField());
    getLaInfoSliderY_().setLocation(getElSliderY_().getX() + getElSliderY_().getWidth() + 1
    		                       , getElSliderY_().getY());
    getLaInfoSliderY_().setSize(50, 50);
    getLaInfoSliderY_().setText(String.valueOf(getElSliderY_().getValue() / 100.0));
    getLaInfoSliderY_().setEditable(false);
    add(getLaInfoSliderY_());
    
    setElLabel_Grados(new JLabel(" Gr: "));
    getElLabel_Grados().setLocation(getLaInfoSliderX_().getX() + getLaInfoSliderX_().getWidth() + ANCHO_BORD
    		                       , getLaInfoSliderX_().getY());
    getElLabel_Grados().setSize(30, 50);
    getElLabel_Grados().setBorder(new LineBorder(Color.black));
    add(getElLabel_Grados());
    
    setElSliderGrados_(new JSlider(JSlider.HORIZONTAL, 0, 3600, 0));
    getElSliderGrados_().setLocation(getElLabel_Grados().getX() + getElLabel_Grados().getWidth() + 1
  		                          , getElLabel_Grados().getY());
    getElSliderGrados_().setSize(224, 50);
    getElSliderGrados_().setMajorTickSpacing(900);
    getElSliderGrados_().setMinorTickSpacing(225);
    getElSliderGrados_().setPaintTicks(true);
    getElSliderGrados_().setPaintLabels(false);
    getElSliderGrados_().setBorder(new LineBorder(Color.black));
    getElSliderGrados_().setEnabled(false);
    getElSliderGrados_().addChangeListener(new ChangeListener() {
		@Override
		public void stateChanged(ChangeEvent arg0) {
			getLaInfoSliderGrados_().setText(String.valueOf(getElSliderGrados_().getValue() / 10.0));
		}
	});
    add(getElSliderGrados_());
    
    setLaInfoSliderGrados_(new JTextField());
    getLaInfoSliderGrados_().setLocation(getElSliderGrados_().getX() + getElSliderGrados_().getWidth() + 1
    		                            , getElSliderGrados_().getY());
    getLaInfoSliderGrados_().setSize(50, 50);
    getLaInfoSliderGrados_().setText(String.valueOf(getElSliderGrados_().getValue() / 10.0));
    getLaInfoSliderGrados_().setEditable(false);
    add(getLaInfoSliderGrados_());
    
    setElBotonRotarPintar_(new JRadioButton("Rotar/Pintar"));
    getElBotonRotarPintar_().setLocation(getElLabel_Grados().getX()
    		                             , getElLabel_Grados().getY() + getElLabel_Grados().getHeight() + ANCHO_BORD);
    getElBotonRotarPintar_().setSize(110, 50);
    getElBotonRotarPintar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		   if (getElBotonRotarPintar_().isSelected()) {
		      getElBotonBilineal_().setEnabled(false);
		      getElBotonVMC_().setEnabled(false);
		   } else {
			  getElBotonBilineal_().setEnabled(true);
			  getElBotonVMC_().setEnabled(true);
		   }
		}
	});
    getElBotonRotarPintar_().setEnabled(false);
    add(getElBotonRotarPintar_());
    
    
     setElBotonAceptar_(new JButton("Aceptar"));
     getElBotonAceptar_().setLocation(getWidth() - (2 * 75 + 2 * ANCHO_BORD)
    		                         , getElBotonRotarPintar_().getY() );
     getElBotonAceptar_().setSize(75, 50);
     getElBotonAceptar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  if (getElBotonEscalado_().isSelected()) {
			  setLaImagenResultado_(getLasHerramientas_().escalar(getElSliderX_().getValue()
					                                             , getElSliderY_().getValue()
					                                             , getLaVentana_().imagenActiva()));
		  } else if (getElBotonRotacion_().isSelected()) {
		      setLaImagenResultado_(getLasHerramientas_().rotar(getElSliderGrados_().getValue() / 10.0
		    		                                           , getElBotonRotarPintar_().isSelected()
		    		                                           , getLaVentana_().imagenActiva()));
		  }
		  getLaVentana_().getLaRefZonaTrabajo_().nuevaVentanaInterna(10, 10, getLaImagenResultado_());
		  getLaVentana_().getLaRefZonaTrabajo_()
		     .getVecVentanas_().lastElement()
		     .getElHistograma_().getElHistograma_()[0] -= getLasHerramientas_().getContadorDeFondo();
		  try {
			getLaVentana_().getLaRefZonaTrabajo_().getVecVentanas_().lastElement().setSelected(true);
		  } catch (PropertyVetoException e) {
			e.printStackTrace();
		  }
		  dispose ();
	    }
	  });
     add(getElBotonAceptar_());
     
     setElBotonCancelar_(new JButton("Cancelar"));
     getElBotonCancelar_().setLocation(getElBotonAceptar_().getX() + getElBotonAceptar_().getWidth() + ANCHO_BORD
   		                         , getElBotonAceptar_().getY());
     getElBotonCancelar_().setSize(75, 50);
     getElBotonCancelar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  dispose();
		}
	  });
     add(getElBotonCancelar_());
  
    setTitle("Panel Rotacion/Escalado.");
    setLocation(50, 50);
    setVisible(true);
    setResizable(false);
    
  }
  //-FIN-------------------------

}
