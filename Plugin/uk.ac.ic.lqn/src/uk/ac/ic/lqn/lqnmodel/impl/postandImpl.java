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
import uk.ac.ic.lqn.lqnmodel.postand;
import uk.ac.ic.lqn.lqnmodel.precedence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>postand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.postandImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.postandImpl#getPrecedence6 <em>Precedence6</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.postandImpl#getActivityRPostAnd <em>Activity RPost And</em>}</li>
 * </ul>
 *
 * @generated
 */
public class postandImpl extends MinimalEObjectImpl.Container implements postand {
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
	 * The cached value of the '{@link #getActivityRPostAnd() <em>Activity RPost And</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRPostAnd()
	 * @generated
	 * @ordered
	 */
	protected EList<activityR> activityRPostAnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected postandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.POSTAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.POSTAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public precedence getPrecedence6() {
		if (eContainerFeatureID() != LqnmodelPackage.POSTAND__PRECEDENCE6) return null;
		return (precedence)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedence6(precedence newPrecedence6, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPrecedence6, LqnmodelPackage.POSTAND__PRECEDENCE6, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedence6(precedence newPrecedence6) {
		if (newPrecedence6 != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.POSTAND__PRECEDENCE6 && newPrecedence6 != null)) {
			if (EcoreUtil.isAncestor(this, newPrecedence6))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrecedence6 != null)
				msgs = ((InternalEObject)newPrecedence6).eInverseAdd(this, LqnmodelPackage.PRECEDENCE__POSTAND, precedence.class, msgs);
			msgs = basicSetPrecedence6(newPrecedence6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.POSTAND__PRECEDENCE6, newPrecedence6, newPrecedence6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<activityR> getActivityRPostAnd() {
		if (activityRPostAnd == null) {
			activityRPostAnd = new EObjectContainmentWithInverseEList<activityR>(activityR.class, this, LqnmodelPackage.POSTAND__ACTIVITY_RPOST_AND, LqnmodelPackage.ACTIVITY_R__POSTAND_ACTIVITY_R);
		}
		return activityRPostAnd;
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
			case LqnmodelPackage.POSTAND__PRECEDENCE6:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPrecedence6((precedence)otherEnd, msgs);
			case LqnmodelPackage.POSTAND__ACTIVITY_RPOST_AND:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityRPostAnd()).basicAdd(otherEnd, msgs);
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
			case LqnmodelPackage.POSTAND__PRECEDENCE6:
				return basicSetPrecedence6(null, msgs);
			case LqnmodelPackage.POSTAND__ACTIVITY_RPOST_AND:
				return ((InternalEList<?>)getActivityRPostAnd()).basicRemove(otherEnd, msgs);
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
			case LqnmodelPackage.POSTAND__PRECEDENCE6:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.PRECEDENCE__POSTAND, precedence.class, msgs);
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
			case LqnmodelPackage.POSTAND__NAME:
				return getName();
			case LqnmodelPackage.POSTAND__PRECEDENCE6:
				return getPrecedence6();
			case LqnmodelPackage.POSTAND__ACTIVITY_RPOST_AND:
				return getActivityRPostAnd();
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
			case LqnmodelPackage.POSTAND__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.POSTAND__PRECEDENCE6:
				setPrecedence6((precedence)newValue);
				return;
			case LqnmodelPackage.POSTAND__ACTIVITY_RPOST_AND:
				getActivityRPostAnd().clear();
				getActivityRPostAnd().addAll((Collection<? extends activityR>)newValue);
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
			case LqnmodelPackage.POSTAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.POSTAND__PRECEDENCE6:
				setPrecedence6((precedence)null);
				return;
			case LqnmodelPackage.POSTAND__ACTIVITY_RPOST_AND:
				getActivityRPostAnd().clear();
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
			case LqnmodelPackage.POSTAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.POSTAND__PRECEDENCE6:
				return getPrecedence6() != null;
			case LqnmodelPackage.POSTAND__ACTIVITY_RPOST_AND:
				return activityRPostAnd != null && !activityRPostAnd.isEmpty();
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

} //postandImpl
