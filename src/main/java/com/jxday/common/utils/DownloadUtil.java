package com.jxday.common.utils;

import java.io.*;

/**
 * 〈多线程复制文件〉
 *
 * @author cty
 * @ClassName test20200604
 * @create 2020-06-04 11:23
 * @Version 1.0.0
 * 
 * https://blog.csdn.net/wen_284334906/article/details/77338213?utm_medium=distribute.pc_relevant.none-task-blog-baidujs-2
 */
public class DownloadUtil {

    private File src;// 源文件
    private File dst;// 目标文件
    private int threadNum;// 线程数量
    
    public DownloadUtil(File src, File dst, int threadNum) {
        super();
        this.src = src;
        this.dst = dst;
        this.threadNum = threadNum;
    }

    // 开启多线程下载
    public void download() {
        // 循环开多个线程
        for (int i = 0; i < threadNum; i++) {
            DownloadThread thread = new DownloadThread(i);
            thread.setName("线程" + (i + 1));
            thread.start();
        }
    }

    // 定义一个下载线程
    class DownloadThread extends Thread {
        // private int index；/表示第几个线程
        // 每一个线程要下载的文件大小
        // 如果不能平方，则每一份+1，确保下载完整个文件
        private long BlockSize = src.length() % threadNum == 0 ? src.length() / threadNum
                : src.length() / threadNum + 1;
        // 起始位置
        private long startPos;

        public DownloadThread(int index) {
            // this。index = index;
            // 计算初始位置
            startPos = BlockSize * index;
        }

        public void run() {
            super.run();
            try {
                // 要读入的文件
                RandomAccessFile rafR = new RandomAccessFile(src, "r");
                // 要写入的文件
                RandomAccessFile rafW = new RandomAccessFile(dst, "rw");
                rafR.seek(startPos);
                rafW.seek(startPos);
                int bufSize = 1024 * 1024;// 缓冲区大小
                byte[] buf = new byte[bufSize];// 缓冲区
                int len = -1;
                do {
                    len = (int) (BlockSize > bufSize ? bufSize : BlockSize);
                    rafR.read(buf, 0, len);
                    rafW.write(buf, 0, len);
                    BlockSize -= len;
                    System.out.println(Thread.currentThread().getName() + "读取了" + len + "字节");
                } while (BlockSize > 0);
                rafR.close();
                rafW.close();
                System.out.println(Thread.currentThread().getName() + "下载完毕");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    } 
}
