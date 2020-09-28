/*
 * Copyright (c) 2004, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.mirror.declaration;


/**
 * Represents an enum constant declaration.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @since 1.5
 * @deprecated All components of this API have been superseded by the
 * standardized annotation processing API.  The replacement for the
 * functionality of this interface is included in {@link
 * javax.lang.model.element.VariableElement}.
 */
@Deprecated
@SuppressWarnings("deprecation")
public interface EnumConstantDeclaration extends FieldDeclaration {
    /**
     * {@inheritDoc}
     */
    EnumDeclaration getDeclaringType();
}
