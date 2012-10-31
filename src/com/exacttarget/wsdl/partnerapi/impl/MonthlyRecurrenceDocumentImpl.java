/*
 * An XML document type.
 * Localname: MonthlyRecurrence
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.MonthlyRecurrenceDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one MonthlyRecurrence(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class MonthlyRecurrenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.MonthlyRecurrenceDocument
{
    
    public MonthlyRecurrenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MONTHLYRECURRENCE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MonthlyRecurrence");
    
    
    /**
     * Gets the "MonthlyRecurrence" element
     */
    public com.exacttarget.wsdl.partnerapi.MonthlyRecurrence getMonthlyRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MonthlyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence)get_store().find_element_user(MONTHLYRECURRENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MonthlyRecurrence" element
     */
    public void setMonthlyRecurrence(com.exacttarget.wsdl.partnerapi.MonthlyRecurrence monthlyRecurrence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MonthlyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence)get_store().find_element_user(MONTHLYRECURRENCE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence)get_store().add_element_user(MONTHLYRECURRENCE$0);
            }
            target.set(monthlyRecurrence);
        }
    }
    
    /**
     * Appends and returns a new empty "MonthlyRecurrence" element
     */
    public com.exacttarget.wsdl.partnerapi.MonthlyRecurrence addNewMonthlyRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MonthlyRecurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence)get_store().add_element_user(MONTHLYRECURRENCE$0);
            return target;
        }
    }
}
