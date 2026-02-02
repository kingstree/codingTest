package com.example.codingtest.programers;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        boolean procces = true;
        //한개씩 읽음
        for(char c : s.toCharArray()){
            if(cnt == 0 && c == ')'){
                return false;
            }else if(c == ')'){
                cnt--;
            }else if(c == '('){
                cnt++;
            }

        }

        // ")로 시작하면 불가"

        // '(' 나올때 마다 카운트 증가

        // 빼기 시작한다면 다 빼야 함 안되면 false

        return cnt == 0;
    }
}
