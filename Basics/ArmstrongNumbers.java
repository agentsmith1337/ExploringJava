import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        // Scanner io = new Scanner(System.in);
        try (Scanner io = new Scanner(System.in)) {
        System.out.println("Please enter a number to test for Armstrong");
        int Number = io.nextInt();
        int CopyNum = Number;
        int[] Digits= new int[2];
        int DigitsSize = 2;
        int DigitsCount = 0, k=0;
        while (CopyNum!=0) {
            if(k==DigitsSize-1) {Digits=extendArray(Digits);DigitsSize*=2;}
            Digits[k++]=CopyNum%10;
            CopyNum/=10;
            DigitsCount++;
        }
        int Sum=0;
        for (int i=0; i<DigitsCount; i++) {
            Sum+=Math.pow(Digits[i],DigitsCount);
        }
        if (Sum==Number) System.out.println("Congratulations, You found a Armstrong Number!");
        else System.out.println("The number is not Armstrong.");
      } 
    }
    static int[] extendArray(int[] Arr) {
        int NewArr[] = new int[Arr.length*2];
        for (int i=0; i<Arr.length; i++) {
            NewArr[i]=Arr[i];
        }
        return NewArr;
    }
}
