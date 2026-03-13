import java.util.Scanner;

class TowerOfHanoi {

    // Recursive function to solve Tower of Hanoi
    static void solveHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        // Base Case: If only 1 disk, move it directly
        if (n == 1) {
            System.out.println("Move disk 1 from " + from_rod + " to " + to_rod);
            return;
        }

        // Step 1: Move n-1 disks from Source to Auxiliary
        solveHanoi(n - 1, from_rod, aux_rod, to_rod);

        // Step 2: Move the nth disk from Source to Destination
        System.out.println("Move disk " + n + " from " + from_rod + " to " + to_rod);

        // Step 3: Move the n-1 disks from Auxiliary to Destination
        solveHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();

        // Names of the rods: A, B, and C
        solveHanoi(n, 'A', 'C', 'B');
        
        // Total moves calculation: 2^n - 1
        int totalMoves = (int) Math.pow(2, n) - 1;
        System.out.println("\nTotal moves required: " + totalMoves);
        
        sc.close();
    }
}