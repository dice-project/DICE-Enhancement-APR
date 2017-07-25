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
import uk.ac.ic.lqn.lqnmodel.post;
import uk.ac.ic.lqn.lqnmodel.postand;
import uk.ac.ic.lqn.lqnmodel.postor;
import uk.ac.ic.lqn.lqnmodel.pre;
import uk.ac.ic.lqn.lqnmodel.preand;
import uk.ac.ic.lqn.lqnmodel.precedence;
import uk.ac.ic.lqn.lqnmodel.preor;
import uk.ac.ic.lqn.lqnmodel.taskactivities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>precedence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.precedenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.precedenceImpl#getTaskActivityP <em>Task Activity P</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.precedenceImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.precedenceImpl#getPreor <em>Preor</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.precedenceImpl#getPreand <em>Preand</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.precedenceImpl#getPost <em>Post</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.precedenceImpl#getPostor <em>Postor</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.precedenceImpl#getPostand <em>Postand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class precedenceImpl extends MinimalEObjectImpl.Container implements precedence {
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
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected pre pre;

	/**
	 * The cached value of the '{@link #getPreor() <em>Preor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreor()
	 * @generated
	 * @ordered
	 */
	protected preor preor;

	/**
	 * The cached value of the '{@link #getPreand() <em>Preand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreand()
	 * @generated
	 * @ordered
	 */
	protected preand preand;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected post post;

	/**
	 * The cached value of the '{@link #getPostor() <em>Postor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostor()
	 * @generated
	 * @ordered
	 */
	protected postor postor;

	/**
	 * The cached value of the '{@link #getPostand() <em>Postand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostand()
	 * @generated
	 * @ordered
	 */
	protected postand postand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected precedenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.PRECEDENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRECEDENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public taskactivities getTaskActivityP() {
		if (eContainerFeatureID() != LqnmodelPackage.PRECEDENCE__TASK_ACTIVITY_P) return null;
		return (taskactivities)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskActivityP(taskactivities newTaskActivityP, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTaskActivityP, LqnmodelPackage.PRECEDENCE__TASK_ACTIVITY_P, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskActivityP(taskactivities newTaskActivityP) {
		if (newTaskActivityP != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.PRECEDENCE__TASK_ACTIVITY_P && newTaskActivityP != null)) {
			if (EcoreUtil.isAncestor(this, newTaskActivityP))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTaskActivityP != null)
				msgs = ((InternalEObject)newTaskActivityP).eInverseAdd(this, LqnmodelPackage.TASKACTIVITIES__PRECEDENCE, taskactivities.class, msgs);
			msgs = basicSetTaskActivityP(newTaskActivityP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRECEDENCE__TASK_ACTIVITY_P, newTaskActivityP, newTaskActivityP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pre getPre() {
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPre(pre newPre, NotificationChain msgs) {
		pre oldPre = pre;
		pre = newPre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRECEDENCE__PRE, oldPre, newPre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPre(pre newPre) {
		if (newPre != pre) {
			NotificationChain msgs = null;
			if (pre != null)
				msgs = ((InternalEObject)pre).eInverseRemove(this, LqnmodelPackage.PRE__PRECEDENCE1, pre.class, msgs);
			if (newPre != null)
				msgs = ((InternalEObject)newPre).eInverseAdd(this, LqnmodelPackage.PRE__PRECEDENCE1, pre.class, msgs);
			msgs = basicSetPre(newPre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRECEDENCE__PRE, newPre, newPre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public preor getPreor() {
		return preor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreor(preor newPreor, NotificationChain msgs) {
		preor oldPreor = preor;
		preor = newPreor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRECEDENCE__PREOR, oldPreor, newPreor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreor(preor newPreor) {
		if (newPreor != preor) {
			NotificationChain msgs = null;
			if (preor != null)
				msgs = ((InternalEObject)preor).eInverseRemove(this, LqnmodelPackage.PREOR__PRECEDENCE2, preor.class, msgs);
			if (newPreor != null)
				msgs = ((InternalEObject)newPreor).eInverseAdd(this, LqnmodelPackage.PREOR__PRECEDENCE2, preor.class, msgs);
			msgs = basicSetPreor(newPreor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRECEDENCE__PREOR, newPreor, newPreor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public preand getPreand() {
		return preand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreand(preand newPreand, NotificationChain msgs) {
		preand oldPreand = preand;
		preand = newPreand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRECEDENCE__PREAND, oldPreand, newPreand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreand(preand newPreand) {
		if (newPreand != preand) {
			NotificationChain msgs = null;
			if (preand != null)
				msgs = ((InternalEObject)preand).eInverseRemove(this, LqnmodelPackage.PREAND__PRECEDENCE3, preand.class, msgs);
			if (newPreand != null)
				msgs = ((InternalEObject)newPreand).eInverseAdd(this, LqnmodelPackage.PREAND__PRECEDENCE3, preand.class, msgs);
			msgs = basicSetPreand(newPreand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRECEDENCE__PREAND, newPreand, newPreand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public post getPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPost(post newPost, NotificationChain msgs) {
		post oldPost = post;
		post = newPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRECEDENCE__POST, oldPost, newPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(post newPost) {
		if (newPost != post) {
			NotificationChain msgs = null;
			if (post != null)
				msgs = ((InternalEObject)post).eInverseRemove(this, LqnmodelPackage.POST__PRECEDENCE4, post.class, msgs);
			if (newPost != null)
				msgs = ((InternalEObject)newPost).eInverseAdd(this, LqnmodelPackage.POST__PRECEDENCE4, post.class, msgs);
			msgs = basicSetPost(newPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRECEDENCE__POST, newPost, newPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public postor getPostor() {
		return postor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostor(postor newPostor, NotificationChain msgs) {
		postor oldPostor = postor;
		postor = newPostor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRECEDENCE__POSTOR, oldPostor, newPostor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostor(postor newPostor) {
		if (newPostor != postor) {
			NotificationChain msgs = null;
			if (postor != null)
				msgs = ((InternalEObject)postor).eInverseRemove(this, LqnmodelPackage.POSTOR__PRECEDENCE5, postor.class, msgs);
			if (newPostor != null)
				msgs = ((InternalEObject)newPostor).eInverseAdd(this, LqnmodelPackage.POSTOR__PRECEDENCE5, postor.class, msgs);
			msgs = basicSetPostor(newPostor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRECEDENCE__POSTOR, newPostor, newPostor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public postand getPostand() {
		return postand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostand(postand newPostand, NotificationChain msgs) {
		postand oldPostand = postand;
		postand = newPostand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRECEDENCE__POSTAND, oldPostand, newPostand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostand(postand newPostand) {
		if (newPostand != postand) {
			NotificationChain msgs = null;
			if (postand != null)
				msgs = ((InternalEObject)postand).eInverseRemove(this, LqnmodelPackage.POSTAND__PRECEDENCE6, postand.class, msgs);
			if (newPostand != null)
				msgs = ((InternalEObject)newPostand).eInverseAdd(this, LqnmodelPackage.POSTAND__PRECEDENCE6, postand.class, msgs);
			msgs = basicSetPostand(newPostand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PRECEDENCE__POSTAND, newPostand, newPostand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnmodelPackage.PRECEDENCE__TASK_ACTIVITY_P:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTaskActivityP((taskactivities)otherEnd, msgs);
			case LqnmodelPackage.PRECEDENCE__PRE:
				if (pre != null)
					msgs = ((InternalEObject)pre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnmodelPackage.PRECEDENCE__PRE, null, msgs);
				return basicSetPre((pre)otherEnd, msgs);
			case LqnmodelPackage.PRECEDENCE__PREOR:
				if (preor != null)
					msgs = ((InternalEObject)preor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnmodelPackage.PRECEDENCE__PREOR, null, msgs);
				return basicSetPreor((preor)otherEnd, msgs);
			case LqnmodelPackage.PRECEDENCE__PREAND:
				if (preand != null)
					msgs = ((InternalEObject)preand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnmodelPackage.PRECEDENCE__PREAND, null, msgs);
				return basicSetPreand((preand)otherEnd, msgs);
			case LqnmodelPackage.PRECEDENCE__POST:
				if (post != null)
					msgs = ((InternalEObject)post).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnmodelPackage.PRECEDENCE__POST, null, msgs);
				return basicSetPost((post)otherEnd, msgs);
			case LqnmodelPackage.PRECEDENCE__POSTOR:
				if (postor != null)
					msgs = ((InternalEObject)postor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnmodelPackage.PRECEDENCE__POSTOR, null, msgs);
				return basicSetPostor((postor)otherEnd, msgs);
			case LqnmodelPackage.PRECEDENCE__POSTAND:
				if (postand != null)
					msgs = ((InternalEObject)postand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnmodelPackage.PRECEDENCE__POSTAND, null, msgs);
				return basicSetPostand((postand)otherEnd, msgs);
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
			case LqnmodelPackage.PRECEDENCE__TASK_ACTIVITY_P:
				return basicSetTaskActivityP(null, msgs);
			case LqnmodelPackage.PRECEDENCE__PRE:
				return basicSetPre(null, msgs);
			case LqnmodelPackage.PRECEDENCE__PREOR:
				return basicSetPreor(null, msgs);
			case LqnmodelPackage.PRECEDENCE__PREAND:
				return basicSetPreand(null, msgs);
			case LqnmodelPackage.PRECEDENCE__POST:
				return basicSetPost(null, msgs);
			case LqnmodelPackage.PRECEDENCE__POSTOR:
				return basicSetPostor(null, msgs);
			case LqnmodelPackage.PRECEDENCE__POSTAND:
				return basicSetPostand(null, msgs);
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
			case LqnmodelPackage.PRECEDENCE__TASK_ACTIVITY_P:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.TASKACTIVITIES__PRECEDENCE, taskactivities.class, msgs);
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
			case LqnmodelPackage.PRECEDENCE__NAME:
				return getName();
			case LqnmodelPackage.PRECEDENCE__TASK_ACTIVITY_P:
				return getTaskActivityP();
			case LqnmodelPackage.PRECEDENCE__PRE:
				return getPre();
			case LqnmodelPackage.PRECEDENCE__PREOR:
				return getPreor();
			case LqnmodelPackage.PRECEDENCE__PREAND:
				return getPreand();
			case LqnmodelPackage.PRECEDENCE__POST:
				return getPost();
			case LqnmodelPackage.PRECEDENCE__POSTOR:
				return getPostor();
			case LqnmodelPackage.PRECEDENCE__POSTAND:
				return getPostand();
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
			case LqnmodelPackage.PRECEDENCE__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.PRECEDENCE__TASK_ACTIVITY_P:
				setTaskActivityP((taskactivities)newValue);
				return;
			case LqnmodelPackage.PRECEDENCE__PRE:
				setPre((pre)newValue);
				return;
			case LqnmodelPackage.PRECEDENCE__PREOR:
				setPreor((preor)newValue);
				return;
			case LqnmodelPackage.PRECEDENCE__PREAND:
				setPreand((preand)newValue);
				return;
			case LqnmodelPackage.PRECEDENCE__POST:
				setPost((post)newValue);
				return;
			case LqnmodelPackage.PRECEDENCE__POSTOR:
				setPostor((postor)newValue);
				return;
			case LqnmodelPackage.PRECEDENCE__POSTAND:
				setPostand((postand)newValue);
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
			case LqnmodelPackage.PRECEDENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.PRECEDENCE__TASK_ACTIVITY_P:
				setTaskActivityP((taskactivities)null);
				return;
			case LqnmodelPackage.PRECEDENCE__PRE:
				setPre((pre)null);
				return;
			case LqnmodelPackage.PRECEDENCE__PREOR:
				setPreor((preor)null);
				return;
			case LqnmodelPackage.PRECEDENCE__PREAND:
				setPreand((preand)null);
				return;
			case LqnmodelPackage.PRECEDENCE__POST:
				setPost((post)null);
				return;
			case LqnmodelPackage.PRECEDENCE__POSTOR:
				setPostor((postor)null);
				return;
			case LqnmodelPackage.PRECEDENCE__POSTAND:
				setPostand((postand)null);
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
			case LqnmodelPackage.PRECEDENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.PRECEDENCE__TASK_ACTIVITY_P:
				return getTaskActivityP() != null;
			case LqnmodelPackage.PRECEDENCE__PRE:
				return pre != null;
			case LqnmodelPackage.PRECEDENCE__PREOR:
				return preor != null;
			case LqnmodelPackage.PRECEDENCE__PREAND:
				return preand != null;
			case LqnmodelPackage.PRECEDENCE__POST:
				return post != null;
			case LqnmodelPackage.PRECEDENCE__POSTOR:
				return postor != null;
			case LqnmodelPackage.PRECEDENCE__POSTAND:
				return postand != null;
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

} //precedenceImpl
