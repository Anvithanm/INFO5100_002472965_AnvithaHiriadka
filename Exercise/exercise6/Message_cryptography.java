package com.Exercise.exercise6;
/**
========================================================================================================================
Author = Anvitha Hiriadka
Submitted on 04/26/2024
========================================================================================================================
* This Exercise6 is about message cryptography
* This has demonstration of both Symmetric and Asymmetric encryption and decryption of message sent between Alice and Bob
* Two objects, Alice and Bob are created.
* For Symmetric:
 * Used AES-256 encryption with AES/GCM/NoPadding cipher
* For Asymmetric:
 * Use RSA-2048 encryption RSA/ECB/PKCS1Padding
 * demonstrated the signing of message and validating the signature using RSA-2048 keys between Alice and Bob
 */
//Importing the necessary library
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
import java.util.Base64;
public class Message_cryptography {
    public static void main(String[] args) throws Exception{
        //Generating a random 256 bit AES key
        byte[] aes_key_bytes = new byte[32];
        SecureRandom random = new SecureRandom();
        random.nextBytes(aes_key_bytes);
        SecretKey aes_key = new SecretKeySpec(aes_key_bytes, "AES");

        //Creating initialization vector(IV)
        // 12 bytes IV for GCM
        byte[] iv = new byte[12];
        random.nextBytes(iv);

        // Generate RSA key pair with key size of 2048 bits
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(2048);
        KeyPair keyPair = keyPairGen.generateKeyPair();

        System.out.println("**********************This is Symmetric Encryption and Decryption**********************");
        // Alice sending a message to Bob - Symmetric Encryption
        String message = "Hello Bob, this is a secret message.";
        System.out.println("Original message from Alice: " + message);
        byte[] encryptedMessage = Encrypt_message.symmetric_encrypt_info(message, aes_key, iv);
        System.out.println("Encrypted message sent from Alice to Bob: " + Base64.getEncoder().encodeToString(encryptedMessage));

        // Bob receives the message and decrypts it
        String decryptedMessage = Decrypt_message.symmetric_decrypt_info(encryptedMessage, aes_key, iv);
        System.out.println("Decrypted message received by Bob: " + decryptedMessage);

        System.out.println("_________________________________________________________________________");
        System.out.println("**********************This is Asymmetric Encryption and Decryption**********************");
        // Alice encrypts a message for Bob using Asymmetric Encryption
        String secret_message = "Hello Bob, This is a confidential information-12345!!!!";
        System.out.println("Message2 from Alice: " + secret_message);
        byte[] encryptedBytes = Encrypt_message.asymmetric_encrypt_info(secret_message, keyPair);
        // Alice signs the message
        String messageToSign = "This message is signed by Alice.";
        byte[] signature = Key_signatures.sign(messageToSign, keyPair.getPrivate());

        System.out.println("Asymmetric Encrypted message sent from Alice to Bob: " + Base64.getEncoder().encodeToString(encryptedBytes));

        // Bob decrypts the message from Alice
        String decrypted_message = Decrypt_message.asymmetric_decrypt_info(encryptedBytes, keyPair);
        System.out.println("Decrypted message by Bob: " + decrypted_message);

        // Bob verifies the signature
        boolean isVerified = Key_signatures.verify(signature, messageToSign, keyPair.getPublic());
        System.out.println("Signature verified by Bob: " + isVerified);
        if (isVerified) {
            System.out.println("Signature is valid.");
        } else {
            System.out.println("Signature is NOT valid.");
        }
    }
}
