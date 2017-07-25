/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>replyactivity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.replyactivity#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.replyactivity#getReplyEntry1 <em>Reply Entry1</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getreplyactivity()
 * @model
 * @generated
 */
public interface replyactivity extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getreplyactivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.replyactivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reply Entry1</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.replyentry#getReplyactivity <em>Replyactivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply Entry1</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply Entry1</em>' container reference.
	 * @see #setReplyEntry1(replyentry)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getreplyactivity_ReplyEntry1()
	 * @see uk.ac.ic.lqn.lqnmodel.replyentry#getReplyactivity
	 * @model opposite="replyactivity" required="true" transient="false"
	 * @generated
	 */
	replyentry getReplyEntry1();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.replyactivity#getReplyEntry1 <em>Reply Entry1</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply Entry1</em>' container reference.
	 * @see #getReplyEntry1()
	 * @generated
	 */
	void setReplyEntry1(replyentry value);

} // replyactivity
