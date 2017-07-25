/**
 */
package uk.ac.ic.lqn.Lqn2umlTrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.Lqn2umlTrace.Trace#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.Lqn2umlTrace.Lqn2umlTracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.Lqn2umlTrace.TraceLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.Lqn2umlTracePackage#getTrace_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<TraceLink> getLinks();

} // Trace
