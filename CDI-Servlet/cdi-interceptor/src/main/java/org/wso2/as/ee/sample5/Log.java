package org.wso2.as.ee.sample5;

import javax.interceptor.InterceptorBinding;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;



@Inherited
@Target({TYPE, METHOD})
@Retention(RUNTIME)
@InterceptorBinding
public @interface Log {
}
