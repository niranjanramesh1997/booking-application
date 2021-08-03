package org.superops.demo.moviebooking.config;

import io.lettuce.core.ClientOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfiguration {

    @Value("${spring.redis.host:localhost}")
    private String host;

    @Value("${spring.redis.port:6379}")
    private int port;

    @Value("${spring.data.redis.ssl:false}")
    private Boolean ssl;

    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        LettuceClientConfiguration clientConfig = ssl ?
                LettuceClientConfiguration.builder()
                        .clientOptions(
                                ClientOptions.builder()
                                        .autoReconnect(false)
                                        .pingBeforeActivateConnection(true)
                                        .build()
                        )
                        .useSsl()
                        .build() :
                LettuceClientConfiguration.builder().build();

        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration(host, port);
        return new LettuceConnectionFactory(redisStandaloneConfiguration, clientConfig);
    }

    @Bean
    public RedisTemplate<?, ?> redisTemplate() {
        RedisSerializer<String> stringSerializer = new StringRedisSerializer();
//        JdkSerializationRedisSerializer jdkSerializationRedisSerializer = new JdkSerializationRedisSerializer();
        GenericToStringSerializer genericToStringSerializer = new GenericToStringSerializer<Object>(Object.class);

        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory());
        template.setKeySerializer(stringSerializer);
        template.setHashKeySerializer(stringSerializer);
        template.setValueSerializer(genericToStringSerializer);
        template.setHashValueSerializer(genericToStringSerializer);
        template.setEnableTransactionSupport(true);
        template.afterPropertiesSet();

        return template;
    }

}
