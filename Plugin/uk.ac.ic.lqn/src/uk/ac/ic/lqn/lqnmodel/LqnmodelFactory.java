/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage
 * @generated
 */
public interface LqnmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LqnmodelFactory eINSTANCE = uk.ac.ic.lqn.lqnmodel.impl.LqnmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>lqnmodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>lqnmodel</em>'.
	 * @generated
	 */
	lqnmodel createlqnmodel();

	/**
	 * Returns a new object of class '<em>processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>processor</em>'.
	 * @generated
	 */
	processor createprocessor();

	/**
	 * Returns a new object of class '<em>task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>task</em>'.
	 * @generated
	 */
	task createtask();

	/**
	 * Returns a new object of class '<em>entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>entry</em>'.
	 * @generated
	 */
	entry createentry();

	/**
	 * Returns a new object of class '<em>taskactivities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>taskactivities</em>'.
	 * @generated
	 */
	taskactivities createtaskactivities();

	/**
	 * Returns a new object of class '<em>entryphaseactivities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>entryphaseactivities</em>'.
	 * @generated
	 */
	entryphaseactivities createentryphaseactivities();

	/**
	 * Returns a new object of class '<em>activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>activity</em>'.
	 * @generated
	 */
	activity createactivity();

	/**
	 * Returns a new object of class '<em>precedence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>precedence</em>'.
	 * @generated
	 */
	precedence createprecedence();

	/**
	 * Returns a new object of class '<em>replyentry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>replyentry</em>'.
	 * @generated
	 */
	replyentry createreplyentry();

	/**
	 * Returns a new object of class '<em>replyactivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>replyactivity</em>'.
	 * @generated
	 */
	replyactivity createreplyactivity();

	/**
	 * Returns a new object of class '<em>synchcall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>synchcall</em>'.
	 * @generated
	 */
	synchcall createsynchcall();

	/**
	 * Returns a new object of class '<em>asynchcall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>asynchcall</em>'.
	 * @generated
	 */
	asynchcall createasynchcall();

	/**
	 * Returns a new object of class '<em>activity R</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>activity R</em>'.
	 * @generated
	 */
	activityR createactivityR();

	/**
	 * Returns a new object of class '<em>pre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>pre</em>'.
	 * @generated
	 */
	pre createpre();

	/**
	 * Returns a new object of class '<em>preor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>preor</em>'.
	 * @generated
	 */
	preor createpreor();

	/**
	 * Returns a new object of class '<em>preand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>preand</em>'.
	 * @generated
	 */
	preand createpreand();

	/**
	 * Returns a new object of class '<em>post</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>post</em>'.
	 * @generated
	 */
	post createpost();

	/**
	 * Returns a new object of class '<em>postor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>postor</em>'.
	 * @generated
	 */
	postor createpostor();

	/**
	 * Returns a new object of class '<em>postand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>postand</em>'.
	 * @generated
	 */
	postand createpostand();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LqnmodelPackage getLqnmodelPackage();

} //LqnmodelFactory
