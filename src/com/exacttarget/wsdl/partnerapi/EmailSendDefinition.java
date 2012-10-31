/*
 * XML Type:  EmailSendDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.EmailSendDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML EmailSendDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface EmailSendDefinition extends com.exacttarget.wsdl.partnerapi.SendDefinition
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmailSendDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("emailsenddefinitiona431type");
    
    /**
     * Gets array of all "SendDefinitionList" elements
     */
    com.exacttarget.wsdl.partnerapi.SendDefinitionList[] getSendDefinitionListArray();
    
    /**
     * Gets ith "SendDefinitionList" element
     */
    com.exacttarget.wsdl.partnerapi.SendDefinitionList getSendDefinitionListArray(int i);
    
    /**
     * Returns number of "SendDefinitionList" element
     */
    int sizeOfSendDefinitionListArray();
    
    /**
     * Sets array of all "SendDefinitionList" element
     */
    void setSendDefinitionListArray(com.exacttarget.wsdl.partnerapi.SendDefinitionList[] sendDefinitionListArray);
    
    /**
     * Sets ith "SendDefinitionList" element
     */
    void setSendDefinitionListArray(int i, com.exacttarget.wsdl.partnerapi.SendDefinitionList sendDefinitionList);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SendDefinitionList" element
     */
    com.exacttarget.wsdl.partnerapi.SendDefinitionList insertNewSendDefinitionList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SendDefinitionList" element
     */
    com.exacttarget.wsdl.partnerapi.SendDefinitionList addNewSendDefinitionList();
    
    /**
     * Removes the ith "SendDefinitionList" element
     */
    void removeSendDefinitionList(int i);
    
    /**
     * Gets the "Email" element
     */
    com.exacttarget.wsdl.partnerapi.Email getEmail();
    
    /**
     * True if has "Email" element
     */
    boolean isSetEmail();
    
    /**
     * Sets the "Email" element
     */
    void setEmail(com.exacttarget.wsdl.partnerapi.Email email);
    
    /**
     * Appends and returns a new empty "Email" element
     */
    com.exacttarget.wsdl.partnerapi.Email addNewEmail();
    
    /**
     * Unsets the "Email" element
     */
    void unsetEmail();
    
    /**
     * Gets the "BccEmail" element
     */
    java.lang.String getBccEmail();
    
    /**
     * Gets (as xml) the "BccEmail" element
     */
    org.apache.xmlbeans.XmlString xgetBccEmail();
    
    /**
     * True if has "BccEmail" element
     */
    boolean isSetBccEmail();
    
    /**
     * Sets the "BccEmail" element
     */
    void setBccEmail(java.lang.String bccEmail);
    
    /**
     * Sets (as xml) the "BccEmail" element
     */
    void xsetBccEmail(org.apache.xmlbeans.XmlString bccEmail);
    
    /**
     * Unsets the "BccEmail" element
     */
    void unsetBccEmail();
    
    /**
     * Gets the "AutoBccEmail" element
     */
    java.lang.String getAutoBccEmail();
    
    /**
     * Gets (as xml) the "AutoBccEmail" element
     */
    org.apache.xmlbeans.XmlString xgetAutoBccEmail();
    
    /**
     * True if has "AutoBccEmail" element
     */
    boolean isSetAutoBccEmail();
    
    /**
     * Sets the "AutoBccEmail" element
     */
    void setAutoBccEmail(java.lang.String autoBccEmail);
    
    /**
     * Sets (as xml) the "AutoBccEmail" element
     */
    void xsetAutoBccEmail(org.apache.xmlbeans.XmlString autoBccEmail);
    
    /**
     * Unsets the "AutoBccEmail" element
     */
    void unsetAutoBccEmail();
    
    /**
     * Gets the "TestEmailAddr" element
     */
    java.lang.String getTestEmailAddr();
    
    /**
     * Gets (as xml) the "TestEmailAddr" element
     */
    org.apache.xmlbeans.XmlString xgetTestEmailAddr();
    
    /**
     * True if has "TestEmailAddr" element
     */
    boolean isSetTestEmailAddr();
    
    /**
     * Sets the "TestEmailAddr" element
     */
    void setTestEmailAddr(java.lang.String testEmailAddr);
    
    /**
     * Sets (as xml) the "TestEmailAddr" element
     */
    void xsetTestEmailAddr(org.apache.xmlbeans.XmlString testEmailAddr);
    
    /**
     * Unsets the "TestEmailAddr" element
     */
    void unsetTestEmailAddr();
    
    /**
     * Gets the "EmailSubject" element
     */
    java.lang.String getEmailSubject();
    
    /**
     * Gets (as xml) the "EmailSubject" element
     */
    org.apache.xmlbeans.XmlString xgetEmailSubject();
    
    /**
     * True if has "EmailSubject" element
     */
    boolean isSetEmailSubject();
    
    /**
     * Sets the "EmailSubject" element
     */
    void setEmailSubject(java.lang.String emailSubject);
    
    /**
     * Sets (as xml) the "EmailSubject" element
     */
    void xsetEmailSubject(org.apache.xmlbeans.XmlString emailSubject);
    
    /**
     * Unsets the "EmailSubject" element
     */
    void unsetEmailSubject();
    
    /**
     * Gets the "DynamicEmailSubject" element
     */
    java.lang.String getDynamicEmailSubject();
    
    /**
     * Gets (as xml) the "DynamicEmailSubject" element
     */
    org.apache.xmlbeans.XmlString xgetDynamicEmailSubject();
    
    /**
     * True if has "DynamicEmailSubject" element
     */
    boolean isSetDynamicEmailSubject();
    
    /**
     * Sets the "DynamicEmailSubject" element
     */
    void setDynamicEmailSubject(java.lang.String dynamicEmailSubject);
    
    /**
     * Sets (as xml) the "DynamicEmailSubject" element
     */
    void xsetDynamicEmailSubject(org.apache.xmlbeans.XmlString dynamicEmailSubject);
    
    /**
     * Unsets the "DynamicEmailSubject" element
     */
    void unsetDynamicEmailSubject();
    
    /**
     * Gets the "IsMultipart" element
     */
    boolean getIsMultipart();
    
    /**
     * Gets (as xml) the "IsMultipart" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsMultipart();
    
    /**
     * True if has "IsMultipart" element
     */
    boolean isSetIsMultipart();
    
    /**
     * Sets the "IsMultipart" element
     */
    void setIsMultipart(boolean isMultipart);
    
    /**
     * Sets (as xml) the "IsMultipart" element
     */
    void xsetIsMultipart(org.apache.xmlbeans.XmlBoolean isMultipart);
    
    /**
     * Unsets the "IsMultipart" element
     */
    void unsetIsMultipart();
    
    /**
     * Gets the "IsWrapped" element
     */
    boolean getIsWrapped();
    
    /**
     * Gets (as xml) the "IsWrapped" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsWrapped();
    
    /**
     * True if has "IsWrapped" element
     */
    boolean isSetIsWrapped();
    
    /**
     * Sets the "IsWrapped" element
     */
    void setIsWrapped(boolean isWrapped);
    
    /**
     * Sets (as xml) the "IsWrapped" element
     */
    void xsetIsWrapped(org.apache.xmlbeans.XmlBoolean isWrapped);
    
    /**
     * Unsets the "IsWrapped" element
     */
    void unsetIsWrapped();
    
    /**
     * Gets the "SendLimit" element
     */
    int getSendLimit();
    
    /**
     * Gets (as xml) the "SendLimit" element
     */
    org.apache.xmlbeans.XmlInt xgetSendLimit();
    
    /**
     * True if has "SendLimit" element
     */
    boolean isSetSendLimit();
    
    /**
     * Sets the "SendLimit" element
     */
    void setSendLimit(int sendLimit);
    
    /**
     * Sets (as xml) the "SendLimit" element
     */
    void xsetSendLimit(org.apache.xmlbeans.XmlInt sendLimit);
    
    /**
     * Unsets the "SendLimit" element
     */
    void unsetSendLimit();
    
    /**
     * Gets the "SendWindowOpen" element
     */
    java.util.Calendar getSendWindowOpen();
    
    /**
     * Gets (as xml) the "SendWindowOpen" element
     */
    org.apache.xmlbeans.XmlTime xgetSendWindowOpen();
    
    /**
     * True if has "SendWindowOpen" element
     */
    boolean isSetSendWindowOpen();
    
    /**
     * Sets the "SendWindowOpen" element
     */
    void setSendWindowOpen(java.util.Calendar sendWindowOpen);
    
    /**
     * Sets (as xml) the "SendWindowOpen" element
     */
    void xsetSendWindowOpen(org.apache.xmlbeans.XmlTime sendWindowOpen);
    
    /**
     * Unsets the "SendWindowOpen" element
     */
    void unsetSendWindowOpen();
    
    /**
     * Gets the "SendWindowClose" element
     */
    java.util.Calendar getSendWindowClose();
    
    /**
     * Gets (as xml) the "SendWindowClose" element
     */
    org.apache.xmlbeans.XmlTime xgetSendWindowClose();
    
    /**
     * True if has "SendWindowClose" element
     */
    boolean isSetSendWindowClose();
    
    /**
     * Sets the "SendWindowClose" element
     */
    void setSendWindowClose(java.util.Calendar sendWindowClose);
    
    /**
     * Sets (as xml) the "SendWindowClose" element
     */
    void xsetSendWindowClose(org.apache.xmlbeans.XmlTime sendWindowClose);
    
    /**
     * Unsets the "SendWindowClose" element
     */
    void unsetSendWindowClose();
    
    /**
     * Gets the "SendWindowDelete" element
     */
    boolean getSendWindowDelete();
    
    /**
     * Gets (as xml) the "SendWindowDelete" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSendWindowDelete();
    
    /**
     * True if has "SendWindowDelete" element
     */
    boolean isSetSendWindowDelete();
    
    /**
     * Sets the "SendWindowDelete" element
     */
    void setSendWindowDelete(boolean sendWindowDelete);
    
    /**
     * Sets (as xml) the "SendWindowDelete" element
     */
    void xsetSendWindowDelete(org.apache.xmlbeans.XmlBoolean sendWindowDelete);
    
    /**
     * Unsets the "SendWindowDelete" element
     */
    void unsetSendWindowDelete();
    
    /**
     * Gets the "DeduplicateByEmail" element
     */
    boolean getDeduplicateByEmail();
    
    /**
     * Gets (as xml) the "DeduplicateByEmail" element
     */
    org.apache.xmlbeans.XmlBoolean xgetDeduplicateByEmail();
    
    /**
     * True if has "DeduplicateByEmail" element
     */
    boolean isSetDeduplicateByEmail();
    
    /**
     * Sets the "DeduplicateByEmail" element
     */
    void setDeduplicateByEmail(boolean deduplicateByEmail);
    
    /**
     * Sets (as xml) the "DeduplicateByEmail" element
     */
    void xsetDeduplicateByEmail(org.apache.xmlbeans.XmlBoolean deduplicateByEmail);
    
    /**
     * Unsets the "DeduplicateByEmail" element
     */
    void unsetDeduplicateByEmail();
    
    /**
     * Gets the "ExclusionFilter" element
     */
    java.lang.String getExclusionFilter();
    
    /**
     * Gets (as xml) the "ExclusionFilter" element
     */
    org.apache.xmlbeans.XmlString xgetExclusionFilter();
    
    /**
     * True if has "ExclusionFilter" element
     */
    boolean isSetExclusionFilter();
    
    /**
     * Sets the "ExclusionFilter" element
     */
    void setExclusionFilter(java.lang.String exclusionFilter);
    
    /**
     * Sets (as xml) the "ExclusionFilter" element
     */
    void xsetExclusionFilter(org.apache.xmlbeans.XmlString exclusionFilter);
    
    /**
     * Unsets the "ExclusionFilter" element
     */
    void unsetExclusionFilter();
    
    /**
     * Gets the "TrackingUsers" element
     */
    com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers getTrackingUsers();
    
    /**
     * True if has "TrackingUsers" element
     */
    boolean isSetTrackingUsers();
    
    /**
     * Sets the "TrackingUsers" element
     */
    void setTrackingUsers(com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers trackingUsers);
    
    /**
     * Appends and returns a new empty "TrackingUsers" element
     */
    com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers addNewTrackingUsers();
    
    /**
     * Unsets the "TrackingUsers" element
     */
    void unsetTrackingUsers();
    
    /**
     * Gets the "Additional" element
     */
    java.lang.String getAdditional();
    
    /**
     * Gets (as xml) the "Additional" element
     */
    org.apache.xmlbeans.XmlString xgetAdditional();
    
    /**
     * True if has "Additional" element
     */
    boolean isSetAdditional();
    
    /**
     * Sets the "Additional" element
     */
    void setAdditional(java.lang.String additional);
    
    /**
     * Sets (as xml) the "Additional" element
     */
    void xsetAdditional(org.apache.xmlbeans.XmlString additional);
    
    /**
     * Unsets the "Additional" element
     */
    void unsetAdditional();
    
    /**
     * Gets the "CCEmail" element
     */
    java.lang.String getCCEmail();
    
    /**
     * Gets (as xml) the "CCEmail" element
     */
    org.apache.xmlbeans.XmlString xgetCCEmail();
    
    /**
     * True if has "CCEmail" element
     */
    boolean isSetCCEmail();
    
    /**
     * Sets the "CCEmail" element
     */
    void setCCEmail(java.lang.String ccEmail);
    
    /**
     * Sets (as xml) the "CCEmail" element
     */
    void xsetCCEmail(org.apache.xmlbeans.XmlString ccEmail);
    
    /**
     * Unsets the "CCEmail" element
     */
    void unsetCCEmail();
    
    /**
     * Gets the "DeliveryScheduledTime" element
     */
    java.util.Calendar getDeliveryScheduledTime();
    
    /**
     * Gets (as xml) the "DeliveryScheduledTime" element
     */
    org.apache.xmlbeans.XmlTime xgetDeliveryScheduledTime();
    
    /**
     * True if has "DeliveryScheduledTime" element
     */
    boolean isSetDeliveryScheduledTime();
    
    /**
     * Sets the "DeliveryScheduledTime" element
     */
    void setDeliveryScheduledTime(java.util.Calendar deliveryScheduledTime);
    
    /**
     * Sets (as xml) the "DeliveryScheduledTime" element
     */
    void xsetDeliveryScheduledTime(org.apache.xmlbeans.XmlTime deliveryScheduledTime);
    
    /**
     * Unsets the "DeliveryScheduledTime" element
     */
    void unsetDeliveryScheduledTime();
    
    /**
     * Gets the "MessageDeliveryType" element
     */
    com.exacttarget.wsdl.partnerapi.MessageDeliveryTypeEnum.Enum getMessageDeliveryType();
    
    /**
     * Gets (as xml) the "MessageDeliveryType" element
     */
    com.exacttarget.wsdl.partnerapi.MessageDeliveryTypeEnum xgetMessageDeliveryType();
    
    /**
     * True if has "MessageDeliveryType" element
     */
    boolean isSetMessageDeliveryType();
    
    /**
     * Sets the "MessageDeliveryType" element
     */
    void setMessageDeliveryType(com.exacttarget.wsdl.partnerapi.MessageDeliveryTypeEnum.Enum messageDeliveryType);
    
    /**
     * Sets (as xml) the "MessageDeliveryType" element
     */
    void xsetMessageDeliveryType(com.exacttarget.wsdl.partnerapi.MessageDeliveryTypeEnum messageDeliveryType);
    
    /**
     * Unsets the "MessageDeliveryType" element
     */
    void unsetMessageDeliveryType();
    
    /**
     * Gets the "IsSeedListSend" element
     */
    boolean getIsSeedListSend();
    
    /**
     * Gets (as xml) the "IsSeedListSend" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsSeedListSend();
    
    /**
     * True if has "IsSeedListSend" element
     */
    boolean isSetIsSeedListSend();
    
    /**
     * Sets the "IsSeedListSend" element
     */
    void setIsSeedListSend(boolean isSeedListSend);
    
    /**
     * Sets (as xml) the "IsSeedListSend" element
     */
    void xsetIsSeedListSend(org.apache.xmlbeans.XmlBoolean isSeedListSend);
    
    /**
     * Unsets the "IsSeedListSend" element
     */
    void unsetIsSeedListSend();
    
    /**
     * Gets the "TimeZone" element
     */
    com.exacttarget.wsdl.partnerapi.TimeZone getTimeZone();
    
    /**
     * True if has "TimeZone" element
     */
    boolean isSetTimeZone();
    
    /**
     * Sets the "TimeZone" element
     */
    void setTimeZone(com.exacttarget.wsdl.partnerapi.TimeZone timeZone);
    
    /**
     * Appends and returns a new empty "TimeZone" element
     */
    com.exacttarget.wsdl.partnerapi.TimeZone addNewTimeZone();
    
    /**
     * Unsets the "TimeZone" element
     */
    void unsetTimeZone();
    
    /**
     * Gets the "SeedListOccurance" element
     */
    int getSeedListOccurance();
    
    /**
     * Gets (as xml) the "SeedListOccurance" element
     */
    org.apache.xmlbeans.XmlInt xgetSeedListOccurance();
    
    /**
     * True if has "SeedListOccurance" element
     */
    boolean isSetSeedListOccurance();
    
    /**
     * Sets the "SeedListOccurance" element
     */
    void setSeedListOccurance(int seedListOccurance);
    
    /**
     * Sets (as xml) the "SeedListOccurance" element
     */
    void xsetSeedListOccurance(org.apache.xmlbeans.XmlInt seedListOccurance);
    
    /**
     * Unsets the "SeedListOccurance" element
     */
    void unsetSeedListOccurance();
    
    /**
     * An XML TrackingUsers(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface TrackingUsers extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TrackingUsers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("trackingusers6974elemtype");
        
        /**
         * Gets array of all "TrackingUser" elements
         */
        com.exacttarget.wsdl.partnerapi.TrackingUser[] getTrackingUserArray();
        
        /**
         * Gets ith "TrackingUser" element
         */
        com.exacttarget.wsdl.partnerapi.TrackingUser getTrackingUserArray(int i);
        
        /**
         * Returns number of "TrackingUser" element
         */
        int sizeOfTrackingUserArray();
        
        /**
         * Sets array of all "TrackingUser" element
         */
        void setTrackingUserArray(com.exacttarget.wsdl.partnerapi.TrackingUser[] trackingUserArray);
        
        /**
         * Sets ith "TrackingUser" element
         */
        void setTrackingUserArray(int i, com.exacttarget.wsdl.partnerapi.TrackingUser trackingUser);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TrackingUser" element
         */
        com.exacttarget.wsdl.partnerapi.TrackingUser insertNewTrackingUser(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TrackingUser" element
         */
        com.exacttarget.wsdl.partnerapi.TrackingUser addNewTrackingUser();
        
        /**
         * Removes the ith "TrackingUser" element
         */
        void removeTrackingUser(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers newInstance() {
              return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition newInstance() {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.EmailSendDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.EmailSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
