/*
 * An XML document type.
 * Localname: PerformRequestMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one PerformRequestMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class PerformRequestMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument
{
    
    public PerformRequestMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERFORMREQUESTMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PerformRequestMsg");
    
    
    /**
     * Gets the "PerformRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg getPerformRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg)get_store().find_element_user(PERFORMREQUESTMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PerformRequestMsg" element
     */
    public void setPerformRequestMsg(com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg performRequestMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg)get_store().find_element_user(PERFORMREQUESTMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg)get_store().add_element_user(PERFORMREQUESTMSG$0);
            }
            target.set(performRequestMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "PerformRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg addNewPerformRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg)get_store().add_element_user(PERFORMREQUESTMSG$0);
            return target;
        }
    }
    /**
     * An XML PerformRequestMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class PerformRequestMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg
    {
        
        public PerformRequestMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OPTIONS$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Options");
        private static final javax.xml.namespace.QName ACTION$2 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Action");
        private static final javax.xml.namespace.QName DEFINITIONS$4 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Definitions");
        
        
        /**
         * Gets the "Options" element
         */
        public com.exacttarget.wsdl.partnerapi.PerformOptions getOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PerformOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.PerformOptions)get_store().find_element_user(OPTIONS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Options" element
         */
        public boolean isSetOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPTIONS$0) != 0;
            }
        }
        
        /**
         * Sets the "Options" element
         */
        public void setOptions(com.exacttarget.wsdl.partnerapi.PerformOptions options)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PerformOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.PerformOptions)get_store().find_element_user(OPTIONS$0, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.PerformOptions)get_store().add_element_user(OPTIONS$0);
                }
                target.set(options);
            }
        }
        
        /**
         * Appends and returns a new empty "Options" element
         */
        public com.exacttarget.wsdl.partnerapi.PerformOptions addNewOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PerformOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.PerformOptions)get_store().add_element_user(OPTIONS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Options" element
         */
        public void unsetOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPTIONS$0, 0);
            }
        }
        
        /**
         * Gets the "Action" element
         */
        public java.lang.String getAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Action" element
         */
        public org.apache.xmlbeans.XmlString xgetAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Action" element
         */
        public boolean isSetAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACTION$2) != 0;
            }
        }
        
        /**
         * Sets the "Action" element
         */
        public void setAction(java.lang.String action)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTION$2);
                }
                target.setStringValue(action);
            }
        }
        
        /**
         * Sets (as xml) the "Action" element
         */
        public void xsetAction(org.apache.xmlbeans.XmlString action)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTION$2);
                }
                target.set(action);
            }
        }
        
        /**
         * Unsets the "Action" element
         */
        public void unsetAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACTION$2, 0);
            }
        }
        
        /**
         * Gets the "Definitions" element
         */
        public com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg.Definitions getDefinitions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg.Definitions target = null;
                target = (com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg.Definitions)get_store().find_element_user(DEFINITIONS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Definitions" element
         */
        public boolean isSetDefinitions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEFINITIONS$4) != 0;
            }
        }
        
        /**
         * Sets the "Definitions" element
         */
        public void setDefinitions(com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg.Definitions definitions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg.Definitions target = null;
                target = (com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg.Definitions)get_store().find_element_user(DEFINITIONS$4, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg.Definitions)get_store().add_element_user(DEFINITIONS$4);
                }
                target.set(definitions);
            }
        }
        
        /**
         * Appends and returns a new empty "Definitions" element
         */
        public com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg.Definitions addNewDefinitions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg.Definitions target = null;
                target = (com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg.Definitions)get_store().add_element_user(DEFINITIONS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "Definitions" element
         */
        public void unsetDefinitions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEFINITIONS$4, 0);
            }
        }
        /**
         * An XML Definitions(@http://exacttarget.com/wsdl/partnerAPI).
         *
         * This is a complex type.
         */
        public static class DefinitionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg.Definitions
        {
            
            public DefinitionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DEFINITION$0 = 
                new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Definition");
            
            
            /**
             * Gets array of all "Definition" elements
             */
            public com.exacttarget.wsdl.partnerapi.APIObject[] getDefinitionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DEFINITION$0, targetList);
                    com.exacttarget.wsdl.partnerapi.APIObject[] result = new com.exacttarget.wsdl.partnerapi.APIObject[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Definition" element
             */
            public com.exacttarget.wsdl.partnerapi.APIObject getDefinitionArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.APIObject target = null;
                    target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(DEFINITION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Definition" element
             */
            public int sizeOfDefinitionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DEFINITION$0);
                }
            }
            
            /**
             * Sets array of all "Definition" element
             */
            public void setDefinitionArray(com.exacttarget.wsdl.partnerapi.APIObject[] definitionArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(definitionArray, DEFINITION$0);
                }
            }
            
            /**
             * Sets ith "Definition" element
             */
            public void setDefinitionArray(int i, com.exacttarget.wsdl.partnerapi.APIObject definition)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.APIObject target = null;
                    target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(DEFINITION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(definition);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Definition" element
             */
            public com.exacttarget.wsdl.partnerapi.APIObject insertNewDefinition(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.APIObject target = null;
                    target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().insert_element_user(DEFINITION$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Definition" element
             */
            public com.exacttarget.wsdl.partnerapi.APIObject addNewDefinition()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.APIObject target = null;
                    target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(DEFINITION$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Definition" element
             */
            public void removeDefinition(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DEFINITION$0, i);
                }
            }
        }
    }
}
