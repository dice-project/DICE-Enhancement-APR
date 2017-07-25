/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelFactory
 * @model kind="package"
 * @generated
 */
public interface LqnmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lqnmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uk.ac.ic.lqn/lqnmodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LqnmodelPackage eINSTANCE = uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.lqnmodelImpl <em>lqnmodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.lqnmodelImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getlqnmodel()
	 * @generated
	 */
	int LQNMODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQNMODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQNMODEL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Lqn Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQNMODEL__LQN_SCHEMA_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Lqn Core Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQNMODEL__LQN_CORE_SCHEMA_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Xmldebug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQNMODEL__XMLDEBUG = 4;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQNMODEL__PROCESSOR = 5;

	/**
	 * The number of structural features of the '<em>lqnmodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQNMODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>lqnmodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQNMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.processorImpl <em>processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.processorImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getprocessor()
	 * @generated
	 */
	int PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__MULTIPLICITY = 1;

	/**
	 * The feature id for the '<em><b>Speedfactor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__SPEEDFACTOR = 2;

	/**
	 * The feature id for the '<em><b>Scheduling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__SCHEDULING = 3;

	/**
	 * The feature id for the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__REPLICATION = 4;

	/**
	 * The feature id for the '<em><b>Quantum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__QUANTUM = 5;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__TASK = 6;

	/**
	 * The number of structural features of the '<em>processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.taskImpl <em>task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.taskImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#gettask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MULTIPLICITY = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Queuelength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__QUEUELENGTH = 3;

	/**
	 * The feature id for the '<em><b>Scheduling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SCHEDULING = 4;

	/**
	 * The feature id for the '<em><b>Activitygraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ACTIVITYGRAPH = 5;

	/**
	 * The feature id for the '<em><b>Thinktime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__THINKTIME = 6;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Taskactivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASKACTIVITIES = 8;

	/**
	 * The feature id for the '<em><b>Host</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HOST = 9;

	/**
	 * The number of structural features of the '<em>task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.entryImpl <em>entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.entryImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getentry()
	 * @generated
	 */
	int ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Openarrivalrate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__OPENARRIVALRATE = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>Semaphore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__SEMAPHORE = 4;

	/**
	 * The feature id for the '<em><b>Task1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TASK1 = 5;

	/**
	 * The feature id for the '<em><b>Entryphaseactivities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__ENTRYPHASEACTIVITIES = 6;

	/**
	 * The number of structural features of the '<em>entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.taskactivitiesImpl <em>taskactivities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.taskactivitiesImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#gettaskactivities()
	 * @generated
	 */
	int TASKACTIVITIES = 4;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKACTIVITIES__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKACTIVITIES__PRECEDENCE = 1;

	/**
	 * The feature id for the '<em><b>Replyentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKACTIVITIES__REPLYENTRY = 2;

	/**
	 * The feature id for the '<em><b>Task2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKACTIVITIES__TASK2 = 3;

	/**
	 * The number of structural features of the '<em>taskactivities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKACTIVITIES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>taskactivities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKACTIVITIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.entryphaseactivitiesImpl <em>entryphaseactivities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.entryphaseactivitiesImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getentryphaseactivities()
	 * @generated
	 */
	int ENTRYPHASEACTIVITIES = 5;

	/**
	 * The feature id for the '<em><b>Activity1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPHASEACTIVITIES__ACTIVITY1 = 0;

	/**
	 * The feature id for the '<em><b>Entry1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPHASEACTIVITIES__ENTRY1 = 1;

	/**
	 * The number of structural features of the '<em>entryphaseactivities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPHASEACTIVITIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>entryphaseactivities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPHASEACTIVITIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl <em>activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.activityImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getactivity()
	 * @generated
	 */
	int ACTIVITY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Hostdemandmean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__HOSTDEMANDMEAN = 1;

	/**
	 * The feature id for the '<em><b>Hostdemandcvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__HOSTDEMANDCVSQ = 2;

	/**
	 * The feature id for the '<em><b>Thinktime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__THINKTIME = 3;

	/**
	 * The feature id for the '<em><b>Maxservicetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__MAXSERVICETIME = 4;

	/**
	 * The feature id for the '<em><b>Callorder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CALLORDER = 5;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PHASE = 6;

	/**
	 * The feature id for the '<em><b>Boundtoentry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__BOUNDTOENTRY = 7;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROB = 8;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__COUNT = 9;

	/**
	 * The feature id for the '<em><b>Synchcall</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SYNCHCALL = 10;

	/**
	 * The feature id for the '<em><b>Asynchcall</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ASYNCHCALL = 11;

	/**
	 * The feature id for the '<em><b>Task Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TASK_ACTIVITY = 12;

	/**
	 * The feature id for the '<em><b>Entryphaseactivities1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ENTRYPHASEACTIVITIES1 = 13;

	/**
	 * The number of structural features of the '<em>activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.precedenceImpl <em>precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.precedenceImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getprecedence()
	 * @generated
	 */
	int PRECEDENCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Task Activity P</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__TASK_ACTIVITY_P = 1;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__PRE = 2;

	/**
	 * The feature id for the '<em><b>Preor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__PREOR = 3;

	/**
	 * The feature id for the '<em><b>Preand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__PREAND = 4;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__POST = 5;

	/**
	 * The feature id for the '<em><b>Postor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__POSTOR = 6;

	/**
	 * The feature id for the '<em><b>Postand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__POSTAND = 7;

	/**
	 * The number of structural features of the '<em>precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.replyentryImpl <em>replyentry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.replyentryImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getreplyentry()
	 * @generated
	 */
	int REPLYENTRY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLYENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Task Activity R</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLYENTRY__TASK_ACTIVITY_R = 1;

	/**
	 * The feature id for the '<em><b>Replyactivity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLYENTRY__REPLYACTIVITY = 2;

	/**
	 * The number of structural features of the '<em>replyentry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLYENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>replyentry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLYENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.replyactivityImpl <em>replyactivity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.replyactivityImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getreplyactivity()
	 * @generated
	 */
	int REPLYACTIVITY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLYACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Reply Entry1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLYACTIVITY__REPLY_ENTRY1 = 1;

	/**
	 * The number of structural features of the '<em>replyactivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLYACTIVITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>replyactivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLYACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.synchcallImpl <em>synchcall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.synchcallImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getsynchcall()
	 * @generated
	 */
	int SYNCHCALL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHCALL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHCALL__DEST = 1;

	/**
	 * The feature id for the '<em><b>Callsmean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHCALL__CALLSMEAN = 2;

	/**
	 * The feature id for the '<em><b>Activity Synch Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHCALL__ACTIVITY_SYNCH_CALL = 3;

	/**
	 * The number of structural features of the '<em>synchcall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHCALL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>synchcall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHCALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.asynchcallImpl <em>asynchcall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.asynchcallImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getasynchcall()
	 * @generated
	 */
	int ASYNCHCALL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHCALL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHCALL__DEST = 1;

	/**
	 * The feature id for the '<em><b>Callsmean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHCALL__CALLSMEAN = 2;

	/**
	 * The feature id for the '<em><b>Activity ASynch Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHCALL__ACTIVITY_ASYNCH_CALL = 3;

	/**
	 * The number of structural features of the '<em>asynchcall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHCALL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>asynchcall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHCALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.activityRImpl <em>activity R</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.activityRImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getactivityR()
	 * @generated
	 */
	int ACTIVITY_R = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_R__NAME = 0;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_R__PROB = 1;

	/**
	 * The feature id for the '<em><b>Pre Activity R</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_R__PRE_ACTIVITY_R = 2;

	/**
	 * The feature id for the '<em><b>Preor Activity R</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_R__PREOR_ACTIVITY_R = 3;

	/**
	 * The feature id for the '<em><b>Preand Activity R</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_R__PREAND_ACTIVITY_R = 4;

	/**
	 * The feature id for the '<em><b>Post Activity R</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_R__POST_ACTIVITY_R = 5;

	/**
	 * The feature id for the '<em><b>Postor Activity R</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_R__POSTOR_ACTIVITY_R = 6;

	/**
	 * The feature id for the '<em><b>Postand Activity R</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_R__POSTAND_ACTIVITY_R = 7;

	/**
	 * The number of structural features of the '<em>activity R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_R_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>activity R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_R_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.preImpl <em>pre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.preImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getpre()
	 * @generated
	 */
	int PRE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Precedence1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__PRECEDENCE1 = 1;

	/**
	 * The feature id for the '<em><b>Activity RPre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__ACTIVITY_RPRE = 2;

	/**
	 * The number of structural features of the '<em>pre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>pre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.preorImpl <em>preor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.preorImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getpreor()
	 * @generated
	 */
	int PREOR = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Precedence2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREOR__PRECEDENCE2 = 1;

	/**
	 * The feature id for the '<em><b>Activity RPre Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREOR__ACTIVITY_RPRE_OR = 2;

	/**
	 * The number of structural features of the '<em>preor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>preor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.preandImpl <em>preand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.preandImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getpreand()
	 * @generated
	 */
	int PREAND = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Quorum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREAND__QUORUM = 1;

	/**
	 * The feature id for the '<em><b>Precedence3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREAND__PRECEDENCE3 = 2;

	/**
	 * The feature id for the '<em><b>Activity RPre And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREAND__ACTIVITY_RPRE_AND = 3;

	/**
	 * The number of structural features of the '<em>preand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREAND_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>preand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.postImpl <em>post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.postImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getpost()
	 * @generated
	 */
	int POST = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Precedence4</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__PRECEDENCE4 = 1;

	/**
	 * The feature id for the '<em><b>Activity RPost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__ACTIVITY_RPOST = 2;

	/**
	 * The number of structural features of the '<em>post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.postorImpl <em>postor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.postorImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getpostor()
	 * @generated
	 */
	int POSTOR = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Precedence5</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTOR__PRECEDENCE5 = 1;

	/**
	 * The feature id for the '<em><b>Activity RPost Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTOR__ACTIVITY_RPOST_OR = 2;

	/**
	 * The number of structural features of the '<em>postor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>postor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.impl.postandImpl <em>postand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.impl.postandImpl
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getpostand()
	 * @generated
	 */
	int POSTAND = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Precedence6</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAND__PRECEDENCE6 = 1;

	/**
	 * The feature id for the '<em><b>Activity RPost And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAND__ACTIVITY_RPOST_AND = 2;

	/**
	 * The number of structural features of the '<em>postand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>postand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.PSchedulerType <em>PScheduler Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.PSchedulerType
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getPSchedulerType()
	 * @generated
	 */
	int PSCHEDULER_TYPE = 19;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.TSchedulerType <em>TScheduler Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.TSchedulerType
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getTSchedulerType()
	 * @generated
	 */
	int TSCHEDULER_TYPE = 20;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.EntryType <em>Entry Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.EntryType
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getEntryType()
	 * @generated
	 */
	int ENTRY_TYPE = 21;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.SemaphoreType <em>Semaphore Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.SemaphoreType
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getSemaphoreType()
	 * @generated
	 */
	int SEMAPHORE_TYPE = 22;

	/**
	 * The meta object id for the '{@link uk.ac.ic.lqn.lqnmodel.CallOrderType <em>Call Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.ic.lqn.lqnmodel.CallOrderType
	 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getCallOrderType()
	 * @generated
	 */
	int CALL_ORDER_TYPE = 23;


	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.lqnmodel <em>lqnmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>lqnmodel</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.lqnmodel
	 * @generated
	 */
	EClass getlqnmodel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.lqnmodel#getName()
	 * @see #getlqnmodel()
	 * @generated
	 */
	EAttribute getlqnmodel_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.lqnmodel#getDescription()
	 * @see #getlqnmodel()
	 * @generated
	 */
	EAttribute getlqnmodel_Description();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#getLqnSchemaVersion <em>Lqn Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lqn Schema Version</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.lqnmodel#getLqnSchemaVersion()
	 * @see #getlqnmodel()
	 * @generated
	 */
	EAttribute getlqnmodel_LqnSchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#getLqnCoreSchemaVersion <em>Lqn Core Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lqn Core Schema Version</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.lqnmodel#getLqnCoreSchemaVersion()
	 * @see #getlqnmodel()
	 * @generated
	 */
	EAttribute getlqnmodel_LqnCoreSchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#isXmldebug <em>Xmldebug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmldebug</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.lqnmodel#isXmldebug()
	 * @see #getlqnmodel()
	 * @generated
	 */
	EAttribute getlqnmodel_Xmldebug();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.lqnmodel#getProcessor()
	 * @see #getlqnmodel()
	 * @generated
	 */
	EReference getlqnmodel_Processor();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.processor <em>processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>processor</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.processor
	 * @generated
	 */
	EClass getprocessor();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.processor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.processor#getName()
	 * @see #getprocessor()
	 * @generated
	 */
	EAttribute getprocessor_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.processor#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.processor#getMultiplicity()
	 * @see #getprocessor()
	 * @generated
	 */
	EAttribute getprocessor_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.processor#getSpeedfactor <em>Speedfactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speedfactor</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.processor#getSpeedfactor()
	 * @see #getprocessor()
	 * @generated
	 */
	EAttribute getprocessor_Speedfactor();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.processor#getScheduling <em>Scheduling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.processor#getScheduling()
	 * @see #getprocessor()
	 * @generated
	 */
	EAttribute getprocessor_Scheduling();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.processor#getReplication <em>Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.processor#getReplication()
	 * @see #getprocessor()
	 * @generated
	 */
	EAttribute getprocessor_Replication();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.processor#getQuantum <em>Quantum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantum</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.processor#getQuantum()
	 * @see #getprocessor()
	 * @generated
	 */
	EAttribute getprocessor_Quantum();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.processor#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.processor#getTask()
	 * @see #getprocessor()
	 * @generated
	 */
	EReference getprocessor_Task();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.task <em>task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>task</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.task
	 * @generated
	 */
	EClass gettask();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.task#getName()
	 * @see #gettask()
	 * @generated
	 */
	EAttribute gettask_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.task#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.task#getMultiplicity()
	 * @see #gettask()
	 * @generated
	 */
	EAttribute gettask_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.task#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.task#getPriority()
	 * @see #gettask()
	 * @generated
	 */
	EAttribute gettask_Priority();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.task#getQueuelength <em>Queuelength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queuelength</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.task#getQueuelength()
	 * @see #gettask()
	 * @generated
	 */
	EAttribute gettask_Queuelength();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.task#getScheduling <em>Scheduling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.task#getScheduling()
	 * @see #gettask()
	 * @generated
	 */
	EAttribute gettask_Scheduling();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.task#isActivitygraph <em>Activitygraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activitygraph</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.task#isActivitygraph()
	 * @see #gettask()
	 * @generated
	 */
	EAttribute gettask_Activitygraph();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.task#getThinktime <em>Thinktime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thinktime</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.task#getThinktime()
	 * @see #gettask()
	 * @generated
	 */
	EAttribute gettask_Thinktime();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.task#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.task#getEntry()
	 * @see #gettask()
	 * @generated
	 */
	EReference gettask_Entry();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.task#getTaskactivities <em>Taskactivities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Taskactivities</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.task#getTaskactivities()
	 * @see #gettask()
	 * @generated
	 */
	EReference gettask_Taskactivities();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.task#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Host</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.task#getHost()
	 * @see #gettask()
	 * @generated
	 */
	EReference gettask_Host();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.entry <em>entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>entry</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.entry
	 * @generated
	 */
	EClass getentry();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.entry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.entry#getName()
	 * @see #getentry()
	 * @generated
	 */
	EAttribute getentry_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.entry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.entry#getType()
	 * @see #getentry()
	 * @generated
	 */
	EAttribute getentry_Type();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.entry#getOpenarrivalrate <em>Openarrivalrate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openarrivalrate</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.entry#getOpenarrivalrate()
	 * @see #getentry()
	 * @generated
	 */
	EAttribute getentry_Openarrivalrate();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.entry#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.entry#getPriority()
	 * @see #getentry()
	 * @generated
	 */
	EAttribute getentry_Priority();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.entry#getSemaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semaphore</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.entry#getSemaphore()
	 * @see #getentry()
	 * @generated
	 */
	EAttribute getentry_Semaphore();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.entry#getTask1 <em>Task1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task1</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.entry#getTask1()
	 * @see #getentry()
	 * @generated
	 */
	EReference getentry_Task1();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.ic.lqn.lqnmodel.entry#getEntryphaseactivities <em>Entryphaseactivities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entryphaseactivities</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.entry#getEntryphaseactivities()
	 * @see #getentry()
	 * @generated
	 */
	EReference getentry_Entryphaseactivities();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.taskactivities <em>taskactivities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>taskactivities</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.taskactivities
	 * @generated
	 */
	EClass gettaskactivities();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.taskactivities#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.taskactivities#getActivity()
	 * @see #gettaskactivities()
	 * @generated
	 */
	EReference gettaskactivities_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.taskactivities#getPrecedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precedence</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.taskactivities#getPrecedence()
	 * @see #gettaskactivities()
	 * @generated
	 */
	EReference gettaskactivities_Precedence();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.taskactivities#getReplyentry <em>Replyentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replyentry</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.taskactivities#getReplyentry()
	 * @see #gettaskactivities()
	 * @generated
	 */
	EReference gettaskactivities_Replyentry();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.taskactivities#getTask2 <em>Task2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task2</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.taskactivities#getTask2()
	 * @see #gettaskactivities()
	 * @generated
	 */
	EReference gettaskactivities_Task2();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.entryphaseactivities <em>entryphaseactivities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>entryphaseactivities</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.entryphaseactivities
	 * @generated
	 */
	EClass getentryphaseactivities();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.entryphaseactivities#getActivity1 <em>Activity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity1</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.entryphaseactivities#getActivity1()
	 * @see #getentryphaseactivities()
	 * @generated
	 */
	EReference getentryphaseactivities_Activity1();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.entryphaseactivities#getEntry1 <em>Entry1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entry1</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.entryphaseactivities#getEntry1()
	 * @see #getentryphaseactivities()
	 * @generated
	 */
	EReference getentryphaseactivities_Entry1();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.activity <em>activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>activity</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity
	 * @generated
	 */
	EClass getactivity();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getName()
	 * @see #getactivity()
	 * @generated
	 */
	EAttribute getactivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.activity#getHostdemandmean <em>Hostdemandmean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostdemandmean</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getHostdemandmean()
	 * @see #getactivity()
	 * @generated
	 */
	EAttribute getactivity_Hostdemandmean();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.activity#getHostdemandcvsq <em>Hostdemandcvsq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostdemandcvsq</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getHostdemandcvsq()
	 * @see #getactivity()
	 * @generated
	 */
	EAttribute getactivity_Hostdemandcvsq();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.activity#getThinktime <em>Thinktime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thinktime</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getThinktime()
	 * @see #getactivity()
	 * @generated
	 */
	EAttribute getactivity_Thinktime();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.activity#getMaxservicetime <em>Maxservicetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxservicetime</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getMaxservicetime()
	 * @see #getactivity()
	 * @generated
	 */
	EAttribute getactivity_Maxservicetime();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.activity#getCallorder <em>Callorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callorder</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getCallorder()
	 * @see #getactivity()
	 * @generated
	 */
	EAttribute getactivity_Callorder();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.activity#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getPhase()
	 * @see #getactivity()
	 * @generated
	 */
	EAttribute getactivity_Phase();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.activity#getBoundtoentry <em>Boundtoentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boundtoentry</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getBoundtoentry()
	 * @see #getactivity()
	 * @generated
	 */
	EAttribute getactivity_Boundtoentry();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.activity#getProb <em>Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getProb()
	 * @see #getactivity()
	 * @generated
	 */
	EAttribute getactivity_Prob();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.activity#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getCount()
	 * @see #getactivity()
	 * @generated
	 */
	EAttribute getactivity_Count();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.activity#getSynchcall <em>Synchcall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchcall</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getSynchcall()
	 * @see #getactivity()
	 * @generated
	 */
	EReference getactivity_Synchcall();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.activity#getAsynchcall <em>Asynchcall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynchcall</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getAsynchcall()
	 * @see #getactivity()
	 * @generated
	 */
	EReference getactivity_Asynchcall();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.activity#getTaskActivity <em>Task Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task Activity</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getTaskActivity()
	 * @see #getactivity()
	 * @generated
	 */
	EReference getactivity_TaskActivity();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.activity#getEntryphaseactivities1 <em>Entryphaseactivities1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entryphaseactivities1</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getEntryphaseactivities1()
	 * @see #getactivity()
	 * @generated
	 */
	EReference getactivity_Entryphaseactivities1();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.precedence <em>precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>precedence</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.precedence
	 * @generated
	 */
	EClass getprecedence();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.precedence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getName()
	 * @see #getprecedence()
	 * @generated
	 */
	EAttribute getprecedence_Name();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.precedence#getTaskActivityP <em>Task Activity P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task Activity P</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getTaskActivityP()
	 * @see #getprecedence()
	 * @generated
	 */
	EReference getprecedence_TaskActivityP();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getPre()
	 * @see #getprecedence()
	 * @generated
	 */
	EReference getprecedence_Pre();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPreor <em>Preor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preor</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getPreor()
	 * @see #getprecedence()
	 * @generated
	 */
	EReference getprecedence_Preor();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPreand <em>Preand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preand</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getPreand()
	 * @see #getprecedence()
	 * @generated
	 */
	EReference getprecedence_Preand();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getPost()
	 * @see #getprecedence()
	 * @generated
	 */
	EReference getprecedence_Post();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPostor <em>Postor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postor</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getPostor()
	 * @see #getprecedence()
	 * @generated
	 */
	EReference getprecedence_Postor();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.ic.lqn.lqnmodel.precedence#getPostand <em>Postand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postand</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.precedence#getPostand()
	 * @see #getprecedence()
	 * @generated
	 */
	EReference getprecedence_Postand();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.replyentry <em>replyentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>replyentry</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.replyentry
	 * @generated
	 */
	EClass getreplyentry();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.replyentry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.replyentry#getName()
	 * @see #getreplyentry()
	 * @generated
	 */
	EAttribute getreplyentry_Name();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.replyentry#getTaskActivityR <em>Task Activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task Activity R</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.replyentry#getTaskActivityR()
	 * @see #getreplyentry()
	 * @generated
	 */
	EReference getreplyentry_TaskActivityR();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.replyentry#getReplyactivity <em>Replyactivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replyactivity</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.replyentry#getReplyactivity()
	 * @see #getreplyentry()
	 * @generated
	 */
	EReference getreplyentry_Replyactivity();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.replyactivity <em>replyactivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>replyactivity</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.replyactivity
	 * @generated
	 */
	EClass getreplyactivity();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.replyactivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.replyactivity#getName()
	 * @see #getreplyactivity()
	 * @generated
	 */
	EAttribute getreplyactivity_Name();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.replyactivity#getReplyEntry1 <em>Reply Entry1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reply Entry1</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.replyactivity#getReplyEntry1()
	 * @see #getreplyactivity()
	 * @generated
	 */
	EReference getreplyactivity_ReplyEntry1();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.synchcall <em>synchcall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>synchcall</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.synchcall
	 * @generated
	 */
	EClass getsynchcall();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.synchcall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.synchcall#getName()
	 * @see #getsynchcall()
	 * @generated
	 */
	EAttribute getsynchcall_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.synchcall#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.synchcall#getDest()
	 * @see #getsynchcall()
	 * @generated
	 */
	EAttribute getsynchcall_Dest();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.synchcall#getCallsmean <em>Callsmean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callsmean</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.synchcall#getCallsmean()
	 * @see #getsynchcall()
	 * @generated
	 */
	EAttribute getsynchcall_Callsmean();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.synchcall#getActivitySynchCall <em>Activity Synch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity Synch Call</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.synchcall#getActivitySynchCall()
	 * @see #getsynchcall()
	 * @generated
	 */
	EReference getsynchcall_ActivitySynchCall();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.asynchcall <em>asynchcall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>asynchcall</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.asynchcall
	 * @generated
	 */
	EClass getasynchcall();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.asynchcall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.asynchcall#getName()
	 * @see #getasynchcall()
	 * @generated
	 */
	EAttribute getasynchcall_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.asynchcall#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.asynchcall#getDest()
	 * @see #getasynchcall()
	 * @generated
	 */
	EAttribute getasynchcall_Dest();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.asynchcall#getCallsmean <em>Callsmean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callsmean</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.asynchcall#getCallsmean()
	 * @see #getasynchcall()
	 * @generated
	 */
	EAttribute getasynchcall_Callsmean();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.asynchcall#getActivityASynchCall <em>Activity ASynch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity ASynch Call</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.asynchcall#getActivityASynchCall()
	 * @see #getasynchcall()
	 * @generated
	 */
	EReference getasynchcall_ActivityASynchCall();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.activityR <em>activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>activity R</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activityR
	 * @generated
	 */
	EClass getactivityR();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.activityR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activityR#getName()
	 * @see #getactivityR()
	 * @generated
	 */
	EAttribute getactivityR_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.activityR#getProb <em>Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activityR#getProb()
	 * @see #getactivityR()
	 * @generated
	 */
	EAttribute getactivityR_Prob();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPreActivityR <em>Pre Activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pre Activity R</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activityR#getPreActivityR()
	 * @see #getactivityR()
	 * @generated
	 */
	EReference getactivityR_PreActivityR();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPreorActivityR <em>Preor Activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Preor Activity R</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activityR#getPreorActivityR()
	 * @see #getactivityR()
	 * @generated
	 */
	EReference getactivityR_PreorActivityR();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPreandActivityR <em>Preand Activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Preand Activity R</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activityR#getPreandActivityR()
	 * @see #getactivityR()
	 * @generated
	 */
	EReference getactivityR_PreandActivityR();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPostActivityR <em>Post Activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Post Activity R</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activityR#getPostActivityR()
	 * @see #getactivityR()
	 * @generated
	 */
	EReference getactivityR_PostActivityR();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPostorActivityR <em>Postor Activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Postor Activity R</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activityR#getPostorActivityR()
	 * @see #getactivityR()
	 * @generated
	 */
	EReference getactivityR_PostorActivityR();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.activityR#getPostandActivityR <em>Postand Activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Postand Activity R</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.activityR#getPostandActivityR()
	 * @see #getactivityR()
	 * @generated
	 */
	EReference getactivityR_PostandActivityR();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.pre <em>pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>pre</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.pre
	 * @generated
	 */
	EClass getpre();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.pre#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.pre#getName()
	 * @see #getpre()
	 * @generated
	 */
	EAttribute getpre_Name();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.pre#getPrecedence1 <em>Precedence1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Precedence1</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.pre#getPrecedence1()
	 * @see #getpre()
	 * @generated
	 */
	EReference getpre_Precedence1();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.ic.lqn.lqnmodel.pre#getActivityRPre <em>Activity RPre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity RPre</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.pre#getActivityRPre()
	 * @see #getpre()
	 * @generated
	 */
	EReference getpre_ActivityRPre();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.preor <em>preor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>preor</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.preor
	 * @generated
	 */
	EClass getpreor();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.preor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.preor#getName()
	 * @see #getpreor()
	 * @generated
	 */
	EAttribute getpreor_Name();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.preor#getPrecedence2 <em>Precedence2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Precedence2</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.preor#getPrecedence2()
	 * @see #getpreor()
	 * @generated
	 */
	EReference getpreor_Precedence2();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.preor#getActivityRPreOr <em>Activity RPre Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity RPre Or</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.preor#getActivityRPreOr()
	 * @see #getpreor()
	 * @generated
	 */
	EReference getpreor_ActivityRPreOr();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.preand <em>preand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>preand</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.preand
	 * @generated
	 */
	EClass getpreand();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.preand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.preand#getName()
	 * @see #getpreand()
	 * @generated
	 */
	EAttribute getpreand_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.preand#getQuorum <em>Quorum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quorum</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.preand#getQuorum()
	 * @see #getpreand()
	 * @generated
	 */
	EAttribute getpreand_Quorum();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.preand#getPrecedence3 <em>Precedence3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Precedence3</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.preand#getPrecedence3()
	 * @see #getpreand()
	 * @generated
	 */
	EReference getpreand_Precedence3();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.preand#getActivityRPreAnd <em>Activity RPre And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity RPre And</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.preand#getActivityRPreAnd()
	 * @see #getpreand()
	 * @generated
	 */
	EReference getpreand_ActivityRPreAnd();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.post <em>post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>post</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.post
	 * @generated
	 */
	EClass getpost();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.post#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.post#getName()
	 * @see #getpost()
	 * @generated
	 */
	EAttribute getpost_Name();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.post#getPrecedence4 <em>Precedence4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Precedence4</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.post#getPrecedence4()
	 * @see #getpost()
	 * @generated
	 */
	EReference getpost_Precedence4();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.ic.lqn.lqnmodel.post#getActivityRPost <em>Activity RPost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity RPost</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.post#getActivityRPost()
	 * @see #getpost()
	 * @generated
	 */
	EReference getpost_ActivityRPost();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.postor <em>postor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>postor</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.postor
	 * @generated
	 */
	EClass getpostor();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.postor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.postor#getName()
	 * @see #getpostor()
	 * @generated
	 */
	EAttribute getpostor_Name();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.postor#getPrecedence5 <em>Precedence5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Precedence5</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.postor#getPrecedence5()
	 * @see #getpostor()
	 * @generated
	 */
	EReference getpostor_Precedence5();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.postor#getActivityRPostOr <em>Activity RPost Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity RPost Or</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.postor#getActivityRPostOr()
	 * @see #getpostor()
	 * @generated
	 */
	EReference getpostor_ActivityRPostOr();

	/**
	 * Returns the meta object for class '{@link uk.ac.ic.lqn.lqnmodel.postand <em>postand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>postand</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.postand
	 * @generated
	 */
	EClass getpostand();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.ic.lqn.lqnmodel.postand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.postand#getName()
	 * @see #getpostand()
	 * @generated
	 */
	EAttribute getpostand_Name();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.ic.lqn.lqnmodel.postand#getPrecedence6 <em>Precedence6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Precedence6</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.postand#getPrecedence6()
	 * @see #getpostand()
	 * @generated
	 */
	EReference getpostand_Precedence6();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.ic.lqn.lqnmodel.postand#getActivityRPostAnd <em>Activity RPost And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity RPost And</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.postand#getActivityRPostAnd()
	 * @see #getpostand()
	 * @generated
	 */
	EReference getpostand_ActivityRPostAnd();

	/**
	 * Returns the meta object for enum '{@link uk.ac.ic.lqn.lqnmodel.PSchedulerType <em>PScheduler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PScheduler Type</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.PSchedulerType
	 * @generated
	 */
	EEnum getPSchedulerType();

	/**
	 * Returns the meta object for enum '{@link uk.ac.ic.lqn.lqnmodel.TSchedulerType <em>TScheduler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TScheduler Type</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.TSchedulerType
	 * @generated
	 */
	EEnum getTSchedulerType();

	/**
	 * Returns the meta object for enum '{@link uk.ac.ic.lqn.lqnmodel.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entry Type</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.EntryType
	 * @generated
	 */
	EEnum getEntryType();

	/**
	 * Returns the meta object for enum '{@link uk.ac.ic.lqn.lqnmodel.SemaphoreType <em>Semaphore Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semaphore Type</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.SemaphoreType
	 * @generated
	 */
	EEnum getSemaphoreType();

	/**
	 * Returns the meta object for enum '{@link uk.ac.ic.lqn.lqnmodel.CallOrderType <em>Call Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Call Order Type</em>'.
	 * @see uk.ac.ic.lqn.lqnmodel.CallOrderType
	 * @generated
	 */
	EEnum getCallOrderType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LqnmodelFactory getLqnmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.lqnmodelImpl <em>lqnmodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.lqnmodelImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getlqnmodel()
		 * @generated
		 */
		EClass LQNMODEL = eINSTANCE.getlqnmodel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQNMODEL__NAME = eINSTANCE.getlqnmodel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQNMODEL__DESCRIPTION = eINSTANCE.getlqnmodel_Description();

		/**
		 * The meta object literal for the '<em><b>Lqn Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQNMODEL__LQN_SCHEMA_VERSION = eINSTANCE.getlqnmodel_LqnSchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Lqn Core Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQNMODEL__LQN_CORE_SCHEMA_VERSION = eINSTANCE.getlqnmodel_LqnCoreSchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Xmldebug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQNMODEL__XMLDEBUG = eINSTANCE.getlqnmodel_Xmldebug();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQNMODEL__PROCESSOR = eINSTANCE.getlqnmodel_Processor();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.processorImpl <em>processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.processorImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getprocessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getprocessor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__NAME = eINSTANCE.getprocessor_Name();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__MULTIPLICITY = eINSTANCE.getprocessor_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Speedfactor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__SPEEDFACTOR = eINSTANCE.getprocessor_Speedfactor();

		/**
		 * The meta object literal for the '<em><b>Scheduling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__SCHEDULING = eINSTANCE.getprocessor_Scheduling();

		/**
		 * The meta object literal for the '<em><b>Replication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__REPLICATION = eINSTANCE.getprocessor_Replication();

		/**
		 * The meta object literal for the '<em><b>Quantum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__QUANTUM = eINSTANCE.getprocessor_Quantum();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__TASK = eINSTANCE.getprocessor_Task();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.taskImpl <em>task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.taskImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#gettask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.gettask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.gettask_Name();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__MULTIPLICITY = eINSTANCE.gettask_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PRIORITY = eINSTANCE.gettask_Priority();

		/**
		 * The meta object literal for the '<em><b>Queuelength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__QUEUELENGTH = eINSTANCE.gettask_Queuelength();

		/**
		 * The meta object literal for the '<em><b>Scheduling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__SCHEDULING = eINSTANCE.gettask_Scheduling();

		/**
		 * The meta object literal for the '<em><b>Activitygraph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ACTIVITYGRAPH = eINSTANCE.gettask_Activitygraph();

		/**
		 * The meta object literal for the '<em><b>Thinktime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__THINKTIME = eINSTANCE.gettask_Thinktime();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ENTRY = eINSTANCE.gettask_Entry();

		/**
		 * The meta object literal for the '<em><b>Taskactivities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TASKACTIVITIES = eINSTANCE.gettask_Taskactivities();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HOST = eINSTANCE.gettask_Host();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.entryImpl <em>entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.entryImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getentry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getentry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__NAME = eINSTANCE.getentry_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__TYPE = eINSTANCE.getentry_Type();

		/**
		 * The meta object literal for the '<em><b>Openarrivalrate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__OPENARRIVALRATE = eINSTANCE.getentry_Openarrivalrate();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__PRIORITY = eINSTANCE.getentry_Priority();

		/**
		 * The meta object literal for the '<em><b>Semaphore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__SEMAPHORE = eINSTANCE.getentry_Semaphore();

		/**
		 * The meta object literal for the '<em><b>Task1</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__TASK1 = eINSTANCE.getentry_Task1();

		/**
		 * The meta object literal for the '<em><b>Entryphaseactivities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__ENTRYPHASEACTIVITIES = eINSTANCE.getentry_Entryphaseactivities();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.taskactivitiesImpl <em>taskactivities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.taskactivitiesImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#gettaskactivities()
		 * @generated
		 */
		EClass TASKACTIVITIES = eINSTANCE.gettaskactivities();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKACTIVITIES__ACTIVITY = eINSTANCE.gettaskactivities_Activity();

		/**
		 * The meta object literal for the '<em><b>Precedence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKACTIVITIES__PRECEDENCE = eINSTANCE.gettaskactivities_Precedence();

		/**
		 * The meta object literal for the '<em><b>Replyentry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKACTIVITIES__REPLYENTRY = eINSTANCE.gettaskactivities_Replyentry();

		/**
		 * The meta object literal for the '<em><b>Task2</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKACTIVITIES__TASK2 = eINSTANCE.gettaskactivities_Task2();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.entryphaseactivitiesImpl <em>entryphaseactivities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.entryphaseactivitiesImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getentryphaseactivities()
		 * @generated
		 */
		EClass ENTRYPHASEACTIVITIES = eINSTANCE.getentryphaseactivities();

		/**
		 * The meta object literal for the '<em><b>Activity1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRYPHASEACTIVITIES__ACTIVITY1 = eINSTANCE.getentryphaseactivities_Activity1();

		/**
		 * The meta object literal for the '<em><b>Entry1</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRYPHASEACTIVITIES__ENTRY1 = eINSTANCE.getentryphaseactivities_Entry1();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.activityImpl <em>activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.activityImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getactivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getactivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getactivity_Name();

		/**
		 * The meta object literal for the '<em><b>Hostdemandmean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__HOSTDEMANDMEAN = eINSTANCE.getactivity_Hostdemandmean();

		/**
		 * The meta object literal for the '<em><b>Hostdemandcvsq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__HOSTDEMANDCVSQ = eINSTANCE.getactivity_Hostdemandcvsq();

		/**
		 * The meta object literal for the '<em><b>Thinktime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__THINKTIME = eINSTANCE.getactivity_Thinktime();

		/**
		 * The meta object literal for the '<em><b>Maxservicetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__MAXSERVICETIME = eINSTANCE.getactivity_Maxservicetime();

		/**
		 * The meta object literal for the '<em><b>Callorder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__CALLORDER = eINSTANCE.getactivity_Callorder();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__PHASE = eINSTANCE.getactivity_Phase();

		/**
		 * The meta object literal for the '<em><b>Boundtoentry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__BOUNDTOENTRY = eINSTANCE.getactivity_Boundtoentry();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__PROB = eINSTANCE.getactivity_Prob();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__COUNT = eINSTANCE.getactivity_Count();

		/**
		 * The meta object literal for the '<em><b>Synchcall</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SYNCHCALL = eINSTANCE.getactivity_Synchcall();

		/**
		 * The meta object literal for the '<em><b>Asynchcall</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__ASYNCHCALL = eINSTANCE.getactivity_Asynchcall();

		/**
		 * The meta object literal for the '<em><b>Task Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__TASK_ACTIVITY = eINSTANCE.getactivity_TaskActivity();

		/**
		 * The meta object literal for the '<em><b>Entryphaseactivities1</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__ENTRYPHASEACTIVITIES1 = eINSTANCE.getactivity_Entryphaseactivities1();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.precedenceImpl <em>precedence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.precedenceImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getprecedence()
		 * @generated
		 */
		EClass PRECEDENCE = eINSTANCE.getprecedence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDENCE__NAME = eINSTANCE.getprecedence_Name();

		/**
		 * The meta object literal for the '<em><b>Task Activity P</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__TASK_ACTIVITY_P = eINSTANCE.getprecedence_TaskActivityP();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__PRE = eINSTANCE.getprecedence_Pre();

		/**
		 * The meta object literal for the '<em><b>Preor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__PREOR = eINSTANCE.getprecedence_Preor();

		/**
		 * The meta object literal for the '<em><b>Preand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__PREAND = eINSTANCE.getprecedence_Preand();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__POST = eINSTANCE.getprecedence_Post();

		/**
		 * The meta object literal for the '<em><b>Postor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__POSTOR = eINSTANCE.getprecedence_Postor();

		/**
		 * The meta object literal for the '<em><b>Postand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__POSTAND = eINSTANCE.getprecedence_Postand();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.replyentryImpl <em>replyentry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.replyentryImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getreplyentry()
		 * @generated
		 */
		EClass REPLYENTRY = eINSTANCE.getreplyentry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLYENTRY__NAME = eINSTANCE.getreplyentry_Name();

		/**
		 * The meta object literal for the '<em><b>Task Activity R</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLYENTRY__TASK_ACTIVITY_R = eINSTANCE.getreplyentry_TaskActivityR();

		/**
		 * The meta object literal for the '<em><b>Replyactivity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLYENTRY__REPLYACTIVITY = eINSTANCE.getreplyentry_Replyactivity();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.replyactivityImpl <em>replyactivity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.replyactivityImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getreplyactivity()
		 * @generated
		 */
		EClass REPLYACTIVITY = eINSTANCE.getreplyactivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLYACTIVITY__NAME = eINSTANCE.getreplyactivity_Name();

		/**
		 * The meta object literal for the '<em><b>Reply Entry1</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLYACTIVITY__REPLY_ENTRY1 = eINSTANCE.getreplyactivity_ReplyEntry1();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.synchcallImpl <em>synchcall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.synchcallImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getsynchcall()
		 * @generated
		 */
		EClass SYNCHCALL = eINSTANCE.getsynchcall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHCALL__NAME = eINSTANCE.getsynchcall_Name();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHCALL__DEST = eINSTANCE.getsynchcall_Dest();

		/**
		 * The meta object literal for the '<em><b>Callsmean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHCALL__CALLSMEAN = eINSTANCE.getsynchcall_Callsmean();

		/**
		 * The meta object literal for the '<em><b>Activity Synch Call</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHCALL__ACTIVITY_SYNCH_CALL = eINSTANCE.getsynchcall_ActivitySynchCall();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.asynchcallImpl <em>asynchcall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.asynchcallImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getasynchcall()
		 * @generated
		 */
		EClass ASYNCHCALL = eINSTANCE.getasynchcall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNCHCALL__NAME = eINSTANCE.getasynchcall_Name();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNCHCALL__DEST = eINSTANCE.getasynchcall_Dest();

		/**
		 * The meta object literal for the '<em><b>Callsmean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNCHCALL__CALLSMEAN = eINSTANCE.getasynchcall_Callsmean();

		/**
		 * The meta object literal for the '<em><b>Activity ASynch Call</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASYNCHCALL__ACTIVITY_ASYNCH_CALL = eINSTANCE.getasynchcall_ActivityASynchCall();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.activityRImpl <em>activity R</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.activityRImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getactivityR()
		 * @generated
		 */
		EClass ACTIVITY_R = eINSTANCE.getactivityR();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_R__NAME = eINSTANCE.getactivityR_Name();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_R__PROB = eINSTANCE.getactivityR_Prob();

		/**
		 * The meta object literal for the '<em><b>Pre Activity R</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_R__PRE_ACTIVITY_R = eINSTANCE.getactivityR_PreActivityR();

		/**
		 * The meta object literal for the '<em><b>Preor Activity R</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_R__PREOR_ACTIVITY_R = eINSTANCE.getactivityR_PreorActivityR();

		/**
		 * The meta object literal for the '<em><b>Preand Activity R</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_R__PREAND_ACTIVITY_R = eINSTANCE.getactivityR_PreandActivityR();

		/**
		 * The meta object literal for the '<em><b>Post Activity R</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_R__POST_ACTIVITY_R = eINSTANCE.getactivityR_PostActivityR();

		/**
		 * The meta object literal for the '<em><b>Postor Activity R</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_R__POSTOR_ACTIVITY_R = eINSTANCE.getactivityR_PostorActivityR();

		/**
		 * The meta object literal for the '<em><b>Postand Activity R</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_R__POSTAND_ACTIVITY_R = eINSTANCE.getactivityR_PostandActivityR();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.preImpl <em>pre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.preImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getpre()
		 * @generated
		 */
		EClass PRE = eINSTANCE.getpre();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE__NAME = eINSTANCE.getpre_Name();

		/**
		 * The meta object literal for the '<em><b>Precedence1</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE__PRECEDENCE1 = eINSTANCE.getpre_Precedence1();

		/**
		 * The meta object literal for the '<em><b>Activity RPre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE__ACTIVITY_RPRE = eINSTANCE.getpre_ActivityRPre();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.preorImpl <em>preor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.preorImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getpreor()
		 * @generated
		 */
		EClass PREOR = eINSTANCE.getpreor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREOR__NAME = eINSTANCE.getpreor_Name();

		/**
		 * The meta object literal for the '<em><b>Precedence2</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREOR__PRECEDENCE2 = eINSTANCE.getpreor_Precedence2();

		/**
		 * The meta object literal for the '<em><b>Activity RPre Or</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREOR__ACTIVITY_RPRE_OR = eINSTANCE.getpreor_ActivityRPreOr();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.preandImpl <em>preand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.preandImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getpreand()
		 * @generated
		 */
		EClass PREAND = eINSTANCE.getpreand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREAND__NAME = eINSTANCE.getpreand_Name();

		/**
		 * The meta object literal for the '<em><b>Quorum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREAND__QUORUM = eINSTANCE.getpreand_Quorum();

		/**
		 * The meta object literal for the '<em><b>Precedence3</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREAND__PRECEDENCE3 = eINSTANCE.getpreand_Precedence3();

		/**
		 * The meta object literal for the '<em><b>Activity RPre And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREAND__ACTIVITY_RPRE_AND = eINSTANCE.getpreand_ActivityRPreAnd();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.postImpl <em>post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.postImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getpost()
		 * @generated
		 */
		EClass POST = eINSTANCE.getpost();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__NAME = eINSTANCE.getpost_Name();

		/**
		 * The meta object literal for the '<em><b>Precedence4</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__PRECEDENCE4 = eINSTANCE.getpost_Precedence4();

		/**
		 * The meta object literal for the '<em><b>Activity RPost</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__ACTIVITY_RPOST = eINSTANCE.getpost_ActivityRPost();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.postorImpl <em>postor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.postorImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getpostor()
		 * @generated
		 */
		EClass POSTOR = eINSTANCE.getpostor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTOR__NAME = eINSTANCE.getpostor_Name();

		/**
		 * The meta object literal for the '<em><b>Precedence5</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTOR__PRECEDENCE5 = eINSTANCE.getpostor_Precedence5();

		/**
		 * The meta object literal for the '<em><b>Activity RPost Or</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTOR__ACTIVITY_RPOST_OR = eINSTANCE.getpostor_ActivityRPostOr();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.impl.postandImpl <em>postand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.impl.postandImpl
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getpostand()
		 * @generated
		 */
		EClass POSTAND = eINSTANCE.getpostand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAND__NAME = eINSTANCE.getpostand_Name();

		/**
		 * The meta object literal for the '<em><b>Precedence6</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAND__PRECEDENCE6 = eINSTANCE.getpostand_Precedence6();

		/**
		 * The meta object literal for the '<em><b>Activity RPost And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAND__ACTIVITY_RPOST_AND = eINSTANCE.getpostand_ActivityRPostAnd();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.PSchedulerType <em>PScheduler Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.PSchedulerType
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getPSchedulerType()
		 * @generated
		 */
		EEnum PSCHEDULER_TYPE = eINSTANCE.getPSchedulerType();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.TSchedulerType <em>TScheduler Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.TSchedulerType
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getTSchedulerType()
		 * @generated
		 */
		EEnum TSCHEDULER_TYPE = eINSTANCE.getTSchedulerType();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.EntryType <em>Entry Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.EntryType
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getEntryType()
		 * @generated
		 */
		EEnum ENTRY_TYPE = eINSTANCE.getEntryType();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.SemaphoreType <em>Semaphore Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.SemaphoreType
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getSemaphoreType()
		 * @generated
		 */
		EEnum SEMAPHORE_TYPE = eINSTANCE.getSemaphoreType();

		/**
		 * The meta object literal for the '{@link uk.ac.ic.lqn.lqnmodel.CallOrderType <em>Call Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.ic.lqn.lqnmodel.CallOrderType
		 * @see uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl#getCallOrderType()
		 * @generated
		 */
		EEnum CALL_ORDER_TYPE = eINSTANCE.getCallOrderType();

	}

} //LqnmodelPackage
