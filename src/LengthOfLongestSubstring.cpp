#include <string>
#include<iostream>
using namespace std;
class Solution {
public:
	int maxlength(string s) {
		int n = s.length();
		int *exist = new int[256];
		int max = 0;
		int j = 0;
		for (int i = 0; i < n; i++) {
			for (int m = 0; m < 256; m++) {
				exist[m] = 0;
			}
			exist[s[i]] = 1;
			for (j = i + 1; j < n; j++) {
				if (exist[s[j]] == 0){
					exist[s[j]] = 1;
				}
				else {
					break;
				}
			}
			if ( j - i > max) {
				max = j - i;
			}
		}
		delete[]exist;
		return max;
	}
	
};
int main() {
	Solution sol;
	cout << sol.maxlength("assafcea") << endl;
	system("pause");

}