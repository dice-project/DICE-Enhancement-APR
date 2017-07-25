/**
 */
package uk.ac.ic.lqn.Lqn2umlTrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.ic.lqn.Lqn2umlTrace.Lqn2umlTraceFactory
 * @model kind="package"
 * @generated
 */
public interface Lqn2umlTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Lqn2umlTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uk.ac.ic.lqn/lqn2umlTrace/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Lqn2umlTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lqn2umlTracePackage eINSTANCE = uk.ac.ic.lqn.Lqn2umlTrace.impl.Lqn2umlTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.Lqn2umlTrace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.impl.TraceImpl
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.impl.Lqn2umlTracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__LINKS = 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.Lqn2umlTrace.impl.TraceLinkImpl <em>Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.impl.TraceLinkImpl
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.impl.Lqn2umlTracePackageImpl#getTraceLink()
	 * @generated
	 */
	int TRACE_LINK = 1;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__SOURCES = 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__TARGETS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.Lqn2umlTrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.Lqn2umlTrace.Trace#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.Trace#getLinks()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Links();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.Lqn2umlTrace.TraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Link</em>'.
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.TraceLink
	 * @generated
	 */
	EClass getTraceLink();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.Lqn2umlTrace.TraceLink#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sources</em>'.
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.TraceLink#getSources()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_Sources();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.Lqn2umlTrace.TraceLink#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targets</em>'.
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.TraceLink#getTargets()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_Targets();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.Lqn2umlTrace.TraceLink#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.TraceLink#getDescription()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Lqn2umlTraceFactory getLqn2umlTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.Lqn2umlTrace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.Lqn2umlTrace.impl.TraceImpl
		 * @see uk.ac.ic.lqn.Lqn2umlTrace.impl.Lqn2umlTracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__LINKS = eINSTANCE.getTrace_Links();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.Lqn2umlTrace.impl.TraceLinkImpl <em>Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.Lqn2umlTrace.impl.TraceLinkImpl
		 * @see uk.ac.ic.lqn.Lqn2umlTrace.impl.Lqn2umlTracePackageImpl#getTraceLink()
		 * @generated
		 */
		EClass TRACE_LINK = eINSTANCE.getTraceLink();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__SOURCES = eINSTANCE.getTraceLink_Sources();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__TARGETS = eINSTANCE.getTraceLink_Targets();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__DESCRIPTION = eINSTANCE.getTraceLink_Description();

	}

} //Lqn2umlTracePackage
