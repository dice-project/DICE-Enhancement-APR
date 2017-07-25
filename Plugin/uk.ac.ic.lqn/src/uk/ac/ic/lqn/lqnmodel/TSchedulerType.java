/**
 */
package uk.ac.ic.lqn.lqnmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TScheduler Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getTSchedulerType()
 * @model
 * @generated
 */
public enum TSchedulerType implements Enumerator {
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
	 * The '<em><b>Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REF_VALUE
	 * @generated
	 * @ordered
	 */
	REF(1, "ref", "ref"),

	/**
	 * The '<em><b>Fcfs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FCFS_VALUE
	 * @generated
	 * @ordered
	 */
	FCFS(2, "fcfs", "fcfs"),

	/**
	 * The '<em><b>Hol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOL_VALUE
	 * @generated
	 * @ordered
	 */
	HOL(3, "hol", "hol"),

	/**
	 * The '<em><b>Inf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INF_VALUE
	 * @generated
	 * @ordered
	 */
	INF(4, "inf", "inf"),

	/**
	 * The '<em><b>Pri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRI_VALUE
	 * @generated
	 * @ordered
	 */
	PRI(5, "pri", "pri"),

	/**
	 * The '<em><b>Burst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BURST_VALUE
	 * @generated
	 * @ordered
	 */
	BURST(6, "burst", "burst"),

	/**
	 * The '<em><b>Poll</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLL_VALUE
	 * @generated
	 * @ordered
	 */
	POLL(7, "poll", "poll"),

	/**
	 * The '<em><b>Semaphore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMAPHORE_VALUE
	 * @generated
	 * @ordered
	 */
	SEMAPHORE(8, "semaphore", "semaphore");

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
	 * The '<em><b>Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ref</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REF
	 * @model name="ref"
	 * @generated
	 * @ordered
	 */
	public static final int REF_VALUE = 1;

	/**
	 * The '<em><b>Fcfs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fcfs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FCFS
	 * @model name="fcfs"
	 * @generated
	 * @ordered
	 */
	public static final int FCFS_VALUE = 2;

	/**
	 * The '<em><b>Hol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hol</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOL
	 * @model name="hol"
	 * @generated
	 * @ordered
	 */
	public static final int HOL_VALUE = 3;

	/**
	 * The '<em><b>Inf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INF
	 * @model name="inf"
	 * @generated
	 * @ordered
	 */
	public static final int INF_VALUE = 4;

	/**
	 * The '<em><b>Pri</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pri</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRI
	 * @model name="pri"
	 * @generated
	 * @ordered
	 */
	public static final int PRI_VALUE = 5;

	/**
	 * The '<em><b>Burst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Burst</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BURST
	 * @model name="burst"
	 * @generated
	 * @ordered
	 */
	public static final int BURST_VALUE = 6;

	/**
	 * The '<em><b>Poll</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poll</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLL
	 * @model name="poll"
	 * @generated
	 * @ordered
	 */
	public static final int POLL_VALUE = 7;

	/**
	 * The '<em><b>Semaphore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Semaphore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEMAPHORE
	 * @model name="semaphore"
	 * @generated
	 * @ordered
	 */
	public static final int SEMAPHORE_VALUE = 8;

	/**
	 * An array of all the '<em><b>TScheduler Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TSchedulerType[] VALUES_ARRAY =
		new TSchedulerType[] {
			DEFAULT,
			REF,
			FCFS,
			HOL,
			INF,
			PRI,
			BURST,
			POLL,
			SEMAPHORE,
		};

	/**
	 * A public read-only list of all the '<em><b>TScheduler Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TSchedulerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TScheduler Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TSchedulerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TSchedulerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TScheduler Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TSchedulerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TSchedulerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TScheduler Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TSchedulerType get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case REF_VALUE: return REF;
			case FCFS_VALUE: return FCFS;
			case HOL_VALUE: return HOL;
			case INF_VALUE: return INF;
			case PRI_VALUE: return PRI;
			case BURST_VALUE: return BURST;
			case POLL_VALUE: return POLL;
			case SEMAPHORE_VALUE: return SEMAPHORE;
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
	private TSchedulerType(int value, String name, String literal) {
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
	
} //TSchedulerType
