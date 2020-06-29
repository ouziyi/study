package com.cmpay.ozy.auth;

import com.cmpay.lemon.framework.autoconfigure.security.SecurityProperties;
import com.cmpay.lemon.framework.security.auth.GenericAuthenticationFilter;
import com.cmpay.lemon.framework.web.filter.TradeEntryPointFilter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

/**
 *li_hq
 */
@Configuration
@EnableConfigurationProperties(MonitorHttpProperties.class)
public class LoginConfiguration {
    @Bean
    public TradeEntryPointFilter tradeEntryPointFilter(MonitorHttpProperties properties) {
        return new MonitorTradeEntryPointFilter(properties, null);
    }

    @Bean
    public LoginAuthenticationProcessor matchableAuthenticationProcessor( SecurityProperties securityProperties) {
        return new LoginAuthenticationProcessor(getLoginPathPrefix(securityProperties));
    }

    private String getLoginPathPrefix(SecurityProperties securityProperties) {
        return Optional.ofNullable(securityProperties.getAuthentication()).map(a
                -> a.getLoginPathPrefix()).orElse(GenericAuthenticationFilter.DEFAULT_PREFIX_FILTER_PROCESSES_URL);
    }

}