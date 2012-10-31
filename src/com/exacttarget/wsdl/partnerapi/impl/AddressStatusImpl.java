/*
 * XML Type:  AddressStatus
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.AddressStatus
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML AddressStatus(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class AddressStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.AddressStatus
{
    
    public AddressStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Status");
    
    
    /**
     * Gets the "Status" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus)get_store().find_element_user(STATUS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$0) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus)get_store().add_element_user(STATUS$0);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$0, 0);
        }
    }
}
