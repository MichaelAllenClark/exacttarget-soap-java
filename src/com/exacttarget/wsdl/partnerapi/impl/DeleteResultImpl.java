/*
 * XML Type:  DeleteResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DeleteResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML DeleteResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class DeleteResultImpl extends com.exacttarget.wsdl.partnerapi.impl.ResultImpl implements com.exacttarget.wsdl.partnerapi.DeleteResult
{
    
    public DeleteResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Object");
    
    
    /**
     * Gets the "Object" element
     */
    public com.exacttarget.wsdl.partnerapi.APIObject getObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(OBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Object" element
     */
    public void setObject(com.exacttarget.wsdl.partnerapi.APIObject object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(OBJECT$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(OBJECT$0);
            }
            target.set(object);
        }
    }
    
    /**
     * Appends and returns a new empty "Object" element
     */
    public com.exacttarget.wsdl.partnerapi.APIObject addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(OBJECT$0);
            return target;
        }
    }
}
