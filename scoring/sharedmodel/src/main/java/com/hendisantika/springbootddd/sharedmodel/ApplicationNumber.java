package com.hendisantika.springbootddd.sharedmodel;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-25
 * Time: 06:39
 */
public class ApplicationNumber {
    private String applicatioNumber;

    public ApplicationNumber(String applicatioNumber) {
        this.applicatioNumber = applicatioNumber;
    }

    @Override
    public String toString() {
        return applicatioNumber;
    }
}
