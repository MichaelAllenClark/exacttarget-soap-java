/*
 * XML Type:  SenderProfile
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SenderProfile
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML SenderProfile(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface SenderProfile extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SenderProfile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("senderprofiled854type");
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "Description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "Description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "FromName" element
     */
    java.lang.String getFromName();
    
    /**
     * Gets (as xml) the "FromName" element
     */
    org.apache.xmlbeans.XmlString xgetFromName();
    
    /**
     * True if has "FromName" element
     */
    boolean isSetFromName();
    
    /**
     * Sets the "FromName" element
     */
    void setFromName(java.lang.String fromName);
    
    /**
     * Sets (as xml) the "FromName" element
     */
    void xsetFromName(org.apache.xmlbeans.XmlString fromName);
    
    /**
     * Unsets the "FromName" element
     */
    void unsetFromName();
    
    /**
     * Gets the "FromAddress" element
     */
    java.lang.String getFromAddress();
    
    /**
     * Gets (as xml) the "FromAddress" element
     */
    org.apache.xmlbeans.XmlString xgetFromAddress();
    
    /**
     * True if has "FromAddress" element
     */
    boolean isSetFromAddress();
    
    /**
     * Sets the "FromAddress" element
     */
    void setFromAddress(java.lang.String fromAddress);
    
    /**
     * Sets (as xml) the "FromAddress" element
     */
    void xsetFromAddress(org.apache.xmlbeans.XmlString fromAddress);
    
    /**
     * Unsets the "FromAddress" element
     */
    void unsetFromAddress();
    
    /**
     * Gets the "UseDefaultRMMRules" element
     */
    boolean getUseDefaultRMMRules();
    
    /**
     * Gets (as xml) the "UseDefaultRMMRules" element
     */
    org.apache.xmlbeans.XmlBoolean xgetUseDefaultRMMRules();
    
    /**
     * True if has "UseDefaultRMMRules" element
     */
    boolean isSetUseDefaultRMMRules();
    
    /**
     * Sets the "UseDefaultRMMRules" element
     */
    void setUseDefaultRMMRules(boolean useDefaultRMMRules);
    
    /**
     * Sets (as xml) the "UseDefaultRMMRules" element
     */
    void xsetUseDefaultRMMRules(org.apache.xmlbeans.XmlBoolean useDefaultRMMRules);
    
    /**
     * Unsets the "UseDefaultRMMRules" element
     */
    void unsetUseDefaultRMMRules();
    
    /**
     * Gets the "AutoForwardToEmailAddress" element
     */
    java.lang.String getAutoForwardToEmailAddress();
    
    /**
     * Gets (as xml) the "AutoForwardToEmailAddress" element
     */
    org.apache.xmlbeans.XmlString xgetAutoForwardToEmailAddress();
    
    /**
     * True if has "AutoForwardToEmailAddress" element
     */
    boolean isSetAutoForwardToEmailAddress();
    
    /**
     * Sets the "AutoForwardToEmailAddress" element
     */
    void setAutoForwardToEmailAddress(java.lang.String autoForwardToEmailAddress);
    
    /**
     * Sets (as xml) the "AutoForwardToEmailAddress" element
     */
    void xsetAutoForwardToEmailAddress(org.apache.xmlbeans.XmlString autoForwardToEmailAddress);
    
    /**
     * Unsets the "AutoForwardToEmailAddress" element
     */
    void unsetAutoForwardToEmailAddress();
    
    /**
     * Gets the "AutoForwardToName" element
     */
    java.lang.String getAutoForwardToName();
    
    /**
     * Gets (as xml) the "AutoForwardToName" element
     */
    org.apache.xmlbeans.XmlString xgetAutoForwardToName();
    
    /**
     * True if has "AutoForwardToName" element
     */
    boolean isSetAutoForwardToName();
    
    /**
     * Sets the "AutoForwardToName" element
     */
    void setAutoForwardToName(java.lang.String autoForwardToName);
    
    /**
     * Sets (as xml) the "AutoForwardToName" element
     */
    void xsetAutoForwardToName(org.apache.xmlbeans.XmlString autoForwardToName);
    
    /**
     * Unsets the "AutoForwardToName" element
     */
    void unsetAutoForwardToName();
    
    /**
     * Gets the "DirectForward" element
     */
    boolean getDirectForward();
    
    /**
     * Gets (as xml) the "DirectForward" element
     */
    org.apache.xmlbeans.XmlBoolean xgetDirectForward();
    
    /**
     * True if has "DirectForward" element
     */
    boolean isSetDirectForward();
    
    /**
     * Sets the "DirectForward" element
     */
    void setDirectForward(boolean directForward);
    
    /**
     * Sets (as xml) the "DirectForward" element
     */
    void xsetDirectForward(org.apache.xmlbeans.XmlBoolean directForward);
    
    /**
     * Unsets the "DirectForward" element
     */
    void unsetDirectForward();
    
    /**
     * Gets the "AutoForwardTriggeredSend" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition getAutoForwardTriggeredSend();
    
    /**
     * True if has "AutoForwardTriggeredSend" element
     */
    boolean isSetAutoForwardTriggeredSend();
    
    /**
     * Sets the "AutoForwardTriggeredSend" element
     */
    void setAutoForwardTriggeredSend(com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition autoForwardTriggeredSend);
    
    /**
     * Appends and returns a new empty "AutoForwardTriggeredSend" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition addNewAutoForwardTriggeredSend();
    
    /**
     * Unsets the "AutoForwardTriggeredSend" element
     */
    void unsetAutoForwardTriggeredSend();
    
    /**
     * Gets the "AutoReply" element
     */
    boolean getAutoReply();
    
    /**
     * Gets (as xml) the "AutoReply" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAutoReply();
    
    /**
     * True if has "AutoReply" element
     */
    boolean isSetAutoReply();
    
    /**
     * Sets the "AutoReply" element
     */
    void setAutoReply(boolean autoReply);
    
    /**
     * Sets (as xml) the "AutoReply" element
     */
    void xsetAutoReply(org.apache.xmlbeans.XmlBoolean autoReply);
    
    /**
     * Unsets the "AutoReply" element
     */
    void unsetAutoReply();
    
    /**
     * Gets the "AutoReplyTriggeredSend" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition getAutoReplyTriggeredSend();
    
    /**
     * True if has "AutoReplyTriggeredSend" element
     */
    boolean isSetAutoReplyTriggeredSend();
    
    /**
     * Sets the "AutoReplyTriggeredSend" element
     */
    void setAutoReplyTriggeredSend(com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition autoReplyTriggeredSend);
    
    /**
     * Appends and returns a new empty "AutoReplyTriggeredSend" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition addNewAutoReplyTriggeredSend();
    
    /**
     * Unsets the "AutoReplyTriggeredSend" element
     */
    void unsetAutoReplyTriggeredSend();
    
    /**
     * Gets the "SenderHeaderEmailAddress" element
     */
    java.lang.String getSenderHeaderEmailAddress();
    
    /**
     * Gets (as xml) the "SenderHeaderEmailAddress" element
     */
    org.apache.xmlbeans.XmlString xgetSenderHeaderEmailAddress();
    
    /**
     * True if has "SenderHeaderEmailAddress" element
     */
    boolean isSetSenderHeaderEmailAddress();
    
    /**
     * Sets the "SenderHeaderEmailAddress" element
     */
    void setSenderHeaderEmailAddress(java.lang.String senderHeaderEmailAddress);
    
    /**
     * Sets (as xml) the "SenderHeaderEmailAddress" element
     */
    void xsetSenderHeaderEmailAddress(org.apache.xmlbeans.XmlString senderHeaderEmailAddress);
    
    /**
     * Unsets the "SenderHeaderEmailAddress" element
     */
    void unsetSenderHeaderEmailAddress();
    
    /**
     * Gets the "SenderHeaderName" element
     */
    java.lang.String getSenderHeaderName();
    
    /**
     * Gets (as xml) the "SenderHeaderName" element
     */
    org.apache.xmlbeans.XmlString xgetSenderHeaderName();
    
    /**
     * True if has "SenderHeaderName" element
     */
    boolean isSetSenderHeaderName();
    
    /**
     * Sets the "SenderHeaderName" element
     */
    void setSenderHeaderName(java.lang.String senderHeaderName);
    
    /**
     * Sets (as xml) the "SenderHeaderName" element
     */
    void xsetSenderHeaderName(org.apache.xmlbeans.XmlString senderHeaderName);
    
    /**
     * Unsets the "SenderHeaderName" element
     */
    void unsetSenderHeaderName();
    
    /**
     * Gets the "DataRetentionPeriodLength" element
     */
    short getDataRetentionPeriodLength();
    
    /**
     * Gets (as xml) the "DataRetentionPeriodLength" element
     */
    org.apache.xmlbeans.XmlShort xgetDataRetentionPeriodLength();
    
    /**
     * True if has "DataRetentionPeriodLength" element
     */
    boolean isSetDataRetentionPeriodLength();
    
    /**
     * Sets the "DataRetentionPeriodLength" element
     */
    void setDataRetentionPeriodLength(short dataRetentionPeriodLength);
    
    /**
     * Sets (as xml) the "DataRetentionPeriodLength" element
     */
    void xsetDataRetentionPeriodLength(org.apache.xmlbeans.XmlShort dataRetentionPeriodLength);
    
    /**
     * Unsets the "DataRetentionPeriodLength" element
     */
    void unsetDataRetentionPeriodLength();
    
    /**
     * Gets the "DataRetentionPeriodUnitOfMeasure" element
     */
    com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum.Enum getDataRetentionPeriodUnitOfMeasure();
    
    /**
     * Gets (as xml) the "DataRetentionPeriodUnitOfMeasure" element
     */
    com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum xgetDataRetentionPeriodUnitOfMeasure();
    
    /**
     * True if has "DataRetentionPeriodUnitOfMeasure" element
     */
    boolean isSetDataRetentionPeriodUnitOfMeasure();
    
    /**
     * Sets the "DataRetentionPeriodUnitOfMeasure" element
     */
    void setDataRetentionPeriodUnitOfMeasure(com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum.Enum dataRetentionPeriodUnitOfMeasure);
    
    /**
     * Sets (as xml) the "DataRetentionPeriodUnitOfMeasure" element
     */
    void xsetDataRetentionPeriodUnitOfMeasure(com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum dataRetentionPeriodUnitOfMeasure);
    
    /**
     * Unsets the "DataRetentionPeriodUnitOfMeasure" element
     */
    void unsetDataRetentionPeriodUnitOfMeasure();
    
    /**
     * Gets the "ReplyManagementRuleSet" element
     */
    com.exacttarget.wsdl.partnerapi.APIObject getReplyManagementRuleSet();
    
    /**
     * True if has "ReplyManagementRuleSet" element
     */
    boolean isSetReplyManagementRuleSet();
    
    /**
     * Sets the "ReplyManagementRuleSet" element
     */
    void setReplyManagementRuleSet(com.exacttarget.wsdl.partnerapi.APIObject replyManagementRuleSet);
    
    /**
     * Appends and returns a new empty "ReplyManagementRuleSet" element
     */
    com.exacttarget.wsdl.partnerapi.APIObject addNewReplyManagementRuleSet();
    
    /**
     * Unsets the "ReplyManagementRuleSet" element
     */
    void unsetReplyManagementRuleSet();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.SenderProfile newInstance() {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SenderProfile newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SenderProfile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SenderProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
