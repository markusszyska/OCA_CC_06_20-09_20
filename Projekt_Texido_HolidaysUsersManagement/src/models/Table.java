/**
 * 
 */
package models;

import java.util.List;

import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class Table {

	private float margin;
	private float height;
	private PDRectangle pageSize; //Page size
	private boolean isLandscape;
	private float rowHeight;
	
	//font Attributes
	private PDFont textFont;
	private float fontSize;
	
	//table Content Attributes
	private Integer numberOfRows;
	private List<Column> columns;
	private String[][] content;
	private float cellMargin;

	public Table() {
	}

	public Integer getNumberOfColumns() {
        return this.getColumns().size();
    }

	public float getWidth() {
        float tableWidth = 0f;
        for (Column column : columns) {
            tableWidth += column.getWidth();
        }
        return tableWidth;
    }
	
	/**
	 * @return the margin
	 */
	public float getMargin() {
		return margin;
	}

	/**
	 * @return the rowHeight
	 */
	public float getRowHeight() {
		return rowHeight;
	}

	/**
	 * @param margin the margin to set
	 */
	public void setMargin(float margin) {
		this.margin = margin;
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @return the pageSize
	 */
	public PDRectangle getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(PDRectangle pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the isLandscape
	 */
	public boolean isLandscape() {
		return isLandscape;
	}

	/**
	 * @param isLandscape the isLandscape to set
	 */
	public void setLandscape(boolean isLandscape) {
		this.isLandscape = isLandscape;
	}

	/**
	 * @return the textFont
	 */
	public PDFont getTextFont() {
		return textFont;
	}

	/**
	 * @param textFont the textFont to set
	 */
	public void setTextFont(PDFont textFont) {
		this.textFont = textFont;
	}

	/**
	 * @return the fontSize
	 */
	public float getFontSize() {
		return fontSize;
	}

	/**
	 * @param fontSize the fontSize to set
	 */
	public void setFontSize(float fontSize) {
		this.fontSize = fontSize;
	}

	/**
	 * @return the numberOfRows
	 */
	public Integer getNumberOfRows() {
		return numberOfRows;
	}

	/**
	 * @param numberOfRows the numberOfRows to set
	 */
	public void setNumberOfRows(Integer numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	
	 public void setRowHeight(float rowHeight) {
	        this.rowHeight = rowHeight;
	    }
	/**
	 * @return the columns
	 */
	public List<Column> getColumns() {
		return columns;
	}

	/**
	 * @param columns the columns to set
	 */
	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	/**
	 * @return the content
	 */
	public String[][] getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String[][] content) {
		this.content = content;
	}

	/**
	 * @return the cellMargin
	 */
	public float getCellMargin() {
		return cellMargin;
	}

	/**
	 * @param cellMargin the cellMargin to set
	 */
	public void setCellMargin(float cellMargin) {
		this.cellMargin = cellMargin;
	}
	
	public String[] getColumnsNamesAsArray() {
        String[] columnNames = new String[getNumberOfColumns()];
        for (int i = 0; i < getNumberOfColumns() - 1; i++) {
            columnNames[i] = columns.get(i).getName();
        }
        return columnNames;
    }
	
	
	
}
