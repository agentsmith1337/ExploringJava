import java.util.function.BiFunction;

@FunctionalInterface
interface IsNotNull<T> {
    boolean check(T t);
}


public class FunctionalInterfaces {
    public static void main(String[] args) {
    IsNotNull<String> StringNotNull = str -> (str!=null);
    String sentence = "This is not an empty string";
    String anotherSentence = "This is not an empty string";
    BiFunction<String,String,Boolean> IsSameReference = (__str_1,__str_2) -> (__str_1==__str_2);    
    System.out.println(StringNotNull.check(sentence));
    System.out.println(IsSameReference.apply(sentence,anotherSentence));
    sentence=null;
    System.out.println(StringNotNull.check(sentence));
    }
}
