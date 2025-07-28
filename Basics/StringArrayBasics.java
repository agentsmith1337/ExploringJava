import java.util.Scanner;
public class StringArrayBasics {
    public static void main(String[] args) {
        String[] Names = new String[5];
        Scanner io = new Scanner(System.in);
        
        for (int i=0; i<Names.length; i++) {
            System.out.println("Please Enter Name "+i+": ");
            Names[i]=io.nextLine();
        }
        int size=5;
        String choice;
        do {
        System.out.println("Do you want to add more? Yes/No");
        choice = io.nextLine();
        if (choice.equals("Yes")) {
            size*=2;
            String[] MoreNames=new String[size];
            for (int i=0; i<Names.length; i++) {
                MoreNames[i]=Names[i];
            }
            int start=Names.length;
            Names=MoreNames;
            for (int i=start; i<Names.length; i++) {
                System.out.print("Please Enter Name "+i+": ");
                Names[i]=io.nextLine();
                if (Names[i].equals("")) {
                    for(int j=i; j<Names.length; j++) Names[j]="";
                    break;
                }
            }
        } 
    } while (choice.equals("Yes"));
        io.close();
    for (String x: Names) {
        System.out.print(x+" ");
    }
}
}
