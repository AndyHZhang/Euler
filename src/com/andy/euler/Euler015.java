package com.andy.euler;


public class Euler015 {
	public static void run() {
		System.out.println("Euler015 begin");
		
		final long GRID_COUNT = 20;
		
		long[] pathInLastLayer = new long[1];
		pathInLastLayer[0] = 1;
		
		int layer;
		for (layer = 1; layer < GRID_COUNT+1; layer++) {
			long[] pathInCurrentLayer = new long[layer + 1];
			
			pathInCurrentLayer[0] = pathInCurrentLayer[layer] = 1;
			for (int i = 1; i < layer; i++) {
				pathInCurrentLayer[i] = pathInLastLayer[i-1] + pathInLastLayer[i];
			}
			
			for(int i = 0; i < pathInCurrentLayer.length; i++) {
				System.out.print(pathInCurrentLayer[i] + " ");
			}
			System.out.println("");
			
			pathInLastLayer = pathInCurrentLayer;
		}
		
		for (layer--; layer > 0; layer--) {
			long[] pathInCurrentLayer = new long[layer];
			for (int i = 0; i < layer; i++) {
				pathInCurrentLayer[i] = pathInLastLayer[i] + pathInLastLayer[i+1];
			}
			
			for(int i = 0; i < pathInCurrentLayer.length; i++) {
				System.out.print(pathInCurrentLayer[i] + " ");
			}
			System.out.println("");
			
			pathInLastLayer = pathInCurrentLayer;
		}
		
		System.out.println(pathInLastLayer[0]);
		
		System.out.println("Euler015 end");
	}
}
