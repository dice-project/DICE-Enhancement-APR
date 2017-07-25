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
import uk.ac.ic.lqn.lqnmodel.preand;
import uk.ac.ic.lqn.lqnmodel.precedence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>preand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.preandImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.preandImpl#getQuorum <em>Quorum</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.preandImpl#getPrecedence3 <em>Precedence3</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.preandImpl#getActivityRPreAnd <em>Activity RPre And</em>}</li>
 * </ul>
 *
 * @generated
 */
public class preandImpl extends MinimalEObjectImpl.Container implements preand {
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
	 * The default value of the '{@link #getQuorum() <em>Quorum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuorum()
	 * @generated
	 * @ordered
	 */
	protected static final int QUORUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuorum() <em>Quorum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuorum()
	 * @generated
	 * @ordered
	 */
	protected int quorum = QUORUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivityRPreAnd() <em>Activity RPre And</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRPreAnd()
	 * @generated
	 * @ordered
	 */
	protected EList<activityR> activityRPreAnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected preandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.PREAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PREAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuorum() {
		return quorum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuorum(int newQuorum) {
		int oldQuorum = quorum;
		quorum = newQuorum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PREAND__QUORUM, oldQuorum, quorum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public precedence getPrecedence3() {
		if (eContainerFeatureID() != LqnmodelPackage.PREAND__PRECEDENCE3) return null;
		return (precedence)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedence3(precedence newPrecedence3, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPrecedence3, LqnmodelPackage.PREAND__PRECEDENCE3, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedence3(precedence newPrecedence3) {
		if (newPrecedence3 != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.PREAND__PRECEDENCE3 && newPrecedence3 != null)) {
			if (EcoreUtil.isAncestor(this, newPrecedence3))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrecedence3 != null)
				msgs = ((InternalEObject)newPrecedence3).eInverseAdd(this, LqnmodelPackage.PRECEDENCE__PREAND, precedence.class, msgs);
			msgs = basicSetPrecedence3(newPrecedence3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PREAND__PRECEDENCE3, newPrecedence3, newPrecedence3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<activityR> getActivityRPreAnd() {
		if (activityRPreAnd == null) {
			activityRPreAnd = new EObjectContainmentWithInverseEList<activityR>(activityR.class, this, LqnmodelPackage.PREAND__ACTIVITY_RPRE_AND, LqnmodelPackage.ACTIVITY_R__PREAND_ACTIVITY_R);
		}
		return activityRPreAnd;
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
			case LqnmodelPackage.PREAND__PRECEDENCE3:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPrecedence3((precedence)otherEnd, msgs);
			case LqnmodelPackage.PREAND__ACTIVITY_RPRE_AND:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityRPreAnd()).basicAdd(otherEnd, msgs);
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
			case LqnmodelPackage.PREAND__PRECEDENCE3:
				return basicSetPrecedence3(null, msgs);
			case LqnmodelPackage.PREAND__ACTIVITY_RPRE_AND:
				return ((InternalEList<?>)getActivityRPreAnd()).basicRemove(otherEnd, msgs);
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
			case LqnmodelPackage.PREAND__PRECEDENCE3:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.PRECEDENCE__PREAND, precedence.class, msgs);
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
			case LqnmodelPackage.PREAND__NAME:
				return getName();
			case LqnmodelPackage.PREAND__QUORUM:
				return getQuorum();
			case LqnmodelPackage.PREAND__PRECEDENCE3:
				return getPrecedence3();
			case LqnmodelPackage.PREAND__ACTIVITY_RPRE_AND:
				return getActivityRPreAnd();
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
			case LqnmodelPackage.PREAND__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.PREAND__QUORUM:
				setQuorum((Integer)newValue);
				return;
			case LqnmodelPackage.PREAND__PRECEDENCE3:
				setPrecedence3((precedence)newValue);
				return;
			case LqnmodelPackage.PREAND__ACTIVITY_RPRE_AND:
				getActivityRPreAnd().clear();
				getActivityRPreAnd().addAll((Collection<? extends activityR>)newValue);
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
			case LqnmodelPackage.PREAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.PREAND__QUORUM:
				setQuorum(QUORUM_EDEFAULT);
				return;
			case LqnmodelPackage.PREAND__PRECEDENCE3:
				setPrecedence3((precedence)null);
				return;
			case LqnmodelPackage.PREAND__ACTIVITY_RPRE_AND:
				getActivityRPreAnd().clear();
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
			case LqnmodelPackage.PREAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.PREAND__QUORUM:
				return quorum != QUORUM_EDEFAULT;
			case LqnmodelPackage.PREAND__PRECEDENCE3:
				return getPrecedence3() != null;
			case LqnmodelPackage.PREAND__ACTIVITY_RPRE_AND:
				return activityRPreAnd != null && !activityRPreAnd.isEmpty();
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
		result.append(", quorum: ");
		result.append(quorum);
		result.append(')');
		return result.toString();
	}

} //preandImpl
