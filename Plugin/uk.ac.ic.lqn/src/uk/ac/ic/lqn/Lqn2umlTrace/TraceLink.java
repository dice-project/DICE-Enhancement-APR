/**
 */
package uk.ac.ic.lqn.Lqn2umlTrace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.Lqn2umlTrace.TraceLink#getSources <em>Sources</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.Lqn2umlTrace.TraceLink#getTargets <em>Targets</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.Lqn2umlTrace.TraceLink#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.Lqn2umlTrace.Lqn2umlTracePackage#getTraceLink()
 * @model
 * @generated
 */
public interface TraceLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' attribute.
	 * @see #setSources(String)
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.Lqn2umlTracePackage#getTraceLink_Sources()
	 * @model
	 * @generated
	 */
	String getSources();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.Lqn2umlTrace.TraceLink#getSources <em>Sources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sources</em>' attribute.
	 * @see #getSources()
	 * @generated
	 */
	void setSources(String value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' attribute.
	 * @see #setTargets(String)
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.Lqn2umlTracePackage#getTraceLink_Targets()
	 * @model
	 * @generated
	 */
	String getTargets();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.Lqn2umlTrace.TraceLink#getTargets <em>Targets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targets</em>' attribute.
	 * @see #getTargets()
	 * @generated
	 */
	void setTargets(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see uk.ac.ic.lqn.Lqn2umlTrace.Lqn2umlTracePackage#getTraceLink_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.Lqn2umlTrace.TraceLink#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // TraceLink
