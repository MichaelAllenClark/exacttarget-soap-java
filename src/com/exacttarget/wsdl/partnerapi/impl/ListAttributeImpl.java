/*
 * XML Type:  ListAttribute
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ListAttribute
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ListAttribute(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ListAttributeImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.ListAttribute
{
    
    public ListAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIST$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "List");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName FIELDTYPE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FieldType");
    private static final javax.xml.namespace.QName FIELDLENGTH$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FieldLength");
    private static final javax.xml.namespace.QName SCALE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Scale");
    private static final javax.xml.namespace.QName MINVALUE$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MinValue");
    private static final javax.xml.namespace.QName MAXVALUE$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MaxValue");
    private static final javax.xml.namespace.QName DEFAULTVALUE$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DefaultValue");
    private static final javax.xml.namespace.QName ISNULLABLE$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsNullable");
    private static final javax.xml.namespace.QName ISHIDDEN$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsHidden");
    private static final javax.xml.namespace.QName ISREADONLY$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsReadOnly");
    private static final javax.xml.namespace.QName INHERITABLE$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Inheritable");
    private static final javax.xml.namespace.QName OVERRIDABLE$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Overridable");
    private static final javax.xml.namespace.QName MUSTOVERRIDE$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MustOverride");
    private static final javax.xml.namespace.QName OVERRIDETYPE$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OverrideType");
    private static final javax.xml.namespace.QName ORDINAL$32 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Ordinal");
    private static final javax.xml.namespace.QName RESTRICTEDVALUES$34 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RestrictedValues");
    private static final javax.xml.namespace.QName BASEATTRIBUTE$36 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BaseAttribute");
    
    
    /**
     * Gets the "List" element
     */
    public com.exacttarget.wsdl.partnerapi.List getList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(LIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "List" element
     */
    public boolean isSetList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIST$0) != 0;
        }
    }
    
    /**
     * Sets the "List" element
     */
    public void setList(com.exacttarget.wsdl.partnerapi.List list)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(LIST$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.List)get_store().add_element_user(LIST$0);
            }
            target.set(list);
        }
    }
    
    /**
     * Appends and returns a new empty "List" element
     */
    public com.exacttarget.wsdl.partnerapi.List addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().add_element_user(LIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "List" element
     */
    public void unsetList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIST$0, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets the "FieldType" element
     */
    public com.exacttarget.wsdl.partnerapi.ListAttributeFieldType.Enum getFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.ListAttributeFieldType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FieldType" element
     */
    public com.exacttarget.wsdl.partnerapi.ListAttributeFieldType xgetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttributeFieldType target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttributeFieldType)get_store().find_element_user(FIELDTYPE$6, 0);
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
            return get_store().count_elements(FIELDTYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "FieldType" element
     */
    public void setFieldType(com.exacttarget.wsdl.partnerapi.ListAttributeFieldType.Enum fieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDTYPE$6);
            }
            target.setEnumValue(fieldType);
        }
    }
    
    /**
     * Sets (as xml) the "FieldType" element
     */
    public void xsetFieldType(com.exacttarget.wsdl.partnerapi.ListAttributeFieldType fieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttributeFieldType target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttributeFieldType)get_store().find_element_user(FIELDTYPE$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ListAttributeFieldType)get_store().add_element_user(FIELDTYPE$6);
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
            get_store().remove_element(FIELDTYPE$6, 0);
        }
    }
    
    /**
     * Gets the "FieldLength" element
     */
    public int getFieldLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDLENGTH$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "FieldLength" element
     */
    public org.apache.xmlbeans.XmlInt xgetFieldLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FIELDLENGTH$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "FieldLength" element
     */
    public boolean isSetFieldLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDLENGTH$8) != 0;
        }
    }
    
    /**
     * Sets the "FieldLength" element
     */
    public void setFieldLength(int fieldLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDLENGTH$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDLENGTH$8);
            }
            target.setIntValue(fieldLength);
        }
    }
    
    /**
     * Sets (as xml) the "FieldLength" element
     */
    public void xsetFieldLength(org.apache.xmlbeans.XmlInt fieldLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FIELDLENGTH$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FIELDLENGTH$8);
            }
            target.set(fieldLength);
        }
    }
    
    /**
     * Unsets the "FieldLength" element
     */
    public void unsetFieldLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDLENGTH$8, 0);
        }
    }
    
    /**
     * Gets the "Scale" element
     */
    public int getScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALE$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Scale" element
     */
    public org.apache.xmlbeans.XmlInt xgetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SCALE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Scale" element
     */
    public boolean isSetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCALE$10) != 0;
        }
    }
    
    /**
     * Sets the "Scale" element
     */
    public void setScale(int scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCALE$10);
            }
            target.setIntValue(scale);
        }
    }
    
    /**
     * Sets (as xml) the "Scale" element
     */
    public void xsetScale(org.apache.xmlbeans.XmlInt scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SCALE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SCALE$10);
            }
            target.set(scale);
        }
    }
    
    /**
     * Unsets the "Scale" element
     */
    public void unsetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCALE$10, 0);
        }
    }
    
    /**
     * Gets the "MinValue" element
     */
    public java.lang.String getMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINVALUE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinValue" element
     */
    public org.apache.xmlbeans.XmlString xgetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINVALUE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "MinValue" element
     */
    public boolean isSetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINVALUE$12) != 0;
        }
    }
    
    /**
     * Sets the "MinValue" element
     */
    public void setMinValue(java.lang.String minValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINVALUE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINVALUE$12);
            }
            target.setStringValue(minValue);
        }
    }
    
    /**
     * Sets (as xml) the "MinValue" element
     */
    public void xsetMinValue(org.apache.xmlbeans.XmlString minValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINVALUE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MINVALUE$12);
            }
            target.set(minValue);
        }
    }
    
    /**
     * Unsets the "MinValue" element
     */
    public void unsetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINVALUE$12, 0);
        }
    }
    
    /**
     * Gets the "MaxValue" element
     */
    public java.lang.String getMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXVALUE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxValue" element
     */
    public org.apache.xmlbeans.XmlString xgetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXVALUE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxValue" element
     */
    public boolean isSetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXVALUE$14) != 0;
        }
    }
    
    /**
     * Sets the "MaxValue" element
     */
    public void setMaxValue(java.lang.String maxValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXVALUE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXVALUE$14);
            }
            target.setStringValue(maxValue);
        }
    }
    
    /**
     * Sets (as xml) the "MaxValue" element
     */
    public void xsetMaxValue(org.apache.xmlbeans.XmlString maxValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXVALUE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAXVALUE$14);
            }
            target.set(maxValue);
        }
    }
    
    /**
     * Unsets the "MaxValue" element
     */
    public void unsetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXVALUE$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "DefaultValue" element
     */
    public boolean isSetDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTVALUE$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTVALUE$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTVALUE$16);
            }
            target.set(defaultValue);
        }
    }
    
    /**
     * Unsets the "DefaultValue" element
     */
    public void unsetDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTVALUE$16, 0);
        }
    }
    
    /**
     * Gets the "IsNullable" element
     */
    public boolean getIsNullable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISNULLABLE$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsNullable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsNullable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISNULLABLE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsNullable" element
     */
    public boolean isSetIsNullable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISNULLABLE$18) != 0;
        }
    }
    
    /**
     * Sets the "IsNullable" element
     */
    public void setIsNullable(boolean isNullable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISNULLABLE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISNULLABLE$18);
            }
            target.setBooleanValue(isNullable);
        }
    }
    
    /**
     * Sets (as xml) the "IsNullable" element
     */
    public void xsetIsNullable(org.apache.xmlbeans.XmlBoolean isNullable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISNULLABLE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISNULLABLE$18);
            }
            target.set(isNullable);
        }
    }
    
    /**
     * Unsets the "IsNullable" element
     */
    public void unsetIsNullable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISNULLABLE$18, 0);
        }
    }
    
    /**
     * Gets the "IsHidden" element
     */
    public boolean getIsHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISHIDDEN$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsHidden" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISHIDDEN$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsHidden" element
     */
    public boolean isSetIsHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISHIDDEN$20) != 0;
        }
    }
    
    /**
     * Sets the "IsHidden" element
     */
    public void setIsHidden(boolean isHidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISHIDDEN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISHIDDEN$20);
            }
            target.setBooleanValue(isHidden);
        }
    }
    
    /**
     * Sets (as xml) the "IsHidden" element
     */
    public void xsetIsHidden(org.apache.xmlbeans.XmlBoolean isHidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISHIDDEN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISHIDDEN$20);
            }
            target.set(isHidden);
        }
    }
    
    /**
     * Unsets the "IsHidden" element
     */
    public void unsetIsHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISHIDDEN$20, 0);
        }
    }
    
    /**
     * Gets the "IsReadOnly" element
     */
    public boolean getIsReadOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREADONLY$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsReadOnly" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsReadOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREADONLY$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsReadOnly" element
     */
    public boolean isSetIsReadOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISREADONLY$22) != 0;
        }
    }
    
    /**
     * Sets the "IsReadOnly" element
     */
    public void setIsReadOnly(boolean isReadOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREADONLY$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISREADONLY$22);
            }
            target.setBooleanValue(isReadOnly);
        }
    }
    
    /**
     * Sets (as xml) the "IsReadOnly" element
     */
    public void xsetIsReadOnly(org.apache.xmlbeans.XmlBoolean isReadOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREADONLY$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISREADONLY$22);
            }
            target.set(isReadOnly);
        }
    }
    
    /**
     * Unsets the "IsReadOnly" element
     */
    public void unsetIsReadOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISREADONLY$22, 0);
        }
    }
    
    /**
     * Gets the "Inheritable" element
     */
    public boolean getInheritable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INHERITABLE$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Inheritable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetInheritable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INHERITABLE$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "Inheritable" element
     */
    public boolean isSetInheritable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INHERITABLE$24) != 0;
        }
    }
    
    /**
     * Sets the "Inheritable" element
     */
    public void setInheritable(boolean inheritable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INHERITABLE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INHERITABLE$24);
            }
            target.setBooleanValue(inheritable);
        }
    }
    
    /**
     * Sets (as xml) the "Inheritable" element
     */
    public void xsetInheritable(org.apache.xmlbeans.XmlBoolean inheritable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INHERITABLE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INHERITABLE$24);
            }
            target.set(inheritable);
        }
    }
    
    /**
     * Unsets the "Inheritable" element
     */
    public void unsetInheritable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INHERITABLE$24, 0);
        }
    }
    
    /**
     * Gets the "Overridable" element
     */
    public boolean getOverridable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERRIDABLE$26, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Overridable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOverridable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OVERRIDABLE$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "Overridable" element
     */
    public boolean isSetOverridable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERRIDABLE$26) != 0;
        }
    }
    
    /**
     * Sets the "Overridable" element
     */
    public void setOverridable(boolean overridable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERRIDABLE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERRIDABLE$26);
            }
            target.setBooleanValue(overridable);
        }
    }
    
    /**
     * Sets (as xml) the "Overridable" element
     */
    public void xsetOverridable(org.apache.xmlbeans.XmlBoolean overridable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OVERRIDABLE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OVERRIDABLE$26);
            }
            target.set(overridable);
        }
    }
    
    /**
     * Unsets the "Overridable" element
     */
    public void unsetOverridable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERRIDABLE$26, 0);
        }
    }
    
    /**
     * Gets the "MustOverride" element
     */
    public boolean getMustOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUSTOVERRIDE$28, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "MustOverride" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMustOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MUSTOVERRIDE$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "MustOverride" element
     */
    public boolean isSetMustOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MUSTOVERRIDE$28) != 0;
        }
    }
    
    /**
     * Sets the "MustOverride" element
     */
    public void setMustOverride(boolean mustOverride)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUSTOVERRIDE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MUSTOVERRIDE$28);
            }
            target.setBooleanValue(mustOverride);
        }
    }
    
    /**
     * Sets (as xml) the "MustOverride" element
     */
    public void xsetMustOverride(org.apache.xmlbeans.XmlBoolean mustOverride)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MUSTOVERRIDE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MUSTOVERRIDE$28);
            }
            target.set(mustOverride);
        }
    }
    
    /**
     * Unsets the "MustOverride" element
     */
    public void unsetMustOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MUSTOVERRIDE$28, 0);
        }
    }
    
    /**
     * Gets the "OverrideType" element
     */
    public com.exacttarget.wsdl.partnerapi.OverrideType.Enum getOverrideType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERRIDETYPE$30, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.OverrideType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OverrideType" element
     */
    public com.exacttarget.wsdl.partnerapi.OverrideType xgetOverrideType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.OverrideType target = null;
            target = (com.exacttarget.wsdl.partnerapi.OverrideType)get_store().find_element_user(OVERRIDETYPE$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "OverrideType" element
     */
    public boolean isSetOverrideType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERRIDETYPE$30) != 0;
        }
    }
    
    /**
     * Sets the "OverrideType" element
     */
    public void setOverrideType(com.exacttarget.wsdl.partnerapi.OverrideType.Enum overrideType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERRIDETYPE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERRIDETYPE$30);
            }
            target.setEnumValue(overrideType);
        }
    }
    
    /**
     * Sets (as xml) the "OverrideType" element
     */
    public void xsetOverrideType(com.exacttarget.wsdl.partnerapi.OverrideType overrideType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.OverrideType target = null;
            target = (com.exacttarget.wsdl.partnerapi.OverrideType)get_store().find_element_user(OVERRIDETYPE$30, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.OverrideType)get_store().add_element_user(OVERRIDETYPE$30);
            }
            target.set(overrideType);
        }
    }
    
    /**
     * Unsets the "OverrideType" element
     */
    public void unsetOverrideType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERRIDETYPE$30, 0);
        }
    }
    
    /**
     * Gets the "Ordinal" element
     */
    public int getOrdinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDINAL$32, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDINAL$32, 0);
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
            return get_store().count_elements(ORDINAL$32) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDINAL$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDINAL$32);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDINAL$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ORDINAL$32);
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
            get_store().remove_element(ORDINAL$32, 0);
        }
    }
    
    /**
     * Gets array of all "RestrictedValues" elements
     */
    public com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue[] getRestrictedValuesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESTRICTEDVALUES$34, targetList);
            com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue[] result = new com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RestrictedValues" element
     */
    public com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue getRestrictedValuesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue)get_store().find_element_user(RESTRICTEDVALUES$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RestrictedValues" element
     */
    public int sizeOfRestrictedValuesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESTRICTEDVALUES$34);
        }
    }
    
    /**
     * Sets array of all "RestrictedValues" element
     */
    public void setRestrictedValuesArray(com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue[] restrictedValuesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(restrictedValuesArray, RESTRICTEDVALUES$34);
        }
    }
    
    /**
     * Sets ith "RestrictedValues" element
     */
    public void setRestrictedValuesArray(int i, com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue restrictedValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue)get_store().find_element_user(RESTRICTEDVALUES$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(restrictedValues);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RestrictedValues" element
     */
    public com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue insertNewRestrictedValues(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue)get_store().insert_element_user(RESTRICTEDVALUES$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RestrictedValues" element
     */
    public com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue addNewRestrictedValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue)get_store().add_element_user(RESTRICTEDVALUES$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "RestrictedValues" element
     */
    public void removeRestrictedValues(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESTRICTEDVALUES$34, i);
        }
    }
    
    /**
     * Gets the "BaseAttribute" element
     */
    public com.exacttarget.wsdl.partnerapi.ListAttribute getBaseAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttribute target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttribute)get_store().find_element_user(BASEATTRIBUTE$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BaseAttribute" element
     */
    public boolean isSetBaseAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BASEATTRIBUTE$36) != 0;
        }
    }
    
    /**
     * Sets the "BaseAttribute" element
     */
    public void setBaseAttribute(com.exacttarget.wsdl.partnerapi.ListAttribute baseAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttribute target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttribute)get_store().find_element_user(BASEATTRIBUTE$36, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ListAttribute)get_store().add_element_user(BASEATTRIBUTE$36);
            }
            target.set(baseAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "BaseAttribute" element
     */
    public com.exacttarget.wsdl.partnerapi.ListAttribute addNewBaseAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttribute target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttribute)get_store().add_element_user(BASEATTRIBUTE$36);
            return target;
        }
    }
    
    /**
     * Unsets the "BaseAttribute" element
     */
    public void unsetBaseAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BASEATTRIBUTE$36, 0);
        }
    }
}
