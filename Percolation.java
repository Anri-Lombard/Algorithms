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

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n <= 0) throw new IllegalArgumentException();

        uf = new WeightedQuickUnionUF(n*n+2);
        sites = new boolean[n*n+2];

        this.n = n;
        openSites = 0;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col)

    // is the site (row, col) open?
    public boolean isOpen(int row, int col)

    // is the site (row, col) full?
    public boolean isFull(int row, int col)

    // returns the number of open sites
    public int numberOfOpenSites()

    // does the system percolate?
    public boolean percolates()

    // test client (optional)
    public static void main(String[] args) {
        
        
    }
}
