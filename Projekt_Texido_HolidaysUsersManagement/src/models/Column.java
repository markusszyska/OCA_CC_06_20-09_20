/**
 * 
 */
package models;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class Column {
	private String name;
	private float width;
	/**
	 * @param name
	 * @param width
	 */
	public Column(String name, float width) {
		super();
		this.name = name;
		this.width = width;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}
	
	
}
