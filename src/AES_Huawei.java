import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class AES_Huawei {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {

        String s = "hello world";
        Cipher cipher = Cipher.getInstance("AES");

        /* key from KeyGenerator */
//        KeyGenerator kgen = KeyGenerator.getInstance("AES");
//        kgen.init(128);
//        SecretKey key = kgen.generateKey();

        /* generate key manually */
        SecretKeySpec key = new SecretKeySpec("Aaahdhajsgvbdvss".getBytes(), "AES");

        /* init MODE for Cipher and use key*/
        cipher.init(Cipher.ENCRYPT_MODE,key);

        /* create encode message */
        byte[] bytes = cipher.doFinal(s.getBytes());

        /* show encoded message */
        System.out.print("AES encoded string is: ");
        for (byte b : bytes) {
            System.out.print(b);
        }


        Cipher decryptCipher = Cipher.getInstance("AES");
        decryptCipher.init(Cipher.DECRYPT_MODE,key);
        byte[] decryptedBytes = cipher.doFinal(s.getBytes());
        System.out.println();
        for (byte b : decryptedBytes) {
            System.out.print((char) b);
        }






    }
}

