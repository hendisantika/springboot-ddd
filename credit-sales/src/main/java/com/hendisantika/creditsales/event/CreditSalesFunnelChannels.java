package com.hendisantika.creditsales.event;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-01
 * Time: 18:26
 */
public interface CreditSalesFunnelChannels {

    @Output
    MessageChannel creditApplicationSubmittedOut();

}