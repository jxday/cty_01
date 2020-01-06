package com.jxday.controller;

import com.jxday.modules.sys.controller.AbstractController;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 〈微信小程序登陆接口〉
 *
 * @author cty
 * @ClassName WeChatLogin
 * @create 2019-11-08 14:53
 * @Version 1.0.0
 */

@Configuration
public class WeChatLogin extends AbstractController {

    private static final long serialVersionUID = 1L;

    private static final String APPID = "wx123456789";
    private static final String SECRET = "secretCode";  
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public String login(){
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid="+APPID+"&secret="+SECRET+"&js_code="+code+"grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        if (responseEntity != null && responseEntity.getStatusCode() == HttpStatus.OK){
            String entityBody = responseEntity.getBody();
            return null;
        }
        return null;
    }
//    public static void main(String[] args) {
//        // 距离JDK 14 发布还有多少天？
//        LocalDate jdk14 = LocalDate.of(2020, 3, 17);
//        LocalDate nowDate = LocalDate.now();
//        System.out.println("距离JDK 14 发布还有："+nowDate.until(jdk14, ChronoUnit.DAYS)+"天");
//
//    }
}
