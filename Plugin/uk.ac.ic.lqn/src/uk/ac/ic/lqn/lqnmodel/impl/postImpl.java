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
import uk.ac.ic.lqn.lqnmodel.precedence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>post</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.postImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.postImpl#getPrecedence4 <em>Precedence4</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.postImpl#getActivityRPost <em>Activity RPost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class postImpl extends MinimalEObjectImpl.Container implements post {
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
	 * The cached value of the '{@link #getActivityRPost() <em>Activity RPost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRPost()
	 * @generated
	 * @ordered
	 */
	protected activityR activityRPost;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected postImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.POST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.POST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public precedence getPrecedence4() {
		if (eContainerFeatureID() != LqnmodelPackage.POST__PRECEDENCE4) return null;
		return (precedence)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedence4(precedence newPrecedence4, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPrecedence4, LqnmodelPackage.POST__PRECEDENCE4, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedence4(precedence newPrecedence4) {
		if (newPrecedence4 != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.POST__PRECEDENCE4 && newPrecedence4 != null)) {
			if (EcoreUtil.isAncestor(this, newPrecedence4))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrecedence4 != null)
				msgs = ((InternalEObject)newPrecedence4).eInverseAdd(this, LqnmodelPackage.PRECEDENCE__POST, precedence.class, msgs);
			msgs = basicSetPrecedence4(newPrecedence4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.POST__PRECEDENCE4, newPrecedence4, newPrecedence4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activityR getActivityRPost() {
		return activityRPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityRPost(activityR newActivityRPost, NotificationChain msgs) {
		activityR oldActivityRPost = activityRPost;
		activityRPost = newActivityRPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnmodelPackage.POST__ACTIVITY_RPOST, oldActivityRPost, newActivityRPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityRPost(activityR newActivityRPost) {
		if (newActivityRPost != activityRPost) {
			NotificationChain msgs = null;
			if (activityRPost != null)
				msgs = ((InternalEObject)activityRPost).eInverseRemove(this, LqnmodelPackage.ACTIVITY_R__POST_ACTIVITY_R, activityR.class, msgs);
			if (newActivityRPost != null)
				msgs = ((InternalEObject)newActivityRPost).eInverseAdd(this, LqnmodelPackage.ACTIVITY_R__POST_ACTIVITY_R, activityR.class, msgs);
			msgs = basicSetActivityRPost(newActivityRPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.POST__ACTIVITY_RPOST, newActivityRPost, newActivityRPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnmodelPackage.POST__PRECEDENCE4:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPrecedence4((precedence)otherEnd, msgs);
			case LqnmodelPackage.POST__ACTIVITY_RPOST:
				if (activityRPost != null)
					msgs = ((InternalEObject)activityRPost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnmodelPackage.POST__ACTIVITY_RPOST, null, msgs);
				return basicSetActivityRPost((activityR)otherEnd, msgs);
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
			case LqnmodelPackage.POST__PRECEDENCE4:
				return basicSetPrecedence4(null, msgs);
			case LqnmodelPackage.POST__ACTIVITY_RPOST:
				return basicSetActivityRPost(null, msgs);
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
			case LqnmodelPackage.POST__PRECEDENCE4:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.PRECEDENCE__POST, precedence.class, msgs);
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
			case LqnmodelPackage.POST__NAME:
				return getName();
			case LqnmodelPackage.POST__PRECEDENCE4:
				return getPrecedence4();
			case LqnmodelPackage.POST__ACTIVITY_RPOST:
				return getActivityRPost();
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
			case LqnmodelPackage.POST__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.POST__PRECEDENCE4:
				setPrecedence4((precedence)newValue);
				return;
			case LqnmodelPackage.POST__ACTIVITY_RPOST:
				setActivityRPost((activityR)newValue);
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
			case LqnmodelPackage.POST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.POST__PRECEDENCE4:
				setPrecedence4((precedence)null);
				return;
			case LqnmodelPackage.POST__ACTIVITY_RPOST:
				setActivityRPost((activityR)null);
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
			case LqnmodelPackage.POST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.POST__PRECEDENCE4:
				return getPrecedence4() != null;
			case LqnmodelPackage.POST__ACTIVITY_RPOST:
				return activityRPost != null;
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

} //postImpl
