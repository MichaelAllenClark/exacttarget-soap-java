/*
 * An XML document type.
 * Localname: Send
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SendDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one Send(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class SendDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SendDocument
{
    
    public SendDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEND$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Send");
    
    
    /**
     * Gets the "Send" element
     */
    public com.exacttarget.wsdl.partnerapi.Send getSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send)get_store().find_element_user(SEND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Send" element
     */
    public void setSend(com.exacttarget.wsdl.partnerapi.Send send)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send)get_store().find_element_user(SEND$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Send)get_store().add_element_user(SEND$0);
            }
            target.set(send);
        }
    }
    
    /**
     * Appends and returns a new empty "Send" element
     */
    public com.exacttarget.wsdl.partnerapi.Send addNewSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send)get_store().add_element_user(SEND$0);
            return target;
        }
    }
}
