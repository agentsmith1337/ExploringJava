
import java.util.Base64;

public class Base64EncodeDecode {
    public static void main(String[] args) {
        String con = Base64.getEncoder().encodeToString("Hello World".getBytes());
        System.out.println(new String(Base64.getDecoder().decode(con.getBytes())));
    }
}
