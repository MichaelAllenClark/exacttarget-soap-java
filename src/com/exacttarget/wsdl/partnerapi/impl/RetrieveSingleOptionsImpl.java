/*
 * XML Type:  RetrieveSingleOptions
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.RetrieveSingleOptions
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML RetrieveSingleOptions(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class RetrieveSingleOptionsImpl extends com.exacttarget.wsdl.partnerapi.impl.OptionsImpl implements com.exacttarget.wsdl.partnerapi.RetrieveSingleOptions
{
    
    public RetrieveSingleOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Parameters");
    
    
    /**
     * Gets the "Parameters" element
     */
    public com.exacttarget.wsdl.partnerapi.Parameters getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.Parameters)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Parameters" element
     */
    public void setParameters(com.exacttarget.wsdl.partnerapi.Parameters parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.Parameters)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Parameters)get_store().add_element_user(PARAMETERS$0);
            }
            target.set(parameters);
        }
    }
    
    /**
     * Appends and returns a new empty "Parameters" element
     */
    public com.exacttarget.wsdl.partnerapi.Parameters addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.Parameters)get_store().add_element_user(PARAMETERS$0);
            return target;
        }
    }
}
