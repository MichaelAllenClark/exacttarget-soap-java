/*
 * XML Type:  DataExtension
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DataExtension
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML DataExtension(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class DataExtensionImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.DataExtension
{
    
    public DataExtensionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName ISSENDABLE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsSendable");
    private static final javax.xml.namespace.QName ISTESTABLE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsTestable");
    private static final javax.xml.namespace.QName SENDABLEDATAEXTENSIONFIELD$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendableDataExtensionField");
    private static final javax.xml.namespace.QName SENDABLESUBSCRIBERFIELD$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendableSubscriberField");
    private static final javax.xml.namespace.QName TEMPLATE$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Template");
    private static final javax.xml.namespace.QName DATARETENTIONPERIODLENGTH$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DataRetentionPeriodLength");
    private static final javax.xml.namespace.QName DATARETENTIONPERIODUNITOFMEASURE$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DataRetentionPeriodUnitOfMeasure");
    private static final javax.xml.namespace.QName ROWBASEDRETENTION$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RowBasedRetention");
    private static final javax.xml.namespace.QName RESETRETENTIONPERIODONIMPORT$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ResetRetentionPeriodOnImport");
    private static final javax.xml.namespace.QName DELETEATENDOFRETENTIONPERIOD$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DeleteAtEndOfRetentionPeriod");
    private static final javax.xml.namespace.QName RETAINUNTIL$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RetainUntil");
    private static final javax.xml.namespace.QName FIELDS$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Fields");
    private static final javax.xml.namespace.QName DATARETENTIONPERIOD$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DataRetentionPeriod");
    private static final javax.xml.namespace.QName CATEGORYID$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CategoryID");
    private static final javax.xml.namespace.QName STATUS$32 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Status");
    
    
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
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
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
            return get_store().count_elements(DESCRIPTION$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
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
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "IsSendable" element
     */
    public boolean getIsSendable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSENDABLE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsSendable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsSendable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSENDABLE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsSendable" element
     */
    public boolean isSetIsSendable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSENDABLE$4) != 0;
        }
    }
    
    /**
     * Sets the "IsSendable" element
     */
    public void setIsSendable(boolean isSendable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSENDABLE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSENDABLE$4);
            }
            target.setBooleanValue(isSendable);
        }
    }
    
    /**
     * Sets (as xml) the "IsSendable" element
     */
    public void xsetIsSendable(org.apache.xmlbeans.XmlBoolean isSendable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSENDABLE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSENDABLE$4);
            }
            target.set(isSendable);
        }
    }
    
    /**
     * Unsets the "IsSendable" element
     */
    public void unsetIsSendable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSENDABLE$4, 0);
        }
    }
    
    /**
     * Gets the "IsTestable" element
     */
    public boolean getIsTestable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTESTABLE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsTestable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsTestable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISTESTABLE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsTestable" element
     */
    public boolean isSetIsTestable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISTESTABLE$6) != 0;
        }
    }
    
    /**
     * Sets the "IsTestable" element
     */
    public void setIsTestable(boolean isTestable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTESTABLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISTESTABLE$6);
            }
            target.setBooleanValue(isTestable);
        }
    }
    
    /**
     * Sets (as xml) the "IsTestable" element
     */
    public void xsetIsTestable(org.apache.xmlbeans.XmlBoolean isTestable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISTESTABLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISTESTABLE$6);
            }
            target.set(isTestable);
        }
    }
    
    /**
     * Unsets the "IsTestable" element
     */
    public void unsetIsTestable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISTESTABLE$6, 0);
        }
    }
    
    /**
     * Gets the "SendableDataExtensionField" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionField getSendableDataExtensionField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionField target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionField)get_store().find_element_user(SENDABLEDATAEXTENSIONFIELD$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SendableDataExtensionField" element
     */
    public boolean isSetSendableDataExtensionField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDABLEDATAEXTENSIONFIELD$8) != 0;
        }
    }
    
    /**
     * Sets the "SendableDataExtensionField" element
     */
    public void setSendableDataExtensionField(com.exacttarget.wsdl.partnerapi.DataExtensionField sendableDataExtensionField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionField target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionField)get_store().find_element_user(SENDABLEDATAEXTENSIONFIELD$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionField)get_store().add_element_user(SENDABLEDATAEXTENSIONFIELD$8);
            }
            target.set(sendableDataExtensionField);
        }
    }
    
    /**
     * Appends and returns a new empty "SendableDataExtensionField" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionField addNewSendableDataExtensionField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionField target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionField)get_store().add_element_user(SENDABLEDATAEXTENSIONFIELD$8);
            return target;
        }
    }
    
    /**
     * Unsets the "SendableDataExtensionField" element
     */
    public void unsetSendableDataExtensionField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDABLEDATAEXTENSIONFIELD$8, 0);
        }
    }
    
    /**
     * Gets the "SendableSubscriberField" element
     */
    public com.exacttarget.wsdl.partnerapi.Attribute getSendableSubscriberField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Attribute target = null;
            target = (com.exacttarget.wsdl.partnerapi.Attribute)get_store().find_element_user(SENDABLESUBSCRIBERFIELD$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SendableSubscriberField" element
     */
    public boolean isSetSendableSubscriberField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDABLESUBSCRIBERFIELD$10) != 0;
        }
    }
    
    /**
     * Sets the "SendableSubscriberField" element
     */
    public void setSendableSubscriberField(com.exacttarget.wsdl.partnerapi.Attribute sendableSubscriberField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Attribute target = null;
            target = (com.exacttarget.wsdl.partnerapi.Attribute)get_store().find_element_user(SENDABLESUBSCRIBERFIELD$10, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Attribute)get_store().add_element_user(SENDABLESUBSCRIBERFIELD$10);
            }
            target.set(sendableSubscriberField);
        }
    }
    
    /**
     * Appends and returns a new empty "SendableSubscriberField" element
     */
    public com.exacttarget.wsdl.partnerapi.Attribute addNewSendableSubscriberField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Attribute target = null;
            target = (com.exacttarget.wsdl.partnerapi.Attribute)get_store().add_element_user(SENDABLESUBSCRIBERFIELD$10);
            return target;
        }
    }
    
    /**
     * Unsets the "SendableSubscriberField" element
     */
    public void unsetSendableSubscriberField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDABLESUBSCRIBERFIELD$10, 0);
        }
    }
    
    /**
     * Gets the "Template" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionTemplate getTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionTemplate target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionTemplate)get_store().find_element_user(TEMPLATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Template" element
     */
    public boolean isSetTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEMPLATE$12) != 0;
        }
    }
    
    /**
     * Sets the "Template" element
     */
    public void setTemplate(com.exacttarget.wsdl.partnerapi.DataExtensionTemplate template)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionTemplate target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionTemplate)get_store().find_element_user(TEMPLATE$12, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionTemplate)get_store().add_element_user(TEMPLATE$12);
            }
            target.set(template);
        }
    }
    
    /**
     * Appends and returns a new empty "Template" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionTemplate addNewTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionTemplate target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionTemplate)get_store().add_element_user(TEMPLATE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "Template" element
     */
    public void unsetTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEMPLATE$12, 0);
        }
    }
    
    /**
     * Gets the "DataRetentionPeriodLength" element
     */
    public int getDataRetentionPeriodLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATARETENTIONPERIODLENGTH$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataRetentionPeriodLength" element
     */
    public org.apache.xmlbeans.XmlInt xgetDataRetentionPeriodLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATARETENTIONPERIODLENGTH$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataRetentionPeriodLength" element
     */
    public boolean isSetDataRetentionPeriodLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATARETENTIONPERIODLENGTH$14) != 0;
        }
    }
    
    /**
     * Sets the "DataRetentionPeriodLength" element
     */
    public void setDataRetentionPeriodLength(int dataRetentionPeriodLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATARETENTIONPERIODLENGTH$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATARETENTIONPERIODLENGTH$14);
            }
            target.setIntValue(dataRetentionPeriodLength);
        }
    }
    
    /**
     * Sets (as xml) the "DataRetentionPeriodLength" element
     */
    public void xsetDataRetentionPeriodLength(org.apache.xmlbeans.XmlInt dataRetentionPeriodLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATARETENTIONPERIODLENGTH$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATARETENTIONPERIODLENGTH$14);
            }
            target.set(dataRetentionPeriodLength);
        }
    }
    
    /**
     * Unsets the "DataRetentionPeriodLength" element
     */
    public void unsetDataRetentionPeriodLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATARETENTIONPERIODLENGTH$14, 0);
        }
    }
    
    /**
     * Gets the "DataRetentionPeriodUnitOfMeasure" element
     */
    public int getDataRetentionPeriodUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATARETENTIONPERIODUNITOFMEASURE$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataRetentionPeriodUnitOfMeasure" element
     */
    public org.apache.xmlbeans.XmlInt xgetDataRetentionPeriodUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATARETENTIONPERIODUNITOFMEASURE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataRetentionPeriodUnitOfMeasure" element
     */
    public boolean isSetDataRetentionPeriodUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATARETENTIONPERIODUNITOFMEASURE$16) != 0;
        }
    }
    
    /**
     * Sets the "DataRetentionPeriodUnitOfMeasure" element
     */
    public void setDataRetentionPeriodUnitOfMeasure(int dataRetentionPeriodUnitOfMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATARETENTIONPERIODUNITOFMEASURE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATARETENTIONPERIODUNITOFMEASURE$16);
            }
            target.setIntValue(dataRetentionPeriodUnitOfMeasure);
        }
    }
    
    /**
     * Sets (as xml) the "DataRetentionPeriodUnitOfMeasure" element
     */
    public void xsetDataRetentionPeriodUnitOfMeasure(org.apache.xmlbeans.XmlInt dataRetentionPeriodUnitOfMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATARETENTIONPERIODUNITOFMEASURE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATARETENTIONPERIODUNITOFMEASURE$16);
            }
            target.set(dataRetentionPeriodUnitOfMeasure);
        }
    }
    
    /**
     * Unsets the "DataRetentionPeriodUnitOfMeasure" element
     */
    public void unsetDataRetentionPeriodUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATARETENTIONPERIODUNITOFMEASURE$16, 0);
        }
    }
    
    /**
     * Gets the "RowBasedRetention" element
     */
    public boolean getRowBasedRetention()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWBASEDRETENTION$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "RowBasedRetention" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRowBasedRetention()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ROWBASEDRETENTION$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "RowBasedRetention" element
     */
    public boolean isSetRowBasedRetention()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROWBASEDRETENTION$18) != 0;
        }
    }
    
    /**
     * Sets the "RowBasedRetention" element
     */
    public void setRowBasedRetention(boolean rowBasedRetention)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWBASEDRETENTION$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROWBASEDRETENTION$18);
            }
            target.setBooleanValue(rowBasedRetention);
        }
    }
    
    /**
     * Sets (as xml) the "RowBasedRetention" element
     */
    public void xsetRowBasedRetention(org.apache.xmlbeans.XmlBoolean rowBasedRetention)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ROWBASEDRETENTION$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ROWBASEDRETENTION$18);
            }
            target.set(rowBasedRetention);
        }
    }
    
    /**
     * Unsets the "RowBasedRetention" element
     */
    public void unsetRowBasedRetention()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROWBASEDRETENTION$18, 0);
        }
    }
    
    /**
     * Gets the "ResetRetentionPeriodOnImport" element
     */
    public boolean getResetRetentionPeriodOnImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESETRETENTIONPERIODONIMPORT$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResetRetentionPeriodOnImport" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetResetRetentionPeriodOnImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESETRETENTIONPERIODONIMPORT$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "ResetRetentionPeriodOnImport" element
     */
    public boolean isSetResetRetentionPeriodOnImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESETRETENTIONPERIODONIMPORT$20) != 0;
        }
    }
    
    /**
     * Sets the "ResetRetentionPeriodOnImport" element
     */
    public void setResetRetentionPeriodOnImport(boolean resetRetentionPeriodOnImport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESETRETENTIONPERIODONIMPORT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESETRETENTIONPERIODONIMPORT$20);
            }
            target.setBooleanValue(resetRetentionPeriodOnImport);
        }
    }
    
    /**
     * Sets (as xml) the "ResetRetentionPeriodOnImport" element
     */
    public void xsetResetRetentionPeriodOnImport(org.apache.xmlbeans.XmlBoolean resetRetentionPeriodOnImport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESETRETENTIONPERIODONIMPORT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RESETRETENTIONPERIODONIMPORT$20);
            }
            target.set(resetRetentionPeriodOnImport);
        }
    }
    
    /**
     * Unsets the "ResetRetentionPeriodOnImport" element
     */
    public void unsetResetRetentionPeriodOnImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESETRETENTIONPERIODONIMPORT$20, 0);
        }
    }
    
    /**
     * Gets the "DeleteAtEndOfRetentionPeriod" element
     */
    public boolean getDeleteAtEndOfRetentionPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEATENDOFRETENTIONPERIOD$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeleteAtEndOfRetentionPeriod" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDeleteAtEndOfRetentionPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DELETEATENDOFRETENTIONPERIOD$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeleteAtEndOfRetentionPeriod" element
     */
    public boolean isSetDeleteAtEndOfRetentionPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETEATENDOFRETENTIONPERIOD$22) != 0;
        }
    }
    
    /**
     * Sets the "DeleteAtEndOfRetentionPeriod" element
     */
    public void setDeleteAtEndOfRetentionPeriod(boolean deleteAtEndOfRetentionPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEATENDOFRETENTIONPERIOD$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELETEATENDOFRETENTIONPERIOD$22);
            }
            target.setBooleanValue(deleteAtEndOfRetentionPeriod);
        }
    }
    
    /**
     * Sets (as xml) the "DeleteAtEndOfRetentionPeriod" element
     */
    public void xsetDeleteAtEndOfRetentionPeriod(org.apache.xmlbeans.XmlBoolean deleteAtEndOfRetentionPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DELETEATENDOFRETENTIONPERIOD$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DELETEATENDOFRETENTIONPERIOD$22);
            }
            target.set(deleteAtEndOfRetentionPeriod);
        }
    }
    
    /**
     * Unsets the "DeleteAtEndOfRetentionPeriod" element
     */
    public void unsetDeleteAtEndOfRetentionPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETEATENDOFRETENTIONPERIOD$22, 0);
        }
    }
    
    /**
     * Gets the "RetainUntil" element
     */
    public java.lang.String getRetainUntil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETAINUNTIL$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RetainUntil" element
     */
    public org.apache.xmlbeans.XmlString xgetRetainUntil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETAINUNTIL$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "RetainUntil" element
     */
    public boolean isSetRetainUntil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETAINUNTIL$24) != 0;
        }
    }
    
    /**
     * Sets the "RetainUntil" element
     */
    public void setRetainUntil(java.lang.String retainUntil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETAINUNTIL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETAINUNTIL$24);
            }
            target.setStringValue(retainUntil);
        }
    }
    
    /**
     * Sets (as xml) the "RetainUntil" element
     */
    public void xsetRetainUntil(org.apache.xmlbeans.XmlString retainUntil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETAINUNTIL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETAINUNTIL$24);
            }
            target.set(retainUntil);
        }
    }
    
    /**
     * Unsets the "RetainUntil" element
     */
    public void unsetRetainUntil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETAINUNTIL$24, 0);
        }
    }
    
    /**
     * Gets the "Fields" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtension.Fields getFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtension.Fields target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtension.Fields)get_store().find_element_user(FIELDS$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Fields" element
     */
    public boolean isSetFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDS$26) != 0;
        }
    }
    
    /**
     * Sets the "Fields" element
     */
    public void setFields(com.exacttarget.wsdl.partnerapi.DataExtension.Fields fields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtension.Fields target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtension.Fields)get_store().find_element_user(FIELDS$26, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DataExtension.Fields)get_store().add_element_user(FIELDS$26);
            }
            target.set(fields);
        }
    }
    
    /**
     * Appends and returns a new empty "Fields" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtension.Fields addNewFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtension.Fields target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtension.Fields)get_store().add_element_user(FIELDS$26);
            return target;
        }
    }
    
    /**
     * Unsets the "Fields" element
     */
    public void unsetFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDS$26, 0);
        }
    }
    
    /**
     * Gets the "DataRetentionPeriod" element
     */
    public com.exacttarget.wsdl.partnerapi.DateTimeUnitOfMeasure.Enum getDataRetentionPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATARETENTIONPERIOD$28, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.DateTimeUnitOfMeasure.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataRetentionPeriod" element
     */
    public com.exacttarget.wsdl.partnerapi.DateTimeUnitOfMeasure xgetDataRetentionPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DateTimeUnitOfMeasure target = null;
            target = (com.exacttarget.wsdl.partnerapi.DateTimeUnitOfMeasure)get_store().find_element_user(DATARETENTIONPERIOD$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataRetentionPeriod" element
     */
    public boolean isSetDataRetentionPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATARETENTIONPERIOD$28) != 0;
        }
    }
    
    /**
     * Sets the "DataRetentionPeriod" element
     */
    public void setDataRetentionPeriod(com.exacttarget.wsdl.partnerapi.DateTimeUnitOfMeasure.Enum dataRetentionPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATARETENTIONPERIOD$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATARETENTIONPERIOD$28);
            }
            target.setEnumValue(dataRetentionPeriod);
        }
    }
    
    /**
     * Sets (as xml) the "DataRetentionPeriod" element
     */
    public void xsetDataRetentionPeriod(com.exacttarget.wsdl.partnerapi.DateTimeUnitOfMeasure dataRetentionPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DateTimeUnitOfMeasure target = null;
            target = (com.exacttarget.wsdl.partnerapi.DateTimeUnitOfMeasure)get_store().find_element_user(DATARETENTIONPERIOD$28, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DateTimeUnitOfMeasure)get_store().add_element_user(DATARETENTIONPERIOD$28);
            }
            target.set(dataRetentionPeriod);
        }
    }
    
    /**
     * Unsets the "DataRetentionPeriod" element
     */
    public void unsetDataRetentionPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATARETENTIONPERIOD$28, 0);
        }
    }
    
    /**
     * Gets the "CategoryID" element
     */
    public long getCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYID$30, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "CategoryID" element
     */
    public org.apache.xmlbeans.XmlLong xgetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CATEGORYID$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "CategoryID" element
     */
    public boolean isSetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYID$30) != 0;
        }
    }
    
    /**
     * Sets the "CategoryID" element
     */
    public void setCategoryID(long categoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYID$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYID$30);
            }
            target.setLongValue(categoryID);
        }
    }
    
    /**
     * Sets (as xml) the "CategoryID" element
     */
    public void xsetCategoryID(org.apache.xmlbeans.XmlLong categoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CATEGORYID$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CATEGORYID$30);
            }
            target.set(categoryID);
        }
    }
    
    /**
     * Unsets the "CategoryID" element
     */
    public void unsetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYID$30, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$32, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$32, 0);
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
            return get_store().count_elements(STATUS$32) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$32);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$32);
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
            get_store().remove_element(STATUS$32, 0);
        }
    }
    /**
     * An XML Fields(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class FieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.DataExtension.Fields
    {
        
        public FieldsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELD$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Field");
        
        
        /**
         * Gets array of all "Field" elements
         */
        public com.exacttarget.wsdl.partnerapi.DataExtensionField[] getFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELD$0, targetList);
                com.exacttarget.wsdl.partnerapi.DataExtensionField[] result = new com.exacttarget.wsdl.partnerapi.DataExtensionField[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Field" element
         */
        public com.exacttarget.wsdl.partnerapi.DataExtensionField getFieldArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionField target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionField)get_store().find_element_user(FIELD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Field" element
         */
        public int sizeOfFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELD$0);
            }
        }
        
        /**
         * Sets array of all "Field" element
         */
        public void setFieldArray(com.exacttarget.wsdl.partnerapi.DataExtensionField[] fieldArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fieldArray, FIELD$0);
            }
        }
        
        /**
         * Sets ith "Field" element
         */
        public void setFieldArray(int i, com.exacttarget.wsdl.partnerapi.DataExtensionField field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionField target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionField)get_store().find_element_user(FIELD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(field);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Field" element
         */
        public com.exacttarget.wsdl.partnerapi.DataExtensionField insertNewField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionField target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionField)get_store().insert_element_user(FIELD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Field" element
         */
        public com.exacttarget.wsdl.partnerapi.DataExtensionField addNewField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionField target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionField)get_store().add_element_user(FIELD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Field" element
         */
        public void removeField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELD$0, i);
            }
        }
    }
}
