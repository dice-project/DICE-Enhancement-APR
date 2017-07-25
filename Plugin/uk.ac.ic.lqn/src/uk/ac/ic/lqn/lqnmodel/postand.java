/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>postand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.postand#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.postand#getPrecedence6 <em>Precedence6</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.postand#getActivityRPostAnd <em>Activity RPost And</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpostand()
 * @model
 * @generated
 */
public interface postand extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpostand_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.postand#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Precedence6</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPostand <em>Postand</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence6</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence6</em>' container reference.
	 * @see #setPrecedence6(precedence)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpostand_Precedence6()
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getPostand
	 * @model opposite="postand" required="true" transient="false"
	 * @generated
	 */
	precedence getPrecedence6();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.postand#getPrecedence6 <em>Precedence6</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedence6</em>' container reference.
	 * @see #getPrecedence6()
	 * @generated
	 */
	void setPrecedence6(precedence value);

	/**
	 * Returns the value of the '<em><b>Activity RPost And</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.activityR}.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPostandActivityR <em>Postand Activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity RPost And</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity RPost And</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpostand_ActivityRPostAnd()
	 * @see uk.ac.ic.lqn.lqnmodel.activityR#getPostandActivityR
	 * @model opposite="postandActivityR" containment="true" required="true"
	 * @generated
	 */
	EList<activityR> getActivityRPostAnd();

} // postand
