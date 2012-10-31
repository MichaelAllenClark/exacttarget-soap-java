/*
 * XML Type:  BaseMOKeyword
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.BaseMOKeyword
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML BaseMOKeyword(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class BaseMOKeywordImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.BaseMOKeyword
{
    
    public BaseMOKeywordImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISDEFAULTKEYWORD$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsDefaultKeyword");
    
    
    /**
     * Gets the "IsDefaultKeyword" element
     */
    public boolean getIsDefaultKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDEFAULTKEYWORD$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsDefaultKeyword" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsDefaultKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDEFAULTKEYWORD$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsDefaultKeyword" element
     */
    public boolean isSetIsDefaultKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDEFAULTKEYWORD$0) != 0;
        }
    }
    
    /**
     * Sets the "IsDefaultKeyword" element
     */
    public void setIsDefaultKeyword(boolean isDefaultKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDEFAULTKEYWORD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISDEFAULTKEYWORD$0);
            }
            target.setBooleanValue(isDefaultKeyword);
        }
    }
    
    /**
     * Sets (as xml) the "IsDefaultKeyword" element
     */
    public void xsetIsDefaultKeyword(org.apache.xmlbeans.XmlBoolean isDefaultKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDEFAULTKEYWORD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISDEFAULTKEYWORD$0);
            }
            target.set(isDefaultKeyword);
        }
    }
    
    /**
     * Unsets the "IsDefaultKeyword" element
     */
    public void unsetIsDefaultKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDEFAULTKEYWORD$0, 0);
        }
    }
}
