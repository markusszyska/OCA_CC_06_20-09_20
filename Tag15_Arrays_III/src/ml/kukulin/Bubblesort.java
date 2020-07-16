package ml.kukulin;

public class Bubblesort {
	

    public int[] sort(int[] intArr) {
        int k;
        for (int i = 0; i < intArr.length - 1; i++) {
            if (intArr[i] < intArr[i + 1]) {
                continue;
            }
            k = intArr[i];
            intArr[i] = intArr[i + 1];
            intArr[i + 1] = k;
            sort(intArr);
        }
        return intArr;
    }

   
}

