package main;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.METHOD)  // only can use this annotation with methods
@Retention(RetentionPolicy.RUNTIME)  // it allows to get the annotation's information in runtime
public @interface Info {
	String name() default "...";
	String date() default "none";
	double version() default 1.0;
	String[] people();
}