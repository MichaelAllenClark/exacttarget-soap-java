/*
 * XML Type:  PropertyDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PropertyDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML PropertyDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class PropertyDefinitionImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.PropertyDefinition
{
    
    public PropertyDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName DATATYPE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DataType");
    private static final javax.xml.namespace.QName VALUETYPE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ValueType");
    private static final javax.xml.namespace.QName PROPERTYTYPE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PropertyType");
    private static final javax.xml.namespace.QName ISCREATABLE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsCreatable");
    private static final javax.xml.namespace.QName ISUPDATABLE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsUpdatable");
    private static final javax.xml.namespace.QName ISRETRIEVABLE$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsRetrievable");
    private static final javax.xml.namespace.QName ISQUERYABLE$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsQueryable");
    private static final javax.xml.namespace.QName ISFILTERABLE$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsFilterable");
    private static final javax.xml.namespace.QName ISPARTNERPROPERTY$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsPartnerProperty");
    private static final javax.xml.namespace.QName ISACCOUNTPROPERTY$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsAccountProperty");
    private static final javax.xml.namespace.QName PARTNERMAP$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PartnerMap");
    private static final javax.xml.namespace.QName ATTRIBUTEMAPS$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AttributeMaps");
    private static final javax.xml.namespace.QName MARKUPS$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Markups");
    private static final javax.xml.namespace.QName PRECISION$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Precision");
    private static final javax.xml.namespace.QName SCALE$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Scale");
    private static final javax.xml.namespace.QName LABEL$32 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Label");
    private static final javax.xml.namespace.QName DESCRIPTION$34 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName DEFAULTVALUE$36 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DefaultValue");
    private static final javax.xml.namespace.QName MINLENGTH$38 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MinLength");
    private static final javax.xml.namespace.QName MAXLENGTH$40 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MaxLength");
    private static final javax.xml.namespace.QName MINVALUE$42 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MinValue");
    private static final javax.xml.namespace.QName MAXVALUE$44 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MaxValue");
    private static final javax.xml.namespace.QName ISREQUIRED$46 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsRequired");
    private static final javax.xml.namespace.QName ISVIEWABLE$48 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsViewable");
    private static final javax.xml.namespace.QName ISEDITABLE$50 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsEditable");
    private static final javax.xml.namespace.QName ISNILLABLE$52 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsNillable");
    private static final javax.xml.namespace.QName ISRESTRICTEDPICKLIST$54 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsRestrictedPicklist");
    private static final javax.xml.namespace.QName PICKLISTITEMS$56 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PicklistItems");
    private static final javax.xml.namespace.QName ISSENDTIME$58 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsSendTime");
    private static final javax.xml.namespace.QName DISPLAYORDER$60 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DisplayOrder");
    private static final javax.xml.namespace.QName REFERENCES$62 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "References");
    private static final javax.xml.namespace.QName RELATIONSHIPNAME$64 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RelationshipName");
    private static final javax.xml.namespace.QName STATUS$66 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Status");
    private static final javax.xml.namespace.QName ISCONTEXTSPECIFIC$68 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsContextSpecific");
    
    
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
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
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
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "DataType" element
     */
    public java.lang.String getDataType()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataType" element
     */
    public org.apache.xmlbeans.XmlString xgetDataType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATATYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataType" element
     */
    public boolean isSetDataType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATATYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "DataType" element
     */
    public void setDataType(java.lang.String dataType)
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
            target.setStringValue(dataType);
        }
    }
    
    /**
     * Sets (as xml) the "DataType" element
     */
    public void xsetDataType(org.apache.xmlbeans.XmlString dataType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATATYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATATYPE$2);
            }
            target.set(dataType);
        }
    }
    
    /**
     * Unsets the "DataType" element
     */
    public void unsetDataType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATATYPE$2, 0);
        }
    }
    
    /**
     * Gets the "ValueType" element
     */
    public com.exacttarget.wsdl.partnerapi.SoapType.Enum getValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUETYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SoapType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValueType" element
     */
    public com.exacttarget.wsdl.partnerapi.SoapType xgetValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SoapType target = null;
            target = (com.exacttarget.wsdl.partnerapi.SoapType)get_store().find_element_user(VALUETYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ValueType" element
     */
    public boolean isSetValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUETYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "ValueType" element
     */
    public void setValueType(com.exacttarget.wsdl.partnerapi.SoapType.Enum valueType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUETYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUETYPE$4);
            }
            target.setEnumValue(valueType);
        }
    }
    
    /**
     * Sets (as xml) the "ValueType" element
     */
    public void xsetValueType(com.exacttarget.wsdl.partnerapi.SoapType valueType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SoapType target = null;
            target = (com.exacttarget.wsdl.partnerapi.SoapType)get_store().find_element_user(VALUETYPE$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SoapType)get_store().add_element_user(VALUETYPE$4);
            }
            target.set(valueType);
        }
    }
    
    /**
     * Unsets the "ValueType" element
     */
    public void unsetValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUETYPE$4, 0);
        }
    }
    
    /**
     * Gets the "PropertyType" element
     */
    public com.exacttarget.wsdl.partnerapi.PropertyType.Enum getPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.PropertyType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertyType" element
     */
    public com.exacttarget.wsdl.partnerapi.PropertyType xgetPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PropertyType target = null;
            target = (com.exacttarget.wsdl.partnerapi.PropertyType)get_store().find_element_user(PROPERTYTYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "PropertyType" element
     */
    public boolean isSetPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTYTYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "PropertyType" element
     */
    public void setPropertyType(com.exacttarget.wsdl.partnerapi.PropertyType.Enum propertyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYTYPE$6);
            }
            target.setEnumValue(propertyType);
        }
    }
    
    /**
     * Sets (as xml) the "PropertyType" element
     */
    public void xsetPropertyType(com.exacttarget.wsdl.partnerapi.PropertyType propertyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PropertyType target = null;
            target = (com.exacttarget.wsdl.partnerapi.PropertyType)get_store().find_element_user(PROPERTYTYPE$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PropertyType)get_store().add_element_user(PROPERTYTYPE$6);
            }
            target.set(propertyType);
        }
    }
    
    /**
     * Unsets the "PropertyType" element
     */
    public void unsetPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTYTYPE$6, 0);
        }
    }
    
    /**
     * Gets the "IsCreatable" element
     */
    public boolean getIsCreatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCREATABLE$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsCreatable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCreatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCREATABLE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsCreatable" element
     */
    public boolean isSetIsCreatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCREATABLE$8) != 0;
        }
    }
    
    /**
     * Sets the "IsCreatable" element
     */
    public void setIsCreatable(boolean isCreatable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCREATABLE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCREATABLE$8);
            }
            target.setBooleanValue(isCreatable);
        }
    }
    
    /**
     * Sets (as xml) the "IsCreatable" element
     */
    public void xsetIsCreatable(org.apache.xmlbeans.XmlBoolean isCreatable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCREATABLE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCREATABLE$8);
            }
            target.set(isCreatable);
        }
    }
    
    /**
     * Unsets the "IsCreatable" element
     */
    public void unsetIsCreatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCREATABLE$8, 0);
        }
    }
    
    /**
     * Gets the "IsUpdatable" element
     */
    public boolean getIsUpdatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISUPDATABLE$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsUpdatable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsUpdatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISUPDATABLE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsUpdatable" element
     */
    public boolean isSetIsUpdatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISUPDATABLE$10) != 0;
        }
    }
    
    /**
     * Sets the "IsUpdatable" element
     */
    public void setIsUpdatable(boolean isUpdatable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISUPDATABLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISUPDATABLE$10);
            }
            target.setBooleanValue(isUpdatable);
        }
    }
    
    /**
     * Sets (as xml) the "IsUpdatable" element
     */
    public void xsetIsUpdatable(org.apache.xmlbeans.XmlBoolean isUpdatable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISUPDATABLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISUPDATABLE$10);
            }
            target.set(isUpdatable);
        }
    }
    
    /**
     * Unsets the "IsUpdatable" element
     */
    public void unsetIsUpdatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISUPDATABLE$10, 0);
        }
    }
    
    /**
     * Gets the "IsRetrievable" element
     */
    public boolean getIsRetrievable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRETRIEVABLE$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsRetrievable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsRetrievable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRETRIEVABLE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsRetrievable" element
     */
    public boolean isSetIsRetrievable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISRETRIEVABLE$12) != 0;
        }
    }
    
    /**
     * Sets the "IsRetrievable" element
     */
    public void setIsRetrievable(boolean isRetrievable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRETRIEVABLE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISRETRIEVABLE$12);
            }
            target.setBooleanValue(isRetrievable);
        }
    }
    
    /**
     * Sets (as xml) the "IsRetrievable" element
     */
    public void xsetIsRetrievable(org.apache.xmlbeans.XmlBoolean isRetrievable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRETRIEVABLE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISRETRIEVABLE$12);
            }
            target.set(isRetrievable);
        }
    }
    
    /**
     * Unsets the "IsRetrievable" element
     */
    public void unsetIsRetrievable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISRETRIEVABLE$12, 0);
        }
    }
    
    /**
     * Gets the "IsQueryable" element
     */
    public boolean getIsQueryable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISQUERYABLE$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsQueryable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsQueryable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISQUERYABLE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsQueryable" element
     */
    public boolean isSetIsQueryable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISQUERYABLE$14) != 0;
        }
    }
    
    /**
     * Sets the "IsQueryable" element
     */
    public void setIsQueryable(boolean isQueryable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISQUERYABLE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISQUERYABLE$14);
            }
            target.setBooleanValue(isQueryable);
        }
    }
    
    /**
     * Sets (as xml) the "IsQueryable" element
     */
    public void xsetIsQueryable(org.apache.xmlbeans.XmlBoolean isQueryable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISQUERYABLE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISQUERYABLE$14);
            }
            target.set(isQueryable);
        }
    }
    
    /**
     * Unsets the "IsQueryable" element
     */
    public void unsetIsQueryable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISQUERYABLE$14, 0);
        }
    }
    
    /**
     * Gets the "IsFilterable" element
     */
    public boolean getIsFilterable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISFILTERABLE$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsFilterable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsFilterable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISFILTERABLE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsFilterable" element
     */
    public boolean isSetIsFilterable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISFILTERABLE$16) != 0;
        }
    }
    
    /**
     * Sets the "IsFilterable" element
     */
    public void setIsFilterable(boolean isFilterable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISFILTERABLE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISFILTERABLE$16);
            }
            target.setBooleanValue(isFilterable);
        }
    }
    
    /**
     * Sets (as xml) the "IsFilterable" element
     */
    public void xsetIsFilterable(org.apache.xmlbeans.XmlBoolean isFilterable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISFILTERABLE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISFILTERABLE$16);
            }
            target.set(isFilterable);
        }
    }
    
    /**
     * Unsets the "IsFilterable" element
     */
    public void unsetIsFilterable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISFILTERABLE$16, 0);
        }
    }
    
    /**
     * Gets the "IsPartnerProperty" element
     */
    public boolean getIsPartnerProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPARTNERPROPERTY$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsPartnerProperty" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPartnerProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPARTNERPROPERTY$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsPartnerProperty" element
     */
    public boolean isSetIsPartnerProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPARTNERPROPERTY$18) != 0;
        }
    }
    
    /**
     * Sets the "IsPartnerProperty" element
     */
    public void setIsPartnerProperty(boolean isPartnerProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPARTNERPROPERTY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPARTNERPROPERTY$18);
            }
            target.setBooleanValue(isPartnerProperty);
        }
    }
    
    /**
     * Sets (as xml) the "IsPartnerProperty" element
     */
    public void xsetIsPartnerProperty(org.apache.xmlbeans.XmlBoolean isPartnerProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPARTNERPROPERTY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPARTNERPROPERTY$18);
            }
            target.set(isPartnerProperty);
        }
    }
    
    /**
     * Unsets the "IsPartnerProperty" element
     */
    public void unsetIsPartnerProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPARTNERPROPERTY$18, 0);
        }
    }
    
    /**
     * Gets the "IsAccountProperty" element
     */
    public boolean getIsAccountProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACCOUNTPROPERTY$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsAccountProperty" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsAccountProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACCOUNTPROPERTY$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsAccountProperty" element
     */
    public boolean isSetIsAccountProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISACCOUNTPROPERTY$20) != 0;
        }
    }
    
    /**
     * Sets the "IsAccountProperty" element
     */
    public void setIsAccountProperty(boolean isAccountProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACCOUNTPROPERTY$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISACCOUNTPROPERTY$20);
            }
            target.setBooleanValue(isAccountProperty);
        }
    }
    
    /**
     * Sets (as xml) the "IsAccountProperty" element
     */
    public void xsetIsAccountProperty(org.apache.xmlbeans.XmlBoolean isAccountProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACCOUNTPROPERTY$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISACCOUNTPROPERTY$20);
            }
            target.set(isAccountProperty);
        }
    }
    
    /**
     * Unsets the "IsAccountProperty" element
     */
    public void unsetIsAccountProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISACCOUNTPROPERTY$20, 0);
        }
    }
    
    /**
     * Gets the "PartnerMap" element
     */
    public java.lang.String getPartnerMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERMAP$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PartnerMap" element
     */
    public org.apache.xmlbeans.XmlString xgetPartnerMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERMAP$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "PartnerMap" element
     */
    public boolean isSetPartnerMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTNERMAP$22) != 0;
        }
    }
    
    /**
     * Sets the "PartnerMap" element
     */
    public void setPartnerMap(java.lang.String partnerMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERMAP$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNERMAP$22);
            }
            target.setStringValue(partnerMap);
        }
    }
    
    /**
     * Sets (as xml) the "PartnerMap" element
     */
    public void xsetPartnerMap(org.apache.xmlbeans.XmlString partnerMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERMAP$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNERMAP$22);
            }
            target.set(partnerMap);
        }
    }
    
    /**
     * Unsets the "PartnerMap" element
     */
    public void unsetPartnerMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTNERMAP$22, 0);
        }
    }
    
    /**
     * Gets array of all "AttributeMaps" elements
     */
    public com.exacttarget.wsdl.partnerapi.AttributeMap[] getAttributeMapsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTEMAPS$24, targetList);
            com.exacttarget.wsdl.partnerapi.AttributeMap[] result = new com.exacttarget.wsdl.partnerapi.AttributeMap[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttributeMaps" element
     */
    public com.exacttarget.wsdl.partnerapi.AttributeMap getAttributeMapsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AttributeMap target = null;
            target = (com.exacttarget.wsdl.partnerapi.AttributeMap)get_store().find_element_user(ATTRIBUTEMAPS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttributeMaps" element
     */
    public int sizeOfAttributeMapsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEMAPS$24);
        }
    }
    
    /**
     * Sets array of all "AttributeMaps" element
     */
    public void setAttributeMapsArray(com.exacttarget.wsdl.partnerapi.AttributeMap[] attributeMapsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeMapsArray, ATTRIBUTEMAPS$24);
        }
    }
    
    /**
     * Sets ith "AttributeMaps" element
     */
    public void setAttributeMapsArray(int i, com.exacttarget.wsdl.partnerapi.AttributeMap attributeMaps)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AttributeMap target = null;
            target = (com.exacttarget.wsdl.partnerapi.AttributeMap)get_store().find_element_user(ATTRIBUTEMAPS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributeMaps);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeMaps" element
     */
    public com.exacttarget.wsdl.partnerapi.AttributeMap insertNewAttributeMaps(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AttributeMap target = null;
            target = (com.exacttarget.wsdl.partnerapi.AttributeMap)get_store().insert_element_user(ATTRIBUTEMAPS$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeMaps" element
     */
    public com.exacttarget.wsdl.partnerapi.AttributeMap addNewAttributeMaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AttributeMap target = null;
            target = (com.exacttarget.wsdl.partnerapi.AttributeMap)get_store().add_element_user(ATTRIBUTEMAPS$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttributeMaps" element
     */
    public void removeAttributeMaps(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEMAPS$24, i);
        }
    }
    
    /**
     * Gets array of all "Markups" elements
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty[] getMarkupsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MARKUPS$26, targetList);
            com.exacttarget.wsdl.partnerapi.APIProperty[] result = new com.exacttarget.wsdl.partnerapi.APIProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Markups" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty getMarkupsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(MARKUPS$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Markups" element
     */
    public int sizeOfMarkupsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARKUPS$26);
        }
    }
    
    /**
     * Sets array of all "Markups" element
     */
    public void setMarkupsArray(com.exacttarget.wsdl.partnerapi.APIProperty[] markupsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(markupsArray, MARKUPS$26);
        }
    }
    
    /**
     * Sets ith "Markups" element
     */
    public void setMarkupsArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty markups)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(MARKUPS$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(markups);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Markups" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty insertNewMarkups(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().insert_element_user(MARKUPS$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Markups" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty addNewMarkups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().add_element_user(MARKUPS$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "Markups" element
     */
    public void removeMarkups(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARKUPS$26, i);
        }
    }
    
    /**
     * Gets the "Precision" element
     */
    public int getPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECISION$28, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Precision" element
     */
    public org.apache.xmlbeans.XmlInt xgetPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRECISION$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "Precision" element
     */
    public boolean isSetPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRECISION$28) != 0;
        }
    }
    
    /**
     * Sets the "Precision" element
     */
    public void setPrecision(int precision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECISION$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECISION$28);
            }
            target.setIntValue(precision);
        }
    }
    
    /**
     * Sets (as xml) the "Precision" element
     */
    public void xsetPrecision(org.apache.xmlbeans.XmlInt precision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRECISION$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRECISION$28);
            }
            target.set(precision);
        }
    }
    
    /**
     * Unsets the "Precision" element
     */
    public void unsetPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRECISION$28, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALE$30, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SCALE$30, 0);
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
            return get_store().count_elements(SCALE$30) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCALE$30);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SCALE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SCALE$30);
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
            get_store().remove_element(SCALE$30, 0);
        }
    }
    
    /**
     * Gets the "Label" element
     */
    public java.lang.String getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABEL$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Label" element
     */
    public org.apache.xmlbeans.XmlString xgetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABEL$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "Label" element
     */
    public boolean isSetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LABEL$32) != 0;
        }
    }
    
    /**
     * Sets the "Label" element
     */
    public void setLabel(java.lang.String label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABEL$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABEL$32);
            }
            target.setStringValue(label);
        }
    }
    
    /**
     * Sets (as xml) the "Label" element
     */
    public void xsetLabel(org.apache.xmlbeans.XmlString label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABEL$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LABEL$32);
            }
            target.set(label);
        }
    }
    
    /**
     * Unsets the "Label" element
     */
    public void unsetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LABEL$32, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$34, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$34, 0);
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
            return get_store().count_elements(DESCRIPTION$34) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$34);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$34);
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
            get_store().remove_element(DESCRIPTION$34, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$36, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$36, 0);
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
            return get_store().count_elements(DEFAULTVALUE$36) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTVALUE$36);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTVALUE$36);
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
            get_store().remove_element(DEFAULTVALUE$36, 0);
        }
    }
    
    /**
     * Gets the "MinLength" element
     */
    public int getMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINLENGTH$38, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinLength" element
     */
    public org.apache.xmlbeans.XmlInt xgetMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINLENGTH$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "MinLength" element
     */
    public boolean isSetMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINLENGTH$38) != 0;
        }
    }
    
    /**
     * Sets the "MinLength" element
     */
    public void setMinLength(int minLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINLENGTH$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINLENGTH$38);
            }
            target.setIntValue(minLength);
        }
    }
    
    /**
     * Sets (as xml) the "MinLength" element
     */
    public void xsetMinLength(org.apache.xmlbeans.XmlInt minLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINLENGTH$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINLENGTH$38);
            }
            target.set(minLength);
        }
    }
    
    /**
     * Unsets the "MinLength" element
     */
    public void unsetMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINLENGTH$38, 0);
        }
    }
    
    /**
     * Gets the "MaxLength" element
     */
    public int getMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLENGTH$40, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxLength" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXLENGTH$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxLength" element
     */
    public boolean isSetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXLENGTH$40) != 0;
        }
    }
    
    /**
     * Sets the "MaxLength" element
     */
    public void setMaxLength(int maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLENGTH$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXLENGTH$40);
            }
            target.setIntValue(maxLength);
        }
    }
    
    /**
     * Sets (as xml) the "MaxLength" element
     */
    public void xsetMaxLength(org.apache.xmlbeans.XmlInt maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXLENGTH$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXLENGTH$40);
            }
            target.set(maxLength);
        }
    }
    
    /**
     * Unsets the "MaxLength" element
     */
    public void unsetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXLENGTH$40, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINVALUE$42, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINVALUE$42, 0);
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
            return get_store().count_elements(MINVALUE$42) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINVALUE$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINVALUE$42);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINVALUE$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MINVALUE$42);
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
            get_store().remove_element(MINVALUE$42, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXVALUE$44, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXVALUE$44, 0);
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
            return get_store().count_elements(MAXVALUE$44) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXVALUE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXVALUE$44);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXVALUE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAXVALUE$44);
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
            get_store().remove_element(MAXVALUE$44, 0);
        }
    }
    
    /**
     * Gets the "IsRequired" element
     */
    public boolean getIsRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREQUIRED$46, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsRequired" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREQUIRED$46, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsRequired" element
     */
    public boolean isSetIsRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISREQUIRED$46) != 0;
        }
    }
    
    /**
     * Sets the "IsRequired" element
     */
    public void setIsRequired(boolean isRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREQUIRED$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISREQUIRED$46);
            }
            target.setBooleanValue(isRequired);
        }
    }
    
    /**
     * Sets (as xml) the "IsRequired" element
     */
    public void xsetIsRequired(org.apache.xmlbeans.XmlBoolean isRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREQUIRED$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISREQUIRED$46);
            }
            target.set(isRequired);
        }
    }
    
    /**
     * Unsets the "IsRequired" element
     */
    public void unsetIsRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISREQUIRED$46, 0);
        }
    }
    
    /**
     * Gets the "IsViewable" element
     */
    public boolean getIsViewable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVIEWABLE$48, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsViewable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsViewable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVIEWABLE$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsViewable" element
     */
    public boolean isSetIsViewable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISVIEWABLE$48) != 0;
        }
    }
    
    /**
     * Sets the "IsViewable" element
     */
    public void setIsViewable(boolean isViewable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVIEWABLE$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISVIEWABLE$48);
            }
            target.setBooleanValue(isViewable);
        }
    }
    
    /**
     * Sets (as xml) the "IsViewable" element
     */
    public void xsetIsViewable(org.apache.xmlbeans.XmlBoolean isViewable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVIEWABLE$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISVIEWABLE$48);
            }
            target.set(isViewable);
        }
    }
    
    /**
     * Unsets the "IsViewable" element
     */
    public void unsetIsViewable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISVIEWABLE$48, 0);
        }
    }
    
    /**
     * Gets the "IsEditable" element
     */
    public boolean getIsEditable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISEDITABLE$50, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsEditable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsEditable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISEDITABLE$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsEditable" element
     */
    public boolean isSetIsEditable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISEDITABLE$50) != 0;
        }
    }
    
    /**
     * Sets the "IsEditable" element
     */
    public void setIsEditable(boolean isEditable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISEDITABLE$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISEDITABLE$50);
            }
            target.setBooleanValue(isEditable);
        }
    }
    
    /**
     * Sets (as xml) the "IsEditable" element
     */
    public void xsetIsEditable(org.apache.xmlbeans.XmlBoolean isEditable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISEDITABLE$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISEDITABLE$50);
            }
            target.set(isEditable);
        }
    }
    
    /**
     * Unsets the "IsEditable" element
     */
    public void unsetIsEditable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISEDITABLE$50, 0);
        }
    }
    
    /**
     * Gets the "IsNillable" element
     */
    public boolean getIsNillable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISNILLABLE$52, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsNillable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsNillable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISNILLABLE$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsNillable" element
     */
    public boolean isSetIsNillable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISNILLABLE$52) != 0;
        }
    }
    
    /**
     * Sets the "IsNillable" element
     */
    public void setIsNillable(boolean isNillable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISNILLABLE$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISNILLABLE$52);
            }
            target.setBooleanValue(isNillable);
        }
    }
    
    /**
     * Sets (as xml) the "IsNillable" element
     */
    public void xsetIsNillable(org.apache.xmlbeans.XmlBoolean isNillable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISNILLABLE$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISNILLABLE$52);
            }
            target.set(isNillable);
        }
    }
    
    /**
     * Unsets the "IsNillable" element
     */
    public void unsetIsNillable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISNILLABLE$52, 0);
        }
    }
    
    /**
     * Gets the "IsRestrictedPicklist" element
     */
    public boolean getIsRestrictedPicklist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRESTRICTEDPICKLIST$54, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsRestrictedPicklist" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsRestrictedPicklist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRESTRICTEDPICKLIST$54, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsRestrictedPicklist" element
     */
    public boolean isSetIsRestrictedPicklist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISRESTRICTEDPICKLIST$54) != 0;
        }
    }
    
    /**
     * Sets the "IsRestrictedPicklist" element
     */
    public void setIsRestrictedPicklist(boolean isRestrictedPicklist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRESTRICTEDPICKLIST$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISRESTRICTEDPICKLIST$54);
            }
            target.setBooleanValue(isRestrictedPicklist);
        }
    }
    
    /**
     * Sets (as xml) the "IsRestrictedPicklist" element
     */
    public void xsetIsRestrictedPicklist(org.apache.xmlbeans.XmlBoolean isRestrictedPicklist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRESTRICTEDPICKLIST$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISRESTRICTEDPICKLIST$54);
            }
            target.set(isRestrictedPicklist);
        }
    }
    
    /**
     * Unsets the "IsRestrictedPicklist" element
     */
    public void unsetIsRestrictedPicklist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISRESTRICTEDPICKLIST$54, 0);
        }
    }
    
    /**
     * Gets the "PicklistItems" element
     */
    public com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems getPicklistItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems target = null;
            target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems)get_store().find_element_user(PICKLISTITEMS$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PicklistItems" element
     */
    public boolean isSetPicklistItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PICKLISTITEMS$56) != 0;
        }
    }
    
    /**
     * Sets the "PicklistItems" element
     */
    public void setPicklistItems(com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems picklistItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems target = null;
            target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems)get_store().find_element_user(PICKLISTITEMS$56, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems)get_store().add_element_user(PICKLISTITEMS$56);
            }
            target.set(picklistItems);
        }
    }
    
    /**
     * Appends and returns a new empty "PicklistItems" element
     */
    public com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems addNewPicklistItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems target = null;
            target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems)get_store().add_element_user(PICKLISTITEMS$56);
            return target;
        }
    }
    
    /**
     * Unsets the "PicklistItems" element
     */
    public void unsetPicklistItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PICKLISTITEMS$56, 0);
        }
    }
    
    /**
     * Gets the "IsSendTime" element
     */
    public boolean getIsSendTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSENDTIME$58, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsSendTime" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsSendTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSENDTIME$58, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsSendTime" element
     */
    public boolean isSetIsSendTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSENDTIME$58) != 0;
        }
    }
    
    /**
     * Sets the "IsSendTime" element
     */
    public void setIsSendTime(boolean isSendTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSENDTIME$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSENDTIME$58);
            }
            target.setBooleanValue(isSendTime);
        }
    }
    
    /**
     * Sets (as xml) the "IsSendTime" element
     */
    public void xsetIsSendTime(org.apache.xmlbeans.XmlBoolean isSendTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSENDTIME$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSENDTIME$58);
            }
            target.set(isSendTime);
        }
    }
    
    /**
     * Unsets the "IsSendTime" element
     */
    public void unsetIsSendTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSENDTIME$58, 0);
        }
    }
    
    /**
     * Gets the "DisplayOrder" element
     */
    public int getDisplayOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYORDER$60, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DisplayOrder" element
     */
    public org.apache.xmlbeans.XmlInt xgetDisplayOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DISPLAYORDER$60, 0);
            return target;
        }
    }
    
    /**
     * True if has "DisplayOrder" element
     */
    public boolean isSetDisplayOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYORDER$60) != 0;
        }
    }
    
    /**
     * Sets the "DisplayOrder" element
     */
    public void setDisplayOrder(int displayOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYORDER$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYORDER$60);
            }
            target.setIntValue(displayOrder);
        }
    }
    
    /**
     * Sets (as xml) the "DisplayOrder" element
     */
    public void xsetDisplayOrder(org.apache.xmlbeans.XmlInt displayOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DISPLAYORDER$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DISPLAYORDER$60);
            }
            target.set(displayOrder);
        }
    }
    
    /**
     * Unsets the "DisplayOrder" element
     */
    public void unsetDisplayOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYORDER$60, 0);
        }
    }
    
    /**
     * Gets the "References" element
     */
    public com.exacttarget.wsdl.partnerapi.PropertyDefinition.References getReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PropertyDefinition.References target = null;
            target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition.References)get_store().find_element_user(REFERENCES$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "References" element
     */
    public boolean isSetReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCES$62) != 0;
        }
    }
    
    /**
     * Sets the "References" element
     */
    public void setReferences(com.exacttarget.wsdl.partnerapi.PropertyDefinition.References references)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PropertyDefinition.References target = null;
            target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition.References)get_store().find_element_user(REFERENCES$62, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition.References)get_store().add_element_user(REFERENCES$62);
            }
            target.set(references);
        }
    }
    
    /**
     * Appends and returns a new empty "References" element
     */
    public com.exacttarget.wsdl.partnerapi.PropertyDefinition.References addNewReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PropertyDefinition.References target = null;
            target = (com.exacttarget.wsdl.partnerapi.PropertyDefinition.References)get_store().add_element_user(REFERENCES$62);
            return target;
        }
    }
    
    /**
     * Unsets the "References" element
     */
    public void unsetReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCES$62, 0);
        }
    }
    
    /**
     * Gets the "RelationshipName" element
     */
    public java.lang.String getRelationshipName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPNAME$64, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RelationshipName" element
     */
    public org.apache.xmlbeans.XmlString xgetRelationshipName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONSHIPNAME$64, 0);
            return target;
        }
    }
    
    /**
     * True if has "RelationshipName" element
     */
    public boolean isSetRelationshipName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONSHIPNAME$64) != 0;
        }
    }
    
    /**
     * Sets the "RelationshipName" element
     */
    public void setRelationshipName(java.lang.String relationshipName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPNAME$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONSHIPNAME$64);
            }
            target.setStringValue(relationshipName);
        }
    }
    
    /**
     * Sets (as xml) the "RelationshipName" element
     */
    public void xsetRelationshipName(org.apache.xmlbeans.XmlString relationshipName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONSHIPNAME$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIONSHIPNAME$64);
            }
            target.set(relationshipName);
        }
    }
    
    /**
     * Unsets the "RelationshipName" element
     */
    public void unsetRelationshipName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONSHIPNAME$64, 0);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$66, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$66, 0);
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$66) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$66);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$66);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$66, 0);
        }
    }
    
    /**
     * Gets the "IsContextSpecific" element
     */
    public boolean getIsContextSpecific()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCONTEXTSPECIFIC$68, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsContextSpecific" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsContextSpecific()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCONTEXTSPECIFIC$68, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsContextSpecific" element
     */
    public boolean isSetIsContextSpecific()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCONTEXTSPECIFIC$68) != 0;
        }
    }
    
    /**
     * Sets the "IsContextSpecific" element
     */
    public void setIsContextSpecific(boolean isContextSpecific)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCONTEXTSPECIFIC$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCONTEXTSPECIFIC$68);
            }
            target.setBooleanValue(isContextSpecific);
        }
    }
    
    /**
     * Sets (as xml) the "IsContextSpecific" element
     */
    public void xsetIsContextSpecific(org.apache.xmlbeans.XmlBoolean isContextSpecific)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCONTEXTSPECIFIC$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCONTEXTSPECIFIC$68);
            }
            target.set(isContextSpecific);
        }
    }
    
    /**
     * Unsets the "IsContextSpecific" element
     */
    public void unsetIsContextSpecific()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCONTEXTSPECIFIC$68, 0);
        }
    }
    /**
     * An XML PicklistItems(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class PicklistItemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems
    {
        
        public PicklistItemsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PICKLISTITEM$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PicklistItem");
        
        
        /**
         * Gets array of all "PicklistItem" elements
         */
        public com.exacttarget.wsdl.partnerapi.PicklistItem[] getPicklistItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PICKLISTITEM$0, targetList);
                com.exacttarget.wsdl.partnerapi.PicklistItem[] result = new com.exacttarget.wsdl.partnerapi.PicklistItem[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PicklistItem" element
         */
        public com.exacttarget.wsdl.partnerapi.PicklistItem getPicklistItemArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PicklistItem target = null;
                target = (com.exacttarget.wsdl.partnerapi.PicklistItem)get_store().find_element_user(PICKLISTITEM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PicklistItem" element
         */
        public int sizeOfPicklistItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PICKLISTITEM$0);
            }
        }
        
        /**
         * Sets array of all "PicklistItem" element
         */
        public void setPicklistItemArray(com.exacttarget.wsdl.partnerapi.PicklistItem[] picklistItemArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(picklistItemArray, PICKLISTITEM$0);
            }
        }
        
        /**
         * Sets ith "PicklistItem" element
         */
        public void setPicklistItemArray(int i, com.exacttarget.wsdl.partnerapi.PicklistItem picklistItem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PicklistItem target = null;
                target = (com.exacttarget.wsdl.partnerapi.PicklistItem)get_store().find_element_user(PICKLISTITEM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(picklistItem);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PicklistItem" element
         */
        public com.exacttarget.wsdl.partnerapi.PicklistItem insertNewPicklistItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PicklistItem target = null;
                target = (com.exacttarget.wsdl.partnerapi.PicklistItem)get_store().insert_element_user(PICKLISTITEM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PicklistItem" element
         */
        public com.exacttarget.wsdl.partnerapi.PicklistItem addNewPicklistItem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PicklistItem target = null;
                target = (com.exacttarget.wsdl.partnerapi.PicklistItem)get_store().add_element_user(PICKLISTITEM$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "PicklistItem" element
         */
        public void removePicklistItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PICKLISTITEM$0, i);
            }
        }
    }
    /**
     * An XML References(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ReferencesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PropertyDefinition.References
    {
        
        public ReferencesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REFERENCE$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Reference");
        
        
        /**
         * Gets array of all "Reference" elements
         */
        public com.exacttarget.wsdl.partnerapi.APIObject[] getReferenceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REFERENCE$0, targetList);
                com.exacttarget.wsdl.partnerapi.APIObject[] result = new com.exacttarget.wsdl.partnerapi.APIObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Reference" element
         */
        public com.exacttarget.wsdl.partnerapi.APIObject getReferenceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIObject target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(REFERENCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Reference" element
         */
        public int sizeOfReferenceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REFERENCE$0);
            }
        }
        
        /**
         * Sets array of all "Reference" element
         */
        public void setReferenceArray(com.exacttarget.wsdl.partnerapi.APIObject[] referenceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(referenceArray, REFERENCE$0);
            }
        }
        
        /**
         * Sets ith "Reference" element
         */
        public void setReferenceArray(int i, com.exacttarget.wsdl.partnerapi.APIObject reference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIObject target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(REFERENCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(reference);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Reference" element
         */
        public com.exacttarget.wsdl.partnerapi.APIObject insertNewReference(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIObject target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().insert_element_user(REFERENCE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Reference" element
         */
        public com.exacttarget.wsdl.partnerapi.APIObject addNewReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIObject target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(REFERENCE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Reference" element
         */
        public void removeReference(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REFERENCE$0, i);
            }
        }
    }
}
