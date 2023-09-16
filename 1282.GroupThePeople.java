class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
       // sampleList
       // resutlList
       // 1. run for loop, check if absent or not and also check
       HashMap<Integer, List<Integer>> tempGroup = new HashMap<>();
       List<List<Integer>> result = new ArrayList<>();

       for(int i=0; i<groupSizes.length; i++) {
           int size = groupSizes[i];
           tempGroup.putIfAbsent(size, new ArrayList<>());
           // adding 0.1.2 position in list
           // size is the digit from groupSizes
           tempGroup.get(size).add(i);

            // if size is already there
           if(tempGroup.get(size).size() == size) {
               // if 3 is already there, creating new list and adding it.
               result.add(new ArrayList<>(tempGroup.get(size)));
               tempGroup.get(size).clear();
           }
       }
       return result;  
    }
}