/*
 * XML Type:  SuppressionListContext
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SuppressionListContext
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SuppressionListContext(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SuppressionListContextImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.SuppressionListContext
{
    
    public SuppressionListContextImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Context");
    private static final javax.xml.namespace.QName SENDCLASSIFICATIONTYPE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendClassificationType");
    private static final javax.xml.namespace.QName SENDCLASSIFICATION$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendClassification");
    private static final javax.xml.namespace.QName SEND$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Send");
    private static final javax.xml.namespace.QName DEFINITION$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Definition");
    private static final javax.xml.namespace.QName APPLIESTOALLSENDS$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AppliesToAllSends");
    
    
    /**
     * Gets the "Context" element
     */
    public com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum.Enum getContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Context" element
     */
    public com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum xgetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum)get_store().find_element_user(CONTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Context" element
     */
    public boolean isSetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXT$0) != 0;
        }
    }
    
    /**
     * Sets the "Context" element
     */
    public void setContext(com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum.Enum context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTEXT$0);
            }
            target.setEnumValue(context);
        }
    }
    
    /**
     * Sets (as xml) the "Context" element
     */
    public void xsetContext(com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum)get_store().find_element_user(CONTEXT$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum)get_store().add_element_user(CONTEXT$0);
            }
            target.set(context);
        }
    }
    
    /**
     * Unsets the "Context" element
     */
    public void unsetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXT$0, 0);
        }
    }
    
    /**
     * Gets the "SendClassificationType" element
     */
    public com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum.Enum getSendClassificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDCLASSIFICATIONTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendClassificationType" element
     */
    public com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum xgetSendClassificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum)get_store().find_element_user(SENDCLASSIFICATIONTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendClassificationType" element
     */
    public boolean isSetSendClassificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDCLASSIFICATIONTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "SendClassificationType" element
     */
    public void setSendClassificationType(com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum.Enum sendClassificationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDCLASSIFICATIONTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDCLASSIFICATIONTYPE$2);
            }
            target.setEnumValue(sendClassificationType);
        }
    }
    
    /**
     * Sets (as xml) the "SendClassificationType" element
     */
    public void xsetSendClassificationType(com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum sendClassificationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum)get_store().find_element_user(SENDCLASSIFICATIONTYPE$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum)get_store().add_element_user(SENDCLASSIFICATIONTYPE$2);
            }
            target.set(sendClassificationType);
        }
    }
    
    /**
     * Unsets the "SendClassificationType" element
     */
    public void unsetSendClassificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDCLASSIFICATIONTYPE$2, 0);
        }
    }
    
    /**
     * Gets the "SendClassification" element
     */
    public com.exacttarget.wsdl.partnerapi.SendClassification getSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().find_element_user(SENDCLASSIFICATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SendClassification" element
     */
    public boolean isSetSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDCLASSIFICATION$4) != 0;
        }
    }
    
    /**
     * Sets the "SendClassification" element
     */
    public void setSendClassification(com.exacttarget.wsdl.partnerapi.SendClassification sendClassification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().find_element_user(SENDCLASSIFICATION$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().add_element_user(SENDCLASSIFICATION$4);
            }
            target.set(sendClassification);
        }
    }
    
    /**
     * Appends and returns a new empty "SendClassification" element
     */
    public com.exacttarget.wsdl.partnerapi.SendClassification addNewSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().add_element_user(SENDCLASSIFICATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "SendClassification" element
     */
    public void unsetSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDCLASSIFICATION$4, 0);
        }
    }
    
    /**
     * Gets the "Send" element
     */
    public com.exacttarget.wsdl.partnerapi.Send getSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send)get_store().find_element_user(SEND$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Send" element
     */
    public boolean isSetSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEND$6) != 0;
        }
    }
    
    /**
     * Sets the "Send" element
     */
    public void setSend(com.exacttarget.wsdl.partnerapi.Send send)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send)get_store().find_element_user(SEND$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Send)get_store().add_element_user(SEND$6);
            }
            target.set(send);
        }
    }
    
    /**
     * Appends and returns a new empty "Send" element
     */
    public com.exacttarget.wsdl.partnerapi.Send addNewSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send)get_store().add_element_user(SEND$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Send" element
     */
    public void unsetSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEND$6, 0);
        }
    }
    
    /**
     * Gets the "Definition" element
     */
    public com.exacttarget.wsdl.partnerapi.SuppressionListDefinition getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition)get_store().find_element_user(DEFINITION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Definition" element
     */
    public boolean isSetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFINITION$8) != 0;
        }
    }
    
    /**
     * Sets the "Definition" element
     */
    public void setDefinition(com.exacttarget.wsdl.partnerapi.SuppressionListDefinition definition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition)get_store().find_element_user(DEFINITION$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition)get_store().add_element_user(DEFINITION$8);
            }
            target.set(definition);
        }
    }
    
    /**
     * Appends and returns a new empty "Definition" element
     */
    public com.exacttarget.wsdl.partnerapi.SuppressionListDefinition addNewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition)get_store().add_element_user(DEFINITION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Definition" element
     */
    public void unsetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFINITION$8, 0);
        }
    }
    
    /**
     * Gets the "AppliesToAllSends" element
     */
    public boolean getAppliesToAllSends()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLIESTOALLSENDS$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AppliesToAllSends" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAppliesToAllSends()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(APPLIESTOALLSENDS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "AppliesToAllSends" element
     */
    public boolean isSetAppliesToAllSends()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPLIESTOALLSENDS$10) != 0;
        }
    }
    
    /**
     * Sets the "AppliesToAllSends" element
     */
    public void setAppliesToAllSends(boolean appliesToAllSends)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLIESTOALLSENDS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPLIESTOALLSENDS$10);
            }
            target.setBooleanValue(appliesToAllSends);
        }
    }
    
    /**
     * Sets (as xml) the "AppliesToAllSends" element
     */
    public void xsetAppliesToAllSends(org.apache.xmlbeans.XmlBoolean appliesToAllSends)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(APPLIESTOALLSENDS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(APPLIESTOALLSENDS$10);
            }
            target.set(appliesToAllSends);
        }
    }
    
    /**
     * Unsets the "AppliesToAllSends" element
     */
    public void unsetAppliesToAllSends()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPLIESTOALLSENDS$10, 0);
        }
    }
}
