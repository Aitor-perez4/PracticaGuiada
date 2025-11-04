package gui.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public MainWindow() {
		
		this.setTitle("JJ.OO. París 2024");
		this.setSize(640, 480);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		DefaultListModel<String> modelo_lista = new DefaultListModel<>();
		JList<String> lista = new JList<>(modelo_lista);
		
		
		for (int i = 0; i < 50; i++) {
			String nombre = "a" + i;
			modelo_lista.addElement(nombre);
		}
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
		fichero.add(salir);
		
		this.setVisible(true);
}
}
