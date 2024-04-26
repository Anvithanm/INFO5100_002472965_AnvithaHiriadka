package com.Exercise.exercise6;
/**
 *This file has code for Decryption for Symmetric and Asymmetric case
 */
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;

public class Decrypt_message {
    //Symmetric decryption method
    public static String symmetric_decrypt_info(byte[] ciphertext, SecretKey key, byte[] iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(128, iv);
        cipher.init(Cipher.DECRYPT_MODE, key, gcmParameterSpec);
        byte[] decryptedBytes = cipher.doFinal(ciphertext);
        return new String(decryptedBytes);
    }
    //asymmetric decryption method
    public static String asymmetric_decrypt_info(byte[] ciphertext, KeyPair keyPair) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE, keyPair.getPrivate());
        byte[] decryptedBytes = cipher.doFinal(ciphertext);
        return new String(decryptedBytes);
    }
}
