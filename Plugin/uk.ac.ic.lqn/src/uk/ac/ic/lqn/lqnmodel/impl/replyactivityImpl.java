/**
 */
package uk.ac.ic.lqn.lqnmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.ic.lqn.lqnmodel.LqnmodelPackage;
import uk.ac.ic.lqn.lqnmodel.replyactivity;
import uk.ac.ic.lqn.lqnmodel.replyentry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>replyactivity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.replyactivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.replyactivityImpl#getReplyEntry1 <em>Reply Entry1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class replyactivityImpl extends MinimalEObjectImpl.Container implements replyactivity {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected replyactivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.REPLYACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.REPLYACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public replyentry getReplyEntry1() {
		if (eContainerFeatureID() != LqnmodelPackage.REPLYACTIVITY__REPLY_ENTRY1) return null;
		return (replyentry)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplyEntry1(replyentry newReplyEntry1, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReplyEntry1, LqnmodelPackage.REPLYACTIVITY__REPLY_ENTRY1, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyEntry1(replyentry newReplyEntry1) {
		if (newReplyEntry1 != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.REPLYACTIVITY__REPLY_ENTRY1 && newReplyEntry1 != null)) {
			if (EcoreUtil.isAncestor(this, newReplyEntry1))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReplyEntry1 != null)
				msgs = ((InternalEObject)newReplyEntry1).eInverseAdd(this, LqnmodelPackage.REPLYENTRY__REPLYACTIVITY, replyentry.class, msgs);
			msgs = basicSetReplyEntry1(newReplyEntry1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.REPLYACTIVITY__REPLY_ENTRY1, newReplyEntry1, newReplyEntry1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnmodelPackage.REPLYACTIVITY__REPLY_ENTRY1:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReplyEntry1((replyentry)otherEnd, msgs);
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
			case LqnmodelPackage.REPLYACTIVITY__REPLY_ENTRY1:
				return basicSetReplyEntry1(null, msgs);
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
			case LqnmodelPackage.REPLYACTIVITY__REPLY_ENTRY1:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.REPLYENTRY__REPLYACTIVITY, replyentry.class, msgs);
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
			case LqnmodelPackage.REPLYACTIVITY__NAME:
				return getName();
			case LqnmodelPackage.REPLYACTIVITY__REPLY_ENTRY1:
				return getReplyEntry1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LqnmodelPackage.REPLYACTIVITY__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.REPLYACTIVITY__REPLY_ENTRY1:
				setReplyEntry1((replyentry)newValue);
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
			case LqnmodelPackage.REPLYACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.REPLYACTIVITY__REPLY_ENTRY1:
				setReplyEntry1((replyentry)null);
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
			case LqnmodelPackage.REPLYACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.REPLYACTIVITY__REPLY_ENTRY1:
				return getReplyEntry1() != null;
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

} //replyactivityImpl
