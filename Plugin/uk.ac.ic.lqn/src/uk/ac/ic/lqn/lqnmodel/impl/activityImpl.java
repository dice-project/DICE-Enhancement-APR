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

import uk.ac.ic.lqn.lqnmodel.CallOrderType;
import uk.ac.ic.lqn.lqnmodel.LqnmodelPackage;
import uk.ac.ic.lqn.lqnmodel.activity;
import uk.ac.ic.lqn.lqnmodel.asynchcall;
import uk.ac.ic.lqn.lqnmodel.entryphaseactivities;
import uk.ac.ic.lqn.lqnmodel.synchcall;
import uk.ac.ic.lqn.lqnmodel.taskactivities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl#getHostdemandmean <em>Hostdemandmean</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl#getHostdemandcvsq <em>Hostdemandcvsq</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl#getThinktime <em>Thinktime</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl#getMaxservicetime <em>Maxservicetime</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl#getCallorder <em>Callorder</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl#getBoundtoentry <em>Boundtoentry</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl#getProb <em>Prob</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl#getCount <em>Count</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl#getSynchcall <em>Synchcall</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl#getAsynchcall <em>Asynchcall</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl#getTaskActivity <em>Task Activity</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl#getEntryphaseactivities1 <em>Entryphaseactivities1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class activityImpl extends MinimalEObjectImpl.Container implements activity {
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
	 * The default value of the '{@link #getHostdemandmean() <em>Hostdemandmean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostdemandmean()
	 * @generated
	 * @ordered
	 */
	protected static final float HOSTDEMANDMEAN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHostdemandmean() <em>Hostdemandmean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostdemandmean()
	 * @generated
	 * @ordered
	 */
	protected float hostdemandmean = HOSTDEMANDMEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostdemandcvsq() <em>Hostdemandcvsq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostdemandcvsq()
	 * @generated
	 * @ordered
	 */
	protected static final float HOSTDEMANDCVSQ_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getHostdemandcvsq() <em>Hostdemandcvsq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostdemandcvsq()
	 * @generated
	 * @ordered
	 */
	protected float hostdemandcvsq = HOSTDEMANDCVSQ_EDEFAULT;

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
	 * The default value of the '{@link #getMaxservicetime() <em>Maxservicetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxservicetime()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXSERVICETIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxservicetime() <em>Maxservicetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxservicetime()
	 * @generated
	 * @ordered
	 */
	protected float maxservicetime = MAXSERVICETIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallorder() <em>Callorder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallorder()
	 * @generated
	 * @ordered
	 */
	protected static final CallOrderType CALLORDER_EDEFAULT = CallOrderType.DEFAULT;

	/**
	 * The cached value of the '{@link #getCallorder() <em>Callorder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallorder()
	 * @generated
	 * @ordered
	 */
	protected CallOrderType callorder = CALLORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected int phase = PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoundtoentry() <em>Boundtoentry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundtoentry()
	 * @generated
	 * @ordered
	 */
	protected static final String BOUNDTOENTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoundtoentry() <em>Boundtoentry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundtoentry()
	 * @generated
	 * @ordered
	 */
	protected String boundtoentry = BOUNDTOENTRY_EDEFAULT;

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
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final float COUNT_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected float count = COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSynchcall() <em>Synchcall</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchcall()
	 * @generated
	 * @ordered
	 */
	protected EList<synchcall> synchcall;

	/**
	 * The cached value of the '{@link #getAsynchcall() <em>Asynchcall</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsynchcall()
	 * @generated
	 * @ordered
	 */
	protected EList<asynchcall> asynchcall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected activityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnmodelPackage.Literals.ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHostdemandmean() {
		return hostdemandmean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostdemandmean(float newHostdemandmean) {
		float oldHostdemandmean = hostdemandmean;
		hostdemandmean = newHostdemandmean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY__HOSTDEMANDMEAN, oldHostdemandmean, hostdemandmean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHostdemandcvsq() {
		return hostdemandcvsq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostdemandcvsq(float newHostdemandcvsq) {
		float oldHostdemandcvsq = hostdemandcvsq;
		hostdemandcvsq = newHostdemandcvsq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY__HOSTDEMANDCVSQ, oldHostdemandcvsq, hostdemandcvsq));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY__THINKTIME, oldThinktime, thinktime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxservicetime() {
		return maxservicetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxservicetime(float newMaxservicetime) {
		float oldMaxservicetime = maxservicetime;
		maxservicetime = newMaxservicetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY__MAXSERVICETIME, oldMaxservicetime, maxservicetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOrderType getCallorder() {
		return callorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallorder(CallOrderType newCallorder) {
		CallOrderType oldCallorder = callorder;
		callorder = newCallorder == null ? CALLORDER_EDEFAULT : newCallorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY__CALLORDER, oldCallorder, callorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(int newPhase) {
		int oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY__PHASE, oldPhase, phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoundtoentry() {
		return boundtoentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundtoentry(String newBoundtoentry) {
		String oldBoundtoentry = boundtoentry;
		boundtoentry = newBoundtoentry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY__BOUNDTOENTRY, oldBoundtoentry, boundtoentry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY__PROB, oldProb, prob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(float newCount) {
		float oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<synchcall> getSynchcall() {
		if (synchcall == null) {
			synchcall = new EObjectContainmentWithInverseEList<synchcall>(synchcall.class, this, LqnmodelPackage.ACTIVITY__SYNCHCALL, LqnmodelPackage.SYNCHCALL__ACTIVITY_SYNCH_CALL);
		}
		return synchcall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<asynchcall> getAsynchcall() {
		if (asynchcall == null) {
			asynchcall = new EObjectContainmentWithInverseEList<asynchcall>(asynchcall.class, this, LqnmodelPackage.ACTIVITY__ASYNCHCALL, LqnmodelPackage.ASYNCHCALL__ACTIVITY_ASYNCH_CALL);
		}
		return asynchcall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public taskactivities getTaskActivity() {
		if (eContainerFeatureID() != LqnmodelPackage.ACTIVITY__TASK_ACTIVITY) return null;
		return (taskactivities)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskActivity(taskactivities newTaskActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTaskActivity, LqnmodelPackage.ACTIVITY__TASK_ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskActivity(taskactivities newTaskActivity) {
		if (newTaskActivity != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.ACTIVITY__TASK_ACTIVITY && newTaskActivity != null)) {
			if (EcoreUtil.isAncestor(this, newTaskActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTaskActivity != null)
				msgs = ((InternalEObject)newTaskActivity).eInverseAdd(this, LqnmodelPackage.TASKACTIVITIES__ACTIVITY, taskactivities.class, msgs);
			msgs = basicSetTaskActivity(newTaskActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY__TASK_ACTIVITY, newTaskActivity, newTaskActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public entryphaseactivities getEntryphaseactivities1() {
		if (eContainerFeatureID() != LqnmodelPackage.ACTIVITY__ENTRYPHASEACTIVITIES1) return null;
		return (entryphaseactivities)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryphaseactivities1(entryphaseactivities newEntryphaseactivities1, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntryphaseactivities1, LqnmodelPackage.ACTIVITY__ENTRYPHASEACTIVITIES1, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryphaseactivities1(entryphaseactivities newEntryphaseactivities1) {
		if (newEntryphaseactivities1 != eInternalContainer() || (eContainerFeatureID() != LqnmodelPackage.ACTIVITY__ENTRYPHASEACTIVITIES1 && newEntryphaseactivities1 != null)) {
			if (EcoreUtil.isAncestor(this, newEntryphaseactivities1))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntryphaseactivities1 != null)
				msgs = ((InternalEObject)newEntryphaseactivities1).eInverseAdd(this, LqnmodelPackage.ENTRYPHASEACTIVITIES__ACTIVITY1, entryphaseactivities.class, msgs);
			msgs = basicSetEntryphaseactivities1(newEntryphaseactivities1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnmodelPackage.ACTIVITY__ENTRYPHASEACTIVITIES1, newEntryphaseactivities1, newEntryphaseactivities1));
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
			case LqnmodelPackage.ACTIVITY__SYNCHCALL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSynchcall()).basicAdd(otherEnd, msgs);
			case LqnmodelPackage.ACTIVITY__ASYNCHCALL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAsynchcall()).basicAdd(otherEnd, msgs);
			case LqnmodelPackage.ACTIVITY__TASK_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTaskActivity((taskactivities)otherEnd, msgs);
			case LqnmodelPackage.ACTIVITY__ENTRYPHASEACTIVITIES1:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEntryphaseactivities1((entryphaseactivities)otherEnd, msgs);
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
			case LqnmodelPackage.ACTIVITY__SYNCHCALL:
				return ((InternalEList<?>)getSynchcall()).basicRemove(otherEnd, msgs);
			case LqnmodelPackage.ACTIVITY__ASYNCHCALL:
				return ((InternalEList<?>)getAsynchcall()).basicRemove(otherEnd, msgs);
			case LqnmodelPackage.ACTIVITY__TASK_ACTIVITY:
				return basicSetTaskActivity(null, msgs);
			case LqnmodelPackage.ACTIVITY__ENTRYPHASEACTIVITIES1:
				return basicSetEntryphaseactivities1(null, msgs);
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
			case LqnmodelPackage.ACTIVITY__TASK_ACTIVITY:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.TASKACTIVITIES__ACTIVITY, taskactivities.class, msgs);
			case LqnmodelPackage.ACTIVITY__ENTRYPHASEACTIVITIES1:
				return eInternalContainer().eInverseRemove(this, LqnmodelPackage.ENTRYPHASEACTIVITIES__ACTIVITY1, entryphaseactivities.class, msgs);
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
			case LqnmodelPackage.ACTIVITY__NAME:
				return getName();
			case LqnmodelPackage.ACTIVITY__HOSTDEMANDMEAN:
				return getHostdemandmean();
			case LqnmodelPackage.ACTIVITY__HOSTDEMANDCVSQ:
				return getHostdemandcvsq();
			case LqnmodelPackage.ACTIVITY__THINKTIME:
				return getThinktime();
			case LqnmodelPackage.ACTIVITY__MAXSERVICETIME:
				return getMaxservicetime();
			case LqnmodelPackage.ACTIVITY__CALLORDER:
				return getCallorder();
			case LqnmodelPackage.ACTIVITY__PHASE:
				return getPhase();
			case LqnmodelPackage.ACTIVITY__BOUNDTOENTRY:
				return getBoundtoentry();
			case LqnmodelPackage.ACTIVITY__PROB:
				return getProb();
			case LqnmodelPackage.ACTIVITY__COUNT:
				return getCount();
			case LqnmodelPackage.ACTIVITY__SYNCHCALL:
				return getSynchcall();
			case LqnmodelPackage.ACTIVITY__ASYNCHCALL:
				return getAsynchcall();
			case LqnmodelPackage.ACTIVITY__TASK_ACTIVITY:
				return getTaskActivity();
			case LqnmodelPackage.ACTIVITY__ENTRYPHASEACTIVITIES1:
				return getEntryphaseactivities1();
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
			case LqnmodelPackage.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case LqnmodelPackage.ACTIVITY__HOSTDEMANDMEAN:
				setHostdemandmean((Float)newValue);
				return;
			case LqnmodelPackage.ACTIVITY__HOSTDEMANDCVSQ:
				setHostdemandcvsq((Float)newValue);
				return;
			case LqnmodelPackage.ACTIVITY__THINKTIME:
				setThinktime((Float)newValue);
				return;
			case LqnmodelPackage.ACTIVITY__MAXSERVICETIME:
				setMaxservicetime((Float)newValue);
				return;
			case LqnmodelPackage.ACTIVITY__CALLORDER:
				setCallorder((CallOrderType)newValue);
				return;
			case LqnmodelPackage.ACTIVITY__PHASE:
				setPhase((Integer)newValue);
				return;
			case LqnmodelPackage.ACTIVITY__BOUNDTOENTRY:
				setBoundtoentry((String)newValue);
				return;
			case LqnmodelPackage.ACTIVITY__PROB:
				setProb((Float)newValue);
				return;
			case LqnmodelPackage.ACTIVITY__COUNT:
				setCount((Float)newValue);
				return;
			case LqnmodelPackage.ACTIVITY__SYNCHCALL:
				getSynchcall().clear();
				getSynchcall().addAll((Collection<? extends synchcall>)newValue);
				return;
			case LqnmodelPackage.ACTIVITY__ASYNCHCALL:
				getAsynchcall().clear();
				getAsynchcall().addAll((Collection<? extends asynchcall>)newValue);
				return;
			case LqnmodelPackage.ACTIVITY__TASK_ACTIVITY:
				setTaskActivity((taskactivities)newValue);
				return;
			case LqnmodelPackage.ACTIVITY__ENTRYPHASEACTIVITIES1:
				setEntryphaseactivities1((entryphaseactivities)newValue);
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
			case LqnmodelPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnmodelPackage.ACTIVITY__HOSTDEMANDMEAN:
				setHostdemandmean(HOSTDEMANDMEAN_EDEFAULT);
				return;
			case LqnmodelPackage.ACTIVITY__HOSTDEMANDCVSQ:
				setHostdemandcvsq(HOSTDEMANDCVSQ_EDEFAULT);
				return;
			case LqnmodelPackage.ACTIVITY__THINKTIME:
				setThinktime(THINKTIME_EDEFAULT);
				return;
			case LqnmodelPackage.ACTIVITY__MAXSERVICETIME:
				setMaxservicetime(MAXSERVICETIME_EDEFAULT);
				return;
			case LqnmodelPackage.ACTIVITY__CALLORDER:
				setCallorder(CALLORDER_EDEFAULT);
				return;
			case LqnmodelPackage.ACTIVITY__PHASE:
				setPhase(PHASE_EDEFAULT);
				return;
			case LqnmodelPackage.ACTIVITY__BOUNDTOENTRY:
				setBoundtoentry(BOUNDTOENTRY_EDEFAULT);
				return;
			case LqnmodelPackage.ACTIVITY__PROB:
				setProb(PROB_EDEFAULT);
				return;
			case LqnmodelPackage.ACTIVITY__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case LqnmodelPackage.ACTIVITY__SYNCHCALL:
				getSynchcall().clear();
				return;
			case LqnmodelPackage.ACTIVITY__ASYNCHCALL:
				getAsynchcall().clear();
				return;
			case LqnmodelPackage.ACTIVITY__TASK_ACTIVITY:
				setTaskActivity((taskactivities)null);
				return;
			case LqnmodelPackage.ACTIVITY__ENTRYPHASEACTIVITIES1:
				setEntryphaseactivities1((entryphaseactivities)null);
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
			case LqnmodelPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnmodelPackage.ACTIVITY__HOSTDEMANDMEAN:
				return hostdemandmean != HOSTDEMANDMEAN_EDEFAULT;
			case LqnmodelPackage.ACTIVITY__HOSTDEMANDCVSQ:
				return hostdemandcvsq != HOSTDEMANDCVSQ_EDEFAULT;
			case LqnmodelPackage.ACTIVITY__THINKTIME:
				return thinktime != THINKTIME_EDEFAULT;
			case LqnmodelPackage.ACTIVITY__MAXSERVICETIME:
				return maxservicetime != MAXSERVICETIME_EDEFAULT;
			case LqnmodelPackage.ACTIVITY__CALLORDER:
				return callorder != CALLORDER_EDEFAULT;
			case LqnmodelPackage.ACTIVITY__PHASE:
				return phase != PHASE_EDEFAULT;
			case LqnmodelPackage.ACTIVITY__BOUNDTOENTRY:
				return BOUNDTOENTRY_EDEFAULT == null ? boundtoentry != null : !BOUNDTOENTRY_EDEFAULT.equals(boundtoentry);
			case LqnmodelPackage.ACTIVITY__PROB:
				return prob != PROB_EDEFAULT;
			case LqnmodelPackage.ACTIVITY__COUNT:
				return count != COUNT_EDEFAULT;
			case LqnmodelPackage.ACTIVITY__SYNCHCALL:
				return synchcall != null && !synchcall.isEmpty();
			case LqnmodelPackage.ACTIVITY__ASYNCHCALL:
				return asynchcall != null && !asynchcall.isEmpty();
			case LqnmodelPackage.ACTIVITY__TASK_ACTIVITY:
				return getTaskActivity() != null;
			case LqnmodelPackage.ACTIVITY__ENTRYPHASEACTIVITIES1:
				return getEntryphaseactivities1() != null;
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
		result.append(", hostdemandmean: ");
		result.append(hostdemandmean);
		result.append(", hostdemandcvsq: ");
		result.append(hostdemandcvsq);
		result.append(", thinktime: ");
		result.append(thinktime);
		result.append(", maxservicetime: ");
		result.append(maxservicetime);
		result.append(", callorder: ");
		result.append(callorder);
		result.append(", phase: ");
		result.append(phase);
		result.append(", boundtoentry: ");
		result.append(boundtoentry);
		result.append(", prob: ");
		result.append(prob);
		result.append(", count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}

} //activityImpl
