/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.post#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.post#getPrecedence4 <em>Precedence4</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.post#getActivityRPost <em>Activity RPost</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpost()
 * @model
 * @generated
 */
public interface post extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpost_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.post#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Precedence4</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence4</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence4</em>' container reference.
	 * @see #setPrecedence4(precedence)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpost_Precedence4()
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getPost
	 * @model opposite="post" required="true" transient="false"
	 * @generated
	 */
	precedence getPrecedence4();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.post#getPrecedence4 <em>Precedence4</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedence4</em>' container reference.
	 * @see #getPrecedence4()
	 * @generated
	 */
	void setPrecedence4(precedence value);

	/**
	 * Returns the value of the '<em><b>Activity RPost</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPostActivityR <em>Post Activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity RPost</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity RPost</em>' containment reference.
	 * @see #setActivityRPost(activityR)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getpost_ActivityRPost()
	 * @see uk.ac.ic.lqn.lqnmodel.activityR#getPostActivityR
	 * @model opposite="postActivityR" containment="true" required="true"
	 * @generated
	 */
	activityR getActivityRPost();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.post#getActivityRPost <em>Activity RPost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity RPost</em>' containment reference.
	 * @see #getActivityRPost()
	 * @generated
	 */
	void setActivityRPost(activityR value);

} // post
