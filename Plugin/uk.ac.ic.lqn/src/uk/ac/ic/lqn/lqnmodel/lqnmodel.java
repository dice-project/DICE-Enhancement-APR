/**
 */
package uk.ac.ic.lqn.lqnmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>lqnmodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#getDescription <em>Description</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#getLqnSchemaVersion <em>Lqn Schema Version</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#getLqnCoreSchemaVersion <em>Lqn Core Schema Version</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#isXmldebug <em>Xmldebug</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#getProcessor <em>Processor</em>}</li>
 * </ul>
 *
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getlqnmodel()
 * @model
 * @generated
 */
public interface lqnmodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getlqnmodel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getlqnmodel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Lqn Schema Version</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lqn Schema Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lqn Schema Version</em>' attribute.
	 * @see #setLqnSchemaVersion(int)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getlqnmodel_LqnSchemaVersion()
	 * @model default="1"
	 * @generated
	 */
	int getLqnSchemaVersion();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#getLqnSchemaVersion <em>Lqn Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lqn Schema Version</em>' attribute.
	 * @see #getLqnSchemaVersion()
	 * @generated
	 */
	void setLqnSchemaVersion(int value);

	/**
	 * Returns the value of the '<em><b>Lqn Core Schema Version</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lqn Core Schema Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lqn Core Schema Version</em>' attribute.
	 * @see #setLqnCoreSchemaVersion(int)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getlqnmodel_LqnCoreSchemaVersion()
	 * @model default="1"
	 * @generated
	 */
	int getLqnCoreSchemaVersion();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#getLqnCoreSchemaVersion <em>Lqn Core Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lqn Core Schema Version</em>' attribute.
	 * @see #getLqnCoreSchemaVersion()
	 * @generated
	 */
	void setLqnCoreSchemaVersion(int value);

	/**
	 * Returns the value of the '<em><b>Xmldebug</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xmldebug</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xmldebug</em>' attribute.
	 * @see #setXmldebug(boolean)
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getlqnmodel_Xmldebug()
	 * @model default="false"
	 * @generated
	 */
	boolean isXmldebug();

	/**
	 * Sets the value of the '{@link uk.ac.ic.lqn.lqnmodel.lqnmodel#isXmldebug <em>Xmldebug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xmldebug</em>' attribute.
	 * @see #isXmldebug()
	 * @generated
	 */
	void setXmldebug(boolean value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.ic.lqn.lqnmodel.processor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' containment reference list.
	 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getlqnmodel_Processor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<processor> getProcessor();

} // lqnmodel
