/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>precedence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.precedence#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.precedence#getTaskActivityP <em>Task Activity P</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.precedence#getPre <em>Pre</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.precedence#getPreor <em>Preor</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.precedence#getPreand <em>Preand</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.precedence#getPost <em>Post</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.precedence#getPostor <em>Postor</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.precedence#getPostand <em>Postand</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprecedence()
 * @model
 * @generated
 */
public interface precedence extends EObject {
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
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprecedence_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.precedence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Task Activity P</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.taskactivities#getPrecedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Activity P</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Activity P</em>' container reference.
	 * @see #setTaskActivityP(taskactivities)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprecedence_TaskActivityP()
	 * @see uk.ac.ic.lqn.lqnmodel.taskactivities#getPrecedence
	 * @model opposite="precedence" required="true" transient="false"
	 * @generated
	 */
	taskactivities getTaskActivityP();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.precedence#getTaskActivityP <em>Task Activity P</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Activity P</em>' container reference.
	 * @see #getTaskActivityP()
	 * @generated
	 */
	void setTaskActivityP(taskactivities value);

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.pre#getPrecedence1 <em>Precedence1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference.
	 * @see #setPre(pre)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprecedence_Pre()
	 * @see uk.ac.ic.lqn.lqnmodel.pre#getPrecedence1
	 * @model opposite="precedence1" containment="true"
	 * @generated
	 */
	pre getPre();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPre <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' containment reference.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(pre value);

	/**
	 * Returns the value of the '<em><b>Preor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.preor#getPrecedence2 <em>Precedence2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preor</em>' containment reference.
	 * @see #setPreor(preor)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprecedence_Preor()
	 * @see uk.ac.ic.lqn.lqnmodel.preor#getPrecedence2
	 * @model opposite="precedence2" containment="true"
	 * @generated
	 */
	preor getPreor();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPreor <em>Preor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preor</em>' containment reference.
	 * @see #getPreor()
	 * @generated
	 */
	void setPreor(preor value);

	/**
	 * Returns the value of the '<em><b>Preand</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.preand#getPrecedence3 <em>Precedence3</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preand</em>' containment reference.
	 * @see #setPreand(preand)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprecedence_Preand()
	 * @see uk.ac.ic.lqn.lqnmodel.preand#getPrecedence3
	 * @model opposite="precedence3" containment="true"
	 * @generated
	 */
	preand getPreand();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPreand <em>Preand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preand</em>' containment reference.
	 * @see #getPreand()
	 * @generated
	 */
	void setPreand(preand value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.post#getPrecedence4 <em>Precedence4</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(post)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprecedence_Post()
	 * @see uk.ac.ic.lqn.lqnmodel.post#getPrecedence4
	 * @model opposite="precedence4" containment="true"
	 * @generated
	 */
	post getPost();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(post value);

	/**
	 * Returns the value of the '<em><b>Postor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.postor#getPrecedence5 <em>Precedence5</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postor</em>' containment reference.
	 * @see #setPostor(postor)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprecedence_Postor()
	 * @see uk.ac.ic.lqn.lqnmodel.postor#getPrecedence5
	 * @model opposite="precedence5" containment="true"
	 * @generated
	 */
	postor getPostor();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPostor <em>Postor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postor</em>' containment reference.
	 * @see #getPostor()
	 * @generated
	 */
	void setPostor(postor value);

	/**
	 * Returns the value of the '<em><b>Postand</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.postand#getPrecedence6 <em>Precedence6</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postand</em>' containment reference.
	 * @see #setPostand(postand)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getprecedence_Postand()
	 * @see uk.ac.ic.lqn.lqnmodel.postand#getPrecedence6
	 * @model opposite="precedence6" containment="true"
	 * @generated
	 */
	postand getPostand();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPostand <em>Postand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postand</em>' containment reference.
	 * @see #getPostand()
	 * @generated
	 */
	void setPostand(postand value);

} // precedence
