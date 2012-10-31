/*
 * XML Type:  VoiceTriggeredSend
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML VoiceTriggeredSend(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface VoiceTriggeredSend extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VoiceTriggeredSend.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("voicetriggeredsend5d09type");
    
    /**
     * Gets the "VoiceTriggeredSendDefinition" element
     */
    com.exacttarget.wsdl.partnerapi.VoiceTriggeredSendDefinition getVoiceTriggeredSendDefinition();
    
    /**
     * True if has "VoiceTriggeredSendDefinition" element
     */
    boolean isSetVoiceTriggeredSendDefinition();
    
    /**
     * Sets the "VoiceTriggeredSendDefinition" element
     */
    void setVoiceTriggeredSendDefinition(com.exacttarget.wsdl.partnerapi.VoiceTriggeredSendDefinition voiceTriggeredSendDefinition);
    
    /**
     * Appends and returns a new empty "VoiceTriggeredSendDefinition" element
     */
    com.exacttarget.wsdl.partnerapi.VoiceTriggeredSendDefinition addNewVoiceTriggeredSendDefinition();
    
    /**
     * Unsets the "VoiceTriggeredSendDefinition" element
     */
    void unsetVoiceTriggeredSendDefinition();
    
    /**
     * Gets the "Subscriber" element
     */
    com.exacttarget.wsdl.partnerapi.Subscriber getSubscriber();
    
    /**
     * True if has "Subscriber" element
     */
    boolean isSetSubscriber();
    
    /**
     * Sets the "Subscriber" element
     */
    void setSubscriber(com.exacttarget.wsdl.partnerapi.Subscriber subscriber);
    
    /**
     * Appends and returns a new empty "Subscriber" element
     */
    com.exacttarget.wsdl.partnerapi.Subscriber addNewSubscriber();
    
    /**
     * Unsets the "Subscriber" element
     */
    void unsetSubscriber();
    
    /**
     * Gets the "Message" element
     */
    java.lang.String getMessage();
    
    /**
     * Gets (as xml) the "Message" element
     */
    org.apache.xmlbeans.XmlString xgetMessage();
    
    /**
     * True if has "Message" element
     */
    boolean isSetMessage();
    
    /**
     * Sets the "Message" element
     */
    void setMessage(java.lang.String message);
    
    /**
     * Sets (as xml) the "Message" element
     */
    void xsetMessage(org.apache.xmlbeans.XmlString message);
    
    /**
     * Unsets the "Message" element
     */
    void unsetMessage();
    
    /**
     * Gets the "Number" element
     */
    java.lang.String getNumber();
    
    /**
     * Gets (as xml) the "Number" element
     */
    org.apache.xmlbeans.XmlString xgetNumber();
    
    /**
     * True if has "Number" element
     */
    boolean isSetNumber();
    
    /**
     * Sets the "Number" element
     */
    void setNumber(java.lang.String number);
    
    /**
     * Sets (as xml) the "Number" element
     */
    void xsetNumber(org.apache.xmlbeans.XmlString number);
    
    /**
     * Unsets the "Number" element
     */
    void unsetNumber();
    
    /**
     * Gets the "TransferMessage" element
     */
    java.lang.String getTransferMessage();
    
    /**
     * Gets (as xml) the "TransferMessage" element
     */
    org.apache.xmlbeans.XmlString xgetTransferMessage();
    
    /**
     * True if has "TransferMessage" element
     */
    boolean isSetTransferMessage();
    
    /**
     * Sets the "TransferMessage" element
     */
    void setTransferMessage(java.lang.String transferMessage);
    
    /**
     * Sets (as xml) the "TransferMessage" element
     */
    void xsetTransferMessage(org.apache.xmlbeans.XmlString transferMessage);
    
    /**
     * Unsets the "TransferMessage" element
     */
    void unsetTransferMessage();
    
    /**
     * Gets the "TransferNumber" element
     */
    java.lang.String getTransferNumber();
    
    /**
     * Gets (as xml) the "TransferNumber" element
     */
    org.apache.xmlbeans.XmlString xgetTransferNumber();
    
    /**
     * True if has "TransferNumber" element
     */
    boolean isSetTransferNumber();
    
    /**
     * Sets the "TransferNumber" element
     */
    void setTransferNumber(java.lang.String transferNumber);
    
    /**
     * Sets (as xml) the "TransferNumber" element
     */
    void xsetTransferNumber(org.apache.xmlbeans.XmlString transferNumber);
    
    /**
     * Unsets the "TransferNumber" element
     */
    void unsetTransferNumber();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend newInstance() {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
