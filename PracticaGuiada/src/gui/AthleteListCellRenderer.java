package gui;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

import domain.Athlete;

public class AthleteListCellRenderer extends DefaultListCellRenderer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Component getListCellRendererComponent(JList<?> list,
	Object value, int index, boolean isSelected, boolean hasFocus) {

		
	Component renderer = super.getListCellRendererComponent(list, value, index, isSelected, hasFocus);
	if (value instanceof Athlete) {
		Athlete atleta = (Athlete) value;
		this.setText(atleta.getName());
	}
	
	return renderer;
	}
}

