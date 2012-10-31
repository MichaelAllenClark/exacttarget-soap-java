/*
 * XML Type:  PerformOptions
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PerformOptions
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML PerformOptions(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class PerformOptionsImpl extends com.exacttarget.wsdl.partnerapi.impl.OptionsImpl implements com.exacttarget.wsdl.partnerapi.PerformOptions
{
    
    public PerformOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPLANATION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Explanation");
    
    
    /**
     * Gets the "Explanation" element
     */
    public java.lang.String getExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPLANATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Explanation" element
     */
    public org.apache.xmlbeans.XmlString xgetExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPLANATION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Explanation" element
     */
    public boolean isSetExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPLANATION$0) != 0;
        }
    }
    
    /**
     * Sets the "Explanation" element
     */
    public void setExplanation(java.lang.String explanation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPLANATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPLANATION$0);
            }
            target.setStringValue(explanation);
        }
    }
    
    /**
     * Sets (as xml) the "Explanation" element
     */
    public void xsetExplanation(org.apache.xmlbeans.XmlString explanation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPLANATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPLANATION$0);
            }
            target.set(explanation);
        }
    }
    
    /**
     * Unsets the "Explanation" element
     */
    public void unsetExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPLANATION$0, 0);
        }
    }
}
