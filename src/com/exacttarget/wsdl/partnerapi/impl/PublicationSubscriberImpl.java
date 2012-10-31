/*
 * XML Type:  PublicationSubscriber
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PublicationSubscriber
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML PublicationSubscriber(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class PublicationSubscriberImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.PublicationSubscriber
{
    
    public PublicationSubscriberImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLICATION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Publication");
    private static final javax.xml.namespace.QName SUBSCRIBER$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscriber");
    
    
    /**
     * Gets the "Publication" element
     */
    public com.exacttarget.wsdl.partnerapi.Publication getPublication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Publication target = null;
            target = (com.exacttarget.wsdl.partnerapi.Publication)get_store().find_element_user(PUBLICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Publication" element
     */
    public boolean isSetPublication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLICATION$0) != 0;
        }
    }
    
    /**
     * Sets the "Publication" element
     */
    public void setPublication(com.exacttarget.wsdl.partnerapi.Publication publication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Publication target = null;
            target = (com.exacttarget.wsdl.partnerapi.Publication)get_store().find_element_user(PUBLICATION$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Publication)get_store().add_element_user(PUBLICATION$0);
            }
            target.set(publication);
        }
    }
    
    /**
     * Appends and returns a new empty "Publication" element
     */
    public com.exacttarget.wsdl.partnerapi.Publication addNewPublication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Publication target = null;
            target = (com.exacttarget.wsdl.partnerapi.Publication)get_store().add_element_user(PUBLICATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Publication" element
     */
    public void unsetPublication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLICATION$0, 0);
        }
    }
    
    /**
     * Gets the "Subscriber" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscriber getSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Subscriber" element
     */
    public boolean isSetSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBER$2) != 0;
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
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$2);
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
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Subscriber" element
     */
    public void unsetSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBER$2, 0);
        }
    }
}
