/*
 * XML Type:  SubscriberAddress
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SubscriberAddress
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SubscriberAddress(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SubscriberAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SubscriberAddress
{
    
    public SubscriberAddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSTYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AddressType");
    private static final javax.xml.namespace.QName ADDRESS$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Address");
    private static final javax.xml.namespace.QName STATUSES$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Statuses");
    
    
    /**
     * Gets the "AddressType" element
     */
    public java.lang.String getAddressType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressType" element
     */
    public org.apache.xmlbeans.XmlString xgetAddressType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AddressType" element
     */
    public boolean isSetAddressType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "AddressType" element
     */
    public void setAddressType(java.lang.String addressType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSTYPE$0);
            }
            target.setStringValue(addressType);
        }
    }
    
    /**
     * Sets (as xml) the "AddressType" element
     */
    public void xsetAddressType(org.apache.xmlbeans.XmlString addressType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSTYPE$0);
            }
            target.set(addressType);
        }
    }
    
    /**
     * Unsets the "AddressType" element
     */
    public void unsetAddressType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "Address" element
     */
    public java.lang.String getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Address" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$2) != 0;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(java.lang.String address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$2);
            }
            target.setStringValue(address);
        }
    }
    
    /**
     * Sets (as xml) the "Address" element
     */
    public void xsetAddress(org.apache.xmlbeans.XmlString address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$2);
            }
            target.set(address);
        }
    }
    
    /**
     * Unsets the "Address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$2, 0);
        }
    }
    
    /**
     * Gets the "Statuses" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberAddress.Statuses getStatuses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberAddress.Statuses target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberAddress.Statuses)get_store().find_element_user(STATUSES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Statuses" element
     */
    public boolean isSetStatuses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSES$4) != 0;
        }
    }
    
    /**
     * Sets the "Statuses" element
     */
    public void setStatuses(com.exacttarget.wsdl.partnerapi.SubscriberAddress.Statuses statuses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberAddress.Statuses target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberAddress.Statuses)get_store().find_element_user(STATUSES$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SubscriberAddress.Statuses)get_store().add_element_user(STATUSES$4);
            }
            target.set(statuses);
        }
    }
    
    /**
     * Appends and returns a new empty "Statuses" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberAddress.Statuses addNewStatuses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberAddress.Statuses target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberAddress.Statuses)get_store().add_element_user(STATUSES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Statuses" element
     */
    public void unsetStatuses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSES$4, 0);
        }
    }
    /**
     * An XML Statuses(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class StatusesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SubscriberAddress.Statuses
    {
        
        public StatusesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUS$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Status");
        
        
        /**
         * Gets array of all "Status" elements
         */
        public com.exacttarget.wsdl.partnerapi.AddressStatus[] getStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STATUS$0, targetList);
                com.exacttarget.wsdl.partnerapi.AddressStatus[] result = new com.exacttarget.wsdl.partnerapi.AddressStatus[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Status" element
         */
        public com.exacttarget.wsdl.partnerapi.AddressStatus getStatusArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.AddressStatus target = null;
                target = (com.exacttarget.wsdl.partnerapi.AddressStatus)get_store().find_element_user(STATUS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Status" element
         */
        public int sizeOfStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUS$0);
            }
        }
        
        /**
         * Sets array of all "Status" element
         */
        public void setStatusArray(com.exacttarget.wsdl.partnerapi.AddressStatus[] statusArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(statusArray, STATUS$0);
            }
        }
        
        /**
         * Sets ith "Status" element
         */
        public void setStatusArray(int i, com.exacttarget.wsdl.partnerapi.AddressStatus status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.AddressStatus target = null;
                target = (com.exacttarget.wsdl.partnerapi.AddressStatus)get_store().find_element_user(STATUS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(status);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Status" element
         */
        public com.exacttarget.wsdl.partnerapi.AddressStatus insertNewStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.AddressStatus target = null;
                target = (com.exacttarget.wsdl.partnerapi.AddressStatus)get_store().insert_element_user(STATUS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Status" element
         */
        public com.exacttarget.wsdl.partnerapi.AddressStatus addNewStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.AddressStatus target = null;
                target = (com.exacttarget.wsdl.partnerapi.AddressStatus)get_store().add_element_user(STATUS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Status" element
         */
        public void removeStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUS$0, i);
            }
        }
    }
}
