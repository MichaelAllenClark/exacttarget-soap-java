/*
 * An XML document type.
 * Localname: SubscriberResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SubscriberResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one SubscriberResult(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class SubscriberResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SubscriberResultDocument
{
    
    public SubscriberResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBERRESULT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberResult");
    
    
    /**
     * Gets the "SubscriberResult" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberResult getSubscriberResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberResult)get_store().find_element_user(SUBSCRIBERRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubscriberResult" element
     */
    public void setSubscriberResult(com.exacttarget.wsdl.partnerapi.SubscriberResult subscriberResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberResult)get_store().find_element_user(SUBSCRIBERRESULT$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SubscriberResult)get_store().add_element_user(SUBSCRIBERRESULT$0);
            }
            target.set(subscriberResult);
        }
    }
    
    /**
     * Appends and returns a new empty "SubscriberResult" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberResult addNewSubscriberResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberResult)get_store().add_element_user(SUBSCRIBERRESULT$0);
            return target;
        }
    }
}
