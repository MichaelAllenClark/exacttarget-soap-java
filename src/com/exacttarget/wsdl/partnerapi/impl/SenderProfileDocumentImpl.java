/*
 * An XML document type.
 * Localname: SenderProfile
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SenderProfileDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one SenderProfile(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class SenderProfileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SenderProfileDocument
{
    
    public SenderProfileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDERPROFILE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SenderProfile");
    
    
    /**
     * Gets the "SenderProfile" element
     */
    public com.exacttarget.wsdl.partnerapi.SenderProfile getSenderProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SenderProfile target = null;
            target = (com.exacttarget.wsdl.partnerapi.SenderProfile)get_store().find_element_user(SENDERPROFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SenderProfile" element
     */
    public void setSenderProfile(com.exacttarget.wsdl.partnerapi.SenderProfile senderProfile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SenderProfile target = null;
            target = (com.exacttarget.wsdl.partnerapi.SenderProfile)get_store().find_element_user(SENDERPROFILE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SenderProfile)get_store().add_element_user(SENDERPROFILE$0);
            }
            target.set(senderProfile);
        }
    }
    
    /**
     * Appends and returns a new empty "SenderProfile" element
     */
    public com.exacttarget.wsdl.partnerapi.SenderProfile addNewSenderProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SenderProfile target = null;
            target = (com.exacttarget.wsdl.partnerapi.SenderProfile)get_store().add_element_user(SENDERPROFILE$0);
            return target;
        }
    }
}
