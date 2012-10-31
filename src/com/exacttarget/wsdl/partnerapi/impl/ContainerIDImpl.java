/*
 * XML Type:  ContainerID
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ContainerID
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ContainerID(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ContainerIDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ContainerID
{
    
    public ContainerIDImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APIOBJECT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "APIObject");
    
    
    /**
     * Gets the "APIObject" element
     */
    public com.exacttarget.wsdl.partnerapi.APIObject getAPIObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(APIOBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "APIObject" element
     */
    public boolean isSetAPIObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APIOBJECT$0) != 0;
        }
    }
    
    /**
     * Sets the "APIObject" element
     */
    public void setAPIObject(com.exacttarget.wsdl.partnerapi.APIObject apiObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(APIOBJECT$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(APIOBJECT$0);
            }
            target.set(apiObject);
        }
    }
    
    /**
     * Appends and returns a new empty "APIObject" element
     */
    public com.exacttarget.wsdl.partnerapi.APIObject addNewAPIObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(APIOBJECT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "APIObject" element
     */
    public void unsetAPIObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APIOBJECT$0, 0);
        }
    }
}
