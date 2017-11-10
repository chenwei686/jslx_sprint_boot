package com.isprint.jslx.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * windows环境的条件
 *
 * @author HYL
 * @create 2017-11-07 下午1:15
 **/
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = conditionContext.getEnvironment();
        String osName = environment.getProperty("os.name");
        boolean window = osName.contains("Windows");
        return window;
    }
}
