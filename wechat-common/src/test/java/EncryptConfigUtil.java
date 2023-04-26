import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @author :tf
 * @create :2022/07/13
 * @desc :
 **/
public class EncryptConfigUtil {
    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("uap-dev");
        String pwd = encryptor.encrypt("cpcdb");
        System.out.println(pwd);
    }
}
