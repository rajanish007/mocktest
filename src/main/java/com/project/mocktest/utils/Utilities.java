package com.project.mocktest.utils;

import java.util.Base64;

public class Utilities {

    public static String Base64decode(String encodedString) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodedByte = decoder.decode(encodedString);
        return new String(decodedByte);
    }

    public static String Bas64encode(String string) {
        Base64.Encoder encoder = Base64.getEncoder();
        String encodedString = encoder.encodeToString(string.getBytes());
        return encodedString;
    }
}
