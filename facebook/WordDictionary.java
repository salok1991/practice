package facebook;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children;
    boolean wordFinished;
    // int maxLength;
    public TrieNode() {
        this.children = new HashMap<>();
        this.wordFinished = false;
        // this.maxLength = 0;
    }
}

public class  WordDictionary  {

    TrieNode trie;

    public  WordDictionary()  {
        this.trie =  new  TrieNode();
    }

    public  void addWord(String word)  {
        TrieNode node =  this.trie;

        for  (char ch : word.toCharArray())  {
            if(! node.children.containsKey(ch))  {
                node.children.put(ch,  new  TrieNode());
            }
            node = node.children.get(ch);
        }
        node.wordFinished =  true;
        // this.trie.maxLength = Math.max(this.trie.maxLength, word.length());
    }

    public  boolean search(String word)  {
        // if(word.length() == 0 || word.length() > this.trie.maxLength) {
        //     return false;
        // }
        TrieNode node =  this.trie;
        return searchInNode(word, node);
    }

    private  boolean searchInNode(String word,  TrieNode node)  {
        for  (int i =  0; i < word.length(); i++)  {
            char ch = word.charAt(i);
            if(! node.children.containsKey(ch))  {
                if(ch ==  '.')  {
                    for(char x : node.children.keySet())  {
                        TrieNode child = node.children.get(x);
                        if(searchInNode(word.substring(i+1), child))  {
                            return  true;
                        }
                    }
                }
                return  false;
            }  else  {
                node = node.children.get(ch);
            }
        }
        return node.wordFinished;
    }
}
