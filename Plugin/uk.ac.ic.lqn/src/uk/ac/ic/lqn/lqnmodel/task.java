/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.task#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.task#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.task#getPriority <em>Priority</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.task#getQueuelength <em>Queuelength</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.task#getScheduling <em>Scheduling</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.task#isActivitygraph <em>Activitygraph</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.task#getThinktime <em>Thinktime</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.task#getEntry <em>Entry</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.task#getTaskactivities <em>Taskactivities</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.task#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettask()
 * @model
 * @generated
 */
public interface task extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see #setMultiplicity(int)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettask_Multiplicity()
	 * @model default="0"
	 * @generated
	 */
	int getMultiplicity();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.task#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(int value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettask_Priority()
	 * @model default="0"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.task#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Queuelength</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queuelength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queuelength</em>' attribute.
	 * @see #setQueuelength(int)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettask_Queuelength()
	 * @model default="0"
	 * @generated
	 */
	int getQueuelength();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.task#getQueuelength <em>Queuelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queuelength</em>' attribute.
	 * @see #getQueuelength()
	 * @generated
	 */
	void setQueuelength(int value);

	/**
	 * Returns the value of the '<em><b>Scheduling</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.ic.lqn.lqnmodel.TSchedulerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling</em>' attribute.
	 * @see uk.ac.ic.lqn.lqnmodel.TSchedulerType
	 * @see #setScheduling(TSchedulerType)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettask_Scheduling()
	 * @model
	 * @generated
	 */
	TSchedulerType getScheduling();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.task#getScheduling <em>Scheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling</em>' attribute.
	 * @see uk.ac.ic.lqn.lqnmodel.TSchedulerType
	 * @see #getScheduling()
	 * @generated
	 */
	void setScheduling(TSchedulerType value);

	/**
	 * Returns the value of the '<em><b>Activitygraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitygraph</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitygraph</em>' attribute.
	 * @see #setActivitygraph(boolean)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettask_Activitygraph()
	 * @model
	 * @generated
	 */
	boolean isActivitygraph();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.task#isActivitygraph <em>Activitygraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activitygraph</em>' attribute.
	 * @see #isActivitygraph()
	 * @generated
	 */
	void setActivitygraph(boolean value);

	/**
	 * Returns the value of the '<em><b>Thinktime</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thinktime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thinktime</em>' attribute.
	 * @see #setThinktime(float)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettask_Thinktime()
	 * @model default="0"
	 * @generated
	 */
	float getThinktime();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.task#getThinktime <em>Thinktime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thinktime</em>' attribute.
	 * @see #getThinktime()
	 * @generated
	 */
	void setThinktime(float value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.entry}.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.entry#getTask1 <em>Task1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettask_Entry()
	 * @see uk.ac.ic.lqn.lqnmodel.entry#getTask1
	 * @model opposite="task1" containment="true" required="true"
	 * @generated
	 */
	EList<entry> getEntry();

	/**
	 * Returns the value of the '<em><b>Taskactivities</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.taskactivities}.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.taskactivities#getTask2 <em>Task2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taskactivities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taskactivities</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettask_Taskactivities()
	 * @see uk.ac.ic.lqn.lqnmodel.taskactivities#getTask2
	 * @model opposite="task2" containment="true"
	 * @generated
	 */
	EList<taskactivities> getTaskactivities();

	/**
	 * Returns the value of the '<em><b>Host</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.processor#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' container reference.
	 * @see #setHost(processor)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#gettask_Host()
	 * @see uk.ac.ic.lqn.lqnmodel.processor#getTask
	 * @model opposite="task" required="true" transient="false"
	 * @generated
	 */
	processor getHost();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.task#getHost <em>Host</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' container reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(processor value);

} // task
