/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pkg07;

/**
 *
 * @author Feri Winarta
 */
import java.util.Arrays;
public class ArrayMethod {
    public static void main(String[] args) {
        int data1[] = {1,2,3,4,5,6,7,8,9,10};  
//kalau kita mengakses secara indexing walaupin deklarasi dengan isi 9 itu tetap 8 karena
//dimulai dari 0
        int data2[] = new int[9];
//                ={1,2,3,4,5,6,7,8,9}
//                ={0,1,2,3,4,5,6,7,8);
//        
//        data2[8] = 9;
//        System.out.println(data2[8]);
//           copy dengan perulangan 
//        
        for(int i = 0; i < 9; i++) {
            data2[i] = data1[i];
        }
        System.out.println(data1);
        System.out.println(data2);
        System.out.println("Array - > " + Arrays.toString(data2));
        

//      method dari library array

//      copyOf                   (nama array, panjang);
        int data3[] = Arrays.copyOf(data1, 10);
        display(data3);
        System.out.println(data3[5]);
     
        
//        copyOfRange
        int data4[] = Arrays.copyOfRange(data1,4, 10);
        display(data4);
        
//mencetak pakai index jika nama array akan mencetak alamat, selain index bisa pakai
//library arrays.toString() - > sout, atau dengn for loop atau foreach;

//      fill
        float data5[] = new float[15];
        Arrays.fill(data5, 100);
        display(data5);
 
 
//      equals

        float data6[] = {1,2,3,4,5};
        float data7[] = {1,2,3,4,5};
        
            if(Arrays.equals(data6,data7)) {
                System.out.println(" benar");
            } else {
                System.out.println("Salah");
            }
            
//            compare
//        System.out.println(Arrays.compare);
//                mismatch
//            System.out.println(Arrays.mismatch(data6,data7));


//          search - > mencari index
            int dataa[] = {1,3,2,5,4,6,8,7,9,10};
            int dataaa[] = {1,2,3,4,5,6,7,8,9,10};
            
            int indx = Arrays.binarySearch(dataaa, 5);
            System.out.println("index -> " + indx);
            
//            sorting - > mengunakannya akan merubah index acak menjadi urut
            display(dataa);
            Arrays.sort(dataa);
            display(dataa);
           
    
            
      
        
    

      
    
        
 
            float dataArray1[] = {1,2,3};
            float dataArray2[] = new float[3];
            
            
        }
    private static void display(int dataArray[]) {
   
        System.out.println("Array - > " + Arrays.toString(dataArray));
    }
 
    private static void display(float dataArray[]) {
        System.out.println("Array - > " + Arrays.toString(dataArray));
    }
}
