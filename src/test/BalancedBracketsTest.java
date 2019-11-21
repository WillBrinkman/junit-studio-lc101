package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test //1
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test //2
    public void onlyBracketsReturnTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }
    @Test //3
    public void stringWithBracketsReturnTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("Launch[code]"));
    }
    @Test //4
    public void stringWithCloseBracketFirstReturnFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("][]["));
    }
    @Test  //5
    public void string3WithBracketsReturnFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("asd[asd]sad]dsad"));
    }
    @Test  //6
    public void string4WithBracketsReturnFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("asd[[dsad[asd]asd[dsa]asd]"));
    }
    @Test  //7
    public void string5WithBracketsReturnFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("asda[[asdas[asd]dsada]asd[asd]asd"));
    }
    @Test  //8
    public void string6WithBracketsReturnTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("asd[asda]asdasf[asda]ads[asd[asd]a]a"));
    }
    @Test  //9
    public void string7WithBracketsReturnFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("ddsa[ad]d[aa]a"));
    }
    @Test  //10
    public void string8WithBracketsReturnTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("asdasd[asd[asd]sad]asd"));
    }
    @Test  //11
    public void string9WithBracketsReturnTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("asda[asdasd]adsa"));
    }
    @Test  //12
    public void string10WithBracketsReturnTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("asdf[fasd]dasd[asda]asd"));
    }

}
