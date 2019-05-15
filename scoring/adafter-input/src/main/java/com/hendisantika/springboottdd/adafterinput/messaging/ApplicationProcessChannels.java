package com.hendisantika.springboottdd.adafterinput.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-16
 * Time: 06:42
 */
public interface ApplicationProcessChannels {
    String APPLICATION_SUBMITTED = "applicationSubmittedIn";

    @Input
    SubscribableChannel applicationSubmittedIn();
}