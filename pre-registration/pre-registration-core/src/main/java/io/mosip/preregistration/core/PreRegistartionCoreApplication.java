package io.mosip.preregistration.core;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.TrustStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

/*
 * (non-Javadoc)
 * 
 *
 */

@SpringBootApplication
@ComponentScan(basePackages = "io.mosip.*", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.REGEX,
				pattern = {"io\\.mosip\\.kernel\\.keymigrate\\..*",
						"io\\.mosip\\.kernel\\.zkcryptoservice\\..*",
						"io\\.mosip\\.kernel\\.tokenidgenerator\\..*",
						"io\\.mosip\\.kernel\\.signature\\..*",
						"io\\.mosip\\.kernel\\.partnercertservice\\..*",
						"io\\.mosip\\.kernel\\.lkeymanager\\..*",
						"io\\.mosip\\.kernel\\.keymanagerservice\\..*",
						"io\\.mosip\\.kernel\\.keymanager\\..*",
						"io\\.mosip\\.kernel\\.keygenerator\\..*",
						"io\\.mosip\\.kernel\\.cryptomanager\\..*",
						"io\\.mosip\\.kernel\\.crypto\\..*",
						"io\\.mosip\\.kernel\\.clientcrypto\\..*",
				}) })
public class PreRegistartionCoreApplication {
	public static void main(String[] args) {
		System.out.println("PreRegistartionCoreApplication started....1");
		SpringApplication.run(PreRegistartionCoreApplication.class, args);
		System.out.println("PreRegistartionCoreApplication started....2");
	}
}
