/*
 * An XML document type.
 * Localname: SubscriberList
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SubscriberListDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one SubscriberList(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class SubscriberListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SubscriberListDocument
{
    
    public SubscriberListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBERLIST$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberList");
    
    
    /**
     * Gets the "SubscriberList" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberList getSubscriberList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberList target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberList)get_store().find_element_user(SUBSCRIBERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubscriberList" element
     */
    public void setSubscriberList(com.exacttarget.wsdl.partnerapi.SubscriberList subscriberList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberList target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberList)get_store().find_element_user(SUBSCRIBERLIST$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SubscriberList)get_store().add_element_user(SUBSCRIBERLIST$0);
            }
            target.set(subscriberList);
        }
    }
    
    /**
     * Appends and returns a new empty "SubscriberList" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberList addNewSubscriberList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberList target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberList)get_store().add_element_user(SUBSCRIBERLIST$0);
            return target;
        }
    }
}
