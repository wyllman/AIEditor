/**
 * 
 */
package herramientas;

import herramientas.Internas.TablaTransf;
import interfazGrafica.VentanaInterna;

import java.awt.Color;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.Vector;

/**
 * @author tenerent
 *
 */
public class TransfPunto {
  //______________________________________
  // Atributos constantes predeterminados:
  final static int ANCH_TABLA = 256;
  //-FIN---------------	

  //_______________
  // Constructores:
  public TransfPunto () {
    setLasHerramientas_(new Internas());
  }
  //-FIN------------------
   
  //__________________
  // MŽtodos pœblicos:
  //-FIN------------------
  public BufferedImage negativizar (BufferedImage laImgOrig) {
	  BufferedImage resultado = null;
	  int ancho = laImgOrig.getWidth();
	  int alto = laImgOrig.getHeight();
	  TablaTransf laTabla = getLasHerramientas_().new TablaTransf (); 
	  resultado = new BufferedImage(ancho, alto, laImgOrig.getType());
	  Color elColor;
	  int nivelGris;
	  
	for (int i = 0; i < ANCH_TABLA; i++) {
	  laTabla.getLaTabla_().add(255.0 - i);
	}
	    
	for (int i = 0; i < ancho; i++) {
	  for (int j = 0; j < alto; j++) {
	    elColor = new Color (laImgOrig.getRGB(i, j));
	    nivelGris = (int) Math.round(laTabla.getLaTabla_().get(elColor.getRed()));
	    elColor = new Color (nivelGris, nivelGris, nivelGris);
	    resultado.setRGB(i, j, elColor.getRGB()); 
	  }
	}
	    
    return resultado;
  }
  
  public BufferedImage calcularBrillConstr (BufferedImage laImgOrig, double brillo
		                                   , double contraste, Histograma elHistograma) {
	  BufferedImage resultado = null;
	  int ancho = laImgOrig.getWidth();
	  int alto = laImgOrig.getHeight();
	  double brilloAnterior = elHistograma.calcularMedia();
	  double contrasteAnterior = elHistograma.calcularDesvTipica();
	  double contrasteNuevo = contraste / contrasteAnterior;
	  double brilloNuevo = brillo - (contrasteNuevo * brilloAnterior);
	  TablaTransf laTabla = getLasHerramientas_().new TablaTransf (); 
	  resultado = new BufferedImage(ancho, alto, laImgOrig.getType());
	  Color elColor;
	  int nivelGris;
	  
	for (int i = 0; i < ANCH_TABLA; i++) {
	  laTabla.getLaTabla_().add(contrasteNuevo * i + brilloNuevo);
	}
	laTabla.redondearValores();    
	for (int i = 0; i < ancho; i++) {
	  for (int j = 0; j < alto; j++) {
	    elColor = new Color (laImgOrig.getRGB(i, j));
	    nivelGris = (int) Math.round(laTabla.getLaTabla_().get(elColor.getRed()));
	    elColor = new Color (nivelGris, nivelGris, nivelGris);
	    resultado.setRGB(i, j, elColor.getRGB()); 
	  }
	}
	    
	return resultado;    
   
  }
  
  public BufferedImage calcularTransLin (BufferedImage laImagen, Vector<Point> elVector) {
    BufferedImage resultado = new BufferedImage(laImagen.getWidth(), laImagen.getHeight(), laImagen.getType());
	  TablaTransf laTabla = getLasHerramientas_().new TablaTransf (); 
	  int numRec = elVector.size() - 1;
	  int inicio;
	  int fin;
	  double m;
	  double n;
	  Color elColor;
	  int nivelGris;
	  
	  for (int i = 0; i < numRec; i++) {
	    inicio = (int) Math.round(elVector.get(i).getX());
	    fin = (int) Math.round(elVector.get(i + 1).getX());
	    if (elVector.get(i).getX() != elVector.get(i + 1).getX()) {
	      m = (elVector.get(i + 1).getY() - elVector.get(i).getY()) 
	    	   / (elVector.get(i + 1).getX() - elVector.get(i).getX());
	    } else {
	      m = 1;
	    }
	    n = elVector.get(i + 1).getY() - (m * elVector.get(i + 1).getX());
	    for (int j = inicio; j < fin + 1; j++) {
	      laTabla.getLaTabla_().add(m * j + n);
	    }
	    
	  }
	for (int i = 0; i < laImagen.getWidth(); i++) {
	  for (int j = 0; j < laImagen.getHeight(); j++) {
		elColor = new Color (laImagen.getRGB(i, j));
		nivelGris = (int) Math.round(laTabla.getLaTabla_().get(elColor.getRed()));
		elColor = new Color (nivelGris, nivelGris, nivelGris);
	    resultado.setRGB(i, j, elColor.getRGB()); 
	  }
	}
		    
    return resultado; 
  }
  
  public BufferedImage calcularBinarizar (BufferedImage laImagen) {
    return calcularBinUmbral (laImagen, 127);
  }
  
  public BufferedImage calcularBinUmbral (BufferedImage laImagen, int umbral) {
    BufferedImage resultado = null;
    TablaTransf laTabla = getLasHerramientas_().new TablaTransf ();
    Color elColor;
	int nivelGris;
    if (laImagen != null) {
      if (umbral >= 0 && umbral < ANCH_TABLA) {
        for (int i = 0; i < ANCH_TABLA; i++) {
          if (i < umbral) {
            laTabla.getLaTabla_().add(0.0); 
          } else {
    	    laTabla.getLaTabla_().add(255.0);
          }
        }
        resultado = new BufferedImage(laImagen.getWidth(), laImagen.getHeight(), laImagen.getType());
        for (int i = 0; i < laImagen.getWidth(); i++) {
          for (int j = 0; j < laImagen.getHeight(); j++) {
    	    elColor = new Color (laImagen.getRGB(i, j));
    	    nivelGris = (int) Math.round(laTabla.getLaTabla_().get(elColor.getRed()));
    	    elColor = new Color (nivelGris, nivelGris, nivelGris);
    	    resultado.setRGB(i, j, elColor.getRGB()); 
    	  }
        }
      }
    }
    return resultado;
  }
  
  public BufferedImage calcularDiferencia (BufferedImage laImag01, BufferedImage laImag02) {
	  BufferedImage resultado = null;
	  int nivelGris01;
	  int nivelGris02;
	  int nivelGrisFin;
	  Color elColor;
	  if (laImag01 != null && laImag02 != null) {
	    if (laImag01.getWidth() == laImag02.getWidth() 
	       && laImag01.getHeight() == laImag02.getHeight()
	       && laImag01.getType() == laImag02.getType()) {
		   resultado = new BufferedImage(laImag01.getWidth(), laImag01.getHeight(), laImag01.getType());
	      for (int i = 0; i < laImag01.getWidth(); i++) {
	        for (int j = 0; j < laImag01.getHeight(); j ++) {
	          nivelGris01 = (new Color(laImag01.getRGB(i, j))).getRed();
	          nivelGris02 = (new Color(laImag02.getRGB(i, j))).getRed();
	          nivelGrisFin = Math.abs(nivelGris01 - nivelGris02);
	          elColor = new Color(nivelGrisFin, nivelGrisFin, nivelGrisFin);
	          resultado.setRGB(i, j, elColor.getRGB());
	        }
	      }
	    }
	  }
	  return resultado;
  }
  
  
  public BufferedImage calcularTransfGama (BufferedImage laImagen, double gama) {
    BufferedImage resultado = null;
    TablaTransf laTabla = null;
    double valorExponente;
    double valorBase;
    int nivelGris;
    Color elColor;
    
    if (laImagen != null) {
      laTabla = getLasHerramientas_().new TablaTransf ();
      valorExponente = gama;
      
      for (int i = 0; i < ANCH_TABLA; i++) {
    	valorBase = i / 255.0;
        laTabla.getLaTabla_().add(255.0 * (Math.pow(valorBase, valorExponente)));
      }
      
      resultado = new BufferedImage(laImagen.getWidth(), laImagen.getHeight(), laImagen.getType());
      for (int i = 0; i < laImagen.getWidth(); i++) {
        for (int j = 0; j < laImagen.getHeight(); j++) {
    	  elColor = new Color (laImagen.getRGB(i, j));
    	  nivelGris = (int) Math.round(laTabla.getLaTabla_().get(elColor.getRed()));
    	  elColor = new Color (nivelGris, nivelGris, nivelGris);
    	  resultado.setRGB(i, j, elColor.getRGB()); 
    	}
      }
   }
	 
    return resultado;
  }
  
  
  public BufferedImage calcularEcualizar (BufferedImage laImagen, Histograma elHistograma) {
    BufferedImage resultado = null;
    TablaTransf laTabla = null;
    Color elColor;
    int nivelGris;
    int minimo = elHistograma.valorMinimo();
    int maximo = elHistograma.valorMaximo();
    int[] acumulativo = elHistograma.calcularHistogramaAcm();
    double factor = ((maximo - minimo) * 1.0) / (laImagen.getWidth() * laImagen.getHeight());
    
    if (laImagen != null) {
      laTabla = getLasHerramientas_().new TablaTransf ();
      
      for (int i = 0; i < ANCH_TABLA; i++) {
    	  laTabla.getLaTabla_().add(acumulativo[i] * factor);
      }
        
      resultado = new BufferedImage(laImagen.getWidth(), laImagen.getHeight(), laImagen.getType());
      for (int i = 0; i < laImagen.getWidth(); i++) {
        for (int j = 0; j < laImagen.getHeight(); j++) {
      	  elColor = new Color (laImagen.getRGB(i, j));
      	  nivelGris = (int) Math.round(laTabla.getLaTabla_().get(elColor.getRed()));
      	  elColor = new Color (nivelGris, nivelGris, nivelGris);
      	  resultado.setRGB(i, j, elColor.getRGB()); 
      	}
      }
     }
    return resultado;
    }
    
  
  
  public BufferedImage calcularTransfHistog (VentanaInterna laVentana, Histograma histogramaSec) {
    BufferedImage resultado = null;
    BufferedImage laImagen = laVentana.imagenActiva();
    TablaTransf laTabla = null;
    Color elColor;
    int nivelGris;
    
    double valorHistAcum;
    int indiceBusqueda;
    int indiceTmp;
    double anterior;
    double siguiente;
    
    double [] elHistAcOrigen;
    double [] elHistAcSec;
    
    
    if (laVentana != null && histogramaSec != null) {
      laTabla = getLasHerramientas_().new TablaTransf ();
      elHistAcOrigen = laVentana.getElHistograma_().calcularHistogramaAcmNorm();
      elHistAcSec = histogramaSec.calcularHistogramaAcmNorm();
      
      for (int i = 0; i < ANCH_TABLA; i++) {
        valorHistAcum = elHistAcOrigen[i];
        indiceBusqueda = -1;
        indiceTmp = -1;
        int j = 0;
        while (indiceBusqueda == -1 && j < ANCH_TABLA
        	   && indiceTmp == -1) {
          if (valorHistAcum == elHistAcSec[j]) {
            indiceBusqueda = j;
          } else if (valorHistAcum < elHistAcSec[j]) {
        	indiceTmp = j;
          }
          j++;
        }
        if (indiceBusqueda == -1) {
          if (indiceTmp > 0) {
            anterior = Math.abs(elHistAcSec[indiceTmp - 1] - valorHistAcum);
            siguiente = Math.abs(elHistAcSec[indiceTmp] - valorHistAcum);
            if (anterior <= siguiente) {
              indiceBusqueda = indiceTmp - 1; 	
            } else {
              indiceBusqueda = indiceTmp;
            }
          } else {
            indiceBusqueda = 0;
          }
        }
        laTabla.getLaTabla_().add((double) indiceBusqueda);
      }
    	
    	
    	
      resultado = new BufferedImage(laImagen.getWidth(), laImagen.getHeight(), laImagen.getType());
      for (int i = 0; i < laImagen.getWidth(); i++) {
        for (int j = 0; j < laImagen.getHeight(); j++) {
          elColor = new Color (laImagen.getRGB(i, j));
          nivelGris = (int) Math.round(laTabla.getLaTabla_().get(elColor.getRed()));
          elColor = new Color (nivelGris, nivelGris, nivelGris);
          resultado.setRGB(i, j, elColor.getRGB()); 
        }
      }
    }
	return resultado;  
  }
  
  //______________________
  // Manejadores pœblicos:
  public Internas getLasHerramientas_() {
    return lasHerramientas_;
  }
  public void setLasHerramientas_(Internas lasHerramientas_) {
    this.lasHerramientas_ = lasHerramientas_;
  }
  //-FIN--------------------
			
  //____________________
  // Atributos privados:
  private Internas lasHerramientas_;
  //-FIN------------------

  //__________________
  // MŽtodos privados:

  //-FIN-------------------------
}
