import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;

public class RSA_Huawei {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        String s = "hello world";

        Cipher cipher = Cipher.getInstance("RSA");

        KeyPairGenerator pairgen = KeyPairGenerator.getInstance("RSA");
        KeyPair keyPair = pairgen.generateKeyPair();
        Key publicKey = keyPair.getPublic();
        Key privateKey = keyPair.getPrivate();

        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] bytes = cipher.doFinal(s.getBytes());
        for (byte b : bytes){
            System.out.print(b);
        }

        System.out.println("\n");

        Cipher decryptCipher = Cipher.getInstance("RSA");
        decryptCipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = decryptCipher.doFinal(bytes);

        for (byte b : decryptedBytes ) {
            System.out.print(b);
        }
    }
}
