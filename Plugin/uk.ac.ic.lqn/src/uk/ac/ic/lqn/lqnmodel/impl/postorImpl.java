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
import uk.ac.ic.lqn.lqnmodel.postor;
import uk.ac.ic.lqn.lqnmodel.precedence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>postor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.postorImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.postorImpl#getPrecedence5 <em>Precedence5</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.postorImpl#getActivityRPostOr <em>Activity RPost Or</em>}</li>
 * </ul>
 *
 * @generated
 */
public class postorImpl extends MinimalEObjectImpl.Container implements postor {
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
	 * The cached value of the '{@link #getActivityRPostOr() <em>Activity RPost Or</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRPostOr()
	 * @generated
	 * @ordered
	 */
	protected EList<activityR> activityRPostOr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected postorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.POSTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.POSTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public precedence getPrecedence5() {
		if (eContainerFeatureID() != LqnmodelPackage.POSTOR__PRECEDENCE5) return null;
		return (precedence)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedence5(precedence newPrecedence5, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPrecedence5, LqnmodelPackage.POSTOR__PRECEDENCE5, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedence5(precedence newPrecedence5) {
		if (newPrecedence5 != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.POSTOR__PRECEDENCE5 && newPrecedence5 != null)) {
			if (EcoreUtil.isAncestor(this, newPrecedence5))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrecedence5 != null)
				msgs = ((InternalEObject)newPrecedence5).eInverseAdd(this, LqnmodelPackage.PRECEDENCE__POSTOR, precedence.class, msgs);
			msgs = basicSetPrecedence5(newPrecedence5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.POSTOR__PRECEDENCE5, newPrecedence5, newPrecedence5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<activityR> getActivityRPostOr() {
		if (activityRPostOr == null) {
			activityRPostOr = new EObjectContainmentWithInverseEList<activityR>(activityR.class, this, LqnmodelPackage.POSTOR__ACTIVITY_RPOST_OR, LqnmodelPackage.ACTIVITY_R__POSTOR_ACTIVITY_R);
		}
		return activityRPostOr;
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
			case LqnmodelPackage.POSTOR__PRECEDENCE5:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPrecedence5((precedence)otherEnd, msgs);
			case LqnmodelPackage.POSTOR__ACTIVITY_RPOST_OR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityRPostOr()).basicAdd(otherEnd, msgs);
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
			case LqnmodelPackage.POSTOR__PRECEDENCE5:
				return basicSetPrecedence5(null, msgs);
			case LqnmodelPackage.POSTOR__ACTIVITY_RPOST_OR:
				return ((InternalEList<?>)getActivityRPostOr()).basicRemove(otherEnd, msgs);
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
			case LqnmodelPackage.POSTOR__PRECEDENCE5:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.PRECEDENCE__POSTOR, precedence.class, msgs);
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
			case LqnmodelPackage.POSTOR__NAME:
				return getName();
			case LqnmodelPackage.POSTOR__PRECEDENCE5:
				return getPrecedence5();
			case LqnmodelPackage.POSTOR__ACTIVITY_RPOST_OR:
				return getActivityRPostOr();
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
			case LqnmodelPackage.POSTOR__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.POSTOR__PRECEDENCE5:
				setPrecedence5((precedence)newValue);
				return;
			case LqnmodelPackage.POSTOR__ACTIVITY_RPOST_OR:
				getActivityRPostOr().clear();
				getActivityRPostOr().addAll((Collection<? extends activityR>)newValue);
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
			case LqnmodelPackage.POSTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.POSTOR__PRECEDENCE5:
				setPrecedence5((precedence)null);
				return;
			case LqnmodelPackage.POSTOR__ACTIVITY_RPOST_OR:
				getActivityRPostOr().clear();
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
			case LqnmodelPackage.POSTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.POSTOR__PRECEDENCE5:
				return getPrecedence5() != null;
			case LqnmodelPackage.POSTOR__ACTIVITY_RPOST_OR:
				return activityRPostOr != null && !activityRPostOr.isEmpty();
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

} //postorImpl
