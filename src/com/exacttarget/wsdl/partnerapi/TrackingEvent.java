/*
 * XML Type:  TrackingEvent
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TrackingEvent
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML TrackingEvent(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface TrackingEvent extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TrackingEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("trackingeventdd05type");
    
    /**
     * Gets the "SendID" element
     */
    int getSendID();
    
    /**
     * Gets (as xml) the "SendID" element
     */
    org.apache.xmlbeans.XmlInt xgetSendID();
    
    /**
     * True if has "SendID" element
     */
    boolean isSetSendID();
    
    /**
     * Sets the "SendID" element
     */
    void setSendID(int sendID);
    
    /**
     * Sets (as xml) the "SendID" element
     */
    void xsetSendID(org.apache.xmlbeans.XmlInt sendID);
    
    /**
     * Unsets the "SendID" element
     */
    void unsetSendID();
    
    /**
     * Gets the "SubscriberKey" element
     */
    java.lang.String getSubscriberKey();
    
    /**
     * Gets (as xml) the "SubscriberKey" element
     */
    org.apache.xmlbeans.XmlString xgetSubscriberKey();
    
    /**
     * True if has "SubscriberKey" element
     */
    boolean isSetSubscriberKey();
    
    /**
     * Sets the "SubscriberKey" element
     */
    void setSubscriberKey(java.lang.String subscriberKey);
    
    /**
     * Sets (as xml) the "SubscriberKey" element
     */
    void xsetSubscriberKey(org.apache.xmlbeans.XmlString subscriberKey);
    
    /**
     * Unsets the "SubscriberKey" element
     */
    void unsetSubscriberKey();
    
    /**
     * Gets the "EventDate" element
     */
    java.util.Calendar getEventDate();
    
    /**
     * Gets (as xml) the "EventDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEventDate();
    
    /**
     * True if has "EventDate" element
     */
    boolean isSetEventDate();
    
    /**
     * Sets the "EventDate" element
     */
    void setEventDate(java.util.Calendar eventDate);
    
    /**
     * Sets (as xml) the "EventDate" element
     */
    void xsetEventDate(org.apache.xmlbeans.XmlDateTime eventDate);
    
    /**
     * Unsets the "EventDate" element
     */
    void unsetEventDate();
    
    /**
     * Gets the "EventType" element
     */
    com.exacttarget.wsdl.partnerapi.EventType.Enum getEventType();
    
    /**
     * Gets (as xml) the "EventType" element
     */
    com.exacttarget.wsdl.partnerapi.EventType xgetEventType();
    
    /**
     * True if has "EventType" element
     */
    boolean isSetEventType();
    
    /**
     * Sets the "EventType" element
     */
    void setEventType(com.exacttarget.wsdl.partnerapi.EventType.Enum eventType);
    
    /**
     * Sets (as xml) the "EventType" element
     */
    void xsetEventType(com.exacttarget.wsdl.partnerapi.EventType eventType);
    
    /**
     * Unsets the "EventType" element
     */
    void unsetEventType();
    
    /**
     * Gets the "TriggeredSendDefinitionObjectID" element
     */
    java.lang.String getTriggeredSendDefinitionObjectID();
    
    /**
     * Gets (as xml) the "TriggeredSendDefinitionObjectID" element
     */
    org.apache.xmlbeans.XmlString xgetTriggeredSendDefinitionObjectID();
    
    /**
     * True if has "TriggeredSendDefinitionObjectID" element
     */
    boolean isSetTriggeredSendDefinitionObjectID();
    
    /**
     * Sets the "TriggeredSendDefinitionObjectID" element
     */
    void setTriggeredSendDefinitionObjectID(java.lang.String triggeredSendDefinitionObjectID);
    
    /**
     * Sets (as xml) the "TriggeredSendDefinitionObjectID" element
     */
    void xsetTriggeredSendDefinitionObjectID(org.apache.xmlbeans.XmlString triggeredSendDefinitionObjectID);
    
    /**
     * Unsets the "TriggeredSendDefinitionObjectID" element
     */
    void unsetTriggeredSendDefinitionObjectID();
    
    /**
     * Gets the "BatchID" element
     */
    int getBatchID();
    
    /**
     * Gets (as xml) the "BatchID" element
     */
    org.apache.xmlbeans.XmlInt xgetBatchID();
    
    /**
     * True if has "BatchID" element
     */
    boolean isSetBatchID();
    
    /**
     * Sets the "BatchID" element
     */
    void setBatchID(int batchID);
    
    /**
     * Sets (as xml) the "BatchID" element
     */
    void xsetBatchID(org.apache.xmlbeans.XmlInt batchID);
    
    /**
     * Unsets the "BatchID" element
     */
    void unsetBatchID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent newInstance() {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.TrackingEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.TrackingEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
