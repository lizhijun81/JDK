package org.omg.DynamicAny.DynAnyPackage;


/**
 * org/omg/DynamicAny/DynAnyPackage/TypeMismatch.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from ../../../../src/share/classes/org/omg/DynamicAny/DynamicAny.idl
 * Friday, June 21, 2013 12:58:27 PM PDT
 */

public final class TypeMismatch extends org.omg.CORBA.UserException {

    public TypeMismatch() {
        super(TypeMismatchHelper.id());
    } // ctor


    public TypeMismatch(String $reason) {
        super(TypeMismatchHelper.id() + "  " + $reason);
    } // ctor

} // class TypeMismatch
