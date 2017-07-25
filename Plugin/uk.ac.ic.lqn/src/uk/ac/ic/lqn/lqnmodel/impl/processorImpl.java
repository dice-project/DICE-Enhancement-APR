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
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.ic.lqn.lqnmodel.LqnmodelPackage;
import uk.ac.ic.lqn.lqnmodel.PSchedulerType;
import uk.ac.ic.lqn.lqnmodel.processor;
import uk.ac.ic.lqn.lqnmodel.task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.processorImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.processorImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.processorImpl#getSpeedfactor <em>Speedfactor</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.processorImpl#getScheduling <em>Scheduling</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.processorImpl#getReplication <em>Replication</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.processorImpl#getQuantum <em>Quantum</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.processorImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class processorImpl extends MinimalEObjectImpl.Container implements processor {
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
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedfactor() <em>Speedfactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedfactor()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEEDFACTOR_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getSpeedfactor() <em>Speedfactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedfactor()
	 * @generated
	 * @ordered
	 */
	protected float speedfactor = SPEEDFACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduling()
	 * @generated
	 * @ordered
	 */
	protected static final PSchedulerType SCHEDULING_EDEFAULT = PSchedulerType.DEFAULT;

	/**
	 * The cached value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduling()
	 * @generated
	 * @ordered
	 */
	protected PSchedulerType scheduling = SCHEDULING_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICATION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected int replication = REPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantum() <em>Quantum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantum()
	 * @generated
	 * @ordered
	 */
	protected static final float QUANTUM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQuantum() <em>Quantum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantum()
	 * @generated
	 * @ordered
	 */
	protected float quantum = QUANTUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<task> task;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected processorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.PROCESSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PROCESSOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(int newMultiplicity) {
		int oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PROCESSOR__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeedfactor() {
		return speedfactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedfactor(float newSpeedfactor) {
		float oldSpeedfactor = speedfactor;
		speedfactor = newSpeedfactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PROCESSOR__SPEEDFACTOR, oldSpeedfactor, speedfactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSchedulerType getScheduling() {
		return scheduling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduling(PSchedulerType newScheduling) {
		PSchedulerType oldScheduling = scheduling;
		scheduling = newScheduling == null ? SCHEDULING_EDEFAULT : newScheduling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PROCESSOR__SCHEDULING, oldScheduling, scheduling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplication() {
		return replication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplication(int newReplication) {
		int oldReplication = replication;
		replication = newReplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PROCESSOR__REPLICATION, oldReplication, replication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQuantum() {
		return quantum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantum(float newQuantum) {
		float oldQuantum = quantum;
		quantum = newQuantum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.PROCESSOR__QUANTUM, oldQuantum, quantum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<task> getTask() {
		if (task == null) {
			task = new EObjectContainmentWithInverseEList<task>(task.class, this, LqnmodelPackage.PROCESSOR__TASK, LqnmodelPackage.TASK__HOST);
		}
		return task;
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
			case LqnmodelPackage.PROCESSOR__TASK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTask()).basicAdd(otherEnd, msgs);
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
			case LqnmodelPackage.PROCESSOR__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
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
			case LqnmodelPackage.PROCESSOR__NAME:
				return getName();
			case LqnmodelPackage.PROCESSOR__MULTIPLICITY:
				return getMultiplicity();
			case LqnmodelPackage.PROCESSOR__SPEEDFACTOR:
				return getSpeedfactor();
			case LqnmodelPackage.PROCESSOR__SCHEDULING:
				return getScheduling();
			case LqnmodelPackage.PROCESSOR__REPLICATION:
				return getReplication();
			case LqnmodelPackage.PROCESSOR__QUANTUM:
				return getQuantum();
			case LqnmodelPackage.PROCESSOR__TASK:
				return getTask();
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
			case LqnmodelPackage.PROCESSOR__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.PROCESSOR__MULTIPLICITY:
				setMultiplicity((Integer)newValue);
				return;
			case LqnmodelPackage.PROCESSOR__SPEEDFACTOR:
				setSpeedfactor((Float)newValue);
				return;
			case LqnmodelPackage.PROCESSOR__SCHEDULING:
				setScheduling((PSchedulerType)newValue);
				return;
			case LqnmodelPackage.PROCESSOR__REPLICATION:
				setReplication((Integer)newValue);
				return;
			case LqnmodelPackage.PROCESSOR__QUANTUM:
				setQuantum((Float)newValue);
				return;
			case LqnmodelPackage.PROCESSOR__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends task>)newValue);
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
			case LqnmodelPackage.PROCESSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.PROCESSOR__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case LqnmodelPackage.PROCESSOR__SPEEDFACTOR:
				setSpeedfactor(SPEEDFACTOR_EDEFAULT);
				return;
			case LqnmodelPackage.PROCESSOR__SCHEDULING:
				setScheduling(SCHEDULING_EDEFAULT);
				return;
			case LqnmodelPackage.PROCESSOR__REPLICATION:
				setReplication(REPLICATION_EDEFAULT);
				return;
			case LqnmodelPackage.PROCESSOR__QUANTUM:
				setQuantum(QUANTUM_EDEFAULT);
				return;
			case LqnmodelPackage.PROCESSOR__TASK:
				getTask().clear();
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
			case LqnmodelPackage.PROCESSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.PROCESSOR__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
			case LqnmodelPackage.PROCESSOR__SPEEDFACTOR:
				return speedfactor != SPEEDFACTOR_EDEFAULT;
			case LqnmodelPackage.PROCESSOR__SCHEDULING:
				return scheduling != SCHEDULING_EDEFAULT;
			case LqnmodelPackage.PROCESSOR__REPLICATION:
				return replication != REPLICATION_EDEFAULT;
			case LqnmodelPackage.PROCESSOR__QUANTUM:
				return quantum != QUANTUM_EDEFAULT;
			case LqnmodelPackage.PROCESSOR__TASK:
				return task != null && !task.isEmpty();
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
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(", speedfactor: ");
		result.append(speedfactor);
		result.append(", scheduling: ");
		result.append(scheduling);
		result.append(", replication: ");
		result.append(replication);
		result.append(", quantum: ");
		result.append(quantum);
		result.append(')');
		return result.toString();
	}

} //processorImpl
