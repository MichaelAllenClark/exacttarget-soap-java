/*
 * XML Type:  SystemStatusResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SystemStatusResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SystemStatusResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SystemStatusResultImpl extends com.exacttarget.wsdl.partnerapi.impl.ResultImpl implements com.exacttarget.wsdl.partnerapi.SystemStatusResult
{
    
    public SystemStatusResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMSTATUS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SystemStatus");
    private static final javax.xml.namespace.QName OUTAGES$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Outages");
    
    
    /**
     * Gets the "SystemStatus" element
     */
    public com.exacttarget.wsdl.partnerapi.SystemStatusType.Enum getSystemStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SystemStatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SystemStatus" element
     */
    public com.exacttarget.wsdl.partnerapi.SystemStatusType xgetSystemStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SystemStatusType target = null;
            target = (com.exacttarget.wsdl.partnerapi.SystemStatusType)get_store().find_element_user(SYSTEMSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SystemStatus" element
     */
    public void setSystemStatus(com.exacttarget.wsdl.partnerapi.SystemStatusType.Enum systemStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMSTATUS$0);
            }
            target.setEnumValue(systemStatus);
        }
    }
    
    /**
     * Sets (as xml) the "SystemStatus" element
     */
    public void xsetSystemStatus(com.exacttarget.wsdl.partnerapi.SystemStatusType systemStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SystemStatusType target = null;
            target = (com.exacttarget.wsdl.partnerapi.SystemStatusType)get_store().find_element_user(SYSTEMSTATUS$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SystemStatusType)get_store().add_element_user(SYSTEMSTATUS$0);
            }
            target.set(systemStatus);
        }
    }
    
    /**
     * Gets the "Outages" element
     */
    public com.exacttarget.wsdl.partnerapi.SystemStatusResult.Outages getOutages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SystemStatusResult.Outages target = null;
            target = (com.exacttarget.wsdl.partnerapi.SystemStatusResult.Outages)get_store().find_element_user(OUTAGES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Outages" element
     */
    public boolean isSetOutages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTAGES$2) != 0;
        }
    }
    
    /**
     * Sets the "Outages" element
     */
    public void setOutages(com.exacttarget.wsdl.partnerapi.SystemStatusResult.Outages outages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SystemStatusResult.Outages target = null;
            target = (com.exacttarget.wsdl.partnerapi.SystemStatusResult.Outages)get_store().find_element_user(OUTAGES$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SystemStatusResult.Outages)get_store().add_element_user(OUTAGES$2);
            }
            target.set(outages);
        }
    }
    
    /**
     * Appends and returns a new empty "Outages" element
     */
    public com.exacttarget.wsdl.partnerapi.SystemStatusResult.Outages addNewOutages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SystemStatusResult.Outages target = null;
            target = (com.exacttarget.wsdl.partnerapi.SystemStatusResult.Outages)get_store().add_element_user(OUTAGES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Outages" element
     */
    public void unsetOutages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTAGES$2, 0);
        }
    }
    /**
     * An XML Outages(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class OutagesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SystemStatusResult.Outages
    {
        
        public OutagesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUTAGE$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Outage");
        
        
        /**
         * Gets array of all "Outage" elements
         */
        public com.exacttarget.wsdl.partnerapi.SystemOutage[] getOutageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUTAGE$0, targetList);
                com.exacttarget.wsdl.partnerapi.SystemOutage[] result = new com.exacttarget.wsdl.partnerapi.SystemOutage[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Outage" element
         */
        public com.exacttarget.wsdl.partnerapi.SystemOutage getOutageArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SystemOutage target = null;
                target = (com.exacttarget.wsdl.partnerapi.SystemOutage)get_store().find_element_user(OUTAGE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Outage" element
         */
        public int sizeOfOutageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OUTAGE$0);
            }
        }
        
        /**
         * Sets array of all "Outage" element
         */
        public void setOutageArray(com.exacttarget.wsdl.partnerapi.SystemOutage[] outageArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(outageArray, OUTAGE$0);
            }
        }
        
        /**
         * Sets ith "Outage" element
         */
        public void setOutageArray(int i, com.exacttarget.wsdl.partnerapi.SystemOutage outage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SystemOutage target = null;
                target = (com.exacttarget.wsdl.partnerapi.SystemOutage)get_store().find_element_user(OUTAGE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(outage);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Outage" element
         */
        public com.exacttarget.wsdl.partnerapi.SystemOutage insertNewOutage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SystemOutage target = null;
                target = (com.exacttarget.wsdl.partnerapi.SystemOutage)get_store().insert_element_user(OUTAGE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Outage" element
         */
        public com.exacttarget.wsdl.partnerapi.SystemOutage addNewOutage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SystemOutage target = null;
                target = (com.exacttarget.wsdl.partnerapi.SystemOutage)get_store().add_element_user(OUTAGE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Outage" element
         */
        public void removeOutage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OUTAGE$0, i);
            }
        }
    }
}
