/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>preor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.preor#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.preor#getPrecedence2 <em>Precedence2</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.preor#getActivityRPreOr <em>Activity RPre Or</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpreor()
 * @model
 * @generated
 */
public interface preor extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpreor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.preor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Precedence2</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPreor <em>Preor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence2</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence2</em>' container reference.
	 * @see #setPrecedence2(precedence)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpreor_Precedence2()
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getPreor
	 * @model opposite="preor" required="true" transient="false"
	 * @generated
	 */
	precedence getPrecedence2();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.preor#getPrecedence2 <em>Precedence2</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedence2</em>' container reference.
	 * @see #getPrecedence2()
	 * @generated
	 */
	void setPrecedence2(precedence value);

	/**
	 * Returns the value of the '<em><b>Activity RPre Or</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.activityR}.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPreorActivityR <em>Preor Activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity RPre Or</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity RPre Or</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpreor_ActivityRPreOr()
	 * @see uk.ac.ic.lqn.lqnmodel.activityR#getPreorActivityR
	 * @model opposite="preorActivityR" containment="true" required="true"
	 * @generated
	 */
	EList<activityR> getActivityRPreOr();

} // preor
