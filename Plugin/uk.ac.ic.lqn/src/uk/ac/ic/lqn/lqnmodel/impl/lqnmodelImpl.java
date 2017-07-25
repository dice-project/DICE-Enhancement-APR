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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.ic.lqn.lqnmodel.LqnmodelPackage;
import uk.ac.ic.lqn.lqnmodel.lqnmodel;
import uk.ac.ic.lqn.lqnmodel.processor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>lqnmodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.lqnmodelImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.lqnmodelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.lqnmodelImpl#getLqnSchemaVersion <em>Lqn Schema Version</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.lqnmodelImpl#getLqnCoreSchemaVersion <em>Lqn Core Schema Version</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.lqnmodelImpl#isXmldebug <em>Xmldebug</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.lqnmodelImpl#getProcessor <em>Processor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class lqnmodelImpl extends MinimalEObjectImpl.Container implements lqnmodel {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLqnSchemaVersion() <em>Lqn Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLqnSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int LQN_SCHEMA_VERSION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLqnSchemaVersion() <em>Lqn Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLqnSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected int lqnSchemaVersion = LQN_SCHEMA_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLqnCoreSchemaVersion() <em>Lqn Core Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLqnCoreSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int LQN_CORE_SCHEMA_VERSION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLqnCoreSchemaVersion() <em>Lqn Core Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLqnCoreSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected int lqnCoreSchemaVersion = LQN_CORE_SCHEMA_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isXmldebug() <em>Xmldebug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXmldebug()
	 * @generated
	 * @ordered
	 */
	protected static final boolean XMLDEBUG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isXmldebug() <em>Xmldebug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXmldebug()
	 * @generated
	 * @ordered
	 */
	protected boolean xmldebug = XMLDEBUG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected EList<processor> processor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected lqnmodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.LQNMODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.LQNMODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.LQNMODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLqnSchemaVersion() {
		return lqnSchemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLqnSchemaVersion(int newLqnSchemaVersion) {
		int oldLqnSchemaVersion = lqnSchemaVersion;
		lqnSchemaVersion = newLqnSchemaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.LQNMODEL__LQN_SCHEMA_VERSION, oldLqnSchemaVersion, lqnSchemaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLqnCoreSchemaVersion() {
		return lqnCoreSchemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLqnCoreSchemaVersion(int newLqnCoreSchemaVersion) {
		int oldLqnCoreSchemaVersion = lqnCoreSchemaVersion;
		lqnCoreSchemaVersion = newLqnCoreSchemaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.LQNMODEL__LQN_CORE_SCHEMA_VERSION, oldLqnCoreSchemaVersion, lqnCoreSchemaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isXmldebug() {
		return xmldebug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmldebug(boolean newXmldebug) {
		boolean oldXmldebug = xmldebug;
		xmldebug = newXmldebug;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.LQNMODEL__XMLDEBUG, oldXmldebug, xmldebug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<processor> getProcessor() {
		if (processor == null) {
			processor = new EObjectContainmentEList<processor>(processor.class, this, LqnmodelPackage.LQNMODEL__PROCESSOR);
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnmodelPackage.LQNMODEL__PROCESSOR:
				return ((InternalEList<?>)getProcessor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LqnmodelPackage.LQNMODEL__NAME:
				return getName();
			case LqnmodelPackage.LQNMODEL__DESCRIPTION:
				return getDescription();
			case LqnmodelPackage.LQNMODEL__LQN_SCHEMA_VERSION:
				return getLqnSchemaVersion();
			case LqnmodelPackage.LQNMODEL__LQN_CORE_SCHEMA_VERSION:
				return getLqnCoreSchemaVersion();
			case LqnmodelPackage.LQNMODEL__XMLDEBUG:
				return isXmldebug();
			case LqnmodelPackage.LQNMODEL__PROCESSOR:
				return getProcessor();
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
			case LqnmodelPackage.LQNMODEL__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.LQNMODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LqnmodelPackage.LQNMODEL__LQN_SCHEMA_VERSION:
				setLqnSchemaVersion((Integer)newValue);
				return;
			case LqnmodelPackage.LQNMODEL__LQN_CORE_SCHEMA_VERSION:
				setLqnCoreSchemaVersion((Integer)newValue);
				return;
			case LqnmodelPackage.LQNMODEL__XMLDEBUG:
				setXmldebug((Boolean)newValue);
				return;
			case LqnmodelPackage.LQNMODEL__PROCESSOR:
				getProcessor().clear();
				getProcessor().addAll((Collection<? extends processor>)newValue);
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
			case LqnmodelPackage.LQNMODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.LQNMODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LqnmodelPackage.LQNMODEL__LQN_SCHEMA_VERSION:
				setLqnSchemaVersion(LQN_SCHEMA_VERSION_EDEFAULT);
				return;
			case LqnmodelPackage.LQNMODEL__LQN_CORE_SCHEMA_VERSION:
				setLqnCoreSchemaVersion(LQN_CORE_SCHEMA_VERSION_EDEFAULT);
				return;
			case LqnmodelPackage.LQNMODEL__XMLDEBUG:
				setXmldebug(XMLDEBUG_EDEFAULT);
				return;
			case LqnmodelPackage.LQNMODEL__PROCESSOR:
				getProcessor().clear();
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
			case LqnmodelPackage.LQNMODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.LQNMODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LqnmodelPackage.LQNMODEL__LQN_SCHEMA_VERSION:
				return lqnSchemaVersion != LQN_SCHEMA_VERSION_EDEFAULT;
			case LqnmodelPackage.LQNMODEL__LQN_CORE_SCHEMA_VERSION:
				return lqnCoreSchemaVersion != LQN_CORE_SCHEMA_VERSION_EDEFAULT;
			case LqnmodelPackage.LQNMODEL__XMLDEBUG:
				return xmldebug != XMLDEBUG_EDEFAULT;
			case LqnmodelPackage.LQNMODEL__PROCESSOR:
				return processor != null && !processor.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", lqnSchemaVersion: ");
		result.append(lqnSchemaVersion);
		result.append(", lqnCoreSchemaVersion: ");
		result.append(lqnCoreSchemaVersion);
		result.append(", xmldebug: ");
		result.append(xmldebug);
		result.append(')');
		return result.toString();
	}

} //lqnmodelImpl
