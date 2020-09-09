public class fizzBuzzArray2 {
  public String[] fizzBuzz(int start, int end) {
    String[] result = new String[end - start];
    int pos = 0;

    for (int i = start; i < end; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        result[pos] = "FizzBuzz";
      } else if (i % 3 == 0) {
        result[pos] = "Fizz";
      } else if (i % 5 == 0) {
        result[pos] = "Buzz";
      } else {
        result[pos] = String.valueOf(i);
      }
      pos++;
    }
    return result;
  }
}
