/*
 * XML Type:  APIFault
 * Namespace: urn:fault.partner.exacttarget.com
 * Java type: com.exacttarget.partner.fault.APIFault
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.partner.fault.impl;
/**
 * An XML APIFault(@urn:fault.partner.exacttarget.com).
 *
 * This is a complex type.
 */
public class APIFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.partner.fault.APIFault
{
    
    public APIFaultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("urn:fault.partner.exacttarget.com", "Code");
    private static final javax.xml.namespace.QName MESSAGE$2 = 
        new javax.xml.namespace.QName("urn:fault.partner.exacttarget.com", "Message");
    private static final javax.xml.namespace.QName LOGID$4 = 
        new javax.xml.namespace.QName("urn:fault.partner.exacttarget.com", "LogID");
    private static final javax.xml.namespace.QName PARAMS$6 = 
        new javax.xml.namespace.QName("urn:fault.partner.exacttarget.com", "Params");
    
    
    /**
     * Gets the "Code" element
     */
    public int getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Code" element
     */
    public org.apache.xmlbeans.XmlInt xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Code" element
     */
    public void setCode(int code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
            }
            target.setIntValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "Code" element
     */
    public void xsetCode(org.apache.xmlbeans.XmlInt code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Gets the "Message" element
     */
    public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Message" element
     */
    public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Message" element
     */
    public void setMessage(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$2);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "Message" element
     */
    public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$2);
            }
            target.set(message);
        }
    }
    
    /**
     * Gets the "LogID" element
     */
    public long getLogID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGID$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "LogID" element
     */
    public org.apache.xmlbeans.XmlLong xgetLogID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(LOGID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LogID" element
     */
    public boolean isSetLogID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGID$4) != 0;
        }
    }
    
    /**
     * Sets the "LogID" element
     */
    public void setLogID(long logID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGID$4);
            }
            target.setLongValue(logID);
        }
    }
    
    /**
     * Sets (as xml) the "LogID" element
     */
    public void xsetLogID(org.apache.xmlbeans.XmlLong logID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(LOGID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(LOGID$4);
            }
            target.set(logID);
        }
    }
    
    /**
     * Unsets the "LogID" element
     */
    public void unsetLogID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGID$4, 0);
        }
    }
    
    /**
     * Gets the "Params" element
     */
    public com.exacttarget.partner.fault.APIFault.Params getParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.partner.fault.APIFault.Params target = null;
            target = (com.exacttarget.partner.fault.APIFault.Params)get_store().find_element_user(PARAMS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Params" element
     */
    public boolean isSetParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMS$6) != 0;
        }
    }
    
    /**
     * Sets the "Params" element
     */
    public void setParams(com.exacttarget.partner.fault.APIFault.Params params)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.partner.fault.APIFault.Params target = null;
            target = (com.exacttarget.partner.fault.APIFault.Params)get_store().find_element_user(PARAMS$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.partner.fault.APIFault.Params)get_store().add_element_user(PARAMS$6);
            }
            target.set(params);
        }
    }
    
    /**
     * Appends and returns a new empty "Params" element
     */
    public com.exacttarget.partner.fault.APIFault.Params addNewParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.partner.fault.APIFault.Params target = null;
            target = (com.exacttarget.partner.fault.APIFault.Params)get_store().add_element_user(PARAMS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Params" element
     */
    public void unsetParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMS$6, 0);
        }
    }
    /**
     * An XML Params(@urn:fault.partner.exacttarget.com).
     *
     * This is a complex type.
     */
    public static class ParamsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.partner.fault.APIFault.Params
    {
        
        public ParamsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARAM$0 = 
            new javax.xml.namespace.QName("urn:fault.partner.exacttarget.com", "Param");
        
        
        /**
         * Gets array of all "Param" elements
         */
        public java.lang.String[] getParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARAM$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "Param" element
         */
        public java.lang.String getParamArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "Param" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARAM$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "Param" element
         */
        public org.apache.xmlbeans.XmlString xgetParamArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "Param" element
         */
        public int sizeOfParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARAM$0);
            }
        }
        
        /**
         * Sets array of all "Param" element
         */
        public void setParamArray(java.lang.String[] paramArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(paramArray, PARAM$0);
            }
        }
        
        /**
         * Sets ith "Param" element
         */
        public void setParamArray(int i, java.lang.String param)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(param);
            }
        }
        
        /**
         * Sets (as xml) array of all "Param" element
         */
        public void xsetParamArray(org.apache.xmlbeans.XmlString[]paramArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(paramArray, PARAM$0);
            }
        }
        
        /**
         * Sets (as xml) ith "Param" element
         */
        public void xsetParamArray(int i, org.apache.xmlbeans.XmlString param)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(param);
            }
        }
        
        /**
         * Inserts the value as the ith "Param" element
         */
        public void insertParam(int i, java.lang.String param)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PARAM$0, i);
                target.setStringValue(param);
            }
        }
        
        /**
         * Appends the value as the last "Param" element
         */
        public void addParam(java.lang.String param)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAM$0);
                target.setStringValue(param);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Param" element
         */
        public org.apache.xmlbeans.XmlString insertNewParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PARAM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Param" element
         */
        public org.apache.xmlbeans.XmlString addNewParam()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAM$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Param" element
         */
        public void removeParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARAM$0, i);
            }
        }
    }
}
