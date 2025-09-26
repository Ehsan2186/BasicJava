import java.util.Scanner;
public class MaxMinArray{
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] data = new int[size];
            System.out.println("Enter the array datas:");
            for(int i=0;i<data.length;i++) {
                data[i] = scan.nextInt();
            }
            int max=0,min =data[0];
            for (int datum : data) {//using enhanced for loop
                if (max < datum) {
                    max = datum;
                }
                if (min > datum) {
                    min = datum;
                }
            }
            System.out.printf("max:%d,min:%d",max,min);
        }
    }

