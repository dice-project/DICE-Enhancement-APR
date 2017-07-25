/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>activity R</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activityR#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activityR#getProb <em>Prob</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activityR#getPreActivityR <em>Pre Activity R</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activityR#getPreorActivityR <em>Preor Activity R</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activityR#getPreandActivityR <em>Preand Activity R</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activityR#getPostActivityR <em>Post Activity R</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activityR#getPostorActivityR <em>Postor Activity R</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.activityR#getPostandActivityR <em>Postand Activity R</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivityR()
 * @model
 * @generated
 */
public interface activityR extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivityR_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activityR#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivityR_Prob()
	 * @model default="1"
	 * @generated
	 */
	float getProb();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activityR#getProb <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob</em>' attribute.
	 * @see #getProb()
	 * @generated
	 */
	void setProb(float value);

	/**
	 * Returns the value of the '<em><b>Pre Activity R</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.pre#getActivityRPre <em>Activity RPre</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Activity R</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Activity R</em>' container reference.
	 * @see #setPreActivityR(pre)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivityR_PreActivityR()
	 * @see uk.ac.ic.lqn.lqnmodel.pre#getActivityRPre
	 * @model opposite="activityRPre" transient="false"
	 * @generated
	 */
	pre getPreActivityR();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPreActivityR <em>Pre Activity R</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Activity R</em>' container reference.
	 * @see #getPreActivityR()
	 * @generated
	 */
	void setPreActivityR(pre value);

	/**
	 * Returns the value of the '<em><b>Preor Activity R</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.preor#getActivityRPreOr <em>Activity RPre Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preor Activity R</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preor Activity R</em>' container reference.
	 * @see #setPreorActivityR(preor)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivityR_PreorActivityR()
	 * @see uk.ac.ic.lqn.lqnmodel.preor#getActivityRPreOr
	 * @model opposite="activityRPreOr" transient="false"
	 * @generated
	 */
	preor getPreorActivityR();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPreorActivityR <em>Preor Activity R</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preor Activity R</em>' container reference.
	 * @see #getPreorActivityR()
	 * @generated
	 */
	void setPreorActivityR(preor value);

	/**
	 * Returns the value of the '<em><b>Preand Activity R</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.preand#getActivityRPreAnd <em>Activity RPre And</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preand Activity R</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preand Activity R</em>' container reference.
	 * @see #setPreandActivityR(preand)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivityR_PreandActivityR()
	 * @see uk.ac.ic.lqn.lqnmodel.preand#getActivityRPreAnd
	 * @model opposite="activityRPreAnd" transient="false"
	 * @generated
	 */
	preand getPreandActivityR();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPreandActivityR <em>Preand Activity R</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preand Activity R</em>' container reference.
	 * @see #getPreandActivityR()
	 * @generated
	 */
	void setPreandActivityR(preand value);

	/**
	 * Returns the value of the '<em><b>Post Activity R</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.post#getActivityRPost <em>Activity RPost</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Activity R</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Activity R</em>' container reference.
	 * @see #setPostActivityR(post)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivityR_PostActivityR()
	 * @see uk.ac.ic.lqn.lqnmodel.post#getActivityRPost
	 * @model opposite="activityRPost" transient="false"
	 * @generated
	 */
	post getPostActivityR();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPostActivityR <em>Post Activity R</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Activity R</em>' container reference.
	 * @see #getPostActivityR()
	 * @generated
	 */
	void setPostActivityR(post value);

	/**
	 * Returns the value of the '<em><b>Postor Activity R</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.postor#getActivityRPostOr <em>Activity RPost Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postor Activity R</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postor Activity R</em>' container reference.
	 * @see #setPostorActivityR(postor)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivityR_PostorActivityR()
	 * @see uk.ac.ic.lqn.lqnmodel.postor#getActivityRPostOr
	 * @model opposite="activityRPostOr" transient="false"
	 * @generated
	 */
	postor getPostorActivityR();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPostorActivityR <em>Postor Activity R</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postor Activity R</em>' container reference.
	 * @see #getPostorActivityR()
	 * @generated
	 */
	void setPostorActivityR(postor value);

	/**
	 * Returns the value of the '<em><b>Postand Activity R</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.postand#getActivityRPostAnd <em>Activity RPost And</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postand Activity R</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postand Activity R</em>' container reference.
	 * @see #setPostandActivityR(postand)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getactivityR_PostandActivityR()
	 * @see uk.ac.ic.lqn.lqnmodel.postand#getActivityRPostAnd
	 * @model opposite="activityRPostAnd" transient="false"
	 * @generated
	 */
	postand getPostandActivityR();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPostandActivityR <em>Postand Activity R</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postand Activity R</em>' container reference.
	 * @see #getPostandActivityR()
	 * @generated
	 */
	void setPostandActivityR(postand value);

} // activityR
