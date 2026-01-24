package com.example.codingtest.programers;

class Solution {
    public String solution(String s) {
        String answer = "";

        //문자열을 배열로 바꿈
        String[] Values = s.split(" ");
        int maxValue = Integer.parseInt(Values[0]);
        int minValue = Integer.parseInt(Values[0]);
        //배열값들을 순회하며 최대 최소 값을 저장
        for(int i = 0; i < Values.length; i++){
            maxValue = Math.max(Integer.parseInt(Values[i]), maxValue);
            minValue = Math.min(Integer.parseInt(Values[i]), minValue);
        }
        answer = minValue + " " + maxValue;

        return answer;
    }
}
