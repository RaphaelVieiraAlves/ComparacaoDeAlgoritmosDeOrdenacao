import ordenacao.BubbleSort;
import ordenacao.InsertionSort;
import ordenacao.MergeSort;

import java.util.Random;

public class Programa {    
    public static float mediaArray(long[] arr) {
        long soma = 0;
 
        for (int i = 0; i < arr.length; i++) {
        	soma += arr[i];
        }
 
        float average = Math.floorDiv(soma, arr.length);
        
        return average;
    }
        
    public static int[] colocarArrayDecrescente(int[] array)
    {
  
        int n = array.length;
  

        for (int i = 0; i < n / 2; i++) {
  

            int temp = array[i];
  

            array[i] = array[n - i - 1];
  

            array[n - i - 1] = temp;
        }
        
        return array;
    }
    
    public static void main(String[] args) {
    	    			
    	long[] tmpC1IS = new long[5];
    	long[] tmpC1MS = new long[5];
    	long[] tmpC1BS = new long[5];
    	
    	long[] tmpC2IS = new long[5];
    	long[] tmpC2MS = new long[5];
    	long[] tmpC2BS = new long[5];
    	
    	long[] tmpC3IS = new long[5];
    	long[] tmpC3MS = new long[5];
    	long[] tmpC3BS = new long[5];
    	
        int low = 10;
        int high = 10000000;
    	
    	for(int i = 0; i < 5; i++) {
            int[] A = new int[10000];
            Random r = new Random();
            InsertionSort is;
            MergeSort ms;
            BubbleSort bs;
            for (int i1 = 1; i1 < A.length; i1++) {
                A[i1] = r.nextInt(high - low) + low;
            }

            is = new InsertionSort(A.clone());
            ms = new MergeSort(A.clone());
            bs = new BubbleSort(A.clone());
            long startTime = System.currentTimeMillis();
            is.sort();
            long totalTime = System.currentTimeMillis() - startTime;
            tmpC1IS[i] = totalTime;
            startTime = System.currentTimeMillis();
            ms.sort(0, (A.length - 1));
            totalTime = System.currentTimeMillis() - startTime;
            tmpC1MS[i] = totalTime;
            startTime = System.currentTimeMillis();
            bs.sort();
            totalTime = System.currentTimeMillis() - startTime;
            tmpC1BS[i] = totalTime;
    	}
    	for(int i = 0; i < 5; i++) {
            int[] A = new int[10000];
            int[] aOrdenado = new int[10000];
            Random r = new Random();
            InsertionSort is;
            MergeSort ms;
            BubbleSort bs;
            for (int i1 = 1; i1 < A.length; i1++) {
                A[i1] = r.nextInt(high - low) + low;
            }
            
            ms = new MergeSort(A.clone());
            ms.sort(0, A.length - 1);
            
            aOrdenado = ms.getVector();

            is = new InsertionSort(aOrdenado.clone());
            ms = new MergeSort(aOrdenado.clone());
            bs = new BubbleSort(aOrdenado.clone());
            long startTime = System.currentTimeMillis();
            is.sort();
            long totalTime = System.currentTimeMillis() - startTime;
            tmpC2IS[i] = totalTime;
            startTime = System.currentTimeMillis();
            ms.sort(0, (aOrdenado.length - 1));
            totalTime = System.currentTimeMillis() - startTime;
            tmpC2MS[i] = totalTime;
            startTime = System.currentTimeMillis();
            bs.sort();
            totalTime = System.currentTimeMillis() - startTime;
            tmpC2BS[i] = totalTime;
    	}
    	for(int i = 0; i < 5; i++) {
            int[] A = new int[10000];
            int[] aDecresente = new int[10000];
            Random r = new Random();
            InsertionSort is;
            MergeSort ms;
            BubbleSort bs;
            for (int i1 = 1; i1 < A.length; i1++) {
                A[i1] = r.nextInt(high - low) + low;
            }
            
            ms = new MergeSort(A.clone());
            ms.sort(0, A.length - 1);
            
            aDecresente = ms.getVector();
            
            aDecresente = colocarArrayDecrescente(aDecresente);
            
            is = new InsertionSort(aDecresente.clone());
            ms = new MergeSort(aDecresente.clone());
            bs = new BubbleSort(aDecresente.clone());
            long startTime = System.currentTimeMillis();
            is.sort();
            long totalTime = System.currentTimeMillis() - startTime;
            tmpC3IS[i] = totalTime;
            startTime = System.currentTimeMillis();
            ms.sort(0, (aDecresente.length - 1));
            totalTime = System.currentTimeMillis() - startTime;
            tmpC3MS[i] = totalTime;
            startTime = System.currentTimeMillis();
            bs.sort();
            totalTime = System.currentTimeMillis() - startTime;
            tmpC3BS[i] = totalTime;
    	}

    	    	
    	System.out.println("cenario 1");
    	System.out.println("Média insertion sort time: " + mediaArray(tmpC1IS));
    	System.out.println("Média mergesort time: " +  mediaArray(tmpC1MS));
    	System.out.println("Média bubbleSort time: " +  mediaArray(tmpC1BS) );
    	
    	System.out.println("cenario 2");
    	System.out.println("Média insertion sort time: " + mediaArray(tmpC2IS));
    	System.out.println("Média mergesort time: " +  mediaArray(tmpC2MS));
    	System.out.println("Média bubbleSort time: " +  mediaArray(tmpC2BS) );
    	
    	System.out.println("cenario 3");
    	System.out.println("Média insertion sort time: " + mediaArray(tmpC3IS));
    	System.out.println("Média mergesort time: " +  mediaArray(tmpC3MS));
    	System.out.println("Média bubbleSort time: " +  mediaArray(tmpC3BS) );
    	
    }
}