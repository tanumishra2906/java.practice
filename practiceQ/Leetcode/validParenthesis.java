import java.util.* ;
public class validParenthesis {
    public static boolean validParenthesis(String s) {
        Stack<Character> stack= new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='(' || ch=='[' || ch=='{'){ //push these in stack
                stack.push(ch);
            }

            else{
                if(stack.isEmpty()){ 
                    return false;
                }

                char top = stack.pop(); //now whatever other character we get mainly closing brac...usse close na krwake we will just fetch in order to compare

                if(ch==')' && top!='('){ //i.e ) mil gya but we dont have iska open brac so false
                    return false;
                }

                if(ch=='}' && top!='{'){
                    return false;
                }

                if(ch==']' && top!='['){
                    return false;
                }

            }
        }
        return stack.isEmpty();  //Hume ye bhi check karna hai ki koi opening bracket bina close hue toh nahi bach gaya.
    
    }

    public static void main(String[] args){
        String s="([{}])";

        System.out.println(validParenthesis(s));
    }
}
