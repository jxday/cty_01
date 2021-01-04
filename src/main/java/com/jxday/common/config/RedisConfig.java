//package com.jxday.common.config;
//
//import com.fasterxml.jackson.annotation.JsonAutoDetect;
//import com.fasterxml.jackson.annotation.PropertyAccessor;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.core.*;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
///**
// * 〈〉
// *
// * @author cty
// * @ClassName RedisConfig
// * @create 2020-07-07 16:06
// * @Version 1.0.0
// */
//@Configuration
//public class RedisConfig {
//    @Bean
//    @ConditionalOnMissingBean(name = "redisTemplate")
//    public RedisTemplate<String, Object> redisTemplate(
//            RedisConnectionFactory redisConnectionFactory) {
//
//        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
//        ObjectMapper om = new ObjectMapper();
//        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        jackson2JsonRedisSerializer.setObjectMapper(om);
//
//        RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
//        template.setConnectionFactory(redisConnectionFactory);
//        template.setKeySerializer(jackson2JsonRedisSerializer);
//        template.setValueSerializer(jackson2JsonRedisSerializer);
//        template.setHashKeySerializer(jackson2JsonRedisSerializer);
//        template.setHashValueSerializer(jackson2JsonRedisSerializer);
//        template.afterPropertiesSet();
//        return template;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean(StringRedisTemplate.class)
//    public StringRedisTemplate stringRedisTemplate(
//            RedisConnectionFactory redisConnectionFactory) {
//        StringRedisTemplate template = new StringRedisTemplate();
//        template.setConnectionFactory(redisConnectionFactory);
//        return template;
//    }
//    
////    @Autowired(required = false)
////    private RedisConnectionFactory factory;
////
////    @Bean
////    public RedisTemplate<String, Object> redisTemplate() {
////        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
////        redisTemplate.setKeySerializer(new StringRedisSerializer());
////        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
////        redisTemplate.setHashValueSerializer(new StringRedisSerializer());
////        redisTemplate.setValueSerializer(new StringRedisSerializer());
////        redisTemplate.setConnectionFactory(factory);
////        return redisTemplate;
////    }
////
////    @Bean
////    public HashOperations<String, String, Object> hashOperations(RedisTemplate<String, Object> redisTemplate) {
////        return redisTemplate.opsForHash();
////    }
////
////    @Bean
////    public ValueOperations<String, String> valueOperations(RedisTemplate<String, String> redisTemplate) {
////        return redisTemplate.opsForValue();
////    }
////
////    @Bean
////    public ListOperations<String, Object> listOperations(RedisTemplate<String, Object> redisTemplate) {
////        return redisTemplate.opsForList();
////    }
////
////    @Bean
////    public SetOperations<String, Object> setOperations(RedisTemplate<String, Object> redisTemplate) {
////        return redisTemplate.opsForSet();
////    }
////
////    @Bean
////    public ZSetOperations<String, Object> zSetOperations(RedisTemplate<String, Object> redisTemplate) {
////        return redisTemplate.opsForZSet();
////    }
//}
