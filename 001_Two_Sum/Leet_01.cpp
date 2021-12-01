    vector<int> twoSum(vector<int> &nums, int target) {
        unoreded_map<int> m;
        vector<int> result;
        for(int i = 0; i < numbers.size(); i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(numbers[i] + numbers[j] == target)
                {
                    result.push_back(i);
                    result.push_back(j);
                }
            }
        }
        return result;
    }
