/*
 * XML Type:  Options
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Options
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Options(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class OptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.Options
{
    
    public OptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Client");
    private static final javax.xml.namespace.QName SENDRESPONSETO$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendResponseTo");
    private static final javax.xml.namespace.QName SAVEOPTIONS$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SaveOptions");
    private static final javax.xml.namespace.QName PRIORITY$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Priority");
    private static final javax.xml.namespace.QName CONVERSATIONID$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ConversationID");
    private static final javax.xml.namespace.QName SEQUENCECODE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SequenceCode");
    private static final javax.xml.namespace.QName CALLSINCONVERSATION$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CallsInConversation");
    private static final javax.xml.namespace.QName SCHEDULEDTIME$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ScheduledTime");
    private static final javax.xml.namespace.QName REQUESTTYPE$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestType");
    private static final javax.xml.namespace.QName QUEUEPRIORITY$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "QueuePriority");
    
    
    /**
     * Gets the "Client" element
     */
    public com.exacttarget.wsdl.partnerapi.ClientID getClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().find_element_user(CLIENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Client" element
     */
    public boolean isSetClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENT$0) != 0;
        }
    }
    
    /**
     * Sets the "Client" element
     */
    public void setClient(com.exacttarget.wsdl.partnerapi.ClientID client)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().find_element_user(CLIENT$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().add_element_user(CLIENT$0);
            }
            target.set(client);
        }
    }
    
    /**
     * Appends and returns a new empty "Client" element
     */
    public com.exacttarget.wsdl.partnerapi.ClientID addNewClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().add_element_user(CLIENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Client" element
     */
    public void unsetClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENT$0, 0);
        }
    }
    
    /**
     * Gets array of all "SendResponseTo" elements
     */
    public com.exacttarget.wsdl.partnerapi.AsyncResponse[] getSendResponseToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SENDRESPONSETO$2, targetList);
            com.exacttarget.wsdl.partnerapi.AsyncResponse[] result = new com.exacttarget.wsdl.partnerapi.AsyncResponse[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SendResponseTo" element
     */
    public com.exacttarget.wsdl.partnerapi.AsyncResponse getSendResponseToArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AsyncResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.AsyncResponse)get_store().find_element_user(SENDRESPONSETO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SendResponseTo" element
     */
    public int sizeOfSendResponseToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDRESPONSETO$2);
        }
    }
    
    /**
     * Sets array of all "SendResponseTo" element
     */
    public void setSendResponseToArray(com.exacttarget.wsdl.partnerapi.AsyncResponse[] sendResponseToArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sendResponseToArray, SENDRESPONSETO$2);
        }
    }
    
    /**
     * Sets ith "SendResponseTo" element
     */
    public void setSendResponseToArray(int i, com.exacttarget.wsdl.partnerapi.AsyncResponse sendResponseTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AsyncResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.AsyncResponse)get_store().find_element_user(SENDRESPONSETO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sendResponseTo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SendResponseTo" element
     */
    public com.exacttarget.wsdl.partnerapi.AsyncResponse insertNewSendResponseTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AsyncResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.AsyncResponse)get_store().insert_element_user(SENDRESPONSETO$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SendResponseTo" element
     */
    public com.exacttarget.wsdl.partnerapi.AsyncResponse addNewSendResponseTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AsyncResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.AsyncResponse)get_store().add_element_user(SENDRESPONSETO$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "SendResponseTo" element
     */
    public void removeSendResponseTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDRESPONSETO$2, i);
        }
    }
    
    /**
     * Gets the "SaveOptions" element
     */
    public com.exacttarget.wsdl.partnerapi.Options.SaveOptions getSaveOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Options.SaveOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.Options.SaveOptions)get_store().find_element_user(SAVEOPTIONS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SaveOptions" element
     */
    public boolean isSetSaveOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAVEOPTIONS$4) != 0;
        }
    }
    
    /**
     * Sets the "SaveOptions" element
     */
    public void setSaveOptions(com.exacttarget.wsdl.partnerapi.Options.SaveOptions saveOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Options.SaveOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.Options.SaveOptions)get_store().find_element_user(SAVEOPTIONS$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Options.SaveOptions)get_store().add_element_user(SAVEOPTIONS$4);
            }
            target.set(saveOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "SaveOptions" element
     */
    public com.exacttarget.wsdl.partnerapi.Options.SaveOptions addNewSaveOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Options.SaveOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.Options.SaveOptions)get_store().add_element_user(SAVEOPTIONS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "SaveOptions" element
     */
    public void unsetSaveOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAVEOPTIONS$4, 0);
        }
    }
    
    /**
     * Gets the "Priority" element
     */
    public byte getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getByteValue();
        }
    }
    
    /**
     * Gets (as xml) the "Priority" element
     */
    public org.apache.xmlbeans.XmlByte xgetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(PRIORITY$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Priority" element
     */
    public boolean isSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITY$6) != 0;
        }
    }
    
    /**
     * Sets the "Priority" element
     */
    public void setPriority(byte priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$6);
            }
            target.setByteValue(priority);
        }
    }
    
    /**
     * Sets (as xml) the "Priority" element
     */
    public void xsetPriority(org.apache.xmlbeans.XmlByte priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(PRIORITY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlByte)get_store().add_element_user(PRIORITY$6);
            }
            target.set(priority);
        }
    }
    
    /**
     * Unsets the "Priority" element
     */
    public void unsetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITY$6, 0);
        }
    }
    
    /**
     * Gets the "ConversationID" element
     */
    public java.lang.String getConversationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONVERSATIONID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConversationID" element
     */
    public org.apache.xmlbeans.XmlString xgetConversationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONVERSATIONID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConversationID" element
     */
    public boolean isSetConversationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONVERSATIONID$8) != 0;
        }
    }
    
    /**
     * Sets the "ConversationID" element
     */
    public void setConversationID(java.lang.String conversationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONVERSATIONID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONVERSATIONID$8);
            }
            target.setStringValue(conversationID);
        }
    }
    
    /**
     * Sets (as xml) the "ConversationID" element
     */
    public void xsetConversationID(org.apache.xmlbeans.XmlString conversationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONVERSATIONID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONVERSATIONID$8);
            }
            target.set(conversationID);
        }
    }
    
    /**
     * Unsets the "ConversationID" element
     */
    public void unsetConversationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONVERSATIONID$8, 0);
        }
    }
    
    /**
     * Gets the "SequenceCode" element
     */
    public int getSequenceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENCECODE$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SequenceCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetSequenceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQUENCECODE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "SequenceCode" element
     */
    public boolean isSetSequenceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEQUENCECODE$10) != 0;
        }
    }
    
    /**
     * Sets the "SequenceCode" element
     */
    public void setSequenceCode(int sequenceCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENCECODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQUENCECODE$10);
            }
            target.setIntValue(sequenceCode);
        }
    }
    
    /**
     * Sets (as xml) the "SequenceCode" element
     */
    public void xsetSequenceCode(org.apache.xmlbeans.XmlInt sequenceCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQUENCECODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SEQUENCECODE$10);
            }
            target.set(sequenceCode);
        }
    }
    
    /**
     * Unsets the "SequenceCode" element
     */
    public void unsetSequenceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEQUENCECODE$10, 0);
        }
    }
    
    /**
     * Gets the "CallsInConversation" element
     */
    public int getCallsInConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLSINCONVERSATION$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CallsInConversation" element
     */
    public org.apache.xmlbeans.XmlInt xgetCallsInConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CALLSINCONVERSATION$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "CallsInConversation" element
     */
    public boolean isSetCallsInConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALLSINCONVERSATION$12) != 0;
        }
    }
    
    /**
     * Sets the "CallsInConversation" element
     */
    public void setCallsInConversation(int callsInConversation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLSINCONVERSATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALLSINCONVERSATION$12);
            }
            target.setIntValue(callsInConversation);
        }
    }
    
    /**
     * Sets (as xml) the "CallsInConversation" element
     */
    public void xsetCallsInConversation(org.apache.xmlbeans.XmlInt callsInConversation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CALLSINCONVERSATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CALLSINCONVERSATION$12);
            }
            target.set(callsInConversation);
        }
    }
    
    /**
     * Unsets the "CallsInConversation" element
     */
    public void unsetCallsInConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALLSINCONVERSATION$12, 0);
        }
    }
    
    /**
     * Gets the "ScheduledTime" element
     */
    public java.util.Calendar getScheduledTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDTIME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScheduledTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetScheduledTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SCHEDULEDTIME$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "ScheduledTime" element
     */
    public boolean isSetScheduledTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULEDTIME$14) != 0;
        }
    }
    
    /**
     * Sets the "ScheduledTime" element
     */
    public void setScheduledTime(java.util.Calendar scheduledTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDTIME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEDULEDTIME$14);
            }
            target.setCalendarValue(scheduledTime);
        }
    }
    
    /**
     * Sets (as xml) the "ScheduledTime" element
     */
    public void xsetScheduledTime(org.apache.xmlbeans.XmlDateTime scheduledTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SCHEDULEDTIME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SCHEDULEDTIME$14);
            }
            target.set(scheduledTime);
        }
    }
    
    /**
     * Unsets the "ScheduledTime" element
     */
    public void unsetScheduledTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULEDTIME$14, 0);
        }
    }
    
    /**
     * Gets the "RequestType" element
     */
    public com.exacttarget.wsdl.partnerapi.RequestType.Enum getRequestType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTTYPE$16, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.RequestType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestType" element
     */
    public com.exacttarget.wsdl.partnerapi.RequestType xgetRequestType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RequestType target = null;
            target = (com.exacttarget.wsdl.partnerapi.RequestType)get_store().find_element_user(REQUESTTYPE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "RequestType" element
     */
    public boolean isSetRequestType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTTYPE$16) != 0;
        }
    }
    
    /**
     * Sets the "RequestType" element
     */
    public void setRequestType(com.exacttarget.wsdl.partnerapi.RequestType.Enum requestType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTTYPE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTTYPE$16);
            }
            target.setEnumValue(requestType);
        }
    }
    
    /**
     * Sets (as xml) the "RequestType" element
     */
    public void xsetRequestType(com.exacttarget.wsdl.partnerapi.RequestType requestType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RequestType target = null;
            target = (com.exacttarget.wsdl.partnerapi.RequestType)get_store().find_element_user(REQUESTTYPE$16, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.RequestType)get_store().add_element_user(REQUESTTYPE$16);
            }
            target.set(requestType);
        }
    }
    
    /**
     * Unsets the "RequestType" element
     */
    public void unsetRequestType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTTYPE$16, 0);
        }
    }
    
    /**
     * Gets the "QueuePriority" element
     */
    public com.exacttarget.wsdl.partnerapi.Priority.Enum getQueuePriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUEUEPRIORITY$18, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.Priority.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "QueuePriority" element
     */
    public com.exacttarget.wsdl.partnerapi.Priority xgetQueuePriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Priority target = null;
            target = (com.exacttarget.wsdl.partnerapi.Priority)get_store().find_element_user(QUEUEPRIORITY$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "QueuePriority" element
     */
    public boolean isSetQueuePriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUEUEPRIORITY$18) != 0;
        }
    }
    
    /**
     * Sets the "QueuePriority" element
     */
    public void setQueuePriority(com.exacttarget.wsdl.partnerapi.Priority.Enum queuePriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUEUEPRIORITY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUEUEPRIORITY$18);
            }
            target.setEnumValue(queuePriority);
        }
    }
    
    /**
     * Sets (as xml) the "QueuePriority" element
     */
    public void xsetQueuePriority(com.exacttarget.wsdl.partnerapi.Priority queuePriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Priority target = null;
            target = (com.exacttarget.wsdl.partnerapi.Priority)get_store().find_element_user(QUEUEPRIORITY$18, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Priority)get_store().add_element_user(QUEUEPRIORITY$18);
            }
            target.set(queuePriority);
        }
    }
    
    /**
     * Unsets the "QueuePriority" element
     */
    public void unsetQueuePriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUEUEPRIORITY$18, 0);
        }
    }
    /**
     * An XML SaveOptions(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class SaveOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.Options.SaveOptions
    {
        
        public SaveOptionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SAVEOPTION$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SaveOption");
        
        
        /**
         * Gets array of all "SaveOption" elements
         */
        public com.exacttarget.wsdl.partnerapi.SaveOption[] getSaveOptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SAVEOPTION$0, targetList);
                com.exacttarget.wsdl.partnerapi.SaveOption[] result = new com.exacttarget.wsdl.partnerapi.SaveOption[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SaveOption" element
         */
        public com.exacttarget.wsdl.partnerapi.SaveOption getSaveOptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SaveOption target = null;
                target = (com.exacttarget.wsdl.partnerapi.SaveOption)get_store().find_element_user(SAVEOPTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SaveOption" element
         */
        public int sizeOfSaveOptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SAVEOPTION$0);
            }
        }
        
        /**
         * Sets array of all "SaveOption" element
         */
        public void setSaveOptionArray(com.exacttarget.wsdl.partnerapi.SaveOption[] saveOptionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(saveOptionArray, SAVEOPTION$0);
            }
        }
        
        /**
         * Sets ith "SaveOption" element
         */
        public void setSaveOptionArray(int i, com.exacttarget.wsdl.partnerapi.SaveOption saveOption)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SaveOption target = null;
                target = (com.exacttarget.wsdl.partnerapi.SaveOption)get_store().find_element_user(SAVEOPTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(saveOption);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SaveOption" element
         */
        public com.exacttarget.wsdl.partnerapi.SaveOption insertNewSaveOption(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SaveOption target = null;
                target = (com.exacttarget.wsdl.partnerapi.SaveOption)get_store().insert_element_user(SAVEOPTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SaveOption" element
         */
        public com.exacttarget.wsdl.partnerapi.SaveOption addNewSaveOption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SaveOption target = null;
                target = (com.exacttarget.wsdl.partnerapi.SaveOption)get_store().add_element_user(SAVEOPTION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "SaveOption" element
         */
        public void removeSaveOption(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SAVEOPTION$0, i);
            }
        }
    }
}
