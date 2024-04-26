package com.Exercise.exercise6;
import java.security.*;
/**
 *This file has code for creating signatures objects and verification module
 */

public class Key_signatures {
    // Method to sign a message using a private key
    public static byte[] sign(String message, PrivateKey privateKey) throws Exception {
        // Create a Signature object with the SHA256withRSA algorithm
        Signature signature = Signature.getInstance("SHA256withRSA");
        // Initialize the Signature object for signing with the provided private key
        signature.initSign(privateKey);
        // Update the Signature object with the bytes of the message
        signature.update(message.getBytes());
        return signature.sign();
    }
    // Method to verify a signature using a public key
    public static boolean verify(byte[] signatureBytes, String message, PublicKey publicKey) throws Exception {
        // Create a Signature object with the SHA256withRSA algorithm
        Signature signature = Signature.getInstance("SHA256withRSA");
        // Initialize the Signature object for verification with the provided public key
        signature.initVerify(publicKey);
        // Update the Signature object with the bytes of the message
        signature.update(message.getBytes());
        return signature.verify(signatureBytes);
    }
}
