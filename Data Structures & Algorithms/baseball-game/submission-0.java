class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scoreboard = new Stack<>();
        int ans = 0;

        for(int i = 0; i < operations.length; i++){
                if(operations[i].equals("+")){
                    int firstScore = scoreboard.pop();
                    int secondScore = scoreboard.pop();
                    scoreboard.push(secondScore);
                    scoreboard.push(firstScore);
                    scoreboard.push(firstScore + secondScore);
                } else if(operations[i].equals("D")){
                    int firstScore = scoreboard.pop();
                    scoreboard.push(firstScore);
                    scoreboard.push(firstScore * 2);
                } else if(operations[i].equals("C")){
                    scoreboard.pop();
                } else {
                    scoreboard.push(Integer.parseInt(operations[i]));
                }
        }

        int counter = scoreboard.size();
        for(int i = 0; i < counter; i++){
            ans += scoreboard.pop();
        }

        return ans;
    }
}