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
import uk.ac.ic.lqn.lqnmodel.activity;
import uk.ac.ic.lqn.lqnmodel.synchcall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>synchcall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.synchcallImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.synchcallImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.synchcallImpl#getCallsmean <em>Callsmean</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.synchcallImpl#getActivitySynchCall <em>Activity Synch Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class synchcallImpl extends MinimalEObjectImpl.Container implements synchcall {
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
	 * The default value of the '{@link #getDest() <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDest()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDest() <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDest()
	 * @generated
	 * @ordered
	 */
	protected String dest = DEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallsmean() <em>Callsmean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsmean()
	 * @generated
	 * @ordered
	 */
	protected static final float CALLSMEAN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCallsmean() <em>Callsmean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsmean()
	 * @generated
	 * @ordered
	 */
	protected float callsmean = CALLSMEAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected synchcallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.SYNCHCALL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.SYNCHCALL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDest() {
		return dest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDest(String newDest) {
		String oldDest = dest;
		dest = newDest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.SYNCHCALL__DEST, oldDest, dest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCallsmean() {
		return callsmean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallsmean(float newCallsmean) {
		float oldCallsmean = callsmean;
		callsmean = newCallsmean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.SYNCHCALL__CALLSMEAN, oldCallsmean, callsmean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activity getActivitySynchCall() {
		if (eContainerFeatureID() != LqnmodelPackage.SYNCHCALL__ACTIVITY_SYNCH_CALL) return null;
		return (activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivitySynchCall(activity newActivitySynchCall, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivitySynchCall, LqnmodelPackage.SYNCHCALL__ACTIVITY_SYNCH_CALL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivitySynchCall(activity newActivitySynchCall) {
		if (newActivitySynchCall != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.SYNCHCALL__ACTIVITY_SYNCH_CALL && newActivitySynchCall != null)) {
			if (EcoreUtil.isAncestor(this, newActivitySynchCall))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivitySynchCall != null)
				msgs = ((InternalEObject)newActivitySynchCall).eInverseAdd(this, LqnmodelPackage.ACTIVITY__SYNCHCALL, activity.class, msgs);
			msgs = basicSetActivitySynchCall(newActivitySynchCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.SYNCHCALL__ACTIVITY_SYNCH_CALL, newActivitySynchCall, newActivitySynchCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnmodelPackage.SYNCHCALL__ACTIVITY_SYNCH_CALL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivitySynchCall((activity)otherEnd, msgs);
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
			case LqnmodelPackage.SYNCHCALL__ACTIVITY_SYNCH_CALL:
				return basicSetActivitySynchCall(null, msgs);
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
			case LqnmodelPackage.SYNCHCALL__ACTIVITY_SYNCH_CALL:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.ACTIVITY__SYNCHCALL, activity.class, msgs);
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
			case LqnmodelPackage.SYNCHCALL__NAME:
				return getName();
			case LqnmodelPackage.SYNCHCALL__DEST:
				return getDest();
			case LqnmodelPackage.SYNCHCALL__CALLSMEAN:
				return getCallsmean();
			case LqnmodelPackage.SYNCHCALL__ACTIVITY_SYNCH_CALL:
				return getActivitySynchCall();
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
			case LqnmodelPackage.SYNCHCALL__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.SYNCHCALL__DEST:
				setDest((String)newValue);
				return;
			case LqnmodelPackage.SYNCHCALL__CALLSMEAN:
				setCallsmean((Float)newValue);
				return;
			case LqnmodelPackage.SYNCHCALL__ACTIVITY_SYNCH_CALL:
				setActivitySynchCall((activity)newValue);
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
			case LqnmodelPackage.SYNCHCALL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.SYNCHCALL__DEST:
				setDest(DEST_EDEFAULT);
				return;
			case LqnmodelPackage.SYNCHCALL__CALLSMEAN:
				setCallsmean(CALLSMEAN_EDEFAULT);
				return;
			case LqnmodelPackage.SYNCHCALL__ACTIVITY_SYNCH_CALL:
				setActivitySynchCall((activity)null);
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
			case LqnmodelPackage.SYNCHCALL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.SYNCHCALL__DEST:
				return DEST_EDEFAULT == null ? dest != null : !DEST_EDEFAULT.equals(dest);
			case LqnmodelPackage.SYNCHCALL__CALLSMEAN:
				return callsmean != CALLSMEAN_EDEFAULT;
			case LqnmodelPackage.SYNCHCALL__ACTIVITY_SYNCH_CALL:
				return getActivitySynchCall() != null;
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
		result.append(", dest: ");
		result.append(dest);
		result.append(", callsmean: ");
		result.append(callsmean);
		result.append(')');
		return result.toString();
	}

} //synchcallImpl
