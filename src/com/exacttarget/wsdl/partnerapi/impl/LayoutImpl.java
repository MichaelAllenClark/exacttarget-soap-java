/*
 * XML Type:  Layout
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Layout
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Layout(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class LayoutImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.Layout
{
    
    public LayoutImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAYOUTNAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "LayoutName");
    
    
    /**
     * Gets the "LayoutName" element
     */
    public java.lang.String getLayoutName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAYOUTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LayoutName" element
     */
    public org.apache.xmlbeans.XmlString xgetLayoutName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAYOUTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "LayoutName" element
     */
    public boolean isSetLayoutName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAYOUTNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "LayoutName" element
     */
    public void setLayoutName(java.lang.String layoutName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAYOUTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAYOUTNAME$0);
            }
            target.setStringValue(layoutName);
        }
    }
    
    /**
     * Sets (as xml) the "LayoutName" element
     */
    public void xsetLayoutName(org.apache.xmlbeans.XmlString layoutName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAYOUTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LAYOUTNAME$0);
            }
            target.set(layoutName);
        }
    }
    
    /**
     * Unsets the "LayoutName" element
     */
    public void unsetLayoutName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAYOUTNAME$0, 0);
        }
    }
}
