class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            List<String> ans = new ArrayList<>();
            // ans.add("");
            return ans;
        }
        
        if(digits.length()==1) {
            String[] ans = charArray(digits.charAt(0));
            List<String> smallList = new ArrayList<>();
            for(int i=0; i<ans.length; i++) {
                smallList.add(ans[i]);
            }
            return smallList;
        }
        
        String[] smallArray = charArray(digits.charAt(0));
        List<String> smallAns = letterCombinations(digits.substring(1));
        
        List<String> ans = new ArrayList<>();
        
        for(int i=0; i<smallAns.size(); i++) {
            for(int j=0; j<smallArray.length; j++) {
                String temp = smallArray[j] + smallAns.get(i);
                ans.add(temp);
            }
        }
        return ans;
    }
    
    public String[] charArray(char c) {
        if(c == '2') {
            String[] temp = {"a","b","c"};
            return temp;
        } else if(c == '3') {
            String[] temp = {"d","e","f"};
            return temp;
        } else if(c == '4') {
            String[] temp = {"g","h","i"};
            return temp;
        } else if(c == '5') {
            String[] temp = {"j","k","l"};
            return temp;
        } else if(c == '6') {
            String[] temp = {"m","n","o"};
            return temp;
        } else if(c == '7') {
            String[] temp = {"p","q","r","s"};
            return temp;
        } else if(c == '8') {
            String[] temp = {"t","u","v"};
            return temp;
        } else {
            String[] temp = {"w","x","y","z"};
            return temp;
        }
    }
}