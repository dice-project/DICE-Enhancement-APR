/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>replyentry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.replyentry#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.replyentry#getTaskActivityR <em>Task Activity R</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.replyentry#getReplyactivity <em>Replyactivity</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getreplyentry()
 * @model
 * @generated
 */
public interface replyentry extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getreplyentry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.replyentry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Task Activity R</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.taskactivities#getReplyentry <em>Replyentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Activity R</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Activity R</em>' container reference.
	 * @see #setTaskActivityR(taskactivities)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getreplyentry_TaskActivityR()
	 * @see uk.ac.ic.lqn.lqnmodel.taskactivities#getReplyentry
	 * @model opposite="replyentry" required="true" transient="false"
	 * @generated
	 */
	taskactivities getTaskActivityR();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.replyentry#getTaskActivityR <em>Task Activity R</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Activity R</em>' container reference.
	 * @see #getTaskActivityR()
	 * @generated
	 */
	void setTaskActivityR(taskactivities value);

	/**
	 * Returns the value of the '<em><b>Replyactivity</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.replyactivity}.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.replyactivity#getReplyEntry1 <em>Reply Entry1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replyactivity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replyactivity</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getreplyentry_Replyactivity()
	 * @see uk.ac.ic.lqn.lqnmodel.replyactivity#getReplyEntry1
	 * @model opposite="replyEntry1" containment="true" required="true"
	 * @generated
	 */
	EList<replyactivity> getReplyactivity();

} // replyentry
