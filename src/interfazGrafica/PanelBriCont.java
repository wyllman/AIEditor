package interfazGrafica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import herramientas.Histograma;
import herramientas.TransfPunto;

@SuppressWarnings("serial")
public class PanelBriCont extends JDialog {
	//______________________________________
	// Atributos constantes predeterminados:
	final static int ANCHO_BORD = 5;
	//-FIN---------------	

	//_______________
	// Constructores:
    public PanelBriCont (VentanaInterna laVent) {
      setLaVentana_(laVent);	
      inicializar();
    }
	//-FIN------------------
	    
	//__________________
	// MŽtodos pœblicos:

	//-FIN------------------
		
	//______________________
	// Manejadores pœblicos:
	public Histograma getElhistogramaAux_() {
		return elhistogramaAux_;
	}
	public void setElhistogramaAux_(Histograma elhistogramaAux_) {
		this.elhistogramaAux_ = elhistogramaAux_;
	}
	public BufferedImage getLaImagenAux_() {
		return laImagenAux_;
	}
	public void setLaImagenAux_(BufferedImage laImagenAux_) {
		this.laImagenAux_ = laImagenAux_;
	}
	public VentanaInterna getLaVentana_() {
		return laVentana_;
	}
	public void setLaVentana_(VentanaInterna laVentana_) {
		this.laVentana_ = laVentana_;
	}
	public PanelGraf256 getElPanelHisto_() {
		return elPanelHisto_;
	}
	public void setElPanelHisto_(PanelGraf256 elPanelHisto_) {
		this.elPanelHisto_ = elPanelHisto_;
	}
	public JPanel getElPanelImgPrevia_() {
		return elPanelImgPrevia_;
	}
	public void setElPanelImgPrevia_(JPanel elPanelImgPrevia_) {
		this.elPanelImgPrevia_ = elPanelImgPrevia_;
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
    public JSlider getElSldBrillo_() {
	  return elSldBrillo_;
    }
    public void setElSldBrillo_(JSlider elSldBrillo_) {
	  this.elSldBrillo_ = elSldBrillo_;
    }
    public JSlider getElSldContraste_() {
	  return elSldContraste_;
    }
    public void setElSldContraste_(JSlider elSldContraste_) {
	  this.elSldContraste_ = elSldContraste_;
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
    public JTextField getLaInfBrillo_() {
    	return laInfBrillo_;
    }

    public void setLaInfBrillo_(JTextField laInfBrillo_) {
    	this.laInfBrillo_ = laInfBrillo_;
    }
    public JTextField getElNombBrillo_() {
    	return elNombBrillo_;
    }
    public void setElNombBrillo_(JTextField elNombBrillo_) {
    	this.elNombBrillo_ = elNombBrillo_;
    }
    public JTextField getElNombContr_() {
    	return elNombContr_;
    }
    public void setElNombContr_(JTextField elNombContr_) {
    	this.elNombContr_ = elNombContr_;
    }
    public JTextField getLaInfContr_() {
    	return laInfContr_;
    }
    public void setLaInfContr_(JTextField laInfContr_) {
    	this.laInfContr_ = laInfContr_;
    }
	//-FIN--------------------
		

    //____________________
	// Atributos privados:
   private Histograma elhistogramaAux_;
   private BufferedImage laImagenAux_;
   private VentanaInterna laVentana_;
   
   private PanelGraf256 elPanelHisto_;
   private JPanel elPanelImgPrevia_;
   
   private JButton elBotAceptar_;
   private JButton elBotCancelar_;
   
   private JSlider elSldBrillo_;
   private JSlider elSldContraste_;
   
   private JTextField laInfBrillo_;
   private JTextField elNombBrillo_;
   

   private JTextField laInfContr_;
   private JTextField elNombContr_;


   private TransfPunto lasHerramientasT_;
   private double laEscala_;
	//-FIN------------------


	//__________________
	// MŽtodos privados:
    private void inicializar () {
      int ancho;
      int alto;
      double escala = 1;
      setLasHerramientasT_(new TransfPunto());
    	
      setLayout(null);
    
      setLaImagenAux_(getLaVentana_().imagenActiva());
     
      
      setElhistogramaAux_(new Histograma());
      getElhistogramaAux_().calcularHistograma(getLaImagenAux_());
      
      setElPanelHisto_(new PanelGraf256(getElhistogramaAux_().getElHistograma_()));
      getElPanelHisto_().setLocation(ANCHO_BORD, ANCHO_BORD);
      getElPanelHisto_().setBorder(new LineBorder(Color.black));
      setElPanelImgPrevia_(new JPanel() {
        public void paintComponent (Graphics g) {
          Image imagenTmp = getLaImagenAux_();
          g.setColor(getLaVentana_().getLaRefZonaTrabajo_().getBackground());
          g.fillRect(0, 0, this.getWidth(), this.getHeight());
          if (imagenTmp != null){
		    g.drawImage(imagenTmp, 0, 0,(int) Math.round(imagenTmp.getWidth(null) * getLaEscala_()), 
		    		                    (int) Math.round(imagenTmp.getHeight(null) * getLaEscala_()), null);
		  }
        }
      });
      getElPanelImgPrevia_().setLocation(2 * ANCHO_BORD + getElPanelHisto_().getWidth(), ANCHO_BORD);
      getElPanelImgPrevia_().setSize(getElPanelHisto_().getWidth()
    		                        , getElPanelHisto_().getWidth());
      getElPanelImgPrevia_().setBorder(new LineBorder(Color.red));
      getElPanelImgPrevia_().setBackground(Color.darkGray);
      
      setElSldBrillo_(new JSlider(JSlider.HORIZONTAL,
              0, 255,(int) Math.round(getLaVentana_().getElHistograma_().calcularMedia())));
      getElSldBrillo_().setMajorTickSpacing(125);
      getElSldBrillo_().setMinorTickSpacing(Math.round(125 / 5));
      getElSldBrillo_().setPaintTicks(true);
      getElSldBrillo_().setPaintLabels(true);
      getElSldBrillo_().setLocation(ANCHO_BORD + 50, 2 * ANCHO_BORD + getElPanelHisto_().getHeight());
      getElSldBrillo_().setSize(getElPanelHisto_().getWidth() - 100, 50);
      getElSldBrillo_().setBorder(new LineBorder(Color.black));
        getElSldBrillo_().setToolTipText("Cambiar el brillo");
      getElSldBrillo_().addChangeListener(new ChangeListener() {
		@Override
		public void stateChanged(ChangeEvent arg0) {
	      double valor = ((JSlider) arg0.getSource()).getValue();
	      
	      setLaImagenAux_(getLasHerramientasT_().calcularBrillConstr(getLaVentana_().imagenActiva()
	    		                                                    , valor
	    		                                                    , getElSldContraste_().getValue()
	    		                                                    , getLaVentana_().getElHistograma_()));
	      getElPanelImgPrevia_().repaint();
	      
	      getElhistogramaAux_().calcularHistograma(getLaImagenAux_());
	      getElPanelHisto_().cargarDatos(getElhistogramaAux_().getElHistograma_());
	      getLaInfBrillo_().setText("" + valor);
	      
			
		}
	});
      
      setElSldContraste_(new JSlider(JSlider.HORIZONTAL,
              0, 130,(int) Math.round(getLaVentana_().getElHistograma_().calcularDesvTipica())));
      getElSldContraste_().setMajorTickSpacing(130 / 2);
      getElSldContraste_().setMinorTickSpacing(Math.round(130 / (5 * 2)));
      getElSldContraste_().setPaintTicks(true);
      getElSldContraste_().setPaintLabels(true);
      getElSldContraste_().setLocation(ANCHO_BORD + 50, 3 * ANCHO_BORD + getElPanelHisto_().getHeight() + 50);
      getElSldContraste_().setSize(getElPanelHisto_().getWidth() - 100, 50);
      getElSldContraste_().setBorder(new LineBorder(Color.black));
      getElSldContraste_().setToolTipText("Cambiar el contraste");
      getElSldContraste_().addChangeListener(new ChangeListener() {
  		@Override
  		public void stateChanged(ChangeEvent arg0) {
  	      double valor = ((JSlider) arg0.getSource()).getValue();
  	      
  	      setLaImagenAux_(getLasHerramientasT_().calcularBrillConstr(getLaVentana_().imagenActiva()
  	    		                                                    , getElSldBrillo_().getValue()
  	    		                                                    , valor
  	    		                                                    , getLaVentana_().getElHistograma_()));
  	       getElPanelImgPrevia_().repaint();
  	      
  	      getElhistogramaAux_().calcularHistograma(getLaImagenAux_());
  	      getElPanelHisto_().cargarDatos(getElhistogramaAux_().getElHistograma_());
  	      getLaInfContr_().setText("" + valor);
  		}
  	});
      
      
      ancho = getLaImagenAux_().getWidth();
      alto = getLaImagenAux_().getHeight();
      if ((ancho >= alto) && (ancho > getElPanelImgPrevia_().getWidth())) {
        escala = getElPanelImgPrevia_().getWidth() / (1.0 * ancho);
      } else if (alto > getElPanelImgPrevia_().getHeight()){
    	escala = getElPanelImgPrevia_().getHeight() / (1.0 * alto);
      }
      setLaEscala_(escala);
      
      setElBotAceptar_(new JButton("Aceptar"));
      getElBotAceptar_().setLocation(2 * ANCHO_BORD + getElPanelHisto_().getWidth() + 200
    		                        , 2 * ANCHO_BORD + getElPanelImgPrevia_().getHeight());
      getElBotAceptar_().setSize(75, 50);
      getElBotAceptar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  getLaVentana_().getLaRefZonaTrabajo_().nuevaVentanaInterna(10, 10, getLaImagenAux_());
		  try {
			getLaVentana_().getLaRefZonaTrabajo_().getVecVentanas_().lastElement().setSelected(true);
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
      
      setLaInfBrillo_(new JTextField());
      getLaInfBrillo_().setLocation(getElSldBrillo_().getX() + getElSldBrillo_().getWidth() + 1 , getElSldBrillo_().getY());
      getLaInfBrillo_().setBorder(new LineBorder(Color.black));
      getLaInfBrillo_().setSize(49, 50);
      getLaInfBrillo_().setHorizontalAlignment(JTextField.CENTER);
      getLaInfBrillo_().setText("" + getElSldBrillo_().getValue());
      getLaInfBrillo_().setEditable(false);
      
      setElNombBrillo_(new JTextField());
      getElNombBrillo_().setLocation(ANCHO_BORD, getElSldBrillo_().getY());
      getElNombBrillo_().setBorder(new LineBorder(Color.black));
      getElNombBrillo_().setSize(49, 50);
      getElNombBrillo_().setHorizontalAlignment(JTextField.CENTER);
      getElNombBrillo_().setText("Brillo");
      getElNombBrillo_().setEditable(false);
      
      
      setLaInfContr_(new JTextField());
      getLaInfContr_().setLocation(getElSldContraste_().getX() + getElSldContraste_().getWidth() + 1
    		                      , getElSldContraste_().getY());
      getLaInfContr_().setBorder(new LineBorder(Color.black));
      getLaInfContr_().setSize(49, 50);
      getLaInfContr_().setHorizontalAlignment(JTextField.CENTER);
      getLaInfContr_().setText("" + getElSldContraste_().getValue());
      getLaInfContr_().setEditable(false);
      
      setElNombContr_(new JTextField());
      getElNombContr_().setLocation(ANCHO_BORD, getElSldContraste_().getY());
      getElNombContr_().setBorder(new LineBorder(Color.black));
      getElNombContr_().setSize(49, 50);
      getElNombContr_().setHorizontalAlignment(JTextField.CENTER);
      getElNombContr_().setText("Contr.");
      getElNombContr_().setEditable(false);
      
      
      add(getElPanelHisto_());
      add(getElPanelImgPrevia_());
      add(getElSldBrillo_());
      add(getElSldContraste_());
      add(getElBotAceptar_());
      add(getElBotCancelar_());
      add(getLaInfBrillo_());
      add(getElNombBrillo_());
      add(getLaInfContr_());
      add(getElNombContr_());
      
      
      setSize(3 * ANCHO_BORD + 2 * getElPanelHisto_().getWidth()
      		, (5 * ANCHO_BORD) + getElPanelHisto_().getHeight() + (3 * 30) + 30);
      setTitle("Panel Brillo/Contraste.");
      setVisible(true);
      setResizable(false);
      
    }
	//-FIN-------------------------

}
