/*
 * An XML document type.
 * Localname: DailyRecurrence
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DailyRecurrenceDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one DailyRecurrence(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class DailyRecurrenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.DailyRecurrenceDocument
{
    
    public DailyRecurrenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DAILYRECURRENCE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DailyRecurrence");
    
    
    /**
     * Gets the "DailyRecurrence" element
     */
    public com.exacttarget.wsdl.partnerapi.DailyRecurrence getDailyRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DailyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.DailyRecurrence)get_store().find_element_user(DAILYRECURRENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DailyRecurrence" element
     */
    public void setDailyRecurrence(com.exacttarget.wsdl.partnerapi.DailyRecurrence dailyRecurrence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DailyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.DailyRecurrence)get_store().find_element_user(DAILYRECURRENCE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DailyRecurrence)get_store().add_element_user(DAILYRECURRENCE$0);
            }
            target.set(dailyRecurrence);
        }
    }
    
    /**
     * Appends and returns a new empty "DailyRecurrence" element
     */
    public com.exacttarget.wsdl.partnerapi.DailyRecurrence addNewDailyRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DailyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.DailyRecurrence)get_store().add_element_user(DAILYRECURRENCE$0);
            return target;
        }
    }
}
