package com.isprint.jslx.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author HYL
 * @create 2017-11-07 下午1:18
 **/
public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String osName = conditionContext.getEnvironment().getProperty("os.name");
        boolean linux = osName.contains("Linux");
        return linux;
    }
}
