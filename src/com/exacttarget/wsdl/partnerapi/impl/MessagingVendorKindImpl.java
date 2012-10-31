/*
 * XML Type:  MessagingVendorKind
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.MessagingVendorKind
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML MessagingVendorKind(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class MessagingVendorKindImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.MessagingVendorKind
{
    
    public MessagingVendorKindImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VENDOR$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Vendor");
    private static final javax.xml.namespace.QName KIND$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Kind");
    private static final javax.xml.namespace.QName ISUSERNAMEREQUIRED$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsUsernameRequired");
    private static final javax.xml.namespace.QName ISPASSWORDREQUIRED$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsPasswordRequired");
    private static final javax.xml.namespace.QName ISPROFILEREQUIRED$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsProfileRequired");
    
    
    /**
     * Gets the "Vendor" element
     */
    public java.lang.String getVendor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VENDOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Vendor" element
     */
    public org.apache.xmlbeans.XmlString xgetVendor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VENDOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Vendor" element
     */
    public void setVendor(java.lang.String vendor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VENDOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VENDOR$0);
            }
            target.setStringValue(vendor);
        }
    }
    
    /**
     * Sets (as xml) the "Vendor" element
     */
    public void xsetVendor(org.apache.xmlbeans.XmlString vendor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VENDOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VENDOR$0);
            }
            target.set(vendor);
        }
    }
    
    /**
     * Gets the "Kind" element
     */
    public java.lang.String getKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KIND$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Kind" element
     */
    public org.apache.xmlbeans.XmlString xgetKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KIND$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Kind" element
     */
    public void setKind(java.lang.String kind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KIND$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KIND$2);
            }
            target.setStringValue(kind);
        }
    }
    
    /**
     * Sets (as xml) the "Kind" element
     */
    public void xsetKind(org.apache.xmlbeans.XmlString kind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KIND$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KIND$2);
            }
            target.set(kind);
        }
    }
    
    /**
     * Gets the "IsUsernameRequired" element
     */
    public boolean getIsUsernameRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISUSERNAMEREQUIRED$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsUsernameRequired" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsUsernameRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISUSERNAMEREQUIRED$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsUsernameRequired" element
     */
    public void setIsUsernameRequired(boolean isUsernameRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISUSERNAMEREQUIRED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISUSERNAMEREQUIRED$4);
            }
            target.setBooleanValue(isUsernameRequired);
        }
    }
    
    /**
     * Sets (as xml) the "IsUsernameRequired" element
     */
    public void xsetIsUsernameRequired(org.apache.xmlbeans.XmlBoolean isUsernameRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISUSERNAMEREQUIRED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISUSERNAMEREQUIRED$4);
            }
            target.set(isUsernameRequired);
        }
    }
    
    /**
     * Gets the "IsPasswordRequired" element
     */
    public boolean getIsPasswordRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPASSWORDREQUIRED$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsPasswordRequired" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPasswordRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPASSWORDREQUIRED$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsPasswordRequired" element
     */
    public void setIsPasswordRequired(boolean isPasswordRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPASSWORDREQUIRED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPASSWORDREQUIRED$6);
            }
            target.setBooleanValue(isPasswordRequired);
        }
    }
    
    /**
     * Sets (as xml) the "IsPasswordRequired" element
     */
    public void xsetIsPasswordRequired(org.apache.xmlbeans.XmlBoolean isPasswordRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPASSWORDREQUIRED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPASSWORDREQUIRED$6);
            }
            target.set(isPasswordRequired);
        }
    }
    
    /**
     * Gets the "IsProfileRequired" element
     */
    public boolean getIsProfileRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPROFILEREQUIRED$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsProfileRequired" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsProfileRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPROFILEREQUIRED$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsProfileRequired" element
     */
    public void setIsProfileRequired(boolean isProfileRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPROFILEREQUIRED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPROFILEREQUIRED$8);
            }
            target.setBooleanValue(isProfileRequired);
        }
    }
    
    /**
     * Sets (as xml) the "IsProfileRequired" element
     */
    public void xsetIsProfileRequired(org.apache.xmlbeans.XmlBoolean isProfileRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPROFILEREQUIRED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPROFILEREQUIRED$8);
            }
            target.set(isProfileRequired);
        }
    }
}
