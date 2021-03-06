package algo;
import ds.Arrys;

public class Sortings {

    public static void main(String []args){
        int a[] = {5,3,4,1,2,5};
        //bubbleSort(a);
        //insertSort(a);
        //selectionSort(a);
        countSort(a);
        Arrys.printArray(a);
    }

    public static void bubbleSort(int []a) {
        for(int i = 0; i< a.length; i++){
            for(int j=0; j<a.length-1; j++){
                if(a[j] > a[j+1]){
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                }
            }
        }
    }

    public static void insertSort(int []a){
        for(int i =0; i<a.length;i++){
            int key = a[i];
            int j = i-1;
            while (j >=0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }

    public static void selectionSort(int []a){
        for(int i=0; i< a.length;i++){
            int minIndex = i;
            for(int j=i+1; j<a.length;j++){
                if(a[j] < a[minIndex])
                    minIndex = j;
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }

    //Assuming max number is 100
    public static void countSort(int []a){
        int count[]= new int[100];
        for(int i = 0; i< a.length; i++){
          count[a[i]]++;
        }
        int i = 0, j = 0;
        while(i < a.length) {
            int c = count[j];
            while(c-- > 0)
                a[i++] = j;
            j++;
        } 
    }
}