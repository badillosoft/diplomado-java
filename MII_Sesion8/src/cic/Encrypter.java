package cic;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class Encrypter {
    
    public static String encrypt(String message, String password) {
        try {
            IvParameterSpec iv = new IvParameterSpec("RandomInitVector".getBytes("UTF-8"));

            SecretKeySpec secret = new SecretKeySpec(password.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");

            cipher.init(Cipher.ENCRYPT_MODE, secret, iv);

            byte[] encrypted = cipher.doFinal(message.getBytes());

            String encMessage = Base64.encodeBase64String(encrypted);

            System.out.println("encrypted string: " + encMessage);

            return encMessage;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static String decrypt(String encMessage, String password) {
        try {
            IvParameterSpec iv = new IvParameterSpec("RandomInitVector".getBytes("UTF-8"));
            
            SecretKeySpec secret = new SecretKeySpec(password.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            
            cipher.init(Cipher.DECRYPT_MODE, secret, iv);

            byte[] original = cipher.doFinal(Base64.decodeBase64(encMessage));

            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        String message = "Hola este es un mensaje secreto :D";
        
        String encMessage = encrypt(message, "1234567890ABCDEF");
       
        String decMessage = decrypt(encMessage, "1234567890ABCDEF");
        
        System.out.printf("Mensaje Original: %s\nMensaje Encriptado: %s\nMensaje Desencriptado: %s\n",
                message, encMessage, decMessage);
    }
}