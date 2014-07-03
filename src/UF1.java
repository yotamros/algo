import java.util.Arrays;

public class UF1 {
	
	private int[] id;
	
	public UF1(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++)
			id[i] = i;
		System.out.println(Arrays.toString(id));
	}
	
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for (int i=0; i<id.length; i++)
			if (id[i] == pid) id[i] = qid;
		System.out.println(Arrays.toString(id));
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("how many number would you like to have?");
		int N = StdIn.readInt();
		UF1 uf1 = new UF1(N);
		System.out.println("which number would you like to unite?");
		while (!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if (!uf1.connected(p, q)) {
				uf1.union(p, q);
			}
			else {
				System.out.println("already connected!");
			}
		}
	}
}
