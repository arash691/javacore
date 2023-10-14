package com.arash.ariani.string;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompactNumberFormatUtilTest {
    private final CompactNumberFormatUtil compactNumberFormat = new CompactNumberFormatUtil();
    @Test
    public void testCompactNumberFormat() throws ParseException {

        // Test formatting of large numbers
        assertEquals("1K", compactNumberFormat.format(1000));
        assertEquals("1M", compactNumberFormat.format(1000000));
        assertEquals("1B", compactNumberFormat.format(1000000000));
        assertEquals("1T", compactNumberFormat.format(1000000000000L));

        // Test formatting of small numbers
        assertEquals("999", compactNumberFormat.format(999));
        assertEquals("1K", compactNumberFormat.format(1000));
        assertEquals("2K", compactNumberFormat.format(2000));

        // Test parsing
        assertEquals(1000L, compactNumberFormat.parse("1K"));
        assertEquals(2000L, compactNumberFormat.parse("2K"));
    }

    @Test
    public void testCompactNumberFormatWithLocale() throws ParseException {

        // Test formatting of large numbers
        assertEquals("1K", compactNumberFormat.format(1000));
        assertEquals("1M", compactNumberFormat.format(1000000));
        assertEquals("1B", compactNumberFormat.format(1000000000));
        assertEquals("1T", compactNumberFormat.format(1000000000000L));

        // Test formatting of small numbers
        assertEquals("999", compactNumberFormat.format(999));
        assertEquals("1K", compactNumberFormat.format(1000));
        assertEquals("2K", compactNumberFormat.format(2000));
        // Test parsing
        assertEquals(1000L, compactNumberFormat.parse("1K"));

        assertEquals(2000L, compactNumberFormat.parse("2K"));
    }
}
