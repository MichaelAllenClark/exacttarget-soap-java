/*
 * An XML document type.
 * Localname: TriggeredSend
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TriggeredSendDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one TriggeredSend(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class TriggeredSendDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.TriggeredSendDocument
{
    
    public TriggeredSendDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRIGGEREDSEND$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSend");
    
    
    /**
     * Gets the "TriggeredSend" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSend getTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSend target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSend)get_store().find_element_user(TRIGGEREDSEND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TriggeredSend" element
     */
    public void setTriggeredSend(com.exacttarget.wsdl.partnerapi.TriggeredSend triggeredSend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSend target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSend)get_store().find_element_user(TRIGGEREDSEND$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TriggeredSend)get_store().add_element_user(TRIGGEREDSEND$0);
            }
            target.set(triggeredSend);
        }
    }
    
    /**
     * Appends and returns a new empty "TriggeredSend" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSend addNewTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSend target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSend)get_store().add_element_user(TRIGGEREDSEND$0);
            return target;
        }
    }
}
