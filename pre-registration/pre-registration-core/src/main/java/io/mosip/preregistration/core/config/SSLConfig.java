package io.mosip.preregistration.core.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Configuration class for Pre-registration
 * 
 * @author Tapaswini Behera
 *
 * @since 1.0.0
 */
@Configuration
public class SSLConfig {

	@Bean
	public SimpleClientHttpRequestFactory simpleClientHttpRequestFactory() {
		return new SimpleClientHttpRequestFactory();
	}

	@Bean
	public RestTemplate restTemplate(ClientHttpRequestFactory clientHttpRequestFactory) {
		RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
		return restTemplate;
	}
}
