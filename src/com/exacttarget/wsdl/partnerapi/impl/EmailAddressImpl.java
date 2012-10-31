/*
 * XML Type:  EmailAddress
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.EmailAddress
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML EmailAddress(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class EmailAddressImpl extends com.exacttarget.wsdl.partnerapi.impl.SubscriberAddressImpl implements com.exacttarget.wsdl.partnerapi.EmailAddress
{
    
    public EmailAddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Type");
    
    
    /**
     * Gets the "Type" element
     */
    public com.exacttarget.wsdl.partnerapi.EmailType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.EmailType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public com.exacttarget.wsdl.partnerapi.EmailType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailType target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailType)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(com.exacttarget.wsdl.partnerapi.EmailType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(com.exacttarget.wsdl.partnerapi.EmailType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailType target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.EmailType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, 0);
        }
    }
}
