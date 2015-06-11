/**
 */
package de.cau.cs.se.geco.architecture.architecture.impl;

import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.MetamodelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.MetamodelImpl#getModelPackage <em>Model Package</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.MetamodelImpl#isIsText <em>Is Text</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.impl.MetamodelImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelImpl extends MinimalEObjectImpl.Container implements Metamodel
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getModelPackage() <em>Model Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelPackage()
   * @generated
   * @ordered
   */
  protected EPackage modelPackage;

  /**
   * The default value of the '{@link #isIsText() <em>Is Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsText()
   * @generated
   * @ordered
   */
  protected static final boolean IS_TEXT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsText() <em>Is Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsText()
   * @generated
   * @ordered
   */
  protected boolean isText = IS_TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtension()
   * @generated
   * @ordered
   */
  protected static final String EXTENSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtension()
   * @generated
   * @ordered
   */
  protected String extension = EXTENSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetamodelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ArchitecturePackage.Literals.METAMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.METAMODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackage getModelPackage()
  {
    if (modelPackage != null && modelPackage.eIsProxy())
    {
      InternalEObject oldModelPackage = (InternalEObject)modelPackage;
      modelPackage = (EPackage)eResolveProxy(oldModelPackage);
      if (modelPackage != oldModelPackage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.METAMODEL__MODEL_PACKAGE, oldModelPackage, modelPackage));
      }
    }
    return modelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackage basicGetModelPackage()
  {
    return modelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelPackage(EPackage newModelPackage)
  {
    EPackage oldModelPackage = modelPackage;
    modelPackage = newModelPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.METAMODEL__MODEL_PACKAGE, oldModelPackage, modelPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsText()
  {
    return isText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsText(boolean newIsText)
  {
    boolean oldIsText = isText;
    isText = newIsText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.METAMODEL__IS_TEXT, oldIsText, isText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExtension()
  {
    return extension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtension(String newExtension)
  {
    String oldExtension = extension;
    extension = newExtension;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.METAMODEL__EXTENSION, oldExtension, extension));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ArchitecturePackage.METAMODEL__NAME:
        return getName();
      case ArchitecturePackage.METAMODEL__MODEL_PACKAGE:
        if (resolve) return getModelPackage();
        return basicGetModelPackage();
      case ArchitecturePackage.METAMODEL__IS_TEXT:
        return isIsText();
      case ArchitecturePackage.METAMODEL__EXTENSION:
        return getExtension();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArchitecturePackage.METAMODEL__NAME:
        setName((String)newValue);
        return;
      case ArchitecturePackage.METAMODEL__MODEL_PACKAGE:
        setModelPackage((EPackage)newValue);
        return;
      case ArchitecturePackage.METAMODEL__IS_TEXT:
        setIsText((Boolean)newValue);
        return;
      case ArchitecturePackage.METAMODEL__EXTENSION:
        setExtension((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ArchitecturePackage.METAMODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ArchitecturePackage.METAMODEL__MODEL_PACKAGE:
        setModelPackage((EPackage)null);
        return;
      case ArchitecturePackage.METAMODEL__IS_TEXT:
        setIsText(IS_TEXT_EDEFAULT);
        return;
      case ArchitecturePackage.METAMODEL__EXTENSION:
        setExtension(EXTENSION_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ArchitecturePackage.METAMODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ArchitecturePackage.METAMODEL__MODEL_PACKAGE:
        return modelPackage != null;
      case ArchitecturePackage.METAMODEL__IS_TEXT:
        return isText != IS_TEXT_EDEFAULT;
      case ArchitecturePackage.METAMODEL__EXTENSION:
        return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", isText: ");
    result.append(isText);
    result.append(", extension: ");
    result.append(extension);
    result.append(')');
    return result.toString();
  }

} //MetamodelImpl
