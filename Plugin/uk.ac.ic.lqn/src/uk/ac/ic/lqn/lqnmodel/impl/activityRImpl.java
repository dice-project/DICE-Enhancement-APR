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
import uk.ac.ic.lqn.lqnmodel.post;
import uk.ac.ic.lqn.lqnmodel.postand;
import uk.ac.ic.lqn.lqnmodel.postor;
import uk.ac.ic.lqn.lqnmodel.pre;
import uk.ac.ic.lqn.lqnmodel.preand;
import uk.ac.ic.lqn.lqnmodel.preor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>activity R</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityRImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityRImpl#getProb <em>Prob</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityRImpl#getPreActivityR <em>Pre Activity R</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityRImpl#getPreorActivityR <em>Preor Activity R</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityRImpl#getPreandActivityR <em>Preand Activity R</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityRImpl#getPostActivityR <em>Post Activity R</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityRImpl#getPostorActivityR <em>Postor Activity R</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityRImpl#getPostandActivityR <em>Postand Activity R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class activityRImpl extends MinimalEObjectImpl.Container implements activityR {
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
	 * The default value of the '{@link #getProb() <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected static final float PROB_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getProb() <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected float prob = PROB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected activityRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.ACTIVITY_R;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY_R__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getProb() {
		return prob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProb(float newProb) {
		float oldProb = prob;
		prob = newProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY_R__PROB, oldProb, prob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pre getPreActivityR() {
		if (eContainerFeatureID() != LqnmodelPackage.ACTIVITY_R__PRE_ACTIVITY_R) return null;
		return (pre)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreActivityR(pre newPreActivityR, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPreActivityR, LqnmodelPackage.ACTIVITY_R__PRE_ACTIVITY_R, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreActivityR(pre newPreActivityR) {
		if (newPreActivityR != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.ACTIVITY_R__PRE_ACTIVITY_R && newPreActivityR != null)) {
			if (EcoreUtil.isAncestor(this, newPreActivityR))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreActivityR != null)
				msgs = ((InternalEObject)newPreActivityR).eInverseAdd(this, LqnmodelPackage.PRE__ACTIVITY_RPRE, pre.class, msgs);
			msgs = basicSetPreActivityR(newPreActivityR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY_R__PRE_ACTIVITY_R, newPreActivityR, newPreActivityR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public preor getPreorActivityR() {
		if (eContainerFeatureID() != LqnmodelPackage.ACTIVITY_R__PREOR_ACTIVITY_R) return null;
		return (preor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreorActivityR(preor newPreorActivityR, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPreorActivityR, LqnmodelPackage.ACTIVITY_R__PREOR_ACTIVITY_R, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreorActivityR(preor newPreorActivityR) {
		if (newPreorActivityR != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.ACTIVITY_R__PREOR_ACTIVITY_R && newPreorActivityR != null)) {
			if (EcoreUtil.isAncestor(this, newPreorActivityR))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreorActivityR != null)
				msgs = ((InternalEObject)newPreorActivityR).eInverseAdd(this, LqnmodelPackage.PREOR__ACTIVITY_RPRE_OR, preor.class, msgs);
			msgs = basicSetPreorActivityR(newPreorActivityR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY_R__PREOR_ACTIVITY_R, newPreorActivityR, newPreorActivityR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public preand getPreandActivityR() {
		if (eContainerFeatureID() != LqnmodelPackage.ACTIVITY_R__PREAND_ACTIVITY_R) return null;
		return (preand)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreandActivityR(preand newPreandActivityR, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPreandActivityR, LqnmodelPackage.ACTIVITY_R__PREAND_ACTIVITY_R, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreandActivityR(preand newPreandActivityR) {
		if (newPreandActivityR != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.ACTIVITY_R__PREAND_ACTIVITY_R && newPreandActivityR != null)) {
			if (EcoreUtil.isAncestor(this, newPreandActivityR))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreandActivityR != null)
				msgs = ((InternalEObject)newPreandActivityR).eInverseAdd(this, LqnmodelPackage.PREAND__ACTIVITY_RPRE_AND, preand.class, msgs);
			msgs = basicSetPreandActivityR(newPreandActivityR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY_R__PREAND_ACTIVITY_R, newPreandActivityR, newPreandActivityR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public post getPostActivityR() {
		if (eContainerFeatureID() != LqnmodelPackage.ACTIVITY_R__POST_ACTIVITY_R) return null;
		return (post)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostActivityR(post newPostActivityR, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPostActivityR, LqnmodelPackage.ACTIVITY_R__POST_ACTIVITY_R, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostActivityR(post newPostActivityR) {
		if (newPostActivityR != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.ACTIVITY_R__POST_ACTIVITY_R && newPostActivityR != null)) {
			if (EcoreUtil.isAncestor(this, newPostActivityR))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPostActivityR != null)
				msgs = ((InternalEObject)newPostActivityR).eInverseAdd(this, LqnmodelPackage.POST__ACTIVITY_RPOST, post.class, msgs);
			msgs = basicSetPostActivityR(newPostActivityR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY_R__POST_ACTIVITY_R, newPostActivityR, newPostActivityR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public postor getPostorActivityR() {
		if (eContainerFeatureID() != LqnmodelPackage.ACTIVITY_R__POSTOR_ACTIVITY_R) return null;
		return (postor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostorActivityR(postor newPostorActivityR, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPostorActivityR, LqnmodelPackage.ACTIVITY_R__POSTOR_ACTIVITY_R, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostorActivityR(postor newPostorActivityR) {
		if (newPostorActivityR != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.ACTIVITY_R__POSTOR_ACTIVITY_R && newPostorActivityR != null)) {
			if (EcoreUtil.isAncestor(this, newPostorActivityR))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPostorActivityR != null)
				msgs = ((InternalEObject)newPostorActivityR).eInverseAdd(this, LqnmodelPackage.POSTOR__ACTIVITY_RPOST_OR, postor.class, msgs);
			msgs = basicSetPostorActivityR(newPostorActivityR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY_R__POSTOR_ACTIVITY_R, newPostorActivityR, newPostorActivityR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public postand getPostandActivityR() {
		if (eContainerFeatureID() != LqnmodelPackage.ACTIVITY_R__POSTAND_ACTIVITY_R) return null;
		return (postand)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostandActivityR(postand newPostandActivityR, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPostandActivityR, LqnmodelPackage.ACTIVITY_R__POSTAND_ACTIVITY_R, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostandActivityR(postand newPostandActivityR) {
		if (newPostandActivityR != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.ACTIVITY_R__POSTAND_ACTIVITY_R && newPostandActivityR != null)) {
			if (EcoreUtil.isAncestor(this, newPostandActivityR))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPostandActivityR != null)
				msgs = ((InternalEObject)newPostandActivityR).eInverseAdd(this, LqnmodelPackage.POSTAND__ACTIVITY_RPOST_AND, postand.class, msgs);
			msgs = basicSetPostandActivityR(newPostandActivityR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY_R__POSTAND_ACTIVITY_R, newPostandActivityR, newPostandActivityR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnmodelPackage.ACTIVITY_R__PRE_ACTIVITY_R:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPreActivityR((pre)otherEnd, msgs);
			case LqnmodelPackage.ACTIVITY_R__PREOR_ACTIVITY_R:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPreorActivityR((preor)otherEnd, msgs);
			case LqnmodelPackage.ACTIVITY_R__PREAND_ACTIVITY_R:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPreandActivityR((preand)otherEnd, msgs);
			case LqnmodelPackage.ACTIVITY_R__POST_ACTIVITY_R:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPostActivityR((post)otherEnd, msgs);
			case LqnmodelPackage.ACTIVITY_R__POSTOR_ACTIVITY_R:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPostorActivityR((postor)otherEnd, msgs);
			case LqnmodelPackage.ACTIVITY_R__POSTAND_ACTIVITY_R:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPostandActivityR((postand)otherEnd, msgs);
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
			case LqnmodelPackage.ACTIVITY_R__PRE_ACTIVITY_R:
				return basicSetPreActivityR(null, msgs);
			case LqnmodelPackage.ACTIVITY_R__PREOR_ACTIVITY_R:
				return basicSetPreorActivityR(null, msgs);
			case LqnmodelPackage.ACTIVITY_R__PREAND_ACTIVITY_R:
				return basicSetPreandActivityR(null, msgs);
			case LqnmodelPackage.ACTIVITY_R__POST_ACTIVITY_R:
				return basicSetPostActivityR(null, msgs);
			case LqnmodelPackage.ACTIVITY_R__POSTOR_ACTIVITY_R:
				return basicSetPostorActivityR(null, msgs);
			case LqnmodelPackage.ACTIVITY_R__POSTAND_ACTIVITY_R:
				return basicSetPostandActivityR(null, msgs);
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
			case LqnmodelPackage.ACTIVITY_R__PRE_ACTIVITY_R:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.PRE__ACTIVITY_RPRE, pre.class, msgs);
			case LqnmodelPackage.ACTIVITY_R__PREOR_ACTIVITY_R:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.PREOR__ACTIVITY_RPRE_OR, preor.class, msgs);
			case LqnmodelPackage.ACTIVITY_R__PREAND_ACTIVITY_R:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.PREAND__ACTIVITY_RPRE_AND, preand.class, msgs);
			case LqnmodelPackage.ACTIVITY_R__POST_ACTIVITY_R:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.POST__ACTIVITY_RPOST, post.class, msgs);
			case LqnmodelPackage.ACTIVITY_R__POSTOR_ACTIVITY_R:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.POSTOR__ACTIVITY_RPOST_OR, postor.class, msgs);
			case LqnmodelPackage.ACTIVITY_R__POSTAND_ACTIVITY_R:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.POSTAND__ACTIVITY_RPOST_AND, postand.class, msgs);
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
			case LqnmodelPackage.ACTIVITY_R__NAME:
				return getName();
			case LqnmodelPackage.ACTIVITY_R__PROB:
				return getProb();
			case LqnmodelPackage.ACTIVITY_R__PRE_ACTIVITY_R:
				return getPreActivityR();
			case LqnmodelPackage.ACTIVITY_R__PREOR_ACTIVITY_R:
				return getPreorActivityR();
			case LqnmodelPackage.ACTIVITY_R__PREAND_ACTIVITY_R:
				return getPreandActivityR();
			case LqnmodelPackage.ACTIVITY_R__POST_ACTIVITY_R:
				return getPostActivityR();
			case LqnmodelPackage.ACTIVITY_R__POSTOR_ACTIVITY_R:
				return getPostorActivityR();
			case LqnmodelPackage.ACTIVITY_R__POSTAND_ACTIVITY_R:
				return getPostandActivityR();
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
			case LqnmodelPackage.ACTIVITY_R__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.ACTIVITY_R__PROB:
				setProb((Float)newValue);
				return;
			case LqnmodelPackage.ACTIVITY_R__PRE_ACTIVITY_R:
				setPreActivityR((pre)newValue);
				return;
			case LqnmodelPackage.ACTIVITY_R__PREOR_ACTIVITY_R:
				setPreorActivityR((preor)newValue);
				return;
			case LqnmodelPackage.ACTIVITY_R__PREAND_ACTIVITY_R:
				setPreandActivityR((preand)newValue);
				return;
			case LqnmodelPackage.ACTIVITY_R__POST_ACTIVITY_R:
				setPostActivityR((post)newValue);
				return;
			case LqnmodelPackage.ACTIVITY_R__POSTOR_ACTIVITY_R:
				setPostorActivityR((postor)newValue);
				return;
			case LqnmodelPackage.ACTIVITY_R__POSTAND_ACTIVITY_R:
				setPostandActivityR((postand)newValue);
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
			case LqnmodelPackage.ACTIVITY_R__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.ACTIVITY_R__PROB:
				setProb(PROB_EDEFAULT);
				return;
			case LqnmodelPackage.ACTIVITY_R__PRE_ACTIVITY_R:
				setPreActivityR((pre)null);
				return;
			case LqnmodelPackage.ACTIVITY_R__PREOR_ACTIVITY_R:
				setPreorActivityR((preor)null);
				return;
			case LqnmodelPackage.ACTIVITY_R__PREAND_ACTIVITY_R:
				setPreandActivityR((preand)null);
				return;
			case LqnmodelPackage.ACTIVITY_R__POST_ACTIVITY_R:
				setPostActivityR((post)null);
				return;
			case LqnmodelPackage.ACTIVITY_R__POSTOR_ACTIVITY_R:
				setPostorActivityR((postor)null);
				return;
			case LqnmodelPackage.ACTIVITY_R__POSTAND_ACTIVITY_R:
				setPostandActivityR((postand)null);
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
			case LqnmodelPackage.ACTIVITY_R__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.ACTIVITY_R__PROB:
				return prob != PROB_EDEFAULT;
			case LqnmodelPackage.ACTIVITY_R__PRE_ACTIVITY_R:
				return getPreActivityR() != null;
			case LqnmodelPackage.ACTIVITY_R__PREOR_ACTIVITY_R:
				return getPreorActivityR() != null;
			case LqnmodelPackage.ACTIVITY_R__PREAND_ACTIVITY_R:
				return getPreandActivityR() != null;
			case LqnmodelPackage.ACTIVITY_R__POST_ACTIVITY_R:
				return getPostActivityR() != null;
			case LqnmodelPackage.ACTIVITY_R__POSTOR_ACTIVITY_R:
				return getPostorActivityR() != null;
			case LqnmodelPackage.ACTIVITY_R__POSTAND_ACTIVITY_R:
				return getPostandActivityR() != null;
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
		result.append(", prob: ");
		result.append(prob);
		result.append(')');
		return result.toString();
	}

} //activityRImpl
