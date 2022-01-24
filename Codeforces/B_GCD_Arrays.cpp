#include<bits/stdc++.h>
using namespace std;
#define ll long long
#define yes cout << "YES\n"
#define no cout << "NO\n"
int main(){
	ll t = 1, i, j;
	cin >> t;
	while (t--) {
		ll l, r, k;
		cin >> l >> r >> k;
		ll odd = (l - 2) / 2 + 1;
		ll odd1 = (r - 1) / 2 + 1;
 
		ll ans = odd1 - odd;
		if (l == 1) ans  = odd1;
		if (l == 1 && r == 1) {
			no;
		}
		else if (l == r) yes;
		else if (k >= ans) yes;
		else no;
	}
	return 0;
}