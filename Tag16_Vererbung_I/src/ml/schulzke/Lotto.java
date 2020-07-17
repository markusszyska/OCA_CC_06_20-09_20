package ml.schulzke;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Lotto {
	
	public static void main(String[] args) throws IOException {
		int[] lotto = new int[6];
		int[] lottoUser = new int[6];
		long tries = 0l;
		
		lotto = rndLotto();
		getLotto(lotto);
		System.out.println("----------");
		sortLotto(lotto);
		getLotto(lotto);
		lottoUser = createLotto();
		System.out.println("----------");
		getLotto(lottoUser);
		System.out.println("----------");
		sortLotto(lottoUser);
		getLotto(lottoUser);
		System.out.println(compareLotto(lotto, lottoUser));
		
		while(!compareLotto(lotto, lottoUser)) {
			lotto = rndLotto();
			tries++;
		}
		
		System.out.println("Gewonnen nach "+tries+" Spielen!");
		System.out.println("Das haette "+(tries*6)+"€ gekostet!");
		System.out.println("Das haette "+Math.floor(tries/52)+" Jahre gedauert!");
		System.out.println("----------");
		getLotto(lotto);
		System.out.println("----------");
		getLotto(lottoUser);
		
		System.out.println("----------");
		
		int[][] lotto52 = new int[52][6];
		
		for(int i = 0;i<lotto52.length;i++) {
			System.out.println("\n Lottozahlen der "+(i+1)+". Woche!");
			lotto52[i] = rndLotto();
			getLotto(lotto52[i]);
		}
		
		int inc = getLottoCount();
		int[][] lottoVar = new int[inc][6];
		
		for(int i = 0;i<lottoVar.length;i++) {
			System.out.println("\n Lottozahlen der "+(i+1)+". Ziehung!");
			lottoVar[i] = rndLotto();
			getLotto(lottoVar[i]);
		}
	}
	
	
private static int getLottoCount() throws IOException {
		System.out.println("----------");
		
		//Enter data using BufferReader 
        BufferedReader reader;
        
        // Reading data using readLine 
        String action = null;
        
		while(!isNumeric(action)) {
			System.out.println("Wie viele Ziehungen? Jetzt ");
			
        	reader =  
            new BufferedReader(new InputStreamReader(System.in));
			action = reader.readLine();
			
			if(!isNumeric(action)) {
				System.out.println("Nur Zahlen eingeben...");
			}else {
				int check = Integer.parseInt(action);
				if(check<=0){
					System.out.println("Nur positive Zahlen!");
					action = null;
				}
			}
		
		}
		
		return Integer.parseInt(action);
	}


	/* create a random lotto array
	 * iterate over empty array 
	 * fill array[i] with random 1-49 if random !exist in array
	 */
	static int[] rndLotto() {
		int[] lotto = new int[6];
		int rnd = 0;
		
		for(int i=0;i<lotto.length;i++) {
			rnd = getRndInt(1,49);
			while(checkExist(lotto,rnd)==true) {
				rnd = getRndInt(1,49);
			}
		lotto[i] = rnd;
		}
        return lotto;
    }
	
	static boolean compareLotto(int[] lotto, int[] lottoUser) {
		boolean check = false;
		int find = 0;
		for(int entry : lotto) {
			if(checkExist(lottoUser,entry)) {
				find++;
			}
		}
		if(find==6) {
			check = true;
		}
		return check;
	}
	
	/* input lotto array
	 * iterate over array
	 * if array[i] < array[i+1] skip
	 * else swap places of array[i] and [i+]
	 * start sort again 
	 */
	static int[] sortLotto(int[] lotto) {
        int k;
        for (int i = 0; i < lotto.length - 1; i++) {
            if (lotto[i] < lotto[i + 1]) {
                continue;
            }
            k = lotto[i];
            lotto[i] = lotto[i + 1];
            lotto[i + 1] = k;
            sortLotto(lotto);
        }
        return lotto;
    }
	
	// print lotto array to console
	static void getLotto(int[] lotto) {
		for(int entry : lotto) {
			System.out.print(entry+"	");
		}
		System.out.print("\n");
	}
	
	/* input array and int to check existing within array
	 * initialize find = false
	 * iterate over array
	 * only if array[i] == check set find = true
	 * return find
	 */
	static boolean checkExist(int[] lotto, int check) {
		boolean find = false;
		for(int entry : lotto) {
			if(entry==check) {
				find = true;
			}
		}
		return find;
	}
	
	// return random int with min max input
	static int getRndInt(int min, int max) {
		return new Random().nextInt(max - min + 1) + min;
	}
	
	/* simple input mehtod for array creation
	 * ask 6 times to input number
	 * check if input is number && within range 1-49 && !already exist
	 * stay in while if statment above not met
	 * return created array
	 */
	
	static int[] createLotto() throws IOException {
		int[] lotto = new int[6];
		System.out.println("----------");
		
		//Enter data using BufferReader 
        BufferedReader reader;
        
        // Reading data using readLine 
        String action = null;
        
		for(int i=0;i<6;i++) {
			action = null;
		while(!isNumeric(action)) {
			System.out.println("Den "+(i+1)+". Tipp eingeben:");
			
        	reader =  
            new BufferedReader(new InputStreamReader(System.in));
			action = reader.readLine();
			
			if(!isNumeric(action)) {
				System.out.println("Nur Zahlen eingeben...");
			}else {
				int check = Integer.parseInt(action);
				if(check>=50||check<=0){
					System.out.println("Nur Zahlen zwischen 1 und 49...");
					action = null;
				}else {
					if(checkExist(lotto,check)) {
						System.out.println("Keine Zahl doppelt...");
						action = null;
					}
				}
			}
		}

		lotto[i] = Integer.parseInt(action);
			
		}
		
		return lotto;
		
	}
	

	/* check if input string is parseable to int
	 * if not return false otherwise true
	 */
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}

}
