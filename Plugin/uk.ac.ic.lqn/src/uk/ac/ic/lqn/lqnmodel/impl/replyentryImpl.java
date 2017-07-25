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
import uk.ac.ic.lqn.lqnmodel.replyactivity;
import uk.ac.ic.lqn.lqnmodel.replyentry;
import uk.ac.ic.lqn.lqnmodel.taskactivities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>replyentry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.replyentryImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.replyentryImpl#getTaskActivityR <em>Task Activity R</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.replyentryImpl#getReplyactivity <em>Replyactivity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class replyentryImpl extends MinimalEObjectImpl.Container implements replyentry {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReplyactivity() <em>Replyactivity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyactivity()
	 * @generated
	 * @ordered
	 */
	protected EList<replyactivity> replyactivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected replyentryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.REPLYENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.REPLYENTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public taskactivities getTaskActivityR() {
		if (eContainerFeatureID() != LqnmodelPackage.REPLYENTRY__TASK_ACTIVITY_R) return null;
		return (taskactivities)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskActivityR(taskactivities newTaskActivityR, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTaskActivityR, LqnmodelPackage.REPLYENTRY__TASK_ACTIVITY_R, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskActivityR(taskactivities newTaskActivityR) {
		if (newTaskActivityR != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.REPLYENTRY__TASK_ACTIVITY_R && newTaskActivityR != null)) {
			if (EcoreUtil.isAncestor(this, newTaskActivityR))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTaskActivityR != null)
				msgs = ((InternalEObject)newTaskActivityR).eInverseAdd(this, LqnmodelPackage.TASKACTIVITIES__REPLYENTRY, taskactivities.class, msgs);
			msgs = basicSetTaskActivityR(newTaskActivityR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.REPLYENTRY__TASK_ACTIVITY_R, newTaskActivityR, newTaskActivityR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<replyactivity> getReplyactivity() {
		if (replyactivity == null) {
			replyactivity = new EObjectContainmentWithInverseEList<replyactivity>(replyactivity.class, this, LqnmodelPackage.REPLYENTRY__REPLYACTIVITY, LqnmodelPackage.REPLYACTIVITY__REPLY_ENTRY1);
		}
		return replyactivity;
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
			case LqnmodelPackage.REPLYENTRY__TASK_ACTIVITY_R:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTaskActivityR((taskactivities)otherEnd, msgs);
			case LqnmodelPackage.REPLYENTRY__REPLYACTIVITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReplyactivity()).basicAdd(otherEnd, msgs);
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
			case LqnmodelPackage.REPLYENTRY__TASK_ACTIVITY_R:
				return basicSetTaskActivityR(null, msgs);
			case LqnmodelPackage.REPLYENTRY__REPLYACTIVITY:
				return ((InternalEList<?>)getReplyactivity()).basicRemove(otherEnd, msgs);
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
			case LqnmodelPackage.REPLYENTRY__TASK_ACTIVITY_R:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.TASKACTIVITIES__REPLYENTRY, taskactivities.class, msgs);
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
			case LqnmodelPackage.REPLYENTRY__NAME:
				return getName();
			case LqnmodelPackage.REPLYENTRY__TASK_ACTIVITY_R:
				return getTaskActivityR();
			case LqnmodelPackage.REPLYENTRY__REPLYACTIVITY:
				return getReplyactivity();
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
			case LqnmodelPackage.REPLYENTRY__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.REPLYENTRY__TASK_ACTIVITY_R:
				setTaskActivityR((taskactivities)newValue);
				return;
			case LqnmodelPackage.REPLYENTRY__REPLYACTIVITY:
				getReplyactivity().clear();
				getReplyactivity().addAll((Collection<? extends replyactivity>)newValue);
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
			case LqnmodelPackage.REPLYENTRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.REPLYENTRY__TASK_ACTIVITY_R:
				setTaskActivityR((taskactivities)null);
				return;
			case LqnmodelPackage.REPLYENTRY__REPLYACTIVITY:
				getReplyactivity().clear();
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
			case LqnmodelPackage.REPLYENTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.REPLYENTRY__TASK_ACTIVITY_R:
				return getTaskActivityR() != null;
			case LqnmodelPackage.REPLYENTRY__REPLYACTIVITY:
				return replyactivity != null && !replyactivity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //replyentryImpl
