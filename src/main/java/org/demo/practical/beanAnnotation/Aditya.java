package org.demo.practical.beanAnnotation;

import org.springframework.stereotype.Component;


@Component
public class Aditya {
    private Prachi prachi;

    public Prachi getPrachi() {
        return prachi;
    }

    public void setPrachi(Prachi prachi) {
        this.prachi = prachi;
    }

    public Aditya(Prachi prachi) {
        this.prachi = prachi;
    }

    @Override
    public String toString() {
        return "Aditya{" +
                "prachi=" + prachi +
                '}';
    }
}
