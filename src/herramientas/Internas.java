/**
 * 
 */
package herramientas;

import java.awt.Point;
import java.util.Vector;

/**
 * @author tenerent
 *
 */
public class Internas {
  //Clase interna para el uso de estructuras que necesiten datos de tipo rectangulo
  public class Rectangulo {
	
   public Rectangulo() {
	   resetear ();
   }  
	public Rectangulo(int iniX, int iniY, int finX, int finY) {
	  setLaPosInicioX_(iniX);
	  setLaPosInicioY_(iniY);
	  setLaPosFinX_(finX);
	  setLaPosFinY_(finY);
	  compEsValido();
	}
	
    private int laPosInicioX_;
    private int laPosInicioY_;
    private int laPosFinX_;
    private int laPosFinY_;
    
    private boolean esValido_;
    
	public int getLaPosInicioX_() {
		return laPosInicioX_;
	}
	public void setLaPosInicioX_(int laPosInicioX_) {
		this.laPosInicioX_ = laPosInicioX_;
	}
	public int getLaPosInicioY_() {
		return laPosInicioY_;
	}
	public void setLaPosInicioY_(int laPosInicioY_) {
		this.laPosInicioY_ = laPosInicioY_;
	}
	public int getLaPosFinX_() {
		return laPosFinX_;
	}
	public void setLaPosFinX_(int laPosFinX_) {
		this.laPosFinX_ = laPosFinX_;
	}
	public int getLaPosFinY_() {
		return laPosFinY_;
	}
	public void setLaPosFinY_(int laPosFinY_) {
		this.laPosFinY_ = laPosFinY_;
	}
    
	public void resetear () {
	  setLaPosInicioX_(-1);
	  setLaPosInicioY_(-1);
	  setLaPosFinX_(-1);
	  setLaPosFinY_(-1);
	  esValido_ = false;
	} 
	public void compEsValido () {
	  if (getLaPosInicioX_() == -1
		  || getLaPosFinY_() == -1
		  || getLaPosFinX_() == -1
		  || getLaPosInicioY_() == -1 ) {
	    esValido_ = false;	  
	  } else {
		esValido_ = true;
	  }	
	}
	public boolean esValido () {
      return esValido_;
	}  
  }
	
  
  
  
  
  public class TablaTransf {
	final static int ANCH_TABLA = 256;  
	
    private Vector<Double> laTabla_;

	public Vector<Double> getLaTabla_() {
	  return laTabla_;
	}
	public void setLaTabla_(Vector<Double> laTabla_) {
	  this.laTabla_ = laTabla_;
	}
	
	public TablaTransf () {
	  setLaTabla_(new Vector<Double> ());
	}
	
	public void redondearValores () {
	  double numAuxiliar;
	  for (int i = 0; i < ANCH_TABLA; i++) {
		numAuxiliar = getLaTabla_().get(i);
	    if (numAuxiliar < 0) {
	      getLaTabla_().set(i, 0.0);
	    } else if (numAuxiliar > 255) {
	      getLaTabla_().set(i, 255.0);
	    }
	  }
	
	}
	public Vector<Integer> retornarEnInteger () {
	  Vector<Integer> resultado = new Vector<Integer> ();
	  
	  for (int i = 0; i < ANCH_TABLA; i++) {
	    resultado.add((int)Math.round(getLaTabla_().get(i)));
	  }
	  
	  return resultado;
	}
  }
  
  
  
  
  
  
  public class VectorPuntos {
    private Vector<Point> elVectorPuntos_ = null;
  
    
    public Vector<Point> getElVectorPuntos_() {
		return elVectorPuntos_;
	}
	public void setElVectorPuntos_(Vector<Point> elVectorPuntos_) {
		this.elVectorPuntos_ = elVectorPuntos_;
	}
	
	public void mostrarVector () {
	  System.out.println("-------------------------------------------------------");
	  for (int i = 0; i < elVectorPuntos_.size(); i++) {
	    System.out.println("---Punto " + i + ": X(" + elVectorPuntos_.get(i).getX() + "), Y("
	    		          + elVectorPuntos_.get(i).getY() + ") ---");
	  }
	  System.out.println("-------------------------------------------------------");
	}
	
	public void eliminarPunto (int valorX) {
	  Vector<Point> vecAuxiliar = new Vector<Point>();
	  for (int i = 0; i < elVectorPuntos_.size(); i++) {
	    if (elVectorPuntos_.get(i).getX() != valorX) {
	      vecAuxiliar.add(elVectorPuntos_.get(i));
	    }
	  }
	  elVectorPuntos_ = vecAuxiliar;
	}
	
	public boolean comprobarRangos (double inicio, double fin) {
	  boolean resultado = true;
	  
	  if ((elVectorPuntos_ == null)
		  || (elVectorPuntos_.size() < 2)
		  || (elVectorPuntos_.get(0).getX() != inicio)
		  || (elVectorPuntos_.lastElement().getX() != fin)) {
	    resultado = false;
	  }
	  
	  return resultado;
	}
	
	
	public void introducirPunto (Point elPunto) {
      Vector<Point> vecAuxiliar;
      boolean introducido = false;
      if (elVectorPuntos_ == null) {
    	  elVectorPuntos_ = new Vector<Point> ();
    	  elVectorPuntos_.add(elPunto);
      } else {
    	  vecAuxiliar = new Vector<Point> ();
    	  for (int i = 0; i < elVectorPuntos_.size(); i++) {
    	    if (elPunto.getX() < elVectorPuntos_.get(i).getX()) {
    	      if (!introducido) {
    	        vecAuxiliar.add(elPunto);
    	        introducido = true;
    	      }
    	      vecAuxiliar.add(elVectorPuntos_.get(i));
    	    } else if (elPunto.getX() > elVectorPuntos_.get(i).getX()) {
    	      if (i < elVectorPuntos_.size() - 1) {
    	        vecAuxiliar.add(elVectorPuntos_.get(i));
    	      } else if (i == elVectorPuntos_.size() - 1) {
    	    	vecAuxiliar.add(elVectorPuntos_.get(i));
    	    	vecAuxiliar.add(elPunto);
    	      }
    	    }
    	  }
    	  if (!introducido && elVectorPuntos_.lastElement().getX() == elPunto.getX()) {
    		  vecAuxiliar.add(elPunto);  
    	  }
    	  elVectorPuntos_ = vecAuxiliar;
      }
    }
	public Point obtenerPuntoAnt (int valorX) {
	  Point resultado = null;
	  int i = 0;
	  if (elVectorPuntos_ != null) {
	    if (valorX > elVectorPuntos_.get(0).getX()) {
	      while (resultado == null && i < elVectorPuntos_.size()) {
	        if (valorX < elVectorPuntos_.get(i).getX()) {
	          resultado = elVectorPuntos_.get(i - 1);
	        } else if (i == elVectorPuntos_.size() - 1 && resultado == null) {
	          resultado = elVectorPuntos_.get(i);
	        }
	        i++;
	      }
	    }else if (valorX == elVectorPuntos_.get(0).getX()) {
		  resultado = elVectorPuntos_.get(0);
	    }
	  }
	  return resultado;
	}
	public Point obtenerPuntoSig (int valorX) {
	  Point resultado = null;
	  int i = 0;
	  if (elVectorPuntos_ != null) {
	    while (resultado == null && i < elVectorPuntos_.size()) {
	      if (valorX < elVectorPuntos_.get(i).getX()) {
	        resultado = elVectorPuntos_.get(i);
	      } else if (i == elVectorPuntos_.size() - 1 && resultado == null) {
	    	resultado = elVectorPuntos_.get(i);
	      }
	      i++;
	    }
	  }
	  return resultado;
	}
  }
  //______________________________________
  // Atributos constantes predeterminados:

  //-FIN---------------	

  //_______________
  // Constructores:

  //-FIN------------------
	    
  //__________________
  // MŽtodos pœblicos:

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
