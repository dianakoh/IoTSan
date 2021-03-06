package edu.ksu.cis.bandera.spin;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Bandera, a Java(TM) analysis and transformation toolkit           *
 * Copyright (C) 1998, 1999   James Corbett (corbett@hawaii.edu)     *
 * All rights reserved.                                              *
 *                                                                   *
 * This work was done as a project in the SAnToS Laboratory,         *
 * Department of Computing and Information Sciences, Kansas State    *
 * University, USA (http://www.cis.ksu.edu/santos).                  *
 * It is understood that any modification not identified as such is  *
 * not covered by the preceding statement.                           *
 *                                                                   *
 * This work is free software; you can redistribute it and/or        *
 * modify it under the terms of the GNU Library General Public       *
 * License as published by the Free Software Foundation; either      *
 * version 2 of the License, or (at your option) any later version.  *
 *                                                                   *
 * This work is distributed in the hope that it will be useful,      *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of    *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU *
 * Library General Public License for more details.                  *
 *                                                                   *
 * You should have received a copy of the GNU Library General Public *
 * License along with this toolkit; if not, write to the             *
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,      *
 * Boston, MA  02111-1307, USA.                                      *
 *                                                                   *
 * Java is a trademark of Sun Microsystems, Inc.                     *
 *                                                                   *
 * To submit a bug report, send a comment, or get the latest news on *
 * this project and other SAnToS projects, please visit the web-site *
 *                http://www.cis.ksu.edu/santos                      *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
import java.io.*;
import java.util.*;

import edu.ksu.cis.bandera.bir.*;

/**
 * A trap node in a case tree.
 * <p>
 * This is like an ExprNode, but it represents a trap (e.g., NullPointer,
 * ArrayOutOfBounds).
 */

public class TrapNode implements TreeNode {
	
	public String desc;         // Trap name (e.g. NullPointerException)
	public boolean fatal;       // Is this a fatal (vs. limit) exception?

	public TrapNode(String desc, boolean fatal) {
	this.desc = desc;
	this.fatal = fatal;
	}
	public TreeNode compose(TreeNode tree, Case context) {
	return this;
	}
	public Vector getLeafCases(Vector leafCases) {
	return null;
	}
	public Vector getLeaves(Vector leaves) {
	return leaves;
	}
	public void print(int level) {
	String kind = (fatal) ? " (fatal)" : " (limit)";
	System.out.println(desc + kind);
	}
	public TreeNode specialize(ExprNode leaf, Case context) {
	return this;
	}
}
