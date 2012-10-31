/*
 * An XML document type.
 * Localname: TriggeredSendCreateResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one TriggeredSendCreateResult(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class TriggeredSendCreateResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResultDocument
{
    
    public TriggeredSendCreateResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRIGGEREDSENDCREATERESULT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSendCreateResult");
    
    
    /**
     * Gets the "TriggeredSendCreateResult" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResult getTriggeredSendCreateResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResult)get_store().find_element_user(TRIGGEREDSENDCREATERESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TriggeredSendCreateResult" element
     */
    public void setTriggeredSendCreateResult(com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResult triggeredSendCreateResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResult)get_store().find_element_user(TRIGGEREDSENDCREATERESULT$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResult)get_store().add_element_user(TRIGGEREDSENDCREATERESULT$0);
            }
            target.set(triggeredSendCreateResult);
        }
    }
    
    /**
     * Appends and returns a new empty "TriggeredSendCreateResult" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResult addNewTriggeredSendCreateResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResult)get_store().add_element_user(TRIGGEREDSENDCREATERESULT$0);
            return target;
        }
    }
}
