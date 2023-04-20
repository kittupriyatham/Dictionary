import java.util.Collections; 

import java.util.LinkedList; 

import java.util.Scanner; 

 

public class Dictionary 
{ 
    public static void main(String args[]) 

    { 

        Scanner sc  = new Scanner(System.in); 
        LinkedList<String> words = new LinkedList<String>( ); 
        while(true) 
        { 

            System.out.println("menu"); 
            System.out.println("1:adding words\n2:searching words\n3:displaying words\n4:deleting words"); 
            int ch  = sc.nextInt(); 
            switch(ch) 
            { 
                case 1: 
                    System.out.println("enter how many words you want to insert"); 
                    int n = sc.nextInt(); 
                    for(int i=0;i<n;i++) 
                    { 
                        words.add(sc.next()); 
                    }
                    Collections.sort(words);
                    break;
                case 3: 

                    System.out.println("the words in the dictionary are"); 

                    System.out.println(words); 

                    break; 
                case 4: 
                    System.out.println("enter which word you want to delete"); 
                    String t  = sc.next(); 
                    if(words.contains(t)==true) 
                        words.remove(t); 
                    else 
                    { 
                        System.out.println("please enter correct word to be deleted"); 
                    } 
                    break; 
                case 2: 
                    System.out.println("enter element to be found"); 
                    boolean b=words.contains(sc.next()); 
                    if(b==true) 
                    { 
                        System.out.println("the element is present in linked list"); 
                    }
                    else 
                        System.out.println("the element is not present in linked list"); 
                    break; 
            } 
        } 
    } 
}  