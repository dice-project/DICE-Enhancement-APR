/**
 */
package uk.ac.ic.lqn.lqnmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PScheduler Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.ic.lqn.lqnmodel.LqnmodelPackage#getPSchedulerType()
 * @model
 * @generated
 */
public enum PSchedulerType implements Enumerator {
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
	 * The '<em><b>Fcfs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FCFS_VALUE
	 * @generated
	 * @ordered
	 */
	FCFS(1, "fcfs", "fcfs"),

	/**
	 * The '<em><b>Hol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOL_VALUE
	 * @generated
	 * @ordered
	 */
	HOL(2, "hol", "hol"),

	/**
	 * The '<em><b>Pp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PP_VALUE
	 * @generated
	 * @ordered
	 */
	PP(3, "pp", "pp"),

	/**
	 * The '<em><b>Rand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAND_VALUE
	 * @generated
	 * @ordered
	 */
	RAND(4, "rand", "rand"),

	/**
	 * The '<em><b>Inf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INF_VALUE
	 * @generated
	 * @ordered
	 */
	INF(5, "inf", "inf"),

	/**
	 * The '<em><b>Pshol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PSHOL_VALUE
	 * @generated
	 * @ordered
	 */
	PSHOL(6, "pshol", "pshol"),

	/**
	 * The '<em><b>Pspp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PSPP_VALUE
	 * @generated
	 * @ordered
	 */
	PSPP(7, "pspp", "pspp"),

	/**
	 * The '<em><b>Cfs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CFS_VALUE
	 * @generated
	 * @ordered
	 */
	CFS(8, "cfs", "cfs"),

	/**
	 * The '<em><b>Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REF_VALUE
	 * @generated
	 * @ordered
	 */
	REF(9, "ref", "ref"),

	/**
	 * The '<em><b>Pri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRI_VALUE
	 * @generated
	 * @ordered
	 */
	PRI(10, "pri", "pri"),

	/**
	 * The '<em><b>Burst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BURST_VALUE
	 * @generated
	 * @ordered
	 */
	BURST(11, "burst", "burst"),

	/**
	 * The '<em><b>Poll</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLL_VALUE
	 * @generated
	 * @ordered
	 */
	POLL(12, "poll", "poll"),

	/**
	 * The '<em><b>Semaphore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMAPHORE_VALUE
	 * @generated
	 * @ordered
	 */
	SEMAPHORE(13, "semaphore", "semaphore");

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
	public static final int FCFS_VALUE = 1;

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
	public static final int HOL_VALUE = 2;

	/**
	 * The '<em><b>Pp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PP
	 * @model name="pp"
	 * @generated
	 * @ordered
	 */
	public static final int PP_VALUE = 3;

	/**
	 * The '<em><b>Rand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAND
	 * @model name="rand"
	 * @generated
	 * @ordered
	 */
	public static final int RAND_VALUE = 4;

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
	public static final int INF_VALUE = 5;

	/**
	 * The '<em><b>Pshol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pshol</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PSHOL
	 * @model name="pshol"
	 * @generated
	 * @ordered
	 */
	public static final int PSHOL_VALUE = 6;

	/**
	 * The '<em><b>Pspp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pspp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PSPP
	 * @model name="pspp"
	 * @generated
	 * @ordered
	 */
	public static final int PSPP_VALUE = 7;

	/**
	 * The '<em><b>Cfs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cfs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CFS
	 * @model name="cfs"
	 * @generated
	 * @ordered
	 */
	public static final int CFS_VALUE = 8;

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
	public static final int REF_VALUE = 9;

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
	public static final int PRI_VALUE = 10;

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
	public static final int BURST_VALUE = 11;

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
	public static final int POLL_VALUE = 12;

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
	public static final int SEMAPHORE_VALUE = 13;

	/**
	 * An array of all the '<em><b>PScheduler Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PSchedulerType[] VALUES_ARRAY =
		new PSchedulerType[] {
			DEFAULT,
			FCFS,
			HOL,
			PP,
			RAND,
			INF,
			PSHOL,
			PSPP,
			CFS,
			REF,
			PRI,
			BURST,
			POLL,
			SEMAPHORE,
		};

	/**
	 * A public read-only list of all the '<em><b>PScheduler Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PSchedulerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PScheduler Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PSchedulerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PSchedulerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PScheduler Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PSchedulerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PSchedulerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PScheduler Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PSchedulerType get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case FCFS_VALUE: return FCFS;
			case HOL_VALUE: return HOL;
			case PP_VALUE: return PP;
			case RAND_VALUE: return RAND;
			case INF_VALUE: return INF;
			case PSHOL_VALUE: return PSHOL;
			case PSPP_VALUE: return PSPP;
			case CFS_VALUE: return CFS;
			case REF_VALUE: return REF;
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
	private PSchedulerType(int value, String name, String literal) {
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
	
} //PSchedulerType
