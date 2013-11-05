package interfazGrafica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import herramientas.Histograma;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class PanelInformacion extends JDialog {
  //______________________________________
  // Atributos constantes predeterminados:
  final static int ANCHO_BORD = 5;
	
  //-FIN---------------	

  //_______________
  // Constructores:
  public PanelInformacion (Histograma elHistograma) {
	  inicializar(elHistograma);
  }
  //-FIN------------------
   
  //__________________
  // MŽtodos pœblicos:
  //-FIN------------------
  
  //______________________
  // Manejadores pœblicos:
  public PanelGraf256 getElGrafHistAbs_() {
    return elGrafHistAbs_;
  }
  public void setElGrafHistAbs_(PanelGraf256 elGrafHistAbs_) {
    this.elGrafHistAbs_ = elGrafHistAbs_;
  }
  public PanelGraf256 getElGrafHistAcm_() {
    return elGrafHistAcm_;
  }
  public void setElGrafHistAcm_(PanelGraf256 elGrafHistAcm_) {
    this.elGrafHistAcm_ = elGrafHistAcm_;
  }
  public JLabel getElBrillo_() {
    return elBrillo_;
  }
  public void setElBrillo_(JLabel elBrillo_) {
    this.elBrillo_ = elBrillo_;
  }
  public JLabel getElContraste_() {
    return elContraste_;
  }
  public void setElContraste_(JLabel elContraste_) {
    this.elContraste_ = elContraste_;
  }
  public JLabel getLaEntropia_() {
    return laEntropia_;
  }
  public void setLaEntropia_(JLabel laEntropia_) {
    this.laEntropia_ = laEntropia_;
  }
  public JLabel getLosRangos_() {
    return losRangos_;
  }
  public void setLosRangos_(JLabel losRangos_) {
    this.losRangos_ = losRangos_;
  }
  public JButton getElIntercambiador_() {
    return elIntercambiador_;
  }
  public void setElIntercambiador_(JButton elIntercambiador_) {
    this.elIntercambiador_ = elIntercambiador_;
  }
  //-FIN--------------------
		
  //____________________
  // Atributos privados:
  private PanelGraf256 elGrafHistAbs_;
  private PanelGraf256 elGrafHistAcm_;
  
  private JLabel elBrillo_;
  private JLabel elContraste_;
  private JLabel laEntropia_;
  private JLabel losRangos_;
  
  private JButton elIntercambiador_;
  //-FIN------------------

  //__________________
  // MŽtodos privados:
  private void inicializar (Histograma elHistograma) {
	setLayout(null);
    setElGrafHistAbs_(new PanelGraf256(elHistograma.getElHistograma_()));
    setElGrafHistAcm_(new PanelGraf256(elHistograma.calcularHistogramaAcm()));
    setElBrillo_(new JLabel(" Brillo: " + Math.round(elHistograma.calcularMedia())));
    setElContraste_(new JLabel(" Contraste: " + Math.round(elHistograma.calcularDesvTipica())));
    setLaEntropia_(new JLabel(" Entropia: " + elHistograma.calcularEntropia()));
    setLosRangos_(new JLabel (" Rangos: [" + elHistograma.valorMinimo() 
    		                  + ", " + elHistograma.valorMaximo() + "]"));
    setElIntercambiador_(new JButton("Acumulado"));
    
    getElGrafHistAbs_().setLocation(ANCHO_BORD, ANCHO_BORD);
    getElGrafHistAbs_().setBorder(new LineBorder(Color.black));
    getElGrafHistAcm_().setLocation(2 * ANCHO_BORD + getElGrafHistAbs_().getWidth(), ANCHO_BORD);
    getElGrafHistAcm_().setBorder(new LineBorder(Color.black));
    getElGrafHistAcm_().setVisible(false);
    
    getElBrillo_().setLocation(ANCHO_BORD, 2 * ANCHO_BORD + getElGrafHistAbs_().getHeight());
    getElBrillo_().setSize(100, 30);
    getElBrillo_().setBorder(new LineBorder(Color.black));
    
    getElContraste_().setLocation((2 * ANCHO_BORD) + 100, (2 * ANCHO_BORD) + getElGrafHistAbs_().getHeight());
    getElContraste_().setSize(100, 30);
    getElContraste_().setBorder(new LineBorder(Color.black));
    
    getLaEntropia_().setLocation(ANCHO_BORD, (3 * ANCHO_BORD) + getElGrafHistAbs_().getHeight() + 30);
    getLaEntropia_().setSize(205, 30);
    getLaEntropia_().setBorder(new LineBorder(Color.black));
    
    getLosRangos_().setLocation(ANCHO_BORD, (4 * ANCHO_BORD) + getElGrafHistAbs_().getHeight() + (2 * 30));
    getLosRangos_().setSize(205, 30);
    getLosRangos_().setBorder(new LineBorder(Color.black));
    
    getElIntercambiador_().setLocation(2 * ANCHO_BORD + 205,  2 * ANCHO_BORD + getElGrafHistAbs_().getHeight());
    getElIntercambiador_().setSize(100, 100);
    getElIntercambiador_().addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		   if (getElGrafHistAcm_().isVisible()) {
			   getElGrafHistAcm_().setVisible(false);
			   setSize(2 * ANCHO_BORD + getElGrafHistAbs_().getWidth()
			    		, (5 * ANCHO_BORD) + getElGrafHistAbs_().getHeight() + (3 * 30) + 30);
		   } else {
			   getElGrafHistAcm_().setVisible(true);
			   setSize(3 * ANCHO_BORD + 2 * getElGrafHistAbs_().getWidth()
			    		, (5 * ANCHO_BORD) + getElGrafHistAbs_().getHeight() + (3 * 30) + 30);
		   }
			
		}
	});
       
    add(getElGrafHistAbs_());
    add(getElGrafHistAcm_());
    add(getElBrillo_());
    add(getElContraste_());
    add(getLaEntropia_());
    add(getLosRangos_());
    add(getElIntercambiador_());
    
    setSize(2 * ANCHO_BORD + getElGrafHistAbs_().getWidth()
    		, (5 * ANCHO_BORD) + getElGrafHistAbs_().getHeight() + (3 * 30) + 30);
    setTitle("Panel Informacion.");
    setVisible(true);
    setResizable(false);
    
  }
  //-FIN-------------------------
}
