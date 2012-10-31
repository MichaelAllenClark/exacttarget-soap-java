/*
 * An XML document type.
 * Localname: HourlyRecurrence
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.HourlyRecurrenceDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one HourlyRecurrence(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class HourlyRecurrenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.HourlyRecurrenceDocument
{
    
    public HourlyRecurrenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOURLYRECURRENCE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "HourlyRecurrence");
    
    
    /**
     * Gets the "HourlyRecurrence" element
     */
    public com.exacttarget.wsdl.partnerapi.HourlyRecurrence getHourlyRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.HourlyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.HourlyRecurrence)get_store().find_element_user(HOURLYRECURRENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HourlyRecurrence" element
     */
    public void setHourlyRecurrence(com.exacttarget.wsdl.partnerapi.HourlyRecurrence hourlyRecurrence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.HourlyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.HourlyRecurrence)get_store().find_element_user(HOURLYRECURRENCE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.HourlyRecurrence)get_store().add_element_user(HOURLYRECURRENCE$0);
            }
            target.set(hourlyRecurrence);
        }
    }
    
    /**
     * Appends and returns a new empty "HourlyRecurrence" element
     */
    public com.exacttarget.wsdl.partnerapi.HourlyRecurrence addNewHourlyRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.HourlyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.HourlyRecurrence)get_store().add_element_user(HOURLYRECURRENCE$0);
            return target;
        }
    }
}
