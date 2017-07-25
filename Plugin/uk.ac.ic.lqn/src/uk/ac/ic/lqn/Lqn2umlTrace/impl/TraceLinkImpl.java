/**
 */
package uk.ac.ic.lqn.Lqn2umlTrace.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.ic.lqn.Lqn2umlTrace.Lqn2umlTracePackage;
import uk.ac.ic.lqn.Lqn2umlTrace.TraceLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ic.lqn.Lqn2umlTrace.impl.TraceLinkImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.Lqn2umlTrace.impl.TraceLinkImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link uk.ac.ic.lqn.Lqn2umlTrace.impl.TraceLinkImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceLinkImpl extends MinimalEObjectImpl.Container implements TraceLink {
	/**
	 * The default value of the '{@link #getSources() <em>Sources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected String sources = SOURCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargets() <em>Targets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGETS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected String targets = TARGETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lqn2umlTracePackage.Literals.TRACE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSources() {
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSources(String newSources) {
		String oldSources = sources;
		sources = newSources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lqn2umlTracePackage.TRACE_LINK__SOURCES, oldSources, sources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargets() {
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargets(String newTargets) {
		String oldTargets = targets;
		targets = newTargets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lqn2umlTracePackage.TRACE_LINK__TARGETS, oldTargets, targets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lqn2umlTracePackage.TRACE_LINK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Lqn2umlTracePackage.TRACE_LINK__SOURCES:
				return getSources();
			case Lqn2umlTracePackage.TRACE_LINK__TARGETS:
				return getTargets();
			case Lqn2umlTracePackage.TRACE_LINK__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Lqn2umlTracePackage.TRACE_LINK__SOURCES:
				setSources((String)newValue);
				return;
			case Lqn2umlTracePackage.TRACE_LINK__TARGETS:
				setTargets((String)newValue);
				return;
			case Lqn2umlTracePackage.TRACE_LINK__DESCRIPTION:
				setDescription((String)newValue);
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
			case Lqn2umlTracePackage.TRACE_LINK__SOURCES:
				setSources(SOURCES_EDEFAULT);
				return;
			case Lqn2umlTracePackage.TRACE_LINK__TARGETS:
				setTargets(TARGETS_EDEFAULT);
				return;
			case Lqn2umlTracePackage.TRACE_LINK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case Lqn2umlTracePackage.TRACE_LINK__SOURCES:
				return SOURCES_EDEFAULT == null ? sources != null : !SOURCES_EDEFAULT.equals(sources);
			case Lqn2umlTracePackage.TRACE_LINK__TARGETS:
				return TARGETS_EDEFAULT == null ? targets != null : !TARGETS_EDEFAULT.equals(targets);
			case Lqn2umlTracePackage.TRACE_LINK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (sources: ");
		result.append(sources);
		result.append(", targets: ");
		result.append(targets);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TraceLinkImpl
