/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>taskactivities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.taskactivities#getActivity <em>Activity</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.taskactivities#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.taskactivities#getReplyentry <em>Replyentry</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.taskactivities#getTask2 <em>Task2</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettaskactivities()
 * @model
 * @generated
 */
public interface taskactivities extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.activity}.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.activity#getTaskActivity <em>Task Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettaskactivities_Activity()
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getTaskActivity
	 * @model opposite="taskActivity" containment="true" required="true"
	 * @generated
	 */
	EList<activity> getActivity();

	/**
	 * Returns the value of the '<em><b>Precedence</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.precedence}.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.precedence#getTaskActivityP <em>Task Activity P</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettaskactivities_Precedence()
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getTaskActivityP
	 * @model opposite="taskActivityP" containment="true"
	 * @generated
	 */
	EList<precedence> getPrecedence();

	/**
	 * Returns the value of the '<em><b>Replyentry</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.replyentry}.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.replyentry#getTaskActivityR <em>Task Activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replyentry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replyentry</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettaskactivities_Replyentry()
	 * @see uk.ac.ic.lqn.lqnmodel.replyentry#getTaskActivityR
	 * @model opposite="taskActivityR" containment="true"
	 * @generated
	 */
	EList<replyentry> getReplyentry();

	/**
	 * Returns the value of the '<em><b>Task2</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.task#getTaskactivities <em>Taskactivities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task2</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task2</em>' container reference.
	 * @see #setTask2(task)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettaskactivities_Task2()
	 * @see uk.ac.ic.lqn.lqnmodel.task#getTaskactivities
	 * @model opposite="taskactivities" required="true" transient="false"
	 * @generated
	 */
	task getTask2();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.taskactivities#getTask2 <em>Task2</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task2</em>' container reference.
	 * @see #getTask2()
	 * @generated
	 */
	void setTask2(task value);

} // taskactivities
