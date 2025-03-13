class Solution {
    public int numRescueBoats(int[] people, int limit) {

        // Sort the array to efficiently pair the the lighttest and heaviest person
        Arrays.sort(people);

        int light = 0; // Pointer to the lighest person 
        int heavy = people.length-1; // Pointer to the heaviest person
        int boat = 0; // Counter for the number of boats used

        while(light <= heavy){ // Continue until all people are accounted for 
            
            // If the lightest and heaviest person can share a boat, move both pointers
            if(people[light] + people[heavy] <= limit){
                light++; // Move to the next lightest person
            }
            heavy--; // Always move the heavy pointer to account for one person per boat 
            boat++; // Increment the boat count 
        }

        return boat; // Return the total number of boats needed

    }
}