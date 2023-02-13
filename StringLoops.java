public class StringLoops {

  public static String reverseCharacters(String x) {
    String newString = "";
    for (int i = 0; i < x.length(); i++) {
      newString += x.substring(x.length() - i - 1, x.length() - i);
    }
    return newString;
  }

  public static String indexesOfAll(String text, String searchTerm) {
    int arrayLength = 0;

    for (int i = 0; i < text.length(); i++) {
      if (text.substring(i, i + 1).equals(searchTerm)) {
        arrayLength++;
      }
    }

    int[] array = new int[arrayLength];
    int index = 0;
    for (int i = 0; i < text.length(); i++) {
      if (text.substring(i, i + 1).equals(searchTerm)) {
        array[index] = i;
        index++;
      }
    }

    String stringArray = "[";
    if (arrayLength == 0) {
      stringArray += "]";
    } else {
      for (int i = 0; i < array.length; i++) {
        stringArray += array[i] + ", ";
      }

      stringArray = stringArray.substring(0, stringArray.length() - 2) + "]";
    }

    return stringArray;
  }

  public static boolean hasRepeatedConsecutives(String input) {
    boolean output = false;
    for (int i = 0; i < input.length() - 1;i++) {
      if (input.substring(i, i+1).equals(input.substring(i+1,i+2))) {
        output = true;
      }
    }
    return output;
  }

  public static String reverseWords(String input) {
    String output = "";
    int wordCount = 0;
    for (int i = 0; i < input.length(); i++) {
      if (input.substring(i,i+1).equals(" ")) {
        wordCount++;
      }
    }


    String tempString = input;
    while (wordCount != 0) {
      output += tempString.substring(tempString.lastIndexOf(" ") + 1) + " ";
      tempString = tempString.substring(0, tempString.lastIndexOf(" "));

      wordCount--;
    }

    return output + input.substring(0, input.indexOf(" "));
  }
  public static void main(String[] args) {

    System.out.println(reverseCharacters("academy"));
    System.out.println(reverseCharacters("radar"));
    System.out.println(reverseCharacters("taco cat"));

    System.out.println("--------------------------------------------------------------------------------");

    System.out.println(indexesOfAll("attack", "a"));
    System.out.println(indexesOfAll("attack", "t"));
    System.out.println(indexesOfAll("attack", "c"));
    System.out.println(indexesOfAll("attack", "b"));

    System.out.println("--------------------------------------------------------------------------------");

    System.out.println(hasRepeatedConsecutives("bookkeeper"));
    System.out.println(hasRepeatedConsecutives("kick"));
    System.out.println(hasRepeatedConsecutives("alibi"));
    System.out.println(hasRepeatedConsecutives("rook"));

    System.out.println("--------------------------------------------------------------------------------");

    System.out.println(reverseWords("the quick brown fox"));
    System.out.println(reverseWords("taco cat"));
    System.out.println(reverseWords("hello world aliens are coming to kill your cows"));

    System.out.println("--------------------------------------------------------------------------------");
  }
}

// javac StringLoops.java; java StringLoops