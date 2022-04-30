package dsa.assignments.completed;

import java.util.Scanner;

public class ClosestBuddy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            int abs = 100;
            int ans = -1;
            for (int j = 1; j <= n; j++) {
                int newAbs = abs(i, j);
                if (newAbs < abs) {
                    if (GCD(arr[i], arr[j]) == 1) {
                        ans = j;
                        abs = newAbs;
                    }
                }
            }
            System.out.print(ans + " ");
        }
    }

    public static int GCD(int a, int b) {
        if (b == 0) return b;
        while (a % b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return b;
    }

    public static int abs(int x, int y) {
        int z = x - y;
        if (z > 0)
            return z;
        else
            return -z;
    }
}
//
//#include <bits/stdc++.h> // header file includes every Standard library
//        using namespace std;
//        #include <bits/stdc++.h>
//
//        using namespace std;
//        #define sd(x) scanf("%d", &x)
//        #define sz(v) (int) v.size()
//        #define pr(v) For(i, 0, sz(v)) {cout<<v[i]<<" ";} cout<<endl;
//        #define slld(x) scanf("%ld", &x)
//        #define all(x) x.begin(), x.end()
//        #define For(i, st, en) for(int i=st; i<en; i++)
//        #define tr(x) for(auto it=x.begin(); it!=x.end(); it++)
//        #define fast std::ios::sync_with_stdio(false);cin.tie(NULL);
//        #define pb push back
//        #define ll long long
//        #define ld long double.
//        #define double long double
//        #define mp make pair
//        #define F first
//        #define S second
//        typedef pair<int, int> pii;
//        typedef vector<int> vi;
//        #define pi 3.141592653589793238
//        const int MOD = 1e9+7;
//
//        const int N = 2e5+5;
//
//        #ifdef SOURAV
//        #define trace(...)f(#__VA_ARGS, VA_ARGS)
//        template <typename Argi>
//
//void __f(const char* name, Arg1&& arg1){
//        cout << name << <arg1 << endl;
//        }
//        template <typename Arg1, typename... Args>
//        void __f(const char* names, Arg1&& argi, Args&&... args) {
//        const char* comma = strchr(names + 1, ',');cout.write(names, comma - names) << " : " << argl<< " | "; __f(comma+1, args...);
//        }
//        int begtime clock();
//        #define end routine() cout << "\n\nTime elapsed: " << (clock() - begtime)*1000/CLOCKS_PER_SEC << "ms\n\n";
//        #else
//        #define endl '\n'
//        #define trace(...)
//        #define end routine()
//        #endif
//
//        int pre[N][55], suf[N][55];
//        int arr[N];
//
//        void solve(){
//        int n; cin>>n;
//        For(i, 1, n+1){
//        cin>>arr[i];
//        }
//        For(i, 1, n+1){
//        For(j, 1, 51){
//        if(arr[i]==j)
//        pre[i][j]=i;
//        else
//        pre[i][j]=pre[i-1][j];
//        }
//        }
//        for(int i=n; i>=1; i--){
//        For(j, 1, 51){
//        if(arr[i]==j){
//        suf[i][j]=i;
//        }
//        else{
//        suf[i][j]=suf[i+1][j];
//        }
//        }
//        }
//        vector<int> ans(n+1, -1);
//        For(i, 1, n+1){
//        int dist = 3e5;
//        For(j, 1, 51){
//        if(__gcd(arr[i], j)==1){
//        if(pre[i][j] && abs(i-pre[i][j])<=dist){
//        ans[i]=pre[i][j];
//        dist=abs(i-pre[i][j]);
//        }
//        if(suf[i][j] && abs(i-suf[i][j])<dist){
//        ans[i]=suf[i][j];
//        dist=abs(i-suf[i][j]);
//        }
//        }
//        }
//        }
//        set<int> s;
//        For(i, 1, n+1){
//        s.insert(ans[i]);
//        cout<<ans[i]<<" ";
//        }
//        }
//
//
//        signed main()
//        {
//        fast
//        #ifdef SOURAV
//        freopen("input.txt","r",stdin);
//        freopen("output.txt","w",stdout);
//        #endif
//        int t=1;
//        while(t--){
//        solve();
//        cout<<"\n";
//        }
//        return 0;
//        }