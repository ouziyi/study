package com.cmpay.ozy;

import com.cmpay.lemon.common.LemonFramework;
import com.cmpay.lemon.framework.LemonBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;

/**
 * @author lihuiquan
 */
@LemonBootApplication(exclude = {RabbitAutoConfiguration.class}, value = {"com.cmpay.lhq"})
public class OzyApplication {
    public static void main(String[] args) {
        LemonFramework.run(OzyApplication.class, args);
    }
}
