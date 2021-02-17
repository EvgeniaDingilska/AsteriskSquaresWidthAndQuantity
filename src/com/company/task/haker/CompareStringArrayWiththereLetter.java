package com.company.task.eight;
/*Stars. You need to insert M and N, and after that, in the console, you need to have N squares, every side of a square need to have M
asterisk. (M> 2, N>0)
Examples:
M=5 and N= 3*/
import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class PrintATriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write the number N: ");
        int numberN = scan.nextInt();
        System.out.println("Please write the number M: ");
        int numberM = scan.nextInt();
        int sum = numberM*numberN;


        for (int i = 1; i<=numberM; i++){
            for (int j = 1; j<=numberM*numberN-numberN+1; j++){
                if(i==1 || i==numberM || j==numberM || j==1 ||j%(numberM-1)==1 && j>numberM){
                    System.out.print("*"+" ");

                }else {
                    System.out.print("  ");
                }
                

                }
            System.out.println();
            }

        }
    }


