package gui.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
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
		this.setVisible(true);
}
}
