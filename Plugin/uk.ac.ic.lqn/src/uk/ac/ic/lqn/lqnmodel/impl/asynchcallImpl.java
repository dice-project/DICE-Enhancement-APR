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
import uk.ac.ic.lqn.lqnmodel.asynchcall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>asynchcall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.asynchcallImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.asynchcallImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.asynchcallImpl#getCallsmean <em>Callsmean</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.asynchcallImpl#getActivityASynchCall <em>Activity ASynch Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class asynchcallImpl extends MinimalEObjectImpl.Container implements asynchcall {
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
	protected asynchcallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.ASYNCHCALL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ASYNCHCALL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ASYNCHCALL__DEST, oldDest, dest));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ASYNCHCALL__CALLSMEAN, oldCallsmean, callsmean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activity getActivityASynchCall() {
		if (eContainerFeatureID() != LqnmodelPackage.ASYNCHCALL__ACTIVITY_ASYNCH_CALL) return null;
		return (activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityASynchCall(activity newActivityASynchCall, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivityASynchCall, LqnmodelPackage.ASYNCHCALL__ACTIVITY_ASYNCH_CALL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityASynchCall(activity newActivityASynchCall) {
		if (newActivityASynchCall != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.ASYNCHCALL__ACTIVITY_ASYNCH_CALL && newActivityASynchCall != null)) {
			if (EcoreUtil.isAncestor(this, newActivityASynchCall))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivityASynchCall != null)
				msgs = ((InternalEObject)newActivityASynchCall).eInverseAdd(this, LqnmodelPackage.ACTIVITY__ASYNCHCALL, activity.class, msgs);
			msgs = basicSetActivityASynchCall(newActivityASynchCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ASYNCHCALL__ACTIVITY_ASYNCH_CALL, newActivityASynchCall, newActivityASynchCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnmodelPackage.ASYNCHCALL__ACTIVITY_ASYNCH_CALL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivityASynchCall((activity)otherEnd, msgs);
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
			case LqnmodelPackage.ASYNCHCALL__ACTIVITY_ASYNCH_CALL:
				return basicSetActivityASynchCall(null, msgs);
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
			case LqnmodelPackage.ASYNCHCALL__ACTIVITY_ASYNCH_CALL:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.ACTIVITY__ASYNCHCALL, activity.class, msgs);
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
			case LqnmodelPackage.ASYNCHCALL__NAME:
				return getName();
			case LqnmodelPackage.ASYNCHCALL__DEST:
				return getDest();
			case LqnmodelPackage.ASYNCHCALL__CALLSMEAN:
				return getCallsmean();
			case LqnmodelPackage.ASYNCHCALL__ACTIVITY_ASYNCH_CALL:
				return getActivityASynchCall();
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
			case LqnmodelPackage.ASYNCHCALL__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.ASYNCHCALL__DEST:
				setDest((String)newValue);
				return;
			case LqnmodelPackage.ASYNCHCALL__CALLSMEAN:
				setCallsmean((Float)newValue);
				return;
			case LqnmodelPackage.ASYNCHCALL__ACTIVITY_ASYNCH_CALL:
				setActivityASynchCall((activity)newValue);
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
			case LqnmodelPackage.ASYNCHCALL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.ASYNCHCALL__DEST:
				setDest(DEST_EDEFAULT);
				return;
			case LqnmodelPackage.ASYNCHCALL__CALLSMEAN:
				setCallsmean(CALLSMEAN_EDEFAULT);
				return;
			case LqnmodelPackage.ASYNCHCALL__ACTIVITY_ASYNCH_CALL:
				setActivityASynchCall((activity)null);
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
			case LqnmodelPackage.ASYNCHCALL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.ASYNCHCALL__DEST:
				return DEST_EDEFAULT == null ? dest != null : !DEST_EDEFAULT.equals(dest);
			case LqnmodelPackage.ASYNCHCALL__CALLSMEAN:
				return callsmean != CALLSMEAN_EDEFAULT;
			case LqnmodelPackage.ASYNCHCALL__ACTIVITY_ASYNCH_CALL:
				return getActivityASynchCall() != null;
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

} //asynchcallImpl
