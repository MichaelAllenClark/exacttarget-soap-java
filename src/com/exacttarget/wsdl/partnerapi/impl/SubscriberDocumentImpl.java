/*
 * An XML document type.
 * Localname: Subscriber
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SubscriberDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one Subscriber(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class SubscriberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SubscriberDocument
{
    
    public SubscriberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBER$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscriber");
    
    
    /**
     * Gets the "Subscriber" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscriber getSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Subscriber" element
     */
    public void setSubscriber(com.exacttarget.wsdl.partnerapi.Subscriber subscriber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$0);
            }
            target.set(subscriber);
        }
    }
    
    /**
     * Appends and returns a new empty "Subscriber" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscriber addNewSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$0);
            return target;
        }
    }
}
