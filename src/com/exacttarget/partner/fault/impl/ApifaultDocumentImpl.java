/*
 * An XML document type.
 * Localname: apifault
 * Namespace: urn:fault.partner.exacttarget.com
 * Java type: com.exacttarget.partner.fault.ApifaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.partner.fault.impl;
/**
 * A document containing one apifault(@urn:fault.partner.exacttarget.com) element.
 *
 * This is a complex type.
 */
public class ApifaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.partner.fault.ApifaultDocument
{
    
    public ApifaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APIFAULT$0 = 
        new javax.xml.namespace.QName("urn:fault.partner.exacttarget.com", "apifault");
    
    
    /**
     * Gets the "apifault" element
     */
    public com.exacttarget.partner.fault.APIFault getApifault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.partner.fault.APIFault target = null;
            target = (com.exacttarget.partner.fault.APIFault)get_store().find_element_user(APIFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "apifault" element
     */
    public void setApifault(com.exacttarget.partner.fault.APIFault apifault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.partner.fault.APIFault target = null;
            target = (com.exacttarget.partner.fault.APIFault)get_store().find_element_user(APIFAULT$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.partner.fault.APIFault)get_store().add_element_user(APIFAULT$0);
            }
            target.set(apifault);
        }
    }
    
    /**
     * Appends and returns a new empty "apifault" element
     */
    public com.exacttarget.partner.fault.APIFault addNewApifault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.partner.fault.APIFault target = null;
            target = (com.exacttarget.partner.fault.APIFault)get_store().add_element_user(APIFAULT$0);
            return target;
        }
    }
}
