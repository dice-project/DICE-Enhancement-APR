/**
 */
package uk.ac.ic.lqn.lqnmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.ic.lqn.lqnmodel.CallOrderType;
import uk.ac.ic.lqn.lqnmodel.EntryType;
import uk.ac.ic.lqn.lqnmodel.LqnmodelFactory;
import uk.ac.ic.lqn.lqnmodel.LqnmodelPackage;
import uk.ac.ic.lqn.lqnmodel.PSchedulerType;
import uk.ac.ic.lqn.lqnmodel.SemaphoreType;
import uk.ac.ic.lqn.lqnmodel.TSchedulerType;
import uk.ac.ic.lqn.lqnmodel.activity;
import uk.ac.ic.lqn.lqnmodel.activityR;
import uk.ac.ic.lqn.lqnmodel.asynchcall;
import uk.ac.ic.lqn.lqnmodel.entry;
import uk.ac.ic.lqn.lqnmodel.entryphaseactivities;
import uk.ac.ic.lqn.lqnmodel.lqnmodel;
import uk.ac.ic.lqn.lqnmodel.post;
import uk.ac.ic.lqn.lqnmodel.postand;
import uk.ac.ic.lqn.lqnmodel.postor;
import uk.ac.ic.lqn.lqnmodel.pre;
import uk.ac.ic.lqn.lqnmodel.preand;
import uk.ac.ic.lqn.lqnmodel.precedence;
import uk.ac.ic.lqn.lqnmodel.preor;
import uk.ac.ic.lqn.lqnmodel.processor;
import uk.ac.ic.lqn.lqnmodel.replyactivity;
import uk.ac.ic.lqn.lqnmodel.replyentry;
import uk.ac.ic.lqn.lqnmodel.synchcall;
import uk.ac.ic.lqn.lqnmodel.task;
import uk.ac.ic.lqn.lqnmodel.taskactivities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LqnmodelPackageImpl extends EPackageImpl implements LqnmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lqnmodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskactivitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryphaseactivitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyentryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyactivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchcallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asynchcallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pSchedulerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tSchedulerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum semaphoreTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callOrderTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LqnmodelPackageImpl() {
		super(eNS_URI, LqnmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LqnmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LqnmodelPackage init() {
		if (isInited) return (LqnmodelPackage)EPackage.Registry.INSTANCE.getEPackage(LqnmodelPackage.eNS_URI);

		// Obtain or create and register package
		LqnmodelPackageImpl theLqnmodelPackage = (LqnmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LqnmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LqnmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLqnmodelPackage.createPackageContents();

		// Initialize created meta-data
		theLqnmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLqnmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LqnmodelPackage.eNS_URI, theLqnmodelPackage);
		return theLqnmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlqnmodel() {
		return lqnmodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getlqnmodel_Name() {
		return (EAttribute)lqnmodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getlqnmodel_Description() {
		return (EAttribute)lqnmodelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getlqnmodel_LqnSchemaVersion() {
		return (EAttribute)lqnmodelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getlqnmodel_LqnCoreSchemaVersion() {
		return (EAttribute)lqnmodelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getlqnmodel_Xmldebug() {
		return (EAttribute)lqnmodelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getlqnmodel_Processor() {
		return (EReference)lqnmodelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getprocessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprocessor_Name() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprocessor_Multiplicity() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprocessor_Speedfactor() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprocessor_Scheduling() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprocessor_Replication() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprocessor_Quantum() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getprocessor_Task() {
		return (EReference)processorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettask_Multiplicity() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettask_Priority() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettask_Queuelength() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettask_Scheduling() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettask_Activitygraph() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettask_Thinktime() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettask_Entry() {
		return (EReference)taskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettask_Taskactivities() {
		return (EReference)taskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettask_Host() {
		return (EReference)taskEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getentry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getentry_Name() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getentry_Type() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getentry_Openarrivalrate() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getentry_Priority() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getentry_Semaphore() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getentry_Task1() {
		return (EReference)entryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getentry_Entryphaseactivities() {
		return (EReference)entryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettaskactivities() {
		return taskactivitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettaskactivities_Activity() {
		return (EReference)taskactivitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettaskactivities_Precedence() {
		return (EReference)taskactivitiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettaskactivities_Replyentry() {
		return (EReference)taskactivitiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettaskactivities_Task2() {
		return (EReference)taskactivitiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getentryphaseactivities() {
		return entryphaseactivitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getentryphaseactivities_Activity1() {
		return (EReference)entryphaseactivitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getentryphaseactivities_Entry1() {
		return (EReference)entryphaseactivitiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getactivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getactivity_Name() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getactivity_Hostdemandmean() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getactivity_Hostdemandcvsq() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getactivity_Thinktime() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getactivity_Maxservicetime() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getactivity_Callorder() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getactivity_Phase() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getactivity_Boundtoentry() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getactivity_Prob() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getactivity_Count() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactivity_Synchcall() {
		return (EReference)activityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactivity_Asynchcall() {
		return (EReference)activityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactivity_TaskActivity() {
		return (EReference)activityEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactivity_Entryphaseactivities1() {
		return (EReference)activityEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getprecedence() {
		return precedenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprecedence_Name() {
		return (EAttribute)precedenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getprecedence_TaskActivityP() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getprecedence_Pre() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getprecedence_Preor() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getprecedence_Preand() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getprecedence_Post() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getprecedence_Postor() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getprecedence_Postand() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getreplyentry() {
		return replyentryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getreplyentry_Name() {
		return (EAttribute)replyentryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreplyentry_TaskActivityR() {
		return (EReference)replyentryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreplyentry_Replyactivity() {
		return (EReference)replyentryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getreplyactivity() {
		return replyactivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getreplyactivity_Name() {
		return (EAttribute)replyactivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreplyactivity_ReplyEntry1() {
		return (EReference)replyactivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsynchcall() {
		return synchcallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsynchcall_Name() {
		return (EAttribute)synchcallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsynchcall_Dest() {
		return (EAttribute)synchcallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsynchcall_Callsmean() {
		return (EAttribute)synchcallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsynchcall_ActivitySynchCall() {
		return (EReference)synchcallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getasynchcall() {
		return asynchcallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getasynchcall_Name() {
		return (EAttribute)asynchcallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getasynchcall_Dest() {
		return (EAttribute)asynchcallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getasynchcall_Callsmean() {
		return (EAttribute)asynchcallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getasynchcall_ActivityASynchCall() {
		return (EReference)asynchcallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getactivityR() {
		return activityREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getactivityR_Name() {
		return (EAttribute)activityREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getactivityR_Prob() {
		return (EAttribute)activityREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactivityR_PreActivityR() {
		return (EReference)activityREClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactivityR_PreorActivityR() {
		return (EReference)activityREClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactivityR_PreandActivityR() {
		return (EReference)activityREClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactivityR_PostActivityR() {
		return (EReference)activityREClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactivityR_PostorActivityR() {
		return (EReference)activityREClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactivityR_PostandActivityR() {
		return (EReference)activityREClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpre() {
		return preEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpre_Name() {
		return (EAttribute)preEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpre_Precedence1() {
		return (EReference)preEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpre_ActivityRPre() {
		return (EReference)preEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpreor() {
		return preorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpreor_Name() {
		return (EAttribute)preorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpreor_Precedence2() {
		return (EReference)preorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpreor_ActivityRPreOr() {
		return (EReference)preorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpreand() {
		return preandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpreand_Name() {
		return (EAttribute)preandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpreand_Quorum() {
		return (EAttribute)preandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpreand_Precedence3() {
		return (EReference)preandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpreand_ActivityRPreAnd() {
		return (EReference)preandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpost() {
		return postEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpost_Name() {
		return (EAttribute)postEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpost_Precedence4() {
		return (EReference)postEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpost_ActivityRPost() {
		return (EReference)postEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpostor() {
		return postorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpostor_Name() {
		return (EAttribute)postorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpostor_Precedence5() {
		return (EReference)postorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpostor_ActivityRPostOr() {
		return (EReference)postorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpostand() {
		return postandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpostand_Name() {
		return (EAttribute)postandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpostand_Precedence6() {
		return (EReference)postandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpostand_ActivityRPostAnd() {
		return (EReference)postandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPSchedulerType() {
		return pSchedulerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTSchedulerType() {
		return tSchedulerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntryType() {
		return entryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSemaphoreType() {
		return semaphoreTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallOrderType() {
		return callOrderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnmodelFactory getLqnmodelFactory() {
		return (LqnmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		lqnmodelEClass = createEClass(LQNMODEL);
		createEAttribute(lqnmodelEClass, LQNMODEL__NAME);
		createEAttribute(lqnmodelEClass, LQNMODEL__DESCRIPTION);
		createEAttribute(lqnmodelEClass, LQNMODEL__LQN_SCHEMA_VERSION);
		createEAttribute(lqnmodelEClass, LQNMODEL__LQN_CORE_SCHEMA_VERSION);
		createEAttribute(lqnmodelEClass, LQNMODEL__XMLDEBUG);
		createEReference(lqnmodelEClass, LQNMODEL__PROCESSOR);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__NAME);
		createEAttribute(processorEClass, PROCESSOR__MULTIPLICITY);
		createEAttribute(processorEClass, PROCESSOR__SPEEDFACTOR);
		createEAttribute(processorEClass, PROCESSOR__SCHEDULING);
		createEAttribute(processorEClass, PROCESSOR__REPLICATION);
		createEAttribute(processorEClass, PROCESSOR__QUANTUM);
		createEReference(processorEClass, PROCESSOR__TASK);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__MULTIPLICITY);
		createEAttribute(taskEClass, TASK__PRIORITY);
		createEAttribute(taskEClass, TASK__QUEUELENGTH);
		createEAttribute(taskEClass, TASK__SCHEDULING);
		createEAttribute(taskEClass, TASK__ACTIVITYGRAPH);
		createEAttribute(taskEClass, TASK__THINKTIME);
		createEReference(taskEClass, TASK__ENTRY);
		createEReference(taskEClass, TASK__TASKACTIVITIES);
		createEReference(taskEClass, TASK__HOST);

		entryEClass = createEClass(ENTRY);
		createEAttribute(entryEClass, ENTRY__NAME);
		createEAttribute(entryEClass, ENTRY__TYPE);
		createEAttribute(entryEClass, ENTRY__OPENARRIVALRATE);
		createEAttribute(entryEClass, ENTRY__PRIORITY);
		createEAttribute(entryEClass, ENTRY__SEMAPHORE);
		createEReference(entryEClass, ENTRY__TASK1);
		createEReference(entryEClass, ENTRY__ENTRYPHASEACTIVITIES);

		taskactivitiesEClass = createEClass(TASKACTIVITIES);
		createEReference(taskactivitiesEClass, TASKACTIVITIES__ACTIVITY);
		createEReference(taskactivitiesEClass, TASKACTIVITIES__PRECEDENCE);
		createEReference(taskactivitiesEClass, TASKACTIVITIES__REPLYENTRY);
		createEReference(taskactivitiesEClass, TASKACTIVITIES__TASK2);

		entryphaseactivitiesEClass = createEClass(ENTRYPHASEACTIVITIES);
		createEReference(entryphaseactivitiesEClass, ENTRYPHASEACTIVITIES__ACTIVITY1);
		createEReference(entryphaseactivitiesEClass, ENTRYPHASEACTIVITIES__ENTRY1);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__NAME);
		createEAttribute(activityEClass, ACTIVITY__HOSTDEMANDMEAN);
		createEAttribute(activityEClass, ACTIVITY__HOSTDEMANDCVSQ);
		createEAttribute(activityEClass, ACTIVITY__THINKTIME);
		createEAttribute(activityEClass, ACTIVITY__MAXSERVICETIME);
		createEAttribute(activityEClass, ACTIVITY__CALLORDER);
		createEAttribute(activityEClass, ACTIVITY__PHASE);
		createEAttribute(activityEClass, ACTIVITY__BOUNDTOENTRY);
		createEAttribute(activityEClass, ACTIVITY__PROB);
		createEAttribute(activityEClass, ACTIVITY__COUNT);
		createEReference(activityEClass, ACTIVITY__SYNCHCALL);
		createEReference(activityEClass, ACTIVITY__ASYNCHCALL);
		createEReference(activityEClass, ACTIVITY__TASK_ACTIVITY);
		createEReference(activityEClass, ACTIVITY__ENTRYPHASEACTIVITIES1);

		precedenceEClass = createEClass(PRECEDENCE);
		createEAttribute(precedenceEClass, PRECEDENCE__NAME);
		createEReference(precedenceEClass, PRECEDENCE__TASK_ACTIVITY_P);
		createEReference(precedenceEClass, PRECEDENCE__PRE);
		createEReference(precedenceEClass, PRECEDENCE__PREOR);
		createEReference(precedenceEClass, PRECEDENCE__PREAND);
		createEReference(precedenceEClass, PRECEDENCE__POST);
		createEReference(precedenceEClass, PRECEDENCE__POSTOR);
		createEReference(precedenceEClass, PRECEDENCE__POSTAND);

		replyentryEClass = createEClass(REPLYENTRY);
		createEAttribute(replyentryEClass, REPLYENTRY__NAME);
		createEReference(replyentryEClass, REPLYENTRY__TASK_ACTIVITY_R);
		createEReference(replyentryEClass, REPLYENTRY__REPLYACTIVITY);

		replyactivityEClass = createEClass(REPLYACTIVITY);
		createEAttribute(replyactivityEClass, REPLYACTIVITY__NAME);
		createEReference(replyactivityEClass, REPLYACTIVITY__REPLY_ENTRY1);

		synchcallEClass = createEClass(SYNCHCALL);
		createEAttribute(synchcallEClass, SYNCHCALL__NAME);
		createEAttribute(synchcallEClass, SYNCHCALL__DEST);
		createEAttribute(synchcallEClass, SYNCHCALL__CALLSMEAN);
		createEReference(synchcallEClass, SYNCHCALL__ACTIVITY_SYNCH_CALL);

		asynchcallEClass = createEClass(ASYNCHCALL);
		createEAttribute(asynchcallEClass, ASYNCHCALL__NAME);
		createEAttribute(asynchcallEClass, ASYNCHCALL__DEST);
		createEAttribute(asynchcallEClass, ASYNCHCALL__CALLSMEAN);
		createEReference(asynchcallEClass, ASYNCHCALL__ACTIVITY_ASYNCH_CALL);

		activityREClass = createEClass(ACTIVITY_R);
		createEAttribute(activityREClass, ACTIVITY_R__NAME);
		createEAttribute(activityREClass, ACTIVITY_R__PROB);
		createEReference(activityREClass, ACTIVITY_R__PRE_ACTIVITY_R);
		createEReference(activityREClass, ACTIVITY_R__PREOR_ACTIVITY_R);
		createEReference(activityREClass, ACTIVITY_R__PREAND_ACTIVITY_R);
		createEReference(activityREClass, ACTIVITY_R__POST_ACTIVITY_R);
		createEReference(activityREClass, ACTIVITY_R__POSTOR_ACTIVITY_R);
		createEReference(activityREClass, ACTIVITY_R__POSTAND_ACTIVITY_R);

		preEClass = createEClass(PRE);
		createEAttribute(preEClass, PRE__NAME);
		createEReference(preEClass, PRE__PRECEDENCE1);
		createEReference(preEClass, PRE__ACTIVITY_RPRE);

		preorEClass = createEClass(PREOR);
		createEAttribute(preorEClass, PREOR__NAME);
		createEReference(preorEClass, PREOR__PRECEDENCE2);
		createEReference(preorEClass, PREOR__ACTIVITY_RPRE_OR);

		preandEClass = createEClass(PREAND);
		createEAttribute(preandEClass, PREAND__NAME);
		createEAttribute(preandEClass, PREAND__QUORUM);
		createEReference(preandEClass, PREAND__PRECEDENCE3);
		createEReference(preandEClass, PREAND__ACTIVITY_RPRE_AND);

		postEClass = createEClass(POST);
		createEAttribute(postEClass, POST__NAME);
		createEReference(postEClass, POST__PRECEDENCE4);
		createEReference(postEClass, POST__ACTIVITY_RPOST);

		postorEClass = createEClass(POSTOR);
		createEAttribute(postorEClass, POSTOR__NAME);
		createEReference(postorEClass, POSTOR__PRECEDENCE5);
		createEReference(postorEClass, POSTOR__ACTIVITY_RPOST_OR);

		postandEClass = createEClass(POSTAND);
		createEAttribute(postandEClass, POSTAND__NAME);
		createEReference(postandEClass, POSTAND__PRECEDENCE6);
		createEReference(postandEClass, POSTAND__ACTIVITY_RPOST_AND);

		// Create enums
		pSchedulerTypeEEnum = createEEnum(PSCHEDULER_TYPE);
		tSchedulerTypeEEnum = createEEnum(TSCHEDULER_TYPE);
		entryTypeEEnum = createEEnum(ENTRY_TYPE);
		semaphoreTypeEEnum = createEEnum(SEMAPHORE_TYPE);
		callOrderTypeEEnum = createEEnum(CALL_ORDER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(lqnmodelEClass, lqnmodel.class, "lqnmodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getlqnmodel_Name(), ecorePackage.getEString(), "name", null, 0, 1, lqnmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getlqnmodel_Description(), ecorePackage.getEString(), "description", null, 0, 1, lqnmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getlqnmodel_LqnSchemaVersion(), ecorePackage.getEInt(), "lqnSchemaVersion", "1", 0, 1, lqnmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getlqnmodel_LqnCoreSchemaVersion(), ecorePackage.getEInt(), "lqnCoreSchemaVersion", "1", 0, 1, lqnmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getlqnmodel_Xmldebug(), ecorePackage.getEBoolean(), "xmldebug", "false", 0, 1, lqnmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getlqnmodel_Processor(), this.getprocessor(), null, "processor", null, 1, -1, lqnmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, processor.class, "processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getprocessor_Name(), ecorePackage.getEString(), "name", null, 0, 1, processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getprocessor_Multiplicity(), ecorePackage.getEInt(), "multiplicity", "0", 0, 1, processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getprocessor_Speedfactor(), ecorePackage.getEFloat(), "speedfactor", "1", 0, 1, processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getprocessor_Scheduling(), this.getPSchedulerType(), "scheduling", null, 0, 1, processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getprocessor_Replication(), ecorePackage.getEInt(), "replication", "1", 0, 1, processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getprocessor_Quantum(), ecorePackage.getEFloat(), "quantum", "0", 0, 1, processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getprocessor_Task(), this.gettask(), this.gettask_Host(), "task", null, 1, -1, processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, task.class, "task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettask_Name(), ecorePackage.getEString(), "name", null, 0, 1, task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettask_Multiplicity(), ecorePackage.getEInt(), "multiplicity", "0", 0, 1, task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettask_Priority(), ecorePackage.getEInt(), "priority", "0", 0, 1, task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettask_Queuelength(), ecorePackage.getEInt(), "queuelength", "0", 0, 1, task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettask_Scheduling(), this.getTSchedulerType(), "scheduling", null, 0, 1, task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettask_Activitygraph(), ecorePackage.getEBoolean(), "activitygraph", null, 0, 1, task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettask_Thinktime(), ecorePackage.getEFloat(), "thinktime", "0", 0, 1, task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettask_Entry(), this.getentry(), this.getentry_Task1(), "entry", null, 1, -1, task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettask_Taskactivities(), this.gettaskactivities(), this.gettaskactivities_Task2(), "taskactivities", null, 0, -1, task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettask_Host(), this.getprocessor(), this.getprocessor_Task(), "host", null, 1, 1, task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryEClass, entry.class, "entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getentry_Name(), ecorePackage.getEString(), "name", null, 0, 1, entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getentry_Type(), this.getEntryType(), "type", null, 0, 1, entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getentry_Openarrivalrate(), ecorePackage.getEFloat(), "openarrivalrate", null, 0, 1, entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getentry_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getentry_Semaphore(), this.getSemaphoreType(), "semaphore", null, 0, 1, entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getentry_Task1(), this.gettask(), this.gettask_Entry(), "task1", null, 1, 1, entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getentry_Entryphaseactivities(), this.getentryphaseactivities(), this.getentryphaseactivities_Entry1(), "entryphaseactivities", null, 0, 1, entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskactivitiesEClass, taskactivities.class, "taskactivities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettaskactivities_Activity(), this.getactivity(), this.getactivity_TaskActivity(), "activity", null, 1, -1, taskactivities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettaskactivities_Precedence(), this.getprecedence(), this.getprecedence_TaskActivityP(), "precedence", null, 0, -1, taskactivities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettaskactivities_Replyentry(), this.getreplyentry(), this.getreplyentry_TaskActivityR(), "replyentry", null, 0, -1, taskactivities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettaskactivities_Task2(), this.gettask(), this.gettask_Taskactivities(), "task2", null, 1, 1, taskactivities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryphaseactivitiesEClass, entryphaseactivities.class, "entryphaseactivities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getentryphaseactivities_Activity1(), this.getactivity(), this.getactivity_Entryphaseactivities1(), "activity1", null, 1, 3, entryphaseactivities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getentryphaseactivities_Entry1(), this.getentry(), this.getentry_Entryphaseactivities(), "entry1", null, 1, 1, entryphaseactivities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, activity.class, "activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getactivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getactivity_Hostdemandmean(), ecorePackage.getEFloat(), "hostdemandmean", null, 0, 1, activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getactivity_Hostdemandcvsq(), ecorePackage.getEFloat(), "hostdemandcvsq", "1", 0, 1, activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getactivity_Thinktime(), ecorePackage.getEFloat(), "thinktime", "0", 0, 1, activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getactivity_Maxservicetime(), ecorePackage.getEFloat(), "maxservicetime", "0", 0, 1, activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getactivity_Callorder(), this.getCallOrderType(), "callorder", null, 0, 1, activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getactivity_Phase(), ecorePackage.getEInt(), "phase", null, 0, 1, activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getactivity_Boundtoentry(), ecorePackage.getEString(), "boundtoentry", null, 0, 1, activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getactivity_Prob(), ecorePackage.getEFloat(), "prob", "1", 0, 1, activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getactivity_Count(), ecorePackage.getEFloat(), "count", "1", 0, 1, activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getactivity_Synchcall(), this.getsynchcall(), this.getsynchcall_ActivitySynchCall(), "synchcall", null, 0, -1, activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getactivity_Asynchcall(), this.getasynchcall(), this.getasynchcall_ActivityASynchCall(), "asynchcall", null, 0, -1, activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getactivity_TaskActivity(), this.gettaskactivities(), this.gettaskactivities_Activity(), "taskActivity", null, 0, 1, activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getactivity_Entryphaseactivities1(), this.getentryphaseactivities(), this.getentryphaseactivities_Activity1(), "entryphaseactivities1", null, 0, 1, activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precedenceEClass, precedence.class, "precedence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getprecedence_Name(), ecorePackage.getEString(), "name", null, 0, 1, precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getprecedence_TaskActivityP(), this.gettaskactivities(), this.gettaskactivities_Precedence(), "taskActivityP", null, 1, 1, precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getprecedence_Pre(), this.getpre(), this.getpre_Precedence1(), "pre", null, 0, 1, precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getprecedence_Preor(), this.getpreor(), this.getpreor_Precedence2(), "preor", null, 0, 1, precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getprecedence_Preand(), this.getpreand(), this.getpreand_Precedence3(), "preand", null, 0, 1, precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getprecedence_Post(), this.getpost(), this.getpost_Precedence4(), "post", null, 0, 1, precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getprecedence_Postor(), this.getpostor(), this.getpostor_Precedence5(), "postor", null, 0, 1, precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getprecedence_Postand(), this.getpostand(), this.getpostand_Precedence6(), "postand", null, 0, 1, precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replyentryEClass, replyentry.class, "replyentry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getreplyentry_Name(), ecorePackage.getEString(), "name", null, 0, 1, replyentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getreplyentry_TaskActivityR(), this.gettaskactivities(), this.gettaskactivities_Replyentry(), "taskActivityR", null, 1, 1, replyentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getreplyentry_Replyactivity(), this.getreplyactivity(), this.getreplyactivity_ReplyEntry1(), "replyactivity", null, 1, -1, replyentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replyactivityEClass, replyactivity.class, "replyactivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getreplyactivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, replyactivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getreplyactivity_ReplyEntry1(), this.getreplyentry(), this.getreplyentry_Replyactivity(), "replyEntry1", null, 1, 1, replyactivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchcallEClass, synchcall.class, "synchcall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getsynchcall_Name(), ecorePackage.getEString(), "name", null, 0, 1, synchcall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsynchcall_Dest(), ecorePackage.getEString(), "dest", null, 0, 1, synchcall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsynchcall_Callsmean(), ecorePackage.getEFloat(), "callsmean", null, 0, 1, synchcall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsynchcall_ActivitySynchCall(), this.getactivity(), this.getactivity_Synchcall(), "activitySynchCall", null, 1, 1, synchcall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asynchcallEClass, asynchcall.class, "asynchcall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getasynchcall_Name(), ecorePackage.getEString(), "name", null, 0, 1, asynchcall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getasynchcall_Dest(), ecorePackage.getEString(), "dest", null, 0, 1, asynchcall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getasynchcall_Callsmean(), ecorePackage.getEFloat(), "callsmean", null, 0, 1, asynchcall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getasynchcall_ActivityASynchCall(), this.getactivity(), this.getactivity_Asynchcall(), "activityASynchCall", null, 1, 1, asynchcall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityREClass, activityR.class, "activityR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getactivityR_Name(), ecorePackage.getEString(), "name", null, 0, 1, activityR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getactivityR_Prob(), ecorePackage.getEFloat(), "prob", "1", 0, 1, activityR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getactivityR_PreActivityR(), this.getpre(), this.getpre_ActivityRPre(), "preActivityR", null, 0, 1, activityR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getactivityR_PreorActivityR(), this.getpreor(), this.getpreor_ActivityRPreOr(), "preorActivityR", null, 0, 1, activityR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getactivityR_PreandActivityR(), this.getpreand(), this.getpreand_ActivityRPreAnd(), "preandActivityR", null, 0, 1, activityR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getactivityR_PostActivityR(), this.getpost(), this.getpost_ActivityRPost(), "postActivityR", null, 0, 1, activityR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getactivityR_PostorActivityR(), this.getpostor(), this.getpostor_ActivityRPostOr(), "postorActivityR", null, 0, 1, activityR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getactivityR_PostandActivityR(), this.getpostand(), this.getpostand_ActivityRPostAnd(), "postandActivityR", null, 0, 1, activityR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preEClass, pre.class, "pre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getpre_Name(), ecorePackage.getEString(), "name", null, 0, 1, pre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpre_Precedence1(), this.getprecedence(), this.getprecedence_Pre(), "precedence1", null, 1, 1, pre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpre_ActivityRPre(), this.getactivityR(), this.getactivityR_PreActivityR(), "activityRPre", null, 1, 1, pre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preorEClass, preor.class, "preor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getpreor_Name(), ecorePackage.getEString(), "name", null, 0, 1, preor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpreor_Precedence2(), this.getprecedence(), this.getprecedence_Preor(), "precedence2", null, 1, 1, preor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpreor_ActivityRPreOr(), this.getactivityR(), this.getactivityR_PreorActivityR(), "activityRPreOr", null, 1, -1, preor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preandEClass, preand.class, "preand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getpreand_Name(), ecorePackage.getEString(), "name", null, 0, 1, preand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getpreand_Quorum(), ecorePackage.getEInt(), "quorum", "0", 0, 1, preand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpreand_Precedence3(), this.getprecedence(), this.getprecedence_Preand(), "precedence3", null, 1, 1, preand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpreand_ActivityRPreAnd(), this.getactivityR(), this.getactivityR_PreandActivityR(), "activityRPreAnd", null, 1, -1, preand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postEClass, post.class, "post", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getpost_Name(), ecorePackage.getEString(), "name", null, 0, 1, post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpost_Precedence4(), this.getprecedence(), this.getprecedence_Post(), "precedence4", null, 1, 1, post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpost_ActivityRPost(), this.getactivityR(), this.getactivityR_PostActivityR(), "activityRPost", null, 1, 1, post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postorEClass, postor.class, "postor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getpostor_Name(), ecorePackage.getEString(), "name", null, 0, 1, postor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpostor_Precedence5(), this.getprecedence(), this.getprecedence_Postor(), "precedence5", null, 1, 1, postor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpostor_ActivityRPostOr(), this.getactivityR(), this.getactivityR_PostorActivityR(), "activityRPostOr", null, 1, -1, postor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postandEClass, postand.class, "postand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getpostand_Name(), ecorePackage.getEString(), "name", null, 0, 1, postand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpostand_Precedence6(), this.getprecedence(), this.getprecedence_Postand(), "precedence6", null, 1, 1, postand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpostand_ActivityRPostAnd(), this.getactivityR(), this.getactivityR_PostandActivityR(), "activityRPostAnd", null, 1, -1, postand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(pSchedulerTypeEEnum, PSchedulerType.class, "PSchedulerType");
		addEEnumLiteral(pSchedulerTypeEEnum, PSchedulerType.DEFAULT);
		addEEnumLiteral(pSchedulerTypeEEnum, PSchedulerType.FCFS);
		addEEnumLiteral(pSchedulerTypeEEnum, PSchedulerType.HOL);
		addEEnumLiteral(pSchedulerTypeEEnum, PSchedulerType.PP);
		addEEnumLiteral(pSchedulerTypeEEnum, PSchedulerType.RAND);
		addEEnumLiteral(pSchedulerTypeEEnum, PSchedulerType.INF);
		addEEnumLiteral(pSchedulerTypeEEnum, PSchedulerType.PSHOL);
		addEEnumLiteral(pSchedulerTypeEEnum, PSchedulerType.PSPP);
		addEEnumLiteral(pSchedulerTypeEEnum, PSchedulerType.CFS);
		addEEnumLiteral(pSchedulerTypeEEnum, PSchedulerType.REF);
		addEEnumLiteral(pSchedulerTypeEEnum, PSchedulerType.PRI);
		addEEnumLiteral(pSchedulerTypeEEnum, PSchedulerType.BURST);
		addEEnumLiteral(pSchedulerTypeEEnum, PSchedulerType.POLL);
		addEEnumLiteral(pSchedulerTypeEEnum, PSchedulerType.SEMAPHORE);

		initEEnum(tSchedulerTypeEEnum, TSchedulerType.class, "TSchedulerType");
		addEEnumLiteral(tSchedulerTypeEEnum, TSchedulerType.DEFAULT);
		addEEnumLiteral(tSchedulerTypeEEnum, TSchedulerType.REF);
		addEEnumLiteral(tSchedulerTypeEEnum, TSchedulerType.FCFS);
		addEEnumLiteral(tSchedulerTypeEEnum, TSchedulerType.HOL);
		addEEnumLiteral(tSchedulerTypeEEnum, TSchedulerType.INF);
		addEEnumLiteral(tSchedulerTypeEEnum, TSchedulerType.PRI);
		addEEnumLiteral(tSchedulerTypeEEnum, TSchedulerType.BURST);
		addEEnumLiteral(tSchedulerTypeEEnum, TSchedulerType.POLL);
		addEEnumLiteral(tSchedulerTypeEEnum, TSchedulerType.SEMAPHORE);

		initEEnum(entryTypeEEnum, EntryType.class, "EntryType");
		addEEnumLiteral(entryTypeEEnum, EntryType.DEFAULT);
		addEEnumLiteral(entryTypeEEnum, EntryType.GRAPH);
		addEEnumLiteral(entryTypeEEnum, EntryType.PH1PH2);
		addEEnumLiteral(entryTypeEEnum, EntryType.NONE);

		initEEnum(semaphoreTypeEEnum, SemaphoreType.class, "SemaphoreType");
		addEEnumLiteral(semaphoreTypeEEnum, SemaphoreType.DEFAULT);
		addEEnumLiteral(semaphoreTypeEEnum, SemaphoreType.SIGNAL);
		addEEnumLiteral(semaphoreTypeEEnum, SemaphoreType.WAIT);

		initEEnum(callOrderTypeEEnum, CallOrderType.class, "CallOrderType");
		addEEnumLiteral(callOrderTypeEEnum, CallOrderType.DEFAULT);
		addEEnumLiteral(callOrderTypeEEnum, CallOrderType.STOCHASTIC);
		addEEnumLiteral(callOrderTypeEEnum, CallOrderType.DETERMINISTIC);

		// Create resource
		createResource(eNS_URI);
	}

} //LqnmodelPackageImpl
