/*
 * XML Type:  ListAttributeRestrictedValue
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ListAttributeRestrictedValue(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ListAttributeRestrictedValueImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue
{
    
    public ListAttributeRestrictedValueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUENAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ValueName");
    private static final javax.xml.namespace.QName ISDEFAULT$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsDefault");
    private static final javax.xml.namespace.QName DISPLAYORDER$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DisplayOrder");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    
    
    /**
     * Gets the "ValueName" element
     */
    public java.lang.String getValueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValueName" element
     */
    public org.apache.xmlbeans.XmlString xgetValueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ValueName" element
     */
    public void setValueName(java.lang.String valueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUENAME$0);
            }
            target.setStringValue(valueName);
        }
    }
    
    /**
     * Sets (as xml) the "ValueName" element
     */
    public void xsetValueName(org.apache.xmlbeans.XmlString valueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUENAME$0);
            }
            target.set(valueName);
        }
    }
    
    /**
     * Gets the "IsDefault" element
     */
    public boolean getIsDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDEFAULT$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsDefault" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDEFAULT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsDefault" element
     */
    public boolean isSetIsDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDEFAULT$2) != 0;
        }
    }
    
    /**
     * Sets the "IsDefault" element
     */
    public void setIsDefault(boolean isDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDEFAULT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISDEFAULT$2);
            }
            target.setBooleanValue(isDefault);
        }
    }
    
    /**
     * Sets (as xml) the "IsDefault" element
     */
    public void xsetIsDefault(org.apache.xmlbeans.XmlBoolean isDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDEFAULT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISDEFAULT$2);
            }
            target.set(isDefault);
        }
    }
    
    /**
     * Unsets the "IsDefault" element
     */
    public void unsetIsDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDEFAULT$2, 0);
        }
    }
    
    /**
     * Gets the "DisplayOrder" element
     */
    public int getDisplayOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYORDER$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DisplayOrder" element
     */
    public org.apache.xmlbeans.XmlInt xgetDisplayOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DISPLAYORDER$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "DisplayOrder" element
     */
    public boolean isSetDisplayOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYORDER$4) != 0;
        }
    }
    
    /**
     * Sets the "DisplayOrder" element
     */
    public void setDisplayOrder(int displayOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYORDER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYORDER$4);
            }
            target.setIntValue(displayOrder);
        }
    }
    
    /**
     * Sets (as xml) the "DisplayOrder" element
     */
    public void xsetDisplayOrder(org.apache.xmlbeans.XmlInt displayOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DISPLAYORDER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DISPLAYORDER$4);
            }
            target.set(displayOrder);
        }
    }
    
    /**
     * Unsets the "DisplayOrder" element
     */
    public void unsetDisplayOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYORDER$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
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
            return get_store().count_elements(DESCRIPTION$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$6);
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
            get_store().remove_element(DESCRIPTION$6, 0);
        }
    }
}
