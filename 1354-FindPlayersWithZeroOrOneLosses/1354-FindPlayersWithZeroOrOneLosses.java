// Last updated: 11/08/2026, 14:19:59
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> losses = new HashMap<>();
        for (int[] match : matches) {
            losses.putIfAbsent(match[0], 0);
            losses.put(match[1], losses.getOrDefault(match[1], 0) + 1);
        }

        List<Integer> zeroLosses = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (int player : losses.keySet()) {
            int count = losses.get(player);
            if (count == 0) zeroLosses.add(player);
            else if (count == 1) oneLoss.add(player);
        }

        Collections.sort(zeroLosses);
        Collections.sort(oneLoss);

        return Arrays.asList(zeroLosses, oneLoss);
    }
}