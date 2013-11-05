/**
 * Descripci—n: Clase que modela el comportamiento interno de los objetos JInternalFrame o las
 *              llamadas VentanaInterna
 *   
 * Implementado:   
 * 
 * Por implementar:  
 *                   
 */
package controladores;

import interfazGrafica.VentanaInterna;

import java.awt.Color;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.util.Vector;

import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;


public class EventosVentInterna {
	//______________________________________
    // Atributos constantes predeterminados:

	//---------------	
	
    //_______________
	// Constructores:
	public EventosVentInterna (VentanaInterna ventTmp) {
		setLaVentTmp_(ventTmp);
		inicializar();
	}
	//------------------
	    
	//__________________
	// MŽtodos pœblicos:
		
		
	//______________________
	// Manejadores pœblicos:
	public MouseMotionListener getAccMovRaton_() {
		return accMovRaton_;
	}
	public void setAccMovRaton_(MouseMotionListener accMovRaton_) {
		this.accMovRaton_ = accMovRaton_;
	}
	public InternalFrameListener getAccIntFrame_() {
		return accIntFrame_;
	}
	public void setAccIntFrame_(InternalFrameListener accIntFrame_) {
		this.accIntFrame_ = accIntFrame_;
	}
	public VentanaInterna getLaVentTmp_() {
		return laVentTmp_;
	}
	public void setLaVentTmp_(VentanaInterna laVentTmp_) {
		this.laVentTmp_ = laVentTmp_;
	}
	public ComponentListener getAccComponente_() {
		return accComponente_;
	}
	public void setAccComponente_(ComponentListener accComponente_) {
		this.accComponente_ = accComponente_;
	}
    public MouseListener getAccRaton_() {
		return accRaton_;
	}
	public void setAccRaton_(MouseListener accRaton_) {
		this.accRaton_ = accRaton_;
	}
	public boolean isSelActivo_() {
		return selActivo_;
	}
	public void setSelActivo_(boolean selActivo_) {
		this.selActivo_ = selActivo_;
	}
	//--------------------
	

	//____________________
	// Atributos privados:
	private MouseListener accRaton_;
	private MouseMotionListener accMovRaton_;
    private InternalFrameListener  accIntFrame_;
    private ComponentListener accComponente_;
    
    private VentanaInterna laVentTmp_;  
    
    private boolean selActivo_;
    //------------------
    

	//__________________
	// MŽtodos privados:
    private void inicializar () {
    	setSelActivo_(false);
    	
    	
    	setAccRaton_(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
			  int posX;
			  int posY;
			  int anchoVent;
		      int altoVent; 
			  
		      if (getLaVentTmp_().isSelected() && isSelActivo_()) {
		        posX = arg0.getX();
				posY = arg0.getY(); 
			    anchoVent = getLaVentTmp_().getWidth();
			    altoVent = getLaVentTmp_().getHeight();
					
			    if (posX < anchoVent && posY < altoVent && getLaVentTmp_().getElRectResalte_().esValido()) {
				   getLaVentTmp_().getElRectResalte_().setLaPosFinX_(arg0.getX());
			       getLaVentTmp_().getElRectResalte_().setLaPosFinY_(arg0.getY());
			       setSelActivo_(false);
			       getLaVentTmp_().repaint();
			    }
			  }
			}
			@Override
			public void mousePressed(MouseEvent arg0) { 
			  int posX;
			  int posY;
			  int anchoVent;
			  int altoVent; 
			  if (getLaVentTmp_().isSelected() && isSelActivo_()) {
			    posX = arg0.getX();
			    posY = arg0.getY(); 
				anchoVent = getLaVentTmp_().getWidth();
				altoVent = getLaVentTmp_().getHeight(); 
				
				if (posX < anchoVent && posY < altoVent ) {
				  getLaVentTmp_().getElRectResalte_().setLaPosInicioX_(arg0.getX());
				  getLaVentTmp_().getElRectResalte_().setLaPosInicioY_(arg0.getY()); 
				} else {
				   getLaVentTmp_().getElRectResalte_().resetear();
				}
			  }
			}
			@Override
			public void mouseExited(MouseEvent arg0) { 
				if (getLaVentTmp_().isSelected()) {
					getLaVentTmp_().getLaRefZonaTrabajo_().getLaVenTmp_().resetearInfo();
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent arg0) { }
			@Override
			public void mouseClicked(MouseEvent arg0) {
				getLaVentTmp_().cambiarOrgEscG();
			}
		});
    	
    	setAccMovRaton_(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				int posX = arg0.getX();
				int posY = arg0.getY();
				int anchoVent;
				int altoVent; 
				BufferedImage imagenTmp;
				
				imagenTmp = getLaVentTmp_().imagenActiva();
				anchoVent = imagenTmp.getWidth();
				altoVent = imagenTmp.getHeight();
				if (getLaVentTmp_().isSelected() 
						&& posX < anchoVent 
						&& posY < altoVent ) {
					
					Color elColor = new Color(imagenTmp.getRGB(posX, posY));
					getLaVentTmp_().getLaRefZonaTrabajo_().getLaVenTmp_()
					               .establecerInfo(posX, posY, 
					            		           elColor.getRed(), 
					            		           elColor.getGreen(), 
					            		           elColor.getBlue());

				} else if ((posX > anchoVent || posY > altoVent)
						   && (getLaVentTmp_().getLaRefZonaTrabajo_()
								              .getLaVenTmp_()
								              .getLaBarraInfo_()
								              .getPosXRaton_()
								              .getText()
								              .compareTo("--") != 0)) {
					getLaVentTmp_().getLaRefZonaTrabajo_().getLaVenTmp_().resetearInfo();
				}
				
				if (getLaVentTmp_().isSelected() && isSelActivo_()) {
				    //getLaVentTmp_().getElRectResalte_().setLaPosFinX_(arg0.getX());
					//getLaVentTmp_().getElRectResalte_().setLaPosFinY_(arg0.getY());
					//getLaVentTmp_().getElRectResalte_().compEsValido();
				  }
				
				
			}
			@Override
			public void mouseDragged(MouseEvent arg0) {
			  int posX;
			  int posY;
			  int anchoVent;
			  int altoVent; 
			  
			  if (getLaVentTmp_().isSelected() && isSelActivo_()) {
			    posX = arg0.getX();
				posY = arg0.getY(); 
			    anchoVent = getLaVentTmp_().getWidth();
			    altoVent = getLaVentTmp_().getHeight(); 
					
			   if ((posX < anchoVent && posY < altoVent)
				  && (getLaVentTmp_().getElRectResalte_().getLaPosInicioX_() != -1 
				       && getLaVentTmp_().getElRectResalte_().getLaPosInicioY_() != -1)){  
				
			      getLaVentTmp_().getElRectResalte_().setLaPosFinX_(posX);
				  getLaVentTmp_().getElRectResalte_().setLaPosFinY_(posY);
				  getLaVentTmp_().getElRectResalte_().compEsValido();
				  getLaVentTmp_().repaint();
			    }
			  }
			}
		});
    	setAccIntFrame_(new InternalFrameListener() {
			@Override
			public void internalFrameOpened(InternalFrameEvent arg0) {}
			@Override
			public void internalFrameIconified(InternalFrameEvent arg0) {}
			@Override
			public void internalFrameDeiconified(InternalFrameEvent arg0) {}
			@Override
			public void internalFrameDeactivated(InternalFrameEvent arg0) {}
			@Override
			public void internalFrameClosing(InternalFrameEvent arg0) {}
			@Override
			public void internalFrameClosed(InternalFrameEvent arg0) {
				getLaVentTmp_().getLaRefZonaTrabajo_().getVecVentanas_()
                               .remove(getLaVentTmp_());
				if (getLaVentTmp_() == getLaVentTmp_().getLaRefZonaTrabajo_()
						                              .getLaVentanaIntActual_()) {
					if (getLaVentTmp_().getLaRefZonaTrabajo_().getVecVentanas_().size() >= 1) {
						getLaVentTmp_().getLaRefZonaTrabajo_().setLaVentanaIntActual_(
						   getLaVentTmp_().getLaRefZonaTrabajo_().getVecVentanas_().get(0));
						try {
							getLaVentTmp_().getLaRefZonaTrabajo_()
							               .getLaVentanaIntActual_().setSelected(true);
						} catch (PropertyVetoException e) {
							e.printStackTrace();
						}
					} else {
						getLaVentTmp_().getLaRefZonaTrabajo_().setLaVentanaIntActual_(null);
					}
				}
			}
			@Override
			public void internalFrameActivated(InternalFrameEvent arg0) {
				getLaVentTmp_().getLaRefZonaTrabajo_().setLaVentanaIntActual_(getLaVentTmp_());
			}
		});
    	setAccComponente_(new ComponentListener() {
			@Override
			public void componentShown(ComponentEvent e) {  }
			@Override
			public void componentResized(ComponentEvent e) {
				final int TAM_MIN = 200;
				int anchoMax = getLaVentTmp_().getLaRefZonaTrabajo_().getWidth();
				int altoMax =  getLaVentTmp_().getLaRefZonaTrabajo_().getHeight();
				int ancho = getLaVentTmp_().getWidth();
				int alto = getLaVentTmp_().getHeight();
				boolean cambiarTamanio = false;
				
				if (ancho < TAM_MIN) {  
					ancho = TAM_MIN;
					cambiarTamanio = true;
				} else if ( ancho > anchoMax) {
					ancho = anchoMax;
					cambiarTamanio = true;
				}
				if (alto < TAM_MIN) {
					alto = TAM_MIN;
					cambiarTamanio = true;
				}else if ( alto > altoMax) {
					alto = altoMax;
					cambiarTamanio = true;
				}
				if (cambiarTamanio) {
					getLaVentTmp_().setSize(ancho, alto);
				}
				
				getLaVentTmp_().getElPanelScroll_().setBounds(10, 10
					                  	, ancho - 45 
					   	                , alto - 65);
				
			}
			@Override
			public void componentMoved(ComponentEvent e) { 
				Vector<VentanaInterna>  vecVent  = getLaVentTmp_().getLaRefZonaTrabajo_()
						                                          .getVecVentanas_();
				for (int i = 0; i < vecVent.size(); i++) {
					vecVent.get(i).repaint();
				}
		    }
			@Override
			public void componentHidden(ComponentEvent e) {  }
		});
    }
	//------------------
}
