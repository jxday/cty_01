package com.test.java.entity;

import com.jxday.modules.DataStructure.String.string;
import lombok.Data;

//@Data
public enum day2 {
    
    one("zhouyi","z1"),
    two("zhouer","z2");

    private String py;
    private String jx;

    day2(String zhouyi, String z1) {
        
    }

    public String getPy() {
        return py;
    }

    public void setPy(String py) {
        this.py = py;
    }

    public String getJx() {
        return jx;
    }

    public void setJx(String jx) {
        this.jx = jx;
    }

    public String getpyfromjx(String jx){
        for (day2 d : day2.values()) {
            if (d.getJx() == jx) {
                return d.py;
            }
        }
        return null;
    }
}
