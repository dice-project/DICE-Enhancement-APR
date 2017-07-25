/**
 */
package uk.ac.ic.lqn.lqnmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.ic.lqn.lqnmodel.LqnmodelPackage;
import uk.ac.ic.lqn.lqnmodel.activity;
import uk.ac.ic.lqn.lqnmodel.precedence;
import uk.ac.ic.lqn.lqnmodel.replyentry;
import uk.ac.ic.lqn.lqnmodel.task;
import uk.ac.ic.lqn.lqnmodel.taskactivities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>taskactivities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.taskactivitiesImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.taskactivitiesImpl#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.taskactivitiesImpl#getReplyentry <em>Replyentry</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.taskactivitiesImpl#getTask2 <em>Task2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class taskactivitiesImpl extends MinimalEObjectImpl.Container implements taskactivities {
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<activity> activity;

	/**
	 * The cached value of the '{@link #getPrecedence() <em>Precedence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedence()
	 * @generated
	 * @ordered
	 */
	protected EList<precedence> precedence;

	/**
	 * The cached value of the '{@link #getReplyentry() <em>Replyentry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyentry()
	 * @generated
	 * @ordered
	 */
	protected EList<replyentry> replyentry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected taskactivitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.TASKACTIVITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<activity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentWithInverseEList<activity>(activity.class, this, LqnmodelPackage.TASKACTIVITIES__ACTIVITY, LqnmodelPackage.ACTIVITY__TASK_ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<precedence> getPrecedence() {
		if (precedence == null) {
			precedence = new EObjectContainmentWithInverseEList<precedence>(precedence.class, this, LqnmodelPackage.TASKACTIVITIES__PRECEDENCE, LqnmodelPackage.PRECEDENCE__TASK_ACTIVITY_P);
		}
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<replyentry> getReplyentry() {
		if (replyentry == null) {
			replyentry = new EObjectContainmentWithInverseEList<replyentry>(replyentry.class, this, LqnmodelPackage.TASKACTIVITIES__REPLYENTRY, LqnmodelPackage.REPLYENTRY__TASK_ACTIVITY_R);
		}
		return replyentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public task getTask2() {
		if (eContainerFeatureID() != LqnmodelPackage.TASKACTIVITIES__TASK2) return null;
		return (task)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask2(task newTask2, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTask2, LqnmodelPackage.TASKACTIVITIES__TASK2, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask2(task newTask2) {
		if (newTask2 != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.TASKACTIVITIES__TASK2 && newTask2 != null)) {
			if (EcoreUtil.isAncestor(this, newTask2))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTask2 != null)
				msgs = ((InternalEObject)newTask2).eInverseAdd(this, LqnmodelPackage.TASK__TASKACTIVITIES, task.class, msgs);
			msgs = basicSetTask2(newTask2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.TASKACTIVITIES__TASK2, newTask2, newTask2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnmodelPackage.TASKACTIVITIES__ACTIVITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivity()).basicAdd(otherEnd, msgs);
			case LqnmodelPackage.TASKACTIVITIES__PRECEDENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrecedence()).basicAdd(otherEnd, msgs);
			case LqnmodelPackage.TASKACTIVITIES__REPLYENTRY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReplyentry()).basicAdd(otherEnd, msgs);
			case LqnmodelPackage.TASKACTIVITIES__TASK2:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTask2((task)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnmodelPackage.TASKACTIVITIES__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case LqnmodelPackage.TASKACTIVITIES__PRECEDENCE:
				return ((InternalEList<?>)getPrecedence()).basicRemove(otherEnd, msgs);
			case LqnmodelPackage.TASKACTIVITIES__REPLYENTRY:
				return ((InternalEList<?>)getReplyentry()).basicRemove(otherEnd, msgs);
			case LqnmodelPackage.TASKACTIVITIES__TASK2:
				return basicSetTask2(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LqnmodelPackage.TASKACTIVITIES__TASK2:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.TASK__TASKACTIVITIES, task.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LqnmodelPackage.TASKACTIVITIES__ACTIVITY:
				return getActivity();
			case LqnmodelPackage.TASKACTIVITIES__PRECEDENCE:
				return getPrecedence();
			case LqnmodelPackage.TASKACTIVITIES__REPLYENTRY:
				return getReplyentry();
			case LqnmodelPackage.TASKACTIVITIES__TASK2:
				return getTask2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LqnmodelPackage.TASKACTIVITIES__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends activity>)newValue);
				return;
			case LqnmodelPackage.TASKACTIVITIES__PRECEDENCE:
				getPrecedence().clear();
				getPrecedence().addAll((Collection<? extends precedence>)newValue);
				return;
			case LqnmodelPackage.TASKACTIVITIES__REPLYENTRY:
				getReplyentry().clear();
				getReplyentry().addAll((Collection<? extends replyentry>)newValue);
				return;
			case LqnmodelPackage.TASKACTIVITIES__TASK2:
				setTask2((task)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LqnmodelPackage.TASKACTIVITIES__ACTIVITY:
				getActivity().clear();
				return;
			case LqnmodelPackage.TASKACTIVITIES__PRECEDENCE:
				getPrecedence().clear();
				return;
			case LqnmodelPackage.TASKACTIVITIES__REPLYENTRY:
				getReplyentry().clear();
				return;
			case LqnmodelPackage.TASKACTIVITIES__TASK2:
				setTask2((task)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LqnmodelPackage.TASKACTIVITIES__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case LqnmodelPackage.TASKACTIVITIES__PRECEDENCE:
				return precedence != null && !precedence.isEmpty();
			case LqnmodelPackage.TASKACTIVITIES__REPLYENTRY:
				return replyentry != null && !replyentry.isEmpty();
			case LqnmodelPackage.TASKACTIVITIES__TASK2:
				return getTask2() != null;
		}
		return super.eIsSet(featureID);
	}

} //taskactivitiesImpl
