package com.yayi.cloud.framework.websocket.core.security;

import com.yayi.cloud.framework.security.config.AuthorizeRequestsCustomizer;
import com.yayi.cloud.framework.websocket.config.WebSocketProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;

/**
 * WebSocket 的权限自定义
 *
 * @author yayi
 */
@RequiredArgsConstructor
public class WebSocketAuthorizeRequestsCustomizer extends AuthorizeRequestsCustomizer {

    private final WebSocketProperties webSocketProperties;

    @Override
    public void customize(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry registry) {
        registry.requestMatchers(webSocketProperties.getPath()).permitAll();
    }

}
