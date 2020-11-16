package com.jxday.desingnPattern.PrototypePattern;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import lombok.SneakyThrows;

import java.io.*;

/**
 * 〈    使用流的方式，对实现了@Serializable的对象进行深拷贝    〉
 *
 * @author 汤仁杰
 * @ClassName Note
 * @create 2020-11-16 13:51
 * @Version 1.0.0
 */
public class Note implements Cloneable, Serializable {
    private String name;
    private String subject;
    private FaceBook faceBook;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public FaceBook getFaceBook() {
        return faceBook;
    }

    public void setFaceBook(FaceBook faceBook) {
        this.faceBook = faceBook;
    }
    
    @SneakyThrows
    @Override
    public Note clone(){
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bai);
        return (Note)ois.readObject();
    }
}
