/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>synchcall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.synchcall#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.synchcall#getDest <em>Dest</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.synchcall#getCallsmean <em>Callsmean</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.synchcall#getActivitySynchCall <em>Activity Synch Call</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getsynchcall()
 * @model
 * @generated
 */
public interface synchcall extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getsynchcall_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.synchcall#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' attribute.
	 * @see #setDest(String)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getsynchcall_Dest()
	 * @model
	 * @generated
	 */
	String getDest();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.synchcall#getDest <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' attribute.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(String value);

	/**
	 * Returns the value of the '<em><b>Callsmean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callsmean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callsmean</em>' attribute.
	 * @see #setCallsmean(float)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getsynchcall_Callsmean()
	 * @model
	 * @generated
	 */
	float getCallsmean();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.synchcall#getCallsmean <em>Callsmean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callsmean</em>' attribute.
	 * @see #getCallsmean()
	 * @generated
	 */
	void setCallsmean(float value);

	/**
	 * Returns the value of the '<em><b>Activity Synch Call</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.activity#getSynchcall <em>Synchcall</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Synch Call</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Synch Call</em>' container reference.
	 * @see #setActivitySynchCall(activity)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getsynchcall_ActivitySynchCall()
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getSynchcall
	 * @model opposite="synchcall" required="true" transient="false"
	 * @generated
	 */
	activity getActivitySynchCall();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.synchcall#getActivitySynchCall <em>Activity Synch Call</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Synch Call</em>' container reference.
	 * @see #getActivitySynchCall()
	 * @generated
	 */
	void setActivitySynchCall(activity value);

} // synchcall
