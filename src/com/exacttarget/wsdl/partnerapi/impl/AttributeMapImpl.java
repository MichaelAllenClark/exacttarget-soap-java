/*
 * XML Type:  AttributeMap
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.AttributeMap
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML AttributeMap(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class AttributeMapImpl extends com.exacttarget.wsdl.partnerapi.impl.APIPropertyImpl implements com.exacttarget.wsdl.partnerapi.AttributeMap
{
    
    public AttributeMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYNAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EntityName");
    private static final javax.xml.namespace.QName COLUMNNAME$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ColumnName");
    private static final javax.xml.namespace.QName COLUMNNAMEMAPPEDTO$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ColumnNameMappedTo");
    private static final javax.xml.namespace.QName ENTITYNAMEMAPPEDTO$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EntityNameMappedTo");
    private static final javax.xml.namespace.QName ADDITIONALDATA$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AdditionalData");
    
    
    /**
     * Gets the "EntityName" element
     */
    public java.lang.String getEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "EntityName" element
     */
    public boolean isSetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "EntityName" element
     */
    public void setEntityName(java.lang.String entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYNAME$0);
            }
            target.setStringValue(entityName);
        }
    }
    
    /**
     * Sets (as xml) the "EntityName" element
     */
    public void xsetEntityName(org.apache.xmlbeans.XmlString entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$0);
            }
            target.set(entityName);
        }
    }
    
    /**
     * Unsets the "EntityName" element
     */
    public void unsetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYNAME$0, 0);
        }
    }
    
    /**
     * Gets the "ColumnName" element
     */
    public java.lang.String getColumnName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ColumnName" element
     */
    public org.apache.xmlbeans.XmlString xgetColumnName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ColumnName" element
     */
    public boolean isSetColumnName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMNNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "ColumnName" element
     */
    public void setColumnName(java.lang.String columnName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNNAME$2);
            }
            target.setStringValue(columnName);
        }
    }
    
    /**
     * Sets (as xml) the "ColumnName" element
     */
    public void xsetColumnName(org.apache.xmlbeans.XmlString columnName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLUMNNAME$2);
            }
            target.set(columnName);
        }
    }
    
    /**
     * Unsets the "ColumnName" element
     */
    public void unsetColumnName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMNNAME$2, 0);
        }
    }
    
    /**
     * Gets the "ColumnNameMappedTo" element
     */
    public java.lang.String getColumnNameMappedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNNAMEMAPPEDTO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ColumnNameMappedTo" element
     */
    public org.apache.xmlbeans.XmlString xgetColumnNameMappedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNNAMEMAPPEDTO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ColumnNameMappedTo" element
     */
    public boolean isSetColumnNameMappedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMNNAMEMAPPEDTO$4) != 0;
        }
    }
    
    /**
     * Sets the "ColumnNameMappedTo" element
     */
    public void setColumnNameMappedTo(java.lang.String columnNameMappedTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNNAMEMAPPEDTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNNAMEMAPPEDTO$4);
            }
            target.setStringValue(columnNameMappedTo);
        }
    }
    
    /**
     * Sets (as xml) the "ColumnNameMappedTo" element
     */
    public void xsetColumnNameMappedTo(org.apache.xmlbeans.XmlString columnNameMappedTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNNAMEMAPPEDTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLUMNNAMEMAPPEDTO$4);
            }
            target.set(columnNameMappedTo);
        }
    }
    
    /**
     * Unsets the "ColumnNameMappedTo" element
     */
    public void unsetColumnNameMappedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMNNAMEMAPPEDTO$4, 0);
        }
    }
    
    /**
     * Gets the "EntityNameMappedTo" element
     */
    public java.lang.String getEntityNameMappedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAMEMAPPEDTO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityNameMappedTo" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityNameMappedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAMEMAPPEDTO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "EntityNameMappedTo" element
     */
    public boolean isSetEntityNameMappedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYNAMEMAPPEDTO$6) != 0;
        }
    }
    
    /**
     * Sets the "EntityNameMappedTo" element
     */
    public void setEntityNameMappedTo(java.lang.String entityNameMappedTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAMEMAPPEDTO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYNAMEMAPPEDTO$6);
            }
            target.setStringValue(entityNameMappedTo);
        }
    }
    
    /**
     * Sets (as xml) the "EntityNameMappedTo" element
     */
    public void xsetEntityNameMappedTo(org.apache.xmlbeans.XmlString entityNameMappedTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAMEMAPPEDTO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAMEMAPPEDTO$6);
            }
            target.set(entityNameMappedTo);
        }
    }
    
    /**
     * Unsets the "EntityNameMappedTo" element
     */
    public void unsetEntityNameMappedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYNAMEMAPPEDTO$6, 0);
        }
    }
    
    /**
     * Gets array of all "AdditionalData" elements
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty[] getAdditionalDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDITIONALDATA$8, targetList);
            com.exacttarget.wsdl.partnerapi.APIProperty[] result = new com.exacttarget.wsdl.partnerapi.APIProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AdditionalData" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty getAdditionalDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(ADDITIONALDATA$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AdditionalData" element
     */
    public int sizeOfAdditionalDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALDATA$8);
        }
    }
    
    /**
     * Sets array of all "AdditionalData" element
     */
    public void setAdditionalDataArray(com.exacttarget.wsdl.partnerapi.APIProperty[] additionalDataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(additionalDataArray, ADDITIONALDATA$8);
        }
    }
    
    /**
     * Sets ith "AdditionalData" element
     */
    public void setAdditionalDataArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty additionalData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(ADDITIONALDATA$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(additionalData);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AdditionalData" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty insertNewAdditionalData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().insert_element_user(ADDITIONALDATA$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AdditionalData" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty addNewAdditionalData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().add_element_user(ADDITIONALDATA$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "AdditionalData" element
     */
    public void removeAdditionalData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALDATA$8, i);
        }
    }
}
