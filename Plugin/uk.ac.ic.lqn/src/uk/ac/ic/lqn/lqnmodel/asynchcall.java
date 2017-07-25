/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>asynchcall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.asynchcall#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.asynchcall#getDest <em>Dest</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.asynchcall#getCallsmean <em>Callsmean</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.asynchcall#getActivityASynchCall <em>Activity ASynch Call</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getasynchcall()
 * @model
 * @generated
 */
public interface asynchcall extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getasynchcall_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.asynchcall#getName <em>Name</em>}' attribute.
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getasynchcall_Dest()
	 * @model
	 * @generated
	 */
	String getDest();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.asynchcall#getDest <em>Dest</em>}' attribute.
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getasynchcall_Callsmean()
	 * @model
	 * @generated
	 */
	float getCallsmean();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.asynchcall#getCallsmean <em>Callsmean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callsmean</em>' attribute.
	 * @see #getCallsmean()
	 * @generated
	 */
	void setCallsmean(float value);

	/**
	 * Returns the value of the '<em><b>Activity ASynch Call</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.activity#getAsynchcall <em>Asynchcall</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity ASynch Call</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity ASynch Call</em>' container reference.
	 * @see #setActivityASynchCall(activity)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getasynchcall_ActivityASynchCall()
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getAsynchcall
	 * @model opposite="asynchcall" required="true" transient="false"
	 * @generated
	 */
	activity getActivityASynchCall();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.asynchcall#getActivityASynchCall <em>Activity ASynch Call</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity ASynch Call</em>' container reference.
	 * @see #getActivityASynchCall()
	 * @generated
	 */
	void setActivityASynchCall(activity value);

} // asynchcall
