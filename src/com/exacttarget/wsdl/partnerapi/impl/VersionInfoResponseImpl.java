/*
 * XML Type:  VersionInfoResponse
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.VersionInfoResponse
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML VersionInfoResponse(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class VersionInfoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.VersionInfoResponse
{
    
    public VersionInfoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Version");
    private static final javax.xml.namespace.QName VERSIONDATE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "VersionDate");
    private static final javax.xml.namespace.QName NOTES$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Notes");
    private static final javax.xml.namespace.QName VERSIONHISTORY$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "VersionHistory");
    
    
    /**
     * Gets the "Version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Version" element
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Version" element
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$0);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "Version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$0);
            }
            target.set(version);
        }
    }
    
    /**
     * Gets the "VersionDate" element
     */
    public java.util.Calendar getVersionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "VersionDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetVersionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(VERSIONDATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "VersionDate" element
     */
    public void setVersionDate(java.util.Calendar versionDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONDATE$2);
            }
            target.setCalendarValue(versionDate);
        }
    }
    
    /**
     * Sets (as xml) the "VersionDate" element
     */
    public void xsetVersionDate(org.apache.xmlbeans.XmlDateTime versionDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(VERSIONDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(VERSIONDATE$2);
            }
            target.set(versionDate);
        }
    }
    
    /**
     * Gets the "Notes" element
     */
    public java.lang.String getNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Notes" element
     */
    public org.apache.xmlbeans.XmlString xgetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTES$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Notes" element
     */
    public void setNotes(java.lang.String notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTES$4);
            }
            target.setStringValue(notes);
        }
    }
    
    /**
     * Sets (as xml) the "Notes" element
     */
    public void xsetNotes(org.apache.xmlbeans.XmlString notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTES$4);
            }
            target.set(notes);
        }
    }
    
    /**
     * Gets array of all "VersionHistory" elements
     */
    public com.exacttarget.wsdl.partnerapi.VersionInfoResponse[] getVersionHistoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VERSIONHISTORY$6, targetList);
            com.exacttarget.wsdl.partnerapi.VersionInfoResponse[] result = new com.exacttarget.wsdl.partnerapi.VersionInfoResponse[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "VersionHistory" element
     */
    public com.exacttarget.wsdl.partnerapi.VersionInfoResponse getVersionHistoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.VersionInfoResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.VersionInfoResponse)get_store().find_element_user(VERSIONHISTORY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "VersionHistory" element
     */
    public int sizeOfVersionHistoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSIONHISTORY$6);
        }
    }
    
    /**
     * Sets array of all "VersionHistory" element
     */
    public void setVersionHistoryArray(com.exacttarget.wsdl.partnerapi.VersionInfoResponse[] versionHistoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(versionHistoryArray, VERSIONHISTORY$6);
        }
    }
    
    /**
     * Sets ith "VersionHistory" element
     */
    public void setVersionHistoryArray(int i, com.exacttarget.wsdl.partnerapi.VersionInfoResponse versionHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.VersionInfoResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.VersionInfoResponse)get_store().find_element_user(VERSIONHISTORY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(versionHistory);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "VersionHistory" element
     */
    public com.exacttarget.wsdl.partnerapi.VersionInfoResponse insertNewVersionHistory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.VersionInfoResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.VersionInfoResponse)get_store().insert_element_user(VERSIONHISTORY$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "VersionHistory" element
     */
    public com.exacttarget.wsdl.partnerapi.VersionInfoResponse addNewVersionHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.VersionInfoResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.VersionInfoResponse)get_store().add_element_user(VERSIONHISTORY$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "VersionHistory" element
     */
    public void removeVersionHistory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSIONHISTORY$6, i);
        }
    }
}
