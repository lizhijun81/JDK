package org.omg.IOP.CodecPackage;


/**
 * org/omg/IOP/CodecPackage/TypeMismatch.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from ../../../../src/share/classes/org/omg/PortableInterceptor/IOP.idl
 * Friday, June 21, 2013 12:58:26 PM PDT
 */

public final class TypeMismatch extends org.omg.CORBA.UserException {

    public TypeMismatch() {
        super(TypeMismatchHelper.id());
    } // ctor


    public TypeMismatch(String $reason) {
        super(TypeMismatchHelper.id() + "  " + $reason);
    } // ctor

} // class TypeMismatch
