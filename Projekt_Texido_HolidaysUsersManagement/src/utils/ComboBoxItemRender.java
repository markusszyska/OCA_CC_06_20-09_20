/**
 * 
 */
package utils;

import java.awt.Component;
import java.util.Locale;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import models.ItemComboBox;

/**
 * @author Lic. Raul Alejandro Salas Texido
 * <p>
 * 	ComboxItemReander is a Class for the Serialization of ItemComboBox objects 
 * </p>
 */
public class ComboBoxItemRender extends  JLabel implements ListCellRenderer<Object>{

	private static final long serialVersionUID = 1L;
	

	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		if(value!=null) {
			ItemComboBox item = (ItemComboBox)value;
			setText(item.getDescription().toUpperCase(Locale.ENGLISH));
		}
		if(isSelected) {
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionForeground());
		}else {
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}
		return this;
	}
	
	
	
}
