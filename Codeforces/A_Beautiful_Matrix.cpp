#include<bits/stdc++.h>
using namespace std;
int main() {
	
 ios_base::sync_with_stdio(false);
 cin.tie(NULL);
    
  int arr[5][5];
  int row = 5;
  int col = 5;

  for( int i = 0 ; i < row ; i++) {
   for( int j = 0 ;  j < col ; j++) {
      cin >> arr[i][j];
   }
  }

int rowpos = 0;
int colpos = 0;

for( int i = 0 ; i < row ; i++) {
   for( int j = 0 ;  j < col ; j++) {
      if( arr[i][j] == 1) {
         rowpos = i;
         colpos = j;
      }
   }
  }
 

 int ans = abs(rowpos - 2) + abs(colpos - 2);
 cout << ans <<endl;



}