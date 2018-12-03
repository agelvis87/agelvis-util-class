package com.agelvis.cls.utils;

/**
 * 
 * @author Agelvis Carreño
 *
 */
public class AglvStringUtil {

  public static final String POUND = "#";
  public static final String BLANK = "";

  /**
   * <p>
   * Da formato a cadena con formato recibido
   * </p>
   * 
   * <p>
   * NOTA: Si el tamaño de la cadena no coincide con la cantidad de '#' en el formato retorna 'null'
   * </p>
   * 
   * <pre>
   * formatterStringByFormat("12345678", "####-####") = "1234-5678"
   * formatterStringByFormat("123456789", "### ### ###") = "123 456 789"
   * formatterStringByFormat("1234567890123", "##-##-##-######-#") = "12-34-56-789012-3"
   * </pre>
   * 
   * @param characteres Cadena a formatear
   * @param format Formato a dar a la cadena
   * @return Retorna String formateado
   */
  public static String formatterStringByFormat(String characteres, String format) {

    if (characteres.length() != countMatches(format, POUND)) {
      return null;
    }

    int idx = 0;
    int chrs = 0;
    String concat = BLANK;
    String character = null;

    for (int i = 0; i < format.length(); i++) {
      character = format.substring(idx, i + 1);
      if (character.equals(POUND)) {
        chrs++;
        concat = concat + characteres.substring(chrs - 1, chrs);
      } else {
        concat = concat + character;
      }

      idx++;
    }
    return concat;
  }

  /**
   * <p>
   * Cuenta cantidad de caracteres en una cadena
   * </p>
   * 
   * <pre>
   * countMatches(null, *)       = 0
   * countMatches("", *)         = 0
   * countMatches("abba", null)  = 0
   * countMatches("abba", "")    = 0
   * countMatches("abba", "a")   = 2
   * countMatches("abba", "ab")  = 1
   * countMatches("abba", "xxx") = 0
   * </pre>
   * 
   * @param str Cadena a contar
   * @param sub Caracter a contar dentro de la cadena
   * @return cantidad de caracteres encontrados
   */
  public static int countMatches(String str, String sub) {

    int idx = 0;
    int count = 0;
    String character = null;

    if (null == str) {
      return count;
    }

    for (int i = 0; i < str.length(); i++) {
      character = str.substring(idx, i + 1);
      if (character.equals(sub)) {
        count++;
      }
      idx++;
    }

    return count;
  }

}
