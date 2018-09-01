import java.io.*;
import java.util.Scanner;

public class Array {
    static int[] am = {123, 113322};
    boolean timing (int a , int b) {
        int k = am[];
        int length = 0;
        int time = k;
        int newA[] = new int[length];
        int i = -1;
        int lenA = newA.length;
        int count = 0;
        int array[] = new int[lenA - count];
        int counter = 0;
        int index = 0;

        while (time > 0) {
            int c = time / 10;
            length++;
            time = c;
        }
        System.out.println("length " + length);


        while (k > 0) {
            int c = k % 10;
            i++;
            newA[i] = c;
            k = k / 10;
            System.out.println("newA " + newA[i]);
        }

        for (int ii = 0; ii < lenA - 1; ii++) {
            for (int j = ii + 1; j < lenA; j++) {
                if (newA[ii] > newA[j]) {
                    int temple = newA[ii];
                    newA[ii] = newA[j];
                    newA[j] = temple;
                }
            }
        }
        for (int j = 0; j < length; j++) {
            System.out.println("new newA " + newA[j]);

        }
        

        for (int ii = 0; ii < lenA - 1; ii++) {
            if (newA[ii] == newA[ii + 1]) {
                count++;
            }
        }
        System.out.println("count " + count);


        while (index < lenA - 1) {
            if (newA[index] != newA[index + 1]) {
                array[counter] = newA[index];
                counter++;
            }
            index++;
        }
        array[array.length - 1] = newA[lenA - 1];
        for (int init = 0; init < array.length; init++) {
            System.out.println("array " + array[init]);
        }

    }
        void solve (Scanner in, PrintWriter out){
            int n = in.nextInt();
            for (int i = 0; i < n ; i++){
                int a = in.nextInt();
                int b = in.nextInt();
                if (timing(a , b)){
                    out.println("yes");
                } else out.println("no");
            }

        }

       public void run(){
        try (
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out) {
                solve(in , out);
            }

        }

    public static void main(String[] args) {
    }
}
