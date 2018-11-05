package com.jo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ServiceConfiguration {
	String defaultEndpoint();
	String key();
}
