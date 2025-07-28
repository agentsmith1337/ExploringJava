
//Scope: Declaration, Insertion, Traversal, Deletion, Basic Manipulation 
public class ArrayBasics {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] numbers2 = new int[]{1,2,3,4,5}; //also valid
        int[] anotherNumbers = new int[23];
        anotherNumbers[0]=0;
        anotherNumbers[1]=1;
        for (int i=2; i<anotherNumbers.length; i++) {
            anotherNumbers[i]=anotherNumbers[i-1]+anotherNumbers[i-2];
        }
        for (int x: anotherNumbers) {
            System.out.print(x+" ");
        }
        System.out.println();
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]*anotherNumbers[i]+" ");
        }
        for (int i=0;i<numbers.length;i++) {
            numbers[i]=-1;
        }
        System.out.println();
        System.out.println("Array 'Numbers' is now clean"+" "+numbers[3]);
        for (int i=0; i<anotherNumbers.length; i++) {
            anotherNumbers[i]/=2; //Integer division by default 
        }
        for (int x: anotherNumbers) 
        System.out.print(x/3+" ");
    }
}
