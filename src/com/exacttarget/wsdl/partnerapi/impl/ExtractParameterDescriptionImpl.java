/*
 * XML Type:  ExtractParameterDescription
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ExtractParameterDescription
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ExtractParameterDescription(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ExtractParameterDescriptionImpl extends com.exacttarget.wsdl.partnerapi.impl.ParameterDescriptionImpl implements com.exacttarget.wsdl.partnerapi.ExtractParameterDescription
{
    
    public ExtractParameterDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName DATATYPE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DataType");
    private static final javax.xml.namespace.QName DEFAULTVALUE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DefaultValue");
    private static final javax.xml.namespace.QName ISOPTIONAL$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsOptional");
    private static final javax.xml.namespace.QName DROPDOWNLIST$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DropDownList");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "DataType" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractParameterDataType.Enum getDataType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATATYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.ExtractParameterDataType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataType" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractParameterDataType xgetDataType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractParameterDataType target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractParameterDataType)get_store().find_element_user(DATATYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DataType" element
     */
    public void setDataType(com.exacttarget.wsdl.partnerapi.ExtractParameterDataType.Enum dataType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATATYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATATYPE$2);
            }
            target.setEnumValue(dataType);
        }
    }
    
    /**
     * Sets (as xml) the "DataType" element
     */
    public void xsetDataType(com.exacttarget.wsdl.partnerapi.ExtractParameterDataType dataType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractParameterDataType target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractParameterDataType)get_store().find_element_user(DATATYPE$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ExtractParameterDataType)get_store().add_element_user(DATATYPE$2);
            }
            target.set(dataType);
        }
    }
    
    /**
     * Gets the "DefaultValue" element
     */
    public java.lang.String getDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DefaultValue" element
     */
    public org.apache.xmlbeans.XmlString xgetDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DefaultValue" element
     */
    public void setDefaultValue(java.lang.String defaultValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTVALUE$4);
            }
            target.setStringValue(defaultValue);
        }
    }
    
    /**
     * Sets (as xml) the "DefaultValue" element
     */
    public void xsetDefaultValue(org.apache.xmlbeans.XmlString defaultValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTVALUE$4);
            }
            target.set(defaultValue);
        }
    }
    
    /**
     * Gets the "IsOptional" element
     */
    public boolean getIsOptional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOPTIONAL$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsOptional" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsOptional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISOPTIONAL$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsOptional" element
     */
    public void setIsOptional(boolean isOptional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOPTIONAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISOPTIONAL$6);
            }
            target.setBooleanValue(isOptional);
        }
    }
    
    /**
     * Sets (as xml) the "IsOptional" element
     */
    public void xsetIsOptional(org.apache.xmlbeans.XmlBoolean isOptional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISOPTIONAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISOPTIONAL$6);
            }
            target.set(isOptional);
        }
    }
    
    /**
     * Gets the "DropDownList" element
     */
    public java.lang.String getDropDownList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DROPDOWNLIST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DropDownList" element
     */
    public org.apache.xmlbeans.XmlString xgetDropDownList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DROPDOWNLIST$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DropDownList" element
     */
    public void setDropDownList(java.lang.String dropDownList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DROPDOWNLIST$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DROPDOWNLIST$8);
            }
            target.setStringValue(dropDownList);
        }
    }
    
    /**
     * Sets (as xml) the "DropDownList" element
     */
    public void xsetDropDownList(org.apache.xmlbeans.XmlString dropDownList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DROPDOWNLIST$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DROPDOWNLIST$8);
            }
            target.set(dropDownList);
        }
    }
}
