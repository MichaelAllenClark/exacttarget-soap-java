/*
 * XML Type:  InteractionDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.InteractionDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML InteractionDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class InteractionDefinitionImpl extends com.exacttarget.wsdl.partnerapi.impl.InteractionBaseObjectImpl implements com.exacttarget.wsdl.partnerapi.InteractionDefinition
{
    
    public InteractionDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERACTIONOBJECTID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "InteractionObjectID");
    
    
    /**
     * Gets the "InteractionObjectID" element
     */
    public java.lang.String getInteractionObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERACTIONOBJECTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InteractionObjectID" element
     */
    public org.apache.xmlbeans.XmlString xgetInteractionObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERACTIONOBJECTID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "InteractionObjectID" element
     */
    public boolean isSetInteractionObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERACTIONOBJECTID$0) != 0;
        }
    }
    
    /**
     * Sets the "InteractionObjectID" element
     */
    public void setInteractionObjectID(java.lang.String interactionObjectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERACTIONOBJECTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERACTIONOBJECTID$0);
            }
            target.setStringValue(interactionObjectID);
        }
    }
    
    /**
     * Sets (as xml) the "InteractionObjectID" element
     */
    public void xsetInteractionObjectID(org.apache.xmlbeans.XmlString interactionObjectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERACTIONOBJECTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERACTIONOBJECTID$0);
            }
            target.set(interactionObjectID);
        }
    }
    
    /**
     * Unsets the "InteractionObjectID" element
     */
    public void unsetInteractionObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERACTIONOBJECTID$0, 0);
        }
    }
}
