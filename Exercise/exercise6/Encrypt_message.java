package com.Exercise.exercise6;
/**
 *This file has code for Encryption for Symmetric and Asymmetric case
 */
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;

public class Encrypt_message {
    //Encryption method for symmetric encryption
    public static byte[] symmetric_encrypt_info(String plaintext, SecretKey key, byte[] iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(128, iv);
        cipher.init(Cipher.ENCRYPT_MODE, key, gcmParameterSpec);
        byte[] ciphertext = cipher.doFinal(plaintext.getBytes());
        return ciphertext;
    }
    //Encryption for asymmetric encryption
    public static byte[] asymmetric_encrypt_info(String plaintext, KeyPair keyPair) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());
        return cipher.doFinal(plaintext.getBytes());
    }
}
