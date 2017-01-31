/**
 * generated by Xtext 2.10.0
 */
package org.kulto.kultoDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.kulto.kultoDsl.KultoDslFactory
 * @model kind="package"
 * @generated
 */
public interface KultoDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kultoDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.kulto.org/KultoDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kultoDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KultoDslPackage eINSTANCE = org.kulto.kultoDsl.impl.KultoDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.KultoModelImpl <em>Kulto Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.KultoModelImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getKultoModel()
   * @generated
   */
  int KULTO_MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KULTO_MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Kulto Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KULTO_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.RootElementImpl <em>Root Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.RootElementImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getRootElement()
   * @generated
   */
  int ROOT_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Root Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.ImportImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.TypeImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = ROOT_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.DomainTypeImpl <em>Domain Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.DomainTypeImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getDomainType()
   * @generated
   */
  int DOMAIN_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Popis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_TYPE__POPIS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Domain Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.PrimitiveImpl <em>Primitive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.PrimitiveImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getPrimitive()
   * @generated
   */
  int PRIMITIVE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Java Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__JAVA_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.EnnumImpl <em>Ennum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.EnnumImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getEnnum()
   * @generated
   */
  int ENNUM = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENNUM__NAME = DOMAIN_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Popis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENNUM__POPIS = DOMAIN_TYPE__POPIS;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENNUM__LITERALS = DOMAIN_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ennum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENNUM_FEATURE_COUNT = DOMAIN_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.EnnumLiteralImpl <em>Ennum Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.EnnumLiteralImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getEnnumLiteral()
   * @generated
   */
  int ENNUM_LITERAL = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENNUM_LITERAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Popis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENNUM_LITERAL__POPIS = 1;

  /**
   * The number of structural features of the '<em>Ennum Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENNUM_LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.EntityImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = DOMAIN_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Popis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__POPIS = DOMAIN_TYPE__POPIS;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = DOMAIN_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = DOMAIN_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = DOMAIN_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.AttributeImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MANY = 2;

  /**
   * The feature id for the '<em><b>Popis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__POPIS = 3;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.DomainPackageImpl <em>Domain Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.DomainPackageImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getDomainPackage()
   * @generated
   */
  int DOMAIN_PACKAGE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_PACKAGE__NAME = ROOT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_PACKAGE__IMPORTS = ROOT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_PACKAGE__TYPES = ROOT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Domain Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_PACKAGE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.DomainImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__NAME = ROOT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Popis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__POPIS = ROOT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__CHILDREN = ROOT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.DomainChildImpl <em>Domain Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.DomainChildImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getDomainChild()
   * @generated
   */
  int DOMAIN_CHILD = 12;

  /**
   * The number of structural features of the '<em>Domain Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_CHILD_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.ApplicationImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = ROOT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Domains</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__DOMAINS = ROOT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.kulto.kultoDsl.impl.PopisImpl <em>Popis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kulto.kultoDsl.impl.PopisImpl
   * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getPopis()
   * @generated
   */
  int POPIS = 14;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPIS__TEXT = 0;

  /**
   * The number of structural features of the '<em>Popis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPIS_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.KultoModel <em>Kulto Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kulto Model</em>'.
   * @see org.kulto.kultoDsl.KultoModel
   * @generated
   */
  EClass getKultoModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.kulto.kultoDsl.KultoModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.kulto.kultoDsl.KultoModel#getElements()
   * @see #getKultoModel()
   * @generated
   */
  EReference getKultoModel_Elements();

  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.RootElement <em>Root Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root Element</em>'.
   * @see org.kulto.kultoDsl.RootElement
   * @generated
   */
  EClass getRootElement();

  /**
   * Returns the meta object for the attribute '{@link org.kulto.kultoDsl.RootElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.kulto.kultoDsl.RootElement#getName()
   * @see #getRootElement()
   * @generated
   */
  EAttribute getRootElement_Name();

  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.kulto.kultoDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.kulto.kultoDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.kulto.kultoDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.kulto.kultoDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.DomainType <em>Domain Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Type</em>'.
   * @see org.kulto.kultoDsl.DomainType
   * @generated
   */
  EClass getDomainType();

  /**
   * Returns the meta object for the containment reference '{@link org.kulto.kultoDsl.DomainType#getPopis <em>Popis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Popis</em>'.
   * @see org.kulto.kultoDsl.DomainType#getPopis()
   * @see #getDomainType()
   * @generated
   */
  EReference getDomainType_Popis();

  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive</em>'.
   * @see org.kulto.kultoDsl.Primitive
   * @generated
   */
  EClass getPrimitive();

  /**
   * Returns the meta object for the attribute '{@link org.kulto.kultoDsl.Primitive#getJavaType <em>Java Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Java Type</em>'.
   * @see org.kulto.kultoDsl.Primitive#getJavaType()
   * @see #getPrimitive()
   * @generated
   */
  EAttribute getPrimitive_JavaType();

  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.Ennum <em>Ennum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ennum</em>'.
   * @see org.kulto.kultoDsl.Ennum
   * @generated
   */
  EClass getEnnum();

  /**
   * Returns the meta object for the containment reference list '{@link org.kulto.kultoDsl.Ennum#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see org.kulto.kultoDsl.Ennum#getLiterals()
   * @see #getEnnum()
   * @generated
   */
  EReference getEnnum_Literals();

  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.EnnumLiteral <em>Ennum Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ennum Literal</em>'.
   * @see org.kulto.kultoDsl.EnnumLiteral
   * @generated
   */
  EClass getEnnumLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.kulto.kultoDsl.EnnumLiteral#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.kulto.kultoDsl.EnnumLiteral#getName()
   * @see #getEnnumLiteral()
   * @generated
   */
  EAttribute getEnnumLiteral_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.kulto.kultoDsl.EnnumLiteral#getPopis <em>Popis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Popis</em>'.
   * @see org.kulto.kultoDsl.EnnumLiteral#getPopis()
   * @see #getEnnumLiteral()
   * @generated
   */
  EReference getEnnumLiteral_Popis();

  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.kulto.kultoDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the reference '{@link org.kulto.kultoDsl.Entity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.kulto.kultoDsl.Entity#getSuperType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.kulto.kultoDsl.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.kulto.kultoDsl.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.kulto.kultoDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.kulto.kultoDsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.kulto.kultoDsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the reference '{@link org.kulto.kultoDsl.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.kulto.kultoDsl.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link org.kulto.kultoDsl.Attribute#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.kulto.kultoDsl.Attribute#isMany()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Many();

  /**
   * Returns the meta object for the containment reference '{@link org.kulto.kultoDsl.Attribute#getPopis <em>Popis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Popis</em>'.
   * @see org.kulto.kultoDsl.Attribute#getPopis()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Popis();

  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.DomainPackage <em>Domain Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Package</em>'.
   * @see org.kulto.kultoDsl.DomainPackage
   * @generated
   */
  EClass getDomainPackage();

  /**
   * Returns the meta object for the containment reference list '{@link org.kulto.kultoDsl.DomainPackage#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.kulto.kultoDsl.DomainPackage#getImports()
   * @see #getDomainPackage()
   * @generated
   */
  EReference getDomainPackage_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.kulto.kultoDsl.DomainPackage#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.kulto.kultoDsl.DomainPackage#getTypes()
   * @see #getDomainPackage()
   * @generated
   */
  EReference getDomainPackage_Types();

  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see org.kulto.kultoDsl.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the containment reference '{@link org.kulto.kultoDsl.Domain#getPopis <em>Popis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Popis</em>'.
   * @see org.kulto.kultoDsl.Domain#getPopis()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Popis();

  /**
   * Returns the meta object for the containment reference list '{@link org.kulto.kultoDsl.Domain#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.kulto.kultoDsl.Domain#getChildren()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Children();

  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.DomainChild <em>Domain Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Child</em>'.
   * @see org.kulto.kultoDsl.DomainChild
   * @generated
   */
  EClass getDomainChild();

  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see org.kulto.kultoDsl.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the reference list '{@link org.kulto.kultoDsl.Application#getDomains <em>Domains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Domains</em>'.
   * @see org.kulto.kultoDsl.Application#getDomains()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Domains();

  /**
   * Returns the meta object for class '{@link org.kulto.kultoDsl.Popis <em>Popis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Popis</em>'.
   * @see org.kulto.kultoDsl.Popis
   * @generated
   */
  EClass getPopis();

  /**
   * Returns the meta object for the attribute '{@link org.kulto.kultoDsl.Popis#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.kulto.kultoDsl.Popis#getText()
   * @see #getPopis()
   * @generated
   */
  EAttribute getPopis_Text();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KultoDslFactory getKultoDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.KultoModelImpl <em>Kulto Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.KultoModelImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getKultoModel()
     * @generated
     */
    EClass KULTO_MODEL = eINSTANCE.getKultoModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KULTO_MODEL__ELEMENTS = eINSTANCE.getKultoModel_Elements();

    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.RootElementImpl <em>Root Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.RootElementImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getRootElement()
     * @generated
     */
    EClass ROOT_ELEMENT = eINSTANCE.getRootElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROOT_ELEMENT__NAME = eINSTANCE.getRootElement_Name();

    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.ImportImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.TypeImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.DomainTypeImpl <em>Domain Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.DomainTypeImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getDomainType()
     * @generated
     */
    EClass DOMAIN_TYPE = eINSTANCE.getDomainType();

    /**
     * The meta object literal for the '<em><b>Popis</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_TYPE__POPIS = eINSTANCE.getDomainType_Popis();

    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.PrimitiveImpl <em>Primitive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.PrimitiveImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getPrimitive()
     * @generated
     */
    EClass PRIMITIVE = eINSTANCE.getPrimitive();

    /**
     * The meta object literal for the '<em><b>Java Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE__JAVA_TYPE = eINSTANCE.getPrimitive_JavaType();

    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.EnnumImpl <em>Ennum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.EnnumImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getEnnum()
     * @generated
     */
    EClass ENNUM = eINSTANCE.getEnnum();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENNUM__LITERALS = eINSTANCE.getEnnum_Literals();

    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.EnnumLiteralImpl <em>Ennum Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.EnnumLiteralImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getEnnumLiteral()
     * @generated
     */
    EClass ENNUM_LITERAL = eINSTANCE.getEnnumLiteral();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENNUM_LITERAL__NAME = eINSTANCE.getEnnumLiteral_Name();

    /**
     * The meta object literal for the '<em><b>Popis</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENNUM_LITERAL__POPIS = eINSTANCE.getEnnumLiteral_Popis();

    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.EntityImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.AttributeImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MANY = eINSTANCE.getAttribute_Many();

    /**
     * The meta object literal for the '<em><b>Popis</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__POPIS = eINSTANCE.getAttribute_Popis();

    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.DomainPackageImpl <em>Domain Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.DomainPackageImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getDomainPackage()
     * @generated
     */
    EClass DOMAIN_PACKAGE = eINSTANCE.getDomainPackage();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_PACKAGE__IMPORTS = eINSTANCE.getDomainPackage_Imports();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_PACKAGE__TYPES = eINSTANCE.getDomainPackage_Types();

    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.DomainImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Popis</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__POPIS = eINSTANCE.getDomain_Popis();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__CHILDREN = eINSTANCE.getDomain_Children();

    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.DomainChildImpl <em>Domain Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.DomainChildImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getDomainChild()
     * @generated
     */
    EClass DOMAIN_CHILD = eINSTANCE.getDomainChild();

    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.ApplicationImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Domains</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__DOMAINS = eINSTANCE.getApplication_Domains();

    /**
     * The meta object literal for the '{@link org.kulto.kultoDsl.impl.PopisImpl <em>Popis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kulto.kultoDsl.impl.PopisImpl
     * @see org.kulto.kultoDsl.impl.KultoDslPackageImpl#getPopis()
     * @generated
     */
    EClass POPIS = eINSTANCE.getPopis();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POPIS__TEXT = eINSTANCE.getPopis_Text();

  }

} //KultoDslPackage