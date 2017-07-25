/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activity#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activity#getHostdemandmean <em>Hostdemandmean</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activity#getHostdemandcvsq <em>Hostdemandcvsq</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activity#getThinktime <em>Thinktime</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activity#getMaxservicetime <em>Maxservicetime</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activity#getCallorder <em>Callorder</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activity#getPhase <em>Phase</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activity#getBoundtoentry <em>Boundtoentry</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activity#getProb <em>Prob</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activity#getCount <em>Count</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activity#getSynchcall <em>Synchcall</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activity#getAsynchcall <em>Asynchcall</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activity#getTaskActivity <em>Task Activity</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activity#getEntryphaseactivities1 <em>Entryphaseactivities1</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity()
 * @model
 * @generated
 */
public interface activity extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hostdemandmean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostdemandmean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostdemandmean</em>' attribute.
	 * @see #setHostdemandmean(float)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity_Hostdemandmean()
	 * @model
	 * @generated
	 */
	float getHostdemandmean();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activity#getHostdemandmean <em>Hostdemandmean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostdemandmean</em>' attribute.
	 * @see #getHostdemandmean()
	 * @generated
	 */
	void setHostdemandmean(float value);

	/**
	 * Returns the value of the '<em><b>Hostdemandcvsq</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostdemandcvsq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostdemandcvsq</em>' attribute.
	 * @see #setHostdemandcvsq(float)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity_Hostdemandcvsq()
	 * @model default="1"
	 * @generated
	 */
	float getHostdemandcvsq();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activity#getHostdemandcvsq <em>Hostdemandcvsq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostdemandcvsq</em>' attribute.
	 * @see #getHostdemandcvsq()
	 * @generated
	 */
	void setHostdemandcvsq(float value);

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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity_Thinktime()
	 * @model default="0"
	 * @generated
	 */
	float getThinktime();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activity#getThinktime <em>Thinktime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thinktime</em>' attribute.
	 * @see #getThinktime()
	 * @generated
	 */
	void setThinktime(float value);

	/**
	 * Returns the value of the '<em><b>Maxservicetime</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxservicetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxservicetime</em>' attribute.
	 * @see #setMaxservicetime(float)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity_Maxservicetime()
	 * @model default="0"
	 * @generated
	 */
	float getMaxservicetime();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activity#getMaxservicetime <em>Maxservicetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxservicetime</em>' attribute.
	 * @see #getMaxservicetime()
	 * @generated
	 */
	void setMaxservicetime(float value);

	/**
	 * Returns the value of the '<em><b>Callorder</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.ic.lqn.lqnmodel.CallOrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callorder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callorder</em>' attribute.
	 * @see uk.ac.ic.lqn.lqnmodel.CallOrderType
	 * @see #setCallorder(CallOrderType)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity_Callorder()
	 * @model
	 * @generated
	 */
	CallOrderType getCallorder();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activity#getCallorder <em>Callorder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callorder</em>' attribute.
	 * @see uk.ac.ic.lqn.lqnmodel.CallOrderType
	 * @see #getCallorder()
	 * @generated
	 */
	void setCallorder(CallOrderType value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #setPhase(int)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity_Phase()
	 * @model
	 * @generated
	 */
	int getPhase();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activity#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(int value);

	/**
	 * Returns the value of the '<em><b>Boundtoentry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundtoentry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundtoentry</em>' attribute.
	 * @see #setBoundtoentry(String)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity_Boundtoentry()
	 * @model
	 * @generated
	 */
	String getBoundtoentry();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activity#getBoundtoentry <em>Boundtoentry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundtoentry</em>' attribute.
	 * @see #getBoundtoentry()
	 * @generated
	 */
	void setBoundtoentry(String value);

	/**
	 * Returns the value of the '<em><b>Prob</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prob</em>' attribute.
	 * @see #setProb(float)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity_Prob()
	 * @model default="1"
	 * @generated
	 */
	float getProb();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activity#getProb <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob</em>' attribute.
	 * @see #getProb()
	 * @generated
	 */
	void setProb(float value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(float)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity_Count()
	 * @model default="1"
	 * @generated
	 */
	float getCount();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activity#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(float value);

	/**
	 * Returns the value of the '<em><b>Synchcall</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.synchcall}.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.synchcall#getActivitySynchCall <em>Activity Synch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchcall</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchcall</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity_Synchcall()
	 * @see uk.ac.ic.lqn.lqnmodel.synchcall#getActivitySynchCall
	 * @model opposite="activitySynchCall" containment="true"
	 * @generated
	 */
	EList<synchcall> getSynchcall();

	/**
	 * Returns the value of the '<em><b>Asynchcall</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.asynchcall}.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.asynchcall#getActivityASynchCall <em>Activity ASynch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asynchcall</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asynchcall</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity_Asynchcall()
	 * @see uk.ac.ic.lqn.lqnmodel.asynchcall#getActivityASynchCall
	 * @model opposite="activityASynchCall" containment="true"
	 * @generated
	 */
	EList<asynchcall> getAsynchcall();

	/**
	 * Returns the value of the '<em><b>Task Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.taskactivities#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Activity</em>' container reference.
	 * @see #setTaskActivity(taskactivities)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity_TaskActivity()
	 * @see uk.ac.ic.lqn.lqnmodel.taskactivities#getActivity
	 * @model opposite="activity" transient="false"
	 * @generated
	 */
	taskactivities getTaskActivity();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activity#getTaskActivity <em>Task Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Activity</em>' container reference.
	 * @see #getTaskActivity()
	 * @generated
	 */
	void setTaskActivity(taskactivities value);

	/**
	 * Returns the value of the '<em><b>Entryphaseactivities1</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.entryphaseactivities#getActivity1 <em>Activity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entryphaseactivities1</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entryphaseactivities1</em>' container reference.
	 * @see #setEntryphaseactivities1(entryphaseactivities)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivity_Entryphaseactivities1()
	 * @see uk.ac.ic.lqn.lqnmodel.entryphaseactivities#getActivity1
	 * @model opposite="activity1" transient="false"
	 * @generated
	 */
	entryphaseactivities getEntryphaseactivities1();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activity#getEntryphaseactivities1 <em>Entryphaseactivities1</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entryphaseactivities1</em>' container reference.
	 * @see #getEntryphaseactivities1()
	 * @generated
	 */
	void setEntryphaseactivities1(entryphaseactivities value);

} // activity
