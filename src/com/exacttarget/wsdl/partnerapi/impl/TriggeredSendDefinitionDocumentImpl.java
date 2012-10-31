/*
 * An XML document type.
 * Localname: TriggeredSendDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TriggeredSendDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one TriggeredSendDefinition(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class TriggeredSendDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.TriggeredSendDefinitionDocument
{
    
    public TriggeredSendDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRIGGEREDSENDDEFINITION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSendDefinition");
    
    
    /**
     * Gets the "TriggeredSendDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition getTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().find_element_user(TRIGGEREDSENDDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TriggeredSendDefinition" element
     */
    public void setTriggeredSendDefinition(com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition triggeredSendDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().find_element_user(TRIGGEREDSENDDEFINITION$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().add_element_user(TRIGGEREDSENDDEFINITION$0);
            }
            target.set(triggeredSendDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "TriggeredSendDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition addNewTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().add_element_user(TRIGGEREDSENDDEFINITION$0);
            return target;
        }
    }
}
