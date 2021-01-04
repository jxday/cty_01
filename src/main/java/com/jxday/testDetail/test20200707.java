//package com.jxday.testDetail;
//
//import org.apache.shiro.dao.DataAccessException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisOperations;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.SessionCallback;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import java.util.Objects;
//
///**
// * 〈〉
// *
// * @author cty
// * @ClassName test20200707
// * @create 2020-07-07 15:52
// * @Version 1.0.0
// */
//
//@RestController
//@RequestMapping("/0707")
//public class test20200707 {
//
//    @Autowired(required = false)
//    private RedisTemplate redisTemplate;
//    
//    @RequestMapping("/main")
//    public void main(String[] args) {
//        String code = "111";
//        final Integer[] num = {0};
//        redisTemplate.execute(new SessionCallback() {
//            @Override
//            public Object execute(RedisOperations operations) throws DataAccessException {
//                operations.multi();
//                Object o = operations.opsForValue().get(code);
//                if (Objects.isNull(o)){
//                    operations.opsForValue().set(code, num[0]);
//                }else {
//                    if (o instanceof Integer){
//                        num[0] = (Integer)o + 1;
//                        operations.opsForValue().set(code, num[0]);
//                    }else {
//                        new Exception();
//                    }
//                }
//                return null;
//            }
//        });
//    }
//}
