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

	
	public class Punto {
		private double x, y;

		public Punto (double x, double y) { setX(x); setY(y); }

		public double getX() { return x; }

		public void setX(double x) { this.x = x; }

		public double getY() { return y; }

		public void setY(double y) { this.y = y; }
	}

	//private VentanaPrincipal refVp; 

	private boolean vMP; 		//si es true interpolacion vecino mas proximo si no bilineal

	private int contadorDeFondo;

	//public VentanaPrincipal getRefVp() { return refVp;	}
	//public void setRefVp(VentanaPrincipal vp) {	this.refVp = vp;	}

	public boolean isvMP() { return vMP; }
	public void setvMP(boolean vMP) { this.vMP = vMP; }

	public int getContadorDeFondo() { return contadorDeFondo; }
	public void setContadorDeFondo(int contadorDeFondo) { 	this.contadorDeFondo = contadorDeFondo; }

	//public OpGeom (VentanaPrincipal refvp) {
	//	setRefVp(refvp);
	//}

	public BufferedImage espejoHorizontal (BufferedImage laImgOrig) {
		// FIXME:
		int ancho = laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		BufferedImage temp = new BufferedImage(ancho, alto, tipo);
		int colorNuevo;

		for (int i = 0; i < alto; ++i)
			for (int j = 0; j < ancho; ++j) {
				colorNuevo = new Color(laImgOrig.getRGB((ancho - 1) - j, i)).getRed();
				temp.setRGB(j, i, new Color (colorNuevo, colorNuevo, colorNuevo).getRGB());
			}
		return temp;
	}

	public BufferedImage espejoVertical (BufferedImage laImgOrig) {
		// FIXME:
		int ancho = laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		BufferedImage temp = new BufferedImage(ancho, alto, tipo);

		int colorNuevo;

		for (int i = 0; i < alto; ++i)
			for (int j = 0; j < ancho; ++j) {
				colorNuevo = new Color(laImgOrig.getRGB(j, (alto - 1) - i)).getRed();
				temp.setRGB(j, i, new Color (colorNuevo, colorNuevo, colorNuevo).getRGB());
			}
		return temp;
	}

	public BufferedImage traspuesta (BufferedImage laImgOrig) {
		// FIXME:
		int alto = laImgOrig.getWidth();
		int ancho = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		BufferedImage temp = new BufferedImage(ancho, alto, tipo);

		int colorNuevo;

		for (int i = 0; i < alto; ++i)
			for (int j = 0; j < ancho; ++j) {
				colorNuevo = new Color(laImgOrig.getRGB(i, j)).getRed();
				temp.setRGB(j, i, new Color (colorNuevo, colorNuevo, colorNuevo).getRGB());
			}
		return temp;
	}

	public BufferedImage rotar90 (BufferedImage laImgOrig) {	//90
		// FIXME:
		int alto = laImgOrig.getWidth();
		int ancho = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		BufferedImage temp = new BufferedImage(ancho, alto, tipo);
		int colorNuevo;

		for (int i = 0; i < alto; ++i)
			for (int j = 0; j < ancho; ++j) {
				colorNuevo = new Color(laImgOrig.getRGB(i, (ancho - 1) - j)).getRed();
				temp.setRGB(j, i, new Color (colorNuevo, colorNuevo, colorNuevo).getRGB());
			}
		return temp;
	}

	public BufferedImage rotar180 (BufferedImage laImgOrig) {		//180
		// FIXME:
		int ancho = laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		BufferedImage temp = new BufferedImage(ancho, alto, tipo);

		int colorNuevo;

		for (int i = 0; i < alto; ++i)
			for (int j = 0; j < ancho; ++j) {
				colorNuevo = new Color(laImgOrig.getRGB((ancho - 1) - j,(alto - 1) - i)).getRed();
				temp.setRGB(j, i, new Color (colorNuevo, colorNuevo, colorNuevo).getRGB());
			}
		return temp;
	}

	public BufferedImage rotar270 (BufferedImage laImgOrig) {		//270
		// FIXME:
		int alto = laImgOrig.getWidth();
		int ancho = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		BufferedImage temp = new BufferedImage(ancho, alto, tipo);

		int colorNuevo;

		for (int i = 0; i < alto; ++i)
			for (int j = 0; j < ancho; ++j) {
				colorNuevo = new Color(laImgOrig.getRGB((alto - 1) - i, j)).getRed();
				temp.setRGB(j, i, new Color (colorNuevo, colorNuevo, colorNuevo).getRGB());
			}
		return temp;
	}

	public BufferedImage escalar (double anch, double alt, BufferedImage laImgOrig) {
		// FIXME:
		int ancho = laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		anch /= 100; 	//Paso a % el ancho
		alt /= 100;		//Paso a % el alto
		alto *= alt;	//Calculamos el alto de la imagen
		ancho *= anch;  //Calculamos el ancho de la imagen
		BufferedImage temp = new BufferedImage(ancho, alto, tipo);
		int colorNuevo;
		int jI = 0, iI = 0;
		if (isvMP()) {
			for (int i = 0; i < alto; ++i)
				for (int j = 0; j < ancho; ++j) {
					jI = (int)vecinoMasCercano(j/anch, i/alt, laImgOrig).getX();
					iI = (int)vecinoMasCercano(j/anch, i/alt, laImgOrig).getY();
					colorNuevo = new Color(laImgOrig.getRGB(jI,iI)).getRed();
					temp.setRGB(j, i, new Color (colorNuevo, colorNuevo, colorNuevo).getRGB());
				}
		}
		else {
			for (int i = 0; i < alto; ++i)
				for (int j = 0; j < ancho; ++j) {
					colorNuevo = interBiLineal(j/anch, i/alt, laImgOrig);
					temp.setRGB(j, i, new Color (colorNuevo, colorNuevo, colorNuevo).getRGB());
				}
		}
		return temp;
	}

	public BufferedImage rotar (double grados, int opc, BufferedImage laImgOrig) {
		// FIXME:
		int ancho = laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();
		int tipo = laImgOrig.getType();
		setContadorDeFondo(0);
		grados = Math.toRadians(grados);
		ArrayList<Punto> esquinas = rotarEsquina(grados, laImgOrig); 
		Punto dimension = anchoAlto(esquinas);
		BufferedImage temp = new BufferedImage((int)dimension.getX() + 1, (int)dimension.getY() + 1, tipo);

		int colorNuevo;

		Punto oPrima = calcularIzquierdaSuperior(esquinas);
		Punto traslado;
		Punto mapInverso;

		if (opc == 0) {		//rotar y pintar
			for (int i = 0; i <= dimension.getY(); ++i)
				for (int j = 0; j <= dimension.getX(); ++j) {
					traslado = trasladar(oPrima, new Punto ((double)j, (double)i));
					mapInverso = transformacionInversa(grados, (int)traslado.getX(), (int)traslado.getY());
					if ((mapInverso.getX() < ancho) && (mapInverso.getX() >= 0) && (mapInverso.getY() < alto) && (mapInverso.getY() >= 0)) {
						colorNuevo = new Color(laImgOrig.getRGB((int)mapInverso.getX(), (int)mapInverso.getY())).getRed();
						temp.setRGB(j, i, new Color (colorNuevo, colorNuevo, colorNuevo).getRGB());
					}
					else
						setContadorDeFondo(getContadorDeFondo() + 1);
				}
		}
		else if (opc == 1) {		//rotar e interpolar con vecino mas proximo
			for (int i = 0; i <= dimension.getY(); ++i)
				for (int j = 0; j <= dimension.getX(); ++j) {
					traslado = trasladar(oPrima, new Punto ((double)j, (double)i));
					mapInverso = transformacionInversa(grados, (int)traslado.getX(), (int)traslado.getY());
					if ((mapInverso.getX() < ancho) && (mapInverso.getX() >= 0) && (mapInverso.getY() < alto) && (mapInverso.getY() >= 0)) { 
						colorNuevo = new Color(laImgOrig.getRGB((int)vecinoMasCercano(mapInverso.getX(), mapInverso.getY(), laImgOrig).getX(), (int)vecinoMasCercano(mapInverso.getX(), mapInverso.getY(), laImgOrig).getY())).getRed();
						temp.setRGB(j, i, new Color (colorNuevo, colorNuevo, colorNuevo).getRGB());
					}
					else 
						setContadorDeFondo(getContadorDeFondo() + 1);
				}
		}

		else if (opc == 2) {		//rotar e interpolacion bilineal
			for (int i = 0; i <= dimension.getY(); ++i)
				for (int j = 0; j <= dimension.getX(); ++j) {
					traslado = trasladar(oPrima, new Punto ((double)j, (double)i));
					mapInverso = transformacionInversa(grados, (int)traslado.getX(), (int)traslado.getY());
					if ((mapInverso.getX() < ancho) && (mapInverso.getX() >= 0) && (mapInverso.getY() < alto) && (mapInverso.getY() >= 0)) {
						colorNuevo = interBiLineal(mapInverso.getX(), mapInverso.getY(), laImgOrig);
						temp.setRGB(j, i, new Color (colorNuevo, colorNuevo, colorNuevo).getRGB());
					}
					else
						setContadorDeFondo(getContadorDeFondo() + 1);
				}
		}


		return temp;
	}

	public Point vecinoMasCercano (double j, double i, BufferedImage laImgOrig) {
		// FIXME:
		double jI = Math.round(j);
		double iI = Math.round(i);
		int ancho =laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();

		if (jI >= ancho)
			jI = ancho - 1;
		if (iI >= alto)
			iI = alto - 1;
		Point temp = new Point((int)jI, (int)iI);
		return temp;
	}
	public int interBiLineal (double j, double i, BufferedImage laImgOrig) {
		// FIXME:
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
		int P = (int)(R + (Q - R) * q);

		return P;
	}
	public Punto calcularIzquierdaSuperior (ArrayList<Punto> p) {
		double iz = Double.MAX_VALUE, arriba = Double.MAX_VALUE;
		for (int i = 0; i < p.size(); ++i) {
			if (iz >= p.get(i).getX())
				iz = p.get(i).getX();
			if (arriba >= p.get(i).getY())
				arriba = p.get(i).getY();
		}
		return new Punto (Math.abs(iz), Math.abs(arriba));
	}
	
	public Punto trasladar (Punto o, Punto p) {
		return new Punto (p.getX() - o.getX(), p.getY() - o.getY());
	}
	
	public Punto anchoAlto (ArrayList<Punto> p) {
		double iz = Double.MAX_VALUE, der = -Double.MAX_VALUE, arriba = Double.MAX_VALUE, abajo = -Double.MAX_VALUE;

		for (int i = 0; i < p.size(); ++i) {
			if (iz >= p.get(i).getX())
				iz = p.get(i).getX();
			if (der <= p.get(i).getX())
				der = p.get(i).getX();
			if (arriba >= p.get(i).getY())
				arriba = p.get(i).getY();
			if (abajo <= p.get(i).getY())
				abajo = p.get(i).getY();
		}
		return new Punto((Math.abs(der) + Math.abs(iz)), (Math.abs(abajo) + Math.abs(arriba)));
	}
	
	public ArrayList<Punto> rotarEsquina (double grados, BufferedImage laImgOrig) {
		int ancho = laImgOrig.getWidth();
		int alto = laImgOrig.getHeight();

		ArrayList<Punto> temp = new ArrayList<Punto>();
		temp.add(transformacionDirecta(grados, 0, 0));
		temp.add(transformacionDirecta(grados, 0, alto - 1));
		temp.add(transformacionDirecta(grados, ancho - 1, 0));
		temp.add(transformacionDirecta(grados, ancho - 1, alto - 1));
		return temp;
	}
	
	public Punto transformacionDirecta (double grados, int x, int y) {
		return new Punto((Math.cos(grados) * x - Math.sin(grados) * y),(Math.sin(grados) * x + Math.cos(grados) * y));
	}

	public Punto transformacionInversa (double grados, int x, int y) {
		return new Punto((Math.cos(grados) * x + Math.sin(grados) * y),(-Math.sin(grados) * x + Math.cos(grados) * y));
	}
	
	
	
	
}
