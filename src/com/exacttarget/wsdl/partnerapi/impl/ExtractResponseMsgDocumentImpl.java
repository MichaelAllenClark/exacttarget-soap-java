/*
 * An XML document type.
 * Localname: ExtractResponseMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ExtractResponseMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one ExtractResponseMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class ExtractResponseMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ExtractResponseMsgDocument
{
    
    public ExtractResponseMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRACTRESPONSEMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExtractResponseMsg");
    
    
    /**
     * Gets the "ExtractResponseMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractResponseMsgDocument.ExtractResponseMsg getExtractResponseMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractResponseMsgDocument.ExtractResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractResponseMsgDocument.ExtractResponseMsg)get_store().find_element_user(EXTRACTRESPONSEMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExtractResponseMsg" element
     */
    public void setExtractResponseMsg(com.exacttarget.wsdl.partnerapi.ExtractResponseMsgDocument.ExtractResponseMsg extractResponseMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractResponseMsgDocument.ExtractResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractResponseMsgDocument.ExtractResponseMsg)get_store().find_element_user(EXTRACTRESPONSEMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ExtractResponseMsgDocument.ExtractResponseMsg)get_store().add_element_user(EXTRACTRESPONSEMSG$0);
            }
            target.set(extractResponseMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "ExtractResponseMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractResponseMsgDocument.ExtractResponseMsg addNewExtractResponseMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractResponseMsgDocument.ExtractResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractResponseMsgDocument.ExtractResponseMsg)get_store().add_element_user(EXTRACTRESPONSEMSG$0);
            return target;
        }
    }
    /**
     * An XML ExtractResponseMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ExtractResponseMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ExtractResponseMsgDocument.ExtractResponseMsg
    {
        
        public ExtractResponseMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OVERALLSTATUS$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OverallStatus");
        private static final javax.xml.namespace.QName REQUESTID$2 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestID");
        private static final javax.xml.namespace.QName RESULTS$4 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Results");
        
        
        /**
         * Gets the "OverallStatus" element
         */
        public java.lang.String getOverallStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERALLSTATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OverallStatus" element
         */
        public org.apache.xmlbeans.XmlString xgetOverallStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERALLSTATUS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OverallStatus" element
         */
        public void setOverallStatus(java.lang.String overallStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERALLSTATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERALLSTATUS$0);
                }
                target.setStringValue(overallStatus);
            }
        }
        
        /**
         * Sets (as xml) the "OverallStatus" element
         */
        public void xsetOverallStatus(org.apache.xmlbeans.XmlString overallStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERALLSTATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OVERALLSTATUS$0);
                }
                target.set(overallStatus);
            }
        }
        
        /**
         * Gets the "RequestID" element
         */
        public java.lang.String getRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RequestID" element
         */
        public org.apache.xmlbeans.XmlString xgetRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "RequestID" element
         */
        public boolean isSetRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTID$2) != 0;
            }
        }
        
        /**
         * Sets the "RequestID" element
         */
        public void setRequestID(java.lang.String requestID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTID$2);
                }
                target.setStringValue(requestID);
            }
        }
        
        /**
         * Sets (as xml) the "RequestID" element
         */
        public void xsetRequestID(org.apache.xmlbeans.XmlString requestID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTID$2);
                }
                target.set(requestID);
            }
        }
        
        /**
         * Unsets the "RequestID" element
         */
        public void unsetRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTID$2, 0);
            }
        }
        
        /**
         * Gets array of all "Results" elements
         */
        public com.exacttarget.wsdl.partnerapi.ExtractResult[] getResultsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESULTS$4, targetList);
                com.exacttarget.wsdl.partnerapi.ExtractResult[] result = new com.exacttarget.wsdl.partnerapi.ExtractResult[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Results" element
         */
        public com.exacttarget.wsdl.partnerapi.ExtractResult getResultsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractResult target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractResult)get_store().find_element_user(RESULTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Results" element
         */
        public int sizeOfResultsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESULTS$4);
            }
        }
        
        /**
         * Sets array of all "Results" element
         */
        public void setResultsArray(com.exacttarget.wsdl.partnerapi.ExtractResult[] resultsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resultsArray, RESULTS$4);
            }
        }
        
        /**
         * Sets ith "Results" element
         */
        public void setResultsArray(int i, com.exacttarget.wsdl.partnerapi.ExtractResult results)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractResult target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractResult)get_store().find_element_user(RESULTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(results);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Results" element
         */
        public com.exacttarget.wsdl.partnerapi.ExtractResult insertNewResults(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractResult target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractResult)get_store().insert_element_user(RESULTS$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Results" element
         */
        public com.exacttarget.wsdl.partnerapi.ExtractResult addNewResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractResult target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractResult)get_store().add_element_user(RESULTS$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Results" element
         */
        public void removeResults(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESULTS$4, i);
            }
        }
    }
}
