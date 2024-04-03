import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int result = 0;
    for(int i = 0; i < myList.size; i++)
    if((myList[i]).length() == len){
      result++;
    }
    return result;
  }

  public void removeWordsOfLength(int len)
  {
    for(int i = 0; i < myList.size; i++)
      if((myList[i].length() == len){
         myList.remove(myList[i]);
      }
  }
  }
}
