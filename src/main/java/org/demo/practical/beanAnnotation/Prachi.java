package org.demo.practical.beanAnnotation;

import org.springframework.stereotype.Component;


@Component
public class Prachi {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Prachi(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Prachi{" +
                "job='" + job + '\'' +
                '}';
    }
}
