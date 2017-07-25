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
import uk.ac.ic.lqn.lqnmodel.entry;
import uk.ac.ic.lqn.lqnmodel.entryphaseactivities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>entryphaseactivities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.entryphaseactivitiesImpl#getActivity1 <em>Activity1</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.entryphaseactivitiesImpl#getEntry1 <em>Entry1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class entryphaseactivitiesImpl extends MinimalEObjectImpl.Container implements entryphaseactivities {
	/**
	 * The cached value of the '{@link #getActivity1() <em>Activity1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity1()
	 * @generated
	 * @ordered
	 */
	protected EList<activity> activity1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected entryphaseactivitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.ENTRYPHASEACTIVITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<activity> getActivity1() {
		if (activity1 == null) {
			activity1 = new EObjectContainmentWithInverseEList<activity>(activity.class, this, LqnmodelPackage.ENTRYPHASEACTIVITIES__ACTIVITY1, LqnmodelPackage.ACTIVITY__ENTRYPHASEACTIVITIES1);
		}
		return activity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public entry getEntry1() {
		if (eContainerFeatureID() != LqnmodelPackage.ENTRYPHASEACTIVITIES__ENTRY1) return null;
		return (entry)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry1(entry newEntry1, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntry1, LqnmodelPackage.ENTRYPHASEACTIVITIES__ENTRY1, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry1(entry newEntry1) {
		if (newEntry1 != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.ENTRYPHASEACTIVITIES__ENTRY1 && newEntry1 != null)) {
			if (EcoreUtil.isAncestor(this, newEntry1))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntry1 != null)
				msgs = ((InternalEObject)newEntry1).eInverseAdd(this, LqnmodelPackage.ENTRY__ENTRYPHASEACTIVITIES, entry.class, msgs);
			msgs = basicSetEntry1(newEntry1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ENTRYPHASEACTIVITIES__ENTRY1, newEntry1, newEntry1));
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
			case LqnmodelPackage.ENTRYPHASEACTIVITIES__ACTIVITY1:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivity1()).basicAdd(otherEnd, msgs);
			case LqnmodelPackage.ENTRYPHASEACTIVITIES__ENTRY1:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEntry1((entry)otherEnd, msgs);
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
			case LqnmodelPackage.ENTRYPHASEACTIVITIES__ACTIVITY1:
				return ((InternalEList<?>)getActivity1()).basicRemove(otherEnd, msgs);
			case LqnmodelPackage.ENTRYPHASEACTIVITIES__ENTRY1:
				return basicSetEntry1(null, msgs);
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
			case LqnmodelPackage.ENTRYPHASEACTIVITIES__ENTRY1:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.ENTRY__ENTRYPHASEACTIVITIES, entry.class, msgs);
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
			case LqnmodelPackage.ENTRYPHASEACTIVITIES__ACTIVITY1:
				return getActivity1();
			case LqnmodelPackage.ENTRYPHASEACTIVITIES__ENTRY1:
				return getEntry1();
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
			case LqnmodelPackage.ENTRYPHASEACTIVITIES__ACTIVITY1:
				getActivity1().clear();
				getActivity1().addAll((Collection<? extends activity>)newValue);
				return;
			case LqnmodelPackage.ENTRYPHASEACTIVITIES__ENTRY1:
				setEntry1((entry)newValue);
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
			case LqnmodelPackage.ENTRYPHASEACTIVITIES__ACTIVITY1:
				getActivity1().clear();
				return;
			case LqnmodelPackage.ENTRYPHASEACTIVITIES__ENTRY1:
				setEntry1((entry)null);
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
			case LqnmodelPackage.ENTRYPHASEACTIVITIES__ACTIVITY1:
				return activity1 != null && !activity1.isEmpty();
			case LqnmodelPackage.ENTRYPHASEACTIVITIES__ENTRY1:
				return getEntry1() != null;
		}
		return super.eIsSet(featureID);
	}

} //entryphaseactivitiesImpl
