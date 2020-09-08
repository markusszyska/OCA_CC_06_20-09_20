/**
 * 
 */
package models;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class ItemComboBox {

	private Integer id;
	private String description;
	
	
	/**
	 * @param id
	 * @param description
	 */
	public ItemComboBox(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
