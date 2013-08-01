/**
 * Instruments.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package europass.instruments.services;

public interface Instruments extends java.rmi.Remote {
    public byte[] getDocumentFromCV(java.lang.String document, java.lang.String filetype, java.lang.String locale) throws java.rmi.RemoteException;
    public byte[] getDocumentFromLP(java.lang.String document, java.lang.String filetype, java.lang.String locale) throws java.rmi.RemoteException;
}
