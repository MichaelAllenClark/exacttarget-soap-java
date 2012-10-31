/*
 * XML Type:  MessagingVendorKind
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.MessagingVendorKind
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML MessagingVendorKind(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface MessagingVendorKind extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessagingVendorKind.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("messagingvendorkind6ea8type");
    
    /**
     * Gets the "Vendor" element
     */
    java.lang.String getVendor();
    
    /**
     * Gets (as xml) the "Vendor" element
     */
    org.apache.xmlbeans.XmlString xgetVendor();
    
    /**
     * Sets the "Vendor" element
     */
    void setVendor(java.lang.String vendor);
    
    /**
     * Sets (as xml) the "Vendor" element
     */
    void xsetVendor(org.apache.xmlbeans.XmlString vendor);
    
    /**
     * Gets the "Kind" element
     */
    java.lang.String getKind();
    
    /**
     * Gets (as xml) the "Kind" element
     */
    org.apache.xmlbeans.XmlString xgetKind();
    
    /**
     * Sets the "Kind" element
     */
    void setKind(java.lang.String kind);
    
    /**
     * Sets (as xml) the "Kind" element
     */
    void xsetKind(org.apache.xmlbeans.XmlString kind);
    
    /**
     * Gets the "IsUsernameRequired" element
     */
    boolean getIsUsernameRequired();
    
    /**
     * Gets (as xml) the "IsUsernameRequired" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsUsernameRequired();
    
    /**
     * Sets the "IsUsernameRequired" element
     */
    void setIsUsernameRequired(boolean isUsernameRequired);
    
    /**
     * Sets (as xml) the "IsUsernameRequired" element
     */
    void xsetIsUsernameRequired(org.apache.xmlbeans.XmlBoolean isUsernameRequired);
    
    /**
     * Gets the "IsPasswordRequired" element
     */
    boolean getIsPasswordRequired();
    
    /**
     * Gets (as xml) the "IsPasswordRequired" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsPasswordRequired();
    
    /**
     * Sets the "IsPasswordRequired" element
     */
    void setIsPasswordRequired(boolean isPasswordRequired);
    
    /**
     * Sets (as xml) the "IsPasswordRequired" element
     */
    void xsetIsPasswordRequired(org.apache.xmlbeans.XmlBoolean isPasswordRequired);
    
    /**
     * Gets the "IsProfileRequired" element
     */
    boolean getIsProfileRequired();
    
    /**
     * Gets (as xml) the "IsProfileRequired" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsProfileRequired();
    
    /**
     * Sets the "IsProfileRequired" element
     */
    void setIsProfileRequired(boolean isProfileRequired);
    
    /**
     * Sets (as xml) the "IsProfileRequired" element
     */
    void xsetIsProfileRequired(org.apache.xmlbeans.XmlBoolean isProfileRequired);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind newInstance() {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.MessagingVendorKind parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.MessagingVendorKind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
