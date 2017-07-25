/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>postor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.postor#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.postor#getPrecedence5 <em>Precedence5</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.postor#getActivityRPostOr <em>Activity RPost Or</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpostor()
 * @model
 * @generated
 */
public interface postor extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpostor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.postor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Precedence5</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPostor <em>Postor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence5</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence5</em>' container reference.
	 * @see #setPrecedence5(precedence)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpostor_Precedence5()
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getPostor
	 * @model opposite="postor" required="true" transient="false"
	 * @generated
	 */
	precedence getPrecedence5();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.postor#getPrecedence5 <em>Precedence5</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedence5</em>' container reference.
	 * @see #getPrecedence5()
	 * @generated
	 */
	void setPrecedence5(precedence value);

	/**
	 * Returns the value of the '<em><b>Activity RPost Or</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.activityR}.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPostorActivityR <em>Postor Activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity RPost Or</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity RPost Or</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpostor_ActivityRPostOr()
	 * @see uk.ac.ic.lqn.lqnmodel.activityR#getPostorActivityR
	 * @model opposite="postorActivityR" containment="true" required="true"
	 * @generated
	 */
	EList<activityR> getActivityRPostOr();

} // postor
