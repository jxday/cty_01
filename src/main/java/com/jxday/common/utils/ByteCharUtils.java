package com.jxday.common.utils;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName ByteCharUtils
 * @create 2020-06-04 15:00
 * @Version 1.0.0
 */
public class ByteCharUtils {
    public static byte[] getBytes (char[] chars) {
        Charset cs = Charset.forName ("UTF-8");
        CharBuffer cb = CharBuffer.allocate (chars.length);
        cb.put (chars);
        cb.flip ();
        ByteBuffer bb = cs.encode (cb);
        return bb.array();
    }

    public static char[] getChars (byte[] bytes) {
        Charset cs = Charset.forName ("UTF-8");
        ByteBuffer bb = ByteBuffer.allocate (bytes.length);
        bb.put (bytes);
        bb.flip ();
        CharBuffer cb = cs.decode (bb);
        return cb.array();
    }
    
    public static byte getByte(char param) {
        char[] aaa = {param};
        byte[] bytes = getBytes(aaa);
        return bytes[0];
    }

    public static char getChar(byte param) {
        byte[] aaa = {param};
        char[] bytes = getChars(aaa);
        return bytes[0];
    }
}
