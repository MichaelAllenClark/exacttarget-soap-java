/*
 * XML Type:  ListSend
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ListSend
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML ListSend(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface ListSend extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListSend.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("listsend3ad0type");
    
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
     * Gets the "Duplicates" element
     */
    int getDuplicates();
    
    /**
     * Gets (as xml) the "Duplicates" element
     */
    org.apache.xmlbeans.XmlInt xgetDuplicates();
    
    /**
     * True if has "Duplicates" element
     */
    boolean isSetDuplicates();
    
    /**
     * Sets the "Duplicates" element
     */
    void setDuplicates(int duplicates);
    
    /**
     * Sets (as xml) the "Duplicates" element
     */
    void xsetDuplicates(org.apache.xmlbeans.XmlInt duplicates);
    
    /**
     * Unsets the "Duplicates" element
     */
    void unsetDuplicates();
    
    /**
     * Gets the "InvalidAddresses" element
     */
    int getInvalidAddresses();
    
    /**
     * Gets (as xml) the "InvalidAddresses" element
     */
    org.apache.xmlbeans.XmlInt xgetInvalidAddresses();
    
    /**
     * True if has "InvalidAddresses" element
     */
    boolean isSetInvalidAddresses();
    
    /**
     * Sets the "InvalidAddresses" element
     */
    void setInvalidAddresses(int invalidAddresses);
    
    /**
     * Sets (as xml) the "InvalidAddresses" element
     */
    void xsetInvalidAddresses(org.apache.xmlbeans.XmlInt invalidAddresses);
    
    /**
     * Unsets the "InvalidAddresses" element
     */
    void unsetInvalidAddresses();
    
    /**
     * Gets the "ExistingUndeliverables" element
     */
    int getExistingUndeliverables();
    
    /**
     * Gets (as xml) the "ExistingUndeliverables" element
     */
    org.apache.xmlbeans.XmlInt xgetExistingUndeliverables();
    
    /**
     * True if has "ExistingUndeliverables" element
     */
    boolean isSetExistingUndeliverables();
    
    /**
     * Sets the "ExistingUndeliverables" element
     */
    void setExistingUndeliverables(int existingUndeliverables);
    
    /**
     * Sets (as xml) the "ExistingUndeliverables" element
     */
    void xsetExistingUndeliverables(org.apache.xmlbeans.XmlInt existingUndeliverables);
    
    /**
     * Unsets the "ExistingUndeliverables" element
     */
    void unsetExistingUndeliverables();
    
    /**
     * Gets the "ExistingUnsubscribes" element
     */
    int getExistingUnsubscribes();
    
    /**
     * Gets (as xml) the "ExistingUnsubscribes" element
     */
    org.apache.xmlbeans.XmlInt xgetExistingUnsubscribes();
    
    /**
     * True if has "ExistingUnsubscribes" element
     */
    boolean isSetExistingUnsubscribes();
    
    /**
     * Sets the "ExistingUnsubscribes" element
     */
    void setExistingUnsubscribes(int existingUnsubscribes);
    
    /**
     * Sets (as xml) the "ExistingUnsubscribes" element
     */
    void xsetExistingUnsubscribes(org.apache.xmlbeans.XmlInt existingUnsubscribes);
    
    /**
     * Unsets the "ExistingUnsubscribes" element
     */
    void unsetExistingUnsubscribes();
    
    /**
     * Gets the "HardBounces" element
     */
    int getHardBounces();
    
    /**
     * Gets (as xml) the "HardBounces" element
     */
    org.apache.xmlbeans.XmlInt xgetHardBounces();
    
    /**
     * True if has "HardBounces" element
     */
    boolean isSetHardBounces();
    
    /**
     * Sets the "HardBounces" element
     */
    void setHardBounces(int hardBounces);
    
    /**
     * Sets (as xml) the "HardBounces" element
     */
    void xsetHardBounces(org.apache.xmlbeans.XmlInt hardBounces);
    
    /**
     * Unsets the "HardBounces" element
     */
    void unsetHardBounces();
    
    /**
     * Gets the "SoftBounces" element
     */
    int getSoftBounces();
    
    /**
     * Gets (as xml) the "SoftBounces" element
     */
    org.apache.xmlbeans.XmlInt xgetSoftBounces();
    
    /**
     * True if has "SoftBounces" element
     */
    boolean isSetSoftBounces();
    
    /**
     * Sets the "SoftBounces" element
     */
    void setSoftBounces(int softBounces);
    
    /**
     * Sets (as xml) the "SoftBounces" element
     */
    void xsetSoftBounces(org.apache.xmlbeans.XmlInt softBounces);
    
    /**
     * Unsets the "SoftBounces" element
     */
    void unsetSoftBounces();
    
    /**
     * Gets the "OtherBounces" element
     */
    int getOtherBounces();
    
    /**
     * Gets (as xml) the "OtherBounces" element
     */
    org.apache.xmlbeans.XmlInt xgetOtherBounces();
    
    /**
     * True if has "OtherBounces" element
     */
    boolean isSetOtherBounces();
    
    /**
     * Sets the "OtherBounces" element
     */
    void setOtherBounces(int otherBounces);
    
    /**
     * Sets (as xml) the "OtherBounces" element
     */
    void xsetOtherBounces(org.apache.xmlbeans.XmlInt otherBounces);
    
    /**
     * Unsets the "OtherBounces" element
     */
    void unsetOtherBounces();
    
    /**
     * Gets the "ForwardedEmails" element
     */
    int getForwardedEmails();
    
    /**
     * Gets (as xml) the "ForwardedEmails" element
     */
    org.apache.xmlbeans.XmlInt xgetForwardedEmails();
    
    /**
     * True if has "ForwardedEmails" element
     */
    boolean isSetForwardedEmails();
    
    /**
     * Sets the "ForwardedEmails" element
     */
    void setForwardedEmails(int forwardedEmails);
    
    /**
     * Sets (as xml) the "ForwardedEmails" element
     */
    void xsetForwardedEmails(org.apache.xmlbeans.XmlInt forwardedEmails);
    
    /**
     * Unsets the "ForwardedEmails" element
     */
    void unsetForwardedEmails();
    
    /**
     * Gets the "UniqueClicks" element
     */
    int getUniqueClicks();
    
    /**
     * Gets (as xml) the "UniqueClicks" element
     */
    org.apache.xmlbeans.XmlInt xgetUniqueClicks();
    
    /**
     * True if has "UniqueClicks" element
     */
    boolean isSetUniqueClicks();
    
    /**
     * Sets the "UniqueClicks" element
     */
    void setUniqueClicks(int uniqueClicks);
    
    /**
     * Sets (as xml) the "UniqueClicks" element
     */
    void xsetUniqueClicks(org.apache.xmlbeans.XmlInt uniqueClicks);
    
    /**
     * Unsets the "UniqueClicks" element
     */
    void unsetUniqueClicks();
    
    /**
     * Gets the "UniqueOpens" element
     */
    int getUniqueOpens();
    
    /**
     * Gets (as xml) the "UniqueOpens" element
     */
    org.apache.xmlbeans.XmlInt xgetUniqueOpens();
    
    /**
     * True if has "UniqueOpens" element
     */
    boolean isSetUniqueOpens();
    
    /**
     * Sets the "UniqueOpens" element
     */
    void setUniqueOpens(int uniqueOpens);
    
    /**
     * Sets (as xml) the "UniqueOpens" element
     */
    void xsetUniqueOpens(org.apache.xmlbeans.XmlInt uniqueOpens);
    
    /**
     * Unsets the "UniqueOpens" element
     */
    void unsetUniqueOpens();
    
    /**
     * Gets the "NumberSent" element
     */
    int getNumberSent();
    
    /**
     * Gets (as xml) the "NumberSent" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberSent();
    
    /**
     * Tests for nil "NumberSent" element
     */
    boolean isNilNumberSent();
    
    /**
     * True if has "NumberSent" element
     */
    boolean isSetNumberSent();
    
    /**
     * Sets the "NumberSent" element
     */
    void setNumberSent(int numberSent);
    
    /**
     * Sets (as xml) the "NumberSent" element
     */
    void xsetNumberSent(org.apache.xmlbeans.XmlInt numberSent);
    
    /**
     * Nils the "NumberSent" element
     */
    void setNilNumberSent();
    
    /**
     * Unsets the "NumberSent" element
     */
    void unsetNumberSent();
    
    /**
     * Gets the "NumberDelivered" element
     */
    int getNumberDelivered();
    
    /**
     * Gets (as xml) the "NumberDelivered" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberDelivered();
    
    /**
     * Tests for nil "NumberDelivered" element
     */
    boolean isNilNumberDelivered();
    
    /**
     * True if has "NumberDelivered" element
     */
    boolean isSetNumberDelivered();
    
    /**
     * Sets the "NumberDelivered" element
     */
    void setNumberDelivered(int numberDelivered);
    
    /**
     * Sets (as xml) the "NumberDelivered" element
     */
    void xsetNumberDelivered(org.apache.xmlbeans.XmlInt numberDelivered);
    
    /**
     * Nils the "NumberDelivered" element
     */
    void setNilNumberDelivered();
    
    /**
     * Unsets the "NumberDelivered" element
     */
    void unsetNumberDelivered();
    
    /**
     * Gets the "Unsubscribes" element
     */
    int getUnsubscribes();
    
    /**
     * Gets (as xml) the "Unsubscribes" element
     */
    org.apache.xmlbeans.XmlInt xgetUnsubscribes();
    
    /**
     * True if has "Unsubscribes" element
     */
    boolean isSetUnsubscribes();
    
    /**
     * Sets the "Unsubscribes" element
     */
    void setUnsubscribes(int unsubscribes);
    
    /**
     * Sets (as xml) the "Unsubscribes" element
     */
    void xsetUnsubscribes(org.apache.xmlbeans.XmlInt unsubscribes);
    
    /**
     * Unsets the "Unsubscribes" element
     */
    void unsetUnsubscribes();
    
    /**
     * Gets the "MissingAddresses" element
     */
    int getMissingAddresses();
    
    /**
     * Gets (as xml) the "MissingAddresses" element
     */
    org.apache.xmlbeans.XmlInt xgetMissingAddresses();
    
    /**
     * True if has "MissingAddresses" element
     */
    boolean isSetMissingAddresses();
    
    /**
     * Sets the "MissingAddresses" element
     */
    void setMissingAddresses(int missingAddresses);
    
    /**
     * Sets (as xml) the "MissingAddresses" element
     */
    void xsetMissingAddresses(org.apache.xmlbeans.XmlInt missingAddresses);
    
    /**
     * Unsets the "MissingAddresses" element
     */
    void unsetMissingAddresses();
    
    /**
     * Gets the "PreviewURL" element
     */
    java.lang.String getPreviewURL();
    
    /**
     * Gets (as xml) the "PreviewURL" element
     */
    org.apache.xmlbeans.XmlString xgetPreviewURL();
    
    /**
     * True if has "PreviewURL" element
     */
    boolean isSetPreviewURL();
    
    /**
     * Sets the "PreviewURL" element
     */
    void setPreviewURL(java.lang.String previewURL);
    
    /**
     * Sets (as xml) the "PreviewURL" element
     */
    void xsetPreviewURL(org.apache.xmlbeans.XmlString previewURL);
    
    /**
     * Unsets the "PreviewURL" element
     */
    void unsetPreviewURL();
    
    /**
     * Gets array of all "Links" elements
     */
    com.exacttarget.wsdl.partnerapi.Link[] getLinksArray();
    
    /**
     * Gets ith "Links" element
     */
    com.exacttarget.wsdl.partnerapi.Link getLinksArray(int i);
    
    /**
     * Returns number of "Links" element
     */
    int sizeOfLinksArray();
    
    /**
     * Sets array of all "Links" element
     */
    void setLinksArray(com.exacttarget.wsdl.partnerapi.Link[] linksArray);
    
    /**
     * Sets ith "Links" element
     */
    void setLinksArray(int i, com.exacttarget.wsdl.partnerapi.Link links);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Links" element
     */
    com.exacttarget.wsdl.partnerapi.Link insertNewLinks(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Links" element
     */
    com.exacttarget.wsdl.partnerapi.Link addNewLinks();
    
    /**
     * Removes the ith "Links" element
     */
    void removeLinks(int i);
    
    /**
     * Gets array of all "Events" elements
     */
    com.exacttarget.wsdl.partnerapi.TrackingEvent[] getEventsArray();
    
    /**
     * Gets ith "Events" element
     */
    com.exacttarget.wsdl.partnerapi.TrackingEvent getEventsArray(int i);
    
    /**
     * Returns number of "Events" element
     */
    int sizeOfEventsArray();
    
    /**
     * Sets array of all "Events" element
     */
    void setEventsArray(com.exacttarget.wsdl.partnerapi.TrackingEvent[] eventsArray);
    
    /**
     * Sets ith "Events" element
     */
    void setEventsArray(int i, com.exacttarget.wsdl.partnerapi.TrackingEvent events);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Events" element
     */
    com.exacttarget.wsdl.partnerapi.TrackingEvent insertNewEvents(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Events" element
     */
    com.exacttarget.wsdl.partnerapi.TrackingEvent addNewEvents();
    
    /**
     * Removes the ith "Events" element
     */
    void removeEvents(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ListSend newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListSend newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ListSend parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ListSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
