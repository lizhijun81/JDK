package com.sun.corba.se.spi.activation;


/**
 * com/sun/corba/se/spi/activation/NoSuchEndPoint.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from ../../../../src/share/classes/com/sun/corba/se/spi/activation/activation.idl
 * Friday, June 21, 2013 12:58:49 PM PDT
 */

public final class NoSuchEndPoint extends org.omg.CORBA.UserException {

    public NoSuchEndPoint() {
        super(NoSuchEndPointHelper.id());
    } // ctor


    public NoSuchEndPoint(String $reason) {
        super(NoSuchEndPointHelper.id() + "  " + $reason);
    } // ctor

} // class NoSuchEndPoint
