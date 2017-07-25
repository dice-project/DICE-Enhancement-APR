/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.processor#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.processor#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.processor#getSpeedfactor <em>Speedfactor</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.processor#getScheduling <em>Scheduling</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.processor#getReplication <em>Replication</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.processor#getQuantum <em>Quantum</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.processor#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprocessor()
 * @model
 * @generated
 */
public interface processor extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprocessor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.processor#getName <em>Name</em>}' attribute.
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprocessor_Multiplicity()
	 * @model default="0"
	 * @generated
	 */
	int getMultiplicity();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.processor#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(int value);

	/**
	 * Returns the value of the '<em><b>Speedfactor</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speedfactor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speedfactor</em>' attribute.
	 * @see #setSpeedfactor(float)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprocessor_Speedfactor()
	 * @model default="1"
	 * @generated
	 */
	float getSpeedfactor();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.processor#getSpeedfactor <em>Speedfactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speedfactor</em>' attribute.
	 * @see #getSpeedfactor()
	 * @generated
	 */
	void setSpeedfactor(float value);

	/**
	 * Returns the value of the '<em><b>Scheduling</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.ic.lqn.lqnmodel.PSchedulerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling</em>' attribute.
	 * @see uk.ac.ic.lqn.lqnmodel.PSchedulerType
	 * @see #setScheduling(PSchedulerType)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprocessor_Scheduling()
	 * @model
	 * @generated
	 */
	PSchedulerType getScheduling();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.processor#getScheduling <em>Scheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling</em>' attribute.
	 * @see uk.ac.ic.lqn.lqnmodel.PSchedulerType
	 * @see #getScheduling()
	 * @generated
	 */
	void setScheduling(PSchedulerType value);

	/**
	 * Returns the value of the '<em><b>Replication</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replication</em>' attribute.
	 * @see #setReplication(int)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprocessor_Replication()
	 * @model default="1"
	 * @generated
	 */
	int getReplication();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.processor#getReplication <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication</em>' attribute.
	 * @see #getReplication()
	 * @generated
	 */
	void setReplication(int value);

	/**
	 * Returns the value of the '<em><b>Quantum</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantum</em>' attribute.
	 * @see #setQuantum(float)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprocessor_Quantum()
	 * @model default="0"
	 * @generated
	 */
	float getQuantum();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.processor#getQuantum <em>Quantum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantum</em>' attribute.
	 * @see #getQuantum()
	 * @generated
	 */
	void setQuantum(float value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.task}.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.task#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprocessor_Task()
	 * @see uk.ac.ic.lqn.lqnmodel.task#getHost
	 * @model opposite="host" containment="true" required="true"
	 * @generated
	 */
	EList<task> getTask();

} // processor
