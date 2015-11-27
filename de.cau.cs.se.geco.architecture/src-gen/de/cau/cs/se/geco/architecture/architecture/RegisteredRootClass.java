/**
 */
package de.cau.cs.se.geco.architecture.architecture;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registered Root Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#isIsText <em>Is Text</em>}</li>
 *   <li>{@link de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getRegisteredRootClass()
 * @model
 * @generated
 */
public interface RegisteredRootClass extends EObject
{
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
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getRegisteredRootClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' reference.
   * @see #setImportedNamespace(JvmType)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getRegisteredRootClass_ImportedNamespace()
   * @model
   * @generated
   */
  JvmType getImportedNamespace();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#getImportedNamespace <em>Imported Namespace</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' reference.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(JvmType value);

  /**
   * Returns the value of the '<em><b>Is Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Text</em>' attribute.
   * @see #setIsText(boolean)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getRegisteredRootClass_IsText()
   * @model
   * @generated
   */
  boolean isIsText();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#isIsText <em>Is Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Text</em>' attribute.
   * @see #isIsText()
   * @generated
   */
  void setIsText(boolean value);

  /**
   * Returns the value of the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extension</em>' attribute.
   * @see #setExtension(String)
   * @see de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage#getRegisteredRootClass_Extension()
   * @model
   * @generated
   */
  String getExtension();

  /**
   * Sets the value of the '{@link de.cau.cs.se.geco.architecture.architecture.RegisteredRootClass#getExtension <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extension</em>' attribute.
   * @see #getExtension()
   * @generated
   */
  void setExtension(String value);

} // RegisteredRootClass
