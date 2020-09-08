package ml.brainin.smallpizzeria.model.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import ml.brainin.smallpizzeria.model.history.OrdersHistory;
import ml.brainin.smallpizzeria.model.prices.BasePriceObject;
import ml.brainin.smallpizzeria.model.prices.DeliveryPrice;
import ml.brainin.smallpizzeria.model.prices.PizzaPrice;

// TODO: Auto-generated Javadoc
/**
 * The Class FileLoader.
 */
public class FileLoader {
	
	/** The Constant LOAD_ZONE_PRICES. */
	public static final int LOAD_ZONE_PRICES = 0;
	
	/** The Constant LOAD_PIZZA_PRICES. */
	public static final int LOAD_PIZZA_PRICES = 1;
	
	/** The user path. */
	private String userPath = "src/ml/brainin/smallpizzeria/files/orderhistory.txt";

	/**
	 * Instantiates a new file loader.
	 */
	public FileLoader() {
	}
	
	/**
	 * Load file.
	 *
	 * @param type the type
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<BasePriceObject> loadFile(int type) throws Exception {
		List<BasePriceObject> basePriceObjects = new ArrayList<>();
		String fileName;
		switch (type) {
		case LOAD_ZONE_PRICES:
			fileName = "zoneprices.txt";
			break;
		default:
			fileName = "pizzaprices.txt";
			break;
		}
		FileReader fileReader = new FileReader("src/ml/brainin/smallpizzeria/files/"+fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);     
		String line = null;          
		while ((line = bufferedReader.readLine()) != null) {     
			if (!line.contains(";")) continue;
			StringTokenizer st = new StringTokenizer(line, ";");          
			String name = st.nextToken();        
			float price = Float.parseFloat(st.nextToken());   
			switch (type) {
			case LOAD_ZONE_PRICES:
				basePriceObjects.add(new DeliveryPrice(name, price));
				break;
			default:
				basePriceObjects.add(new PizzaPrice(name, price));
				break;
			}
		}        
		bufferedReader.close();
		fileReader.close();
		return basePriceObjects;
	}
    
    /**
     * Load history.
     *
     * @return the orders history
     */
    public OrdersHistory loadHistory(){
    	OrdersHistory ordersHistory = null;
        try{
            System.err.println("Working Directory = " +userPath);  
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(userPath);
            java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(fileInputStream);
            ordersHistory = (OrdersHistory) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ordersHistory;
    }
    
    /**
     * Save history.
     *
     * @param ordersHistory the orders history
     */
    public void saveHistory(OrdersHistory ordersHistory){
        try{
            File file = new File(userPath);
            if (!file.exists()) {
            	file.createNewFile();
            }
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(ordersHistory);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
