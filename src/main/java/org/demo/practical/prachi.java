package org.demo.practical;

public class prachi {
    private String says;

    public prachi(String says) {
        this.says = says;
    }

    public prachi() {
    }

    @Override
    public String toString() {
        return "prachi{" +
                "says='" + says + '\'' +
                '}';
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }
}
