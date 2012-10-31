/*
 * XML Type:  FileTrigger
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.FileTrigger
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML FileTrigger(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class FileTriggerImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.FileTrigger
{
    
    public FileTriggerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALREFERENCE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExternalReference");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Type");
    private static final javax.xml.namespace.QName STATUS$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Status");
    private static final javax.xml.namespace.QName STATUSMESSAGE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "StatusMessage");
    private static final javax.xml.namespace.QName REQUESTPARAMETERDETAIL$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestParameterDetail");
    private static final javax.xml.namespace.QName RESPONSECONTROLMANIFEST$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ResponseControlManifest");
    private static final javax.xml.namespace.QName FILENAME$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FileName");
    private static final javax.xml.namespace.QName DESCRIPTION$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName NAME$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName LASTPULLDATE$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "LastPullDate");
    private static final javax.xml.namespace.QName SCHEDULEDDATE$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ScheduledDate");
    private static final javax.xml.namespace.QName ISACTIVE$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsActive");
    private static final javax.xml.namespace.QName FILETRIGGERPROGRAMID$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FileTriggerProgramID");
    
    
    /**
     * Gets the "ExternalReference" element
     */
    public java.lang.String getExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExternalReference" element
     */
    public org.apache.xmlbeans.XmlString xgetExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALREFERENCE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExternalReference" element
     */
    public boolean isSetExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALREFERENCE$0) != 0;
        }
    }
    
    /**
     * Sets the "ExternalReference" element
     */
    public void setExternalReference(java.lang.String externalReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALREFERENCE$0);
            }
            target.setStringValue(externalReference);
        }
    }
    
    /**
     * Sets (as xml) the "ExternalReference" element
     */
    public void xsetExternalReference(org.apache.xmlbeans.XmlString externalReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALREFERENCE$0);
            }
            target.set(externalReference);
        }
    }
    
    /**
     * Unsets the "ExternalReference" element
     */
    public void unsetExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALREFERENCE$0, 0);
        }
    }
    
    /**
     * Gets the "Type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$2);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$4, 0);
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
            return get_store().count_elements(STATUS$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$4);
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
            get_store().remove_element(STATUS$4, 0);
        }
    }
    
    /**
     * Gets the "StatusMessage" element
     */
    public java.lang.String getStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSMESSAGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StatusMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSMESSAGE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "StatusMessage" element
     */
    public boolean isSetStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSMESSAGE$6) != 0;
        }
    }
    
    /**
     * Sets the "StatusMessage" element
     */
    public void setStatusMessage(java.lang.String statusMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSMESSAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSMESSAGE$6);
            }
            target.setStringValue(statusMessage);
        }
    }
    
    /**
     * Sets (as xml) the "StatusMessage" element
     */
    public void xsetStatusMessage(org.apache.xmlbeans.XmlString statusMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSMESSAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSMESSAGE$6);
            }
            target.set(statusMessage);
        }
    }
    
    /**
     * Unsets the "StatusMessage" element
     */
    public void unsetStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSMESSAGE$6, 0);
        }
    }
    
    /**
     * Gets the "RequestParameterDetail" element
     */
    public java.lang.String getRequestParameterDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTPARAMETERDETAIL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestParameterDetail" element
     */
    public org.apache.xmlbeans.XmlString xgetRequestParameterDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTPARAMETERDETAIL$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "RequestParameterDetail" element
     */
    public boolean isSetRequestParameterDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTPARAMETERDETAIL$8) != 0;
        }
    }
    
    /**
     * Sets the "RequestParameterDetail" element
     */
    public void setRequestParameterDetail(java.lang.String requestParameterDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTPARAMETERDETAIL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTPARAMETERDETAIL$8);
            }
            target.setStringValue(requestParameterDetail);
        }
    }
    
    /**
     * Sets (as xml) the "RequestParameterDetail" element
     */
    public void xsetRequestParameterDetail(org.apache.xmlbeans.XmlString requestParameterDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTPARAMETERDETAIL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTPARAMETERDETAIL$8);
            }
            target.set(requestParameterDetail);
        }
    }
    
    /**
     * Unsets the "RequestParameterDetail" element
     */
    public void unsetRequestParameterDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTPARAMETERDETAIL$8, 0);
        }
    }
    
    /**
     * Gets the "ResponseControlManifest" element
     */
    public java.lang.String getResponseControlManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSECONTROLMANIFEST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResponseControlManifest" element
     */
    public org.apache.xmlbeans.XmlString xgetResponseControlManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECONTROLMANIFEST$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ResponseControlManifest" element
     */
    public boolean isSetResponseControlManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSECONTROLMANIFEST$10) != 0;
        }
    }
    
    /**
     * Sets the "ResponseControlManifest" element
     */
    public void setResponseControlManifest(java.lang.String responseControlManifest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSECONTROLMANIFEST$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSECONTROLMANIFEST$10);
            }
            target.setStringValue(responseControlManifest);
        }
    }
    
    /**
     * Sets (as xml) the "ResponseControlManifest" element
     */
    public void xsetResponseControlManifest(org.apache.xmlbeans.XmlString responseControlManifest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECONTROLMANIFEST$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSECONTROLMANIFEST$10);
            }
            target.set(responseControlManifest);
        }
    }
    
    /**
     * Unsets the "ResponseControlManifest" element
     */
    public void unsetResponseControlManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSECONTROLMANIFEST$10, 0);
        }
    }
    
    /**
     * Gets the "FileName" element
     */
    public java.lang.String getFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileName" element
     */
    public org.apache.xmlbeans.XmlString xgetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "FileName" element
     */
    public boolean isSetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILENAME$12) != 0;
        }
    }
    
    /**
     * Sets the "FileName" element
     */
    public void setFileName(java.lang.String fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILENAME$12);
            }
            target.setStringValue(fileName);
        }
    }
    
    /**
     * Sets (as xml) the "FileName" element
     */
    public void xsetFileName(org.apache.xmlbeans.XmlString fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILENAME$12);
            }
            target.set(fileName);
        }
    }
    
    /**
     * Unsets the "FileName" element
     */
    public void unsetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILENAME$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$14, 0);
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
            return get_store().count_elements(DESCRIPTION$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$14);
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
            get_store().remove_element(DESCRIPTION$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$16, 0);
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
            return get_store().count_elements(NAME$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$16);
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
            get_store().remove_element(NAME$16, 0);
        }
    }
    
    /**
     * Gets the "LastPullDate" element
     */
    public java.util.Calendar getLastPullDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTPULLDATE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastPullDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLastPullDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTPULLDATE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "LastPullDate" element
     */
    public boolean isSetLastPullDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTPULLDATE$18) != 0;
        }
    }
    
    /**
     * Sets the "LastPullDate" element
     */
    public void setLastPullDate(java.util.Calendar lastPullDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTPULLDATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTPULLDATE$18);
            }
            target.setCalendarValue(lastPullDate);
        }
    }
    
    /**
     * Sets (as xml) the "LastPullDate" element
     */
    public void xsetLastPullDate(org.apache.xmlbeans.XmlDateTime lastPullDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTPULLDATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTPULLDATE$18);
            }
            target.set(lastPullDate);
        }
    }
    
    /**
     * Unsets the "LastPullDate" element
     */
    public void unsetLastPullDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTPULLDATE$18, 0);
        }
    }
    
    /**
     * Gets the "ScheduledDate" element
     */
    public java.util.Calendar getScheduledDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDDATE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScheduledDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetScheduledDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SCHEDULEDDATE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "ScheduledDate" element
     */
    public boolean isSetScheduledDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULEDDATE$20) != 0;
        }
    }
    
    /**
     * Sets the "ScheduledDate" element
     */
    public void setScheduledDate(java.util.Calendar scheduledDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDDATE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEDULEDDATE$20);
            }
            target.setCalendarValue(scheduledDate);
        }
    }
    
    /**
     * Sets (as xml) the "ScheduledDate" element
     */
    public void xsetScheduledDate(org.apache.xmlbeans.XmlDateTime scheduledDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SCHEDULEDDATE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SCHEDULEDDATE$20);
            }
            target.set(scheduledDate);
        }
    }
    
    /**
     * Unsets the "ScheduledDate" element
     */
    public void unsetScheduledDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULEDDATE$20, 0);
        }
    }
    
    /**
     * Gets the "IsActive" element
     */
    public boolean getIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVE$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsActive" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVE$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsActive" element
     */
    public boolean isSetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISACTIVE$22) != 0;
        }
    }
    
    /**
     * Sets the "IsActive" element
     */
    public void setIsActive(boolean isActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISACTIVE$22);
            }
            target.setBooleanValue(isActive);
        }
    }
    
    /**
     * Sets (as xml) the "IsActive" element
     */
    public void xsetIsActive(org.apache.xmlbeans.XmlBoolean isActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISACTIVE$22);
            }
            target.set(isActive);
        }
    }
    
    /**
     * Unsets the "IsActive" element
     */
    public void unsetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISACTIVE$22, 0);
        }
    }
    
    /**
     * Gets the "FileTriggerProgramID" element
     */
    public java.lang.String getFileTriggerProgramID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILETRIGGERPROGRAMID$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileTriggerProgramID" element
     */
    public org.apache.xmlbeans.XmlString xgetFileTriggerProgramID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILETRIGGERPROGRAMID$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "FileTriggerProgramID" element
     */
    public boolean isSetFileTriggerProgramID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILETRIGGERPROGRAMID$24) != 0;
        }
    }
    
    /**
     * Sets the "FileTriggerProgramID" element
     */
    public void setFileTriggerProgramID(java.lang.String fileTriggerProgramID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILETRIGGERPROGRAMID$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILETRIGGERPROGRAMID$24);
            }
            target.setStringValue(fileTriggerProgramID);
        }
    }
    
    /**
     * Sets (as xml) the "FileTriggerProgramID" element
     */
    public void xsetFileTriggerProgramID(org.apache.xmlbeans.XmlString fileTriggerProgramID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILETRIGGERPROGRAMID$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILETRIGGERPROGRAMID$24);
            }
            target.set(fileTriggerProgramID);
        }
    }
    
    /**
     * Unsets the "FileTriggerProgramID" element
     */
    public void unsetFileTriggerProgramID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILETRIGGERPROGRAMID$24, 0);
        }
    }
}
