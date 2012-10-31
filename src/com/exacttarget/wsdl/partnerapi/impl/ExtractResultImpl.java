/*
 * XML Type:  ExtractResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ExtractResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ExtractResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ExtractResultImpl extends com.exacttarget.wsdl.partnerapi.impl.ResultImpl implements com.exacttarget.wsdl.partnerapi.ExtractResult
{
    
    public ExtractResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUEST$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Request");
    
    
    /**
     * Gets the "Request" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractRequest getRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractRequest target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractRequest)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Request" element
     */
    public boolean isSetRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUEST$0) != 0;
        }
    }
    
    /**
     * Sets the "Request" element
     */
    public void setRequest(com.exacttarget.wsdl.partnerapi.ExtractRequest request)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractRequest target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractRequest)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ExtractRequest)get_store().add_element_user(REQUEST$0);
            }
            target.set(request);
        }
    }
    
    /**
     * Appends and returns a new empty "Request" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractRequest addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractRequest target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractRequest)get_store().add_element_user(REQUEST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Request" element
     */
    public void unsetRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUEST$0, 0);
        }
    }
}
