/**
 * generated by Xtext 2.10.0
 */
package org.kulto.kultoDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.kulto.kultoDsl.Attribute;
import org.kulto.kultoDsl.KultoDslPackage;
import org.kulto.kultoDsl.Popis;
import org.kulto.kultoDsl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.kulto.kultoDsl.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.kulto.kultoDsl.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.kulto.kultoDsl.impl.AttributeImpl#isMany <em>Many</em>}</li>
 *   <li>{@link org.kulto.kultoDsl.impl.AttributeImpl#getPopis <em>Popis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
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
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMany()
   * @generated
   * @ordered
   */
  protected static final boolean MANY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMany()
   * @generated
   * @ordered
   */
  protected boolean many = MANY_EDEFAULT;

  /**
   * The cached value of the '{@link #getPopis() <em>Popis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPopis()
   * @generated
   * @ordered
   */
  protected Popis popis;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return KultoDslPackage.Literals.ATTRIBUTE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KultoDslPackage.ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KultoDslPackage.ATTRIBUTE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KultoDslPackage.ATTRIBUTE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMany()
  {
    return many;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMany(boolean newMany)
  {
    boolean oldMany = many;
    many = newMany;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KultoDslPackage.ATTRIBUTE__MANY, oldMany, many));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Popis getPopis()
  {
    return popis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPopis(Popis newPopis, NotificationChain msgs)
  {
    Popis oldPopis = popis;
    popis = newPopis;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KultoDslPackage.ATTRIBUTE__POPIS, oldPopis, newPopis);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPopis(Popis newPopis)
  {
    if (newPopis != popis)
    {
      NotificationChain msgs = null;
      if (popis != null)
        msgs = ((InternalEObject)popis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KultoDslPackage.ATTRIBUTE__POPIS, null, msgs);
      if (newPopis != null)
        msgs = ((InternalEObject)newPopis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KultoDslPackage.ATTRIBUTE__POPIS, null, msgs);
      msgs = basicSetPopis(newPopis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KultoDslPackage.ATTRIBUTE__POPIS, newPopis, newPopis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case KultoDslPackage.ATTRIBUTE__POPIS:
        return basicSetPopis(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case KultoDslPackage.ATTRIBUTE__NAME:
        return getName();
      case KultoDslPackage.ATTRIBUTE__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case KultoDslPackage.ATTRIBUTE__MANY:
        return isMany();
      case KultoDslPackage.ATTRIBUTE__POPIS:
        return getPopis();
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
      case KultoDslPackage.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case KultoDslPackage.ATTRIBUTE__TYPE:
        setType((Type)newValue);
        return;
      case KultoDslPackage.ATTRIBUTE__MANY:
        setMany((Boolean)newValue);
        return;
      case KultoDslPackage.ATTRIBUTE__POPIS:
        setPopis((Popis)newValue);
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
      case KultoDslPackage.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KultoDslPackage.ATTRIBUTE__TYPE:
        setType((Type)null);
        return;
      case KultoDslPackage.ATTRIBUTE__MANY:
        setMany(MANY_EDEFAULT);
        return;
      case KultoDslPackage.ATTRIBUTE__POPIS:
        setPopis((Popis)null);
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
      case KultoDslPackage.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KultoDslPackage.ATTRIBUTE__TYPE:
        return type != null;
      case KultoDslPackage.ATTRIBUTE__MANY:
        return many != MANY_EDEFAULT;
      case KultoDslPackage.ATTRIBUTE__POPIS:
        return popis != null;
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
    result.append(", many: ");
    result.append(many);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl