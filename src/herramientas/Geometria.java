/**
 * 
 */
package herramientas;

import java.awt.Color;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


/**
 * @author tenerent
 *
 */
public class Geometria {	
    //_______________
	// Constructores:
	
	//-FIN------------------
    
	//__________________
	// MŽtodos pœblicos:
	public BufferedImage espejoHorizontal (BufferedImage laImgOrig) {
		int ancho = laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		BufferedImage imagenResultado = new BufferedImage(ancho, alto, tipo);
		Color elColor;

		for (int i = 0; i < alto; ++i) {
			for (int j = 0; j < ancho; ++j) {
				elColor = new Color(laImgOrig.getRGB((ancho - 1) - j, i));
				imagenResultado.setRGB(j, i, elColor.getRGB());
			}
		}
		return imagenResultado;
	}

	public BufferedImage espejoVertical (BufferedImage laImgOrig) {
		int ancho = laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		BufferedImage imagenResultado = new BufferedImage(ancho, alto, tipo);
		Color elColor;

		for (int i = 0; i < alto; ++i)
			for (int j = 0; j < ancho; ++j) {
				elColor = new Color(laImgOrig.getRGB(j, (alto - 1) - i));
				imagenResultado.setRGB(j, i, elColor.getRGB());
			}
		return imagenResultado;
	}

	public BufferedImage traspuesta (BufferedImage laImgOrig) {
		int alto = laImgOrig.getWidth();
		int ancho = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		BufferedImage imagenResultado = new BufferedImage(ancho, alto, tipo);
		Color elColor;

		for (int i = 0; i < alto; ++i)
			for (int j = 0; j < ancho; ++j) {
				elColor = new Color(laImgOrig.getRGB(i, j));
				imagenResultado.setRGB(j, i, elColor.getRGB());
			}
		return imagenResultado;
	}

	public BufferedImage rotar90 (BufferedImage laImgOrig) {
		int alto = laImgOrig.getWidth();
		int ancho = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		BufferedImage imagenResultado = new BufferedImage(ancho, alto, tipo);
		Color elColor;

		for (int i = 0; i < alto; ++i)
			for (int j = 0; j < ancho; ++j) {
				elColor = new Color(laImgOrig.getRGB(i, (ancho - 1) - j));
				imagenResultado.setRGB(j, i, elColor.getRGB());
			}
		return imagenResultado;
	}

	public BufferedImage rotar180 (BufferedImage laImgOrig) {
		int ancho = laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		BufferedImage imagenResultado = new BufferedImage(ancho, alto, tipo);
        Color elColor;

		for (int i = 0; i < alto; ++i)
			for (int j = 0; j < ancho; ++j) {
				elColor = new Color(laImgOrig.getRGB((ancho - 1) - j,(alto - 1) - i));
				imagenResultado.setRGB(j, i, elColor.getRGB());
			}
		return imagenResultado;
	}

	public BufferedImage rotar270 (BufferedImage laImgOrig) {
		int alto = laImgOrig.getWidth();
		int ancho = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		BufferedImage imagenResultado = new BufferedImage(ancho, alto, tipo);
		Color elColor;

		for (int i = 0; i < alto; ++i)
			for (int j = 0; j < ancho; ++j) {
				elColor = new Color(laImgOrig.getRGB((alto - 1) - i, j));
				imagenResultado.setRGB(j, i, elColor.getRGB());
			}
		return imagenResultado;
	}

	public BufferedImage escalar (double escX, double escY, BufferedImage laImgOrig) {
		int ancho = laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		double escalaX = escX / 100;
		double escalaY = escY / 100; 
		
		ancho *= escalaX; 
		alto *= escalaY;	
		 
		BufferedImage imagenResultado = new BufferedImage(ancho, alto, tipo);
		Color elColor;
		int nivelGris;
		int fila = 0;
		int columna = 0;
		
		if (!(isInterpolacionBilinear())) {
			for (int i = 0; i < alto; ++i)
				for (int j = 0; j < ancho; ++j) {
					fila = (int)vecinoMasCercano((j / escalaX), (i / escalaY), laImgOrig).getX();
					columna = (int)vecinoMasCercano((j / escalaX), (i / escalaY), laImgOrig).getY();
					elColor = new Color (laImgOrig.getRGB (fila, columna));
					imagenResultado.setRGB(j, i, elColor.getRGB());
				}
		}
		else {
			for (int i = 0; i < alto; ++i)
				for (int j = 0; j < ancho; ++j) {
					nivelGris = interBiLineal((j / escalaX), (i / escalaX), laImgOrig);
					elColor = new Color (nivelGris, nivelGris, nivelGris);
					imagenResultado.setRGB(j, i, elColor.getRGB());
				}
		}
		return imagenResultado;
	}

	public BufferedImage rotar (double grados, boolean rotYPintar, BufferedImage laImgOrig) {
		int ancho = laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		setContadorDeFondo(0);
		grados = Math.toRadians(grados);
		ArrayList<Punto> esquinas = rotarEsquina(grados, laImgOrig); 
		Punto dimension = anchoAlto(esquinas);
		BufferedImage imagenResultado = new BufferedImage((int)dimension.getPosX() + 1, (int)dimension.getPosY() + 1, tipo);
		Color elColor;
		int nivelGris;

		Punto oPrima = calcularIzquierdaSuperior(esquinas);
		Punto traslado;
		Punto mapInverso;

		if (rotYPintar) {		//rotar y pintar
			for (int i = 0; i <= dimension.getPosY(); ++i)
				for (int j = 0; j <= dimension.getPosX(); ++j) {
					traslado = trasladar(oPrima, new Punto ((double)j, (double)i));
					mapInverso = transformacionInversa(grados, (int)traslado.getPosX(), (int)traslado.getPosY());
					if ((mapInverso.getPosX() < ancho) && (mapInverso.getPosX() >= 0) && (mapInverso.getPosY() < alto) && (mapInverso.getPosY() >= 0)) {
						elColor = new Color(laImgOrig.getRGB((int)mapInverso.getPosX(), (int)mapInverso.getPosY()));
						imagenResultado.setRGB(j, i, elColor.getRGB());
					} else {
						setContadorDeFondo(getContadorDeFondo() + 1);
					}
				}
		} else {
			if (!(isInterpolacionBilinear())) {		//rotar e interpolar con vecino mas proximo
		
			for (int i = 0; i <= dimension.getPosY(); ++i)
				for (int j = 0; j <= dimension.getPosX(); ++j) {
					traslado = trasladar(oPrima, new Punto ((double)j, (double)i));
					mapInverso = transformacionInversa(grados, (int)traslado.getPosX(), (int)traslado.getPosY());
					if ((mapInverso.getPosX() < ancho) && (mapInverso.getPosX() >= 0) && (mapInverso.getPosY() < alto) && (mapInverso.getPosY() >= 0)) { 
						elColor = new Color(laImgOrig.getRGB((int)vecinoMasCercano(mapInverso.getPosX(), mapInverso.getPosY(), laImgOrig).getX(), (int)vecinoMasCercano(mapInverso.getPosX(), mapInverso.getPosY(), laImgOrig).getY()));
						imagenResultado.setRGB(j, i, elColor.getRGB());
					} else { 
						setContadorDeFondo(getContadorDeFondo() + 1);
					}
				}
		  } else {		//rotar e interpolacion bilineal
			for (int i = 0; i <= dimension.getPosY(); ++i)
				for (int j = 0; j <= dimension.getPosX(); ++j) {
					traslado = trasladar(oPrima, new Punto ((double)j, (double)i));
					mapInverso = transformacionInversa(grados, (int)traslado.getPosX(), (int)traslado.getPosY());
					if ((mapInverso.getPosX() < ancho) && (mapInverso.getPosX() >= 0) && (mapInverso.getPosY() < alto) && (mapInverso.getPosY() >= 0)) {
						nivelGris = interBiLineal(mapInverso.getPosX(), mapInverso.getPosY(), laImgOrig);
						elColor = new Color (nivelGris, nivelGris, nivelGris);
						imagenResultado.setRGB(j, i, elColor.getRGB());
					} else {
						setContadorDeFondo(getContadorDeFondo() + 1);
					}
				}
		  }
		}
		return imagenResultado;
	}
	//-FIN------------------
	
	//______________________
	// Manejadores pœblicos:
	public boolean isInterpolacionBilinear () { return interpolacionBilinear_; }
	public void setInterpolacionBilinear (boolean interpolacionBilinear) { interpolacionBilinear_ = interpolacionBilinear; }

	public int getContadorDeFondo() { return contadorDeFondo_; }
	public void setContadorDeFondo(int contadorDeFondo) { contadorDeFondo_ = contadorDeFondo; }
	//-FIN--------------------
	
	//________________________
	// Atributos privados:
	private boolean interpolacionBilinear_; 		//si es true interpolacion vecino mas proximo si no bilineal
	private int contadorDeFondo_;
	//-FIN--------------------
	
	//__________________
	// MŽtodos privados:
	private Point vecinoMasCercano (double j, double i, BufferedImage laImgOrig) {
		double fila = Math.round(j);
		double columna = Math.round(i);
		int ancho =laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();

		if (fila >= ancho) {
			fila = ancho - 1;
		}
		if (columna >= alto) {
			columna = alto - 1;
		}
		return (new Point((int)fila, (int)columna));
	}
	private int interBiLineal (double j, double i, BufferedImage laImgOrig) {
		int ancho = laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();
		int A = new Color(laImgOrig.getRGB((int)j,(int)i)).getRed();
		int B;
		int C;
		int D;

		if (j + 1 >= ancho) {
			B = new Color(laImgOrig.getRGB((int)j,(int)i)).getRed();
			if (i + 1 >= alto) {
				C = new Color(laImgOrig.getRGB((int)j,(int)i)).getRed();	
				D = new Color(laImgOrig.getRGB((int)j,(int)i)).getRed();
			} else {
				C = new Color(laImgOrig.getRGB((int)j,(int)i + 1)).getRed();
				D = new Color(laImgOrig.getRGB((int)j,(int)i + 1)).getRed();
			}
		} else {
			B = new Color(laImgOrig.getRGB((int)j + 1,(int)i)).getRed();
			if (i + 1 >= alto) {
				C = new Color(laImgOrig.getRGB((int)j,(int)i)).getRed();	
				D = new Color(laImgOrig.getRGB((int)j + 1,(int)i)).getRed();
			} else {
				C = new Color(laImgOrig.getRGB((int)j,(int)i + 1)).getRed();
				D = new Color(laImgOrig.getRGB((int)j + 1,(int)i + 1)).getRed();
			}
		}

		double p = j - (int)j;
		double q = i - (int)i;

		double Q = A + (B - A) * p;
		double R = C + (D - C) * p;

		return ((int)(R + (Q - R) * q));
	}
	private Punto trasladar (Punto o, Punto p) {
		return (new Punto (p.getPosX() - o.getPosX()
				           , p.getPosY() - o.getPosY()));
	}
	private Punto transformacionDirecta (double grados, int x, int y) {
		return (new Punto((Math.cos(grados) * x - Math.sin(grados) * y)
				         ,(Math.sin(grados) * x + Math.cos(grados) * y)));
	}
	private Punto transformacionInversa (double grados, int x, int y) {
		return (new Punto((Math.cos(grados) * x + Math.sin(grados) * y)
				         , (-Math.sin(grados) * x + Math.cos(grados) * y)));
	}
	private Punto calcularIzquierdaSuperior (ArrayList<Punto> p) {
		double izq = Double.MAX_VALUE;
		double arriba = Double.MAX_VALUE;
		
		for (int i = 0; i < p.size(); ++i) {
			if (izq >= p.get(i).getPosX())
				izq = p.get(i).getPosX();
			if (arriba >= p.get(i).getPosY())
				arriba = p.get(i).getPosY();
		}
		return (new Punto (Math.abs(izq), Math.abs(arriba)));
	}
	private Punto anchoAlto (ArrayList<Punto> p) {
		double izq = Double.MAX_VALUE;
		double der = -Double.MAX_VALUE;
		double arriba = Double.MAX_VALUE;
		double abajo = -Double.MAX_VALUE;

		for (int i = 0; i < p.size(); ++i) {
			if (izq >= p.get(i).getPosX())
				izq = p.get(i).getPosX();
			if (der <= p.get(i).getPosX())
				der = p.get(i).getPosX();
			if (arriba >= p.get(i).getPosY())
				arriba = p.get(i).getPosY();
			if (abajo <= p.get(i).getPosY())
				abajo = p.get(i).getPosY();
		}
		return (new Punto((Math.abs(der) + Math.abs(izq)), (Math.abs(abajo) + Math.abs(arriba))));
	}
	private ArrayList<Punto> rotarEsquina (double grados, BufferedImage laImgOrig) {
		int ancho = laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();

		ArrayList<Punto> resultado = new ArrayList<Punto>();
		resultado.add(transformacionDirecta(grados, 0, 0));
		resultado.add(transformacionDirecta(grados, 0, alto - 1));
		resultado.add(transformacionDirecta(grados, ancho - 1, 0));
		resultado.add(transformacionDirecta(grados, ancho - 1, alto - 1));
		return resultado;
	}
	//-FIN--------------------
	
	//______________________________________
    // Clases internas:
	private class Punto {
		public Punto (double x, double y) { setPosX(x); setPosY(y); }
		
		public double getPosX() { return posX_; }
		public void setPosX(double x) { posX_ = x; }
		public double getPosY() { return posY_; }
		public void setPosY(double y) { posY_ = y; }
		
		private double posX_;
		private double posY_;
	}
	//-FIN---------------
	//------------------------	
}
