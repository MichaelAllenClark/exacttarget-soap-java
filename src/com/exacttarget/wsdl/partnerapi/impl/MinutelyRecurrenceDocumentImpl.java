/*
 * An XML document type.
 * Localname: MinutelyRecurrence
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.MinutelyRecurrenceDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one MinutelyRecurrence(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class MinutelyRecurrenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.MinutelyRecurrenceDocument
{
    
    public MinutelyRecurrenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINUTELYRECURRENCE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MinutelyRecurrence");
    
    
    /**
     * Gets the "MinutelyRecurrence" element
     */
    public com.exacttarget.wsdl.partnerapi.MinutelyRecurrence getMinutelyRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MinutelyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.MinutelyRecurrence)get_store().find_element_user(MINUTELYRECURRENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MinutelyRecurrence" element
     */
    public void setMinutelyRecurrence(com.exacttarget.wsdl.partnerapi.MinutelyRecurrence minutelyRecurrence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MinutelyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.MinutelyRecurrence)get_store().find_element_user(MINUTELYRECURRENCE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.MinutelyRecurrence)get_store().add_element_user(MINUTELYRECURRENCE$0);
            }
            target.set(minutelyRecurrence);
        }
    }
    
    /**
     * Appends and returns a new empty "MinutelyRecurrence" element
     */
    public com.exacttarget.wsdl.partnerapi.MinutelyRecurrence addNewMinutelyRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MinutelyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.MinutelyRecurrence)get_store().add_element_user(MINUTELYRECURRENCE$0);
            return target;
        }
    }
}
