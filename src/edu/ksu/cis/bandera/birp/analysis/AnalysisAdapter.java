/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.analysis;

import java.util.*;
import edu.ksu.cis.bandera.birp.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable in;
    private Hashtable out;

    public Object getIn(Node node)
    {
        if(in == null)
        {
            return null;
        }

        return in.get(node);
    }

    public void setIn(Node node, Object in)
    {
        if(this.in == null)
        {
            this.in = new Hashtable(1);
        }

        if(in != null)
        {
            this.in.put(node, in);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(out == null)
        {
            return null;
        }

        return out.get(node);
    }

    public void setOut(Node node, Object out)
    {
        if(this.out == null)
        {
            this.out = new Hashtable(1);
        }

        if(out != null)
        {
            this.out.put(node, out);
        }
        else
        {
            this.out.remove(node);
        }
    }
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAProgram(AProgram node)
    {
        defaultCase(node);
    }

    public void caseAProcess(AProcess node)
    {
        defaultCase(node);
    }

    public void caseAConstantDefinition(AConstantDefinition node)
    {
        defaultCase(node);
    }

    public void caseATypedefDefinition(ATypedefDefinition node)
    {
        defaultCase(node);
    }

    public void caseARangeTypespec(ARangeTypespec node)
    {
        defaultCase(node);
    }

    public void caseABooleanTypespec(ABooleanTypespec node)
    {
        defaultCase(node);
    }

    public void caseATidTypespec(ATidTypespec node)
    {
        defaultCase(node);
    }

    public void caseAEnumeratedTypespec(AEnumeratedTypespec node)
    {
        defaultCase(node);
    }

    public void caseARecordTypespec(ARecordTypespec node)
    {
        defaultCase(node);
    }

    public void caseAArrayTypespec(AArrayTypespec node)
    {
        defaultCase(node);
    }

    public void caseARefTypespec(ARefTypespec node)
    {
        defaultCase(node);
    }

    public void caseALockTypespec(ALockTypespec node)
    {
        defaultCase(node);
    }

    public void caseATypespecType(ATypespecType node)
    {
        defaultCase(node);
    }

    public void caseADefinedType(ADefinedType node)
    {
        defaultCase(node);
    }

    public void caseANameEnumconst(ANameEnumconst node)
    {
        defaultCase(node);
    }

    public void caseANamevalueEnumconst(ANamevalueEnumconst node)
    {
        defaultCase(node);
    }

    public void caseAEnumdeftail(AEnumdeftail node)
    {
        defaultCase(node);
    }

    public void caseAField(AField node)
    {
        defaultCase(node);
    }

    public void caseAReftail(AReftail node)
    {
        defaultCase(node);
    }

    public void caseAIntConst(AIntConst node)
    {
        defaultCase(node);
    }

    public void caseAIdConst(AIdConst node)
    {
        defaultCase(node);
    }

    public void caseASubtype(ASubtype node)
    {
        defaultCase(node);
    }

    public void caseAVariableGlobal(AVariableGlobal node)
    {
        defaultCase(node);
    }

    public void caseACollectionGlobal(ACollectionGlobal node)
    {
        defaultCase(node);
    }

    public void caseACollection(ACollection node)
    {
        defaultCase(node);
    }

    public void caseAVariable(AVariable node)
    {
        defaultCase(node);
    }

    public void caseAOneParameters(AOneParameters node)
    {
        defaultCase(node);
    }

    public void caseAManyParameters(AManyParameters node)
    {
        defaultCase(node);
    }

    public void caseAParameter(AParameter node)
    {
        defaultCase(node);
    }

    public void caseAInitializer(AInitializer node)
    {
        defaultCase(node);
    }

    public void caseAIntegerValue(AIntegerValue node)
    {
        defaultCase(node);
    }

    public void caseABoolValue(ABoolValue node)
    {
        defaultCase(node);
    }

    public void caseAIdValue(AIdValue node)
    {
        defaultCase(node);
    }

    public void caseANullValue(ANullValue node)
    {
        defaultCase(node);
    }

    public void caseARefValue(ARefValue node)
    {
        defaultCase(node);
    }

    public void caseAFalseBool(AFalseBool node)
    {
        defaultCase(node);
    }

    public void caseATrueBool(ATrueBool node)
    {
        defaultCase(node);
    }

    public void caseAThread(AThread node)
    {
        defaultCase(node);
    }

    public void caseALocation(ALocation node)
    {
        defaultCase(node);
    }

    public void caseATransformation(ATransformation node)
    {
        defaultCase(node);
    }

    public void caseAEmptyLiveset(AEmptyLiveset node)
    {
        defaultCase(node);
    }

    public void caseANonemptyLiveset(ANonemptyLiveset node)
    {
        defaultCase(node);
    }

    public void caseALivevar(ALivevar node)
    {
        defaultCase(node);
    }

    public void caseAExpr(AExpr node)
    {
        defaultCase(node);
    }

    public void caseAExpr6Expr7(AExpr6Expr7 node)
    {
        defaultCase(node);
    }

    public void caseAOrExpr7(AOrExpr7 node)
    {
        defaultCase(node);
    }

    public void caseAExpr5Expr6(AExpr5Expr6 node)
    {
        defaultCase(node);
    }

    public void caseAAndExpr6(AAndExpr6 node)
    {
        defaultCase(node);
    }

    public void caseAExpr4Expr5(AExpr4Expr5 node)
    {
        defaultCase(node);
    }

    public void caseAEqExpr5(AEqExpr5 node)
    {
        defaultCase(node);
    }

    public void caseANoteqExpr5(ANoteqExpr5 node)
    {
        defaultCase(node);
    }

    public void caseAExpr3Expr4(AExpr3Expr4 node)
    {
        defaultCase(node);
    }

    public void caseALtExpr4(ALtExpr4 node)
    {
        defaultCase(node);
    }

    public void caseALeExpr4(ALeExpr4 node)
    {
        defaultCase(node);
    }

    public void caseAGtExpr4(AGtExpr4 node)
    {
        defaultCase(node);
    }

    public void caseAGeExpr4(AGeExpr4 node)
    {
        defaultCase(node);
    }

    public void caseAExpr2Expr3(AExpr2Expr3 node)
    {
        defaultCase(node);
    }

    public void caseAPlusExpr3(APlusExpr3 node)
    {
        defaultCase(node);
    }

    public void caseAMinusExpr3(AMinusExpr3 node)
    {
        defaultCase(node);
    }

    public void caseAExpr1Expr2(AExpr1Expr2 node)
    {
        defaultCase(node);
    }

    public void caseAMultExpr2(AMultExpr2 node)
    {
        defaultCase(node);
    }

    public void caseADivExpr2(ADivExpr2 node)
    {
        defaultCase(node);
    }

    public void caseAModExpr2(AModExpr2 node)
    {
        defaultCase(node);
    }

    public void caseAExpr0Expr1(AExpr0Expr1 node)
    {
        defaultCase(node);
    }

    public void caseAPlusExpr1(APlusExpr1 node)
    {
        defaultCase(node);
    }

    public void caseAMinusExpr1(AMinusExpr1 node)
    {
        defaultCase(node);
    }

    public void caseANotExpr1(ANotExpr1 node)
    {
        defaultCase(node);
    }

    public void caseAValueExpr0(AValueExpr0 node)
    {
        defaultCase(node);
    }

    public void caseALocktestExpr0(ALocktestExpr0 node)
    {
        defaultCase(node);
    }

    public void caseAThreadtestExpr0(AThreadtestExpr0 node)
    {
        defaultCase(node);
    }

    public void caseAFieldselectExpr0(AFieldselectExpr0 node)
    {
        defaultCase(node);
    }

    public void caseAArrayselectExpr0(AArrayselectExpr0 node)
    {
        defaultCase(node);
    }

    public void caseAArraylengthExpr0(AArraylengthExpr0 node)
    {
        defaultCase(node);
    }

    public void caseAInstanceofExpr0(AInstanceofExpr0 node)
    {
        defaultCase(node);
    }

    public void caseARemoterefExpr0(ARemoterefExpr0 node)
    {
        defaultCase(node);
    }

    public void caseAParenexprExpr0(AParenexprExpr0 node)
    {
        defaultCase(node);
    }

    public void caseAValueLhs(AValueLhs node)
    {
        defaultCase(node);
    }

    public void caseAFieldselectLhs(AFieldselectLhs node)
    {
        defaultCase(node);
    }

    public void caseAArrayselectLhs(AArrayselectLhs node)
    {
        defaultCase(node);
    }

    public void caseAArraylengthLhs(AArraylengthLhs node)
    {
        defaultCase(node);
    }

    public void caseAAssignmentAction(AAssignmentAction node)
    {
        defaultCase(node);
    }

    public void caseAPrintactionAction(APrintactionAction node)
    {
        defaultCase(node);
    }

    public void caseAAssertactionAction(AAssertactionAction node)
    {
        defaultCase(node);
    }

    public void caseAChoiceAction(AChoiceAction node)
    {
        defaultCase(node);
    }

    public void caseAAllocationAction(AAllocationAction node)
    {
        defaultCase(node);
    }

    public void caseALockupdateAction(ALockupdateAction node)
    {
        defaultCase(node);
    }

    public void caseAThreadupdateAction(AThreadupdateAction node)
    {
        defaultCase(node);
    }

    public void caseAAssignment(AAssignment node)
    {
        defaultCase(node);
    }

    public void caseAPrintaction(APrintaction node)
    {
        defaultCase(node);
    }

    public void caseAOnePrintargs(AOnePrintargs node)
    {
        defaultCase(node);
    }

    public void caseAMorePrintargs(AMorePrintargs node)
    {
        defaultCase(node);
    }

    public void caseAStringPrintarg(AStringPrintarg node)
    {
        defaultCase(node);
    }

    public void caseAVarPrintarg(AVarPrintarg node)
    {
        defaultCase(node);
    }

    public void caseAAssertaction(AAssertaction node)
    {
        defaultCase(node);
    }

    public void caseAInternChoice(AInternChoice node)
    {
        defaultCase(node);
    }

    public void caseAExternChoice(AExternChoice node)
    {
        defaultCase(node);
    }

    public void caseAForallChoice(AForallChoice node)
    {
        defaultCase(node);
    }

    public void caseAChoicetail(AChoicetail node)
    {
        defaultCase(node);
    }

    public void caseAAllocation(AAllocation node)
    {
        defaultCase(node);
    }

    public void caseAArraylength(AArraylength node)
    {
        defaultCase(node);
    }

    public void caseALockupdate(ALockupdate node)
    {
        defaultCase(node);
    }

    public void caseALockLockOp(ALockLockOp node)
    {
        defaultCase(node);
    }

    public void caseAUnlockLockOp(AUnlockLockOp node)
    {
        defaultCase(node);
    }

    public void caseAWaitLockOp(AWaitLockOp node)
    {
        defaultCase(node);
    }

    public void caseAUnwaitLockOp(AUnwaitLockOp node)
    {
        defaultCase(node);
    }

    public void caseANotifyLockOp(ANotifyLockOp node)
    {
        defaultCase(node);
    }

    public void caseANotifyallLockOp(ANotifyallLockOp node)
    {
        defaultCase(node);
    }

    public void caseALocktest(ALocktest node)
    {
        defaultCase(node);
    }

    public void caseALockavailableLocktestop(ALockavailableLocktestop node)
    {
        defaultCase(node);
    }

    public void caseAHaslockLocktestop(AHaslockLocktestop node)
    {
        defaultCase(node);
    }

    public void caseAWasnotifiedLocktestop(AWasnotifiedLocktestop node)
    {
        defaultCase(node);
    }

    public void caseAStartThreadupdate(AStartThreadupdate node)
    {
        defaultCase(node);
    }

    public void caseAExitThreadupdate(AExitThreadupdate node)
    {
        defaultCase(node);
    }

    public void caseALhsAssign(ALhsAssign node)
    {
        defaultCase(node);
    }

    public void caseAOneStartargs(AOneStartargs node)
    {
        defaultCase(node);
    }

    public void caseAMoreStartargs(AMoreStartargs node)
    {
        defaultCase(node);
    }

    public void caseAStartarg(AStartarg node)
    {
        defaultCase(node);
    }

    public void caseATerminatedThreadtest(ATerminatedThreadtest node)
    {
        defaultCase(node);
    }

    public void caseAAtlocationThreadtest(AAtlocationThreadtest node)
    {
        defaultCase(node);
    }

    public void caseAPredicates(APredicates node)
    {
        defaultCase(node);
    }

    public void caseAPredicate(APredicate node)
    {
        defaultCase(node);
    }

    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    public void caseTLbrace(TLbrace node)
    {
        defaultCase(node);
    }

    public void caseTRbrace(TRbrace node)
    {
        defaultCase(node);
    }

    public void caseTLparen(TLparen node)
    {
        defaultCase(node);
    }

    public void caseTRparen(TRparen node)
    {
        defaultCase(node);
    }

    public void caseTLbrack(TLbrack node)
    {
        defaultCase(node);
    }

    public void caseTRbrack(TRbrack node)
    {
        defaultCase(node);
    }

    public void caseTBar(TBar node)
    {
        defaultCase(node);
    }

    public void caseTAt(TAt node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    public void caseTDotdot(TDotdot node)
    {
        defaultCase(node);
    }

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    public void caseTEq(TEq node)
    {
        defaultCase(node);
    }

    public void caseTEquals(TEquals node)
    {
        defaultCase(node);
    }

    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    public void caseTNoteq(TNoteq node)
    {
        defaultCase(node);
    }

    public void caseTLt(TLt node)
    {
        defaultCase(node);
    }

    public void caseTGt(TGt node)
    {
        defaultCase(node);
    }

    public void caseTLe(TLe node)
    {
        defaultCase(node);
    }

    public void caseTGe(TGe node)
    {
        defaultCase(node);
    }

    public void caseTAssign(TAssign node)
    {
        defaultCase(node);
    }

    public void caseTAssert(TAssert node)
    {
        defaultCase(node);
    }

    public void caseTBoolean(TBoolean node)
    {
        defaultCase(node);
    }

    public void caseTTid(TTid node)
    {
        defaultCase(node);
    }

    public void caseTTrue(TTrue node)
    {
        defaultCase(node);
    }

    public void caseTFalse(TFalse node)
    {
        defaultCase(node);
    }

    public void caseTProcess(TProcess node)
    {
        defaultCase(node);
    }

    public void caseTEnd(TEnd node)
    {
        defaultCase(node);
    }

    public void caseTRange(TRange node)
    {
        defaultCase(node);
    }

    public void caseTLock(TLock node)
    {
        defaultCase(node);
    }

    public void caseTReentrant(TReentrant node)
    {
        defaultCase(node);
    }

    public void caseTArray(TArray node)
    {
        defaultCase(node);
    }

    public void caseTOf(TOf node)
    {
        defaultCase(node);
    }

    public void caseTLength(TLength node)
    {
        defaultCase(node);
    }

    public void caseTExtendz(TExtendz node)
    {
        defaultCase(node);
    }

    public void caseTInstanceof(TInstanceof node)
    {
        defaultCase(node);
    }

    public void caseTRecord(TRecord node)
    {
        defaultCase(node);
    }

    public void caseTCollection(TCollection node)
    {
        defaultCase(node);
    }

    public void caseTRef(TRef node)
    {
        defaultCase(node);
    }

    public void caseTNew(TNew node)
    {
        defaultCase(node);
    }

    public void caseTNull(TNull node)
    {
        defaultCase(node);
    }

    public void caseTEnum(TEnum node)
    {
        defaultCase(node);
    }

    public void caseTMain(TMain node)
    {
        defaultCase(node);
    }

    public void caseTThread(TThread node)
    {
        defaultCase(node);
    }

    public void caseTLoc(TLoc node)
    {
        defaultCase(node);
    }

    public void caseTLive(TLive node)
    {
        defaultCase(node);
    }

    public void caseTWhen(TWhen node)
    {
        defaultCase(node);
    }

    public void caseTDo(TDo node)
    {
        defaultCase(node);
    }

    public void caseTInvisible(TInvisible node)
    {
        defaultCase(node);
    }

    public void caseTGoto(TGoto node)
    {
        defaultCase(node);
    }

    public void caseTUnlock(TUnlock node)
    {
        defaultCase(node);
    }

    public void caseTWait(TWait node)
    {
        defaultCase(node);
    }

    public void caseTUnwait(TUnwait node)
    {
        defaultCase(node);
    }

    public void caseTNotify(TNotify node)
    {
        defaultCase(node);
    }

    public void caseTNotifyall(TNotifyall node)
    {
        defaultCase(node);
    }

    public void caseTLockavailable(TLockavailable node)
    {
        defaultCase(node);
    }

    public void caseTStart(TStart node)
    {
        defaultCase(node);
    }

    public void caseTJoin(TJoin node)
    {
        defaultCase(node);
    }

    public void caseTExit(TExit node)
    {
        defaultCase(node);
    }

    public void caseTThreadterminated(TThreadterminated node)
    {
        defaultCase(node);
    }

    public void caseTInternchoose(TInternchoose node)
    {
        defaultCase(node);
    }

    public void caseTExternchoose(TExternchoose node)
    {
        defaultCase(node);
    }

    public void caseTForall(TForall node)
    {
        defaultCase(node);
    }

    public void caseTHaslock(THaslock node)
    {
        defaultCase(node);
    }

    public void caseTWasnotified(TWasnotified node)
    {
        defaultCase(node);
    }

    public void caseTPrintln(TPrintln node)
    {
        defaultCase(node);
    }

    public void caseTPredicates(TPredicates node)
    {
        defaultCase(node);
    }

    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    public void caseTWhitespace(TWhitespace node)
    {
        defaultCase(node);
    }

    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(Node node)
    {
    }
}
