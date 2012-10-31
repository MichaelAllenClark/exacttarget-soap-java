/*
 * XML Type:  RetrieveSingleRequest
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.RetrieveSingleRequest
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML RetrieveSingleRequest(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class RetrieveSingleRequestImpl extends com.exacttarget.wsdl.partnerapi.impl.RequestImpl implements com.exacttarget.wsdl.partnerapi.RetrieveSingleRequest
{
    
    public RetrieveSingleRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTEDOBJECT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestedObject");
    private static final javax.xml.namespace.QName RETRIEVEOPTION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RetrieveOption");
    
    
    /**
     * Gets the "RequestedObject" element
     */
    public com.exacttarget.wsdl.partnerapi.APIObject getRequestedObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(REQUESTEDOBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RequestedObject" element
     */
    public void setRequestedObject(com.exacttarget.wsdl.partnerapi.APIObject requestedObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(REQUESTEDOBJECT$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(REQUESTEDOBJECT$0);
            }
            target.set(requestedObject);
        }
    }
    
    /**
     * Appends and returns a new empty "RequestedObject" element
     */
    public com.exacttarget.wsdl.partnerapi.APIObject addNewRequestedObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(REQUESTEDOBJECT$0);
            return target;
        }
    }
    
    /**
     * Gets the "RetrieveOption" element
     */
    public com.exacttarget.wsdl.partnerapi.Options getRetrieveOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Options target = null;
            target = (com.exacttarget.wsdl.partnerapi.Options)get_store().find_element_user(RETRIEVEOPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RetrieveOption" element
     */
    public boolean isSetRetrieveOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETRIEVEOPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "RetrieveOption" element
     */
    public void setRetrieveOption(com.exacttarget.wsdl.partnerapi.Options retrieveOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Options target = null;
            target = (com.exacttarget.wsdl.partnerapi.Options)get_store().find_element_user(RETRIEVEOPTION$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Options)get_store().add_element_user(RETRIEVEOPTION$2);
            }
            target.set(retrieveOption);
        }
    }
    
    /**
     * Appends and returns a new empty "RetrieveOption" element
     */
    public com.exacttarget.wsdl.partnerapi.Options addNewRetrieveOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Options target = null;
            target = (com.exacttarget.wsdl.partnerapi.Options)get_store().add_element_user(RETRIEVEOPTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "RetrieveOption" element
     */
    public void unsetRetrieveOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETRIEVEOPTION$2, 0);
        }
    }
}
