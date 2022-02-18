import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

/**
 * The {@code PercolationStats} class provides methods
 * for creating percolation system with two WeightedQuickUnion Data Structures
 * which track opened blocks, add them to components,
 * check whether block is full or system percolates.
 *
 * @author Anri Lombard
 */
public class Percolation {
    private boolean [] sites;
    private WeightedQuickUnionUF uf;
    private int n;
    private int openSites;

    /**
     * Creates n-by-n grid, with all sites initially blocked.
     * Performance: time proportional to  4n =  2n + 2n.
     *
     * @param n width of the grid
     */
    public Percolation(int n) {
        if (n <= 0) throw new IllegalArgumentException();

        uf = new WeightedQuickUnionUF(n*n+2);
        sites = new boolean[n*n+2];

        this.n = n;
        openSites = 0;
    }

    /**
     * Opens the site (row, col) if it is not open already.
     * Performance: constant time plus a constant number of calls to the uf method union()
     * We have 2 * 4 = 8 calls to the union() method in the worst case.
     * Notice that row and col are counted from 1 to n.
     *
     * @param row row number of the element
     * @param col column number of the element
     */
    public void open(int row, int col)

    /**
     * Returns a boolean value which is true when the site (row, col) is open
     * and returns false otherwise.
     * Performance: constant time.
     *
     * @param row row number of the element
     * @param col column number of the element
     * @return {@code true} if the site is full, {@code false} otherwise
     */
    public boolean isOpen(int row, int col)

    /**
     * Returns a boolean value which is true when the site (row, col) is full
     * (flooded with water / painted blue) and returns false otherwise.
     * Performance: 1 call to the uf method connected() in the worst case.
     *
     * @param row row number of the element
     * @param col column number of the element
     * @return {@code true} if the site is full, {@code false} otherwise
     */
    public boolean isFull(int row, int col)

    /**
     * Returns the number of open sites.
     * Performance: constant time.
     *
     * @return an integer value of the number of open sites.
     */
    public int numberOfOpenSites()

    /**
     * Returns a boolean value which is true when the system percolates
     * and false otherwise.
     * Performance: only 1 call to the uf method connected().
     *
     * @return {@code true} if the system percolates, {@code false} otherwise
     */
    public boolean percolates()

    /**
     * Test client for Percolation.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        
        
    }
}
