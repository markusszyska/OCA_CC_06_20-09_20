/**
 * 
 */
package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import models.ItemComboBox;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class ComboBoxDataGenerator {
	

	
	public static List<ItemComboBox> getItems(String pattern){
		List<ItemComboBox> items = new ArrayList<>();
		switch (pattern ) {
		case Event.DEPARTMENT_DATA:
			items.addAll(Arrays.asList(new ItemComboBox(0, ""), new ItemComboBox(1, "Customer service"), new ItemComboBox(2, "Logistics department"), new ItemComboBox(3, "Management department")));
			break;
		case Event.ANTIQUITY_DATA:
			items.addAll(Arrays.asList(new ItemComboBox(0, ""), new ItemComboBox(1, "1 year of service"), new ItemComboBox(2, "2 to 6 years of service"), new ItemComboBox(3, "7 years or more of service")));
		default:
			break;
		}
		return items;
	}
	
	
	public static Vector<ItemComboBox> generateData(String pattern) {
		Vector<ItemComboBox> model =  new Vector<ItemComboBox>();
		List<ItemComboBox> items = null;
		switch (pattern) {
		case Event.DEPARTMENT_DATA:
			items = getItems(Event.DEPARTMENT_DATA);
			break;
		case Event.ANTIQUITY_DATA:
			items = getItems(Event.ANTIQUITY_DATA);
			break;
		default:
			break;
		}
		for (Iterator<ItemComboBox> iterator = items.iterator(); iterator.hasNext();) {
			ItemComboBox itemComboBox = (ItemComboBox) iterator.next();
			model.addElement(itemComboBox);
		}
		return model;

	} 
	
}
