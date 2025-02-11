package com.playtika.test.prometheus;

import com.playtika.test.common.properties.CommonContainerProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@EqualsAndHashCode(callSuper = true)
@ConfigurationProperties("embedded.prometheus")
public class PrometheusProperties extends CommonContainerProperties {

    static final String PROMETHEUS_BEAN_NAME = "prometheus";

    boolean enabled = true;
    String networkAlias = "prometheus";
    int port = 9090;

    // https://hub.docker.com/r/prom/prometheus
    @Override
    public String getDefaultDockerImage() {
        return "prom/prometheus:v2.28.1";
    }
}
