/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.springcloud.auth2;

import java.util.Map;

import org.springframework.security.oauth2.provider.AuthorizationRequest;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.request.DefaultOAuth2RequestFactory;

/**
 * TODO
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
public class CustomerOAuth2RequestFactory extends DefaultOAuth2RequestFactory {

    public CustomerOAuth2RequestFactory(ClientDetailsService clientDetailsService) {
        super(clientDetailsService);
    }

    @Override
    public AuthorizationRequest createAuthorizationRequest(Map<String, String> authorizationParameters) {
        String appkey = authorizationParameters.get("appkey");
        String appsecret = authorizationParameters.get("appsecret");

        if (!authorizationParameters.containsKey("client_id")) {
            authorizationParameters.put("client_id", appkey);
        }

        if (!authorizationParameters.containsKey("client_secret")) {
            authorizationParameters.put("client_secret", appsecret);
        }

        if (!authorizationParameters.containsKey("response_type")) {
            authorizationParameters.put("response_type", "code");
        }

        return super.createAuthorizationRequest(authorizationParameters);
    }
}
