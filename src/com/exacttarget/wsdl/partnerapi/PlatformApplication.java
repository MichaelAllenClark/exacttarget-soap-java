/*
 * XML Type:  PlatformApplication
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PlatformApplication
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML PlatformApplication(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface PlatformApplication extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PlatformApplication.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("platformapplication644btype");
    
    /**
     * Gets the "Package" element
     */
    com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage getPackage();
    
    /**
     * Sets the "Package" element
     */
    void setPackage(com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage xpackage);
    
    /**
     * Appends and returns a new empty "Package" element
     */
    com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage addNewPackage();
    
    /**
     * Gets array of all "Packages" elements
     */
    com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage[] getPackagesArray();
    
    /**
     * Gets ith "Packages" element
     */
    com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage getPackagesArray(int i);
    
    /**
     * Returns number of "Packages" element
     */
    int sizeOfPackagesArray();
    
    /**
     * Sets array of all "Packages" element
     */
    void setPackagesArray(com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage[] packagesArray);
    
    /**
     * Sets ith "Packages" element
     */
    void setPackagesArray(int i, com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage packages);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Packages" element
     */
    com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage insertNewPackages(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Packages" element
     */
    com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage addNewPackages();
    
    /**
     * Removes the ith "Packages" element
     */
    void removePackages(int i);
    
    /**
     * Gets the "ResourceSpecification" element
     */
    com.exacttarget.wsdl.partnerapi.ResourceSpecification getResourceSpecification();
    
    /**
     * True if has "ResourceSpecification" element
     */
    boolean isSetResourceSpecification();
    
    /**
     * Sets the "ResourceSpecification" element
     */
    void setResourceSpecification(com.exacttarget.wsdl.partnerapi.ResourceSpecification resourceSpecification);
    
    /**
     * Appends and returns a new empty "ResourceSpecification" element
     */
    com.exacttarget.wsdl.partnerapi.ResourceSpecification addNewResourceSpecification();
    
    /**
     * Unsets the "ResourceSpecification" element
     */
    void unsetResourceSpecification();
    
    /**
     * Gets the "DeveloperVersion" element
     */
    java.lang.String getDeveloperVersion();
    
    /**
     * Gets (as xml) the "DeveloperVersion" element
     */
    org.apache.xmlbeans.XmlString xgetDeveloperVersion();
    
    /**
     * True if has "DeveloperVersion" element
     */
    boolean isSetDeveloperVersion();
    
    /**
     * Sets the "DeveloperVersion" element
     */
    void setDeveloperVersion(java.lang.String developerVersion);
    
    /**
     * Sets (as xml) the "DeveloperVersion" element
     */
    void xsetDeveloperVersion(org.apache.xmlbeans.XmlString developerVersion);
    
    /**
     * Unsets the "DeveloperVersion" element
     */
    void unsetDeveloperVersion();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication newInstance() {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.PlatformApplication parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.PlatformApplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
