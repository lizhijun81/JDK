/*
 * Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved.
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

package java.net;

/**
 * Choose a network inteface to be the default for
 * outgoing IPv6 traffic that does not specify a scope_id (and which needs one).
 * <p>
 * Platforms that do not require a default interface may return null
 * which is what this implementation does.
 */

class DefaultInterface {

    static NetworkInterface getDefault() {
        return null;
    }
}
