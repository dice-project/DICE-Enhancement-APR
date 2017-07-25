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
import uk.ac.ic.lqn.lqnmodel.activityR;
import uk.ac.ic.lqn.lqnmodel.pre;
import uk.ac.ic.lqn.lqnmodel.precedence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>pre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.preImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.preImpl#getPrecedence1 <em>Precedence1</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.preImpl#getActivityRPre <em>Activity RPre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class preImpl extends MinimalEObjectImpl.Container implements pre {
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
	 * The cached value of the '{@link #getActivityRPre() <em>Activity RPre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRPre()
	 * @generated
	 * @ordered
	 */
	protected activityR activityRPre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected preImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.PRE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public precedence getPrecedence1() {
		if (eContainerFeatureID() != LqnmodelPackage.PRE__PRECEDENCE1) return null;
		return (precedence)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedence1(precedence newPrecedence1, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPrecedence1, LqnmodelPackage.PRE__PRECEDENCE1, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedence1(precedence newPrecedence1) {
		if (newPrecedence1 != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.PRE__PRECEDENCE1 && newPrecedence1 != null)) {
			if (EcoreUtil.isAncestor(this, newPrecedence1))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrecedence1 != null)
				msgs = ((InternalEObject)newPrecedence1).eInverseAdd(this, LqnmodelPackage.PRECEDENCE__PRE, precedence.class, msgs);
			msgs = basicSetPrecedence1(newPrecedence1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRE__PRECEDENCE1, newPrecedence1, newPrecedence1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activityR getActivityRPre() {
		return activityRPre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityRPre(activityR newActivityRPre, NotificationChain msgs) {
		activityR oldActivityRPre = activityRPre;
		activityRPre = newActivityRPre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRE__ACTIVITY_RPRE, oldActivityRPre, newActivityRPre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityRPre(activityR newActivityRPre) {
		if (newActivityRPre != activityRPre) {
			NotificationChain msgs = null;
			if (activityRPre != null)
				msgs = ((InternalEObject)activityRPre).eInverseRemove(this, LqnmodelPackage.ACTIVITY_R__PRE_ACTIVITY_R, activityR.class, msgs);
			if (newActivityRPre != null)
				msgs = ((InternalEObject)newActivityRPre).eInverseAdd(this, LqnmodelPackage.ACTIVITY_R__PRE_ACTIVITY_R, activityR.class, msgs);
			msgs = basicSetActivityRPre(newActivityRPre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRE__ACTIVITY_RPRE, newActivityRPre, newActivityRPre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnmodelPackage.PRE__PRECEDENCE1:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPrecedence1((precedence)otherEnd, msgs);
			case LqnmodelPackage.PRE__ACTIVITY_RPRE:
				if (activityRPre != null)
					msgs = ((InternalEObject)activityRPre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnmodelPackage.PRE__ACTIVITY_RPRE, null, msgs);
				return basicSetActivityRPre((activityR)otherEnd, msgs);
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
			case LqnmodelPackage.PRE__PRECEDENCE1:
				return basicSetPrecedence1(null, msgs);
			case LqnmodelPackage.PRE__ACTIVITY_RPRE:
				return basicSetActivityRPre(null, msgs);
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
			case LqnmodelPackage.PRE__PRECEDENCE1:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.PRECEDENCE__PRE, precedence.class, msgs);
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
			case LqnmodelPackage.PRE__NAME:
				return getName();
			case LqnmodelPackage.PRE__PRECEDENCE1:
				return getPrecedence1();
			case LqnmodelPackage.PRE__ACTIVITY_RPRE:
				return getActivityRPre();
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
			case LqnmodelPackage.PRE__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.PRE__PRECEDENCE1:
				setPrecedence1((precedence)newValue);
				return;
			case LqnmodelPackage.PRE__ACTIVITY_RPRE:
				setActivityRPre((activityR)newValue);
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
			case LqnmodelPackage.PRE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.PRE__PRECEDENCE1:
				setPrecedence1((precedence)null);
				return;
			case LqnmodelPackage.PRE__ACTIVITY_RPRE:
				setActivityRPre((activityR)null);
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
			case LqnmodelPackage.PRE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.PRE__PRECEDENCE1:
				return getPrecedence1() != null;
			case LqnmodelPackage.PRE__ACTIVITY_RPRE:
				return activityRPre != null;
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

} //preImpl
