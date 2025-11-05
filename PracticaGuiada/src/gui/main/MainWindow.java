package gui.main;
import main.Main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Iterator;
import gui.AthleteListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ListCellRenderer;

import domain.Athlete;
public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Athlete[] atletas;
	
	public MainWindow(Athlete[] atletas) {
		
		this.setTitle("JJ.OO. París 2024");
		this.setSize(640, 480);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		DefaultListModel<Athlete> modelo_lista = new DefaultListModel<>();
		JList<Athlete> lista = new JList<>(modelo_lista);
		for (Athlete atleta : atletas) {
			modelo_lista.addElement(atleta);
		}
		lista.setCellRenderer(new AthleteListCellRenderer());
		
		JScrollPane scroller = new JScrollPane(lista);
		scroller.setPreferredSize(new Dimension(200, this.getHeight()));
		this.add(scroller, BorderLayout.WEST);
		
		JTabbedPane tabbedpane = new JTabbedPane();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		tabbedpane.addTab("Datos", panel1);
		tabbedpane.addTab("Medallas", panel2 );
		this.add(tabbedpane, BorderLayout.CENTER);
		
		JMenuBar barra_menu = new JMenuBar();
		this.add(barra_menu, BorderLayout.NORTH);
		
		JMenu fichero = new JMenu("fichero");
		fichero.setMnemonic(KeyEvent.VK_F);
		barra_menu.add(fichero);
		
		JMenuItem nuevo = new JMenuItem("Nuevo atleta...");
		nuevo.setMnemonic(KeyEvent.VK_N);
		fichero.add(nuevo);
		
		fichero.addSeparator();
		
		JMenuItem importar = new JMenuItem("Importar...");
		importar.setMnemonic(KeyEvent.VK_I);
		fichero.add(importar);
		
		JMenuItem exportar = new JMenuItem("Exportar...");
		exportar.setMnemonic(KeyEvent.VK_E);
		fichero.add(exportar);
		
		fichero.addSeparator();
		
		JMenuItem salir = new JMenuItem("Salir...");
		salir.setMnemonic(KeyEvent.VK_S);
		salir.addActionListener(e -> ConfirmarSalida());
			
		
		fichero.add(salir);
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				ConfirmarSalida();
			}		
			});
		
		
		this.setVisible(true);
}
	
	public void ConfirmarSalida() {
		int opcion =JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?" , "Salir" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		if (opcion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}
