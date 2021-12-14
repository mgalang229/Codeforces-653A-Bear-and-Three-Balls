#include <bits/stdc++.h>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	int n;
	cin >> n;
	vector<int> t(n);
	for (int i = 0; i < n; i++) {
		cin >> t[i];
	}
	// remove the duplicates and sort the sequence in non-decreasing order
	sort(t.begin(), t.end());
	t.resize(unique(t.begin(), t.end()) - t.begin());
	// check for three numbers which the difference between two elements is less than or equal to 2
	bool checker = false;
	for (int i = 0; i + 2 < (int) t.size(); i++) {
		checker |= (t[i + 1] - t[i] <= 2 && t[i + 2] - t[i + 1] <= 2 && t[i + 2] - t[i] <= 2);
	}
	cout << (checker ? "YES" : "NO") << '\n';
	return 0;
}
