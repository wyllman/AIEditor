/**
 * Descripci—n: Clase definitoria de la barra de menœ de la ventana principal
 *   
 * Implementado:
 * 
 * Por implementar:  - Implementar opci—n "archivo" (v0.001)
 *                   - Implementar opci—n "ayuda" (v0.001)
 */
package interfazGrafica;

import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import controladores.EventosBarraMenu;


@SuppressWarnings("serial")
public class BarraMenu extends JMenuBar {
	//______________________________________
    // Atributos constantes predeterminados:
	static final int ALTO = 30;	
	static final Color COL_FONDO = Color.gray;
	static final String ID = "menu_p";
	//-FIN---------------	
	
    //_______________
	// Constructores:
	public BarraMenu (VentanaPrincipal laVentana) {
		
		inicializar (laVentana, 0, 0, laVentana.getWidth(), ALTO);
	}
	public BarraMenu (VentanaPrincipal laVentana, int pos_x, int pos_y, int ancho, int alto) {
		inicializar (laVentana, pos_x, pos_y, ancho, alto);
	}
	//-FIN------------------
	    
	//__________________
	// MŽtodos pœblicos:
		
		
	//______________________
	// Manejadores pœblicos:
	public JMenu getmArchivo_() {
		return mArchivo_;
	}
	public void setmArchivo_(JMenu mArchivo_) {
		this.mArchivo_ = mArchivo_;
	}
	public JMenu getmAyuda_() {
		return mAyuda_;
	}
	public void setmAyuda_(JMenu mAyuda_) {
		this.mAyuda_ = mAyuda_;
	}
	public JMenuItem getMiSalir_() {
		return miSalir_;
	}
	public void setMiSalir_(JMenuItem miSalir_) {
		this.miSalir_ = miSalir_;
	}
	public JMenuItem getMiAutor_() {
		return miAutor_;
	}
	public void setMiAutor_(JMenuItem miAutor_) {
		this.miAutor_ = miAutor_;
	}
	public JMenuItem getMiAyuda_() {
		return miAyuda_;
	}
	public void setMiAyuda_(JMenuItem miAyuda_) {
		this.miAyuda_ = miAyuda_;
	}
	public EventosBarraMenu getLosEventos_() {
		return losEventos_;
	}
	public void setLosEventos_(EventosBarraMenu losEventos_) {
		this.losEventos_ = losEventos_;
	}
	public JMenuItem getMiCargar_() {
		return miCargar_;
	}
	public void setMiCargar_(JMenuItem miCargar_) {
		this.miCargar_ = miCargar_;
	}
	public VentanaPrincipal getLaVentTmp_() {
		return laVentTmp_;
	}
	public void setLaVentTmp_(VentanaPrincipal laVentTmp_) {
		this.laVentTmp_ = laVentTmp_;
	}
	public JMenuItem getMiGuardar_() {
		return miGuardar_;
	}
	public void setMiGuardar_(JMenuItem miGuardar_) {
		this.miGuardar_ = miGuardar_;
	}
	public JMenu getmVentAbiertas_() {
		return mVentAbiertas_;
	}
	public void setmVentAbiertas_(JMenu mVentAbiertas_) {
		this.mVentAbiertas_ = mVentAbiertas_;
	}
	public JMenu getmInform_() {
		return mInform_;
	}
	public void setmInform_(JMenu mInform_) {
		this.mInform_ = mInform_;
	}
	public JMenuItem getMiHistogramaAbs_() {
		return miHistogramaAbs_;
	}
	public void setMiHistogramaAbs_(JMenuItem miHistogramaAbs_) {
		this.miHistogramaAbs_ = miHistogramaAbs_;
	}
	public JMenuItem getMiHistogramaAcm_() {
		return miHistogramaAcm_;
	}
	public void setMiHistogramaAcm_(JMenuItem miHistogramaAcm_) {
		this.miHistogramaAcm_ = miHistogramaAcm_;
	}
	public JMenuItem getMiInformacion_() {
		return miInformacion_;
	}
	public void setMiInformacion_(JMenuItem miInformacion_) {
		this.miInformacion_ = miInformacion_;
	}
	public JMenu getmEdicion_() {
		return mEdicion_;
	}
	public void setmEdicion_(JMenu mEdicion_) {
		this.mEdicion_ = mEdicion_;
	}
	public JMenuItem getMiSeleccion_() {
		return miSeleccion_;
	}
	public JMenuItem getMiDeSeleccion_() {
		return miDeSeleccion_;
	}
	public void setMiDeSeleccion_(JMenuItem miDeSeleccion_) {
		this.miDeSeleccion_ = miDeSeleccion_;
	}
	public void setMiSeleccion_(JMenuItem miSeleccion_) {
		this.miSeleccion_ = miSeleccion_;
	}
	public JMenuItem getMiCopiarSel_() {
		return miCopiarSel_;
	}
	public void setMiCopiarSel_(JMenuItem miCopiarSel_) {
		this.miCopiarSel_ = miCopiarSel_;
	}
	public JMenu getmTransformar_() {
		return mTransformar_;
	}
	public void setmTransformar_(JMenu mTransformar_) {
		this.mTransformar_ = mTransformar_;
	}
	public JMenuItem getMiNegativizar_() {
		return miNegativizar_;
	}
	public void setMiNegativizar_(JMenuItem miNegativizar_) {
		this.miNegativizar_ = miNegativizar_;
	}
	public JMenuItem getMiPanelBriCon_() {
		return miPanelBriCon_;
	}
	public void setMiPanelBriCon_(JMenuItem miPanelBriCon_) {
		this.miPanelBriCon_ = miPanelBriCon_;
	}
	public JMenuItem getMiPerfil_() {
		return miPerfil_;
	}
	public void setMiPerfil_(JMenuItem miPerfil_) {
		this.miPerfil_ = miPerfil_;
	}
	public JMenuItem getMiPanelTransLine_() {
		return miPanelTransLine_;
	}
	public void setMiPanelTransLine_(JMenuItem miPanelTransLine_) {
		this.miPanelTransLine_ = miPanelTransLine_;
	}
	public JMenuItem getMiPanelDiferencia_() {
		return miPanelDiferencia_;
	}
	public void setMiPanelDiferencia_(JMenuItem miPanelDiferencia_) {
		this.miPanelDiferencia_ = miPanelDiferencia_;
	}
	public JMenuItem getMiPanelUmbralGamma_() {
		return miPanelUmbralGamma_;
	}
	public void setMiPanelUmbralGamma_(JMenuItem miPanelUmbralGamma_) {
		this.miPanelUmbralGamma_ = miPanelUmbralGamma_;
	}
	public JMenuItem getMiEcualizar_() {
      return miEcualizar_;
    }
    public void setMiEcualizar_(JMenuItem miEcualizar_) {
      this.miEcualizar_ = miEcualizar_;
    }
	public JMenuItem getMiPanelTransHistog_() {
		return miPanelTransHistog_;
	}
	public void setMiPanelTransHistog_(JMenuItem miPanelTransHistog_) {
		this.miPanelTransHistog_ = miPanelTransHistog_;
	}
	//-FIN--------------------
		

	//____________________
	// Atributos privados:
	private JMenu mArchivo_;
	private JMenuItem miCargar_;
	private JMenuItem miGuardar_;
	private JMenu mVentAbiertas_;
	private JMenuItem miSalir_;
	
	private JMenu mInform_;
	private JMenuItem miHistogramaAbs_;
	private JMenuItem miHistogramaAcm_;
	private JMenuItem miInformacion_;
	private JMenuItem miPerfil_;
	

	private JMenu mEdicion_;
	private JMenuItem miSeleccion_;
	private JMenuItem miDeSeleccion_;
    private JMenuItem miCopiarSel_;

    
    private JMenu mTransformar_;
    private JMenuItem miNegativizar_;
    private JMenuItem miEcualizar_;
	private JMenuItem miPanelBriCon_;
    private JMenuItem miPanelTransLine_;
    private JMenuItem miPanelDiferencia_;
    private JMenuItem miPanelUmbralGamma_;
    private JMenuItem miPanelTransHistog_;
    


	private JMenu mAyuda_;
	private JMenuItem miAyuda_;
	private JMenuItem miAutor_;
	
	private EventosBarraMenu losEventos_;
	private VentanaPrincipal laVentTmp_;
    //-FIN------------------
	
	//__________________
	// MŽtodos privados:
	private void inicializar (VentanaPrincipal laVentana, int pos_x, int pos_y, 
			                  int ancho, int alto) {
		setLaVentTmp_(laVentana);
		setName (ID);
		setBackground (COL_FONDO);
		setBounds (pos_x, pos_y, ancho, alto);
		setLosEventos_(new EventosBarraMenu(getLaVentTmp_()));
		
		// Inicializar el menœ "Archivo."
		setmArchivo_(new JMenu ("Archivo."));
		getmArchivo_().setBackground(COL_FONDO);
		getmArchivo_().addMenuListener(getLosEventos_().getAccArchivo_());
		
		// Inicializar la opci—n "Cargar." del menœ "Archivo."
		setMiCargar_(new JMenuItem ("Cargar."));
		//Acci—n a ejecutar cuando se clickea en la opci—n "Cargar."
		getMiCargar_().addActionListener(getLosEventos_().getAccCargar_());
		getmArchivo_().add (getMiCargar_());
		
		// Inicializar la opci—n "Guardar." del menœ "Archivo."
	    setMiGuardar_(new JMenuItem ("Guardar."));
		//Acci—n a ejecutar cuando se clickea en la opci—n "Guardar."
		getMiGuardar_().addActionListener(getLosEventos_().getAccGuardar_());
		getmArchivo_().add (getMiGuardar_());
		
		// Inicializar el submenu "Ventanas Abiertas." del menœ "Archivo."
		setmVentAbiertas_(new JMenu("Ventanas Abiertas."));
		//getmVentAbiertas_().addActionListener(getLosEventos_().getAccVentAb_());
		getmArchivo_().add (getmVentAbiertas_());
		
		getmArchivo_().add(new JSeparator());
		
		// Inicializar la opci—n "Salir." del menœ "Archivo."
		setMiSalir_(new JMenuItem("Salir."));
		// Acci—n a ejecutar cuando se clickea en la opci—n "Salir."
		getMiSalir_().addActionListener (getLosEventos_().getAccSalir_());
		getmArchivo_().add(getMiSalir_());
		
		
		
		
		// Inicializar el menœ "Informaci—n"
		setmInform_(new JMenu("Inf. Imagen."));
		getmInform_().setBackground(COL_FONDO);
		setMiHistogramaAbs_(new JMenuItem ("Histograma Absoluto."));
		getMiHistogramaAbs_().addActionListener(getLosEventos_().getAccHistAbs_());
		getmInform_().add(getMiHistogramaAbs_());
		
		setMiHistogramaAcm_(new JMenuItem ("Histograma Acumulativo."));
		getMiHistogramaAcm_().addActionListener(getLosEventos_().getAccHistAcm_());
		getmInform_().add(getMiHistogramaAcm_());
		
		getmInform_().add(new JSeparator());
		setMiInformacion_(new JMenuItem("Panel Inform."));
		getMiInformacion_().addActionListener(getLosEventos_().getAccPInform_());
		getmInform_().add(getMiInformacion_());
		
		setMiPerfil_(new JMenuItem("Panel Perfil."));
		getMiPerfil_().addActionListener(getLosEventos_().getAccPPerfil_());
		getmInform_().add(getMiPerfil_());
		
		
		
		
		
		// Inicializar el menœ "Edicion"
		setmEdicion_(new JMenu("Edicion."));
		getmEdicion_().setBackground(COL_FONDO);
		
		setMiSeleccion_(new JMenuItem("Seleccionar."));
		getMiSeleccion_().addActionListener(getLosEventos_().getAccSeleccionar_());
		
		getmEdicion_().add(getMiSeleccion_());
		
		setMiDeSeleccion_(new JMenuItem("Deseleccionar"));
		getMiDeSeleccion_().addActionListener(getLosEventos_().getAccDeseleccionar_());
		
		getmEdicion_().add(getMiDeSeleccion_());
		
		getmEdicion_().add(new JSeparator());
		
		setMiCopiarSel_(new JMenuItem("Copiar Sel."));
		getMiCopiarSel_().addActionListener(getLosEventos_().getAccCopiarSel_());
		
		getmEdicion_().add(getMiCopiarSel_());
		
		
		
		
		
		// Inicializar el menœ "Transformaciones de punto."
		setmTransformar_(new JMenu("Transf. de Punto"));
		getmTransformar_().setBackground(COL_FONDO);
		setMiNegativizar_(new JMenuItem("Negativizar."));
		getMiNegativizar_().addActionListener(getLosEventos_().getAccNegativizar_());
		
		getmTransformar_().add(getMiNegativizar_());
		
		
		setMiEcualizar_(new JMenuItem("Ecualizar."));
		getMiEcualizar_().addActionListener(getLosEventos_().getAccEcualizar_());
		getmTransformar_().add(getMiEcualizar_());
		
		getmTransformar_().add(new JSeparator());
		
		setMiPanelBriCon_(new JMenuItem("Brillo/Contraste"));
		getMiPanelBriCon_().addActionListener(getLosEventos_().getAccBriCont_());
		getmTransformar_().add(getMiPanelBriCon_());
		
		setMiPanelTransLine_(new JMenuItem("Panel Transf. Lineales"));
		getMiPanelTransLine_().addActionListener(getLosEventos_().getAccTrnsLin_());
		getmTransformar_().add(getMiPanelTransLine_());
		
		setMiPanelDiferencia_(new JMenuItem("Panel Dif. Img."));
		getMiPanelDiferencia_().addActionListener(getLosEventos_().getAccDiferen_());
		getmTransformar_().add(getMiPanelDiferencia_());
		
		setMiPanelUmbralGamma_(new JMenuItem("Panel Umbral/Gamma"));
		getMiPanelUmbralGamma_().addActionListener(getLosEventos_().getAccUmbGamma_());
		getmTransformar_().add(getMiPanelUmbralGamma_());
		
		setMiPanelTransHistog_(new JMenuItem("Panel Transf. del histograma."));
		getMiPanelTransHistog_().addActionListener(getLosEventos_().getAccTrnsHist_());
		getmTransformar_().add(getMiPanelTransHistog_());
		
		
		// Inicializar el menœ "Ayuda."
		setmAyuda_(new JMenu("Ayuda."));
		getmAyuda_().setBackground(COL_FONDO);
		
		// Inicializar la opci—n "Ayuda." del menœ "Ayuda."
		setMiAyuda_(new JMenuItem("Ayuda."));
		// Acci—n a ejecutar cuando se clickea en la opci—n "Ayuda."
		getMiAyuda_().addActionListener(getLosEventos_().getAccAyuda_());
		getmAyuda_().add(getMiAyuda_());
		
		getmAyuda_().add(new JSeparator());
		
		// Inicializar la opci—n "Autores." del menœ "Ayuda."
		setMiAutor_(new JMenuItem("Autores."));
		// Acci—n a ejecutar cuando se clickea en la opci—n "Autores."
		getMiAutor_().addActionListener(getLosEventos_().getAccAutor_());
		getmAyuda_().add(getMiAutor_());
		
		this.add(getmArchivo_());
		this.add(getmInform_());
		this.add(getmEdicion_());
		this.add(getmTransformar_());
		this.add(getmAyuda_());
		
		
	}
	//-FIN-------------------------
}