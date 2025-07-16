package com.yayi.cloud.framework.env.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 环境配置
 *
 * @author yayi
 */
@ConfigurationProperties(prefix = "yayi.env")
@Data
public class EnvProperties {

    public static final String TAG_KEY = "yayi.env.tag";

    /**
     * 环境标签
     */
    private String tag;

}
