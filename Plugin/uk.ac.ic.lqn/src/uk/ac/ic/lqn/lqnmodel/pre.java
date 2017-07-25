/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>pre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.pre#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.pre#getPrecedence1 <em>Precedence1</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.pre#getActivityRPre <em>Activity RPre</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpre()
 * @model
 * @generated
 */
public interface pre extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpre_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.pre#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Precedence1</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence1</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence1</em>' container reference.
	 * @see #setPrecedence1(precedence)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpre_Precedence1()
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getPre
	 * @model opposite="pre" required="true" transient="false"
	 * @generated
	 */
	precedence getPrecedence1();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.pre#getPrecedence1 <em>Precedence1</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedence1</em>' container reference.
	 * @see #getPrecedence1()
	 * @generated
	 */
	void setPrecedence1(precedence value);

	/**
	 * Returns the value of the '<em><b>Activity RPre</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPreActivityR <em>Pre Activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity RPre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity RPre</em>' containment reference.
	 * @see #setActivityRPre(activityR)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpre_ActivityRPre()
	 * @see uk.ac.ic.lqn.lqnmodel.activityR#getPreActivityR
	 * @model opposite="preActivityR" containment="true" required="true"
	 * @generated
	 */
	activityR getActivityRPre();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.pre#getActivityRPre <em>Activity RPre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity RPre</em>' containment reference.
	 * @see #getActivityRPre()
	 * @generated
	 */
	void setActivityRPre(activityR value);

} // pre
