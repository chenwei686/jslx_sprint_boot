package com.isprint.jslx.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * windows环境或者是mac环境
 *
 * @author HYL
 * @create 2017-11-07 下午1:31
 **/
public class WindowsOrMacConditon implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = conditionContext.getEnvironment();
        String property = environment.getProperty("os.name");
        boolean flag=true;
        if (property.contains("Linux")) {
            flag=false;
        }
        return flag;
    }
}
