/**
 * 
 */
public class Main {
  /**
  * Question 1. Write a method that, given a pair of pages, 
  * returns the minimum number of links you must follow to get from the first page to the second. 
  * See (https://en.wikipedia.org/wiki/Shortest_path_problem) for more information.
  */
  /**
  * A really good description of the function
  * 
  * @param pageStart    The page to start searching from
  * @param pageEnd      The page to search for
  * 
  * @return the minimum number of links
  */
  public int getMinimumLinks(String pageStart, String pageEnd) {
    
  }
  
  /**
  * Question 2. Write a method that finds a Hamiltonian path in a Wikipedia page graph. 
  * A Hamiltonian path is any path in some graph that visits every vertex exactly once. 
  * This method will never be called for graphs with more than 20 pages. 
  * See (https://en.wikipedia.org/wiki/Hamiltonian_path) for more information about Hamiltonian paths.
  */
  /**
  * A really good description of the function
  * 
  * @param g    The graph representing the wikipedia pages
  * 
  * @return an array listing the distance to each vertex in the single source shortest path problem, 
  *         or -1 if the vertex is not reachable from the source.
  */
  public int[] getHamiltonianPath(Graph g) {
    int numVertices = g.getNumberOfVertices();
    int[] distances = new int[numVertices];
    
    //Initialise distances to -1
    for (int i = 0; i < numVertices; i++) {
      distances[i] = -1;
    }
    
    //A naive option is to run N depth first searches and check if the depth is equal to N,
    //however this has time complexity of O(N^2)
    
    // look into https://teaching.csse.uwa.edu.au/units/CITS2200/Resources/CITS2200Doc/CITS2200/Path.html
    return distances;
  }
  
  /**
  * Question 3. Write a method that finds every ‘strongly connected component’ of pages. 
  * A strongly connected component is a set of vertices such that there is a path 
  * between every ordered pair of vertices in the strongly connected component. 
  * See (https://en.wikipedia.org/wiki/Strongly_connected_component) for more information about strongly connected components.
  */
  /**
  * A really good description of the function
  * 
  * @param g    The graph representing the wikipedia pages
  * 
  * @return i am unsure what it returns
  */
  public unknown_type getStrongConnections(Graph g) {
    
  }
  
  /**
  * Question 4. Write a method that finds all the centers of the Wikipedia page graph. 
  * A vertex is considered to be the center of a graph if the maximum shortest 
  * path from that vertex to any other vertex is the minimum possible. 
  * See (https://en.wikipedia.org/wiki/Graph_center) for more information about ‘graph center’.
  */
  /**
  * A really good description of the function
  * 
  * @param g    The graph representing the wikipedia pages
  * 
  * @return i am unsure what it returns
  */
  public unknown_type getCentres(Graph g) {
    
  }
}
