package com.arash.ariani.string;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class CompactNumberFormatUtil {
    private final CompactNumberFormat compactNumberFormat = (CompactNumberFormat) NumberFormat.getCompactNumberInstance();
    public String format(int number) {
        return compactNumberFormat.format(number);
    }
    public String format(long number) {
        return compactNumberFormat.format(number);
    }

    public Number parse(String str) throws ParseException {
        CompactNumberFormat compactNumberFormat = (CompactNumberFormat) NumberFormat.getCompactNumberInstance();
        return compactNumberFormat.parse(str);
    }

}
