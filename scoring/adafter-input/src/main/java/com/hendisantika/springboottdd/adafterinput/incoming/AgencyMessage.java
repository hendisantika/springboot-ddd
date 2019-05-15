package com.hendisantika.springboottdd.adafterinput.incoming;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-16
 * Time: 06:36
 */
public class AgencyMessage {
    private String key;
    private String messageText;

    AgencyMessage(String key, String messageText) {
        this.key = key;
        this.messageText = messageText;
    }

    public String getKey() {
        return key;
    }

    public String getMessageText() {
        return messageText;
    }
}
