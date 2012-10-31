/*
 * XML Type:  Options
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Options
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML Options(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface Options extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Options.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("options0aeatype");
    
    /**
     * Gets the "Client" element
     */
    com.exacttarget.wsdl.partnerapi.ClientID getClient();
    
    /**
     * True if has "Client" element
     */
    boolean isSetClient();
    
    /**
     * Sets the "Client" element
     */
    void setClient(com.exacttarget.wsdl.partnerapi.ClientID client);
    
    /**
     * Appends and returns a new empty "Client" element
     */
    com.exacttarget.wsdl.partnerapi.ClientID addNewClient();
    
    /**
     * Unsets the "Client" element
     */
    void unsetClient();
    
    /**
     * Gets array of all "SendResponseTo" elements
     */
    com.exacttarget.wsdl.partnerapi.AsyncResponse[] getSendResponseToArray();
    
    /**
     * Gets ith "SendResponseTo" element
     */
    com.exacttarget.wsdl.partnerapi.AsyncResponse getSendResponseToArray(int i);
    
    /**
     * Returns number of "SendResponseTo" element
     */
    int sizeOfSendResponseToArray();
    
    /**
     * Sets array of all "SendResponseTo" element
     */
    void setSendResponseToArray(com.exacttarget.wsdl.partnerapi.AsyncResponse[] sendResponseToArray);
    
    /**
     * Sets ith "SendResponseTo" element
     */
    void setSendResponseToArray(int i, com.exacttarget.wsdl.partnerapi.AsyncResponse sendResponseTo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SendResponseTo" element
     */
    com.exacttarget.wsdl.partnerapi.AsyncResponse insertNewSendResponseTo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SendResponseTo" element
     */
    com.exacttarget.wsdl.partnerapi.AsyncResponse addNewSendResponseTo();
    
    /**
     * Removes the ith "SendResponseTo" element
     */
    void removeSendResponseTo(int i);
    
    /**
     * Gets the "SaveOptions" element
     */
    com.exacttarget.wsdl.partnerapi.Options.SaveOptions getSaveOptions();
    
    /**
     * True if has "SaveOptions" element
     */
    boolean isSetSaveOptions();
    
    /**
     * Sets the "SaveOptions" element
     */
    void setSaveOptions(com.exacttarget.wsdl.partnerapi.Options.SaveOptions saveOptions);
    
    /**
     * Appends and returns a new empty "SaveOptions" element
     */
    com.exacttarget.wsdl.partnerapi.Options.SaveOptions addNewSaveOptions();
    
    /**
     * Unsets the "SaveOptions" element
     */
    void unsetSaveOptions();
    
    /**
     * Gets the "Priority" element
     */
    byte getPriority();
    
    /**
     * Gets (as xml) the "Priority" element
     */
    org.apache.xmlbeans.XmlByte xgetPriority();
    
    /**
     * True if has "Priority" element
     */
    boolean isSetPriority();
    
    /**
     * Sets the "Priority" element
     */
    void setPriority(byte priority);
    
    /**
     * Sets (as xml) the "Priority" element
     */
    void xsetPriority(org.apache.xmlbeans.XmlByte priority);
    
    /**
     * Unsets the "Priority" element
     */
    void unsetPriority();
    
    /**
     * Gets the "ConversationID" element
     */
    java.lang.String getConversationID();
    
    /**
     * Gets (as xml) the "ConversationID" element
     */
    org.apache.xmlbeans.XmlString xgetConversationID();
    
    /**
     * True if has "ConversationID" element
     */
    boolean isSetConversationID();
    
    /**
     * Sets the "ConversationID" element
     */
    void setConversationID(java.lang.String conversationID);
    
    /**
     * Sets (as xml) the "ConversationID" element
     */
    void xsetConversationID(org.apache.xmlbeans.XmlString conversationID);
    
    /**
     * Unsets the "ConversationID" element
     */
    void unsetConversationID();
    
    /**
     * Gets the "SequenceCode" element
     */
    int getSequenceCode();
    
    /**
     * Gets (as xml) the "SequenceCode" element
     */
    org.apache.xmlbeans.XmlInt xgetSequenceCode();
    
    /**
     * True if has "SequenceCode" element
     */
    boolean isSetSequenceCode();
    
    /**
     * Sets the "SequenceCode" element
     */
    void setSequenceCode(int sequenceCode);
    
    /**
     * Sets (as xml) the "SequenceCode" element
     */
    void xsetSequenceCode(org.apache.xmlbeans.XmlInt sequenceCode);
    
    /**
     * Unsets the "SequenceCode" element
     */
    void unsetSequenceCode();
    
    /**
     * Gets the "CallsInConversation" element
     */
    int getCallsInConversation();
    
    /**
     * Gets (as xml) the "CallsInConversation" element
     */
    org.apache.xmlbeans.XmlInt xgetCallsInConversation();
    
    /**
     * True if has "CallsInConversation" element
     */
    boolean isSetCallsInConversation();
    
    /**
     * Sets the "CallsInConversation" element
     */
    void setCallsInConversation(int callsInConversation);
    
    /**
     * Sets (as xml) the "CallsInConversation" element
     */
    void xsetCallsInConversation(org.apache.xmlbeans.XmlInt callsInConversation);
    
    /**
     * Unsets the "CallsInConversation" element
     */
    void unsetCallsInConversation();
    
    /**
     * Gets the "ScheduledTime" element
     */
    java.util.Calendar getScheduledTime();
    
    /**
     * Gets (as xml) the "ScheduledTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetScheduledTime();
    
    /**
     * True if has "ScheduledTime" element
     */
    boolean isSetScheduledTime();
    
    /**
     * Sets the "ScheduledTime" element
     */
    void setScheduledTime(java.util.Calendar scheduledTime);
    
    /**
     * Sets (as xml) the "ScheduledTime" element
     */
    void xsetScheduledTime(org.apache.xmlbeans.XmlDateTime scheduledTime);
    
    /**
     * Unsets the "ScheduledTime" element
     */
    void unsetScheduledTime();
    
    /**
     * Gets the "RequestType" element
     */
    com.exacttarget.wsdl.partnerapi.RequestType.Enum getRequestType();
    
    /**
     * Gets (as xml) the "RequestType" element
     */
    com.exacttarget.wsdl.partnerapi.RequestType xgetRequestType();
    
    /**
     * True if has "RequestType" element
     */
    boolean isSetRequestType();
    
    /**
     * Sets the "RequestType" element
     */
    void setRequestType(com.exacttarget.wsdl.partnerapi.RequestType.Enum requestType);
    
    /**
     * Sets (as xml) the "RequestType" element
     */
    void xsetRequestType(com.exacttarget.wsdl.partnerapi.RequestType requestType);
    
    /**
     * Unsets the "RequestType" element
     */
    void unsetRequestType();
    
    /**
     * Gets the "QueuePriority" element
     */
    com.exacttarget.wsdl.partnerapi.Priority.Enum getQueuePriority();
    
    /**
     * Gets (as xml) the "QueuePriority" element
     */
    com.exacttarget.wsdl.partnerapi.Priority xgetQueuePriority();
    
    /**
     * True if has "QueuePriority" element
     */
    boolean isSetQueuePriority();
    
    /**
     * Sets the "QueuePriority" element
     */
    void setQueuePriority(com.exacttarget.wsdl.partnerapi.Priority.Enum queuePriority);
    
    /**
     * Sets (as xml) the "QueuePriority" element
     */
    void xsetQueuePriority(com.exacttarget.wsdl.partnerapi.Priority queuePriority);
    
    /**
     * Unsets the "QueuePriority" element
     */
    void unsetQueuePriority();
    
    /**
     * An XML SaveOptions(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface SaveOptions extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SaveOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("saveoptions17ddelemtype");
        
        /**
         * Gets array of all "SaveOption" elements
         */
        com.exacttarget.wsdl.partnerapi.SaveOption[] getSaveOptionArray();
        
        /**
         * Gets ith "SaveOption" element
         */
        com.exacttarget.wsdl.partnerapi.SaveOption getSaveOptionArray(int i);
        
        /**
         * Returns number of "SaveOption" element
         */
        int sizeOfSaveOptionArray();
        
        /**
         * Sets array of all "SaveOption" element
         */
        void setSaveOptionArray(com.exacttarget.wsdl.partnerapi.SaveOption[] saveOptionArray);
        
        /**
         * Sets ith "SaveOption" element
         */
        void setSaveOptionArray(int i, com.exacttarget.wsdl.partnerapi.SaveOption saveOption);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SaveOption" element
         */
        com.exacttarget.wsdl.partnerapi.SaveOption insertNewSaveOption(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SaveOption" element
         */
        com.exacttarget.wsdl.partnerapi.SaveOption addNewSaveOption();
        
        /**
         * Removes the ith "SaveOption" element
         */
        void removeSaveOption(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.Options.SaveOptions newInstance() {
              return (com.exacttarget.wsdl.partnerapi.Options.SaveOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.Options.SaveOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.Options.SaveOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.exacttarget.wsdl.partnerapi.Options newInstance() {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.exacttarget.wsdl.partnerapi.Options newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.Options parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Options parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.Options parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Options parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Options parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Options parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Options parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Options parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Options parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Options parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Options parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Options parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Options parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Options parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.Options parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.Options parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
