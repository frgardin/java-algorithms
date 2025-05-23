class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char, int> m{
            {'I',1},
            {'V',5},
            {'X',10},
            {'L',50},
            {'C',100},
            {'D',500},
            {'M',1000}
        };
        int r = 0;
        for (int i = 0; i < s.size() - 1; i++) {
            if (m[s.at(i)] >= m[s.at(i + 1)]) {
                r += m[s.at(i)]; 
            } else {
                r -= m[s.at(i)];
            }
        }
        return r + m[s.at(s.size() - 1)];
    }
};