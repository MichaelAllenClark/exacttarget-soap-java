/*
 * XML Type:  ObjectDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ObjectDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ObjectDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ObjectDefinitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ObjectDefinition
{
    
    public ObjectDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTTYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ObjectType");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName ISCREATABLE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsCreatable");
    private static final javax.xml.namespace.QName ISUPDATABLE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsUpdatable");
    private static final javax.xml.namespace.QName ISRETRIEVABLE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsRetrievable");
    private static final javax.xml.namespace.QName ISQUERYABLE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsQueryable");
    private static final javax.xml.namespace.QName ISREFERENCE$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsReference");
    private static final javax.xml.namespace.QName REFERENCEDTYPE$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ReferencedType");
    private static final javax.xml.namespace.QName ISPROPERTYCOLLECTION$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsPropertyCollection");
    private static final javax.xml.namespace.QName ISOBJECTCOLLECTION$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsObjectCollection");
    private static final javax.xml.namespace.QName PROPERTIES$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Properties");
    private static final javax.xml.namespace.QName EXTENDEDPROPERTIES$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExtendedProperties");
    private static final javax.xml.namespace.QName CHILDOBJECTS$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ChildObjects");
    
    
    /**
     * Gets the "ObjectType" element
     */
    public java.lang.String getObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectType" element
     */
    public org.apache.xmlbeans.XmlString xgetObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ObjectType" element
     */
    public boolean isSetObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "ObjectType" element
     */
    public void setObjectType(java.lang.String objectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTTYPE$0);
            }
            target.setStringValue(objectType);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectType" element
     */
    public void xsetObjectType(org.apache.xmlbeans.XmlString objectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTTYPE$0);
            }
            target.set(objectType);
        }
    }
    
    /**
     * Unsets the "ObjectType" element
     */
    public void unsetObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets the "IsCreatable" element
     */
    public boolean getIsCreatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCREATABLE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsCreatable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCreatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCREATABLE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsCreatable" element
     */
    public boolean isSetIsCreatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCREATABLE$4) != 0;
        }
    }
    
    /**
     * Sets the "IsCreatable" element
     */
    public void setIsCreatable(boolean isCreatable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCREATABLE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCREATABLE$4);
            }
            target.setBooleanValue(isCreatable);
        }
    }
    
    /**
     * Sets (as xml) the "IsCreatable" element
     */
    public void xsetIsCreatable(org.apache.xmlbeans.XmlBoolean isCreatable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCREATABLE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCREATABLE$4);
            }
            target.set(isCreatable);
        }
    }
    
    /**
     * Unsets the "IsCreatable" element
     */
    public void unsetIsCreatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCREATABLE$4, 0);
        }
    }
    
    /**
     * Gets the "IsUpdatable" element
     */
    public boolean getIsUpdatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISUPDATABLE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsUpdatable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsUpdatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISUPDATABLE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsUpdatable" element
     */
    public boolean isSetIsUpdatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISUPDATABLE$6) != 0;
        }
    }
    
    /**
     * Sets the "IsUpdatable" element
     */
    public void setIsUpdatable(boolean isUpdatable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISUPDATABLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISUPDATABLE$6);
            }
            target.setBooleanValue(isUpdatable);
        }
    }
    
    /**
     * Sets (as xml) the "IsUpdatable" element
     */
    public void xsetIsUpdatable(org.apache.xmlbeans.XmlBoolean isUpdatable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISUPDATABLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISUPDATABLE$6);
            }
            target.set(isUpdatable);
        }
    }
    
    /**
     * Unsets the "IsUpdatable" element
     */
    public void unsetIsUpdatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISUPDATABLE$6, 0);
        }
    }
    
    /**
     * Gets the "IsRetrievable" element
     */
    public boolean getIsRetrievable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRETRIEVABLE$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsRetrievable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsRetrievable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRETRIEVABLE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsRetrievable" element
     */
    public boolean isSetIsRetrievable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISRETRIEVABLE$8) != 0;
        }
    }
    
    /**
     * Sets the "IsRetrievable" element
     */
    public void setIsRetrievable(boolean isRetrievable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRETRIEVABLE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISRETRIEVABLE$8);
            }
            target.setBooleanValue(isRetrievable);
        }
    }
    
    /**
     * Sets (as xml) the "IsRetrievable" element
     */
    public void xsetIsRetrievable(org.apache.xmlbeans.XmlBoolean isRetrievable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRETRIEVABLE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISRETRIEVABLE$8);
            }
            target.set(isRetrievable);
        }
    }
    
    /**
     * Unsets the "IsRetrievable" element
     */
    public void unsetIsRetrievable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISRETRIEVABLE$8, 0);
        }
    }
    
    /**
     * Gets the "IsQueryable" element
     */
    public boolean getIsQueryable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISQUERYABLE$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsQueryable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsQueryable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISQUERYABLE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsQueryable" element
     */
    public boolean isSetIsQueryable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISQUERYABLE$10) != 0;
        }
    }
    
    /**
     * Sets the "IsQueryable" element
     */
    public void setIsQueryable(boolean isQueryable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISQUERYABLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISQUERYABLE$10);
            }
            target.setBooleanValue(isQueryable);
        }
    }
    
    /**
     * Sets (as xml) the "IsQueryable" element
     */
    public void xsetIsQueryable(org.apache.xmlbeans.XmlBoolean isQueryable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISQUERYABLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISQUERYABLE$10);
            }
            target.set(isQueryable);
        }
    }
    
    /**
     * Unsets the "IsQueryable" element
     */
    public void unsetIsQueryable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISQUERYABLE$10, 0);
        }
    }
    
    /**
     * Gets the "IsReference" element
     */
    public boolean getIsReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREFERENCE$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsReference" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREFERENCE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsReference" element
     */
    public boolean isSetIsReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISREFERENCE$12) != 0;
        }
    }
    
    /**
     * Sets the "IsReference" element
     */
    public void setIsReference(boolean isReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREFERENCE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISREFERENCE$12);
            }
            target.setBooleanValue(isReference);
        }
    }
    
    /**
     * Sets (as xml) the "IsReference" element
     */
    public void xsetIsReference(org.apache.xmlbeans.XmlBoolean isReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREFERENCE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISREFERENCE$12);
            }
            target.set(isReference);
        }
    }
    
    /**
     * Unsets the "IsReference" element
     */
    public void unsetIsReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISREFERENCE$12, 0);
        }
    }
    
    /**
     * Gets the "ReferencedType" element
     */
    public java.lang.String getReferencedType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEDTYPE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReferencedType" element
     */
    public org.apache.xmlbeans.XmlString xgetReferencedType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCEDTYPE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReferencedType" element
     */
    public boolean isSetReferencedType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEDTYPE$14) != 0;
        }
    }
    
    /**
     * Sets the "ReferencedType" element
     */
    public void setReferencedType(java.lang.String referencedType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEDTYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCEDTYPE$14);
            }
            target.setStringValue(referencedType);
        }
    }
    
    /**
     * Sets (as xml) the "ReferencedType" element
     */
    public void xsetReferencedType(org.apache.xmlbeans.XmlString referencedType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCEDTYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCEDTYPE$14);
            }
            target.set(referencedType);
        }
    }
    
    /**
     * Unsets the "ReferencedType" element
     */
    public void unsetReferencedType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEDTYPE$14, 0);
        }
    }
    
    /**
     * Gets the "IsPropertyCollection" element
     */
    public java.lang.String getIsPropertyCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPROPERTYCOLLECTION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsPropertyCollection" element
     */
    public org.apache.xmlbeans.XmlString xgetIsPropertyCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISPROPERTYCOLLECTION$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsPropertyCollection" element
     */
    public boolean isSetIsPropertyCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPROPERTYCOLLECTION$16) != 0;
        }
    }
    
    /**
     * Sets the "IsPropertyCollection" element
     */
    public void setIsPropertyCollection(java.lang.String isPropertyCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPROPERTYCOLLECTION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPROPERTYCOLLECTION$16);
            }
            target.setStringValue(isPropertyCollection);
        }
    }
    
    /**
     * Sets (as xml) the "IsPropertyCollection" element
     */
    public void xsetIsPropertyCollection(org.apache.xmlbeans.XmlString isPropertyCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISPROPERTYCOLLECTION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISPROPERTYCOLLECTION$16);
            }
            target.set(isPropertyCollection);
        }
    }
    
    /**
     * Unsets the "IsPropertyCollection" element
     */
    public void unsetIsPropertyCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPROPERTYCOLLECTION$16, 0);
        }
    }
    
    /**
     * Gets the "IsObjectCollection" element
     */
    public boolean getIsObjectCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOBJECTCOLLECTION$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsObjectCollection" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsObjectCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISOBJECTCOLLECTION$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsObjectCollection" element
     */
    public boolean isSetIsObjectCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISOBJECTCOLLECTION$18) != 0;
        }
    }
    
    /**
     * Sets the "IsObjectCollection" element
     */
    public void setIsObjectCollection(boolean isObjectCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOBJECTCOLLECTION$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISOBJECTCOLLECTION$18);
            }
            target.setBooleanValue(isObjectCollection);
        }
    }
    
    /**
     * Sets (as xml) the "IsObjectCollection" element
     */
    public void xsetIsObjectCollection(org.apache.xmlbeans.XmlBoolean isObjectCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISOBJECTCOLLECTION$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISOBJECTCOLLECTION$18);
            }
            target.set(isObjectCollection);
        }
    }
    
    /**
     * Unsets the "IsObjectCollection" element
     */
    public void unsetIsObjectCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISOBJECTCOLLECTION$18, 0);
        }
    }
    
    /**
     * Gets array of all "Properties" elements
     */
    public com.exacttarget.wsdl.partnerapi.PropertyDefinition[] getPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTIES$20, targetList);
            com.exacttarget.wsdl.partnerapi.PropertyDefinition[] result = new com.exacttarget.wsdl.partnerapi.PropertyDefinition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Properties" element
     */
    public com.exacttarget.wsdl.partnerapi.PropertyDefinition getPropertiesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PropertyDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition)get_store().find_element_user(PROPERTIES$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Properties" element
     */
    public int sizeOfPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTIES$20);
        }
    }
    
    /**
     * Sets array of all "Properties" element
     */
    public void setPropertiesArray(com.exacttarget.wsdl.partnerapi.PropertyDefinition[] propertiesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertiesArray, PROPERTIES$20);
        }
    }
    
    /**
     * Sets ith "Properties" element
     */
    public void setPropertiesArray(int i, com.exacttarget.wsdl.partnerapi.PropertyDefinition properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PropertyDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition)get_store().find_element_user(PROPERTIES$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(properties);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Properties" element
     */
    public com.exacttarget.wsdl.partnerapi.PropertyDefinition insertNewProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PropertyDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition)get_store().insert_element_user(PROPERTIES$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Properties" element
     */
    public com.exacttarget.wsdl.partnerapi.PropertyDefinition addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PropertyDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition)get_store().add_element_user(PROPERTIES$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "Properties" element
     */
    public void removeProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTIES$20, i);
        }
    }
    
    /**
     * Gets the "ExtendedProperties" element
     */
    public com.exacttarget.wsdl.partnerapi.ObjectDefinition.ExtendedProperties getExtendedProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ObjectDefinition.ExtendedProperties target = null;
            target = (com.exacttarget.wsdl.partnerapi.ObjectDefinition.ExtendedProperties)get_store().find_element_user(EXTENDEDPROPERTIES$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ExtendedProperties" element
     */
    public boolean isSetExtendedProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENDEDPROPERTIES$22) != 0;
        }
    }
    
    /**
     * Sets the "ExtendedProperties" element
     */
    public void setExtendedProperties(com.exacttarget.wsdl.partnerapi.ObjectDefinition.ExtendedProperties extendedProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ObjectDefinition.ExtendedProperties target = null;
            target = (com.exacttarget.wsdl.partnerapi.ObjectDefinition.ExtendedProperties)get_store().find_element_user(EXTENDEDPROPERTIES$22, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ObjectDefinition.ExtendedProperties)get_store().add_element_user(EXTENDEDPROPERTIES$22);
            }
            target.set(extendedProperties);
        }
    }
    
    /**
     * Appends and returns a new empty "ExtendedProperties" element
     */
    public com.exacttarget.wsdl.partnerapi.ObjectDefinition.ExtendedProperties addNewExtendedProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ObjectDefinition.ExtendedProperties target = null;
            target = (com.exacttarget.wsdl.partnerapi.ObjectDefinition.ExtendedProperties)get_store().add_element_user(EXTENDEDPROPERTIES$22);
            return target;
        }
    }
    
    /**
     * Unsets the "ExtendedProperties" element
     */
    public void unsetExtendedProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENDEDPROPERTIES$22, 0);
        }
    }
    
    /**
     * Gets array of all "ChildObjects" elements
     */
    public com.exacttarget.wsdl.partnerapi.ObjectDefinition[] getChildObjectsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHILDOBJECTS$24, targetList);
            com.exacttarget.wsdl.partnerapi.ObjectDefinition[] result = new com.exacttarget.wsdl.partnerapi.ObjectDefinition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ChildObjects" element
     */
    public com.exacttarget.wsdl.partnerapi.ObjectDefinition getChildObjectsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ObjectDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.ObjectDefinition)get_store().find_element_user(CHILDOBJECTS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ChildObjects" element
     */
    public int sizeOfChildObjectsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHILDOBJECTS$24);
        }
    }
    
    /**
     * Sets array of all "ChildObjects" element
     */
    public void setChildObjectsArray(com.exacttarget.wsdl.partnerapi.ObjectDefinition[] childObjectsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(childObjectsArray, CHILDOBJECTS$24);
        }
    }
    
    /**
     * Sets ith "ChildObjects" element
     */
    public void setChildObjectsArray(int i, com.exacttarget.wsdl.partnerapi.ObjectDefinition childObjects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ObjectDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.ObjectDefinition)get_store().find_element_user(CHILDOBJECTS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(childObjects);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ChildObjects" element
     */
    public com.exacttarget.wsdl.partnerapi.ObjectDefinition insertNewChildObjects(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ObjectDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.ObjectDefinition)get_store().insert_element_user(CHILDOBJECTS$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ChildObjects" element
     */
    public com.exacttarget.wsdl.partnerapi.ObjectDefinition addNewChildObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ObjectDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.ObjectDefinition)get_store().add_element_user(CHILDOBJECTS$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "ChildObjects" element
     */
    public void removeChildObjects(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHILDOBJECTS$24, i);
        }
    }
    /**
     * An XML ExtendedProperties(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ExtendedPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ObjectDefinition.ExtendedProperties
    {
        
        public ExtendedPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXTENDEDPROPERTY$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExtendedProperty");
        
        
        /**
         * Gets array of all "ExtendedProperty" elements
         */
        public com.exacttarget.wsdl.partnerapi.PropertyDefinition[] getExtendedPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXTENDEDPROPERTY$0, targetList);
                com.exacttarget.wsdl.partnerapi.PropertyDefinition[] result = new com.exacttarget.wsdl.partnerapi.PropertyDefinition[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ExtendedProperty" element
         */
        public com.exacttarget.wsdl.partnerapi.PropertyDefinition getExtendedPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PropertyDefinition target = null;
                target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition)get_store().find_element_user(EXTENDEDPROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ExtendedProperty" element
         */
        public int sizeOfExtendedPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENDEDPROPERTY$0);
            }
        }
        
        /**
         * Sets array of all "ExtendedProperty" element
         */
        public void setExtendedPropertyArray(com.exacttarget.wsdl.partnerapi.PropertyDefinition[] extendedPropertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extendedPropertyArray, EXTENDEDPROPERTY$0);
            }
        }
        
        /**
         * Sets ith "ExtendedProperty" element
         */
        public void setExtendedPropertyArray(int i, com.exacttarget.wsdl.partnerapi.PropertyDefinition extendedProperty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PropertyDefinition target = null;
                target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition)get_store().find_element_user(EXTENDEDPROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(extendedProperty);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ExtendedProperty" element
         */
        public com.exacttarget.wsdl.partnerapi.PropertyDefinition insertNewExtendedProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PropertyDefinition target = null;
                target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition)get_store().insert_element_user(EXTENDEDPROPERTY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ExtendedProperty" element
         */
        public com.exacttarget.wsdl.partnerapi.PropertyDefinition addNewExtendedProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PropertyDefinition target = null;
                target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition)get_store().add_element_user(EXTENDEDPROPERTY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ExtendedProperty" element
         */
        public void removeExtendedProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENDEDPROPERTY$0, i);
            }
        }
    }
}
