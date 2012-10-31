/*
 * An XML document type.
 * Localname: YearlyRecurrence
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.YearlyRecurrenceDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one YearlyRecurrence(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class YearlyRecurrenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.YearlyRecurrenceDocument
{
    
    public YearlyRecurrenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName YEARLYRECURRENCE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "YearlyRecurrence");
    
    
    /**
     * Gets the "YearlyRecurrence" element
     */
    public com.exacttarget.wsdl.partnerapi.YearlyRecurrence getYearlyRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.YearlyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.YearlyRecurrence)get_store().find_element_user(YEARLYRECURRENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "YearlyRecurrence" element
     */
    public void setYearlyRecurrence(com.exacttarget.wsdl.partnerapi.YearlyRecurrence yearlyRecurrence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.YearlyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.YearlyRecurrence)get_store().find_element_user(YEARLYRECURRENCE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.YearlyRecurrence)get_store().add_element_user(YEARLYRECURRENCE$0);
            }
            target.set(yearlyRecurrence);
        }
    }
    
    /**
     * Appends and returns a new empty "YearlyRecurrence" element
     */
    public com.exacttarget.wsdl.partnerapi.YearlyRecurrence addNewYearlyRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.YearlyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.YearlyRecurrence)get_store().add_element_user(YEARLYRECURRENCE$0);
            return target;
        }
    }
}
