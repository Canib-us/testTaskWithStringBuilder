package org.itk.testtaskwithstringbuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestTaskWithStringBuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestTaskWithStringBuilderApplication.class, args);

        StringBuilder sb = new StringBuilder("Hello World");
        CustomStringBuilder csb = new CustomStringBuilder(sb);

        System.out.println(csb);

        csb.append(", first append");
        System.out.println(csb);

        csb.delete(18, 24);
        System.out.println(csb);

        csb.undo();
        System.out.println(csb);

        csb.undo();
        System.out.println(csb);
    }

}
