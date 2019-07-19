package com.jourwon.designpattern.creational.prototype;

/**
 * Description:创建一个实现了 Clonable 接口的抽象类。
 *
 * @author JourWon
 * @date 2019/7/15 10:16
 */
public abstract class Shape implements Cloneable {

    private String id;

    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
