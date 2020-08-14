package ml.salastexido;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static ArrayList<Integer> generateArray(int size, int bound) {
		ArrayList<Integer> nummers = new ArrayList<>();
		Random generatorNumbers = new Random();
		int counter = 0;
		while(counter<=size-1) {
			nummers.add(counter, generatorNumbers.nextInt(100));
			counter++;
		}
		return nummers;
	}
	
	public static ArrayList<String> generateWeekDay() {
		String [] weekDays = {"Mo","Di","Mi","Do","Fr"};
		return new ArrayList<String>(Arrays.asList(weekDays));
	}
	
	public static void SetOdd(ArrayList<Integer> array) {
		for (Integer integer : array) {
			if(integer % 2 !=0) {
				array.set(array.indexOf(integer), 0);
			}
		}
	}
	
	public static void SetOddStream(ArrayList<Integer> array) {
		array.stream()
		 .map(e-> e%2!=0 ? 0 : e)
		 .collect(Collectors.toList())
		 .forEach(System.out::println);
	}
	
	public static void removeIfElement(ArrayList<Integer> array) {
		array.removeIf(e->e % 2 !=0);
		System.out.println(array);
	}
	
	
	public static Integer getElementByPosition(List<Integer> array,int position){
		return array.get(position);
	}
	
	
	
	public static void removeElementByPosition(ArrayList<Integer> array,int position) {
		array.remove(position);	
		System.out.println(array);
	}
	
	public static Integer getElementIndexOf(ArrayList<Integer> array) {
		Integer value = 0;
		for (Integer integer : array) {
			if(integer %2 !=0 && integer.equals(13)) {
				value= array.indexOf(integer);
			}else {
				value=-1;
			}
		}
		return value;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //A1
		System.out.println("-------------------A1---------------------");
		System.out.println(generateArray(20,100));
		System.out.println("-------------------A1---------------------");
		//A2
		System.out.println("-------------------A2---------------------");
		System.out.println(generateWeekDay());	
		System.out.println("-------------------A2---------------------");
		
		System.out.println("-------------------A3---------------------");
		Iterator<String> it = generateWeekDay().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------------A3---------------------");
		
	
		System.out.println("-------------------A4---------------------");
		System.out.println(getElementByPosition(Arrays.asList(10,20,30,40,50,60,70),2 ));
		System.out.println("-------------------A4---------------------");
		
		System.out.println("-------------------A5---------------------");
		List<Integer> listInteger =  Arrays.asList(10,20,30,40,50,60,70);
		Collections.reverse(listInteger);
		System.out.println(listInteger);
		System.out.println("-------------------A5---------------------");
		
		System.out.println("-------------------A6---------------------");
		List<Integer> listIntegerI =  Arrays.asList(100,25,19,60,10,80,440);
		Collections.sort(listIntegerI);
		System.out.println(listIntegerI);
		System.out.println("-------------------A6---------------------");
		
		
		System.out.println("-------------------A7---------------------");
		System.out.println(getElementIndexOf(generateArray(10, 50)));
		
		System.out.println("-------------------A7---------------------");
		
		
		System.out.println("-------------------A8---------------------");
		removeElementByPosition(generateArray(10, 50), 1);
		System.out.println("-------------------A8---------------------");
		
		
		System.out.println("-------------------A9---------------------");
		ArrayList<Integer> arrayA9 = generateArray(10, 50);
		removeIfElement(arrayA9);
		System.out.println("-------------------A9---------------------");
		
		System.out.println("-------------------A10---------------------");
		ArrayList<Integer> arrayA10 = generateArray(10, 50);
		SetOdd(arrayA10);
		System.out.println(arrayA10);
		System.out.println("-------------------A10---------------------");
		
		
		
		
	
		
	
	}

}
