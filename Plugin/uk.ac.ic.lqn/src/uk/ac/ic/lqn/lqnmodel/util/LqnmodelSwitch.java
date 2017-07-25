/**
 */
package uk.ac.ic.lqn.lqnmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.ic.lqn.lqnmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage
 * @generated
 */
public class LqnmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LqnmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = LqnmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LqnmodelPackage.LQNMODEL: {
				lqnmodel lqnmodel = (lqnmodel)theEObject;
				T result = caselqnmodel(lqnmodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.PROCESSOR: {
				processor processor = (processor)theEObject;
				T result = caseprocessor(processor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.TASK: {
				task task = (task)theEObject;
				T result = casetask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.ENTRY: {
				entry entry = (entry)theEObject;
				T result = caseentry(entry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.TASKACTIVITIES: {
				taskactivities taskactivities = (taskactivities)theEObject;
				T result = casetaskactivities(taskactivities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.ENTRYPHASEACTIVITIES: {
				entryphaseactivities entryphaseactivities = (entryphaseactivities)theEObject;
				T result = caseentryphaseactivities(entryphaseactivities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.ACTIVITY: {
				activity activity = (activity)theEObject;
				T result = caseactivity(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.PRECEDENCE: {
				precedence precedence = (precedence)theEObject;
				T result = caseprecedence(precedence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.REPLYENTRY: {
				replyentry replyentry = (replyentry)theEObject;
				T result = casereplyentry(replyentry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.REPLYACTIVITY: {
				replyactivity replyactivity = (replyactivity)theEObject;
				T result = casereplyactivity(replyactivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.SYNCHCALL: {
				synchcall synchcall = (synchcall)theEObject;
				T result = casesynchcall(synchcall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.ASYNCHCALL: {
				asynchcall asynchcall = (asynchcall)theEObject;
				T result = caseasynchcall(asynchcall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.ACTIVITY_R: {
				activityR activityR = (activityR)theEObject;
				T result = caseactivityR(activityR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.PRE: {
				pre pre = (pre)theEObject;
				T result = casepre(pre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.PREOR: {
				preor preor = (preor)theEObject;
				T result = casepreor(preor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.PREAND: {
				preand preand = (preand)theEObject;
				T result = casepreand(preand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.POST: {
				post post = (post)theEObject;
				T result = casepost(post);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.POSTOR: {
				postor postor = (postor)theEObject;
				T result = casepostor(postor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnmodelPackage.POSTAND: {
				postand postand = (postand)theEObject;
				T result = casepostand(postand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>lqnmodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>lqnmodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselqnmodel(lqnmodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseprocessor(processor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetask(task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseentry(entry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>taskactivities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>taskactivities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetaskactivities(taskactivities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>entryphaseactivities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>entryphaseactivities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseentryphaseactivities(entryphaseactivities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseactivity(activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>precedence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>precedence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseprecedence(precedence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>replyentry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>replyentry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casereplyentry(replyentry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>replyactivity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>replyactivity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casereplyactivity(replyactivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>synchcall</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>synchcall</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesynchcall(synchcall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>asynchcall</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>asynchcall</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseasynchcall(asynchcall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>activity R</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>activity R</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseactivityR(activityR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>pre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>pre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepre(pre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>preor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>preor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepreor(preor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>preand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>preand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepreand(preand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>post</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>post</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepost(post object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>postor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>postor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepostor(postor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>postand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>postand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepostand(postand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LqnmodelSwitch
