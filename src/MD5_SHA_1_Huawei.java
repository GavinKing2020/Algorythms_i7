import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class MD5_SHA_1_Huawei {


    private static final Random RANDOM = new SecureRandom();

    public static void main(String[] args) throws NoSuchAlgorithmException {


        String str = "hello world";
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        byte[] bytes = md5.digest(str.getBytes());
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bytes) {
            stringBuilder.append(String.format("%02X ", b));
        }
        System.out.println(stringBuilder.toString());
    }

    public static byte[] getNExtSalt() {
        /* create empty array for salt*/
        byte[] salt = new byte[16];
        /* generate strong random sequence from SecureRandom*/
        RANDOM.nextBytes(salt);
        /* return salt */
        return salt;
    }

}
