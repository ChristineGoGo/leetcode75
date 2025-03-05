import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class keysAndRooms_841 {
    Set<Integer> visited = new HashSet<>();
    List<Integer> keys = new ArrayList<>();
    
    public void dfs(List<List<Integer>> rooms,int currentRoom, List<Integer> currentKeys) {
        if (!visited.contains(currentRoom)) {
            visited.add(currentRoom);

            for (int i = 0; i < rooms.get(currentRoom).size(); i++) {
                int currentKeyVal = rooms.get(currentRoom).get(i);
                currentKeys.add(currentKeyVal);
            }

            for (int i = 0; i < currentKeys.size(); i++) {
                dfs(rooms, currentKeys.get(i), currentKeys);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        dfs(rooms, 0, keys);
        return visited.size() == rooms.size();
    }
}
