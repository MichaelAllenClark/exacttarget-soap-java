/*
 * An XML document type.
 * Localname: ConfigureRequestMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one ConfigureRequestMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class ConfigureRequestMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument
{
    
    public ConfigureRequestMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIGUREREQUESTMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ConfigureRequestMsg");
    
    
    /**
     * Gets the "ConfigureRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg getConfigureRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg)get_store().find_element_user(CONFIGUREREQUESTMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConfigureRequestMsg" element
     */
    public void setConfigureRequestMsg(com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg configureRequestMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg)get_store().find_element_user(CONFIGUREREQUESTMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg)get_store().add_element_user(CONFIGUREREQUESTMSG$0);
            }
            target.set(configureRequestMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "ConfigureRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg addNewConfigureRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg)get_store().add_element_user(CONFIGUREREQUESTMSG$0);
            return target;
        }
    }
    /**
     * An XML ConfigureRequestMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ConfigureRequestMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg
    {
        
        public ConfigureRequestMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OPTIONS$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Options");
        private static final javax.xml.namespace.QName ACTION$2 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Action");
        private static final javax.xml.namespace.QName CONFIGURATIONS$4 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Configurations");
        
        
        /**
         * Gets the "Options" element
         */
        public com.exacttarget.wsdl.partnerapi.ConfigureOptions getOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ConfigureOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.ConfigureOptions)get_store().find_element_user(OPTIONS$0, 0);
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
        public void setOptions(com.exacttarget.wsdl.partnerapi.ConfigureOptions options)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ConfigureOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.ConfigureOptions)get_store().find_element_user(OPTIONS$0, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.ConfigureOptions)get_store().add_element_user(OPTIONS$0);
                }
                target.set(options);
            }
        }
        
        /**
         * Appends and returns a new empty "Options" element
         */
        public com.exacttarget.wsdl.partnerapi.ConfigureOptions addNewOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ConfigureOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.ConfigureOptions)get_store().add_element_user(OPTIONS$0);
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
         * Gets the "Configurations" element
         */
        public com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations getConfigurations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations target = null;
                target = (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations)get_store().find_element_user(CONFIGURATIONS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Configurations" element
         */
        public boolean isSetConfigurations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONFIGURATIONS$4) != 0;
            }
        }
        
        /**
         * Sets the "Configurations" element
         */
        public void setConfigurations(com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations configurations)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations target = null;
                target = (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations)get_store().find_element_user(CONFIGURATIONS$4, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations)get_store().add_element_user(CONFIGURATIONS$4);
                }
                target.set(configurations);
            }
        }
        
        /**
         * Appends and returns a new empty "Configurations" element
         */
        public com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations addNewConfigurations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations target = null;
                target = (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations)get_store().add_element_user(CONFIGURATIONS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "Configurations" element
         */
        public void unsetConfigurations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONFIGURATIONS$4, 0);
            }
        }
        /**
         * An XML Configurations(@http://exacttarget.com/wsdl/partnerAPI).
         *
         * This is a complex type.
         */
        public static class ConfigurationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations
        {
            
            public ConfigurationsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CONFIGURATION$0 = 
                new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Configuration");
            
            
            /**
             * Gets array of all "Configuration" elements
             */
            public com.exacttarget.wsdl.partnerapi.APIObject[] getConfigurationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CONFIGURATION$0, targetList);
                    com.exacttarget.wsdl.partnerapi.APIObject[] result = new com.exacttarget.wsdl.partnerapi.APIObject[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Configuration" element
             */
            public com.exacttarget.wsdl.partnerapi.APIObject getConfigurationArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.APIObject target = null;
                    target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(CONFIGURATION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Configuration" element
             */
            public int sizeOfConfigurationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CONFIGURATION$0);
                }
            }
            
            /**
             * Sets array of all "Configuration" element
             */
            public void setConfigurationArray(com.exacttarget.wsdl.partnerapi.APIObject[] configurationArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(configurationArray, CONFIGURATION$0);
                }
            }
            
            /**
             * Sets ith "Configuration" element
             */
            public void setConfigurationArray(int i, com.exacttarget.wsdl.partnerapi.APIObject configuration)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.APIObject target = null;
                    target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(CONFIGURATION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(configuration);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Configuration" element
             */
            public com.exacttarget.wsdl.partnerapi.APIObject insertNewConfiguration(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.APIObject target = null;
                    target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().insert_element_user(CONFIGURATION$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Configuration" element
             */
            public com.exacttarget.wsdl.partnerapi.APIObject addNewConfiguration()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.APIObject target = null;
                    target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(CONFIGURATION$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Configuration" element
             */
            public void removeConfiguration(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CONFIGURATION$0, i);
                }
            }
        }
    }
}
