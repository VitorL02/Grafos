import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static void addEdge(HashMap<String, ArrayList<String>> am, String s, String d) {
        am.computeIfAbsent(s, k -> new ArrayList<>()).add(d);
        am.computeIfAbsent(d, k -> new ArrayList<>()).add(s);
    }

    static void printGraph(HashMap<String, ArrayList<String>> am) {
        for (String vertex : am.keySet()) {
            System.out.println("\nVertice " + vertex + ":");
            for (String neighbor : am.get(vertex)) {
                System.out.print(" -> " + neighbor);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> am = new HashMap<>();
        // Add edges
        addEdge(am, "Leonardo DiCaprio", "Jennifer Lawrence");
        addEdge(am,  "Bradwley Cooper" ,"Jennifer Lawrence");
        addEdge(am, "Emma Stone", "Bradwley Cooper");
        addEdge(am, "Ryan Goslin", "Emma Stone");
        addEdge(am, "Margot Robin", "Ryan Goslin");
        addEdge(am, "Leonardo DiCaprio", "Margot Robin");
        printGraph(am);
        System.out.println("\nEsse grafo tem a intencao de representar as relacoes que atores tiveram ao participar do mesmo filme ");
    }
}

