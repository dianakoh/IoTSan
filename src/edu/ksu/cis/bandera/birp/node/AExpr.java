/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AExpr extends PExpr
{
    private PExpr7 _expr7_;

    public AExpr()
    {
    }

    public AExpr(
        PExpr7 _expr7_)
    {
        setExpr7(_expr7_);

    }
    public Object clone()
    {
        return new AExpr(
            (PExpr7) cloneNode(_expr7_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpr(this);
    }

    public PExpr7 getExpr7()
    {
        return _expr7_;
    }

    public void setExpr7(PExpr7 node)
    {
        if(_expr7_ != null)
        {
            _expr7_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr7_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_expr7_);
    }

    void removeChild(Node child)
    {
        if(_expr7_ == child)
        {
            _expr7_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_expr7_ == oldChild)
        {
            setExpr7((PExpr7) newChild);
            return;
        }

    }
}
