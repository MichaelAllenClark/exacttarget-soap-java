/*
 * An XML document type.
 * Localname: ScheduleResponseMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one ScheduleResponseMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class ScheduleResponseMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument
{
    
    public ScheduleResponseMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEDULERESPONSEMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ScheduleResponseMsg");
    
    
    /**
     * Gets the "ScheduleResponseMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg getScheduleResponseMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg)get_store().find_element_user(SCHEDULERESPONSEMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ScheduleResponseMsg" element
     */
    public void setScheduleResponseMsg(com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg scheduleResponseMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg)get_store().find_element_user(SCHEDULERESPONSEMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg)get_store().add_element_user(SCHEDULERESPONSEMSG$0);
            }
            target.set(scheduleResponseMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "ScheduleResponseMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg addNewScheduleResponseMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg)get_store().add_element_user(SCHEDULERESPONSEMSG$0);
            return target;
        }
    }
    /**
     * An XML ScheduleResponseMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ScheduleResponseMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg
    {
        
        public ScheduleResponseMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESULTS$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Results");
        private static final javax.xml.namespace.QName OVERALLSTATUS$2 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OverallStatus");
        private static final javax.xml.namespace.QName OVERALLSTATUSMESSAGE$4 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OverallStatusMessage");
        private static final javax.xml.namespace.QName REQUESTID$6 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestID");
        
        
        /**
         * Gets the "Results" element
         */
        public com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg.Results getResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg.Results target = null;
                target = (com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg.Results)get_store().find_element_user(RESULTS$0, 0);
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
                return get_store().count_elements(RESULTS$0) != 0;
            }
        }
        
        /**
         * Sets the "Results" element
         */
        public void setResults(com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg.Results results)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg.Results target = null;
                target = (com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg.Results)get_store().find_element_user(RESULTS$0, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg.Results)get_store().add_element_user(RESULTS$0);
                }
                target.set(results);
            }
        }
        
        /**
         * Appends and returns a new empty "Results" element
         */
        public com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg.Results addNewResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg.Results target = null;
                target = (com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg.Results)get_store().add_element_user(RESULTS$0);
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
                get_store().remove_element(RESULTS$0, 0);
            }
        }
        
        /**
         * Gets the "OverallStatus" element
         */
        public java.lang.String getOverallStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERALLSTATUS$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERALLSTATUS$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERALLSTATUS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERALLSTATUS$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERALLSTATUS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OVERALLSTATUS$2);
                }
                target.set(overallStatus);
            }
        }
        
        /**
         * Gets the "OverallStatusMessage" element
         */
        public java.lang.String getOverallStatusMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERALLSTATUSMESSAGE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OverallStatusMessage" element
         */
        public org.apache.xmlbeans.XmlString xgetOverallStatusMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERALLSTATUSMESSAGE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OverallStatusMessage" element
         */
        public void setOverallStatusMessage(java.lang.String overallStatusMessage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERALLSTATUSMESSAGE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERALLSTATUSMESSAGE$4);
                }
                target.setStringValue(overallStatusMessage);
            }
        }
        
        /**
         * Sets (as xml) the "OverallStatusMessage" element
         */
        public void xsetOverallStatusMessage(org.apache.xmlbeans.XmlString overallStatusMessage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERALLSTATUSMESSAGE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OVERALLSTATUSMESSAGE$4);
                }
                target.set(overallStatusMessage);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$6, 0);
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
                return get_store().count_elements(REQUESTID$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTID$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTID$6);
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
                get_store().remove_element(REQUESTID$6, 0);
            }
        }
        /**
         * An XML Results(@http://exacttarget.com/wsdl/partnerAPI).
         *
         * This is a complex type.
         */
        public static class ResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument.ScheduleResponseMsg.Results
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
            public com.exacttarget.wsdl.partnerapi.ScheduleResult[] getResultArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RESULT$0, targetList);
                    com.exacttarget.wsdl.partnerapi.ScheduleResult[] result = new com.exacttarget.wsdl.partnerapi.ScheduleResult[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Result" element
             */
            public com.exacttarget.wsdl.partnerapi.ScheduleResult getResultArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.ScheduleResult target = null;
                    target = (com.exacttarget.wsdl.partnerapi.ScheduleResult)get_store().find_element_user(RESULT$0, i);
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
            public void setResultArray(com.exacttarget.wsdl.partnerapi.ScheduleResult[] resultArray)
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
            public void setResultArray(int i, com.exacttarget.wsdl.partnerapi.ScheduleResult result)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.ScheduleResult target = null;
                    target = (com.exacttarget.wsdl.partnerapi.ScheduleResult)get_store().find_element_user(RESULT$0, i);
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
            public com.exacttarget.wsdl.partnerapi.ScheduleResult insertNewResult(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.ScheduleResult target = null;
                    target = (com.exacttarget.wsdl.partnerapi.ScheduleResult)get_store().insert_element_user(RESULT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Result" element
             */
            public com.exacttarget.wsdl.partnerapi.ScheduleResult addNewResult()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.ScheduleResult target = null;
                    target = (com.exacttarget.wsdl.partnerapi.ScheduleResult)get_store().add_element_user(RESULT$0);
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
}
