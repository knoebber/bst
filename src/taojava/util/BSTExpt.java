package taojava.util;

import java.io.PrintWriter;

import java.util.Comparator;
import java.util.Iterator;

/**
 * Some simple experiments with binary search trees.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class BSTExpt
{
  // +--------+----------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * Output for our program.
   */
  static PrintWriter pen;

  /**
   * The current dictionary.
   */
  static BST<String, String> dict;

  // +------+------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args)
    throws Exception
  {
    pen = new PrintWriter(System.out, true);

    String[] values =
        new String[] { "monkey", "gibbon", "snake", "dingo", "koala", "python",
                      "viper", "baboon", "frog", "hippo", "lemur", "orangutan",
                      "rabbit", "tiger", "wombat", "aardvark", "chinchilla",
                      "emu", "gnu" };
    BST<Character, String> dict =
        new BST<Character, String>((left, right) -> left.compareTo(right));
    for (String value : values)
      {
        dict.set(value.charAt(0), value);
      } // for
    dict.print(pen);
    // expt("a", "ant");
    // expt("z", "chinchilla");
  } // main(String[])

  // +-----------+-------------------------------------------------------
  // | Utilities |
  // +-----------+

  /**
   * Add a key/value pair to the BST then print it out.
   */
  public static void expt(String key, String value)
  {
    pen.println("dict[" + key + "] = " + value);
    dict.set(key, value);
    // iterateKeys();
    // iterateValues();
    dict.dump(pen);
    pen.println();
  } // expt(BST, PrintWriter, String, String)

  /**
   * Iterate the keys of the dictionary.
   */
  public static void iterateKeys()
  {
    pen.print("Keys:   ");
    for (String key : dict.keys())
      {
        pen.print(key + " ");
      } // for each key
    pen.println();
  } // iterateKeys()

  /**
   * Iterate the values of the dictionary.
   */
  public static void iterateValues()
  {
    pen.print("Values: ");
    for (String value : dict)
      {
        pen.print(value + " ");
      } // for each value
    pen.println();
  } // iterateValues
} // BSTExpt
