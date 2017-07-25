/**
 */
package uk.ac.ic.lqn.lqnmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Call Order Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getCallOrderType()
 * @model
 * @generated
 */
public enum CallOrderType implements Enumerator {
	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "default", "default"),

	/**
	 * The '<em><b>Stochastic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOCHASTIC_VALUE
	 * @generated
	 * @ordered
	 */
	STOCHASTIC(1, "stochastic", "stochastic"),

	/**
	 * The '<em><b>Deterministic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETERMINISTIC_VALUE
	 * @generated
	 * @ordered
	 */
	DETERMINISTIC(2, "deterministic", "deterministic");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Stochastic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stochastic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOCHASTIC
	 * @model name="stochastic"
	 * @generated
	 * @ordered
	 */
	public static final int STOCHASTIC_VALUE = 1;

	/**
	 * The '<em><b>Deterministic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deterministic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DETERMINISTIC
	 * @model name="deterministic"
	 * @generated
	 * @ordered
	 */
	public static final int DETERMINISTIC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Call Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CallOrderType[] VALUES_ARRAY =
		new CallOrderType[] {
			DEFAULT,
			STOCHASTIC,
			DETERMINISTIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Call Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CallOrderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Call Order Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CallOrderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CallOrderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Call Order Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CallOrderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CallOrderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Call Order Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CallOrderType get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case STOCHASTIC_VALUE: return STOCHASTIC;
			case DETERMINISTIC_VALUE: return DETERMINISTIC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CallOrderType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CallOrderType
