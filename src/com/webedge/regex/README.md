
<table>
<tbody><tr>
<th>Subexpression</th>
<th style="text-align:center;">Matches</th>
</tr>
<tr>
<td style="text-align:center;">^</td>
<td>Matches the beginning of the line.</td>
</tr>
<tr>
<td style="text-align:center;">$</td>
<td>Matches the end of the line.</td>
</tr>
<tr>
<td class="ts">.</td>
<td>Matches any single character except newline. Using <b>m</b> option allows it to match the newline as well.</td>
</tr>
<tr>
<td style="text-align:center;">[...]</td>
<td>Matches any single character in brackets.</td>
</tr>
<tr>
<td style="text-align:center;">[^...]</td>
<td>Matches any single character not in brackets.</td>
</tr>
<tr>
<td style="text-align:center;">\A</td>
<td>Beginning of the entire string.</td>
</tr>
<tr>
<td style="text-align:center;">\z</td>
<td>End of the entire string.</td>
</tr>
<tr>
<td class="ts">\Z</td>
<td>End of the entire string except allowable final line terminator.</td>
</tr>
<tr>
<td class="ts">re*</td>
<td>Matches 0 or more occurrences of the preceding expression.</td>
</tr>
<tr>
<td style="text-align:center;">re+</td>
<td>Matches 1 or more of the previous thing.</td>
</tr>
<tr>
<td style="text-align:center;">re?</td>
<td>Matches 0 or 1 occurrence of the preceding expression.</td>
</tr>
<tr>
<td class="ts">re{ n}</td>
<td>Matches exactly n number of occurrences of the preceding expression.</td>
</tr>
<tr>
<td class="ts">re{ n,}</td>
<td>Matches n or more occurrences of the preceding expression.</td>
</tr>
<tr>
<td class="ts">re{ n, m}</td>
<td>Matches at least n and at most m occurrences of the preceding expression.</td>
</tr>
<tr>
<td style="text-align:center;">a| b</td>
<td>Matches either a or b.</td>
</tr>
<tr>
<td class="ts">(re)</td>
<td>Groups regular expressions and remembers the matched text.</td>
</tr>
<tr>
<td class="ts">(?: re)</td>
<td>Groups regular expressions without remembering the matched text.</td>
</tr>
<tr>
<td style="text-align:center;">(?&gt; re)</td>
<td>Matches the independent pattern without backtracking.</td>
</tr>
<tr>
<td style="text-align:center;">\w</td>
<td>Matches the word characters.</td>
</tr>
<tr>
<td style="text-align:center;">\W</td>
<td>Matches the nonword characters.</td>
</tr>
<tr>
<td style="text-align:center;">\s</td>
<td>Matches the whitespace. Equivalent to [\t\n\r\f].</td>
</tr>
<tr>
<td style="text-align:center;">\S</td>
<td>Matches the nonwhitespace.</td>
</tr>
<tr>
<td style="text-align:center;">\d</td>
<td>Matches the digits. Equivalent to [0-9].</td>
</tr>
<tr>
<td style="text-align:center;">\D</td>
<td>Matches the nondigits.</td>
</tr>
<tr>
<td style="text-align:center;">\A</td>
<td>Matches the beginning of the string.</td>
</tr>
<tr>
<td class="ts">\Z</td>
<td>Matches the end of the string. If a newline exists, it matches just before newline.</td>
</tr>
<tr>
<td style="text-align:center;">\z</td>
<td>Matches the end of the string.</td>
</tr>
<tr>
<td style="text-align:center;">\G</td>
<td>Matches the point where the last match finished.</td>
</tr>
<tr>
<td style="text-align:center;">\n</td>
<td>Back-reference to capture group number "n".</td>
</tr>
<tr>
<td class="ts">\b</td>
<td>Matches the word boundaries when outside the brackets. Matches the backspace (0x08) when inside the brackets.</td>
</tr>
<tr>
<td style="text-align:center;">\B</td>
<td>Matches the nonword boundaries.</td>
</tr>
<tr>
<td style="text-align:center;">\n, \t, etc.</td>
<td>Matches newlines, carriage returns, tabs, etc.</td>
</tr>
<tr>
<td style="text-align:center;">\Q</td>
<td>Escape (quote) all characters up to \E.</td>
</tr>
<tr>
<td style="text-align:center;">\E</td>
<td>Ends quoting begun with \Q.</td>
</tr>
</tbody></table>