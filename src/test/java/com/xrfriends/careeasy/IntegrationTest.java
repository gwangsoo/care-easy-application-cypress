package com.xrfriends.careeasy;

import com.xrfriends.careeasy.config.AsyncSyncConfiguration;
import com.xrfriends.careeasy.config.EmbeddedElasticsearch;
import com.xrfriends.careeasy.config.EmbeddedKafka;
import com.xrfriends.careeasy.config.EmbeddedRedis;
import com.xrfriends.careeasy.config.EmbeddedSQL;
import com.xrfriends.careeasy.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { CareEasyApplicationApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
