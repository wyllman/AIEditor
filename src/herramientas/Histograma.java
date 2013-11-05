/**
 * 
 */
package herramientas;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * @author tenerent
 *
 */
public class Histograma {
  //______________________________________
  // Atributos constantes predeterminados:
  final static int ANCHO_HIST = 256;
  //-FIN---------------	

  //_______________
  // Constructores:
  public Histograma () {
    inicializar ();
  }
  //-FIN------------------
	    
  //__________________
  // MŽtodos pœblicos:
  public void calcularHistograma (BufferedImage imagen) {
	  int ancho;
	  int alto;
	  int colorAct;
	  
	  setElHistograma_(new int [ANCHO_HIST]);
	  
	  for (int i = 0; i < ANCHO_HIST; i++) {
			  getElHistograma_()[i] = 0;
	  }
		  ancho = imagen.getWidth();
		  alto = imagen.getHeight();
		  for (int i = 0; i < ancho; i++) {
			  for (int j = 0; j < alto; j++) {
				 colorAct = new Color (imagen.getRGB(i, j)).getRed();
				 getElHistograma_()[colorAct] += 1;
			  }
		  }
  }
  
  public int [] calcularHistogramaAcm () {
     int suma = 0;
     int [] resultado = new int [ANCHO_HIST];
     
     for (int i = 0; i < ANCHO_HIST; i++) {
       suma += getElHistograma_()[i];
       resultado[i] = suma;
     }
     return resultado;
  }
  
  public double [] calcularHistogramaAcmNorm () {
    int [] vecTmp = calcularHistogramaAcm();
    double [] resultado = new double [ANCHO_HIST];
    
    for (int i = 0; i < ANCHO_HIST; i++) {
      resultado[i] = (vecTmp[i] * 1.0) / (vecTmp[ANCHO_HIST - 1] * 1.0);
    }
    
    return resultado;
  }
  
  
  public int calcularTamanio () {
    int resultado = 0;
    
    for (int i = 0; i < ANCHO_HIST; i++) {
      resultado += getElHistograma_()[i];
    }
    return resultado;
  }
  
  public void mostrarPorConsola () {
	System.out.println("Mostrando los valores del histograma: ");
    for (int i = 0; i < ANCHO_HIST; i++) {
      System.out.println("h(" + i + ") = " + getElHistograma_()[i]);
    }
  }
  
  public double calcularMedia () {
    double resultado = 0;
    
    for (int i = 0; i < ANCHO_HIST; i++) {
      resultado += getElHistograma_()[i] * i;
    }
    resultado /= calcularTamanio();
    return resultado;
  }
  
  public double calcularDesvTipica () {
    double media = calcularMedia();
    double resultado = 0;
    double tamanio = calcularTamanio();
    
    for (int i = 0; i < ANCHO_HIST; i++) {
      resultado += Math.pow((i - media), 2) * getElHistograma_()[i];
    }
    resultado /= tamanio;
    resultado = Math.sqrt(resultado);
    return resultado;
  }
  
  public double calcularEntropia () {
    double resultado = 0;
    double probadHis;
    double tamanio = calcularTamanio();
    
    for (int i = 0; i < ANCHO_HIST; i++) {
      probadHis = getElHistograma_()[i] / tamanio;
      if (probadHis > 0) {
        resultado += probadHis * (Math.log10(probadHis) / Math.log10(2.0));
      }
    }
    resultado = - resultado;
    return resultado;
  }
  
  public int valorMinimo () {
	int indice = 0;
	int color = -1;
	
	while (color == -1 && indice < ANCHO_HIST) {
	  if (getElHistograma_()[indice] > 0) {
	    color = indice;
	  }
	  indice++;
	}
	return color;
  }
  
  public int valorMaximo () {
    int indice = ANCHO_HIST - 1;
    int color = -1;
    
    while (color == -1 && indice >= 0) {
      if (getElHistograma_()[indice] > 0) {
        color = indice;
      }
      indice--;
    }
    return color;
  }
  //-FIN------------------
		
  //______________________
  // Manejadores pœblicos:
  public int[] getElHistograma_() {
    return elHistograma_;
  }
  public void setElHistograma_(int[] elHistograma_) {
    this.elHistograma_ = elHistograma_;
  }
  //-FIN--------------------

  //____________________
  // Atributos privados:
  private int[] elHistograma_;
  //-FIN------------------

  //__________________
  // MŽtodos privados:
  private void inicializar () {
    setElHistograma_(new int [ANCHO_HIST]);
  }
  //-FIN-------------------------
}
