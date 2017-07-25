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
import uk.ac.ic.lqn.lqnmodel.activityR;
import uk.ac.ic.lqn.lqnmodel.precedence;
import uk.ac.ic.lqn.lqnmodel.preor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>preor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.preorImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.preorImpl#getPrecedence2 <em>Precedence2</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.preorImpl#getActivityRPreOr <em>Activity RPre Or</em>}</li>
 * </ul>
 *
 * @generated
 */
public class preorImpl extends MinimalEObjectImpl.Container implements preor {
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
	 * The cached value of the '{@link #getActivityRPreOr() <em>Activity RPre Or</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRPreOr()
	 * @generated
	 * @ordered
	 */
	protected EList<activityR> activityRPreOr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected preorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.PREOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PREOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public precedence getPrecedence2() {
		if (eContainerFeatureID() != LqnmodelPackage.PREOR__PRECEDENCE2) return null;
		return (precedence)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedence2(precedence newPrecedence2, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPrecedence2, LqnmodelPackage.PREOR__PRECEDENCE2, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedence2(precedence newPrecedence2) {
		if (newPrecedence2 != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.PREOR__PRECEDENCE2 && newPrecedence2 != null)) {
			if (EcoreUtil.isAncestor(this, newPrecedence2))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrecedence2 != null)
				msgs = ((InternalEObject)newPrecedence2).eInverseAdd(this, LqnmodelPackage.PRECEDENCE__PREOR, precedence.class, msgs);
			msgs = basicSetPrecedence2(newPrecedence2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PREOR__PRECEDENCE2, newPrecedence2, newPrecedence2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<activityR> getActivityRPreOr() {
		if (activityRPreOr == null) {
			activityRPreOr = new EObjectContainmentWithInverseEList<activityR>(activityR.class, this, LqnmodelPackage.PREOR__ACTIVITY_RPRE_OR, LqnmodelPackage.ACTIVITY_R__PREOR_ACTIVITY_R);
		}
		return activityRPreOr;
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
			case LqnmodelPackage.PREOR__PRECEDENCE2:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPrecedence2((precedence)otherEnd, msgs);
			case LqnmodelPackage.PREOR__ACTIVITY_RPRE_OR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityRPreOr()).basicAdd(otherEnd, msgs);
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
			case LqnmodelPackage.PREOR__PRECEDENCE2:
				return basicSetPrecedence2(null, msgs);
			case LqnmodelPackage.PREOR__ACTIVITY_RPRE_OR:
				return ((InternalEList<?>)getActivityRPreOr()).basicRemove(otherEnd, msgs);
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
			case LqnmodelPackage.PREOR__PRECEDENCE2:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.PRECEDENCE__PREOR, precedence.class, msgs);
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
			case LqnmodelPackage.PREOR__NAME:
				return getName();
			case LqnmodelPackage.PREOR__PRECEDENCE2:
				return getPrecedence2();
			case LqnmodelPackage.PREOR__ACTIVITY_RPRE_OR:
				return getActivityRPreOr();
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
			case LqnmodelPackage.PREOR__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.PREOR__PRECEDENCE2:
				setPrecedence2((precedence)newValue);
				return;
			case LqnmodelPackage.PREOR__ACTIVITY_RPRE_OR:
				getActivityRPreOr().clear();
				getActivityRPreOr().addAll((Collection<? extends activityR>)newValue);
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
			case LqnmodelPackage.PREOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.PREOR__PRECEDENCE2:
				setPrecedence2((precedence)null);
				return;
			case LqnmodelPackage.PREOR__ACTIVITY_RPRE_OR:
				getActivityRPreOr().clear();
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
			case LqnmodelPackage.PREOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.PREOR__PRECEDENCE2:
				return getPrecedence2() != null;
			case LqnmodelPackage.PREOR__ACTIVITY_RPRE_OR:
				return activityRPreOr != null && !activityRPreOr.isEmpty();
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

} //preorImpl
