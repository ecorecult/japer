/**
 * generated by Xtext 2.10.0
 */
package org.kulto.kultoDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.kulto.kultoDsl.DomainPackage#getImports <em>Imports</em>}</li>
 *   <li>{@link org.kulto.kultoDsl.DomainPackage#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.kulto.kultoDsl.KultoDslPackage#getDomainPackage()
 * @model
 * @generated
 */
public interface DomainPackage extends RootElement, DomainChild
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.kulto.kultoDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.kulto.kultoDsl.KultoDslPackage#getDomainPackage_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.kulto.kultoDsl.DomainType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.kulto.kultoDsl.KultoDslPackage#getDomainPackage_Types()
   * @model containment="true"
   * @generated
   */
  EList<DomainType> getTypes();

} // DomainPackage