/**
 */
package uk.ac.ic.lqn.Lqn2umlTrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.ic.lqn.Lqn2umlTrace.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lqn2umlTraceFactoryImpl extends EFactoryImpl implements Lqn2umlTraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Lqn2umlTraceFactory init() {
		try {
			Lqn2umlTraceFactory theLqn2umlTraceFactory = (Lqn2umlTraceFactory)EPackage.Registry.INSTANCE.getEFactory(Lqn2umlTracePackage.eNS_URI);
			if (theLqn2umlTraceFactory != null) {
				return theLqn2umlTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Lqn2umlTraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lqn2umlTraceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Lqn2umlTracePackage.TRACE: return createTrace();
			case Lqn2umlTracePackage.TRACE_LINK: return createTraceLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLink createTraceLink() {
		TraceLinkImpl traceLink = new TraceLinkImpl();
		return traceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lqn2umlTracePackage getLqn2umlTracePackage() {
		return (Lqn2umlTracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Lqn2umlTracePackage getPackage() {
		return Lqn2umlTracePackage.eINSTANCE;
	}

} //Lqn2umlTraceFactoryImpl
