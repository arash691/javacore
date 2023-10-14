package com.arash.ariani.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringMaskerTest {

    private final StringMasker stringMasker = new StringMasker();

    @Test
    public void testMaskSensitiveInfo_ValidInputWithVisibleChars() {
        String result = stringMasker.maskSensitiveInfo("6210-9088-1234-6789", 4);
        assertEquals("***************6789", result);
    }

    @Test
    public void testMaskSensitiveInfo_ValidInputWithZeroVisibleChars() {
        String result = stringMasker.maskSensitiveInfo("password", 0);
        assertEquals("********", result);
    }

    @Test
    public void testMaskSensitiveInfo_InvalidInput_Null() {
        assertThrows(IllegalArgumentException.class, () -> stringMasker.maskSensitiveInfo(null, 4));
    }

    @Test
    public void testMaskSensitiveInfo_InvalidInput_VisibleCharsGreaterThanLength() {
        assertThrows(IllegalArgumentException.class, () -> stringMasker.maskSensitiveInfo("password", 10));
    }
}
