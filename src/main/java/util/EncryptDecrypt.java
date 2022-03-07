package util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EncryptDecrypt {
	static Cipher cipher;
	static SecretKey keySpec;
	static IvParameterSpec ivSpec;
	
	static {
		try {
			cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			keySpec = new SecretKeySpec("5294y06JbISpM5x9".getBytes(), "AES");
			ivSpec = new IvParameterSpec("v77hoKGq4kWxNNIS".getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    public static String encrypt(String input) throws Exception {
//    	input = URLEncoder.encode(input, "UTF-8");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
        byte[] i = cipher.doFinal(input.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(i);
    }
    
    public static String decrypt(String input) throws Exception {
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
        byte[] i = cipher.doFinal(Base64.getDecoder().decode(input));
        return new String(i, StandardCharsets.UTF_8);
    }
}
