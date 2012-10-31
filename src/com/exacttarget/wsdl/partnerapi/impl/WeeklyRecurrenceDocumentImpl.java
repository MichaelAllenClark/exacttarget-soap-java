/*
 * An XML document type.
 * Localname: WeeklyRecurrence
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.WeeklyRecurrenceDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one WeeklyRecurrence(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class WeeklyRecurrenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.WeeklyRecurrenceDocument
{
    
    public WeeklyRecurrenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEEKLYRECURRENCE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "WeeklyRecurrence");
    
    
    /**
     * Gets the "WeeklyRecurrence" element
     */
    public com.exacttarget.wsdl.partnerapi.WeeklyRecurrence getWeeklyRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.WeeklyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.WeeklyRecurrence)get_store().find_element_user(WEEKLYRECURRENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WeeklyRecurrence" element
     */
    public void setWeeklyRecurrence(com.exacttarget.wsdl.partnerapi.WeeklyRecurrence weeklyRecurrence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.WeeklyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.WeeklyRecurrence)get_store().find_element_user(WEEKLYRECURRENCE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.WeeklyRecurrence)get_store().add_element_user(WEEKLYRECURRENCE$0);
            }
            target.set(weeklyRecurrence);
        }
    }
    
    /**
     * Appends and returns a new empty "WeeklyRecurrence" element
     */
    public com.exacttarget.wsdl.partnerapi.WeeklyRecurrence addNewWeeklyRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.WeeklyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.WeeklyRecurrence)get_store().add_element_user(WEEKLYRECURRENCE$0);
            return target;
        }
    }
}
