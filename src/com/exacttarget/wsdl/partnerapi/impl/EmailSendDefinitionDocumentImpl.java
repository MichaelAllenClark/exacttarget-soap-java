/*
 * An XML document type.
 * Localname: EmailSendDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.EmailSendDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one EmailSendDefinition(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class EmailSendDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.EmailSendDefinitionDocument
{
    
    public EmailSendDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMAILSENDDEFINITION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EmailSendDefinition");
    
    
    /**
     * Gets the "EmailSendDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.EmailSendDefinition getEmailSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailSendDefinition)get_store().find_element_user(EMAILSENDDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EmailSendDefinition" element
     */
    public void setEmailSendDefinition(com.exacttarget.wsdl.partnerapi.EmailSendDefinition emailSendDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailSendDefinition)get_store().find_element_user(EMAILSENDDEFINITION$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.EmailSendDefinition)get_store().add_element_user(EMAILSENDDEFINITION$0);
            }
            target.set(emailSendDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "EmailSendDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.EmailSendDefinition addNewEmailSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailSendDefinition)get_store().add_element_user(EMAILSENDDEFINITION$0);
            return target;
        }
    }
}
