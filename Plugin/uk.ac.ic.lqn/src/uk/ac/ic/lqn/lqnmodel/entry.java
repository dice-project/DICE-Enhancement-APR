/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.entry#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.entry#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.entry#getOpenarrivalrate <em>Openarrivalrate</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.entry#getPriority <em>Priority</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.entry#getSemaphore <em>Semaphore</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.entry#getTask1 <em>Task1</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.entry#getEntryphaseactivities <em>Entryphaseactivities</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getentry()
 * @model
 * @generated
 */
public interface entry extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getentry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.entry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.ic.lqn.lqnmodel.EntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see uk.ac.ic.lqn.lqnmodel.EntryType
	 * @see #setType(EntryType)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getentry_Type()
	 * @model
	 * @generated
	 */
	EntryType getType();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.entry#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see uk.ac.ic.lqn.lqnmodel.EntryType
	 * @see #getType()
	 * @generated
	 */
	void setType(EntryType value);

	/**
	 * Returns the value of the '<em><b>Openarrivalrate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Openarrivalrate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Openarrivalrate</em>' attribute.
	 * @see #setOpenarrivalrate(float)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getentry_Openarrivalrate()
	 * @model
	 * @generated
	 */
	float getOpenarrivalrate();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.entry#getOpenarrivalrate <em>Openarrivalrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openarrivalrate</em>' attribute.
	 * @see #getOpenarrivalrate()
	 * @generated
	 */
	void setOpenarrivalrate(float value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getentry_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.entry#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Semaphore</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.ic.lqn.lqnmodel.SemaphoreType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semaphore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semaphore</em>' attribute.
	 * @see uk.ac.ic.lqn.lqnmodel.SemaphoreType
	 * @see #setSemaphore(SemaphoreType)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getentry_Semaphore()
	 * @model
	 * @generated
	 */
	SemaphoreType getSemaphore();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.entry#getSemaphore <em>Semaphore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semaphore</em>' attribute.
	 * @see uk.ac.ic.lqn.lqnmodel.SemaphoreType
	 * @see #getSemaphore()
	 * @generated
	 */
	void setSemaphore(SemaphoreType value);

	/**
	 * Returns the value of the '<em><b>Task1</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.task#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task1</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task1</em>' container reference.
	 * @see #setTask1(task)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getentry_Task1()
	 * @see uk.ac.ic.lqn.lqnmodel.task#getEntry
	 * @model opposite="entry" required="true" transient="false"
	 * @generated
	 */
	task getTask1();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.entry#getTask1 <em>Task1</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task1</em>' container reference.
	 * @see #getTask1()
	 * @generated
	 */
	void setTask1(task value);

	/**
	 * Returns the value of the '<em><b>Entryphaseactivities</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.entryphaseactivities#getEntry1 <em>Entry1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entryphaseactivities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entryphaseactivities</em>' containment reference.
	 * @see #setEntryphaseactivities(entryphaseactivities)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getentry_Entryphaseactivities()
	 * @see uk.ac.ic.lqn.lqnmodel.entryphaseactivities#getEntry1
	 * @model opposite="entry1" containment="true"
	 * @generated
	 */
	entryphaseactivities getEntryphaseactivities();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.entry#getEntryphaseactivities <em>Entryphaseactivities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entryphaseactivities</em>' containment reference.
	 * @see #getEntryphaseactivities()
	 * @generated
	 */
	void setEntryphaseactivities(entryphaseactivities value);

} // entry
