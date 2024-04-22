int minRow(int n, int m, vector<vector<int>> a)
{
    int sum = INT_MAX;
    int ans = 0;
    for (int i = 0; i < n; i++)
    {
        int count = 0;
        for (int j = 0; j < m; j++)
        {
            if (a[i][j] == 1)
            {
                count++;
            }
        }
        if (sum > count)
        {
            sum = count;
            ans = i + 1;
        }
    }
    return ans;
}
