import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author :tf
 * @create :2022/06/11
 * @desc : 统计代码行数
 **/
public class CountCode {

    public static void main(String[] args) throws IOException {

        File root = new File("D:\\work\\channel-user-authentication");
        showAllFiles(root);
        System.out.println(n);

    }

    static int n;

    final static void showAllFiles(File dir) throws IOException {
        File[] fs = dir.listFiles();
        for (int i = 0; i < fs.length; i++) {
            if (fs[i].getAbsolutePath().endsWith(".java")) {
                System.out.println(fs[i].getAbsolutePath());
                List<String> str = FileUtils.readLines(fs[i].getAbsoluteFile(), "UTF-8");
                for (String s : str
                ) {
                    n++;
                }
            }
            if (fs[i].isDirectory()) {
                showAllFiles(fs[i]);
            }
        }
    }
}
