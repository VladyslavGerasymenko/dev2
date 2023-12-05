package goit.vladyslav;

import java.math.BigDecimal;

/** Пример задания взят с CodeWars.com
 *     Ваша задача — написать функцию, которая увеличивает строку, чтобы создать новую строку. *
 *     Если строка уже заканчивается числом, число должно быть увеличено на 1.
 *     Если строка не заканчивается цифрой. число 1 должно быть добавлено к новой строке.
 *     __________________________________________________________________________________
 *     Внимание: Если в числе есть ведущие нули, следует учитывать количество цифр.
 */

public class Kata {

    public String incrementString(String str) {
        if (str.trim().isEmpty()) return "1";
        if (!Character.isDigit(str.charAt(str.length() - 1))) return str + "1";
        StringBuilder text = new StringBuilder();
        StringBuilder number = new StringBuilder();
        int size = str.length() - 1;
        number.append(str.charAt(size));
        while (size > 0) {
            if (str.charAt(size - 1) == '9') {
                number.append(str.charAt(size - 1));
                size--;
            } else if (Character.isDigit(str.charAt(size - 1))) {
                number.append(str.charAt(size - 1));
                size--;
                break;
            } else {
                break;
            }
        }
        text.append(str, 0, size);
        number.reverse();
        BigDecimal n = new BigDecimal(number.toString());
        n = n.add(BigDecimal.ONE);
        int nLen = number.toString().length();
        String format = "%0" + nLen + "d";
        return text + String.format(format, n.intValue());
    }
}