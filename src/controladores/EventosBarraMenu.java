/**
 * Descripci—n: Clase que modela el comportamiento de cada uno de los ’tems de la barra de menœ
 *    del programa.
 *   
 * Implementado:   - Evento "salir" (v0.010)
 * 
 * Por implementar:  - Implementar evento "ayuda" (v0.001)
 *                   - Implementar evento "autores" (v0.001)
 */
package controladores;

import herramientas.Edicion;
import herramientas.TransfPunto;
import interfazGrafica.PanelBriCont;
import interfazGrafica.PanelGraf256;
import interfazGrafica.PanelInformacion;
import interfazGrafica.PanelTransfLin;
import interfazGrafica.VentanaAyuda;
import interfazGrafica.VentanaPrincipal;
import interfazGrafica.PanelPerfil;
import interfazGrafica.PanelDiferencia;
import interfazGrafica.PanelUmbralGamma;
import interfazGrafica.PanelTransfHistograma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


public class EventosBarraMenu {
	//______________________________________
    // Atributos constantes predeterminados:
	static final String TEXTO_AUTORES = " Este proyecto ha sido realizado para la asignatura\n"
			                          + " visi—n por computador, de cuarto curso del grado en\n"
			                          + " ingenier’a inform‡tica.\n"
			                          + " \n"
			                          + " Los autores de este proyecto son: \n"
			                          + "    - ... \n"
			                          + "    - ... \n";
	//---------------	
	
    //_______________
	// Constructores:
	public EventosBarraMenu (VentanaPrincipal laVentana) {
		inicializar (laVentana);
	}
	//------------------
	    
	//__________________
	// MŽtodos pœblicos:
		
		
	//______________________
	// Manejadores pœblicos:
	public ActionListener getAccSalir_() {
		return accSalir_;
	}
	public void setAccSalir_(ActionListener accSalir_) {
		this.accSalir_ = accSalir_;
	}
	public ActionListener getAccAyuda_() {
		return accAyuda_;
	}
	public void setAccAyuda_(ActionListener accAyuda_) {
		this.accAyuda_ = accAyuda_;
	}
	public ActionListener getAccAutor_() {
		return accAutor_;
	}
	public void setAccAutor_(ActionListener accAutor_) {
		this.accAutor_ = accAutor_;
	}
	public ActionListener getAccCargar_() {
		return accCargar_;
	}

	public void setAccCargar_(ActionListener accCargar_) {
		this.accCargar_ = accCargar_;
	}
	public VentanaPrincipal getLaVentTmp_() {
		return laVentTmp_;
	}
	public void setLaVentTmp_(VentanaPrincipal laVentTmp_) {
		this.laVentTmp_ = laVentTmp_;
	}
    public ActionListener getAccGuardar_() {
		return accGuardar_;
	}
	public void setAccGuardar_(ActionListener accGuardar_) {
		this.accGuardar_ = accGuardar_;
	}
	public MenuListener getAccArchivo_() {
		return accArchivo_;
	}
	public void setAccArchivo_(MenuListener accArchivo_) {
		this.accArchivo_ = accArchivo_;
	}
	public ActionListener getAccHistAbs_() {
		return accHistAbs_;
	}
	public void setAccHistAbs_(ActionListener accHistAbs_) {
		this.accHistAbs_ = accHistAbs_;
	}
	public ActionListener getAccHistAcm_() {
		return accHistAcm_;
	}
	public void setAccHistAcm_(ActionListener accHistAcm_) {
		this.accHistAcm_ = accHistAcm_;
	}
	public ActionListener getAccPInform_() {
		return accPInform_;
	}
	public void setAccPInform_(ActionListener accPInform_) {
		this.accPInform_ = accPInform_;
	}
	public ActionListener getAccSeleccionar_() {
		return accSeleccionar_;
	}
	public void setAccSeleccionar_(ActionListener accSeleccionar_) {
		this.accSeleccionar_ = accSeleccionar_;
	}
    public ActionListener getAccCopiarSel_() {
		return accCopiarSel_;
	}
	public void setAccCopiarSel_(ActionListener accCopiarSel_) {
		this.accCopiarSel_ = accCopiarSel_;
	}
    public ActionListener getAccDeseleccionar_() {
		return accDeseleccionar_;
	}
	public void setAccDeseleccionar_(ActionListener accDeseleccionar_) {
		this.accDeseleccionar_ = accDeseleccionar_;
	}
	public ActionListener getAccNegativizar_() {
		return accNegativizar_;
	}
	public void setAccNegativizar_(ActionListener accNegativizar_) {
		this.accNegativizar_ = accNegativizar_;
	}
	public ActionListener getAccBriCont_() {
		return accBriCont_;
	}
	public void setAccBriCont_(ActionListener accBriCont_) {
		this.accBriCont_ = accBriCont_;
	}
    public ActionListener getAccPPerfil_() {
		return accPPerfil_;
	}

	public void setAccPPerfil_(ActionListener accPPerfil_) {
		this.accPPerfil_ = accPPerfil_;
	}
	public ActionListener getAccTrnsLin_() {
		return accTrnsLin_;
	}
	public void setAccTrnsLin_(ActionListener accTrnsLin_) {
		this.accTrnsLin_ = accTrnsLin_;
	}
	public ActionListener getAccDiferen_() {
		return accDiferen_;
	}
	public void setAccDiferen_(ActionListener accDiferen_) {
		this.accDiferen_ = accDiferen_;
	}
	public ActionListener getAccUmbGamma_() {
		return accUmbGamma_;
	}
	public void setAccUmbGamma_(ActionListener accUmbGamma_) {
		this.accUmbGamma_ = accUmbGamma_;
	}
	public ActionListener getAccEcualizar_() {
		return accEcualizar_;
	}

	public void setAccEcualizar_(ActionListener accEcualizar_) {
		this.accEcualizar_ = accEcualizar_;
	}
	public ActionListener getAccTrnsHist_() {
		return accTrnsHist_;
	}

	public void setAccTrnsHist_(ActionListener accTrnsHist_) {
		this.accTrnsHist_ = accTrnsHist_;
	}
	//--------------------
	

	//____________________
	// Atributos privados:
	//   - Acciones para el menœ archivo
	private MenuListener accArchivo_;
	private ActionListener accCargar_;
	private ActionListener accGuardar_;
    
	//   - Acciones para el menœ informaci—n de la imagen
	private ActionListener accHistAbs_;
    private ActionListener accHistAcm_;
    private ActionListener accPInform_;
    private ActionListener accPPerfil_;
	

	//   - Acciones para el menœ edici—n
    private ActionListener accSeleccionar_;
    private ActionListener accDeseleccionar_;
	private ActionListener accCopiarSel_;
    

	//   - Acciones para el menœ de transformaciones de punto
	private ActionListener accNegativizar_;
	private ActionListener accEcualizar_;
	private ActionListener accBriCont_;
	private ActionListener accTrnsLin_;
	private ActionListener accDiferen_;
	private ActionListener accUmbGamma_;
	private ActionListener accTrnsHist_;


	//   - Acciones para el menœ ayuda
	private ActionListener accSalir_;
    private ActionListener accAyuda_;
    private ActionListener accAutor_;
    
    private VentanaPrincipal laVentTmp_;
    //------------------
    
	//__________________
	// MŽtodos privados:
	private void inicializar (VentanaPrincipal laVentana) {
		setLaVentTmp_(laVentana);
		
		setAccArchivo_(new MenuListener() {
			@Override
			public void menuSelected(MenuEvent arg0) {
				int tamanio = getLaVentTmp_().getLaZonaTrab_().getVecVentanas_().size();
				  String titulo;
				  JMenuItem opcVentTmp;
				  ActionListener accVentTmp = new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					   String titulo =((JMenuItem) e.getSource()).getText();
					   String[] temporal = titulo.split(" - ");
					   int indice = Integer.parseInt(temporal[0]);
					   
					   try {
						   getLaVentTmp_().getLaZonaTrab_()
						                  .getVecVentanas_().get(indice).setSelected(true);
					   } catch (PropertyVetoException e1) {
						// TODO Auto-generated catch block
						   e1.printStackTrace();
					   }
					  
					}
				  };
				  if (tamanio > 0) {
				    for (int i = 0; i < tamanio; i++) {
				      titulo = getLaVentTmp_().getLaZonaTrab_()
				    		                  .getVecVentanas_().get(i).getTitle();
				      if (titulo.length() > 50) {
				    	  titulo = "..." + titulo.substring(titulo.length() - 47);
				      }
				      opcVentTmp = new JMenuItem (i + " - Imagen:" + titulo);
				      opcVentTmp.addActionListener(accVentTmp);
				      
				      getLaVentTmp_().getElMenu_().getmVentAbiertas_().add(opcVentTmp);
				    }
				  }
				
			}
			@Override
			public void menuDeselected(MenuEvent arg0) {
				// TODO Auto-generated method stub
				getLaVentTmp_().getElMenu_().getmVentAbiertas_().removeAll();
			}
			@Override
			public void menuCanceled(MenuEvent arg0) {
				// TODO Auto-generated method stub
				getLaVentTmp_().getElMenu_().getmVentAbiertas_().removeAll();
			}
		});
		
		
		setAccCargar_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					// Poner el foco en la nueva ventana creada.
					if ( getLaVentTmp_().getLaZonaTrab_().nuevaVentanaInterna()) {
					   getLaVentTmp_().getLaZonaTrab_().getVecVentanas_()
					                  .lastElement().setSelected(true);
					   getLaVentTmp_().getLaZonaTrab_()
					      .setLaVentanaIntAnterior_(getLaVentTmp_()
					    		                      .getLaZonaTrab_()
					    		                      .getLaVentanaIntActual_());
					   getLaVentTmp_().getLaZonaTrab_()
					      .setLaVentanaIntActual_(getLaVentTmp_()
					    		                     .getLaZonaTrab_()
					    		                     .getVecVentanas_()
				                                     .lastElement());
					}
					   
				} catch (PropertyVetoException e) {
					e.printStackTrace();
				}
			}
		});
		
		setAccGuardar_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
		      if (getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null) {
		    	  JFileChooser selector = new JFileChooser(); 
		    	  int retrival = selector.showSaveDialog(null);
		    	  BufferedImage imagenTmp;
		    	  if (retrival == JFileChooser.APPROVE_OPTION) {
		    		 imagenTmp = getLaVentTmp_()
					               .getLaZonaTrab_()
					               .getLaVentanaIntActual_().imagenActiva();
		    	     try {
						ImageIO.write(imagenTmp, "png", selector.getSelectedFile());
					} catch (IOException e) {
						e.printStackTrace();
					}
		    	  }
		      }
			}
		});
		
		setAccSalir_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Saliendo del programa.");
				System.exit(0);
			}
		});
		
		
		setAccHistAbs_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			  if (getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null) {
			    PanelGraf256 grafico = new PanelGraf256(getLaVentTmp_().getLaZonaTrab_()
				  	                                                 .getLaVentanaIntActual_()
					                                                 .getElHistograma_()
					                                                 .getElHistograma_());
			    JDialog ventana = new JDialog();
			    ventana.add(grafico);
			    ventana.setSize(grafico.getWidth(), grafico.getHeight() + 50);
			    ventana.setBounds(100, 100, grafico.getWidth(), grafico.getHeight() + 50);
			    ventana.setVisible(true);
			  }
			}
		});
		setAccHistAcm_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			  if (getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null) {
			    PanelGraf256 grafico = new PanelGraf256(getLaVentTmp_().getLaZonaTrab_()
                                                                     .getLaVentanaIntActual_()
                                                                     .getElHistograma_()
                                                                     .calcularHistogramaAcm());
			    JDialog ventana = new JDialog();
			    ventana.add(grafico);
			    ventana.setSize(grafico.getWidth(), grafico.getHeight() + 50);
			    ventana.setBounds(100, 100, grafico.getWidth(), grafico.getHeight() + 50);
			    ventana.setVisible(true);
			  }
			}
		});
		
		setAccPInform_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			  if (getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null) {
			    new PanelInformacion(getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_().getElHistograma_());
			  }
			}
		});
		
		
		setAccPPerfil_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			  if (getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null) {
			    new PanelPerfil(getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_());
			  }
			}
		});
		
		setAccSeleccionar_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null) {
					getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_().getLosEventos_().setSelActivo_(true);
				}
			}
		});
		
		setAccDeseleccionar_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if ((getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null)
					&& getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_().getElRectResalte_().esValido()){
					getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_().getElRectResalte_().resetear();
					getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_().getZonaPintado_().repaint();
				}
			}
		});
		
		setAccCopiarSel_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Edicion herramientas = new Edicion();
				BufferedImage laImagen = null; 
				if ((getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null) 
					&&  getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_().getElRectResalte_().esValido()) {
				  laImagen = herramientas
						     .calcularSubImagen(getLaVentTmp_().getLaZonaTrab_()
						    		                           .getLaVentanaIntActual_()
						    		                           .imagenActiva()
						                        , getLaVentTmp_().getLaZonaTrab_()
						                                         .getLaVentanaIntActual_()
						                                         .getElRectResalte_());
				  getLaVentTmp_().getLaZonaTrab_().nuevaVentanaInterna(10, 10, laImagen);
				  try {
					getLaVentTmp_().getLaZonaTrab_().getVecVentanas_()
					  .lastElement().setSelected(true);
				} catch (PropertyVetoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
		});
		
		
		setAccNegativizar_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			  TransfPunto herramientas = new TransfPunto();
			  BufferedImage laImagen = null;
			  
			  if (getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null) {
			    laImagen = herramientas.negativizar(getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_().imagenActiva());
			    getLaVentTmp_().getLaZonaTrab_().nuevaVentanaInterna(10, 10, laImagen);
			    try {
					getLaVentTmp_().getLaZonaTrab_().getVecVentanas_().lastElement().setSelected(true);
				} catch (PropertyVetoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			  }
			}
		});
		
		setAccEcualizar_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
		      TransfPunto herramientas = new TransfPunto();
		      BufferedImage laImagen = null;
				  
			  if (getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null) {
			    laImagen = herramientas.calcularEcualizar(getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_().imagenActiva()
			    		                                 , getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_().getElHistograma_());
				getLaVentTmp_().getLaZonaTrab_().nuevaVentanaInterna(10, 10, laImagen);
				try {
			      getLaVentTmp_().getLaZonaTrab_().getVecVentanas_().lastElement().setSelected(true);
			    } catch (PropertyVetoException e1) {
				  e1.printStackTrace();
				}
			  }
			}
		});
		
		
		setAccBriCont_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			  if (getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null) {
			    new PanelBriCont(getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_());
			  }
			}
		});
		
		setAccTrnsLin_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			  if (getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null) {
			    new PanelTransfLin(getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_());
			  }
			}
		});
		
		setAccDiferen_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			  if (getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null) {
			    new PanelDiferencia(getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_()
			    		           , getLaVentTmp_().getLaZonaTrab_().getVecVentanas_());
			  }
			}
		});
		
		setAccUmbGamma_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			  if (getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null) {
			    new PanelUmbralGamma(getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_());
			  }
			}
		});
		
		setAccTrnsHist_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			  if (getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_() != null) {
			    new PanelTransfHistograma(getLaVentTmp_().getLaZonaTrab_().getLaVentanaIntActual_());
			  }
			}
		});
		
		setAccAyuda_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		       //System.out.println("Ayuda - Menœ ’tem.");
		       new VentanaAyuda();
			}
		});
		setAccAutor_(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		       //System.out.println("Autores - Menœ ’tem.");
		       new VentanaAyuda("Autores.", TEXTO_AUTORES);
			}
		});
	}
	//------------------
}
