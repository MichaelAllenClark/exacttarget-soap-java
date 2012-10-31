/*
 * XML Type:  SubscriberTypeDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SubscriberTypeDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SubscriberTypeDefinitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition
{
    
    public SubscriberTypeDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBERTYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberType");
    
    
    /**
     * Gets the "SubscriberType" element
     */
    public java.lang.String getSubscriberType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubscriberType" element
     */
    public org.apache.xmlbeans.XmlString xgetSubscriberType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBERTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SubscriberType" element
     */
    public boolean isSetSubscriberType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBERTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "SubscriberType" element
     */
    public void setSubscriberType(java.lang.String subscriberType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIBERTYPE$0);
            }
            target.setStringValue(subscriberType);
        }
    }
    
    /**
     * Sets (as xml) the "SubscriberType" element
     */
    public void xsetSubscriberType(org.apache.xmlbeans.XmlString subscriberType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBERTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSCRIBERTYPE$0);
            }
            target.set(subscriberType);
        }
    }
    
    /**
     * Unsets the "SubscriberType" element
     */
    public void unsetSubscriberType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBERTYPE$0, 0);
        }
    }
}
