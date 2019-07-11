package de.adessi.ribbonclient;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.context.annotation.Bean;

public class ServiceRibbonClientConfiguration {

    @Bean
    public IPing ping() {
        return new PingUrl();
    }

    @Bean
    public IRule rule() {
        return new AvailabilityFilteringRule();
    }
}
