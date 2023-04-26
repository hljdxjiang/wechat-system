import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class ExpressionTest {


    private static final JexlEngine engine = new JexlBuilder().cache(256).strict(true).silent(false).create();

    public static void main(String[] args) {
        /*DecimalFormat format = new DecimalFormat("#,###.##");
        System.out.println(format.format(0.001));
        System.out.println(format.format(0.100));
        System.out.println(format.format(0.1));
        System.out.println(format.format(1));
        System.out.println(format.format(10));
        System.out.println(format.format(100));
        System.out.println(format.format(1000));
        System.out.println(format.format(10000));
        System.out.println(format.format(100000));
        System.out.println(format.format(1000000));*/
        //test();
        //jexl();
        List<String> limits = Arrays.asList("62", "622", "622630");
        List<String> cerNos = Arrays.asList("622630199212271355", "612620229212271355", "611630199212271355");
        for (String cerNo : cerNos) {
            limits.stream().anyMatch(obj -> StringUtils.containsOnly(cerNo, obj));
        }
        //System.out.println(StringUtils.containsOnly("622630199212271355", "62"));
        System.out.println(StringUtils.contains("622630199212271355", "62"));
        //System.out.println(StringUtils.contains("622622199212271355", 1));
        System.out.println(StringUtils.containsAny("611630199212271355", "62", "622630", "92"));
        //System.out.println(StringUtils.containsNone("622630199212271355", "62"));

    }

    public static void jexl() {
        JexlExpression exp = engine.createExpression("principal*rate*(owner-cycle*(owner/cycle))/(360*100)");
        MapContext jexlContext = new MapContext();
        jexlContext.set("principal", new BigDecimal(100000));
        jexlContext.set("rate", new BigDecimal(0.45));
        jexlContext.set("owner", new BigDecimal(31));
        jexlContext.set("cycle", new BigDecimal(31));
        Object one = exp.evaluate(jexlContext);
        Callable<Object> two = exp.callable(jexlContext);
        String parsedText = exp.getParsedText();
        String sourceText = exp.getSourceText();
        System.out.println("one:" + one);
        System.out.println("parsedText:" + parsedText);
        System.out.println("sourceText:" + sourceText);
    }

    public static void test() {
        BigDecimal DAYS = new BigDecimal(31);
        BigDecimal decimal = new BigDecimal(7);
        BigDecimal divide = DAYS.divide(decimal, 2);
        System.out.println("defalut: " + divide);
        BigDecimal divide1 = DAYS.divide(decimal, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("ROUND_HALF_UP: " + divide1);
        BigDecimal divide2 = DAYS.divide(decimal, 2, BigDecimal.ROUND_HALF_DOWN);
        System.out.println("ROUND_HALF_DOWN: " + divide2);
        BigDecimal divide3 = DAYS.divide(decimal, 2, BigDecimal.ROUND_CEILING);
        System.out.println("ROUND_CEILING: " + divide3);
        BigDecimal divide4 = DAYS.divide(decimal, 2, BigDecimal.ROUND_DOWN);
        System.out.println("ROUND_DOWN: " + divide4);
        BigDecimal divide5 = DAYS.divide(decimal, 2, BigDecimal.ROUND_FLOOR);
        System.out.println("ROUND_FLOOR: " + divide5);
        BigDecimal divide6 = DAYS.divide(decimal, 2, BigDecimal.ROUND_HALF_EVEN);
        System.out.println("ROUND_HALF_EVEN: " + divide6);
       /* BigDecimal divide7 = DAYS.divide(decimal,2, BigDecimal.ROUND_UNNECESSARY);
        System.out.println(divide7);*/
        BigDecimal divide8 = DAYS.divide(decimal, 2, BigDecimal.ROUND_UP);
        System.out.println("ROUND_UP: " + divide8);
    }


}
