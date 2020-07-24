package com.jxday.modules.DataStructure.BinarySearchTree;

import com.test.java.entity.Person;

import java.util.Objects;

/**
 * 〈平衡二叉树-单机版〉
 *
 * @author cty
 * @ClassName AVL
 * @create 2020-07-24 11:38
 * @Version 1.0.0
 */
public class AVL<E>{
    private transient final Comparable<E> comparable = null;
    
    public AVL(Object o) {
        //todo，集合框架是如何实现指定比较方式的        
    }

    public AVL(Comparable<E> comparable) {
        
    }

    private static class Node<E>{
        E item;
        Node<E> left;
        Node<E> right;
        Node<E> father;
        int Balancefactor;

        public Node(E item, Node<E> father) {
            this.item = item;
            this.father = father;
        }
    }

    public boolean remove(Object o) {
        
        return true;
    }

    public boolean add(E e) {
        
        return true; 
    }
    
    public int size(){
        return 0;
    }
}
