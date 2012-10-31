/*
 * XML Type:  TriggeredSendDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML TriggeredSendDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface TriggeredSendDefinition extends com.exacttarget.wsdl.partnerapi.SendDefinition
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TriggeredSendDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("triggeredsenddefinitioncdd6type");
    
    /**
     * Gets the "TriggeredSendType" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendTypeEnum.Enum getTriggeredSendType();
    
    /**
     * Gets (as xml) the "TriggeredSendType" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendTypeEnum xgetTriggeredSendType();
    
    /**
     * True if has "TriggeredSendType" element
     */
    boolean isSetTriggeredSendType();
    
    /**
     * Sets the "TriggeredSendType" element
     */
    void setTriggeredSendType(com.exacttarget.wsdl.partnerapi.TriggeredSendTypeEnum.Enum triggeredSendType);
    
    /**
     * Sets (as xml) the "TriggeredSendType" element
     */
    void xsetTriggeredSendType(com.exacttarget.wsdl.partnerapi.TriggeredSendTypeEnum triggeredSendType);
    
    /**
     * Unsets the "TriggeredSendType" element
     */
    void unsetTriggeredSendType();
    
    /**
     * Gets the "TriggeredSendStatus" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum.Enum getTriggeredSendStatus();
    
    /**
     * Gets (as xml) the "TriggeredSendStatus" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum xgetTriggeredSendStatus();
    
    /**
     * True if has "TriggeredSendStatus" element
     */
    boolean isSetTriggeredSendStatus();
    
    /**
     * Sets the "TriggeredSendStatus" element
     */
    void setTriggeredSendStatus(com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum.Enum triggeredSendStatus);
    
    /**
     * Sets (as xml) the "TriggeredSendStatus" element
     */
    void xsetTriggeredSendStatus(com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum triggeredSendStatus);
    
    /**
     * Unsets the "TriggeredSendStatus" element
     */
    void unsetTriggeredSendStatus();
    
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
     * Gets the "List" element
     */
    com.exacttarget.wsdl.partnerapi.List getList();
    
    /**
     * True if has "List" element
     */
    boolean isSetList();
    
    /**
     * Sets the "List" element
     */
    void setList(com.exacttarget.wsdl.partnerapi.List list);
    
    /**
     * Appends and returns a new empty "List" element
     */
    com.exacttarget.wsdl.partnerapi.List addNewList();
    
    /**
     * Unsets the "List" element
     */
    void unsetList();
    
    /**
     * Gets the "AutoAddSubscribers" element
     */
    boolean getAutoAddSubscribers();
    
    /**
     * Gets (as xml) the "AutoAddSubscribers" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAutoAddSubscribers();
    
    /**
     * True if has "AutoAddSubscribers" element
     */
    boolean isSetAutoAddSubscribers();
    
    /**
     * Sets the "AutoAddSubscribers" element
     */
    void setAutoAddSubscribers(boolean autoAddSubscribers);
    
    /**
     * Sets (as xml) the "AutoAddSubscribers" element
     */
    void xsetAutoAddSubscribers(org.apache.xmlbeans.XmlBoolean autoAddSubscribers);
    
    /**
     * Unsets the "AutoAddSubscribers" element
     */
    void unsetAutoAddSubscribers();
    
    /**
     * Gets the "AutoUpdateSubscribers" element
     */
    boolean getAutoUpdateSubscribers();
    
    /**
     * Gets (as xml) the "AutoUpdateSubscribers" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAutoUpdateSubscribers();
    
    /**
     * True if has "AutoUpdateSubscribers" element
     */
    boolean isSetAutoUpdateSubscribers();
    
    /**
     * Sets the "AutoUpdateSubscribers" element
     */
    void setAutoUpdateSubscribers(boolean autoUpdateSubscribers);
    
    /**
     * Sets (as xml) the "AutoUpdateSubscribers" element
     */
    void xsetAutoUpdateSubscribers(org.apache.xmlbeans.XmlBoolean autoUpdateSubscribers);
    
    /**
     * Unsets the "AutoUpdateSubscribers" element
     */
    void unsetAutoUpdateSubscribers();
    
    /**
     * Gets the "BatchInterval" element
     */
    int getBatchInterval();
    
    /**
     * Gets (as xml) the "BatchInterval" element
     */
    org.apache.xmlbeans.XmlInt xgetBatchInterval();
    
    /**
     * True if has "BatchInterval" element
     */
    boolean isSetBatchInterval();
    
    /**
     * Sets the "BatchInterval" element
     */
    void setBatchInterval(int batchInterval);
    
    /**
     * Sets (as xml) the "BatchInterval" element
     */
    void xsetBatchInterval(org.apache.xmlbeans.XmlInt batchInterval);
    
    /**
     * Unsets the "BatchInterval" element
     */
    void unsetBatchInterval();
    
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
     * Gets the "AllowedSlots" element
     */
    short getAllowedSlots();
    
    /**
     * Gets (as xml) the "AllowedSlots" element
     */
    org.apache.xmlbeans.XmlShort xgetAllowedSlots();
    
    /**
     * True if has "AllowedSlots" element
     */
    boolean isSetAllowedSlots();
    
    /**
     * Sets the "AllowedSlots" element
     */
    void setAllowedSlots(short allowedSlots);
    
    /**
     * Sets (as xml) the "AllowedSlots" element
     */
    void xsetAllowedSlots(org.apache.xmlbeans.XmlShort allowedSlots);
    
    /**
     * Unsets the "AllowedSlots" element
     */
    void unsetAllowedSlots();
    
    /**
     * Gets the "NewSlotTrigger" element
     */
    int getNewSlotTrigger();
    
    /**
     * Gets (as xml) the "NewSlotTrigger" element
     */
    org.apache.xmlbeans.XmlInt xgetNewSlotTrigger();
    
    /**
     * True if has "NewSlotTrigger" element
     */
    boolean isSetNewSlotTrigger();
    
    /**
     * Sets the "NewSlotTrigger" element
     */
    void setNewSlotTrigger(int newSlotTrigger);
    
    /**
     * Sets (as xml) the "NewSlotTrigger" element
     */
    void xsetNewSlotTrigger(org.apache.xmlbeans.XmlInt newSlotTrigger);
    
    /**
     * Unsets the "NewSlotTrigger" element
     */
    void unsetNewSlotTrigger();
    
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
     * Gets the "RefreshContent" element
     */
    boolean getRefreshContent();
    
    /**
     * Gets (as xml) the "RefreshContent" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRefreshContent();
    
    /**
     * True if has "RefreshContent" element
     */
    boolean isSetRefreshContent();
    
    /**
     * Sets the "RefreshContent" element
     */
    void setRefreshContent(boolean refreshContent);
    
    /**
     * Sets (as xml) the "RefreshContent" element
     */
    void xsetRefreshContent(org.apache.xmlbeans.XmlBoolean refreshContent);
    
    /**
     * Unsets the "RefreshContent" element
     */
    void unsetRefreshContent();
    
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
     * Gets the "Priority" element
     */
    java.lang.String getPriority();
    
    /**
     * Gets (as xml) the "Priority" element
     */
    org.apache.xmlbeans.XmlString xgetPriority();
    
    /**
     * True if has "Priority" element
     */
    boolean isSetPriority();
    
    /**
     * Sets the "Priority" element
     */
    void setPriority(java.lang.String priority);
    
    /**
     * Sets (as xml) the "Priority" element
     */
    void xsetPriority(org.apache.xmlbeans.XmlString priority);
    
    /**
     * Unsets the "Priority" element
     */
    void unsetPriority();
    
    /**
     * Gets the "SendSourceCustomerKey" element
     */
    java.lang.String getSendSourceCustomerKey();
    
    /**
     * Gets (as xml) the "SendSourceCustomerKey" element
     */
    org.apache.xmlbeans.XmlString xgetSendSourceCustomerKey();
    
    /**
     * True if has "SendSourceCustomerKey" element
     */
    boolean isSetSendSourceCustomerKey();
    
    /**
     * Sets the "SendSourceCustomerKey" element
     */
    void setSendSourceCustomerKey(java.lang.String sendSourceCustomerKey);
    
    /**
     * Sets (as xml) the "SendSourceCustomerKey" element
     */
    void xsetSendSourceCustomerKey(org.apache.xmlbeans.XmlString sendSourceCustomerKey);
    
    /**
     * Unsets the "SendSourceCustomerKey" element
     */
    void unsetSendSourceCustomerKey();
    
    /**
     * Gets array of all "ExclusionListCollection" elements
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList[] getExclusionListCollectionArray();
    
    /**
     * Gets ith "ExclusionListCollection" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList getExclusionListCollectionArray(int i);
    
    /**
     * Returns number of "ExclusionListCollection" element
     */
    int sizeOfExclusionListCollectionArray();
    
    /**
     * Sets array of all "ExclusionListCollection" element
     */
    void setExclusionListCollectionArray(com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList[] exclusionListCollectionArray);
    
    /**
     * Sets ith "ExclusionListCollection" element
     */
    void setExclusionListCollectionArray(int i, com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList exclusionListCollection);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ExclusionListCollection" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList insertNewExclusionListCollection(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ExclusionListCollection" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList addNewExclusionListCollection();
    
    /**
     * Removes the ith "ExclusionListCollection" element
     */
    void removeExclusionListCollection(int i);
    
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
     * Gets the "SendSourceDataExtension" element
     */
    com.exacttarget.wsdl.partnerapi.DataExtension getSendSourceDataExtension();
    
    /**
     * True if has "SendSourceDataExtension" element
     */
    boolean isSetSendSourceDataExtension();
    
    /**
     * Sets the "SendSourceDataExtension" element
     */
    void setSendSourceDataExtension(com.exacttarget.wsdl.partnerapi.DataExtension sendSourceDataExtension);
    
    /**
     * Appends and returns a new empty "SendSourceDataExtension" element
     */
    com.exacttarget.wsdl.partnerapi.DataExtension addNewSendSourceDataExtension();
    
    /**
     * Unsets the "SendSourceDataExtension" element
     */
    void unsetSendSourceDataExtension();
    
    /**
     * Gets the "IsAlwaysOn" element
     */
    boolean getIsAlwaysOn();
    
    /**
     * Gets (as xml) the "IsAlwaysOn" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsAlwaysOn();
    
    /**
     * True if has "IsAlwaysOn" element
     */
    boolean isSetIsAlwaysOn();
    
    /**
     * Sets the "IsAlwaysOn" element
     */
    void setIsAlwaysOn(boolean isAlwaysOn);
    
    /**
     * Sets (as xml) the "IsAlwaysOn" element
     */
    void xsetIsAlwaysOn(org.apache.xmlbeans.XmlBoolean isAlwaysOn);
    
    /**
     * Unsets the "IsAlwaysOn" element
     */
    void unsetIsAlwaysOn();
    
    /**
     * Gets the "DisableOnEmailBuildError" element
     */
    boolean getDisableOnEmailBuildError();
    
    /**
     * Gets (as xml) the "DisableOnEmailBuildError" element
     */
    org.apache.xmlbeans.XmlBoolean xgetDisableOnEmailBuildError();
    
    /**
     * True if has "DisableOnEmailBuildError" element
     */
    boolean isSetDisableOnEmailBuildError();
    
    /**
     * Sets the "DisableOnEmailBuildError" element
     */
    void setDisableOnEmailBuildError(boolean disableOnEmailBuildError);
    
    /**
     * Sets (as xml) the "DisableOnEmailBuildError" element
     */
    void xsetDisableOnEmailBuildError(org.apache.xmlbeans.XmlBoolean disableOnEmailBuildError);
    
    /**
     * Unsets the "DisableOnEmailBuildError" element
     */
    void unsetDisableOnEmailBuildError();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition newInstance() {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
