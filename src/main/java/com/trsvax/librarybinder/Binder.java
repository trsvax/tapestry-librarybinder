package com.trsvax.librarybinder;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Binder {
	
	public Class implementation();

}
