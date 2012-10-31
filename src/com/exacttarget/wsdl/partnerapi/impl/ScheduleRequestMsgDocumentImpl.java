/*
 * An XML document type.
 * Localname: ScheduleRequestMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one ScheduleRequestMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class ScheduleRequestMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument
{
    
    public ScheduleRequestMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEDULEREQUESTMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ScheduleRequestMsg");
    
    
    /**
     * Gets the "ScheduleRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg getScheduleRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg)get_store().find_element_user(SCHEDULEREQUESTMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ScheduleRequestMsg" element
     */
    public void setScheduleRequestMsg(com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg scheduleRequestMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg)get_store().find_element_user(SCHEDULEREQUESTMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg)get_store().add_element_user(SCHEDULEREQUESTMSG$0);
            }
            target.set(scheduleRequestMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "ScheduleRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg addNewScheduleRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg)get_store().add_element_user(SCHEDULEREQUESTMSG$0);
            return target;
        }
    }
    /**
     * An XML ScheduleRequestMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ScheduleRequestMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg
    {
        
        public ScheduleRequestMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OPTIONS$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Options");
        private static final javax.xml.namespace.QName ACTION$2 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Action");
        private static final javax.xml.namespace.QName SCHEDULE$4 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Schedule");
        private static final javax.xml.namespace.QName INTERACTIONS$6 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Interactions");
        
        
        /**
         * Gets the "Options" element
         */
        public com.exacttarget.wsdl.partnerapi.ScheduleOptions getOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ScheduleOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.ScheduleOptions)get_store().find_element_user(OPTIONS$0, 0);
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
        public void setOptions(com.exacttarget.wsdl.partnerapi.ScheduleOptions options)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ScheduleOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.ScheduleOptions)get_store().find_element_user(OPTIONS$0, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.ScheduleOptions)get_store().add_element_user(OPTIONS$0);
                }
                target.set(options);
            }
        }
        
        /**
         * Appends and returns a new empty "Options" element
         */
        public com.exacttarget.wsdl.partnerapi.ScheduleOptions addNewOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ScheduleOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.ScheduleOptions)get_store().add_element_user(OPTIONS$0);
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
         * Gets the "Schedule" element
         */
        public com.exacttarget.wsdl.partnerapi.ScheduleDefinition getSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ScheduleDefinition target = null;
                target = (com.exacttarget.wsdl.partnerapi.ScheduleDefinition)get_store().find_element_user(SCHEDULE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Schedule" element
         */
        public boolean isSetSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCHEDULE$4) != 0;
            }
        }
        
        /**
         * Sets the "Schedule" element
         */
        public void setSchedule(com.exacttarget.wsdl.partnerapi.ScheduleDefinition schedule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ScheduleDefinition target = null;
                target = (com.exacttarget.wsdl.partnerapi.ScheduleDefinition)get_store().find_element_user(SCHEDULE$4, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.ScheduleDefinition)get_store().add_element_user(SCHEDULE$4);
                }
                target.set(schedule);
            }
        }
        
        /**
         * Appends and returns a new empty "Schedule" element
         */
        public com.exacttarget.wsdl.partnerapi.ScheduleDefinition addNewSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ScheduleDefinition target = null;
                target = (com.exacttarget.wsdl.partnerapi.ScheduleDefinition)get_store().add_element_user(SCHEDULE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "Schedule" element
         */
        public void unsetSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCHEDULE$4, 0);
            }
        }
        
        /**
         * Gets the "Interactions" element
         */
        public com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions getInteractions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions target = null;
                target = (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions)get_store().find_element_user(INTERACTIONS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Interactions" element
         */
        public boolean isSetInteractions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTERACTIONS$6) != 0;
            }
        }
        
        /**
         * Sets the "Interactions" element
         */
        public void setInteractions(com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions interactions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions target = null;
                target = (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions)get_store().find_element_user(INTERACTIONS$6, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions)get_store().add_element_user(INTERACTIONS$6);
                }
                target.set(interactions);
            }
        }
        
        /**
         * Appends and returns a new empty "Interactions" element
         */
        public com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions addNewInteractions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions target = null;
                target = (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions)get_store().add_element_user(INTERACTIONS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "Interactions" element
         */
        public void unsetInteractions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTERACTIONS$6, 0);
            }
        }
        /**
         * An XML Interactions(@http://exacttarget.com/wsdl/partnerAPI).
         *
         * This is a complex type.
         */
        public static class InteractionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions
        {
            
            public InteractionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INTERACTION$0 = 
                new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Interaction");
            
            
            /**
             * Gets array of all "Interaction" elements
             */
            public com.exacttarget.wsdl.partnerapi.APIObject[] getInteractionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INTERACTION$0, targetList);
                    com.exacttarget.wsdl.partnerapi.APIObject[] result = new com.exacttarget.wsdl.partnerapi.APIObject[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Interaction" element
             */
            public com.exacttarget.wsdl.partnerapi.APIObject getInteractionArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.APIObject target = null;
                    target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(INTERACTION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Interaction" element
             */
            public int sizeOfInteractionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INTERACTION$0);
                }
            }
            
            /**
             * Sets array of all "Interaction" element
             */
            public void setInteractionArray(com.exacttarget.wsdl.partnerapi.APIObject[] interactionArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(interactionArray, INTERACTION$0);
                }
            }
            
            /**
             * Sets ith "Interaction" element
             */
            public void setInteractionArray(int i, com.exacttarget.wsdl.partnerapi.APIObject interaction)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.APIObject target = null;
                    target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(INTERACTION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(interaction);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Interaction" element
             */
            public com.exacttarget.wsdl.partnerapi.APIObject insertNewInteraction(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.APIObject target = null;
                    target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().insert_element_user(INTERACTION$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Interaction" element
             */
            public com.exacttarget.wsdl.partnerapi.APIObject addNewInteraction()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.APIObject target = null;
                    target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(INTERACTION$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Interaction" element
             */
            public void removeInteraction(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INTERACTION$0, i);
                }
            }
        }
    }
}
