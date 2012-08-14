package com.trsvax.librarybinder;

import org.apache.tapestry5.services.*;

@SuppressWarnings("rawtypes")
public interface T5 {
	
	/**
	 * Stores global information about the application and its environment.
	 * @see ApplicationGlobals
	 */
	public ApplicationGlobals applicationGlobals();
	/** 
	 * Service interface for initializing Tapestry for the application.
	 * @see ApplicationInitializer
	 */
	public ApplicationInitializer applicationInitializer();
	/**
	 * Filter interface for ApplicationInitializer.
	 * @see ApplicationInitializerFilter
	 */
	public ApplicationInitializerFilter applicationInitializerFilter();
	/**
	 * Used by ApplicationStateManager and ApplicationStatePersistenceStrategy to create an application state object on demand.
	 * @see ApplicationStateCreator
	 */
	public ApplicationStateCreator applicationStateCreator();
	/**
	 * Responsible for managing session state objects, objects which persist between requests, 
	 * but are not tied to any individual page or component.
	 * @see ApplicationStateManager
	 */
	public ApplicationStateManager applicationStateManager();
	/**
	 * Used by ApplicationStateManager to manage a specific kind of Session State Object (SSO) persistence.
	 * @see ApplicationStatePersistenceStrategy
	 */
	public ApplicationStatePersistenceStrategy applicationStatePersistenceStrategy();
	public ApplicationStatePersistenceStrategySource applicationStatePersistenceStrategySource();
	public AssetFactory assetFactory();
	public AssetPathConverter assetPathConverter();
	public AssetSource assetSource();
	public BaseURLSource baseURLSource();
	public BeanBlockOverrideSource beanBlockOverrideSource();
	public BeanBlockSource beanBlockSource();
	public BeanEditContext beanEditContext();
	public BeanModelSource beanModelSource();
	public BindingFactory bindingFactory();
	public BindingSource bindingSource();
	public ClasspathAssetAliasManager classpathAssetAliasManager();
	public ClientBehaviorSupport clientBehaviorSupport();
	public ClientDataEncoder clientDataEncoder();
	public ClientDataSink clientDataSink();
	public ComponentClassResolver componentClassResolver();
	public ComponentDefaultProvider componentDefaultProvider();
	public ComponentEventLinkEncoder componentEventLinkEncoder();
	public ComponentEventRequestHandler componentEventRequestHandler();
	public ComponentEventResultProcessor componentEventResultProcessor();
	public ComponentRequestHandler componentRequestHandler();
	public ComponentSource componentSource();
	public Context context();
	public ContextPathEncoder contextPathEncoder();
	public ContextValueEncoder contextValueEncoder();
	public Cookies cookies();
	public DataTypeAnalyzer dataTypeAnalyzer();
	public Dispatcher dispatcher();
	public Environment environment();
	public EnvironmentalShadowBuilder environmentalShadowBuilder();
	public ExceptionReporter exceptionReporter();
	public FieldAccess fieldAccess();
	public FieldTranslatorSource fieldTranslatorSource();
	public FieldValidatorDefaultSource fieldValidatorDefaultSource();
	public FieldValidatorSource fieldValidatorSource();
	public FormSupport formSupport();
	public Heartbeat heartbeat();
	public HiddenFieldLocationRules hiddenFieldLocationRules();
	public HttpServletRequestFilter httpServletRequestFilter();
	public HttpServletRequestHandler httpServletRequestHandler();
	public InvalidationEventHub invalidationEventHub();
	public InvalidationListener invalidationListener();
	public LinkCreationHub linkCreationHub();
	public LinkCreationListener2 linkCreationListener2();
	public LocalizationSetter localizationSetter();
	
	
	
	public PageRenderLinkSource pageRenderLinkSource();

}
