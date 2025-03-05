class Solution {
    public double average(int[] salary) {

        // Initialize maxSalary and minSalary with the first salary value
        int maxSalary = salary[0];
        int minSalary = salary[0];
        int sum = 0; // Variable to store the total sum of salaries

        // Loop through each salary in the array
        for(int amount : salary){

            // Update maxSalary if the current amount is greater
            maxSalary = Math.max(maxSalary , amount);
            // Update minSalary if the current amount is smaller
            minSalary = Math.min(minSalary , amount);

            // Add the current salary to the sum
            sum += amount;
        }

        // Compute the average excluding the highest and lowest salary
        return (sum - maxSalary - minSalary) / (double)(salary.length - 2);
    }
}
