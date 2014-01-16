/**
 * 
 */
package interfazGrafica;

import herramientas.Internas;
import herramientas.Internas.VectorPuntos;
import herramientas.TransfPunto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * @author tenerent
 *
 */
@SuppressWarnings("serial")
public class PanelTransfLin extends JDialog {
  //______________________________________
  // Atributos constantes predeterminados:
  final static int ANCHO_PANEL = 306;
  final static int ANCHO_BORDES = 5;
  //-FIN---------------	

  //_______________
  // Constructores:
  public PanelTransfLin (VentanaInterna laVentana) {
    setLaVentana_(laVentana);
    inicializar();
  }
  //-FIN------------------
	    
  //__________________
  // MŽtodos pœblicos:

  //-FIN------------------
		
  //______________________
  // Manejadores pœblicos:
  public VentanaInterna getLaVentana_() {
	return laVentana_;
  }
  public void setLaVentana_(VentanaInterna laVentana_) {
	this.laVentana_ = laVentana_;
  }
  public BufferedImage getLaImagenAuxiliar_() {
	return laImagenAuxiliar_;
  }
  public void setLaImagenAuxiliar_(BufferedImage laImagenAuxiliar_) {
	this.laImagenAuxiliar_ = laImagenAuxiliar_;
  }
  public VectorPuntos getElVector_() {
	return elVector_;
  }
  public void setElVector_(VectorPuntos elVector_) {
	this.elVector_ = elVector_;
  }
  public JPanel getElPanelTrans_() {
	return elPanelTrans_;
  }
  public void setElPanelTrans_(JPanel elPanelTrans_) {
	this.elPanelTrans_ = elPanelTrans_;
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
  public Internas getLasHerramientasI_() {
	return lasHerramientasI_;
  }
  public void setLasHerramientasI_(Internas lasHerramientasI_) {
	this.lasHerramientasI_ = lasHerramientasI_;
  }
  public double getLaEscala_() {
	return laEscala_;
  }
  public void setLaEscala_(double laEscala_) {
	this.laEscala_ = laEscala_;
  }
  public Point getElPuntoTmp_() {
    return elPuntoTmp_;
  }
  public void setElPuntoTmp_(Point elPuntoTmp_) {
    this.elPuntoTmp_ = elPuntoTmp_;
  }
  public TransfPunto getLasHerramientasT_() {
    return lasHerramientasT_;
  }
  public void setLasHerramientasT_(TransfPunto lasHerramientasT_) {
    this.lasHerramientasT_ = lasHerramientasT_;
  }
  public JComboBox getLaListaVec_() {
	return laListaVec_;
  }
  public void setLaListaVec_(JComboBox laListaVec_) {
	this.laListaVec_ = laListaVec_;
  }
  public JLabel getElPuntoAct_() {
    return elPuntoAct_;
  }
  public void setElPuntoAct_(JLabel elPuntoAct_) {
    this.elPuntoAct_ = elPuntoAct_;
  }
  public JButton getElBotAumentar_() {
    return elBotAumentar_;
  }
  public void setElBotAumentar_(JButton elBotAumentar_) {
    this.elBotAumentar_ = elBotAumentar_;
  }
  public JButton getElBotDisminuir_() {
    return elBotDisminuir_;
  }
  public void setElBotDisminuir_(JButton elBotDisminuir_) {
    this.elBotDisminuir_ = elBotDisminuir_;
  }
  public JButton getElBotEliminar_() {
    return elBotEliminar_;
  }
  public void setElBotEliminar_(JButton elBotEliminar_) {
    this.elBotEliminar_ = elBotEliminar_;
  }
  public JLabel getElValorX_() {
    return elValorX_;
  }
  public void setElValorX_(JLabel elValorX_) {
    this.elValorX_ = elValorX_;
  }
  public JLabel getElValorY_() {
    return elValorY_;
  }
  public void setElValorY_(JLabel elValorY_) {
    this.elValorY_ = elValorY_;
  }
  //-FIN--------------------
		

  //____________________
  // Atributos privados:
  private VentanaInterna laVentana_;
  private BufferedImage laImagenAuxiliar_;
  private VectorPuntos elVector_;
  
  private JPanel elPanelTrans_;
  private JPanel elPanelImgPrevia_;
  
  private JComboBox laListaVec_;
  private JLabel elPuntoAct_;
  private JLabel elValorX_;
  private JLabel elValorY_;


  private JButton elBotAumentar_;
  private JButton elBotDisminuir_;
  private JButton elBotEliminar_;
 

  private JButton elBotAceptar_;
  private JButton elBotCancelar_;
  
  private Internas lasHerramientasI_;
  private TransfPunto lasHerramientasT_;


  private double laEscala_;
  private Point elPuntoTmp_;
  //-FIN------------------


  //__________________
  // MŽtodos privados:
  private void inicializar () {
	int ancho;
	int alto;
	double escala = 1;
	setLayout(null);
	    
	setLasHerramientasI_(new Internas());
	setLasHerramientasT_(new TransfPunto());
    setLaImagenAuxiliar_(getLaVentana_().imagenActiva());
    setElVector_(getLasHerramientasI_().new VectorPuntos());
    getElVector_().introducirPunto(new Point(0, 0));
    getElVector_().introducirPunto(new Point(255, 255));
    setElPuntoTmp_(null);
    
    setElPanelTrans_(new JPanel() {
    	public void paintComponent (Graphics g) {
    	  int numVert = getElVector_().getElVectorPuntos_().size();
    	  g.clearRect(0, 0, ANCHO_PANEL - 1, ANCHO_PANEL - 1);
    	  g.setColor(Color.black);
    	  g.drawLine(12, 25, 12, 281);
    	  g.drawLine(25, ANCHO_PANEL - 12, 281, ANCHO_PANEL - 12);
    	  g.setColor(Color.lightGray);
    	  g.drawLine(6, 25, ANCHO_PANEL - 1, 25);
    	  g.drawLine(6, 281, ANCHO_PANEL - 1, 281);
    	  g.drawLine(25, 0, 25, ANCHO_PANEL - 7);
    	  g.drawLine(281, 0, 281, ANCHO_PANEL - 7);
    	  
    	  g.setColor(Color.blue);
    	  for (int i = 0; i < numVert; i++) {
    	    g.fillRect((int) Math.round(getElVector_().getElVectorPuntos_().get(i).getX() - 3 + 25)
    	    		  , (int) Math.round((256 - getElVector_().getElVectorPuntos_().get(i).getY()) - 3 + 25)
    	    		  , 6, 6);
    	    if (i > 0) {
    	      g.drawLine((int) Math.round(getElVector_().getElVectorPuntos_().get(i - 1).getX() + 25)
    	    		    , (int) Math.round((256 - getElVector_().getElVectorPuntos_().get(i - 1).getY()) + 25)
    	    		    , (int) Math.round(getElVector_().getElVectorPuntos_().get(i).getX() + 25)
    	    		    , (int) Math.round((256 - getElVector_().getElVectorPuntos_().get(i).getY())) + 25);
    	      
    	    }
    	  }
    	  if (getElPuntoTmp_() != null) {
    		if (getLaListaVec_().getSelectedIndex() == 1) {
    	      g.setColor(Color.green);
    	      g.drawRect((int) Math.round(getElPuntoTmp_().getX() - 3 + 25)
    	    		    , (int) Math.round((getElPuntoTmp_().getY()) - 3 + 25)
    	    		    , 6, 6);
    	      Point anterior = getElVector_().obtenerPuntoAnt((int) Math.round(getElPuntoTmp_().getX()));
    	      Point siguiente = getElVector_().obtenerPuntoSig((int) Math.round(getElPuntoTmp_().getX()));
    	      if (anterior.getX() < getElPuntoTmp_().getX()) {
    	        g.drawLine((int) Math.round(anterior.getX() + 25)
    	    	 	      , (int) Math.round(256 - anterior.getY() + 25)
    	    		      , (int) Math.round(getElPuntoTmp_().getX() + 25)
    	    		      , (int) Math.round(getElPuntoTmp_().getY()) + 25);
    	      } else if (getElPuntoTmp_().getX() != getElVector_().getElVectorPuntos_().get(0).getX()) {
    	        g.drawLine((int) Math.round(getElVector_().obtenerPuntoAnt((int) Math.round(anterior.getX() - 1)).getX() + 25)
    	    		      , (int) Math.round(256 - getElVector_().obtenerPuntoAnt((int) Math.round(anterior.getX() - 1)).getY() + 25)
    	    		      , (int) Math.round(getElPuntoTmp_().getX() + 25)
    	    		      , (int) Math.round(getElPuntoTmp_().getY()) + 25); 
    	      }
    	      if (siguiente.getX() > getElPuntoTmp_().getX()) {
    	        g.drawLine((int) Math.round(getElPuntoTmp_().getX() + 25)
  	    		          , (int) Math.round(getElPuntoTmp_().getY() + 25)
    	    		      , (int) Math.round(siguiente.getX() + 25)
    	    		      , (int) Math.round(256 - siguiente.getY()) + 25);	
    	      }
    		}
    	  }
    	  
    	  if (getLaListaVec_().getSelectedIndex() > 1) {
    	    g.setColor(Color.white);
    	    g.fillRect((int) Math.round(((Point)(getLaListaVec_().getSelectedItem())).getX() - 3 + 25)
    	    		, (int) Math.round(256 - ((Point)(getLaListaVec_().getSelectedItem())).getY() - 3 + 25)
    	    		, 6, 6);
    	    g.setColor(Color.red);
    	    g.drawRect((int) Math.round(((Point)(getLaListaVec_().getSelectedItem())).getX() - 3 + 25)
    	    		, (int) Math.round(256 - ((Point)(getLaListaVec_().getSelectedItem())).getY() - 3 + 25)
    	    		, 6, 6);
    	  }
    	    
    	}
    	
    });
    getElPanelTrans_().setLocation(ANCHO_BORDES, ANCHO_BORDES);
    getElPanelTrans_().setSize(ANCHO_PANEL, ANCHO_PANEL);
    getElPanelTrans_().setBorder(new LineBorder(Color.black));
    getElPanelTrans_().addMouseMotionListener(new MouseMotionListener() {
		@Override
		public void mouseMoved(MouseEvent arg0) {
		  if (getLaListaVec_().getSelectedIndex() == 1) {
		    if (getElPuntoTmp_() == null) {
		      setElPuntoTmp_(new Point());
		    }
		    if (arg0.getX() > 24 && arg0.getX() < 281 && arg0.getY() > 24 && arg0.getY() < 281) {
		      getElPuntoTmp_().setLocation(arg0.getX() - 25, arg0.getY() - 25);
		    }
		    getElPanelTrans_().repaint();
		  }
		}
		@Override
		public void mouseDragged(MouseEvent arg0) {}
	});
    getElPanelTrans_().addMouseListener(new MouseListener() {
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
		  if (getLaListaVec_().getSelectedIndex() == 1) {
		    getElVector_().introducirPunto(new Point((int) Math.round(getElPuntoTmp_().getX())
				                        , (int) Math.round(256 - getElPuntoTmp_().getY())));
		    getElPanelTrans_().repaint();
		    setLaImagenAuxiliar_(getLasHerramientasT_().calcularTransLin(getLaVentana_().imagenActiva()
				                                                      , getElVector_().getElVectorPuntos_()));
		    getElPanelImgPrevia_().repaint();
		    actualizarListaPuntos ();
		  }
		}
	});
    setElPanelImgPrevia_(new JPanel() {
    	public void paintComponent (Graphics g) {
    		Image imagenTmp = getLaImagenAuxiliar_();
            g.setColor(getLaVentana_().getLaRefZonaTrabajo_().getBackground());
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            if (imagenTmp != null){
    		    g.drawImage(imagenTmp, 0, 0,(int) Math.round(imagenTmp.getWidth(null) * getLaEscala_()), 
    		    		                    (int) Math.round(imagenTmp.getHeight(null) * getLaEscala_()), null);
    		    
    		}
    	}
    });
    getElPanelImgPrevia_().setLocation(2 * ANCHO_BORDES + getElPanelTrans_().getWidth(), ANCHO_BORDES);
    getElPanelImgPrevia_().setSize(ANCHO_PANEL, ANCHO_PANEL);
    getElPanelImgPrevia_().setBorder(new LineBorder(Color.black));
    
    setLaListaVec_(new JComboBox());
    actualizarListaPuntos ();
    getLaListaVec_().setLocation(ANCHO_BORDES, 2 * ANCHO_BORDES + getElPanelTrans_().getHeight());
    getLaListaVec_().setSize(306, 30);
    getLaListaVec_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  getElPanelTrans_().repaint();
		  if (getLaListaVec_().getSelectedIndex() > 1) {
			getElPuntoAct_().setText(" Punto " + (getLaListaVec_().getSelectedIndex() - 1));
		    getElValorX_().setText(" X: " + ((Point)(getLaListaVec_().getSelectedItem())).getX());
		    getElValorY_().setText(" Y: " + ((Point)(getLaListaVec_().getSelectedItem())).getY());
		  } else {
			getElPuntoAct_().setText("");
			getElValorX_().setText(" X: ");
			getElValorY_().setText(" Y: ");
		  }
		}
	});
    getLaListaVec_().setBorder(new LineBorder(Color.black));
    
    setElBotAceptar_(new JButton("Aceptar"));
    getElBotAceptar_().setLocation(2 * ANCHO_BORDES + getElPanelTrans_().getWidth() + 150
  		                        , 3 * ANCHO_BORDES + getElPanelImgPrevia_().getHeight()
  		                                           + getLaListaVec_().getHeight());
    getElBotAceptar_().setSize(75, 50);
    getElBotAceptar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  getLaVentana_().getLaRefZonaTrabajo_().nuevaVentanaInterna(10, 10, getLaImagenAuxiliar_());
		  try {
			getLaVentana_().getLaRefZonaTrabajo_().getVecVentanas_().lastElement().setSelected(true);
		  } catch (PropertyVetoException e) {
			e.printStackTrace();
		  }
		  dispose ();
	    }
	  });
    
    setElBotCancelar_(new JButton("Cancelar"));
    getElBotCancelar_().setLocation(getElBotAceptar_().getX() + getElBotAceptar_().getWidth() + ANCHO_BORDES
  		                         , getElBotAceptar_().getY());
    getElBotCancelar_().setSize(75, 50);
    getElBotCancelar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  dispose();
		}
	});
    
    setElPuntoAct_(new JLabel());
    getElPuntoAct_().setLocation(ANCHO_BORDES
    		                    , 3 * ANCHO_BORDES + getElPanelTrans_().getHeight() 
    		                                       + getLaListaVec_().getHeight() );
    getElPuntoAct_().setSize(100, 50);
    getElPuntoAct_().setBorder(new LineBorder(Color.black));
    
    
    setElBotEliminar_(new JButton("Eliminar"));
    getElBotEliminar_().setLocation(ANCHO_BORDES, 4 * ANCHO_BORDES + getElPanelTrans_().getHeight()
    		                                                       + getLaListaVec_().getHeight()
    		                                                       + getElPuntoAct_().getHeight());
    getElBotEliminar_().setSize(100, 25);
    //getElBotEliminar_().setBorder(new LineBorder(Color.black));
    
    setElValorX_(new JLabel(" X: "));
    getElValorX_().setLocation(ANCHO_BORDES + getElPuntoAct_().getX() 
    		                                + getElPuntoAct_().getWidth(), getElPuntoAct_().getY());
    getElValorX_().setSize(75, 24);
    getElValorX_().setBorder(new LineBorder(Color.black));
    
    setElValorY_(new JLabel(" Y: "));
    getElValorY_().setLocation(ANCHO_BORDES + getElPuntoAct_().getX() 
    		                                + getElPuntoAct_().getWidth()
    		                  , getElPuntoAct_().getY() + getElValorX_().getHeight() + 1);
    getElValorY_().setSize(75, 24);
    getElValorY_().setBorder(new LineBorder(Color.black));
    
    
    setElBotEliminar_(new JButton("Eliminar"));
    getElBotEliminar_().setLocation(ANCHO_BORDES + getElValorX_().getX() + getElValorX_().getWidth()
    		                       , getElPuntoAct_().getY());
    getElBotEliminar_().setSize(100, getElValorX_().getHeight());
    getElBotEliminar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
          if (getLaListaVec_().getSelectedIndex() > 1
        	 && ((Point)(getLaListaVec_().getSelectedItem())).getX() != 0
        	 && ((Point)(getLaListaVec_().getSelectedItem())).getX() != 255) {
            getElVector_().eliminarPunto((int) Math.round(((Point) (getLaListaVec_().getSelectedItem())).getX()));
            actualizarListaPuntos();
            getElPanelTrans_().repaint();
            getLaListaVec_().setSelectedIndex(0);
            setLaImagenAuxiliar_(getLasHerramientasT_().calcularTransLin(getLaVentana_().imagenActiva()
                                , getElVector_().getElVectorPuntos_()));
            getElPanelImgPrevia_().repaint();
          }
			
		}
	});
    
   
    setElBotAumentar_(new JButton("+"));
    getElBotAumentar_().setLocation(ANCHO_BORDES + getElValorY_().getX()
    		                                     + getElValorY_().getWidth()
    		                       , getElValorY_().getY());
    getElBotAumentar_().setSize(getElBotEliminar_().getWidth() / 2 + 5, getElValorY_().getHeight());
    getElBotAumentar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  int indiceAux = getLaListaVec_().getSelectedIndex();
		  if (indiceAux > 1
		     && ((Point) (getLaListaVec_().getSelectedItem())).getY() < 255) {
		    getElVector_().introducirPunto(new Point((int) Math.round(((Point) (getLaListaVec_().getSelectedItem())).getX())
		    		                                , 1 + (int) Math.round(((Point) (getLaListaVec_().getSelectedItem())).getY())));
		    actualizarListaPuntos();
		    getElPanelTrans_().repaint();
		    setLaImagenAuxiliar_(getLasHerramientasT_().calcularTransLin(getLaVentana_().imagenActiva()
                                , getElVector_().getElVectorPuntos_()));
		    getElPanelImgPrevia_().repaint();
		    getLaListaVec_().setSelectedIndex(indiceAux);
		  }
		}
	});
    setElBotDisminuir_(new JButton("-"));
    getElBotDisminuir_().setLocation(2 * ANCHO_BORDES + getElValorY_().getX()
                                                  + getElValorY_().getWidth()
                                                  + getElBotAumentar_().getWidth() - 14
                                   , getElValorY_().getY());
    getElBotDisminuir_().setSize(getElBotEliminar_().getWidth() / 2 + 5, getElValorY_().getHeight());
    getElBotDisminuir_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  int indiceAux = getLaListaVec_().getSelectedIndex();
		  if (indiceAux > 1
		     && ((Point) (getLaListaVec_().getSelectedItem())).getY() > 0) {
		    getElVector_().introducirPunto(new Point((int) Math.round(((Point) (getLaListaVec_().getSelectedItem())).getX())
		    		                                , (int) Math.round(((Point) (getLaListaVec_().getSelectedItem())).getY()) - 1));
		    actualizarListaPuntos();
		    getElPanelTrans_().repaint();
		    setLaImagenAuxiliar_(getLasHerramientasT_().calcularTransLin(getLaVentana_().imagenActiva()
                                , getElVector_().getElVectorPuntos_()));
		    getElPanelImgPrevia_().repaint();
		    getLaListaVec_().setSelectedIndex(indiceAux);
		  }
		}
	});
    
    add(getElPanelTrans_());
    add(getElPanelImgPrevia_());
    add(getLaListaVec_());
    add(getElBotAceptar_());
    add(getElBotCancelar_());
    add(getElPuntoAct_());
    add(getElBotEliminar_());
    add(getElValorX_());
    add(getElValorY_());
    add(getElBotAumentar_());
    add(getElBotDisminuir_());
    
    setSize(3 * ANCHO_BORDES + 2 * ANCHO_PANEL
      		, (6 * ANCHO_BORDES) + getElPanelTrans_().getHeight() 
      		                     + getLaListaVec_().getHeight()
      		                     + getElPuntoAct_().getHeight()
      		                     + 15);
    setTitle("Panel Transformaciones Lineales.");
    setVisible(true);
    setResizable(false);
    
    // Calculo del valor de escala para mostrar la imagen
    ancho = getLaImagenAuxiliar_().getWidth();
    alto = getLaImagenAuxiliar_().getHeight();
    if ((ancho >= alto)) {
      escala = getElPanelImgPrevia_().getWidth() / (1.0 * ancho);
    } else {
  	escala = getElPanelImgPrevia_().getHeight() / (1.0 * alto);
    }
    setLaEscala_(escala);
    getLaListaVec_().setSelectedIndex(0);
  }
  
  private void actualizarListaPuntos () {
    getLaListaVec_().removeAllItems();
    getLaListaVec_().addItem("Nada");
    getLaListaVec_().addItem("A–adir Punto");
	for (int i = 0; i < getElVector_().getElVectorPuntos_().size(); i++) {
		  getLaListaVec_().addItem(new Point(getElVector_().getElVectorPuntos_().get(i)) {
			  public String toString () {
			    return "Punto: (" + this.getX() 
			    		+ ", " + this.getY() + ")" ;
			  }
		  });
	  }
	getLaListaVec_().setSelectedIndex(1);
  }
  //-FIN-------------------------
}
