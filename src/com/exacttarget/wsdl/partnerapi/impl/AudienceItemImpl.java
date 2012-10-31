/*
 * XML Type:  AudienceItem
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.AudienceItem
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML AudienceItem(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class AudienceItemImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.AudienceItem
{
    
    public AudienceItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIST$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "List");
    private static final javax.xml.namespace.QName SENDDEFINITIONLISTTYPE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendDefinitionListType");
    private static final javax.xml.namespace.QName CUSTOMOBJECTID$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CustomObjectID");
    private static final javax.xml.namespace.QName DATASOURCETYPEID$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DataSourceTypeID");
    
    
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
     * Gets the "SendDefinitionListType" element
     */
    public com.exacttarget.wsdl.partnerapi.SendDefinitionListTypeEnum.Enum getSendDefinitionListType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDDEFINITIONLISTTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SendDefinitionListTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendDefinitionListType" element
     */
    public com.exacttarget.wsdl.partnerapi.SendDefinitionListTypeEnum xgetSendDefinitionListType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinitionListTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinitionListTypeEnum)get_store().find_element_user(SENDDEFINITIONLISTTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendDefinitionListType" element
     */
    public boolean isSetSendDefinitionListType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDDEFINITIONLISTTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "SendDefinitionListType" element
     */
    public void setSendDefinitionListType(com.exacttarget.wsdl.partnerapi.SendDefinitionListTypeEnum.Enum sendDefinitionListType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDDEFINITIONLISTTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDDEFINITIONLISTTYPE$2);
            }
            target.setEnumValue(sendDefinitionListType);
        }
    }
    
    /**
     * Sets (as xml) the "SendDefinitionListType" element
     */
    public void xsetSendDefinitionListType(com.exacttarget.wsdl.partnerapi.SendDefinitionListTypeEnum sendDefinitionListType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinitionListTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinitionListTypeEnum)get_store().find_element_user(SENDDEFINITIONLISTTYPE$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SendDefinitionListTypeEnum)get_store().add_element_user(SENDDEFINITIONLISTTYPE$2);
            }
            target.set(sendDefinitionListType);
        }
    }
    
    /**
     * Unsets the "SendDefinitionListType" element
     */
    public void unsetSendDefinitionListType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDDEFINITIONLISTTYPE$2, 0);
        }
    }
    
    /**
     * Gets the "CustomObjectID" element
     */
    public java.lang.String getCustomObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMOBJECTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomObjectID" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMOBJECTID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CustomObjectID" element
     */
    public boolean isSetCustomObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMOBJECTID$4) != 0;
        }
    }
    
    /**
     * Sets the "CustomObjectID" element
     */
    public void setCustomObjectID(java.lang.String customObjectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMOBJECTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMOBJECTID$4);
            }
            target.setStringValue(customObjectID);
        }
    }
    
    /**
     * Sets (as xml) the "CustomObjectID" element
     */
    public void xsetCustomObjectID(org.apache.xmlbeans.XmlString customObjectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMOBJECTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMOBJECTID$4);
            }
            target.set(customObjectID);
        }
    }
    
    /**
     * Unsets the "CustomObjectID" element
     */
    public void unsetCustomObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMOBJECTID$4, 0);
        }
    }
    
    /**
     * Gets the "DataSourceTypeID" element
     */
    public com.exacttarget.wsdl.partnerapi.DataSourceTypeEnum.Enum getDataSourceTypeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASOURCETYPEID$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.DataSourceTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataSourceTypeID" element
     */
    public com.exacttarget.wsdl.partnerapi.DataSourceTypeEnum xgetDataSourceTypeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataSourceTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataSourceTypeEnum)get_store().find_element_user(DATASOURCETYPEID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataSourceTypeID" element
     */
    public boolean isSetDataSourceTypeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASOURCETYPEID$6) != 0;
        }
    }
    
    /**
     * Sets the "DataSourceTypeID" element
     */
    public void setDataSourceTypeID(com.exacttarget.wsdl.partnerapi.DataSourceTypeEnum.Enum dataSourceTypeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASOURCETYPEID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASOURCETYPEID$6);
            }
            target.setEnumValue(dataSourceTypeID);
        }
    }
    
    /**
     * Sets (as xml) the "DataSourceTypeID" element
     */
    public void xsetDataSourceTypeID(com.exacttarget.wsdl.partnerapi.DataSourceTypeEnum dataSourceTypeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataSourceTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataSourceTypeEnum)get_store().find_element_user(DATASOURCETYPEID$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DataSourceTypeEnum)get_store().add_element_user(DATASOURCETYPEID$6);
            }
            target.set(dataSourceTypeID);
        }
    }
    
    /**
     * Unsets the "DataSourceTypeID" element
     */
    public void unsetDataSourceTypeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASOURCETYPEID$6, 0);
        }
    }
}
