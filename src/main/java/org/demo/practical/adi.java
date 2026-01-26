package org.demo.practical;

public class adi {
    private int age;
    private prachi bebo;

    @Override
    public String toString() {
        return "adi{" +
                "age=" + age +
                ", bebo=" + bebo +
                '}';
    }

    public adi() {
    }

    public adi(int age, prachi bebo) {
        this.age = age;
        this.bebo = bebo;
    }

    public prachi getBebo() {
        return bebo;
    }

    public void setBebo(prachi bebo) {
        this.bebo = bebo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
