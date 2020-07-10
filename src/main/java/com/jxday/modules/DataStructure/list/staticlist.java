package com.jxday.modules.DataStructure.list;


import java.util.*;

/**
 * 〈静态链表〉 用数组描述的链表，即称为静态链表。在链表尾部新增插入，类比数组的尾插法。
 *
 * @author cty
 * @ClassName staticlist
 * @create 2020-01-16 11:06
 * @Version 1.0.0
 */
public class staticlist {
    public static void main(String[] args) {
        staticlist staticlist = new staticlist();
        staticlist.add("cty");
        staticlist.add("ldd");
        staticlist.add("yyf");
        staticlist.add("cty");
        System.out.println(staticlist.size());
        for (int i = 0; i < staticlist.size(); i++) {
            System.out.println(staticlist.get(i));
        }
    }
    public staticlist() {
        Data data = new Data();
        data.setCur(1);
        array[0] = data;
        for (int i = 1; i <= 10; i++) {
            curSet.add(i);
        }
    }

    //内置数组
    protected Data[] array = new Data[10];
    
    //内置数组长度
    private int arrayLength = 10;
    
    //内置数组长度
    private int length = 0;
    
    private int last = 0;
    
    //存储空余下标
    protected Set<Integer> curSet = new HashSet<Integer>();
    
    //结点类
    protected class Data{
        private String data;
        private int cur;

        public Data() {
        }

        private String getData() {
            return data;
        }

        private void setData(String data) {
            this.data = data;
        }

        private int getCur() {
            return cur;
        }

        private void setCur(int cur) {
            this.cur = cur;
        }
    }
    
    /**
     * @MethodName: get get方法
     * @Description: TODO
     * @Param: [i]    静态链表的下标   i + 1 结点 下寻 次数
     * @Return: java.util.Optional<java.lang.String>
     * @Author: cty
     * @Date: 2020-01-16
    **/
    private String get(int index){
        checkLength(index);
        Data data = getData(0);                          
        for (int i = 0; i < index + 1; i++) {
//                if (Objects.isNull(cur)){
//                    throw new RuntimeException("下标为{j - 1}的结点为最终结点");
//                }
            data = getData(data.getCur());
        }
        return data.getData();
    }
    
    /**
     * @MethodName: add
     * @Description: TODO
     * @Param: [param]
     * @Return: void
     * @Author: cty
     * @Date: 2020-01-16
    **/
    private void add(String param){
        if (!checkFree()){
            arrayExpand();
        }
        Integer index = getIndexFromCurset();
//        if (Objects.isNull(index)){
//            throw new RuntimeException();
//        }
        curSet.remove(index);
        Data data = new Data();
        data.setData(param);
        Data pre = getData(last);
        pre.setCur(index);
        setData(index,data);
        last = index;
        length ++;
    }
    
    /**
     * @MethodName: insert
     * @Description: TODO
     * @Param: [param, index]
     * @Return: void
     * @Author: cty
     * @Date: 2020-01-16
    **/
    private void insert(String param,int index){
        checkLength(index);
        Data pre = getData(0);
        for (int i = 0; i < index; i++) {
             pre = getData(pre.getCur());
        }
        Data data = new Data();
        data.setCur(pre.getCur());
        data.setData(param);
        Integer indexFromCurset = getIndexFromCurset();
        curSet.remove(indexFromCurset);
        setData(indexFromCurset,data);
        pre.setCur(indexFromCurset);
        length ++;
    }
    
    /**
     * @MethodName: delete
     * @Description: TODO
     * @Param: [index]
     * @Return: void
     * @Author: cty
     * @Date: 2020-01-16
    **/
    private void delete(int index){
        checkLength(index);
        Data pre = getData(0);
        for (int i = 0; i < index; i++) {
            pre = getData(pre.getCur());
        }
        setData(pre.getCur(),null);
        curSet.add(pre.getCur());
        length --;
        Data data = getData(pre.getCur());
        if (!Objects.isNull(data)){
            pre.setCur(data.getCur());
        }
    }
    
    /**
     * @MethodName: update
     * @Description: TODO
     * @Param: [param, index]
     * @Return: void
     * @Author: cty
     * @Date: 2020-01-16
    **/
    private void update(String param,int index){
        checkLength(index);
        Data data = getData(0);
        for (int i = 0; i < index + 1; i++) {
            data = getData(data.getCur());
        }
        data.setData(param);
    }
    
    /**
     * @MethodName: size
     * @Description: TODO
     * @Param: []
     * @Return: int
     * @Author: cty
     * @Date: 2020-01-16
    **/
    private int size(){
        return length;
    }

    protected Integer getIndexFromCurset() {
        Iterator<Integer> iterator = curSet.iterator();
        if (iterator.hasNext()){
            return iterator.next();
        }else {
            return null;
        }
    }

    //拓展array容量
    protected void arrayExpand() {
        Data[] data = new Data[arrayLength + 10];
        System.arraycopy(array,0,data,0,arrayLength);
        for (int i = arrayLength + 1; i <= arrayLength + 10; i++) {
            curSet.add(i);
        }
        arrayLength += 10;
        array = data;
    }

    protected boolean checkFree(){
        return length < arrayLength - 1;
    }
    
    //检查输入
    protected void checkLength(int i){
        if (Objects.isNull(i) || !(i < length) ||i < 0){
            throw new RuntimeException("数组越界");
        }
    }

    //检查数组长度
    protected boolean checkArrayLength(int i){
        return i < arrayLength - 1;
    }
    
    //根据索引获取内置数组的数据
    protected Data getData(int index){
        if (checkArrayLength(index)){
            return array[index];
        }else {
            return null;
        }
    }

    //根据索引内置数组的数据
    protected void setData(int index,Data data){
        if (checkArrayLength(index)){
            array[index] = data;
        }else {
            throw new RuntimeException();
        }
    }
}
