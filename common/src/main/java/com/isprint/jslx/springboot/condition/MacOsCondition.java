package com.isprint.jslx.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Mac工作环境
 *
 * @author HYL
 * @create 2017-11-07 下午1:19
 **/
public class MacOsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String osName = conditionContext.getEnvironment().getProperty("os.name");
        boolean mac = osName.contains("Mac");
        return mac;
    }
}
