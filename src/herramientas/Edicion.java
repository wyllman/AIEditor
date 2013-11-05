/**
 * 
 */
package herramientas;

import herramientas.Internas.Rectangulo;

import java.awt.image.BufferedImage;

/**
 * @author tenerent
 *
 */
public class Edicion {
  //______________________________________
  // Atributos constantes predeterminados:

  //-FIN---------------	

  //_______________
  // Constructores:

  //-FIN------------------

  //__________________
  // MŽtodos pœblicos:
  public BufferedImage calcularSubImagen (BufferedImage laImgOr, Rectangulo elRecorte) {
    BufferedImage resultado = null;
    int ancho = elRecorte.getLaPosFinX_() - elRecorte.getLaPosInicioX_();
    int alto =  elRecorte.getLaPosFinY_() - elRecorte.getLaPosInicioY_();
    
    resultado = new BufferedImage(ancho, alto, laImgOr.getType());
    
    for (int i = 0; i < ancho; i++) {
      for (int j = 0; j < alto; j++) {
		resultado.setRGB(i, j, laImgOr.getRGB(elRecorte.getLaPosInicioX_() + i
				        , elRecorte.getLaPosInicioY_() + j)); 
      }
    }
    return resultado;
  }
  
  //-FIN------------------

  //______________________
  // Manejadores pœblicos:

  //-FIN--------------------
		
  //____________________
  // Atributos privados:
 
  //-FIN------------------

  //__________________
  // MŽtodos privados:

  //-FIN-------------------------
}
