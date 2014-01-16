/**
 * 
 */
package interfazGrafica;

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
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

/**
 * @author tenerent
 *
 */
@SuppressWarnings("serial")
public class PanelPerfil extends JDialog {
  //______________________________________
  // Atributos constantes predeterminados:
  final static int ANCHO_BORD = 5;
  final static int VAL_X = 256;
  //-FIN---------------	

  //_______________
  // Constructores:
  public PanelPerfil (VentanaInterna laVent) {
	setLaVentana_(laVent);
    inicializar ();
  }
  //-FIN------------------
	    
  //__________________
  // MŽtodos pœblicos:
  public int obtenerXIni () {
    int valor1 = (int) Math.round(getElPuntoIni_().getX());
    int valor2 = (int) Math.round(getElPuntoFin_().getX());
    
    if (valor1 <= valor2) {
      return valor1;
    } else {
      return valor2;
    }
  }
  public int obtenerYIni () {
	int valor1 = (int) Math.round(getElPuntoIni_().getX());
	int valor2 = (int) Math.round(getElPuntoFin_().getX());
	    
	if (valor1 <= valor2) {
	  return (int) Math.round(getElPuntoIni_().getY());
	} else {
	  return (int) Math.round(getElPuntoFin_().getY());
    }  
  }
  public int obtenerXFin () {
    int valor1 = (int) Math.round(getElPuntoIni_().getX());
	int valor2 = (int) Math.round(getElPuntoFin_().getX());
	    
	if (valor1 <= valor2) {
	  return valor2;
	} else {
	  return valor1;
	}  
  }
  public int obtenerYFin () {
    int valor1 = (int) Math.round(getElPuntoIni_().getX());
	int valor2 = (int) Math.round(getElPuntoFin_().getX());
		    
	if (valor1 <= valor2) {
      return (int) Math.round(getElPuntoFin_().getY());
	} else {
	  return (int) Math.round(getElPuntoIni_().getY());
	}   
  }
  
  public Vector<Integer> obtenerPerfil2 () {
	Vector<Integer> resultado = new Vector<Integer> ();
	int nivelGris;
	double m;
	double n;
	int posAuxiliar;
	
	if ((obtenerXFin() - obtenerXIni()) != 0) {
	  m = (obtenerYFin() - obtenerYIni()) / (obtenerXFin() - obtenerXIni() * 1.0);
	} else {
	  m = 1;
	}
	n = obtenerYIni() - (m * obtenerXIni());
	if (Math.abs(obtenerXFin() - obtenerXIni()) > Math.abs(obtenerYFin() - obtenerYIni())) {
      if (obtenerXFin() != obtenerXIni()) {
        for (int i = obtenerXIni(); i < obtenerXFin() + 1; i++) {
		  posAuxiliar = (int) Math.round(m * i + n);
		  nivelGris = (new Color(getLaImagenAuxiliar_().getRGB(i, posAuxiliar))).getRed();
	      resultado.add(nivelGris);
	    }
	  }
	} else {
	  int indIni = obtenerYIni();
	  int indFin = obtenerYFin();
	  
	  if (indFin < indIni) {
	    indIni = obtenerYFin();
	    indFin = obtenerYIni();
	  }
	  if (obtenerXFin() != obtenerXIni()) {
		for (int i = indIni; i < indFin + 1; i++) {
		  posAuxiliar = (int) Math.round((i - n) / m);
		  nivelGris = (new Color(getLaImagenAuxiliar_().getRGB(posAuxiliar, i))).getRed();
		  resultado.add(nivelGris);
	    }	
	  }
	}
	return resultado;
  }
  
  public void actualizarLabels () {
    getElLabXIni_().setText(" X: " + getElPuntoIni_().getX());
    getElLabYIni_().setText(" Y: " + getElPuntoIni_().getY());
    getElLabXFin_().setText(" X: " + getElPuntoFin_().getX());
    getElLabYFin_().setText(" Y: " + getElPuntoFin_().getY()); 
  }
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
  public Point getElPuntoIni_() {
	return elPuntoIni_;
  }
  public void setElPuntoIni_(Point elPuntoIni_) {
	this.elPuntoIni_ = elPuntoIni_;
  }
  public Point getElPuntoFin_() {
	return elPuntoFin_;
  }
  public void setElPuntoFin_(Point elPuntoFin_) {
	this.elPuntoFin_ = elPuntoFin_;
  }
  public double getLaEscala_() {
	return laEscala_;
  }
  public void setLaEscala_(double laEscala_) {
	this.laEscala_ = laEscala_;
  }
  public JPanel getElPanelIni_() {
    return elPanelIni_;
  }
  public void setElPanelIni_(JPanel elPanelIni_) {
	this.elPanelIni_ = elPanelIni_;
  }
  public JPanel getElPanelFin_() {
	return elPanelFin_;
  }
  public void setElPanelFin_(JPanel elPanelFin_) {
	this.elPanelFin_ = elPanelFin_;
  }
  public JLabel getElLabNombreIni_() {
	return elLabNombreIni_;
  }
  public void setElLabNombreIni_(JLabel elLabNombreIni_) {
	this.elLabNombreIni_ = elLabNombreIni_;
  }
  public JLabel getElLabNombreFin_() {
	return elLabNombreFin_;
  }
  public void setElLabNombreFin_(JLabel elLabNombreFin_) {
    this.elLabNombreFin_ = elLabNombreFin_;
  }
  public JLabel getElLabXIni_() {
    return elLabXIni_;
  }
  public void setElLabXIni_(JLabel elLabXIni_) {
    this.elLabXIni_ = elLabXIni_;
  }
  public JLabel getElLabYIni_() {
    return elLabYIni_;
  }
  public void setElLabYIni_(JLabel elLabYIni_) {
    this.elLabYIni_ = elLabYIni_;
  }
  public JLabel getElLabXFin_() {
    return elLabXFin_;
  }
  public void setElLabXFin_(JLabel elLabXFin_) {
    this.elLabXFin_ = elLabXFin_;
  }
  public JLabel getElLabYFin_() {
    return elLabYFin_;
  }
  public void setElLabYFin_(JLabel elLabYFin_) {
    this.elLabYFin_ = elLabYFin_;
  }
  public JRadioButton getElCheckIni_() {
    return elCheckIni_;
  }
  public void setElCheckIni_(JRadioButton elCheckIni_) {
    this.elCheckIni_ = elCheckIni_;
  }
  public JRadioButton getElCheckFin_() {
    return elCheckFin_;
  }
  public void setElCheckFin_(JRadioButton elCheckFin_) {
    this.elCheckFin_ = elCheckFin_;
  }
  public JRadioButton getElCheckNada_() {
    return elCheckNada_;
  }  
  public void setElCheckNada_(JRadioButton elCheckNada_) {
    this.elCheckNada_ = elCheckNada_;
  }
  //-FIN--------------------
		
  //____________________
  // Atributos privados:
  private VentanaInterna laVentana_;
  private BufferedImage laImagenAuxiliar_;
  //private Histograma elHistAuxiliar_;
  private Point elPuntoIni_;
  private Point elPuntoFin_;
  private double laEscala_;
  
  private PanelGraf256 elPanelHisto_;
  private JPanel elPanelImgPrevia_;
  
  private JPanel elPanelIni_;
  private JPanel elPanelFin_;
  
  private JLabel elLabNombreIni_;
  private JLabel elLabNombreFin_;
  
  private JLabel elLabXIni_;
  private JLabel elLabYIni_;
  
  private JLabel elLabXFin_;
  private JLabel elLabYFin_;
  
  private JRadioButton elCheckIni_;
  private JRadioButton elCheckFin_;
  private JRadioButton elCheckNada_;
  
  
  private JButton elBotAceptar_;
  //-FIN------------------

  //__________________
  // MŽtodos privados:
  public void inicializar () {
	int ancho;
    int alto;
    double escala = 1;
    // Inicializar atributos
	setLaImagenAuxiliar_(getLaVentana_().imagenActiva());
	setElPuntoIni_(new Point(0, 0));
	setElPuntoFin_(new Point(getLaImagenAuxiliar_().getWidth() - 1, getLaImagenAuxiliar_().getHeight() - 1));
    setElPanelHisto_(new PanelGraf256(getLaVentana_().getElHistograma_().getElHistograma_()));
    getElPanelHisto_().setLocation(ANCHO_BORD, ANCHO_BORD);
    getElPanelHisto_().setBorder(new LineBorder(Color.black));
    setElPanelImgPrevia_(new JPanel() {
      public void paintComponent (Graphics g) {
        Image imagenTmp = getLaImagenAuxiliar_();
        g.setColor(getLaVentana_().getLaRefZonaTrabajo_().getBackground());
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        if (imagenTmp != null){
		    g.drawImage(imagenTmp, 0, 0,(int) Math.round(imagenTmp.getWidth(null) * getLaEscala_()), 
		    		                    (int) Math.round(imagenTmp.getHeight(null) * getLaEscala_()), null);
		    g.setColor(Color.red);
		    g.drawLine( (int) Math.round(obtenerXIni() * getLaEscala_())
		    		  , (int) Math.round(obtenerYIni() * getLaEscala_())
		    		  , (int) Math.round(obtenerXFin() * getLaEscala_())
		    		  , (int) Math.round(obtenerYFin() * getLaEscala_()));
		    if (getElCheckIni_().isSelected()) {
		      g.setColor(Color.green); 
		    } 
		    g.drawRect((int) Math.round(getElPuntoIni_().getX() * getLaEscala_() - 3)
	    		    ,(int) Math.round(getElPuntoIni_().getY() * getLaEscala_() - 3), 6, 6);
		    g.setColor(Color.red);
		    if (getElCheckFin_().isSelected()) {
		      g.setColor(Color.green);
		    }
		    g.drawRect((int) Math.round(getElPuntoFin_().getX() * getLaEscala_() - 2)
	    		    ,(int) Math.round(getElPuntoFin_().getY() * getLaEscala_() - 2), 4, 4);
		    g.setColor(Color.red);
		  }
      }
    });
    getElPanelImgPrevia_().setLocation(2 * ANCHO_BORD + getElPanelHisto_().getWidth(), ANCHO_BORD);
    getElPanelImgPrevia_().setSize(getElPanelHisto_().getWidth()
  		                        , getElPanelHisto_().getWidth());
    getElPanelImgPrevia_().setBorder(new LineBorder(Color.lightGray));
    getElPanelImgPrevia_().setBackground(Color.darkGray);
    getElPanelImgPrevia_().addMouseMotionListener(new MouseMotionListener() {
		@Override
		public void mouseMoved(MouseEvent arg0) {
	      if (!getElCheckNada_().isSelected()) {
	        if (getElCheckIni_().isSelected() 
	           &&  arg0.getX() < (getLaImagenAuxiliar_().getWidth() - 1) * getLaEscala_()
	           &&  arg0.getY() < (getLaImagenAuxiliar_().getHeight() - 1) * getLaEscala_()) {
	          getElPuntoIni_().setLocation(arg0.getX() / getLaEscala_(), arg0.getY() / getLaEscala_());
	          actualizarLabels();
	          getElPanelHisto_().cargarYTransfDatos(obtenerPerfil2());
	          getElPanelImgPrevia_().repaint();
	        }else if (arg0.getX() < (getLaImagenAuxiliar_().getWidth() - 1) * getLaEscala_()
	           &&  arg0.getY() < (getLaImagenAuxiliar_().getHeight() - 1) * getLaEscala_()) {
	        	getElPuntoFin_().setLocation(arg0.getX() / getLaEscala_(), arg0.getY() / getLaEscala_());
	        	actualizarLabels();
	        	getElPanelHisto_().cargarYTransfDatos(obtenerPerfil2());
		        getElPanelImgPrevia_().repaint();
	        }
	      }
		}
		@Override
		public void mouseDragged(MouseEvent arg0) {}
	});
    getElPanelImgPrevia_().addMouseListener(new MouseListener() {
		@Override
		public void mouseReleased(MouseEvent arg0) {}
		@Override
		public void mousePressed(MouseEvent arg0) {}
		@Override
		public void mouseExited(MouseEvent arg0) {
		  if (!getElCheckNada_().isSelected()) {
		    getElCheckNada_().setSelected(true);
		    getElCheckIni_().setSelected(false);
		    getElCheckFin_().setSelected(false);
		    getElPanelImgPrevia_().repaint();
		  }
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {}
		@Override
		public void mouseClicked(MouseEvent arg0) {
		  if (!getElCheckNada_().isSelected()) {
		    getElCheckNada_().setSelected(true);
		    getElCheckIni_().setSelected(false);
		    getElCheckFin_().setSelected(false);
		    getElPanelImgPrevia_().repaint();
		  }
		}
	});
    // Calculo del valor de escala para mostrar la imagen
    ancho = getLaImagenAuxiliar_().getWidth();
    alto = getLaImagenAuxiliar_().getHeight();
    if ((ancho >= alto)) {
      escala = getElPanelImgPrevia_().getWidth() / (1.0 * ancho);
    } else {
  	escala = getElPanelImgPrevia_().getHeight() / (1.0 * alto);
    }
    setLaEscala_(escala);
    getElPanelHisto_().cargarYTransfDatos(obtenerPerfil2());
   
    
    // Inicializar los paneles de control de los puntos del perfil.
    //      - Panel del punto inicial
    setElPanelIni_(new JPanel());
    getElPanelIni_().setLocation(ANCHO_BORD, 2 * ANCHO_BORD + getElPanelHisto_().getHeight());
    getElPanelIni_().setSize((getElPanelHisto_().getWidth() / 2) - 1, 100);
    getElPanelIni_().setBorder(new LineBorder(Color.black));
    getElPanelIni_().setLayout(null);
    setElLabNombreIni_(new JLabel(" Punto de Inicio"));
    getElLabNombreIni_().setLocation(0, 0);
    getElLabNombreIni_().setSize(3 * (getElPanelIni_().getWidth() / 5)
    		                    , getElPanelIni_().getHeight() / 2 );
    getElLabNombreIni_().setBorder(new LineBorder(Color.black));
    getElPanelIni_().add(getElLabNombreIni_());
    
    setElCheckIni_(new JRadioButton("Cambiar Inicio Perfil"));
    getElCheckIni_().setLocation(5, getElPanelIni_().getHeight() / 2);
    getElCheckIni_().setSize((getElPanelIni_().getWidth())
    		                    , getElPanelIni_().getHeight() / 2 );
    getElCheckIni_().setBorder(new LineBorder(Color.black));
    getElCheckIni_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  if (getElCheckIni_().isSelected()) {
		    getElCheckFin_().setSelected(false);
		    getElCheckNada_().setSelected(false);
		    getElPanelImgPrevia_().repaint();
		  } else {
			getElCheckIni_().setSelected(true);
		  }
		}
	});
    
    getElPanelIni_().add(getElCheckIni_());
    
    setElLabXIni_(new JLabel(" X: " + getElPuntoIni_().getX()));
    getElLabXIni_().setLocation(getElLabNombreIni_().getWidth(), 0);
    getElLabXIni_().setSize(2 * (getElPanelIni_().getWidth() / 5) + 1
    		               , getElPanelIni_().getHeight() / 4 );
    getElLabXIni_().setBorder(new LineBorder(Color.black));
    getElPanelIni_().add(getElLabXIni_());
    
    setElLabYIni_(new JLabel(" Y: " + getElPuntoIni_().getY()));
    getElLabYIni_().setLocation(getElLabNombreIni_().getWidth(), getElLabXIni_().getHeight());
    getElLabYIni_().setSize(2 * (getElPanelIni_().getWidth() / 5) + 1
    		               , getElPanelIni_().getHeight() / 4 );
    getElLabYIni_().setBorder(new LineBorder(Color.black));
    getElPanelIni_().add(getElLabYIni_());
    
    
    //      - Panel del punto final
    setElPanelFin_(new JPanel());
    getElPanelFin_().setLocation(ANCHO_BORD + getElPanelIni_().getWidth() + 2
    		                   , 2 * ANCHO_BORD + getElPanelHisto_().getHeight());
    getElPanelFin_().setSize((getElPanelHisto_().getWidth() / 2) - 1, 100);
    getElPanelFin_().setBorder(new LineBorder(Color.black));
    getElPanelFin_().setLayout(null);
    setElLabNombreFin_(new JLabel(" Punto Final"));
    getElLabNombreFin_().setLocation(0, 0);
    getElLabNombreFin_().setSize(3 * (getElPanelFin_().getWidth() / 5)
    		                    , getElPanelFin_().getHeight() / 2 );
    getElLabNombreFin_().setBorder(new LineBorder(Color.black));
    getElPanelFin_().add(getElLabNombreFin_());
    
    setElCheckFin_(new JRadioButton("Cambiar Final Perfil"));
    getElCheckFin_().setLocation(5, getElPanelFin_().getHeight() / 2);
    getElCheckFin_().setSize((getElPanelFin_().getWidth())
    		                    , getElPanelFin_().getHeight() / 2 );
    getElCheckFin_().setBorder(new LineBorder(Color.black));
    getElPanelFin_().add(getElCheckFin_());
    getElCheckFin_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  if (getElCheckFin_().isSelected()) {
		    getElCheckIni_().setSelected(false);
		    getElCheckNada_().setSelected(false);
		    getElPanelImgPrevia_().repaint();
		  } else {
			getElCheckFin_().setSelected(true);
		  }
		}
	});
      
    setElLabXFin_(new JLabel(" X: " + getElPuntoFin_().getX()));
    getElLabXFin_().setLocation(getElLabNombreFin_().getWidth(), 0);
    getElLabXFin_().setSize(2 * (getElPanelFin_().getWidth() / 5) + 1
    		               , getElPanelFin_().getHeight() / 4 );
    getElLabXFin_().setBorder(new LineBorder(Color.black));
    getElPanelFin_().add(getElLabXFin_());
    
    setElLabYFin_(new JLabel(" Y: " + getElPuntoFin_().getY()));
    getElLabYFin_().setLocation(getElLabNombreFin_().getWidth(), getElLabXFin_().getHeight());
    getElLabYFin_().setSize(2 * (getElPanelFin_().getWidth() / 5) + 1
    		               , getElPanelFin_().getHeight() / 4 );
    getElLabYFin_().setBorder(new LineBorder(Color.black));
    getElPanelFin_().add(getElLabYFin_());
    
    setElCheckNada_(new JRadioButton("No Cambiar"));
    getElCheckNada_().setLocation(getElPanelImgPrevia_().getX(), 2 * ANCHO_BORD + getElPanelImgPrevia_().getHeight());
    getElCheckNada_().setSize(getElCheckIni_().getWidth() + 25, 45);
    getElCheckNada_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  if (getElCheckNada_().isSelected()) {
		    getElCheckFin_().setSelected(false);
		    getElCheckIni_().setSelected(false);
		    getElPanelImgPrevia_().repaint();
		  } else {
			getElCheckNada_().setSelected(true); 
		  }
		}
	});
    getElCheckNada_().setSelected(true);
    
    setElBotAceptar_(new JButton("Aceptar"));
    getElBotAceptar_().setLocation(getElPanelImgPrevia_().getX() + 280
    		                      , 2 * ANCHO_BORD + getElPanelImgPrevia_().getHeight());
    getElBotAceptar_().setSize(75, 50);
    getElBotAceptar_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  dispose();
		}
	  });
    
	// A–adir los elementos a la ventana
    add(getElPanelHisto_());
    add(getElPanelImgPrevia_());
    add(getElPanelIni_());
    add(getElPanelFin_());
    add(getElCheckNada_());
    add(getElBotAceptar_());
    
	// Configuracion de la ventana.
	setLayout(null);
	setSize(3 * ANCHO_BORD + 2 * getElPanelHisto_().getWidth()
      		, (5 * ANCHO_BORD) + getElPanelHisto_().getHeight() + (3 * 30) + 30);
    setTitle("Panel Perfil.");
    setVisible(true);
    setResizable(false);  
  }
  //-FIN-------------------------
}
