/*
 * XML Type:  SMSAddress
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SMSAddress
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SMSAddress(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SMSAddressImpl extends com.exacttarget.wsdl.partnerapi.impl.SubscriberAddressImpl implements com.exacttarget.wsdl.partnerapi.SMSAddress
{
    
    public SMSAddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARRIER$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Carrier");
    
    
    /**
     * Gets the "Carrier" element
     */
    public java.lang.String getCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARRIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Carrier" element
     */
    public org.apache.xmlbeans.XmlString xgetCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARRIER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Carrier" element
     */
    public boolean isSetCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARRIER$0) != 0;
        }
    }
    
    /**
     * Sets the "Carrier" element
     */
    public void setCarrier(java.lang.String carrier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARRIER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARRIER$0);
            }
            target.setStringValue(carrier);
        }
    }
    
    /**
     * Sets (as xml) the "Carrier" element
     */
    public void xsetCarrier(org.apache.xmlbeans.XmlString carrier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARRIER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARRIER$0);
            }
            target.set(carrier);
        }
    }
    
    /**
     * Unsets the "Carrier" element
     */
    public void unsetCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARRIER$0, 0);
        }
    }
}
