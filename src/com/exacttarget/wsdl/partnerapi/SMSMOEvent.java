/*
 * XML Type:  SMSMOEvent
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SMSMOEvent
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML SMSMOEvent(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface SMSMOEvent extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SMSMOEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("smsmoevent2597type");
    
    /**
     * Gets the "Keyword" element
     */
    com.exacttarget.wsdl.partnerapi.BaseMOKeyword getKeyword();
    
    /**
     * True if has "Keyword" element
     */
    boolean isSetKeyword();
    
    /**
     * Sets the "Keyword" element
     */
    void setKeyword(com.exacttarget.wsdl.partnerapi.BaseMOKeyword keyword);
    
    /**
     * Appends and returns a new empty "Keyword" element
     */
    com.exacttarget.wsdl.partnerapi.BaseMOKeyword addNewKeyword();
    
    /**
     * Unsets the "Keyword" element
     */
    void unsetKeyword();
    
    /**
     * Gets the "MobileTelephoneNumber" element
     */
    java.lang.String getMobileTelephoneNumber();
    
    /**
     * Gets (as xml) the "MobileTelephoneNumber" element
     */
    org.apache.xmlbeans.XmlString xgetMobileTelephoneNumber();
    
    /**
     * True if has "MobileTelephoneNumber" element
     */
    boolean isSetMobileTelephoneNumber();
    
    /**
     * Sets the "MobileTelephoneNumber" element
     */
    void setMobileTelephoneNumber(java.lang.String mobileTelephoneNumber);
    
    /**
     * Sets (as xml) the "MobileTelephoneNumber" element
     */
    void xsetMobileTelephoneNumber(org.apache.xmlbeans.XmlString mobileTelephoneNumber);
    
    /**
     * Unsets the "MobileTelephoneNumber" element
     */
    void unsetMobileTelephoneNumber();
    
    /**
     * Gets the "MOCode" element
     */
    java.lang.String getMOCode();
    
    /**
     * Gets (as xml) the "MOCode" element
     */
    org.apache.xmlbeans.XmlString xgetMOCode();
    
    /**
     * True if has "MOCode" element
     */
    boolean isSetMOCode();
    
    /**
     * Sets the "MOCode" element
     */
    void setMOCode(java.lang.String moCode);
    
    /**
     * Sets (as xml) the "MOCode" element
     */
    void xsetMOCode(org.apache.xmlbeans.XmlString moCode);
    
    /**
     * Unsets the "MOCode" element
     */
    void unsetMOCode();
    
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
     * Gets the "MOMessage" element
     */
    java.lang.String getMOMessage();
    
    /**
     * Gets (as xml) the "MOMessage" element
     */
    org.apache.xmlbeans.XmlString xgetMOMessage();
    
    /**
     * True if has "MOMessage" element
     */
    boolean isSetMOMessage();
    
    /**
     * Sets the "MOMessage" element
     */
    void setMOMessage(java.lang.String moMessage);
    
    /**
     * Sets (as xml) the "MOMessage" element
     */
    void xsetMOMessage(org.apache.xmlbeans.XmlString moMessage);
    
    /**
     * Unsets the "MOMessage" element
     */
    void unsetMOMessage();
    
    /**
     * Gets the "MTMessage" element
     */
    java.lang.String getMTMessage();
    
    /**
     * Gets (as xml) the "MTMessage" element
     */
    org.apache.xmlbeans.XmlString xgetMTMessage();
    
    /**
     * True if has "MTMessage" element
     */
    boolean isSetMTMessage();
    
    /**
     * Sets the "MTMessage" element
     */
    void setMTMessage(java.lang.String mtMessage);
    
    /**
     * Sets (as xml) the "MTMessage" element
     */
    void xsetMTMessage(org.apache.xmlbeans.XmlString mtMessage);
    
    /**
     * Unsets the "MTMessage" element
     */
    void unsetMTMessage();
    
    /**
     * Gets the "Carrier" element
     */
    java.lang.String getCarrier();
    
    /**
     * Gets (as xml) the "Carrier" element
     */
    org.apache.xmlbeans.XmlString xgetCarrier();
    
    /**
     * True if has "Carrier" element
     */
    boolean isSetCarrier();
    
    /**
     * Sets the "Carrier" element
     */
    void setCarrier(java.lang.String carrier);
    
    /**
     * Sets (as xml) the "Carrier" element
     */
    void xsetCarrier(org.apache.xmlbeans.XmlString carrier);
    
    /**
     * Unsets the "Carrier" element
     */
    void unsetCarrier();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent newInstance() {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SMSMOEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SMSMOEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
