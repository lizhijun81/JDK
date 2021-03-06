/*
 * Copyright (c) 1995, 1998, Oracle and/or its affiliates. All rights reserved.
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
package java.awt.peer;

import java.awt.*;

/**
 * The peer interface for {@link Checkbox}.
 * <p>
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
public interface CheckboxPeer extends ComponentPeer {

    /**
     * Sets the state of the checkbox to be checked ({@code true}) or
     * unchecked ({@code false}).
     *
     * @param t the state to set on the checkbox
     * @see Checkbox#setState(boolean)
     */
    void setState(boolean state);

    /**
     * Sets the checkbox group for this checkbox. Checkboxes in one checkbox
     * group can only be selected exclusively (like radio buttons). A value
     * of {@code null} removes this checkbox from any checkbox group.
     *
     * @param g the checkbox group to set, or {@code null} when this
     *          checkbox should not be placed in any group
     * @see Checkbox#setCheckboxGroup(CheckboxGroup)
     */
    void setCheckboxGroup(CheckboxGroup g);

    /**
     * Sets the label that should be displayed on the ckeckbox. A value of
     * {@code null} means that no label should be displayed.
     *
     * @param label the label to be displayed on the checkbox, or
     *              {@code null} when no label should be displayed.
     */
    void setLabel(String label);

}
