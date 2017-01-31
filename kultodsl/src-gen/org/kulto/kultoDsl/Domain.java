/**
 * generated by Xtext 2.10.0
 */
package org.kulto.kultoDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.kulto.kultoDsl.Domain#getPopis <em>Popis</em>}</li>
 *   <li>{@link org.kulto.kultoDsl.Domain#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.kulto.kultoDsl.KultoDslPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends RootElement
{
  /**
   * Returns the value of the '<em><b>Popis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Popis</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Popis</em>' containment reference.
   * @see #setPopis(Popis)
   * @see org.kulto.kultoDsl.KultoDslPackage#getDomain_Popis()
   * @model containment="true"
   * @generated
   */
  Popis getPopis();

  /**
   * Sets the value of the '{@link org.kulto.kultoDsl.Domain#getPopis <em>Popis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Popis</em>' containment reference.
   * @see #getPopis()
   * @generated
   */
  void setPopis(Popis value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.kulto.kultoDsl.DomainChild}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.kulto.kultoDsl.KultoDslPackage#getDomain_Children()
   * @model containment="true"
   * @generated
   */
  EList<DomainChild> getChildren();

} // Domain
