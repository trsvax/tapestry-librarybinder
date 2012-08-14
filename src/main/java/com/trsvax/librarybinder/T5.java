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
	/**
	 * Used to provide access to ApplicationStatePersistenceStrategySource instances via a logical name for the stategy, such as "session".
	 * @see ApplicationStatePersistenceStrategySource
	 */
	public ApplicationStatePersistenceStrategySource applicationStatePersistenceStrategySource();
	/**
	 * Used by AssetSource to create new Assets as needed.
	 * @see AssetFactory
	 */
	public AssetFactory assetFactory();
	/**
	 * Converts the path (or URI) of an asset into a new format.
	 * @see AssetPathConverter
	 */
	public AssetPathConverter assetPathConverter();
	/**
	 * Used to find or create an Asset with a given path.
	 * @see AssetSource
	 */
	public AssetSource assetSource();
	/**
	 * Used when switching between normal/insecure (HTTP) and secure (HTTPS) mode.
	 * @see BaseURLSource
	 */
	public BaseURLSource baseURLSource();
	/**
	 * Used to override the default BeanBlockSource for a particular data type.
	 * @see BeanBlockOverrideSource
	 */
	public BeanBlockOverrideSource beanBlockOverrideSource();
	/**
	 * A source of Blocks used to display the properties of a bean (used by the Grid component),
	 * or to edit the properties of a bean (used by the BeanEditForm component).
	 * @see BeanBlockSource
	 */
	public BeanBlockSource beanBlockSource();
	/**
	 * Defines a context for editing a bean via BeanEditor.
	 * @see BeanEditContext
	 */
	public BeanEditContext beanEditContext();
	/**
	 * Used by a component to create a default BeanModel for a particular bean class.
	 * @see BeanModelSource
	 */
	public BeanModelSource beanModelSource();
	/**
	 * Creates a binding of a particular type.
	 * @see BindingFactory
	 */
	public BindingFactory bindingFactory();
	/**
	 * Used to acquire bindings for component parameters.
	 * @see BindingSource
	 */
	public BindingSource bindingSource();
	/**
	 * Used as part of the support for classpath Assets, to convert the Asset's Resource to a URL that can be accessed by the client.
	 * @see ClasspathAssetAliasManager
	 */
	public ClasspathAssetAliasManager classpathAssetAliasManager();
	/**
	 * Collects details about zone usage for efficient initialization of the client side objects.
	 * @see ClientBehaviorSupport
	 */
	public ClientBehaviorSupport clientBehaviorSupport();
	/**
	 * A service used when a component or service needs to encode some amount of data on the client as a string.
	 * @see ClientDataEncoder
	 */
	public ClientDataEncoder clientDataEncoder();
	/**
	 * Allows binary object data to be encoded into a string.
	 * @see ClientDataSink
	 */
	public ClientDataSink clientDataSink();
	/**
	 * Resolves page names and component types to fully qualified class names.
	 * @see ComponentClassResolver
	 */
	public ComponentClassResolver componentClassResolver();
	/**
	 * A service that can be injected into a component to provide common defaults for various types of parameters.
	 * @see ComponentDefaultProvider
	 */
	public ComponentDefaultProvider componentDefaultProvider();
	/**
	 * Interface used with TransformationSupport.addEventHandler(String, int, String, ComponentEventHandler)} (and, in the old API, 
	 * ClassTransformation.addComponentEventHandler(String, int, String, ComponentEventHandler)).
	 * @see ComponentEventHandler
	 */
	public ComponentEventHandler componentEventHandler();
	/**
	 * Responsible for creating Links for page render requests and for component event requests, and for parsing incoming paths to
	 * identify requests that are component event or page render requests.
	 * @see ComponentEventLinkEncoder
	 */
	public ComponentEventLinkEncoder componentEventLinkEncoder();
	/**
	 * Filter interface for ComponentEventRequestHandler
	 * @see ComponentEventRequestFilter
	 */
	public ComponentEventRequestFilter componentEventRequestFilter();
	/**
	 * Handler interface for component event requests.
	 * @see ComponentEventRequestHandler
	 */	
	public ComponentEventRequestHandler componentEventRequestHandler();
	/**
	 * Handler interface for component event requests.
	 * @see ComponentRequestHandler
	 */
	/**
	 * Responsible for handling the return value provided by a component event handler method.
	 * @see ComponentEventResultProcessor
	 */
	public ComponentEventResultProcessor componentEventResultProcessor();
	/**
	 * Filter interface for ComponentRequestHandler.
	 * @see ComponentRequestFilter
	 */
	public ComponentRequestFilter componentRequestFilter();
	/**
	 * A facade around ComponentEventRequestHandler and PageRenderRequestHandler that allows 
	 * for simplified filters that cover both types of requests.
	 * @see ComponentRequestHandler
	 */
	public ComponentRequestHandler componentRequestHandler();
	/**
	 * Used by classes that need to retrieve a component by its complete id, or a page by its logical page name or root component class.
	 * @see ComponentSource
	 */
	public ComponentSource componentSource();
	/**
	 * An API agnostic version of ServletContext, used to bridge the gaps between the Servlet API and the Portlet API.
	 * @see Context
	 */
	public Context context();
	/**
	 * A service to provide utilities needed for event context encoding and decoding to and from (partial) URL paths.
	 * @see ContextPathEncoder
	 */
	public ContextPathEncoder contextPathEncoder();
	/**
	 * Used to convert values used in event contexts to client string representations and back.
	 * @see ContextValueEncoder
	 */
	public ContextValueEncoder contextValueEncoder();
	/**
	 * Used by other services to obtain cookie values for the current request, or to write cookie values as part of the request.
	 * @see Cookies
	 */
	public Cookies cookies();
	/**
	 * Used by BeanModelSource to identify the type of data associated with a particular property (represented as a PropertyAdapter).
	 * @see DataTypeAnalyzer
	 */
	public DataTypeAnalyzer dataTypeAnalyzer();
	/**
	 * A dispatcher is responsible for recognizing an incoming request.
	 * @see Dispatcher
	 */
	public Dispatcher dispatcher();
	/**
	 * Provides access to environment objects, which are almost always provided to enclosed components by enclosing components.
	 * @see Environment
	 */
	public Environment environment();
	/**
	 * Much like PropertyShadowBuilder, except that instead of accessing a property of some other service, 
	 * it accesses a value from within the Environment service.
	 * @see EnvironmentalShadowBuilder
	 */
	public EnvironmentalShadowBuilder environmentalShadowBuilder();
	/**
	 * Interface implemented by a page used for reporting exceptions.
	 * @see ExceptionReporter
	 */
	public ExceptionReporter exceptionReporter();
	/**
	 * Used when accessing the private instance variables of a component instance.
	 * @see FieldAccess
	 */
	public FieldAccess fieldAccess();
	/**
	 * For a particular field, generates the default FieldTranslator for the field.
	 * @see FieldTranslatorSource
	 */
	public FieldTranslatorSource fieldTranslatorSource();
	/**
	 * For a particular field, generates the default validation for the field, in accordance with a number of factors and contributions.
	 * @see FieldValidatorDefaultSource
	 */
	public FieldValidatorDefaultSource fieldValidatorDefaultSource();
	/**
	 * Used to create FieldValidators for a particular Field component.
	 * @see FieldValidatorSource
	 */
	public FieldValidatorSource fieldValidatorSource();
	/**
	 * Services provided by an enclosing Form control component to the various form element components it encloses.
	 * @see FormSupport
	 */
	public FormSupport formSupport();
	/**
	 * Allows for deferred execution of logic, useful when trying to get multiple components to coordinate behavior.
	 * @see Heartbeat
	 */
	public Heartbeat heartbeat();
	/**
	 * Provides some assistance in determining where to place a hidden field based on standard (X)HTML elements.
	 * @see HiddenFieldLocationRules
	 */
	public HiddenFieldLocationRules hiddenFieldLocationRules();
	/**
	 * Filter interface for HttpServletRequestHandler.
	 * @see HttpServletRequestFilter
	 */
	public HttpServletRequestFilter httpServletRequestFilter();
	/**
	 * The first step in handing an incoming request to the servlet filter, this constructed as a pipeline.
	 * @see HttpServletRequestHandler
	 */
	public HttpServletRequestHandler httpServletRequestHandler();
	/**
	 * An object which manages a list of InvalidationListeners.
	 * @see InvalidationEventHub
	 */
	public InvalidationEventHub invalidationEventHub();
	/**
	 * Interface for objects that may cache information that can be invalidated.
	 * @see InvalidationListener
	 */
	public InvalidationListener invalidationListener();
	/**
	 * A service that allows listeners to be registered to learn about Link creation.
	 * @see LinkCreationHub
	 */
	public LinkCreationHub linkCreationHub();
	/**
	 * Listener interface for objects that need to be notified about newly created links.
	 * @see LinkCreationListener2
	 */
	public LinkCreationListener2 linkCreationListener2();
	/**
	 * Sets the thread's locale given a desired locale.
	 * @see LocalizationSetter
	 */
	public LocalizationSetter localizationSetter();
	/**
	 * An object which will perform rendering of a page (or portion of a page).
	 * @see MarkupRenderer
	 */
	public MarkupRenderer markupRenderer();
	/**
	 * Filter interface for MarkupRenderer, which allows for code to execute before and/or after the main rendering process.
	 * @see MarkupRendererFilter
	 */
	public MarkupRendererFilter markupRendererFilter();
	/**
	 * Source for MarkupWriter instances.
	 * @see MarkupWriterFactory
	 */
	public MarkupWriterFactory markupWriterFactory();
	/**
	 * Used to lookup meta data concerning a particular component.
	 * @see MetaDataLocator
	 */
	public MetaDataLocator metaDataLocator();
	/**
	 * Captures the result of invoking a method.
	 * @see MethodInvocationResult
	 */
	public MethodInvocationResult methodInvocationResult();
	/**
	 * A source for NullFieldStrategy instances based on a logical name.
	 * @see NullFieldStrategySource
	 */
	public NullFieldStrategySource nullFieldStrategySource();
	/**
	 * A strategy interface used for converting an object into markup that describes that object.
	 * @see ObjectRenderer
	 */
	public ObjectRenderer objectRenderer();
	/**
	 * Interface used to programatically render a page, forming a Document which can then be manipulated or streamed to a PrintWriter.
	 * @see PageDocumentGenerator
	 */
	public PageDocumentGenerator pageDocumentGenerator();
	/**
	 * A service that allows other services to create page render links (which are otherwise created by components, 
	 * via ComponentResourcesCommon.createPageLink(String, boolean, Object[])).
	 * @see PageRenderLinkSource
	 */	
	public PageRenderLinkSource pageRenderLinkSource();
	/**
	 * Filter interface for PageRenderRequestHandler, which allows extra behaviors to be injected 
	 * into the processing of a page render request.
	 * @see PageRenderRequestFilter
	 */
	public PageRenderRequestFilter pageRenderRequestFilter();
	/**
	 * Handles a invocation related to rendering out a pages complete content.
	 * @see PageRenderRequestHandler	
	 */
	public PageRenderRequestHandler	pageRenderRequestHandler();
	/**
	 * Defines an Ajax-oriented partial page render, wherein a render of a portion of a page occurs, and the content is stored into a 
	 * key ("content") of a JSONObject, which is sent to the client side as the final response.
	 * @see PartialMarkupRenderer
	 */
	public PartialMarkupRenderer partialMarkupRenderer();
	/**
	 * A filter (the main interface being PartialMarkupRenderer) applied when performing a partial
	 *  page render as part of an Ajax-oriented request.
	 *  @see PartialMarkupRendererFilter
	 */
	public PartialMarkupRendererFilter partialMarkupRendererFilter();
	/**
	 * Encapsulates persisted property information for an entire page.
	 * @see PersistentFieldBundle	
	 */
	public PersistentFieldBundle persistentFieldBundle();
	/**
	 * Represents a previously stored change to a persistent field, within the context of a particular page of the application.
	 * @see PersistentFieldChange
	 */
	public PersistentFieldChange persistentFieldChange();
	/**
	 * Defines how changes to fields (within components, within pages) may have their values persisted between requests.
	 * @see PersistentFieldStrategy
	 */
	public PersistentFieldStrategy persistentFieldStrategy();

}
