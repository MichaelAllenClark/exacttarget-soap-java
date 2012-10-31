/*
 * An XML document type.
 * Localname: SendDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SendDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one SendDefinition(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class SendDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SendDefinitionDocument
{
    
    public SendDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDDEFINITION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendDefinition");
    
    
    /**
     * Gets the "SendDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.SendDefinition getSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinition)get_store().find_element_user(SENDDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SendDefinition" element
     */
    public void setSendDefinition(com.exacttarget.wsdl.partnerapi.SendDefinition sendDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinition)get_store().find_element_user(SENDDEFINITION$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SendDefinition)get_store().add_element_user(SENDDEFINITION$0);
            }
            target.set(sendDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "SendDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.SendDefinition addNewSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinition)get_store().add_element_user(SENDDEFINITION$0);
            return target;
        }
    }
}
