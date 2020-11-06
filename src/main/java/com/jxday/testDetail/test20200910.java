package com.jxday.testDetail;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200910
 * @create 2020-09-10 17:20
 * @Version 1.0.0
 */
public class test20200910 {

    /**  -Dcom.sun.management.jmxremote
     * VM参数
     * 
     * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
     * 
     * 分配allocation4对象的语句时会发生一次Minor GC，这次回收的结果是新生代6651KB变为148KB，而总内存占用量则几乎没有减少（因为allocation1、2、3三个对象都是存活的，虚拟机几乎没有找到可回收的对象）。产生这次垃圾收集的原因是为allocation4分配内存时，发现Eden已经被占用了6MB，剩余空间已不足以分配allocation4所需的4MB内存，因此发生MinorGC。垃圾收集期间虚拟机又发现已有的三个2MB大小的对象全部无法放入Survivor空间（Survivor空间只有1MB大小），所以只好通过分配担保机制提前转移到老年代去。
     */

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] b1,b2,b3,b4;
        b1 = new byte[2 * _1MB];
        b2 = new byte[2 * _1MB];
        b3 = new byte[2 * _1MB];
        b4 = new byte[4 * _1MB];

//        System.out.println(111);
        System.gc();
    }
}
