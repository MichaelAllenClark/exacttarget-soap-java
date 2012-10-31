/*
 * XML Type:  SaveOption
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SaveOption
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SaveOption(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SaveOptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SaveOption
{
    
    public SaveOptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYNAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PropertyName");
    private static final javax.xml.namespace.QName SAVEACTION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SaveAction");
    
    
    /**
     * Gets the "PropertyName" element
     */
    public java.lang.String getPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertyName" element
     */
    public org.apache.xmlbeans.XmlString xgetPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PropertyName" element
     */
    public void setPropertyName(java.lang.String propertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYNAME$0);
            }
            target.setStringValue(propertyName);
        }
    }
    
    /**
     * Sets (as xml) the "PropertyName" element
     */
    public void xsetPropertyName(org.apache.xmlbeans.XmlString propertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYNAME$0);
            }
            target.set(propertyName);
        }
    }
    
    /**
     * Gets the "SaveAction" element
     */
    public com.exacttarget.wsdl.partnerapi.SaveAction.Enum getSaveAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAVEACTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SaveAction.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SaveAction" element
     */
    public com.exacttarget.wsdl.partnerapi.SaveAction xgetSaveAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SaveAction target = null;
            target = (com.exacttarget.wsdl.partnerapi.SaveAction)get_store().find_element_user(SAVEACTION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SaveAction" element
     */
    public void setSaveAction(com.exacttarget.wsdl.partnerapi.SaveAction.Enum saveAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAVEACTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAVEACTION$2);
            }
            target.setEnumValue(saveAction);
        }
    }
    
    /**
     * Sets (as xml) the "SaveAction" element
     */
    public void xsetSaveAction(com.exacttarget.wsdl.partnerapi.SaveAction saveAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SaveAction target = null;
            target = (com.exacttarget.wsdl.partnerapi.SaveAction)get_store().find_element_user(SAVEACTION$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SaveAction)get_store().add_element_user(SAVEACTION$2);
            }
            target.set(saveAction);
        }
    }
}
