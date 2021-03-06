/*
 * Copyright (c) 2005, 2006, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.source.tree;

/**
 * A tree node for an "enhanced" 'for' loop statement.
 * <p>
 * For example:
 * <pre>
 *   for ( <em>variable</em> : <em>expression</em> )
 *       <em>statement</em>
 * </pre>
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @jls section 14.14.2
 * @since 1.6
 */
public interface EnhancedForLoopTree extends StatementTree {
    VariableTree getVariable();

    ExpressionTree getExpression();

    StatementTree getStatement();
}
