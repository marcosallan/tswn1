package Q1;

import Q1.interfacetriangle.TriangleInterface;

public class Triangle implements TriangleInterface {
	
	private int x;
	private int y;
	private int z;
	
	public Triangle(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public boolean Triangle() {
		if((x < y + z) && (y < x + z) && (z < x+y)) {
			return true;
		}
		return false;
	}

	public boolean Scalene() {
		if((x!= y && x!= z && y!=z) && this.Triangle()) {
			return true;
		}
		return false;
	}

	public boolean Equilateral() {
		if((x == y && x == z) && this.Triangle()) {
			return true;
		}
		return false;
	}

	public boolean Isoceles() {
		if(((x == y) || (x == z)) && this.Triangle()) return true;
		return false;
	}

}
