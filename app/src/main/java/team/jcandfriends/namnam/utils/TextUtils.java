package team.jcandfriends.namnam.utils;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;

public final class TextUtils {

    public static CharSequence setSpanBetweenTokens (CharSequence text, String token, CharacterStyle...styles) {
        int tokenLength = token.length();
        int start = text.toString().indexOf(token) + tokenLength;
        int end = text.toString().indexOf(token, start);

        if (start > -1 && end > -1) {
            SpannableStringBuilder ssb = new SpannableStringBuilder(text);

            for (CharacterStyle style : styles) {
                if (style instanceof ClickableSpan) {
                    ssb.setSpan(style, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                } else if (style instanceof ForegroundColorSpan) {
                    ssb.setSpan(style, start, end, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
                } else {
                    ssb.setSpan(style, start, end, 0);
                }
            }

            ssb.delete(end, end + tokenLength);
            ssb.delete(start - tokenLength, start);

            text = ssb;
        }

        return text;
    }

}
