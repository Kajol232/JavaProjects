package com.company;

public class Main {

    public static void main(String[] args) {
        String inputString = "foo(bar)";
        String result = reverseInParentheses(inputString);
        System.out.println("result: " + result);

    }
        static String reverseInParentheses(String inputString) {
           if(inputString.contains(")")) {

                char[] ns = inputString.toCharArray();
                int dep = 0, start = -1, i = 0;
                int n = inputString.length();
                String result;
                while(i < n) {
                    for (int k = 0; i < ns.length; i++) {
                        if (ns[k] == '(') {
                            if (dep == 0) {
                                start = k;
                            }
                            dep += 1;
                        }
                        if (ns[k] == ')') {
                            dep -= 1;
                            if (dep == 0) {
                                result = reverseInParentheses(inputString.substring(start + 1, k));
                                result = reverseString(result);
                                System.out.println(result);
                                String resltt = inputString.substring(0, start-1) + result +
                                        inputString.substring(k + 2);
                                System.out.println(resltt);
                                n = inputString.length();
                                i -= 1;
                            }
                        }
                        i += 1;

                    }
                }


            }
            return inputString;
        }

        static String reverseString(String input){
            String rev = "";
            for ( int j = input.length() -1 ; j >= 0; j--){
                rev += String.valueOf(input.charAt(j));
                System.out.println("rev:" + rev);


            }
            return rev;
        }

    }
