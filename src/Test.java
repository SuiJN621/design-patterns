import java.math.BigDecimal;
import java.text.ParseException;

/**
 * @author Sui
 * @date 2018.12.20 10:11
 */
public class Test<T> implements Generic<String> {

    private T var;

    public static void main(String[] args) throws ParseException {

        BigDecimal bigDecimal = new BigDecimal("10E2");
        long l = bigDecimal.longValue();
        System.out.println(l);
    }
}
