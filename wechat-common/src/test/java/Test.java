import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author :tf
 * @create :2022/08/11
 * @desc :
 **/
public class Test {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(11, 12, 13);
        int lenth = list1.size() + list2.size();
        List<Integer> result = new ArrayList<>();
        result.add(list1.get(0));
        for (int i = 1; i < lenth; i++) {
            if (i % 2 == 0) {
                result.add(list1.get(i / 2));
            } else {
                result.add(list2.get(i - (i / 2 + 1)));
            }
        }
        System.out.println("======================");
        result.forEach(obj -> {
            System.out.println(obj);
        });
    }
}
