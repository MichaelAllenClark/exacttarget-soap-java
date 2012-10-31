/*
 * XML Type:  Permission
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Permission
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Permission(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class PermissionImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.Permission
{
    
    public PermissionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName OBJECTTYPE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ObjectType");
    private static final javax.xml.namespace.QName OPERATION$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Operation");
    private static final javax.xml.namespace.QName ISSHAREABLE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsShareable");
    private static final javax.xml.namespace.QName ISALLOWED$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsAllowed");
    private static final javax.xml.namespace.QName ISDENIED$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsDenied");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
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
            return get_store().count_elements(NAME$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
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
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "ObjectType" element
     */
    public java.lang.String getObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPE$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTTYPE$4, 0);
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
            return get_store().count_elements(OBJECTTYPE$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTTYPE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTTYPE$4);
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
            get_store().remove_element(OBJECTTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "Operation" element
     */
    public java.lang.String getOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Operation" element
     */
    public org.apache.xmlbeans.XmlString xgetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Operation" element
     */
    public boolean isSetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATION$6) != 0;
        }
    }
    
    /**
     * Sets the "Operation" element
     */
    public void setOperation(java.lang.String operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATION$6);
            }
            target.setStringValue(operation);
        }
    }
    
    /**
     * Sets (as xml) the "Operation" element
     */
    public void xsetOperation(org.apache.xmlbeans.XmlString operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATION$6);
            }
            target.set(operation);
        }
    }
    
    /**
     * Unsets the "Operation" element
     */
    public void unsetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATION$6, 0);
        }
    }
    
    /**
     * Gets the "IsShareable" element
     */
    public boolean getIsShareable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSHAREABLE$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsShareable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsShareable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSHAREABLE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsShareable" element
     */
    public boolean isSetIsShareable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSHAREABLE$8) != 0;
        }
    }
    
    /**
     * Sets the "IsShareable" element
     */
    public void setIsShareable(boolean isShareable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSHAREABLE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSHAREABLE$8);
            }
            target.setBooleanValue(isShareable);
        }
    }
    
    /**
     * Sets (as xml) the "IsShareable" element
     */
    public void xsetIsShareable(org.apache.xmlbeans.XmlBoolean isShareable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSHAREABLE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSHAREABLE$8);
            }
            target.set(isShareable);
        }
    }
    
    /**
     * Unsets the "IsShareable" element
     */
    public void unsetIsShareable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSHAREABLE$8, 0);
        }
    }
    
    /**
     * Gets the "IsAllowed" element
     */
    public boolean getIsAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISALLOWED$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsAllowed" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISALLOWED$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsAllowed" element
     */
    public boolean isSetIsAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISALLOWED$10) != 0;
        }
    }
    
    /**
     * Sets the "IsAllowed" element
     */
    public void setIsAllowed(boolean isAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISALLOWED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISALLOWED$10);
            }
            target.setBooleanValue(isAllowed);
        }
    }
    
    /**
     * Sets (as xml) the "IsAllowed" element
     */
    public void xsetIsAllowed(org.apache.xmlbeans.XmlBoolean isAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISALLOWED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISALLOWED$10);
            }
            target.set(isAllowed);
        }
    }
    
    /**
     * Unsets the "IsAllowed" element
     */
    public void unsetIsAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISALLOWED$10, 0);
        }
    }
    
    /**
     * Gets the "IsDenied" element
     */
    public boolean getIsDenied()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDENIED$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsDenied" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsDenied()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDENIED$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsDenied" element
     */
    public boolean isSetIsDenied()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDENIED$12) != 0;
        }
    }
    
    /**
     * Sets the "IsDenied" element
     */
    public void setIsDenied(boolean isDenied)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDENIED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISDENIED$12);
            }
            target.setBooleanValue(isDenied);
        }
    }
    
    /**
     * Sets (as xml) the "IsDenied" element
     */
    public void xsetIsDenied(org.apache.xmlbeans.XmlBoolean isDenied)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDENIED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISDENIED$12);
            }
            target.set(isDenied);
        }
    }
    
    /**
     * Unsets the "IsDenied" element
     */
    public void unsetIsDenied()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDENIED$12, 0);
        }
    }
}
