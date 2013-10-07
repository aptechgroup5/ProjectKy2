/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group5.onlinephamacy.Ultil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.BASE64Encoder;
/**
 *
 * @author Chung
 */
public class Encrypt {
    public static String EncrytPassword(String str)
    {
        String result="";
        try {
            MessageDigest messageDigest=MessageDigest.getInstance("MD5");
            byte [] encryptedText=messageDigest.digest(str.getBytes());
            BASE64Encoder encoder=new BASE64Encoder();
            result=encoder.encode(encryptedText);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Encrypt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
