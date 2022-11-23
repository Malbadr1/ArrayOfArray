import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

fillArray();

    }

    public static void fillArray(){
        Scanner input=new Scanner(System.in);
        System.out.println("inter numbers of rows");

        int row=input.nextInt();
        System.out.println("inter numbers of columns");
        int column=input.nextInt();
        int [][]arr=new int[row][column];


        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.println("enter value of row NO:"+i+1+"enter value of column NO:"+j+1);
              arr[i][j]= input.nextInt();

            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(arr[i][j]);

            }
            System.out.println();
        }
        }

    }
