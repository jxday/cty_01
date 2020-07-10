package com.jxday.testDetail;

import com.jxday.common.utils.ByteCharUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.zip.CRC32;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200604
 * @create 2020-06-04 13:49
 * @Version 1.0.0
 */
public class test20200604 {
    
    private static int count = 124;
    
    public static void main(String[] args) {
//        channelW("/Users/cty/工作文件/test.java","天不生我李淳罡，剑道万古如长夜");
        channelR("/Users/cty/工作文件/test.java");
    }

    public static void channelR(String fileName) {
        try (RandomAccessFile file = new RandomAccessFile(fileName, "rw")){
            FileChannel channel = file.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, 0, count);
            int length = (int)channel.size();
            LinkedList<Byte> list = new LinkedList<Byte>();
            for (int i = 0; i < length; i++) {
                byte b = map.get(i);
                if (Integer.valueOf(String.valueOf(b)) != 0){
                    list.add(b);
                }
            }
            byte[] bytes = new byte[list.size()];
            for (int i = 0; i < list.size(); i++) {
                bytes[i] = list.get(i);
            }
            char[] chars = ByteCharUtils.getChars(bytes);
            System.out.println(String.valueOf(chars));

        } catch (IOException e) {
            e.printStackTrace();
        }  
    }

    public static void channelW(String fileName,String content){
        try (RandomAccessFile file = new RandomAccessFile(fileName, "rw")){
            FileChannel channel = file.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, 0, count);
            byte[] bytes = content.getBytes();
            map.put(bytes);
            for (int i = 0; i < bytes.length; i++) {
                map.position(i);
                map.put(bytes[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
