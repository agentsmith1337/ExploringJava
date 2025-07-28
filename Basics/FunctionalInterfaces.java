import java.util.function.UnaryOperator;
@FunctionalInterface
interface bidder {
    int bid(int a,int b);
}
public class FunctionalInterfaces {
    public static void main(String[] args) {
        bidder mybid = (a,b)->(a>b)?a:b;
        System.out.println(mybid.bid(34,56));
        UnaryOperator<Integer> pos = Math::abs;
        System.out.println(pos.apply(-3));
    }
}
