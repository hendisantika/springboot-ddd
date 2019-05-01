package com.hendisantika.springbootddd.creditagency.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-02
 * Time: 06:26
 */
public interface CreditAgencyChannels {
    String APPLICATION_SUBMITTED = "applicationSubmittedIn";

    @Input
    SubscribableChannel applicationSubmittedIn();
}