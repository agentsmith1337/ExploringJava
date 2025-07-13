

public class StringMethods {
    public static void main(String[] args) {
        String LoremIpsum = "   Lorem Ipsum is simply dummy text of the printing and typesetting industry. ";
        String LoremIpsumSecondPart = "  Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
        //Most functions create a deepcopy of the string and return the modified string instead of modifying the string in action.
        System.out.println(LoremIpsum.length()+" "+LoremIpsum.trim().length());
        System.out.println(LoremIpsum.toLowerCase());
        System.out.println(LoremIpsumSecondPart.toUpperCase());
        System.out.println(LoremIpsum);
        
        //1 tab is a group of 4 spaces
        String JoinedIpsum = LoremIpsum.trim()+" "+LoremIpsumSecondPart.trim().concat(" ");
        System.out.println(JoinedIpsum);

        //A string out of the string pool
        String First = new String("Hello World");
        //Can be indexed as arrays but converted to arrays with .toCharArrays()
        System.out.println(First.charAt(0));
        System.out.println(First.charAt(2));
        System.out.println();
        //Character Arrays are mutable, and not C-style i.e. they do not have \0 at the end. They are count based. 
        char[] FirstStringAsCharArray = First.toCharArray(); 
        System.out.println(FirstStringAsCharArray[3]);
        FirstStringAsCharArray[5]='Z';
        //Can be printed like an Array. This can be used for some manipulation but StringBuilder and StringBuffer are more mutable. 
        System.out.println(FirstStringAsCharArray);
        //Can convert back to a string with String(char[]) 
        String Cheese = new String(FirstStringAsCharArray);
        System.out.println(Cheese.equals(" HelloZWorld ".trim()));

        //The String First can be sent to the String pool with .intern() function
        String FirstInPool = First.intern(); 
        //Notice that First is unaffected as it was declared earlier. 
        System.out.println(FirstInPool.equalsIgnoreCase("hello world")); 
        System.out.println(Cheese.equalsIgnoreCase("hellozworld"));
    
        //Substring Search, pattern matching and regex

    }
}
