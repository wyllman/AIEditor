/**
 * 
 */
package interfazGrafica;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JPanel;

/**
 * @author tenerent
 *
 */
public class PanelGraf256 extends JPanel {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//______________________________________
  // Atributos constantes predeterminados:
  final static int ANCHO_PANEL = 356;
  final static int ALTO_PANEL = 300;
  final static int ANCHO_BORD = 50;
  final static int VAL_X = 256;
  //-FIN---------------	

  //_______________
  // Constructores:
  public PanelGraf256 (int [] entrada) {
    inicializar(0, 0, entrada);
  }
  //-FIN------------------
    
  //__________________
  // MŽtodos pœblicos:
  public void paintComponent (Graphics g) {
	g.clearRect(0, 0, ANCHO_PANEL - 1, ALTO_PANEL - 1);
	g.setColor(Color.darkGray);
    g.drawLine(ANCHO_BORD / 2, ANCHO_BORD, ANCHO_BORD / 2, ALTO_PANEL - 1 - ANCHO_BORD);
    g.drawLine(ANCHO_BORD, ALTO_PANEL - 1 - (ANCHO_BORD / 2), ANCHO_PANEL - 1 - ANCHO_BORD
    		  , ALTO_PANEL - 1 - (ANCHO_BORD / 2));
    g.setColor(Color.blue);
    for (int i = 0; i < VAL_X; i++) {
      g.drawLine(ANCHO_BORD + i
    		     , ALTO_PANEL - 1 - ANCHO_BORD - getValoresTransf_()[i]
    		     , ANCHO_BORD + i
    		     , ALTO_PANEL - 1 - ANCHO_BORD);
    } 
  }
  
  public void cargarYTransfDatos (Vector<Integer> entrada) {
	double escala = (ALTO_PANEL - (2 * ANCHO_BORD)) / 256.0;
    int numDatos = entrada.size();
    double numAux;
    double mediaAux = 0;
    int indiceActual;
    
    
    resultadoAux.clear();
    resultado256.clear();
    
    if (numDatos > VAL_X) {
      numAux = numDatos / (VAL_X * 1.0);
      indiceActual = 0;
      for (int i = 0; i < numDatos; i++) {
        if (indiceActual == (int) (i / numAux)) {
          resultadoAux.add(entrada.get(i));
        } else {
          indiceActual = (int) (i / numAux);
          for (int j = 0; j < resultadoAux.size(); j++) {
            mediaAux += resultadoAux.get(j);
          }
          mediaAux /= resultadoAux.size();
          resultado256.add((int) mediaAux);
          resultadoAux.clear();
          mediaAux = 0;
          resultadoAux.add(entrada.get(i));
        } 
      }
      
      for (int j = 0; j < resultadoAux.size(); j++) {
        mediaAux += resultadoAux.get(j);
      }
      mediaAux /= resultadoAux.size();
      resultado256.add((int) mediaAux);
      resultadoAux.clear();
      mediaAux = 0;
      
      if (resultado256.size() == VAL_X) {
        for (int i = 0; i < VAL_X; i++) {
          getValoresTransf_()[i] = (int) Math.round((resultado256.get(i)) * escala);
        }
      }
    } else {
      for (int i = 0; i < VAL_X; i++) {
        if (i < numDatos) {
          getValoresTransf_()[i] = (int) Math.round(entrada.get(i) * escala);
        } else {
          getValoresTransf_()[i] = 0;
        }
      }
    }
	repaint();
  }
  
  
  public void cargarDatos (int [] entrada) {
    double max = 0;
    setValoresEntrada_(entrada);
    for (int i = 0; i < VAL_X; i++) {
   	  if (entrada[i] > max) {
   	    max = entrada[i];
   	  }
    }
    if (max != 0) {
      max = (ALTO_PANEL - (2 * ANCHO_BORD)) / max;
    }
    //setValoresTransf_(new int [VAL_X]);
    for (int i = 0; i < VAL_X; i++) {
        getValoresTransf_()[i] = (int) Math.round(entrada[i] * max);
    }
    repaint();
  }
  //-FIN------------------
		
  //______________________
  // Manejadores pœblicos:
  public int[] getValoresEntrada_() {
    return valoresEntrada_;
  }
  public void setValoresEntrada_(int[] valoresEntrada_) {
    this.valoresEntrada_ = valoresEntrada_;
  }
  public int[] getValoresTransf_() {
    return valoresTransf_;
  }
  public void setValoresTransf_(int[] valoresTransf_) {
    this.valoresTransf_ = valoresTransf_;
  }
  //-FIN--------------------
		
  //____________________
  // Atributos privados:
  private int [] valoresEntrada_;
  private int [] valoresTransf_;
  
  private Vector<Integer> resultadoAux = new Vector<Integer>();
  private Vector<Integer> resultado256 = new Vector<Integer>();
  //-FIN------------------

  //__________________
  // MŽtodos privados:
  private void inicializar (int posX, int posY, int [] entrada) {
	 double max = 0;
     if (entrada.length == VAL_X) {
       setBackground(Color.white);
       setSize(ANCHO_PANEL, ALTO_PANEL);
       setBounds(posX, posY, ANCHO_PANEL, ALTO_PANEL);
       setValoresEntrada_(entrada);
       for (int i = 0; i < VAL_X; i++) {
    	 if (entrada[i] > max) {
    		 max = entrada[i];
    	 }
       }
       max = (ALTO_PANEL - (2 * ANCHO_BORD)) / max;
       setValoresTransf_(new int [VAL_X]);
       for (int i = 0; i < VAL_X; i++) {
         getValoresTransf_()[i] = (int) Math.round(getValoresEntrada_()[i] * max);
       }
       
     }
  }
  //-FIN-------------------------
}
