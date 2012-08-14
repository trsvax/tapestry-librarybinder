package com.trsvax.librarybinder;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Binder {
	
	public Class implementation();
	public boolean eagerLoad();
	public boolean preventDecoration();
	public boolean preventReloading();
	public String scope();
	public String id();
	public Class marker();
	public boolean simpleId();

}
