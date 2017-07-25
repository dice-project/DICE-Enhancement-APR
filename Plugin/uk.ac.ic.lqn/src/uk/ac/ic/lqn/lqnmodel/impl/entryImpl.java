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

import uk.ac.ic.lqn.lqnmodel.EntryType;
import uk.ac.ic.lqn.lqnmodel.LqnmodelPackage;
import uk.ac.ic.lqn.lqnmodel.SemaphoreType;
import uk.ac.ic.lqn.lqnmodel.entry;
import uk.ac.ic.lqn.lqnmodel.entryphaseactivities;
import uk.ac.ic.lqn.lqnmodel.task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.entryImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.entryImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.entryImpl#getOpenarrivalrate <em>Openarrivalrate</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.entryImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.entryImpl#getSemaphore <em>Semaphore</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.entryImpl#getTask1 <em>Task1</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.entryImpl#getEntryphaseactivities <em>Entryphaseactivities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class entryImpl extends MinimalEObjectImpl.Container implements entry {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EntryType TYPE_EDEFAULT = EntryType.DEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EntryType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpenarrivalrate() <em>Openarrivalrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenarrivalrate()
	 * @generated
	 * @ordered
	 */
	protected static final float OPENARRIVALRATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOpenarrivalrate() <em>Openarrivalrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenarrivalrate()
	 * @generated
	 * @ordered
	 */
	protected float openarrivalrate = OPENARRIVALRATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemaphore() <em>Semaphore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphore()
	 * @generated
	 * @ordered
	 */
	protected static final SemaphoreType SEMAPHORE_EDEFAULT = SemaphoreType.DEFAULT;

	/**
	 * The cached value of the '{@link #getSemaphore() <em>Semaphore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphore()
	 * @generated
	 * @ordered
	 */
	protected SemaphoreType semaphore = SEMAPHORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntryphaseactivities() <em>Entryphaseactivities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryphaseactivities()
	 * @generated
	 * @ordered
	 */
	protected entryphaseactivities entryphaseactivities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected entryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.ENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ENTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EntryType newType) {
		EntryType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ENTRY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOpenarrivalrate() {
		return openarrivalrate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenarrivalrate(float newOpenarrivalrate) {
		float oldOpenarrivalrate = openarrivalrate;
		openarrivalrate = newOpenarrivalrate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ENTRY__OPENARRIVALRATE, oldOpenarrivalrate, openarrivalrate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ENTRY__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreType getSemaphore() {
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemaphore(SemaphoreType newSemaphore) {
		SemaphoreType oldSemaphore = semaphore;
		semaphore = newSemaphore == null ? SEMAPHORE_EDEFAULT : newSemaphore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ENTRY__SEMAPHORE, oldSemaphore, semaphore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public task getTask1() {
		if (eContainerFeatureID() != LqnmodelPackage.ENTRY__TASK1) return null;
		return (task)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask1(task newTask1, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTask1, LqnmodelPackage.ENTRY__TASK1, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask1(task newTask1) {
		if (newTask1 != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.ENTRY__TASK1 && newTask1 != null)) {
			if (EcoreUtil.isAncestor(this, newTask1))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTask1 != null)
				msgs = ((InternalEObject)newTask1).eInverseAdd(this, LqnmodelPackage.TASK__ENTRY, task.class, msgs);
			msgs = basicSetTask1(newTask1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ENTRY__TASK1, newTask1, newTask1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public entryphaseactivities getEntryphaseactivities() {
		return entryphaseactivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryphaseactivities(entryphaseactivities newEntryphaseactivities, NotificationChain msgs) {
		entryphaseactivities oldEntryphaseactivities = entryphaseactivities;
		entryphaseactivities = newEntryphaseactivities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ENTRY__ENTRYPHASEACTIVITIES, oldEntryphaseactivities, newEntryphaseactivities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryphaseactivities(entryphaseactivities newEntryphaseactivities) {
		if (newEntryphaseactivities != entryphaseactivities) {
			NotificationChain msgs = null;
			if (entryphaseactivities != null)
				msgs = ((InternalEObject)entryphaseactivities).eInverseRemove(this, LqnmodelPackage.ENTRYPHASEACTIVITIES__ENTRY1, entryphaseactivities.class, msgs);
			if (newEntryphaseactivities != null)
				msgs = ((InternalEObject)newEntryphaseactivities).eInverseAdd(this, LqnmodelPackage.ENTRYPHASEACTIVITIES__ENTRY1, entryphaseactivities.class, msgs);
			msgs = basicSetEntryphaseactivities(newEntryphaseactivities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ENTRY__ENTRYPHASEACTIVITIES, newEntryphaseactivities, newEntryphaseactivities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnmodelPackage.ENTRY__TASK1:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTask1((task)otherEnd, msgs);
			case LqnmodelPackage.ENTRY__ENTRYPHASEACTIVITIES:
				if (entryphaseactivities != null)
					msgs = ((InternalEObject)entryphaseactivities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnmodelPackage.ENTRY__ENTRYPHASEACTIVITIES, null, msgs);
				return basicSetEntryphaseactivities((entryphaseactivities)otherEnd, msgs);
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
			case LqnmodelPackage.ENTRY__TASK1:
				return basicSetTask1(null, msgs);
			case LqnmodelPackage.ENTRY__ENTRYPHASEACTIVITIES:
				return basicSetEntryphaseactivities(null, msgs);
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
			case LqnmodelPackage.ENTRY__TASK1:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.TASK__ENTRY, task.class, msgs);
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
			case LqnmodelPackage.ENTRY__NAME:
				return getName();
			case LqnmodelPackage.ENTRY__TYPE:
				return getType();
			case LqnmodelPackage.ENTRY__OPENARRIVALRATE:
				return getOpenarrivalrate();
			case LqnmodelPackage.ENTRY__PRIORITY:
				return getPriority();
			case LqnmodelPackage.ENTRY__SEMAPHORE:
				return getSemaphore();
			case LqnmodelPackage.ENTRY__TASK1:
				return getTask1();
			case LqnmodelPackage.ENTRY__ENTRYPHASEACTIVITIES:
				return getEntryphaseactivities();
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
			case LqnmodelPackage.ENTRY__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.ENTRY__TYPE:
				setType((EntryType)newValue);
				return;
			case LqnmodelPackage.ENTRY__OPENARRIVALRATE:
				setOpenarrivalrate((Float)newValue);
				return;
			case LqnmodelPackage.ENTRY__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case LqnmodelPackage.ENTRY__SEMAPHORE:
				setSemaphore((SemaphoreType)newValue);
				return;
			case LqnmodelPackage.ENTRY__TASK1:
				setTask1((task)newValue);
				return;
			case LqnmodelPackage.ENTRY__ENTRYPHASEACTIVITIES:
				setEntryphaseactivities((entryphaseactivities)newValue);
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
			case LqnmodelPackage.ENTRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.ENTRY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case LqnmodelPackage.ENTRY__OPENARRIVALRATE:
				setOpenarrivalrate(OPENARRIVALRATE_EDEFAULT);
				return;
			case LqnmodelPackage.ENTRY__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case LqnmodelPackage.ENTRY__SEMAPHORE:
				setSemaphore(SEMAPHORE_EDEFAULT);
				return;
			case LqnmodelPackage.ENTRY__TASK1:
				setTask1((task)null);
				return;
			case LqnmodelPackage.ENTRY__ENTRYPHASEACTIVITIES:
				setEntryphaseactivities((entryphaseactivities)null);
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
			case LqnmodelPackage.ENTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.ENTRY__TYPE:
				return type != TYPE_EDEFAULT;
			case LqnmodelPackage.ENTRY__OPENARRIVALRATE:
				return openarrivalrate != OPENARRIVALRATE_EDEFAULT;
			case LqnmodelPackage.ENTRY__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case LqnmodelPackage.ENTRY__SEMAPHORE:
				return semaphore != SEMAPHORE_EDEFAULT;
			case LqnmodelPackage.ENTRY__TASK1:
				return getTask1() != null;
			case LqnmodelPackage.ENTRY__ENTRYPHASEACTIVITIES:
				return entryphaseactivities != null;
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
		result.append(", type: ");
		result.append(type);
		result.append(", openarrivalrate: ");
		result.append(openarrivalrate);
		result.append(", priority: ");
		result.append(priority);
		result.append(", semaphore: ");
		result.append(semaphore);
		result.append(')');
		return result.toString();
	}

} //entryImpl
