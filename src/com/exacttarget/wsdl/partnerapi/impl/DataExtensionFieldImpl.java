/*
 * XML Type:  DataExtensionField
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DataExtensionField
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML DataExtensionField(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class DataExtensionFieldImpl extends com.exacttarget.wsdl.partnerapi.impl.PropertyDefinitionImpl implements com.exacttarget.wsdl.partnerapi.DataExtensionField
{
    
    public DataExtensionFieldImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDINAL$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Ordinal");
    private static final javax.xml.namespace.QName ISPRIMARYKEY$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsPrimaryKey");
    private static final javax.xml.namespace.QName FIELDTYPE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FieldType");
    private static final javax.xml.namespace.QName DATAEXTENSION$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DataExtension");
    
    
    /**
     * Gets the "Ordinal" element
     */
    public int getOrdinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDINAL$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Ordinal" element
     */
    public org.apache.xmlbeans.XmlInt xgetOrdinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDINAL$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Ordinal" element
     */
    public boolean isSetOrdinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDINAL$0) != 0;
        }
    }
    
    /**
     * Sets the "Ordinal" element
     */
    public void setOrdinal(int ordinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDINAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDINAL$0);
            }
            target.setIntValue(ordinal);
        }
    }
    
    /**
     * Sets (as xml) the "Ordinal" element
     */
    public void xsetOrdinal(org.apache.xmlbeans.XmlInt ordinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDINAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ORDINAL$0);
            }
            target.set(ordinal);
        }
    }
    
    /**
     * Unsets the "Ordinal" element
     */
    public void unsetOrdinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDINAL$0, 0);
        }
    }
    
    /**
     * Gets the "IsPrimaryKey" element
     */
    public boolean getIsPrimaryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIMARYKEY$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsPrimaryKey" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPrimaryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARYKEY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsPrimaryKey" element
     */
    public boolean isSetIsPrimaryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPRIMARYKEY$2) != 0;
        }
    }
    
    /**
     * Sets the "IsPrimaryKey" element
     */
    public void setIsPrimaryKey(boolean isPrimaryKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIMARYKEY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPRIMARYKEY$2);
            }
            target.setBooleanValue(isPrimaryKey);
        }
    }
    
    /**
     * Sets (as xml) the "IsPrimaryKey" element
     */
    public void xsetIsPrimaryKey(org.apache.xmlbeans.XmlBoolean isPrimaryKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARYKEY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPRIMARYKEY$2);
            }
            target.set(isPrimaryKey);
        }
    }
    
    /**
     * Unsets the "IsPrimaryKey" element
     */
    public void unsetIsPrimaryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPRIMARYKEY$2, 0);
        }
    }
    
    /**
     * Gets the "FieldType" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionFieldType.Enum getFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.DataExtensionFieldType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FieldType" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionFieldType xgetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionFieldType target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionFieldType)get_store().find_element_user(FIELDTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "FieldType" element
     */
    public boolean isSetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "FieldType" element
     */
    public void setFieldType(com.exacttarget.wsdl.partnerapi.DataExtensionFieldType.Enum fieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDTYPE$4);
            }
            target.setEnumValue(fieldType);
        }
    }
    
    /**
     * Sets (as xml) the "FieldType" element
     */
    public void xsetFieldType(com.exacttarget.wsdl.partnerapi.DataExtensionFieldType fieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionFieldType target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionFieldType)get_store().find_element_user(FIELDTYPE$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionFieldType)get_store().add_element_user(FIELDTYPE$4);
            }
            target.set(fieldType);
        }
    }
    
    /**
     * Unsets the "FieldType" element
     */
    public void unsetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "DataExtension" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtension getDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtension target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtension)get_store().find_element_user(DATAEXTENSION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataExtension" element
     */
    public boolean isSetDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAEXTENSION$6) != 0;
        }
    }
    
    /**
     * Sets the "DataExtension" element
     */
    public void setDataExtension(com.exacttarget.wsdl.partnerapi.DataExtension dataExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtension target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtension)get_store().find_element_user(DATAEXTENSION$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DataExtension)get_store().add_element_user(DATAEXTENSION$6);
            }
            target.set(dataExtension);
        }
    }
    
    /**
     * Appends and returns a new empty "DataExtension" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtension addNewDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtension target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtension)get_store().add_element_user(DATAEXTENSION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "DataExtension" element
     */
    public void unsetDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAEXTENSION$6, 0);
        }
    }
}
