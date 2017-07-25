/**
 */
package uk.ac.ic.lqn.Lqn2umlTrace.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.ic.lqn.Lqn2umlTrace.Lqn2umlTraceFactory;
import uk.ac.ic.lqn.Lqn2umlTrace.Lqn2umlTracePackage;
import uk.ac.ic.lqn.Lqn2umlTrace.Trace;
import uk.ac.ic.lqn.Lqn2umlTrace.TraceLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lqn2umlTracePackageImpl extends EPackageImpl implements Lqn2umlTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceLinkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.Lqn2umlTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Lqn2umlTracePackageImpl() {
		super(eNS_URI, Lqn2umlTraceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Lqn2umlTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Lqn2umlTracePackage init() {
		if (isInited) return (Lqn2umlTracePackage)EPackage.Registry.INSTANCE.getEPackage(Lqn2umlTracePackage.eNS_URI);

		// Obtain or create and register package
		Lqn2umlTracePackageImpl theLqn2umlTracePackage = (Lqn2umlTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Lqn2umlTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Lqn2umlTracePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLqn2umlTracePackage.createPackageContents();

		// Initialize created meta-data
		theLqn2umlTracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLqn2umlTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Lqn2umlTracePackage.eNS_URI, theLqn2umlTracePackage);
		return theLqn2umlTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Links() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceLink() {
		return traceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceLink_Sources() {
		return (EAttribute)traceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceLink_Targets() {
		return (EAttribute)traceLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceLink_Description() {
		return (EAttribute)traceLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lqn2umlTraceFactory getLqn2umlTraceFactory() {
		return (Lqn2umlTraceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__LINKS);

		traceLinkEClass = createEClass(TRACE_LINK);
		createEAttribute(traceLinkEClass, TRACE_LINK__SOURCES);
		createEAttribute(traceLinkEClass, TRACE_LINK__TARGETS);
		createEAttribute(traceLinkEClass, TRACE_LINK__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_Links(), this.getTraceLink(), null, "links", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceLinkEClass, TraceLink.class, "TraceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceLink_Sources(), ecorePackage.getEString(), "sources", null, 0, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceLink_Targets(), ecorePackage.getEString(), "targets", null, 0, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceLink_Description(), ecorePackage.getEString(), "description", null, 0, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Lqn2umlTracePackageImpl
