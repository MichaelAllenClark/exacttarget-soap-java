/*
 * XML Type:  PerformResponse
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PerformResponse
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML PerformResponse(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class PerformResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PerformResponse
{
    
    public PerformResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSCODE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "StatusCode");
    private static final javax.xml.namespace.QName STATUSMESSAGE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "StatusMessage");
    private static final javax.xml.namespace.QName ORDINALID$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OrdinalID");
    private static final javax.xml.namespace.QName RESULTS$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Results");
    private static final javax.xml.namespace.QName ERRORCODE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ErrorCode");
    
    
    /**
     * Gets the "StatusCode" element
     */
    public java.lang.String getStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StatusCode" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "StatusCode" element
     */
    public boolean isSetStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "StatusCode" element
     */
    public void setStatusCode(java.lang.String statusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSCODE$0);
            }
            target.setStringValue(statusCode);
        }
    }
    
    /**
     * Sets (as xml) the "StatusCode" element
     */
    public void xsetStatusCode(org.apache.xmlbeans.XmlString statusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSCODE$0);
            }
            target.set(statusCode);
        }
    }
    
    /**
     * Unsets the "StatusCode" element
     */
    public void unsetStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSCODE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSMESSAGE$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSMESSAGE$2, 0);
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
            return get_store().count_elements(STATUSMESSAGE$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSMESSAGE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSMESSAGE$2);
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
            get_store().remove_element(STATUSMESSAGE$2, 0);
        }
    }
    
    /**
     * Gets the "OrdinalID" element
     */
    public int getOrdinalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDINALID$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrdinalID" element
     */
    public org.apache.xmlbeans.XmlInt xgetOrdinalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDINALID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrdinalID" element
     */
    public boolean isSetOrdinalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDINALID$4) != 0;
        }
    }
    
    /**
     * Sets the "OrdinalID" element
     */
    public void setOrdinalID(int ordinalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDINALID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDINALID$4);
            }
            target.setIntValue(ordinalID);
        }
    }
    
    /**
     * Sets (as xml) the "OrdinalID" element
     */
    public void xsetOrdinalID(org.apache.xmlbeans.XmlInt ordinalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDINALID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ORDINALID$4);
            }
            target.set(ordinalID);
        }
    }
    
    /**
     * Unsets the "OrdinalID" element
     */
    public void unsetOrdinalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDINALID$4, 0);
        }
    }
    
    /**
     * Gets the "Results" element
     */
    public com.exacttarget.wsdl.partnerapi.PerformResponse.Results getResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PerformResponse.Results target = null;
            target = (com.exacttarget.wsdl.partnerapi.PerformResponse.Results)get_store().find_element_user(RESULTS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Results" element
     */
    public boolean isSetResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULTS$6) != 0;
        }
    }
    
    /**
     * Sets the "Results" element
     */
    public void setResults(com.exacttarget.wsdl.partnerapi.PerformResponse.Results results)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PerformResponse.Results target = null;
            target = (com.exacttarget.wsdl.partnerapi.PerformResponse.Results)get_store().find_element_user(RESULTS$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PerformResponse.Results)get_store().add_element_user(RESULTS$6);
            }
            target.set(results);
        }
    }
    
    /**
     * Appends and returns a new empty "Results" element
     */
    public com.exacttarget.wsdl.partnerapi.PerformResponse.Results addNewResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PerformResponse.Results target = null;
            target = (com.exacttarget.wsdl.partnerapi.PerformResponse.Results)get_store().add_element_user(RESULTS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Results" element
     */
    public void unsetResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULTS$6, 0);
        }
    }
    
    /**
     * Gets the "ErrorCode" element
     */
    public int getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRORCODE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ErrorCode" element
     */
    public boolean isSetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORCODE$8) != 0;
        }
    }
    
    /**
     * Sets the "ErrorCode" element
     */
    public void setErrorCode(int errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORCODE$8);
            }
            target.setIntValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    public void xsetErrorCode(org.apache.xmlbeans.XmlInt errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRORCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ERRORCODE$8);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Unsets the "ErrorCode" element
     */
    public void unsetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORCODE$8, 0);
        }
    }
    /**
     * An XML Results(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PerformResponse.Results
    {
        
        public ResultsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESULT$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Result");
        
        
        /**
         * Gets array of all "Result" elements
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty[] getResultArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESULT$0, targetList);
                com.exacttarget.wsdl.partnerapi.APIProperty[] result = new com.exacttarget.wsdl.partnerapi.APIProperty[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Result" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty getResultArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(RESULT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Result" element
         */
        public int sizeOfResultArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESULT$0);
            }
        }
        
        /**
         * Sets array of all "Result" element
         */
        public void setResultArray(com.exacttarget.wsdl.partnerapi.APIProperty[] resultArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resultArray, RESULT$0);
            }
        }
        
        /**
         * Sets ith "Result" element
         */
        public void setResultArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty result)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(RESULT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(result);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Result" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty insertNewResult(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().insert_element_user(RESULT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Result" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty addNewResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().add_element_user(RESULT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Result" element
         */
        public void removeResult(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESULT$0, i);
            }
        }
    }
}
