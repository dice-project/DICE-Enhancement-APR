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
import uk.ac.ic.lqn.lqnmodel.TSchedulerType;
import uk.ac.ic.lqn.lqnmodel.entry;
import uk.ac.ic.lqn.lqnmodel.processor;
import uk.ac.ic.lqn.lqnmodel.task;
import uk.ac.ic.lqn.lqnmodel.taskactivities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.taskImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.taskImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.taskImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.taskImpl#getQueuelength <em>Queuelength</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.taskImpl#getScheduling <em>Scheduling</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.taskImpl#isActivitygraph <em>Activitygraph</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.taskImpl#getThinktime <em>Thinktime</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.taskImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.taskImpl#getTaskactivities <em>Taskactivities</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.taskImpl#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @generated
 */
public class taskImpl extends MinimalEObjectImpl.Container implements task {
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
	 * The default value of the '{@link #getQueuelength() <em>Queuelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueuelength()
	 * @generated
	 * @ordered
	 */
	protected static final int QUEUELENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQueuelength() <em>Queuelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueuelength()
	 * @generated
	 * @ordered
	 */
	protected int queuelength = QUEUELENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduling()
	 * @generated
	 * @ordered
	 */
	protected static final TSchedulerType SCHEDULING_EDEFAULT = TSchedulerType.DEFAULT;

	/**
	 * The cached value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduling()
	 * @generated
	 * @ordered
	 */
	protected TSchedulerType scheduling = SCHEDULING_EDEFAULT;

	/**
	 * The default value of the '{@link #isActivitygraph() <em>Activitygraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivitygraph()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVITYGRAPH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActivitygraph() <em>Activitygraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivitygraph()
	 * @generated
	 * @ordered
	 */
	protected boolean activitygraph = ACTIVITYGRAPH_EDEFAULT;

	/**
	 * The default value of the '{@link #getThinktime() <em>Thinktime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinktime()
	 * @generated
	 * @ordered
	 */
	protected static final float THINKTIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getThinktime() <em>Thinktime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinktime()
	 * @generated
	 * @ordered
	 */
	protected float thinktime = THINKTIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<entry> entry;

	/**
	 * The cached value of the '{@link #getTaskactivities() <em>Taskactivities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskactivities()
	 * @generated
	 * @ordered
	 */
	protected EList<taskactivities> taskactivities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected taskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.TASK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.TASK__MULTIPLICITY, oldMultiplicity, multiplicity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.TASK__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQueuelength() {
		return queuelength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueuelength(int newQueuelength) {
		int oldQueuelength = queuelength;
		queuelength = newQueuelength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.TASK__QUEUELENGTH, oldQueuelength, queuelength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSchedulerType getScheduling() {
		return scheduling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduling(TSchedulerType newScheduling) {
		TSchedulerType oldScheduling = scheduling;
		scheduling = newScheduling == null ? SCHEDULING_EDEFAULT : newScheduling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.TASK__SCHEDULING, oldScheduling, scheduling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActivitygraph() {
		return activitygraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivitygraph(boolean newActivitygraph) {
		boolean oldActivitygraph = activitygraph;
		activitygraph = newActivitygraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.TASK__ACTIVITYGRAPH, oldActivitygraph, activitygraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getThinktime() {
		return thinktime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThinktime(float newThinktime) {
		float oldThinktime = thinktime;
		thinktime = newThinktime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.TASK__THINKTIME, oldThinktime, thinktime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<entry> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentWithInverseEList<entry>(entry.class, this, LqnmodelPackage.TASK__ENTRY, LqnmodelPackage.ENTRY__TASK1);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<taskactivities> getTaskactivities() {
		if (taskactivities == null) {
			taskactivities = new EObjectContainmentWithInverseEList<taskactivities>(taskactivities.class, this, LqnmodelPackage.TASK__TASKACTIVITIES, LqnmodelPackage.TASKACTIVITIES__TASK2);
		}
		return taskactivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processor getHost() {
		if (eContainerFeatureID() != LqnmodelPackage.TASK__HOST) return null;
		return (processor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHost(processor newHost, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHost, LqnmodelPackage.TASK__HOST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(processor newHost) {
		if (newHost != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.TASK__HOST && newHost != null)) {
			if (EcoreUtil.isAncestor(this, newHost))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHost != null)
				msgs = ((InternalEObject)newHost).eInverseAdd(this, LqnmodelPackage.PROCESSOR__TASK, processor.class, msgs);
			msgs = basicSetHost(newHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.TASK__HOST, newHost, newHost));
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
			case LqnmodelPackage.TASK__ENTRY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntry()).basicAdd(otherEnd, msgs);
			case LqnmodelPackage.TASK__TASKACTIVITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTaskactivities()).basicAdd(otherEnd, msgs);
			case LqnmodelPackage.TASK__HOST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHost((processor)otherEnd, msgs);
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
			case LqnmodelPackage.TASK__ENTRY:
				return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
			case LqnmodelPackage.TASK__TASKACTIVITIES:
				return ((InternalEList<?>)getTaskactivities()).basicRemove(otherEnd, msgs);
			case LqnmodelPackage.TASK__HOST:
				return basicSetHost(null, msgs);
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
			case LqnmodelPackage.TASK__HOST:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.PROCESSOR__TASK, processor.class, msgs);
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
			case LqnmodelPackage.TASK__NAME:
				return getName();
			case LqnmodelPackage.TASK__MULTIPLICITY:
				return getMultiplicity();
			case LqnmodelPackage.TASK__PRIORITY:
				return getPriority();
			case LqnmodelPackage.TASK__QUEUELENGTH:
				return getQueuelength();
			case LqnmodelPackage.TASK__SCHEDULING:
				return getScheduling();
			case LqnmodelPackage.TASK__ACTIVITYGRAPH:
				return isActivitygraph();
			case LqnmodelPackage.TASK__THINKTIME:
				return getThinktime();
			case LqnmodelPackage.TASK__ENTRY:
				return getEntry();
			case LqnmodelPackage.TASK__TASKACTIVITIES:
				return getTaskactivities();
			case LqnmodelPackage.TASK__HOST:
				return getHost();
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
			case LqnmodelPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.TASK__MULTIPLICITY:
				setMultiplicity((Integer)newValue);
				return;
			case LqnmodelPackage.TASK__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case LqnmodelPackage.TASK__QUEUELENGTH:
				setQueuelength((Integer)newValue);
				return;
			case LqnmodelPackage.TASK__SCHEDULING:
				setScheduling((TSchedulerType)newValue);
				return;
			case LqnmodelPackage.TASK__ACTIVITYGRAPH:
				setActivitygraph((Boolean)newValue);
				return;
			case LqnmodelPackage.TASK__THINKTIME:
				setThinktime((Float)newValue);
				return;
			case LqnmodelPackage.TASK__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends entry>)newValue);
				return;
			case LqnmodelPackage.TASK__TASKACTIVITIES:
				getTaskactivities().clear();
				getTaskactivities().addAll((Collection<? extends taskactivities>)newValue);
				return;
			case LqnmodelPackage.TASK__HOST:
				setHost((processor)newValue);
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
			case LqnmodelPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.TASK__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case LqnmodelPackage.TASK__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case LqnmodelPackage.TASK__QUEUELENGTH:
				setQueuelength(QUEUELENGTH_EDEFAULT);
				return;
			case LqnmodelPackage.TASK__SCHEDULING:
				setScheduling(SCHEDULING_EDEFAULT);
				return;
			case LqnmodelPackage.TASK__ACTIVITYGRAPH:
				setActivitygraph(ACTIVITYGRAPH_EDEFAULT);
				return;
			case LqnmodelPackage.TASK__THINKTIME:
				setThinktime(THINKTIME_EDEFAULT);
				return;
			case LqnmodelPackage.TASK__ENTRY:
				getEntry().clear();
				return;
			case LqnmodelPackage.TASK__TASKACTIVITIES:
				getTaskactivities().clear();
				return;
			case LqnmodelPackage.TASK__HOST:
				setHost((processor)null);
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
			case LqnmodelPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.TASK__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
			case LqnmodelPackage.TASK__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case LqnmodelPackage.TASK__QUEUELENGTH:
				return queuelength != QUEUELENGTH_EDEFAULT;
			case LqnmodelPackage.TASK__SCHEDULING:
				return scheduling != SCHEDULING_EDEFAULT;
			case LqnmodelPackage.TASK__ACTIVITYGRAPH:
				return activitygraph != ACTIVITYGRAPH_EDEFAULT;
			case LqnmodelPackage.TASK__THINKTIME:
				return thinktime != THINKTIME_EDEFAULT;
			case LqnmodelPackage.TASK__ENTRY:
				return entry != null && !entry.isEmpty();
			case LqnmodelPackage.TASK__TASKACTIVITIES:
				return taskactivities != null && !taskactivities.isEmpty();
			case LqnmodelPackage.TASK__HOST:
				return getHost() != null;
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
		result.append(", priority: ");
		result.append(priority);
		result.append(", queuelength: ");
		result.append(queuelength);
		result.append(", scheduling: ");
		result.append(scheduling);
		result.append(", activitygraph: ");
		result.append(activitygraph);
		result.append(", thinktime: ");
		result.append(thinktime);
		result.append(')');
		return result.toString();
	}

} //taskImpl
