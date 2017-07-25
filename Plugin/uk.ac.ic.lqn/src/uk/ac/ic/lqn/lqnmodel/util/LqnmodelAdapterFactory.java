/**
 */
package uk.ac.ic.lqn.lqnmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.ic.lqn.lqnmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage
 * @generated
 */
public class LqnmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LqnmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LqnmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LqnmodelSwitch<Adapter> modelSwitch =
		new LqnmodelSwitch<Adapter>() {
			@Override
			public Adapter caselqnmodel(lqnmodel object) {
				return createlqnmodelAdapter();
			}
			@Override
			public Adapter caseprocessor(processor object) {
				return createprocessorAdapter();
			}
			@Override
			public Adapter casetask(task object) {
				return createtaskAdapter();
			}
			@Override
			public Adapter caseentry(entry object) {
				return createentryAdapter();
			}
			@Override
			public Adapter casetaskactivities(taskactivities object) {
				return createtaskactivitiesAdapter();
			}
			@Override
			public Adapter caseentryphaseactivities(entryphaseactivities object) {
				return createentryphaseactivitiesAdapter();
			}
			@Override
			public Adapter caseactivity(activity object) {
				return createactivityAdapter();
			}
			@Override
			public Adapter caseprecedence(precedence object) {
				return createprecedenceAdapter();
			}
			@Override
			public Adapter casereplyentry(replyentry object) {
				return createreplyentryAdapter();
			}
			@Override
			public Adapter casereplyactivity(replyactivity object) {
				return createreplyactivityAdapter();
			}
			@Override
			public Adapter casesynchcall(synchcall object) {
				return createsynchcallAdapter();
			}
			@Override
			public Adapter caseasynchcall(asynchcall object) {
				return createasynchcallAdapter();
			}
			@Override
			public Adapter caseactivityR(activityR object) {
				return createactivityRAdapter();
			}
			@Override
			public Adapter casepre(pre object) {
				return createpreAdapter();
			}
			@Override
			public Adapter casepreor(preor object) {
				return createpreorAdapter();
			}
			@Override
			public Adapter casepreand(preand object) {
				return createpreandAdapter();
			}
			@Override
			public Adapter casepost(post object) {
				return createpostAdapter();
			}
			@Override
			public Adapter casepostor(postor object) {
				return createpostorAdapter();
			}
			@Override
			public Adapter casepostand(postand object) {
				return createpostandAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.lqnmodel <em>lqnmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.lqnmodel
	 * @generated
	 */
	public Adapter createlqnmodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.processor <em>processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.processor
	 * @generated
	 */
	public Adapter createprocessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.task <em>task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.task
	 * @generated
	 */
	public Adapter createtaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.entry <em>entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.entry
	 * @generated
	 */
	public Adapter createentryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.taskactivities <em>taskactivities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.taskactivities
	 * @generated
	 */
	public Adapter createtaskactivitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.entryphaseactivities <em>entryphaseactivities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.entryphaseactivities
	 * @generated
	 */
	public Adapter createentryphaseactivitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.activity <em>activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.activity
	 * @generated
	 */
	public Adapter createactivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.precedence <em>precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.precedence
	 * @generated
	 */
	public Adapter createprecedenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.replyentry <em>replyentry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.replyentry
	 * @generated
	 */
	public Adapter createreplyentryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.replyactivity <em>replyactivity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.replyactivity
	 * @generated
	 */
	public Adapter createreplyactivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.synchcall <em>synchcall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.synchcall
	 * @generated
	 */
	public Adapter createsynchcallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.asynchcall <em>asynchcall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.asynchcall
	 * @generated
	 */
	public Adapter createasynchcallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.activityR <em>activity R</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.activityR
	 * @generated
	 */
	public Adapter createactivityRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.pre <em>pre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.pre
	 * @generated
	 */
	public Adapter createpreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.preor <em>preor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.preor
	 * @generated
	 */
	public Adapter createpreorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.preand <em>preand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.preand
	 * @generated
	 */
	public Adapter createpreandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.post <em>post</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.post
	 * @generated
	 */
	public Adapter createpostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.postor <em>postor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.postor
	 * @generated
	 */
	public Adapter createpostorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.ic.lqn.lqnmodel.postand <em>postand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.ic.lqn.lqnmodel.postand
	 * @generated
	 */
	public Adapter createpostandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LqnmodelAdapterFactory
