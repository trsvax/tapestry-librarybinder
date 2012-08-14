package com.trsvax.librarybinder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.tapestry5.ioc.ServiceBinder;
import org.apache.tapestry5.ioc.ServiceBuilder;
import org.apache.tapestry5.ioc.ServiceResources;


public class LibraryBuilder<T> implements ServiceBuilder<T> {
	private final Class<?>[] interfaces;
	
	public LibraryBuilder(Class<T> clazz, ServiceBinder binder) {
		interfaces = new Class[] { clazz };
		for ( Method m : clazz.getDeclaredMethods() ) {
			Binder args = m.getAnnotation(Binder.class);
			if ( args != null ) {
				binder.bind(m.getReturnType(),args.implementation());
			}
		}
	}

	@Override
	public T buildService(ServiceResources resources) {
		return (T) Proxy.newProxyInstance(interfaces[0].getClassLoader(), interfaces, new Service(resources));
	}
	
	public class Service implements InvocationHandler {
		private final ServiceResources resources;

		public Service(ServiceResources resources) {
			this.resources = resources;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args)
				throws Throwable {
			Class<?> serviceInterface = method.getReturnType();
			return resources.getService(serviceInterface);
		}
		
	}
}
