package com.ball.doubleball.common.utils;

import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author Mr.chen
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/1/2314:17
 */
public class RestTemplateUtil {

    private final static RestTemplate restTemplate = new RestTemplate();

    public static <T> T getForEntity(String url, Class<T> responseType, Object... urlVariables) {
        return restTemplate.getForEntity(url, responseType, urlVariables).getBody();
    }

    public static <T> T getForEntity(String url, Class<T> responseType, Map<String, ?> urlVariables) {
        return restTemplate.getForEntity(url, responseType, urlVariables).getBody();
    }

    public static <T> T postForEntity(String url, Object request, Class<T> responseType, Object... urlVariables) {
        return restTemplate.postForEntity(url, request, responseType, urlVariables).getBody();
    }

    public static <T> T postForEntity(String url, Object request, Class<T> responseType, Map<String, ?> urlVariables) {
        return restTemplate.postForEntity(url, request, responseType, urlVariables).getBody();
    }
}
