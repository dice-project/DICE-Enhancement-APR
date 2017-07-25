/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>preand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.preand#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.preand#getQuorum <em>Quorum</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.preand#getPrecedence3 <em>Precedence3</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.preand#getActivityRPreAnd <em>Activity RPre And</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpreand()
 * @model
 * @generated
 */
public interface preand extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpreand_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.preand#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Quorum</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quorum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quorum</em>' attribute.
	 * @see #setQuorum(int)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpreand_Quorum()
	 * @model default="0"
	 * @generated
	 */
	int getQuorum();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.preand#getQuorum <em>Quorum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quorum</em>' attribute.
	 * @see #getQuorum()
	 * @generated
	 */
	void setQuorum(int value);

	/**
	 * Returns the value of the '<em><b>Precedence3</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPreand <em>Preand</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence3</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence3</em>' container reference.
	 * @see #setPrecedence3(precedence)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpreand_Precedence3()
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getPreand
	 * @model opposite="preand" required="true" transient="false"
	 * @generated
	 */
	precedence getPrecedence3();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.preand#getPrecedence3 <em>Precedence3</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedence3</em>' container reference.
	 * @see #getPrecedence3()
	 * @generated
	 */
	void setPrecedence3(precedence value);

	/**
	 * Returns the value of the '<em><b>Activity RPre And</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.activityR}.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPreandActivityR <em>Preand Activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity RPre And</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity RPre And</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpreand_ActivityRPreAnd()
	 * @see uk.ac.ic.lqn.lqnmodel.activityR#getPreandActivityR
	 * @model opposite="preandActivityR" containment="true" required="true"
	 * @generated
	 */
	EList<activityR> getActivityRPreAnd();

} // preand
