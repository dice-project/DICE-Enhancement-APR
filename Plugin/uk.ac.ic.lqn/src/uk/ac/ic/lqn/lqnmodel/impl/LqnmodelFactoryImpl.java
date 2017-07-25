/**
 */
package uk.ac.ic.lqn.lqnmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.ic.lqn.lqnmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LqnmodelFactoryImpl extends EFactoryImpl implements LqnmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LqnmodelFactory init() {
		try {
			LqnmodelFactory theLqnmodelFactory = (LqnmodelFactory)EPackage.Registry.INSTANCE.getEFactory(LqnmodelPackage.eNS_URI);
			if (theLqnmodelFactory != null) {
				return theLqnmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LqnmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LqnmodelPackage.LQNMODEL: return createlqnmodel();
			case LqnmodelPackage.PROCESSOR: return createprocessor();
			case LqnmodelPackage.TASK: return createtask();
			case LqnmodelPackage.ENTRY: return createentry();
			case LqnmodelPackage.TASKACTIVITIES: return createtaskactivities();
			case LqnmodelPackage.ENTRYPHASEACTIVITIES: return createentryphaseactivities();
			case LqnmodelPackage.ACTIVITY: return createactivity();
			case LqnmodelPackage.PRECEDENCE: return createprecedence();
			case LqnmodelPackage.REPLYENTRY: return createreplyentry();
			case LqnmodelPackage.REPLYACTIVITY: return createreplyactivity();
			case LqnmodelPackage.SYNCHCALL: return createsynchcall();
			case LqnmodelPackage.ASYNCHCALL: return createasynchcall();
			case LqnmodelPackage.ACTIVITY_R: return createactivityR();
			case LqnmodelPackage.PRE: return createpre();
			case LqnmodelPackage.PREOR: return createpreor();
			case LqnmodelPackage.PREAND: return createpreand();
			case LqnmodelPackage.POST: return createpost();
			case LqnmodelPackage.POSTOR: return createpostor();
			case LqnmodelPackage.POSTAND: return createpostand();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LqnmodelPackage.PSCHEDULER_TYPE:
				return createPSchedulerTypeFromString(eDataType, initialValue);
			case LqnmodelPackage.TSCHEDULER_TYPE:
				return createTSchedulerTypeFromString(eDataType, initialValue);
			case LqnmodelPackage.ENTRY_TYPE:
				return createEntryTypeFromString(eDataType, initialValue);
			case LqnmodelPackage.SEMAPHORE_TYPE:
				return createSemaphoreTypeFromString(eDataType, initialValue);
			case LqnmodelPackage.CALL_ORDER_TYPE:
				return createCallOrderTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LqnmodelPackage.PSCHEDULER_TYPE:
				return convertPSchedulerTypeToString(eDataType, instanceValue);
			case LqnmodelPackage.TSCHEDULER_TYPE:
				return convertTSchedulerTypeToString(eDataType, instanceValue);
			case LqnmodelPackage.ENTRY_TYPE:
				return convertEntryTypeToString(eDataType, instanceValue);
			case LqnmodelPackage.SEMAPHORE_TYPE:
				return convertSemaphoreTypeToString(eDataType, instanceValue);
			case LqnmodelPackage.CALL_ORDER_TYPE:
				return convertCallOrderTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public lqnmodel createlqnmodel() {
		lqnmodelImpl lqnmodel = new lqnmodelImpl();
		return lqnmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processor createprocessor() {
		processorImpl processor = new processorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public task createtask() {
		taskImpl task = new taskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public entry createentry() {
		entryImpl entry = new entryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public taskactivities createtaskactivities() {
		taskactivitiesImpl taskactivities = new taskactivitiesImpl();
		return taskactivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public entryphaseactivities createentryphaseactivities() {
		entryphaseactivitiesImpl entryphaseactivities = new entryphaseactivitiesImpl();
		return entryphaseactivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activity createactivity() {
		activityImpl activity = new activityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public precedence createprecedence() {
		precedenceImpl precedence = new precedenceImpl();
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public replyentry createreplyentry() {
		replyentryImpl replyentry = new replyentryImpl();
		return replyentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public replyactivity createreplyactivity() {
		replyactivityImpl replyactivity = new replyactivityImpl();
		return replyactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public synchcall createsynchcall() {
		synchcallImpl synchcall = new synchcallImpl();
		return synchcall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public asynchcall createasynchcall() {
		asynchcallImpl asynchcall = new asynchcallImpl();
		return asynchcall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activityR createactivityR() {
		activityRImpl activityR = new activityRImpl();
		return activityR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pre createpre() {
		preImpl pre = new preImpl();
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public preor createpreor() {
		preorImpl preor = new preorImpl();
		return preor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public preand createpreand() {
		preandImpl preand = new preandImpl();
		return preand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public post createpost() {
		postImpl post = new postImpl();
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public postor createpostor() {
		postorImpl postor = new postorImpl();
		return postor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public postand createpostand() {
		postandImpl postand = new postandImpl();
		return postand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSchedulerType createPSchedulerTypeFromString(EDataType eDataType, String initialValue) {
		PSchedulerType result = PSchedulerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPSchedulerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSchedulerType createTSchedulerTypeFromString(EDataType eDataType, String initialValue) {
		TSchedulerType result = TSchedulerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTSchedulerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType createEntryTypeFromString(EDataType eDataType, String initialValue) {
		EntryType result = EntryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreType createSemaphoreTypeFromString(EDataType eDataType, String initialValue) {
		SemaphoreType result = SemaphoreType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemaphoreTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOrderType createCallOrderTypeFromString(EDataType eDataType, String initialValue) {
		CallOrderType result = CallOrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnmodelPackage getLqnmodelPackage() {
		return (LqnmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LqnmodelPackage getPackage() {
		return LqnmodelPackage.eINSTANCE;
	}

} //LqnmodelFactoryImpl
