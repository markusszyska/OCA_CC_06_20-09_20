/**
 * 
 */
package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import builders.TableBuilder;
import models.Column;
import models.Employee;
import models.Table;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class PDFDocument {

	// Page configuration
	private static final PDRectangle PAGE_SIZE = PDRectangle.A4;
	private static final float MARGIN = 20;
	private static final boolean IS_LANDSCAPE = true;

	// Font configuration
	private static final PDFont TEXT_FONT = PDType1Font.HELVETICA;
	private static final float FONT_SIZE = 10;

	// Table configuration
	private static final float ROW_HEIGHT = 15;
	private static final float CELL_MARGIN = 2;

	private static float tableHeight = IS_LANDSCAPE ? PAGE_SIZE.getWidth() - (2 * MARGIN)
			: PAGE_SIZE.getHeight() - (2 * MARGIN);

	public static Table createContent(List<Employee> employees) {
		List<Column> columns = new ArrayList<Column>();
		columns.add(new Column("FirstName", 90));
		columns.add(new Column("LastName", 230));
		columns.add(new Column("Department", 150));
		columns.add(new Column("Antiquity", 150));
		
		String[][] content = new String[employees.size()][Employee.class.getFields().length];
		int count = 0;
		for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			content[count] = (String[]) Arrays.asList(employee.getName(),employee.getLastName() + " " + employee.getLastSecondName(), employee.getDepartment().getName(), employee.antiquity).toArray();
			count++;
		}

		Table table = new TableBuilder().withCellMargin(CELL_MARGIN).withColumns(columns).withContent(content)
				.withHeight(tableHeight).withNumberOfRows(content.length).withRowHeight(ROW_HEIGHT).withMargin(MARGIN)
				.withPageSize(PAGE_SIZE).withLandscape(IS_LANDSCAPE).withTextFont(TEXT_FONT).withFontSize(FONT_SIZE)
				.build();
		return table;
	}
}
