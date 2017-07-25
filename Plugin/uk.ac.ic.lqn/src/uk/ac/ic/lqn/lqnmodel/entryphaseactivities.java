/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>entryphaseactivities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.entryphaseactivities#getActivity1 <em>Activity1</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.entryphaseactivities#getEntry1 <em>Entry1</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getentryphaseactivities()
 * @model
 * @generated
 */
public interface entryphaseactivities extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity1</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.activity}.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.activity#getEntryphaseactivities1 <em>Entryphaseactivities1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity1</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getentryphaseactivities_Activity1()
	 * @see uk.ac.ic.lqn.lqnmodel.activity#getEntryphaseactivities1
	 * @model opposite="entryphaseactivities1" containment="true" required="true" upper="3"
	 * @generated
	 */
	EList<activity> getActivity1();

	/**
	 * Returns the value of the '<em><b>Entry1</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.ic.lqn.lqnmodel.entry#getEntryphaseactivities <em>Entryphaseactivities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry1</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry1</em>' container reference.
	 * @see #setEntry1(entry)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getentryphaseactivities_Entry1()
	 * @see uk.ac.ic.lqn.lqnmodel.entry#getEntryphaseactivities
	 * @model opposite="entryphaseactivities" required="true" transient="false"
	 * @generated
	 */
	entry getEntry1();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.entryphaseactivities#getEntry1 <em>Entry1</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry1</em>' container reference.
	 * @see #getEntry1()
	 * @generated
	 */
	void setEntry1(entry value);

} // entryphaseactivities
